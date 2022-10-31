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

public class CalculatorFallSolidControlFragment extends Fragment {

    private EditText l5;
    private EditText l7;
    private EditText l8;
    private EditText l9;
    private EditText l10;
    private EditText l11;
    private EditText l14;
    private EditText l17;

    private TextView result1;
    private TextView result2;
    private TextView result3;
    private TextView result4;
    private TextView result5;
    private TextView result6;
    private TextView result7;
    private TextView result8;
    private TextView calculatorNameTV;

    private String calculatorName;

    MainActivity activity;
    private View rootView;

    public CalculatorFallSolidControlFragment(String calculatorName){
        this.calculatorName = calculatorName;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = (MainActivity) activity;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.calculator_fall_solid_control, null);

        init();
        initListeners();
        return rootView;
    }

    private void init(){
        l5 = rootView.findViewById(R.id.l5);
        l7 = rootView.findViewById(R.id.l7);
        l8 = rootView.findViewById(R.id.l8);
        l9 = rootView.findViewById(R.id.l9);
        l10 = rootView.findViewById(R.id.l10);
        l11 = rootView.findViewById(R.id.l11);
        l14 = rootView.findViewById(R.id.l14);
        l17 = rootView.findViewById(R.id.l17);

        result1 = rootView.findViewById(R.id.result1);
        result2 = rootView.findViewById(R.id.result2);
        result3 = rootView.findViewById(R.id.result3);
        result4 = rootView.findViewById(R.id.result4);
        result5 = rootView.findViewById(R.id.result5);
        result6 = rootView.findViewById(R.id.result6);
        result7 = rootView.findViewById(R.id.result7);
        result8 = rootView.findViewById(R.id.result8);
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
                    double l5Double = Double.parseDouble(l5.getText().toString());
                    double l7Double = Double.parseDouble(l7.getText().toString());
                    double l8Double = Double.parseDouble(l8.getText().toString());
                    double l9Double = Double.parseDouble(l9.getText().toString());
                    double l10Double = Double.parseDouble(l10.getText().toString());
                    double l11Double = Double.parseDouble(l11.getText().toString());
                    double l14Double = Double.parseDouble(l14.getText().toString());
                    double l17Double = Double.parseDouble(l17.getText().toString());

                    double O20 = (l8Double - 1) * 100 / l11Double + 1;
                    double O5 = (l5Double - 1) / (O20 - 1) * 1000 * O20;
                    double O8 = (l8Double - 1) / (O20 - 1) * 1000 * O20;
                    double O7 = O8 - O5;
                    double O9 = (l8Double - l9Double) / (O20 - 1) * 100;
                    double O10 = O9 * 10 * O20;
                    double O19 = O10 * l17Double;
                    double O21 = 100 - l10Double * 100 / O20;
                    double O22 = O8 * l7Double;
                    double O23 = O7 * l7Double;
                    double O13 = O23 / O20 * 0.001;
                    double O17 = O23 / O10;
                    double O15 = O17 / l14Double;
                    double O18 = O23 / O19;
                    double O24 = O13 * O21 / 100;
                    double O12 = O13 + O24;

                    result1.setText(String.valueOf(O15));
                    result2.setText(String.valueOf(O18));
                    result3.setText(String.valueOf(O20));
                    result4.setText(String.valueOf(O21));
                    result5.setText(String.valueOf(O22));
                    result6.setText(String.valueOf(O23));
                    result7.setText(String.valueOf(O24));
                    result8.setText(String.valueOf(O12));
                } catch (Exception e){
                    Log.d("MAIN", "Error: " + e);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };
        l5.addTextChangedListener(textWatcher);
        l7.addTextChangedListener(textWatcher);
        l8.addTextChangedListener(textWatcher);
        l9.addTextChangedListener(textWatcher);
        l10.addTextChangedListener(textWatcher);
        l11.addTextChangedListener(textWatcher);
        l14.addTextChangedListener(textWatcher);
        l17.addTextChangedListener(textWatcher);

    }
}