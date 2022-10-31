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

public class CalculatorDrilingFluidsFragment extends Fragment {

    private EditText e8;
    private EditText e9;
    private EditText e10;
    private EditText e11;
    private EditText e12;
    private EditText e13;
    private EditText g11;
    private EditText g12;
    private EditText g13;

    private TextView result1;
    private TextView result2;
    private TextView result3;
    private TextView result4;
    private TextView result5;
    private TextView result6;
    private TextView result7;
    private TextView result8;
    private TextView result9;
    private TextView result10;
    private TextView result11;
    private TextView result12;
    private TextView result13;
    private TextView result14;
    private TextView result15;

    private TextView calculatorNameTV;

    private String calculatorName;

    MainActivity activity;
    private View rootView;

    public CalculatorDrilingFluidsFragment(String calculatorName){
        this.calculatorName = calculatorName;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = (MainActivity) activity;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.calculator_driling_fluids, null);

        init();
        initListeners();
        return rootView;
    }

    private void init(){
        e8 = rootView.findViewById(R.id.e8);
        e9 = rootView.findViewById(R.id.e9);
        e10 = rootView.findViewById(R.id.e10);
        e11 = rootView.findViewById(R.id.e11);
        e12 = rootView.findViewById(R.id.e12);
        e13 = rootView.findViewById(R.id.e13);
        g11 = rootView.findViewById(R.id.g11);
        g12 = rootView.findViewById(R.id.g12);
        g13 = rootView.findViewById(R.id.g13);

        result1 = rootView.findViewById(R.id.result1);
        result2 = rootView.findViewById(R.id.result2);
        result3 = rootView.findViewById(R.id.result3);
        result4 = rootView.findViewById(R.id.result4);
        result5 = rootView.findViewById(R.id.result5);
        result6 = rootView.findViewById(R.id.result6);
        result7 = rootView.findViewById(R.id.result7);
        result8 = rootView.findViewById(R.id.result8);
        result9 = rootView.findViewById(R.id.result9);
        result10 = rootView.findViewById(R.id.result10);
        result11 = rootView.findViewById(R.id.result11);
        result12 = rootView.findViewById(R.id.result12);
        result13 = rootView.findViewById(R.id.result13);
        result14 = rootView.findViewById(R.id.result14);
        result15 = rootView.findViewById(R.id.result15);

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
                    double e8Double = Double.parseDouble(e8.getText().toString());
                    double e9Double = Double.parseDouble(e9.getText().toString());
                    double e10Double = Double.parseDouble(e10.getText().toString());
                    double e11Double = Double.parseDouble(e11.getText().toString());
                    double e12Double = Double.parseDouble(e12.getText().toString());
                    double e13Double = Double.parseDouble(e13.getText().toString());
                    double g11Double = Double.parseDouble(g11.getText().toString());
                    double g12Double = Double.parseDouble(g12.getText().toString());
                    double g13Double = Double.parseDouble(g13.getText().toString());

                    double O16 = 2;
                    double M15 = e8Double / e9Double;
                    double N16 = Math.log10(O16);
                    double N15 = Math.log10(M15);
                    double M16 = N15 / N16;
                    double N18 = e9Double * 1.067;
                    double N19 = Math.pow(511, M16);
                    double M18 = N18 / N19;
                    double N20 = Math.pow(511, 1 - M16);
                    double M20 = e9Double * N20;
                    double M19 = M20 / 100;
                    double M11 = e11Double / 25.4;
                    double M10 = e10Double * 264.2;
                    double M12 = e12Double / 25.4;
                    double N10 = 24.51 * M10 / (M11 * M11 - M12 * M12);
                    double N23 = 0.8 * (2 + 1 / M16) * N10 / (M11 - M12);
                    double M13 = e13Double / 25.4;
                    double N11 = 24.51 * M10 / (M13 * M13);
                    double O23 = 0.4 * (3 + 1 / M16) * N11 / M13;
                    double M6 = g11Double / 25.4;
                    double M7 = g12Double / 25.4;
                    double M8 = g13Double / 25.4;
                    double N9 = M6 * M6 * 0.785 + M7 * M7 * 0.785 + M8 * M8 * 0.785;
                    double N12 = (0.32086 * M10) / N9;
                    double N13 = N12 * 60;
                    double P23 = 0.4 * (3 + 1 / M16) * N13 / (M6 + M7 + M8);
                    double N24 = M19 * Math.pow(N23, M16);
                    double O24 = M19 * Math.pow(O23, M16);
                    double P24 = M19 * Math.pow(P23, M16);
                    double N25 = N24 * 100 / N23;
                    double O25 = O24 * 100 / O23;
                    double P25 = (P24 * 100) / P23;

                    result1.setText(String.valueOf(M16));
                    result2.setText(String.valueOf(M18));
                    result3.setText(String.valueOf(M19));
                    result4.setText(String.valueOf(M20));
                    result5.setText(String.valueOf(e8Double - e9Double));
                    result6.setText(String.valueOf(e9Double - (e8Double - e9Double)));
                    result7.setText(String.valueOf(N23));
                    result8.setText(String.valueOf(O23));
                    result9.setText(String.valueOf(P23));
                    result10.setText(String.valueOf(N24));
                    result11.setText(String.valueOf(O24));
                    result12.setText(String.valueOf(P24));
                    result13.setText(String.valueOf(N25));
                    result14.setText(String.valueOf(O25));
                    result15.setText(String.valueOf(P25));

                } catch (Exception e){
                    Log.d("MAIN", "Error: " + e);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };
        e8.addTextChangedListener(textWatcher);
        e9.addTextChangedListener(textWatcher);
        e10.addTextChangedListener(textWatcher);
        e11.addTextChangedListener(textWatcher);
        e12.addTextChangedListener(textWatcher);
        e13.addTextChangedListener(textWatcher);
        g11.addTextChangedListener(textWatcher);
        g12.addTextChangedListener(textWatcher);
        g13.addTextChangedListener(textWatcher);


    }
}