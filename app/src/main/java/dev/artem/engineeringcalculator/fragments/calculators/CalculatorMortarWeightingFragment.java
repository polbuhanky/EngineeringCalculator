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

public class CalculatorMortarWeightingFragment extends Fragment {

    private EditText h30;
    private EditText h33;
    private EditText h34;
    private EditText h35;

    private TextView result1;
    private TextView result2;
    private TextView calculatorNameTV;

    private String calculatorName;

    MainActivity activity;
    private View rootView;

    public CalculatorMortarWeightingFragment(String calculatorName){
        this.calculatorName = calculatorName;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = (MainActivity) activity;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.calculator_mortar_weighting, null);

        init();
        initListeners();
        return rootView;
    }

    private void init(){
        h30 = rootView.findViewById(R.id.h30);
        h33 = rootView.findViewById(R.id.h33);
        h34 = rootView.findViewById(R.id.h34);
        h35 = rootView.findViewById(R.id.h35);

        result1 = rootView.findViewById(R.id.result1);
        result2 = rootView.findViewById(R.id.result2);

        calculatorNameTV = rootView.findViewById(R.id.calculatorNameTV);

        calculatorNameTV.setText(calculatorName.toUpperCase());

        ArrayList<String> nums = SaveInfo.GetData(getClass().getSimpleName());
        if (nums != null){
            h30.setText(nums.get(0));
            h33.setText(nums.get(1));
            h34.setText(nums.get(2));
            h35.setText(nums.get(3));

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
        h30.addTextChangedListener(textWatcher);
        h33.addTextChangedListener(textWatcher);
        h34.addTextChangedListener(textWatcher);
        h35.addTextChangedListener(textWatcher);

    }

    public void Calculate(){
        double h30Double = Double.parseDouble(h30.getText().toString());
        double h33Double = Double.parseDouble(h33.getText().toString());
        double h34Double = Double.parseDouble(h34.getText().toString());
        double h35Double = Double.parseDouble(h35.getText().toString());

        ArrayList<String> data = new ArrayList<>();

        data.add(String.valueOf(h30Double));
        data.add(String.valueOf(h33Double));
        data.add(String.valueOf(h34Double));
        data.add(String.valueOf(h35Double));

        SaveInfo.SaveString(getClass().getSimpleName(), data);

        double K37 = h35Double * 1000;
        double K38 = K37 * (h30Double - h34Double) / (h35Double - h30Double) * h33Double;
        double K39 = h33Double + (K38 / K37);

        result1.setText(String.valueOf(K38));
        result2.setText(String.valueOf(K39));
    }
}