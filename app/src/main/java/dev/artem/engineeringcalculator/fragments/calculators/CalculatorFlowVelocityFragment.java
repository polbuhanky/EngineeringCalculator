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

public class CalculatorFlowVelocityFragment extends Fragment {

    private EditText i12;
    private EditText i13;
    private EditText i14;
    private EditText i15;

    private TextView result1;
    private TextView result2;
    private TextView calculatorNameTV;

    private String calculatorName;

    MainActivity activity;
    private View rootView;

    public CalculatorFlowVelocityFragment(String calculatorName){
        this.calculatorName = calculatorName;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = (MainActivity) activity;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.calculator_flow_velocity, null);

        init();
        initListeners();
        return rootView;
    }

    private void init(){
        i12 = rootView.findViewById(R.id.I12);
        i13 = rootView.findViewById(R.id.I13);
        i14 = rootView.findViewById(R.id.I14);
        i15 = rootView.findViewById(R.id.I15);

        result1 = rootView.findViewById(R.id.result1);
        result2 = rootView.findViewById(R.id.result2);
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
                    double i12Double = Double.parseDouble(i12.getText().toString());
                    double i13Double = Double.parseDouble(i13.getText().toString());
                    double i14Double = Double.parseDouble(i14.getText().toString());
                    double i15Double = Double.parseDouble(i15.getText().toString());

                    double L12 = (i12Double * i12Double / 1000000) * 0.785;
                    double L13 = (i13Double * i13Double / 1000000) * 0.785;
                    double L14 = (i14Double * i14Double / 1000000) * 0.785;

                    double L18 = i15Double / (L12 - L14);
                    double L19 = i15Double / (L12 - L13);

                    result1.setText(String.valueOf(L18));
                    result2.setText(String.valueOf(L19));

                } catch (Exception e){
                    Log.d("MAIN", "Error: " + e);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };
        i12.addTextChangedListener(textWatcher);
        i13.addTextChangedListener(textWatcher);
        i14.addTextChangedListener(textWatcher);
        i15.addTextChangedListener(textWatcher);

    }
}