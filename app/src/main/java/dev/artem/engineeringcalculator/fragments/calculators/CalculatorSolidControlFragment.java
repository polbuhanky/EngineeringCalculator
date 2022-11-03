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

public class CalculatorSolidControlFragment extends Fragment {

    private EditText k7;
    private EditText k9;
    private EditText k10;
    private EditText k11;
    private EditText k12;
    private EditText k13;
    private EditText k14;
    private EditText k15;

    private TextView result1;
    private TextView result2;
    private TextView result3;
    private TextView result4;
    private TextView result5;
    private TextView calculatorNameTV;

    private String calculatorName;

    MainActivity activity;
    private View rootView;

    public CalculatorSolidControlFragment(String calculatorName){
        this.calculatorName = calculatorName;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = (MainActivity) activity;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.calculator_solid_control, null);

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
        k15 = rootView.findViewById(R.id.k15);

        result1 = rootView.findViewById(R.id.result1);
        result2 = rootView.findViewById(R.id.result2);
        result3 = rootView.findViewById(R.id.result3);
        result4 = rootView.findViewById(R.id.result4);
        result5 = rootView.findViewById(R.id.result5);
        calculatorNameTV = rootView.findViewById(R.id.calculatorNameTV);

        calculatorNameTV.setText(calculatorName.toUpperCase());

        ArrayList<String> nums = SaveInfo.GetData(getClass().getSimpleName());
        if (nums != null){
            k7.setText(nums.get(0));
            k9.setText(nums.get(1));
            k10.setText(nums.get(2));
            k11.setText(nums.get(3));
            k12.setText(nums.get(4));
            k13.setText(nums.get(5));
            k14.setText(nums.get(6));
            k15.setText(nums.get(7));

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
        k9.addTextChangedListener(textWatcher);
        k10.addTextChangedListener(textWatcher);
        k11.addTextChangedListener(textWatcher);
        k12.addTextChangedListener(textWatcher);
        k13.addTextChangedListener(textWatcher);
        k14.addTextChangedListener(textWatcher);
        k15.addTextChangedListener(textWatcher);

    }

    public void Calculate(){
        double k7Double = Double.parseDouble(k7.getText().toString());
        double k9Double = Double.parseDouble(k9.getText().toString());
        double k10Double = Double.parseDouble(k10.getText().toString());
        double k11Double = Double.parseDouble(k11.getText().toString());
        double k12Double = Double.parseDouble(k12.getText().toString());
        double k13Double = Double.parseDouble(k13.getText().toString());
        double k14Double = Double.parseDouble(k14.getText().toString());
        double k15Double = Double.parseDouble(k15.getText().toString());

        ArrayList<String> data = new ArrayList<>();

        data.add(String.valueOf(k7Double));
        data.add(String.valueOf(k9Double));
        data.add(String.valueOf(k10Double));
        data.add(String.valueOf(k11Double));
        data.add(String.valueOf(k12Double));
        data.add(String.valueOf(k13Double));
        data.add(String.valueOf(k14Double));
        data.add(String.valueOf(k15Double));

        SaveInfo.SaveString(getClass().getSimpleName(), data);

        double N7 = (k7Double - 1) / (k13Double - 1) * 1000 * k13Double;
        double N9 = k9Double * k9Double * 0.785 / 1000 * k15Double;
        double N12 = (k11Double - k12Double) / (k13Double - 1) * 100;
        double N13 = N9 * k13Double;
        double N16 = 50;
        double N21 = N13 * k10Double;
        double N22 = N13 * (100 - k14Double) / 100 * k10Double;
        double N23 = N12 * 10 * k13Double;
        double N10 = (N9 * k10Double) + (N21 - N22) / k13Double * N16 / 100 + N23 / k13Double * N16 / 100 + (2 * k10Double);
        double N20 = N10 / 1000;
        double N18 = N22 / N23;

        result1.setText(String.valueOf(N18));
        result2.setText(String.valueOf(N20));
        result3.setText(String.valueOf(N21));
        result4.setText(String.valueOf(N22));
        result5.setText(String.valueOf(N23));
    }
}