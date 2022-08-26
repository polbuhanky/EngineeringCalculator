package dev.artem.engineeringcalculator;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class Calculator2 extends AppCompatActivity {

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
        setContentView(R.layout.calculator2);

        init();
        initListeners();
    }

    private void init(){
        mixingET = findViewById(R.id.mixingET2);
        volumeET = findViewById(R.id.volumeET2);
        stockSolutionET = findViewById(R.id.stockSolutionET2);
        addedSolutionET = findViewById(R.id.addedSolutionET2);

        addTV = findViewById(R.id.addTV2);
        finishVolumeTV = findViewById(R.id.finishVolumeTV2);
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

                    double finishVolumeDouble = mixing + stockSolution;

                    addTV.setText(String.valueOf((stockSolution * addedSolution + mixing * volume) / finishVolumeDouble));
                    finishVolumeTV.setText(String.valueOf(finishVolumeDouble));
                } catch (Exception e){
                    Log.d("MAIN2", "Error: " + e);
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