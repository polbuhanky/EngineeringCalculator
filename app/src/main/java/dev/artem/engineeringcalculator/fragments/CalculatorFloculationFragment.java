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

public class CalculatorFloculationFragment extends Fragment {

    private EditText k7;
    private EditText k9;
    private EditText k10;
    private EditText k11;
    private EditText k12;
    private EditText k13;
    private EditText k14;

    private TextView result1;
    private TextView result2;
    private TextView result3;
    private TextView result4;
    private TextView result5;
    private TextView calculatorNameTV;

    private String calculatorName;

    MainActivity activity;
    private View rootView;

    public CalculatorFloculationFragment(String calculatorName){
        this.calculatorName = calculatorName;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = (MainActivity) activity;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.calculator_floculation, null);

        init();
        initListeners();
        return rootView;
    }

    private void init(){
        k7 = rootView.findViewById(R.id.k7);
        k9 = rootView.findViewById(R.id.k9);
        k10 = rootView.findViewById(R.id.k10);
        k11 = rootView.findViewById(R.id.k11);
        k12 = rootView.findViewById(R.id.k12);
        k13 = rootView.findViewById(R.id.k13);
        k14 = rootView.findViewById(R.id.k14);

        result1 = rootView.findViewById(R.id.result1);
        result2 = rootView.findViewById(R.id.result2);
        result3 = rootView.findViewById(R.id.result3);
        result4 = rootView.findViewById(R.id.result4);
        result5 = rootView.findViewById(R.id.result5);
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
                    double k7Double = Double.parseDouble(k7.getText().toString());
                    double k9Double = Double.parseDouble(k9.getText().toString());
                    double k10Double = Double.parseDouble(k10.getText().toString());
                    double k11Double = Double.parseDouble(k11.getText().toString());
                    double k12Double = Double.parseDouble(k12.getText().toString());
                    double k13Double = Double.parseDouble(k13.getText().toString());
                    double k14Double = Double.parseDouble(k14.getText().toString());

                    double N7 = (k7Double - 1) / (k12Double - 1) * 1000 * k12Double;
                    double N9 = k9Double * k9Double * 0.785 / 1000 * k14Double;
                    double N12 = N9 * k12Double;
                    double N15 = 50;
                    double N21 = N12 * k10Double;
                    double N22 = N21 * (100 - k13Double) / 100;
                    double N14 = N22 / N7 * 1000;
                    double N11 = (k11Double - 1) * N14;
                    double N13 = N22 + N11;
                    double N17 = N13 / N7;
                    double N10 = (N9 * k10Double) + (N21 - N22) / k12Double * N15 / 100 + (N22 / k12Double) * N15 / 100 + (2 * k10Double);
                    double N20 = N10 / 1000;
                    double N18 = N17 + N20;



                    result1.setText(String.valueOf(N17));
                    result2.setText(String.valueOf(N18));
                    result3.setText(String.valueOf(N20));
                    result4.setText(String.valueOf(N21));
                    result5.setText(String.valueOf(N22));
                } catch (Exception e){
                    Log.d("MAIN", "Error: " + e);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };
        k7.addTextChangedListener(textWatcher);
        k9.addTextChangedListener(textWatcher);
        k10.addTextChangedListener(textWatcher);
        k11.addTextChangedListener(textWatcher);
        k12.addTextChangedListener(textWatcher);
        k13.addTextChangedListener(textWatcher);
        k14.addTextChangedListener(textWatcher);

    }
}