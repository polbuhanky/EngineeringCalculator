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
import androidx.recyclerview.widget.RecyclerView;

import dev.artem.engineeringcalculator.MainActivity;
import dev.artem.engineeringcalculator.R;

public class CalculatorMortarFragment extends Fragment {

    private EditText parametr1;
    private EditText parametr2;
    private EditText parametr3;
    private EditText parametr4;

    private TextView result1;
    private TextView result2;

    MainActivity activity;
    private View rootView;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = (MainActivity) activity;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.calculator_mortar, null);

        init();
        initListeners();
        return rootView;
    }

    private void init(){
        parametr1 = rootView.findViewById(R.id.parametr1);
        parametr2 = rootView.findViewById(R.id.parametr2);
        parametr3 = rootView.findViewById(R.id.parametr3);
        parametr4 = rootView.findViewById(R.id.parametr4);

        result1 = rootView.findViewById(R.id.result1);
        result2 = rootView.findViewById(R.id.result2);
    }

    private void initListeners(){
        TextWatcher textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                try{
                    double parametr1Double = Double.parseDouble(parametr1.getText().toString());
                    double parametr2Double = Double.parseDouble(parametr2.getText().toString());
                    double parametr3Double = Double.parseDouble(parametr3.getText().toString());
                    double parametr4Double = Double.parseDouble(parametr4.getText().toString());

                    double L18 = parametr4Double*1000;
                    double L19 = L18 * (parametr1Double - parametr3Double) / (parametr4Double - parametr1Double) * parametr2Double;
                    double L20 = parametr2Double + (L19 / L18);

                    result1.setText(String.valueOf(L19));
                    result2.setText(String.valueOf(L20));
                } catch (Exception e){
                    Log.d("MAIN", "Error: " + e);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };
        parametr1.addTextChangedListener(textWatcher);
        parametr2.addTextChangedListener(textWatcher);
        parametr3.addTextChangedListener(textWatcher);
        parametr4.addTextChangedListener(textWatcher);

    }
}