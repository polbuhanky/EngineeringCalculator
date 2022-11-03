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

import java.util.ArrayList;

import dev.artem.engineeringcalculator.Constants.SaveInfo;
import dev.artem.engineeringcalculator.MainActivity;
import dev.artem.engineeringcalculator.R;

public class Calculator1Fragment extends Fragment {

    private RecyclerView densityRV;

    private EditText mixingET;
    private EditText volumeET;
    private EditText stockSolutionET;
    private EditText addedSolutionET;

    private TextView addTV;
    private TextView finishVolumeTV;
    private TextView calculatorNameTV;

    private String calculatorName;

    MainActivity activity;
    private View rootView;

    public Calculator1Fragment(String calculatorName){
        this.calculatorName = calculatorName;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = (MainActivity) activity;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.calculator1, null);

        init();
        initListeners();
        return rootView;
    }

    private void init(){
        mixingET = rootView.findViewById(R.id.mixingET);
        volumeET = rootView.findViewById(R.id.volumeET);
        stockSolutionET = rootView.findViewById(R.id.stockSolutionET);
        addedSolutionET = rootView.findViewById(R.id.addedSolutionET);

        addTV = rootView.findViewById(R.id.addTV);
        finishVolumeTV = rootView.findViewById(R.id.finishVolumeTV);
        calculatorNameTV = rootView.findViewById(R.id.calculatorNameTV);

        calculatorNameTV.setText(calculatorName.toUpperCase());

        ArrayList<String> nums = SaveInfo.GetData(getClass().getSimpleName());
        if (nums != null){
            mixingET.setText(nums.get(0));
            volumeET.setText(nums.get(1));
            stockSolutionET.setText(nums.get(2));
            addedSolutionET.setText(nums.get(3));

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
        mixingET.addTextChangedListener(textWatcher);
        volumeET.addTextChangedListener(textWatcher);
        stockSolutionET.addTextChangedListener(textWatcher);
        addedSolutionET.addTextChangedListener(textWatcher);

    }

    public void Calculate(){
        double mixing = Double.parseDouble(mixingET.getText().toString());
        double volume = Double.parseDouble(volumeET.getText().toString());
        double stockSolution = Double.parseDouble(stockSolutionET.getText().toString());
        double addedSolution = Double.parseDouble(addedSolutionET.getText().toString());

        ArrayList<String> data = new ArrayList<>();

        data.add(String.valueOf(mixing));
        data.add(String.valueOf(volume));
        data.add(String.valueOf(stockSolution));
        data.add(String.valueOf(addedSolution));

        SaveInfo.SaveString(getClass().getSimpleName(), data);

        double addLong = volume * (stockSolution - mixing)/(mixing - addedSolution);

        addTV.setText(String.valueOf(addLong));
        finishVolumeTV.setText(String.valueOf(addLong + volume));
    }
}