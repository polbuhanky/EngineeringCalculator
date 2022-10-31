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

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;

import dev.artem.engineeringcalculator.MainActivity;
import dev.artem.engineeringcalculator.R;

public class CNCFragment extends Fragment {

    private EditText B1;
    private EditText B2;
    private EditText B3;
    private EditText B4;
    private EditText B5;
    private EditText B6;
    private EditText B7;
    private EditText B8;
    private EditText B9;
    private EditText B10;
    private EditText B11;
    private EditText B12;
    private EditText B13;
    private EditText B14;
    private EditText B15;
    private EditText B16;
    private EditText B17;
    private EditText B18;
    private EditText B19;
    private EditText B20;
    private EditText B21;
    private EditText B22;
    private EditText B23;
    private EditText B24;
    private EditText B25;
    private EditText B26;
    private EditText B27;
    private EditText B28;
    private EditText B29;
    private EditText B30;
    private EditText B31;
    private EditText B32;
    private EditText B33;
    private EditText B34;
    private EditText B35;
    private EditText B36;
    private EditText B37;
    private EditText B38;
    private EditText B39;
    private EditText B42;
    private EditText B43;
    private EditText B44;
    private EditText B45;

    private TextView B47;
    private TextView B48;
    private TextView B49;
    private TextView B50;
    private TextView B51;
    private TextView B52;
    private TextView B53;

    private TextView calculatorNameTV;

    private String calculatorName;

    MainActivity activity;
    private View rootView;

    public CNCFragment(String calculatorName){
        this.calculatorName = calculatorName;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = (MainActivity) activity;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.calculator_cnc, null);

