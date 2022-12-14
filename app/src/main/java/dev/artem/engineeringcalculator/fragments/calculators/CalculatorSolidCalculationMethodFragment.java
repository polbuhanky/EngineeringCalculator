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

import java.util.ArrayList;

import dev.artem.engineeringcalculator.Constants.SaveInfo;
import dev.artem.engineeringcalculator.MainActivity;
import dev.artem.engineeringcalculator.R;

public class CalculatorSolidCalculationMethodFragment extends Fragment {

    private EditText k6;
    private EditText k7;
    private EditText k8;
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
    private TextView result6;
    private TextView result7;
    private TextView result8;
    private TextView result9;
    private TextView result10;
    private TextView calculatorNameTV;

    private String calculatorName;

    MainActivity activity;
    private View rootView;

    public CalculatorSolidCalculationMethodFragment(String calculatorName){
        this.calculatorName = calculatorName;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = (MainActivity) activity;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.calculator_solid_calculation_method, null);

        init();
        initListeners();
        return rootView;
    }

    private void init(){
        k6 = rootView.findViewById(R.id.k6);
        k7 = rootView.findViewById(R.id.k7);
        k8 = rootView.findViewById(R.id.k8);
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
        result6 = rootView.findViewById(R.id.result6);
        result7 = rootView.findViewById(R.id.result7);
        result8 = rootView.findViewById(R.id.result8);
        result9 = rootView.findViewById(R.id.result9);
        result10 = rootView.findViewById(R.id.result10);

        calculatorNameTV = rootView.findViewById(R.id.calculatorNameTV);

        calculatorNameTV.setText(calculatorName.toUpperCase());

        ArrayList<String> nums = SaveInfo.GetData(getClass().getSimpleName());
        if (nums != null){
            k6.setText(nums.get(0));
            k7.setText(nums.get(1));
            k8.setText(nums.get(2));
            k9.setText(nums.get(3));
            k10.setText(nums.get(4));
            k11.setText(nums.get(5));
            k12.setText(nums.get(6));
            k13.setText(nums.get(7));
            k14.setText(nums.get(8));

            Calculate();
        }
    }

    private void initListeners(){
        TextWatcher textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                try{
                    Calculate();
                } catch (Exception e){
                    Log.d("MAIN", "Error: " + e);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };
        k6.addTextChangedListener(textWatcher);
        k7.addTextChangedListener(textWatcher);
        k8.addTextChangedListener(textWatcher);
        k9.addTextChangedListener(textWatcher);
        k10.addTextChangedListener(textWatcher);
        k11.addTextChangedListener(textWatcher);
        k12.addTextChangedListener(textWatcher);
        k13.addTextChangedListener(textWatcher);
        k14.addTextChangedListener(textWatcher);

    }

    public void Calculate(){
        double k6Double = Double.parseDouble(k6.getText().toString());
        double k7Double = Double.parseDouble(k7.getText().toString());
        double k8Double = Double.parseDouble(k8.getText().toString());
        double k9Double = Double.parseDouble(k9.getText().toString());
        double k10Double = Double.parseDouble(k10.getText().toString());
        double k11Double = Double.parseDouble(k11.getText().toString());
        double k12Double = Double.parseDouble(k12.getText().toString());
        double k13Double = Double.parseDouble(k13.getText().toString());
        double k14Double = Double.parseDouble(k14.getText().toString());

        ArrayList<String> data = new ArrayList<>();

        data.add(String.valueOf(k6Double));
        data.add(String.valueOf(k7Double));
        data.add(String.valueOf(k8Double));
        data.add(String.valueOf(k9Double));
        data.add(String.valueOf(k10Double));
        data.add(String.valueOf(k11Double));
        data.add(String.valueOf(k12Double));
        data.add(String.valueOf(k13Double));
        data.add(String.valueOf(k14Double));

        SaveInfo.SaveString(getClass().getSimpleName(), data);

        double N11 = k11Double * 1000 / k6Double / 10;
        double N6 = N11 * 10 * k12Double;
        double N24 = 1 + 1.166 * Math.pow(10, -6) * k13Double - 8.375 * Math.pow(10, -13) * (k13Double * k13Double) + 1.388 * Math.pow(10, -18) * (k13Double * k13Double * k13Double);
        double N9 = k9Double * 1000 / k6Double;
        double N18 = N9 / k10Double / 10;
        double N27 = (N24 * 1000 + N6) / (1000 + N11 * 10);
        double N10 = (N27 * 1000 + N9) / (1000 + N18 * 10);
        double N8 = k7Double - (N10 - 1);
        double N17 = (N8 - N27) / (k8Double - N27) * 100;
        double N19 = N17 + N18;
        double N22 = 100 - N19 - N11;
        double N13 = (k13Double * k14Double) / (N24 * 10000);
        double N14 = N24 * (100 - N13);
        double N15 = 100 / N14 - 1;
        double N23 = N22 * N15;
        double N21 = N22 - N23;
        double N16 = (k13Double * k14Double) / 10000;
        double N25 = (N22 + N23) * N16 / 10;
        double N26 = N17 * 10 * k8Double;

        result1.setText(String.valueOf(N17));
        result2.setText(String.valueOf(N18));
        result3.setText(String.valueOf(N19));
        result4.setText(String.valueOf(N21));
        result5.setText(String.valueOf(N11));
        result6.setText(String.valueOf(N23));
        result7.setText(String.valueOf(N24));
        result8.setText(String.valueOf(N25));
        result9.setText(String.valueOf(N26));
        result10.setText(String.valueOf(N9));
    }
}