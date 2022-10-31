package dev.artem.engineeringcalculator.fragments.calculators;

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

public class CalculatorPumpSupplyFragment extends Fragment {

    private EditText a44;
    private EditText b43;

    private TextView result1;
    private TextView calculatorNameTV;

    private String calculatorName;

    MainActivity activity;
    private View rootView;

    public CalculatorPumpSupplyFragment(String calculatorName){
        this.calculatorName = calculatorName;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = (MainActivity) activity;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.calculator_pump_supply, null);

        init();
        initListeners();
        return rootView;
    }

    private void init(){
        a44 = rootView.findViewById(R.id.a44);
        b43 = rootView.findViewById(R.id.b43);

        result1 = rootView.findViewById(R.id.result1);

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
                    double a44Double = Double.parseDouble(a44.getText().toString());
                    double b43Double = Double.parseDouble(b43.getText().toString());

                    result1.setText(String.valueOf(1000 / (b43Double * b43Double * 0.785 - a44Double * a44Double * 0.785) * 1000));

                } catch (Exception e){
                    Log.d("MAIN", "Error: " + e);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };
        a44.addTextChangedListener(textWatcher);
        b43.addTextChangedListener(textWatcher);
    }
}