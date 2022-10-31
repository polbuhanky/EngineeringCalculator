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

public class CalculatorDrillPipeFragment extends Fragment {

    private EditText i9;
    private EditText i10;
    private EditText i11;
    private EditText i12;
    private EditText i13;
    private EditText i14;
    private EditText i15;
    private EditText i16;

    private TextView result1;
    private TextView result2;
    private TextView result3;
    private TextView result4;
    private TextView calculatorNameTV;

    private String calculatorName;

    MainActivity activity;
    private View rootView;

    public CalculatorDrillPipeFragment(String calculatorName){
        this.calculatorName = calculatorName;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = (MainActivity) activity;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.calculator_drill_pipe, null);

        init();
        initListeners();
        return rootView;
    }

    private void init(){
        i9 = rootView.findViewById(R.id.I9);
        i10 = rootView.findViewById(R.id.I10);
        i11 = rootView.findViewById(R.id.I11);
        i12 = rootView.findViewById(R.id.I12);
        i13 = rootView.findViewById(R.id.I13);
        i14 = rootView.findViewById(R.id.I14);
        i15 = rootView.findViewById(R.id.I15);
        i16 = rootView.findViewById(R.id.I16);

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
                    double i9Double = Double.parseDouble(i9.getText().toString());
                    double i10Double = Double.parseDouble(i10.getText().toString());
                    double i11Double = Double.parseDouble(i11.getText().toString());
                    double i12Double = Double.parseDouble(i12.getText().toString());
                    double i13Double = Double.parseDouble(i13.getText().toString());
                    double i14Double = Double.parseDouble(i14.getText().toString());
                    double i15Double = Double.parseDouble(i15.getText().toString());
                    double i16Double = Double.parseDouble(i16.getText().toString());

                    double L9 = (i9Double * i9Double) / 1000000 * 0.785;
                    double L10 = (i10Double - i13Double ) * L9;
                    double L11 = (i11Double - i12Double * 2) / 1000;
                    double L14 = (i14Double * i14Double) / 1000000 * 0.785;
                    double L15 = (i14Double - i15Double * 2) / 1000;
                    double L13 = L15 * L15 * 0.785;
                    double L12 = (L14 - L13) * 1.067 * i16Double;

                    double L21 = L13 * i16Double;
                    double L22 = L11 * L11 * 0.785 * i13Double;
                    double L19 = L10 + L22;
                    double L20 = L19 - L12;

                    result1.setText(String.valueOf(L19));
                    result2.setText(String.valueOf(L20));
                    result3.setText(String.valueOf(L21));
                    result4.setText(String.valueOf(L22));
                } catch (Exception e){
                    Log.d("MAIN", "Error: " + e);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };
        i9.addTextChangedListener(textWatcher);
        i10.addTextChangedListener(textWatcher);
        i11.addTextChangedListener(textWatcher);
        i12.addTextChangedListener(textWatcher);
        i13.addTextChangedListener(textWatcher);
        i14.addTextChangedListener(textWatcher);
        i15.addTextChangedListener(textWatcher);
        i16.addTextChangedListener(textWatcher);

    }
}