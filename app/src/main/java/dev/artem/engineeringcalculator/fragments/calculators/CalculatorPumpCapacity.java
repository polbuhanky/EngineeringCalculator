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
import androidx.recyclerview.widget.RecyclerView;

import dev.artem.engineeringcalculator.MainActivity;
import dev.artem.engineeringcalculator.R;

public class CalculatorPumpCapacity extends Fragment {

    private EditText parametr1;
    private EditText parametr2;
    private EditText parametr3;
    private EditText parametr4;
    private EditText parametr5;
    private EditText parametr6;
    private EditText parametr7;
    private EditText parametr8;

    private TextView result1;
    private TextView result2;
    private TextView result3;
    private TextView result4;
    private TextView calculatorNameTV;

    private String calculatorName;

    MainActivity activity;
    private View rootView;

    public CalculatorPumpCapacity(String calculatorName){
        this.calculatorName = calculatorName;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = (MainActivity) activity;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.calculator_pump_capacity, null);

        init();
        initListeners();
        return rootView;
    }

    private void init(){
        parametr1 = rootView.findViewById(R.id.parametr1);
        parametr2 = rootView.findViewById(R.id.parametr2);
        parametr3 = rootView.findViewById(R.id.parametr3);
        parametr4 = rootView.findViewById(R.id.parametr4);
        parametr5 = rootView.findViewById(R.id.parametr5);
        parametr6 = rootView.findViewById(R.id.parametr6);
        parametr7 = rootView.findViewById(R.id.parametr7);
        parametr8 = rootView.findViewById(R.id.parametr8);

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
                    double parametr1Double = Double.parseDouble(parametr1.getText().toString());
                    double parametr2Double = Double.parseDouble(parametr2.getText().toString());
                    double parametr3Double = Double.parseDouble(parametr3.getText().toString());
                    double parametr4Double = Double.parseDouble(parametr4.getText().toString());
                    double parametr5Double = Double.parseDouble(parametr5.getText().toString());
                    double parametr6Double = Double.parseDouble(parametr6.getText().toString());
                    double parametr7Double = Double.parseDouble(parametr7.getText().toString());
                    double parametr8Double = Double.parseDouble(parametr8.getText().toString());

                    double L12 = (parametr6Double - 1) / (parametr8Double - 1) * 1000;
                    double L13 = (parametr7Double - 1) / (parametr8Double - 1) * 1000;
                    double L14 = L13 - L12;
                    double L15 = parametr4Double * parametr4Double * 0.785;
                    double L16 = parametr1Double * parametr1Double * 0.785;
                    double L19 = 2 * (2 * L16 - L15) * (parametr5Double / 1000000 * parametr3Double);
                    double L17 = L19 * parametr2Double * 0.001;
                    double L18 = L17 / 0.001 / 60;
                    double L20 = (1.33 - 0.00035 * parametr6Double * 1000) - L14 / 100;

                    result1.setText(String.valueOf(L17));
                    result2.setText(String.valueOf(L18));
                    result3.setText(String.valueOf(L19));
                    result4.setText(String.valueOf(L20));
                } catch (Exception e){
                    Log.d("MAIN", "Error: " + e);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };
        parametr1.addTextChangedListener(textWatcher);
        parametr2.addTextChangedListener(textWatcher);
        parametr3.addTextChangedListener(textWatcher);
        parametr4.addTextChangedListener(textWatcher);
        parametr5.addTextChangedListener(textWatcher);
        parametr6.addTextChangedListener(textWatcher);
        parametr7.addTextChangedListener(textWatcher);
        parametr8.addTextChangedListener(textWatcher);

    }
}