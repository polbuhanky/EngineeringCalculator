package dev.artem.engineeringcalculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RecyclerView densityRV;

    private EditText mixingET;
    private EditText volumeET;
    private EditText stockSolutionET;
    private EditText addedSolutionET;
    private EditText mixingET2;
    private EditText volumeET2;
    private EditText stockSolutionET2;
    private EditText addedSolutionET2;

    private TextView addTV;
    private TextView finishVolumeTV;
    private TextView addTV2;
    private TextView finishVolumeTV2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        initListeners();
    }

    private void init(){
//        densityRV = findViewById(R.id.densityRV);
//        densityRV.setAdapter(new densityAdapter());

        mixingET = findViewById(R.id.mixingET);
        volumeET = findViewById(R.id.volumeET);
        stockSolutionET = findViewById(R.id.stockSolutionET);
        addedSolutionET = findViewById(R.id.addedSolutionET);
        mixingET2 = findViewById(R.id.mixingET2);
        volumeET2 = findViewById(R.id.volumeET2);
        stockSolutionET2 = findViewById(R.id.stockSolutionET2);
        addedSolutionET2 = findViewById(R.id.addedSolutionET2);

        addTV = findViewById(R.id.addTV);
        finishVolumeTV = findViewById(R.id.finishVolumeTV);
        addTV2 = findViewById(R.id.addTV2);
        finishVolumeTV2 = findViewById(R.id.finishVolumeTV2);
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

        TextWatcher textWatcher2 = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                try{
                    double mixing = Double.parseDouble(mixingET2.getText().toString());
                    double volume = Double.parseDouble(volumeET2.getText().toString());
                    double stockSolution = Double.parseDouble(stockSolutionET2.getText().toString());
                    double addedSolution = Double.parseDouble(addedSolutionET2.getText().toString());

                    double finishVolumeDouble = mixing + stockSolution;

                    addTV2.setText(String.valueOf((stockSolution * addedSolution + mixing * volume) / finishVolumeDouble));
                    finishVolumeTV2.setText(String.valueOf(finishVolumeDouble));
                } catch (Exception e){
                    Log.d("MAIN2", "Error: " + e);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };
        mixingET2.addTextChangedListener(textWatcher2);
        volumeET2.addTextChangedListener(textWatcher2);
        stockSolutionET2.addTextChangedListener(textWatcher2);
        addedSolutionET2.addTextChangedListener(textWatcher2);
    }

//    class densityAdapter extends RecyclerView.Adapter<densityAdapter.ViewHolder>{
//
//        @NonNull
//        @Override
//        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//            View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.density_item, parent, false);
//            return new ViewHolder(view);
//        }
//
//        @Override
//        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//
//            TextWatcher textWatcher = new TextWatcher() {
//                @Override
//                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//                }
//
//                @Override
//                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//                    try{
//                        double mixing = Double.parseDouble(holder.mixingET.getText().toString());
//                        double volume = Double.parseDouble(holder.volumeET.getText().toString());
//                        double stockSolution = Double.parseDouble(holder.stockSolutionET.getText().toString());
//                        double addedSolution = Double.parseDouble(holder.addedSolutionET.getText().toString());
//
//                        double addLong = volume * (stockSolution - mixing)/(mixing - addedSolution);
//
//                        holder.addTV.setText(String.valueOf(addLong));
//                        holder.finishVolumeTV.setText(String.valueOf(addLong + volume));
//                    } catch (Exception e){
//                        Log.d("MAIN", "Error: " + e);
//                    }
//                }
//
//                @Override
//                public void afterTextChanged(Editable editable) {
//
//                }
//            };
//            holder.mixingET.addTextChangedListener(textWatcher);
//            holder.volumeET.addTextChangedListener(textWatcher);
//            holder.stockSolutionET.addTextChangedListener(textWatcher);
//            holder.addedSolutionET.addTextChangedListener(textWatcher);
//        }
//
//        @Override
//        public int getItemCount() {
//            return 2;
//        }
//
//        public class ViewHolder extends RecyclerView.ViewHolder{
//            EditText mixingET;
//            EditText volumeET;
//            EditText stockSolutionET;
//            EditText addedSolutionET;
//
//            TextView addTV;
//            TextView finishVolumeTV;
//            ViewHolder(View view) {
//                super(view);
//
//                mixingET = view.findViewById(R.id.mixingET);
//                volumeET = view.findViewById(R.id.volumeET);
//                stockSolutionET = view.findViewById(R.id.stockSolutionET);
//                addedSolutionET = view.findViewById(R.id.addedSolutionET);
//
//                addTV = view.findViewById(R.id.addTV);
//                finishVolumeTV = view.findViewById(R.id.finishVolumeTV);
//            }
//        }
//
//    }
}