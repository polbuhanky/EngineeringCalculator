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

public class CalculatorProductionSolidFragment extends Fragment {

    private EditText l6;
    private EditText l7;
    private EditText l8;
    private EditText l9;
    private EditText l10;
    private EditText l11;
    private EditText l12;
    private EditText l13;
    private EditText l16;
    private EditText l21;

    private TextView result1;
    private TextView result2;
    private TextView calculatorNameTV;

    private String calculatorName;

    MainActivity activity;
    private View rootView;

    public CalculatorProductionSolidFragment(String calculatorName){
        this.calculatorName = calculatorName;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = (MainActivity) activity;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.calculator_production_solid, null);

        init();
        initListeners();
        return rootView;
    }

    private void init(){
        l6 = rootView.findViewById(R.id.l6);
        l7 = rootView.findViewById(R.id.l7);
        l8 = rootView.findViewById(R.id.l8);
        l9 = rootView.findViewById(R.id.l9);
        l10 = rootView.findViewById(R.id.l10);
        l11 = rootView.findViewById(R.id.l11);
        l12 = rootView.findViewById(R.id.l12);
        l13 = rootView.findViewById(R.id.l13);
        l16 = rootView.findViewById(R.id.l16);
        l21 = rootView.findViewById(R.id.l21);

        result1 = rootView.findViewById(R.id.result1);
        result2 = rootView.findViewById(R.id.result2);
        calculatorNameTV = rootView.findViewById(R.id.calculatorNameTV);

        calculatorNameTV.setText(calculatorName.toUpperCase());

        ArrayList<String> nums = SaveInfo.GetData(getClass().getSimpleName());
        if (nums != null){
            l6.setText(nums.get(0));
            l7.setText(nums.get(1));
            l8.setText(nums.get(2));
            l9.setText(nums.get(3));
            l10.setText(nums.get(4));
            l11.setText(nums.get(5));
            l12.setText(nums.get(6));
            l13.setText(nums.get(7));
            l16.setText(nums.get(8));
            l21.setText(nums.get(9));

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
        l6.addTextChangedListener(textWatcher);
        l7.addTextChangedListener(textWatcher);
        l8.addTextChangedListener(textWatcher);
        l9.addTextChangedListener(textWatcher);
        l10.addTextChangedListener(textWatcher);
        l11.addTextChangedListener(textWatcher);
        l12.addTextChangedListener(textWatcher);
        l13.addTextChangedListener(textWatcher);
        l16.addTextChangedListener(textWatcher);
        l21.addTextChangedListener(textWatcher);

    }

    public void Calculate(){
        double l6Double = Double.parseDouble(l6.getText().toString());
        double l7Double = Double.parseDouble(l7.getText().toString());
        double l8Double = Double.parseDouble(l8.getText().toString());
        double l9Double = Double.parseDouble(l9.getText().toString());
        double l10Double = Double.parseDouble(l10.getText().toString());
        double l11Double = Double.parseDouble(l11.getText().toString());
        double l12Double = Double.parseDouble(l12.getText().toString());
        double l13Double = Double.parseDouble(l13.getText().toString());
        double l16Double = Double.parseDouble(l16.getText().toString());
        double l21Double = Double.parseDouble(l21.getText().toString());

        ArrayList<String> data = new ArrayList<>();

        data.add(String.valueOf(l6Double));
        data.add(String.valueOf(l7Double));
        data.add(String.valueOf(l8Double));
        data.add(String.valueOf(l9Double));
        data.add(String.valueOf(l10Double));
        data.add(String.valueOf(l11Double));
        data.add(String.valueOf(l12Double));
        data.add(String.valueOf(l13Double));
        data.add(String.valueOf(l16Double));
        data.add(String.valueOf(l21Double));

        SaveInfo.SaveString(getClass().getSimpleName(), data);

        double O3 = l11Double * 1000;
        double O6 = (l6Double * l6Double * 0.785) / 1000 * l13Double;
        double O7 = O6 * l11Double;
        double O9 = l7Double + l9Double;
        double O10 = (l7Double * l8Double + l9Double * l10Double) / (l7Double + l9Double);
        double O11 = O3 * (l16Double - O10)/(l11Double - l16Double) * O9;
        double O12 = O7 * (100 - l12Double) / 100;
        double O16 = (l16Double - 1) / (l11Double - 1) * 1000 * l11Double;
        double O18 = O11 / O12;
        double O23 = (l7Double * l8Double + l9Double * l10Double + O12 / 1000 * l21Double) / (l7Double + l9Double + O12 * l21Double / l11Double / 1000);

        result1.setText(String.valueOf(O18));
        result2.setText(String.valueOf(O23));
    }
}