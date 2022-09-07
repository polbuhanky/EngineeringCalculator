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

public class CalculatorObsColonnaFragment extends Fragment {

    private EditText h8;
    private EditText h9;
    private EditText h10;
    private EditText h11;
    private EditText h12;
    private EditText h13;
    private EditText h14;
    private EditText h15;

    private TextView result1;
    private TextView result2;
    private TextView result3;
    private TextView result4;
    private TextView calculatorNameTV;

    private String calculatorName;

    MainActivity activity;
    private View rootView;

    public CalculatorObsColonnaFragment(String calculatorName){
        this.calculatorName = calculatorName;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = (MainActivity) activity;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.calculator_obs_colonna, null);

        init();
        initListeners();
        return rootView;
    }

    private void init(){
        h8 = rootView.findViewById(R.id.h8);
        h9 = rootView.findViewById(R.id.h9);
        h10 = rootView.findViewById(R.id.h10);
        h11 = rootView.findViewById(R.id.h11);
        h12 = rootView.findViewById(R.id.h12);
        h13 = rootView.findViewById(R.id.h13);
        h14 = rootView.findViewById(R.id.h14);
        h15 = rootView.findViewById(R.id.h15);

        result1 = rootView.findViewById(R.id.result1);
        result2 = rootView.findViewById(R.id.result2);
        result3 = rootView.findViewById(R.id.result3);
        result4 = rootView.findViewById(R.id.result4);

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
                    double h8Double = Double.parseDouble(h8.getText().toString());
                    double h9Double = Double.parseDouble(h9.getText().toString());
                    double h10Double = Double.parseDouble(h10.getText().toString());
                    double h11Double = Double.parseDouble(h11.getText().toString());
                    double h12Double = Double.parseDouble(h12.getText().toString());
                    double h13Double = Double.parseDouble(h13.getText().toString());
                    double h14Double = Double.parseDouble(h14.getText().toString());
                    double h15Double = Double.parseDouble(h15.getText().toString());

                    double K10 = (h10Double - h11Double * 2) / 1000;
                    double K8 = (h8Double * h8Double) / 1000000 * 0.785;
                    double K21 = K10 * K10 * 0.785 * h12Double;
                    double K9 = (h9Double - h12Double) * K8;
                    double K18 = K9+K21;
                    double K13 = (h13Double * h13Double) / 1000000 * 0.785;
                    double K14 = (h13Double - h14Double * 2) / 1000;
                    double K12 = K14 * K14 * 0.785;
                    double K11 = (K13 - K12) * 1.067 * h15Double;
                    double K19 = K18 - K11;
                    double K20 = K12 * h15Double;

                    result1.setText(String.valueOf(K18));
                    result2.setText(String.valueOf(K19));
                    result3.setText(String.valueOf(K20));
                    result4.setText(String.valueOf(K21));

                } catch (Exception e){
                    Log.d("MAIN", "Error: " + e);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };
        h8.addTextChangedListener(textWatcher);
        h9.addTextChangedListener(textWatcher);
        h10.addTextChangedListener(textWatcher);
        h11.addTextChangedListener(textWatcher);
        h12.addTextChangedListener(textWatcher);
        h13.addTextChangedListener(textWatcher);
        h14.addTextChangedListener(textWatcher);
        h15.addTextChangedListener(textWatcher);

    }
}