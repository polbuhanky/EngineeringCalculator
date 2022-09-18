package dev.artem.engineeringcalculator.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import dev.artem.engineeringcalculator.MainActivity;
import dev.artem.engineeringcalculator.R;

public class CalculatorRheologyLiquidsFragment extends Fragment {

    private EditText c9;
    private EditText e9;

    private TextView result1;
    private TextView result2;
    private TextView result3;
    private TextView calculatorNameTV;

    private String calculatorName;

    MainActivity activity;
    private View rootView;

    public CalculatorRheologyLiquidsFragment(String calculatorName){
        this.calculatorName = calculatorName;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = (MainActivity) activity;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.calculator_rheology_liquids, null);

        init();
        initListeners();
        return rootView;
    }

    private void init(){
        c9 = rootView.findViewById(R.id.c9);
        e9 = rootView.findViewById(R.id.e9);

        result1 = rootView.findViewById(R.id.result1);
        result2 = rootView.findViewById(R.id.result2);
        result3 = rootView.findViewById(R.id.result3);

        calculatorNameTV = rootView.findViewById(R.id.calculatorNameTV);

        calculatorNameTV.setText(calculatorName.toUpperCase());
    }

    private void initListeners(){
        TextWatcher textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                try{
                    double c9Double = Double.parseDouble(c9.getText().toString());
                    double e9Double = Double.parseDouble(e9.getText().toString());

                    double G9 = c9Double * 1.703;
                    double I9 = e9Double * 1.067;

                    result1.setText(String.valueOf(G9));
                    result2.setText(String.valueOf(I9));
                    result3.setText(String.valueOf(I9 / G9 * 478.8));

                } catch (Exception e){
                    Log.d("MAIN", "Error: " + e);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };
        c9.addTextChangedListener(textWatcher);
        e9.addTextChangedListener(textWatcher);

    }
}