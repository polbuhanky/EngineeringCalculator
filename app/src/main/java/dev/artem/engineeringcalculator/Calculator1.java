package dev.artem.engineeringcalculator;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import dev.artem.engineeringcalculator.utils.StatusBarUtils;

public class Calculator1 extends AppCompatActivity {

    private RecyclerView densityRV;

    private EditText mixingET;
    private EditText volumeET;
    private EditText stockSolutionET;
    private EditText addedSolutionET;

    private TextView addTV;
    private TextView finishVolumeTV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator1);
        StatusBarUtils.setColor(this, getResources().getColor(R.color.grey), 0);
        init();
        initListeners();
    }

    private void init(){
        mixingET = findViewById(R.id.mixingET);
        volumeET = findViewById(R.id.volumeET);
        stockSolutionET = findViewById(R.id.stockSolutionET);
        addedSolutionET = findViewById(R.id.addedSolutionET);

        addTV = findViewById(R.id.addTV);
        finishVolumeTV = findViewById(R.id.finishVolumeTV);
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