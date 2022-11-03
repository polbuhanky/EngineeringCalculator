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

public class CalculatorVolumeDensityFragment extends Fragment {

    private EditText a8;

    private TextView result1;
    private TextView result2;
    private TextView result3;
    private TextView calculatorNameTV;

    private String calculatorName;

    MainActivity activity;
    private View rootView;

    public CalculatorVolumeDensityFragment(String calculatorName){
        this.calculatorName = calculatorName;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = (MainActivity) activity;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.calculator_volume_density, null);

        init();
        initListeners();
        return rootView;
    }

    private void init(){
        a8 = rootView.findViewById(R.id.a8);

        result1 = rootView.findViewById(R.id.result1);
        result2 = rootView.findViewById(R.id.result2);
        result3 = rootView.findViewById(R.id.result3);

        calculatorNameTV = rootView.findViewById(R.id.calculatorNameTV);

        calculatorNameTV.setText(calculatorName.toUpperCase());

        ArrayList<String> nums = SaveInfo.GetData(getClass().getSimpleName());
        if (nums != null){
            a8.setText(nums.get(0));

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
        a8.addTextChangedListener(textWatcher);

    }

    public void Calculate(){
        double a8Double = Double.parseDouble(a8.getText().toString());

        ArrayList<String> data = new ArrayList<>();

        data.add(String.valueOf(a8Double));

        SaveInfo.SaveString(getClass().getSimpleName(), data);

        result1.setText(String.valueOf((a8Double - 1) / (2.6 - 1) * 100));
        result2.setText(String.valueOf((a8Double - 0.99238) / (2.6 - 0.99238) * 100));
        result3.setText(String.valueOf((a8Double - 0.98545) / (2.6 - 0.98545) * 100));
    }
}