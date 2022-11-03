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

public class CalculatorSolidPhaseFragment extends Fragment {

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
    private TextView calculatorNameTV;

    private String calculatorName;

    MainActivity activity;
    private View rootView;

    public CalculatorSolidPhaseFragment(String calculatorName){
        this.calculatorName = calculatorName;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = (MainActivity) activity;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.calculator_solid_phase, null);

        init();
        initListeners();
        return rootView;
    }

    private void init(){
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
        calculatorNameTV = rootView.findViewById(R.id.calculatorNameTV);

        calculatorNameTV.setText(calculatorName.toUpperCase());

        ArrayList<String> nums = SaveInfo.GetData(getClass().getSimpleName());
        if (nums != null){
            k7.setText(nums.get(0));
            k8.setText(nums.get(1));
            k9.setText(nums.get(2));
            k10.setText(nums.get(3));
            k11.setText(nums.get(4));
            k12.setText(nums.get(5));
            k13.setText(nums.get(6));
            k14.setText(nums.get(7));

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
        double k7Double = Double.parseDouble(k7.getText().toString());
        double k8Double = Double.parseDouble(k8.getText().toString());
        double k9Double = Double.parseDouble(k9.getText().toString());
        double k10Double = Double.parseDouble(k10.getText().toString());
        double k11Double = Double.parseDouble(k11.getText().toString());
        double k12Double = Double.parseDouble(k12.getText().toString());
        double k13Double = Double.parseDouble(k13.getText().toString());
        double k14Double = Double.parseDouble(k14.getText().toString());

        ArrayList<String> data = new ArrayList<>();

        data.add(String.valueOf(k7Double));
        data.add(String.valueOf(k8Double));
        data.add(String.valueOf(k9Double));
        data.add(String.valueOf(k10Double));
        data.add(String.valueOf(k11Double));
        data.add(String.valueOf(k12Double));
        data.add(String.valueOf(k13Double));
        data.add(String.valueOf(k14Double));

        SaveInfo.SaveString(getClass().getSimpleName(), data);

        double N14 = (k13Double * k14Double) / 10000;
        double N21 = 1 + 1.166 * Math.pow(10, -6) * k13Double - 8.375 * Math.pow(10, -13) * (k13Double * k13Double) + 1.388 * Math.pow(10, -18) * (k13Double * k13Double * k13Double);
        double N15 = (k13Double * k14Double) / (N21 * 10000);
        double N13 = N21 * (100 - N15);
        double N12 = 100 / N13 - 1;
        double N22 = k8Double * N12;
        double N8 = k8Double + N22;
        double N16 = k7Double * 100 - k10Double * (100 - k8Double - N22 - k9Double) - N21 * (k8Double + N22) - k12Double * k9Double;
        double N18 = N16 / (k11Double - k10Double);
        double N17 = 100 - N18 - k8Double - N22 - k9Double;
        double N19 = N17 + N18;
        double N23 = N14 * N8 / 10;
        double N24 = N17 * 10 * k10Double;
        double N25 = N18 * 10 * k11Double;
        double N26 = N24 + N25;

        result1.setText(String.valueOf(N17));
        result2.setText(String.valueOf(N18));
        result3.setText(String.valueOf(N19));
        result4.setText(String.valueOf(N21));
        result5.setText(String.valueOf(N22));
        result6.setText(String.valueOf(N23));
        result7.setText(String.valueOf(N24));
        result8.setText(String.valueOf(N25));
        result9.setText(String.valueOf(N26));
    }
}