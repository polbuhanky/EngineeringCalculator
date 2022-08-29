package dev.artem.engineeringcalculator.fragments;

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

public class Calculator1Fragment extends Fragment {

    private RecyclerView densityRV;

    private EditText mixingET;
    private EditText volumeET;
    private EditText stockSolutionET;
    private EditText addedSolutionET;

    private TextView addTV;
    private TextView finishVolumeTV;

    MainActivity activity;
    private View rootView;

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
    }

    private void initListeners(){
        TextWatcher textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                try{
                    double mixing = Double.parseDouble(mixingET.getText().toString());
                    double volume = Double.parseDouble(volumeET.getText().toString());
                    double stockSolution = Double.parseDouble(stockSolutionET.getText().toString());
                    double addedSolution = Double.parseDouble(addedSolutionET.getText().toString());

                    double addLong = volume * (stockSolution - mixing)/(mixing - addedSolution);

                    addTV.setText(String.valueOf(addLong));
                    finishVolumeTV.setText(String.valueOf(addLong + volume));
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
}