        init();
        initListeners();
        return rootView;
    }

    private void init(){
        B1 = rootView.findViewById(R.id.B1);
        B2 = rootView.findViewById(R.id.B2);
        B3 = rootView.findViewById(R.id.B3);
        B4 = rootView.findViewById(R.id.B4);
        B5 = rootView.findViewById(R.id.B5);
        B6 = rootView.findViewById(R.id.B6);
        B7 = rootView.findViewById(R.id.B7);
        B8 = rootView.findViewById(R.id.B8);
        B9 = rootView.findViewById(R.id.B9);
        B10 = rootView.findViewById(R.id.B10);
        B11 = rootView.findViewById(R.id.B11);
        B12 = rootView.findViewById(R.id.B12);
        B13 = rootView.findViewById(R.id.B13);
        B14 = rootView.findViewById(R.id.B14);
        B15 = rootView.findViewById(R.id.B15);
        B16 = rootView.findViewById(R.id.B16);
        B17 = rootView.findViewById(R.id.B17);
        B18 = rootView.findViewById(R.id.B18);
        B19 = rootView.findViewById(R.id.B19);
        B20 = rootView.findViewById(R.id.B20);
        B21 = rootView.findViewById(R.id.B21);
        B22 = rootView.findViewById(R.id.B22);
        B23 = rootView.findViewById(R.id.B23);
        B24 = rootView.findViewById(R.id.B24);
        B25 = rootView.findViewById(R.id.B25);
        B26 = rootView.findViewById(R.id.B26);
        B27 = rootView.findViewById(R.id.B27);
        B28 = rootView.findViewById(R.id.B28);
        B29 = rootView.findViewById(R.id.B29);
        B30 = rootView.findViewById(R.id.B30);
        B31 = rootView.findViewById(R.id.B31);
        B32 = rootView.findViewById(R.id.B32);
        B33 = rootView.findViewById(R.id.B33);
        B34 = rootView.findViewById(R.id.B34);
        B35 = rootView.findViewById(R.id.B35);
        B36 = rootView.findViewById(R.id.B36);
        B37 = rootView.findViewById(R.id.B37);
        B38 = rootView.findViewById(R.id.B38);
        B39 = rootView.findViewById(R.id.B39);
        B42 = rootView.findViewById(R.id.B42);
        B43 = rootView.findViewById(R.id.B43);
        B44 = rootView.findViewById(R.id.B44);
        B45 = rootView.findViewById(R.id.B45);

        B47 = rootView.findViewById(R.id.B47);
        B48 = rootView.findViewById(R.id.B48);
        B49 = rootView.findViewById(R.id.B49);
        B50 = rootView.findViewById(R.id.B50);
        B51 = rootView.findViewById(R.id.B51);
        B52 = rootView.findViewById(R.id.B52);
        B53 = rootView.findViewById(R.id.B53);

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
                    double B1Double = Double.parseDouble(B1.getText().toString());
                    double B2Double = Double.parseDouble(B2.getText().toString());
                    double B3Double = Double.parseDouble(B3.getText().toString());
                    double B4Double = Double.parseDouble(B4.getText().toString());
                    double B5Double = Double.parseDouble(B5.getText().toString());
                    double B6Double = Double.parseDouble(B6.getText().toString());
                    double B7Double = Double.parseDouble(B7.getText().toString());
                    double B8Double = Double.parseDouble(B8.getText().toString());
                    double B9Double = Double.parseDouble(B9.getText().toString());
                    double B10Double = Double.parseDouble(B10.getText().toString());
                    double B11Double = Double.parseDouble(B11.getText().toString());
                    double B12Double = Double.parseDouble(B12.getText().toString());
                    double B13Double = Double.parseDouble(B13.getText().toString());
                    double B14Double = Double.parseDouble(B14.getText().toString());
                    double B15Double = Double.parseDouble(B15.getText().toString());
                    double B16Double = Double.parseDouble(B16.getText().toString());
                    double B17Double = Double.parseDouble(B17.getText().toString());
                    double B18Double = Double.parseDouble(B18.getText().toString());
                    double B19Double = Double.parseDouble(B19.getText().toString());
                    double B20Double = Double.parseDouble(B20.getText().toString());
                    double B21Double = Double.parseDouble(B21.getText().toString());
                    double B22Double = Double.parseDouble(B22.getText().toString());
                    double B23Double = Double.parseDouble(B23.getText().toString());
                    double B24Double = Double.parseDouble(B24.getText().toString());
                    double B25Double = Double.parseDouble(B25.getText().toString());
                    double B26Double = Double.parseDouble(B26.getText().toString());
                    double B27Double = Double.parseDouble(B27.getText().toString());
                    double B28Double = Double.parseDouble(B28.getText().toString());
                    double B29Double = Double.parseDouble(B29.getText().toString());
                    double B30Double = Double.parseDouble(B30.getText().toString());
                    double B31Double = Double.parseDouble(B31.getText().toString());
                    double B32Double = Double.parseDouble(B32.getText().toString());
                    double B33Double = Double.parseDouble(B33.getText().toString());
                    double B34Double = Double.parseDouble(B34.getText().toString());
                    double B35Double = Double.parseDouble(B35.getText().toString());
                    double B36Double = Double.parseDouble(B36.getText().toString());
                    double B37Double = Double.parseDouble(B37.getText().toString());
                    double B38Double = Double.parseDouble(B38.getText().toString());
                    String B39String = B39.getText().toString();
                    double B42Double = Double.parseDouble(B42.getText().toString());
                    double B43Double = Double.parseDouble(B43.getText().toString());
                    double B44Double = Double.parseDouble(B44.getText().toString());
                    double B45Double = Double.parseDouble(B45.getText().toString());

                    double P24 = (B4Double * 3.2808) > (B22Double * 3.2808) ? (4 * (B4Double * 3.2808) * B45Double) / (1200 * ((B23Double * 0.03937) - (B5Double * 0.03937))) + (4 * ((B4Double * 3.2808) - (B22Double * 3.2808)) * B45Double) / (1200 * ((B3Double * 0.03937) - (B5Double * 0.03937))) : 0;
                    double P23 = (B4Double * 3.2808) <= (B22Double * 3.2808) ? (4 * (B4Double * 3.2808) * B45Double) / (1200 * ((B23Double * 0.03937) - (B5Double * 0.03937))) : 0;
                    double P44 = (4 * (B19Double * 3.2808) * B45Double) / (1200 * ((B3Double * 0.03937) - (B20Double * 0.03937)));
                    double P40 = (4 * (B16Double * 3.2808) * B45Double) / (1200 * ((B3Double * 0.03937) - (B17Double * 0.03937)));
                    double P36 = (4 * (B13Double * 3.2808) * B45Double) / (1200 * ((B3Double * 0.03937) - (B14Double * 0.03937)));
                    double P32 = (4 * (B10Double * 3.2808) * B45Double) / (1200 * ((B3Double * 0.03937) - (B11Double * 0.03937)));
                    double P28 = (4 * (B7Double * 3.2808) * B45Double) / (1200 * ((B3Double * 0.03937) - (B8Double * 0.03937)));
                    double R23 = P23 * 0.068046;
                    double R24 = P24 * 0.068046;
                    double R28 = P28 * 0.068046;
                    double R32 = P32 * 0.068046;
                    double R36 = P36 * 0.068046;
                    double R40 = P40 * 0.068046;
                    double R44 = P44 * 0.068046;
                    double R53 = R23 + R24 + R28 + R32 + R36 + R40 + R44;

                    B47.setText(String.valueOf(R53));
                    B48.setText(String.valueOf(55));
                    B49.setText(String.valueOf(57.5));
                    B50.setText(String.valueOf(B32Double * 1000 - (R53 * 100000) / (9.82 * B43Double)));
                    B51.setText(String.valueOf(B32Double * 1000 + (R53 * 100000) / (9.82 * B43Double)));
                    B52.setText(String.valueOf(B43Double * 9.82 * (B32Double * 1000 - (R53 * 100000) / (9.82 * B43Double)) / 100000));
                    B53.setText(String.valueOf(B43Double * 9.82 * (B32Double * 1000 + (R53 * 100000) / (9.82 * B43Double)) / 100000));

                } catch (Exception e){
                    Log.d("MAIN", "Error: " + e);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };
        B1.addTextChangedListener(textWatcher);
        B2.addTextChangedListener(textWatcher);
        B3.addTextChangedListener(textWatcher);
        B4.addTextChangedListener(textWatcher);
        B5.addTextChangedListener(textWatcher);
        B6.addTextChangedListener(textWatcher);
        B7.addTextChangedListener(textWatcher);
        B8.addTextChangedListener(textWatcher);
        B9.addTextChangedListener(textWatcher);
        B10.addTextChangedListener(textWatcher);
        B11.addTextChangedListener(textWatcher);
        B12.addTextChangedListener(textWatcher);
        B13.addTextChangedListener(textWatcher);
        B14.addTextChangedListener(textWatcher);
        B15.addTextChangedListener(textWatcher);
        B16.addTextChangedListener(textWatcher);
        B17.addTextChangedListener(textWatcher);
        B18.addTextChangedListener(textWatcher);
        B19.addTextChangedListener(textWatcher);
        B20.addTextChangedListener(textWatcher);
        B21.addTextChangedListener(textWatcher);
        B22.addTextChangedListener(textWatcher);
        B23.addTextChangedListener(textWatcher);
        B24.addTextChangedListener(textWatcher);
        B25.addTextChangedListener(textWatcher);
        B26.addTextChangedListener(textWatcher);
        B27.addTextChangedListener(textWatcher);
        B28.addTextChangedListener(textWatcher);
        B29.addTextChangedListener(textWatcher);
        B30.addTextChangedListener(textWatcher);
        B31.addTextChangedListener(textWatcher);
        B32.addTextChangedListener(textWatcher);
        B33.addTextChangedListener(textWatcher);
        B34.addTextChangedListener(textWatcher);
        B35.addTextChangedListener(textWatcher);
        B36.addTextChangedListener(textWatcher);
        B37.addTextChangedListener(textWatcher);
        B38.addTextChangedListener(textWatcher);
        B39.addTextChangedListener(textWatcher);
        B42.addTextChangedListener(textWatcher);
        B43.addTextChangedListener(textWatcher);
        B44.addTextChangedListener(textWatcher);
        B45.addTextChangedListener(textWatcher);

    }
}