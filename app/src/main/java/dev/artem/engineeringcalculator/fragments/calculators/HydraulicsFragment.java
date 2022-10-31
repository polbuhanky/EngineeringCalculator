package dev.artem.engineeringcalculator.fragments.calculators;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;

import dev.artem.engineeringcalculator.MainActivity;
import dev.artem.engineeringcalculator.R;
import icepick.Icepick;

public class HydraulicsFragment extends Fragment {

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

    private TextView D1;
    private TextView D2;
    private TextView D3;
    private TextView D4;
    private TextView D5;
    private TextView D6;
    private TextView D7;
    private TextView D8;
    private TextView D9;
    private TextView D10;
    private TextView D11;
    private TextView D12;
    private TextView D13;
    private TextView D14;
    private TextView D15;
    private TextView D16;
    private TextView D17;
    private TextView D18;
    private TextView D19;
    private TextView D20;
    private TextView D21;
    private TextView D22;
    private TextView D23;
    private TextView D24;
    private TextView D26;
    private TextView D28;
    private TextView D30;
    private TextView D31;
    private TextView D32;
    private TextView D36;
    private TextView D37;
    private TextView D38;

    private TextView G1;
    private TextView G2;
    private TextView G3;
    private TextView G4;
    private TextView G5;
    private TextView G6;
    private TextView G7;
    private TextView G8;
    private TextView G9;
    private TextView G10;
    private TextView G11;
    private TextView G12;
    private TextView G13;
    private TextView G14;
    private TextView G15;
    private TextView G16;
    private TextView G17;
    private TextView G18;
    private TextView G19;
    private TextView G20;
    private TextView G21;
    private TextView G22;
    private TextView G23;
    private TextView G24;
    private TextView G25;
    private TextView G26;
    private TextView G27;
    private TextView G28;
    private TextView G29;
    private TextView G30;
    private TextView G31;
    private TextView G32;
    private TextView G33;
    private TextView G34;
    private TextView G35;
    private TextView G37;
    private TextView G38;
    private TextView G39;

    private TextView H31;
    private TextView H32;
    private TextView H33;
    private TextView H34;
    private TextView H35;
    private TextView H36;

    private TextView J33;
    private TextView J34;
    private TextView J35;
    private TextView J36;
    private TextView J37;
    private TextView J38;

    private LineChart lineChart1;
    private LineChart lineChart2;
    private LineChart lineChart3;


    private TextView calculatorNameTV;

    private String calculatorName;

    MainActivity activity;
    private View rootView;

    public HydraulicsFragment(String calculatorName){
        this.calculatorName = calculatorName;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = (MainActivity) activity;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Icepick.restoreInstanceState(this, savedInstanceState);
        setRetainInstance(true);

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(null);
        Icepick.saveInstanceState(this, outState);
    }



    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.hydraulics, null);
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

        D1 = rootView.findViewById(R.id.D1);
        D2 = rootView.findViewById(R.id.D2);
        D3 = rootView.findViewById(R.id.D3);
        D4 = rootView.findViewById(R.id.D4);
        D5 = rootView.findViewById(R.id.D5);
        D6 = rootView.findViewById(R.id.D6);
        D7 = rootView.findViewById(R.id.D7);
        D8 = rootView.findViewById(R.id.D8);
        D9 = rootView.findViewById(R.id.D9);
        D10 = rootView.findViewById(R.id.D10);
        D11 = rootView.findViewById(R.id.D11);
        D12 = rootView.findViewById(R.id.D12);
        D13 = rootView.findViewById(R.id.D13);
        D14 = rootView.findViewById(R.id.D14);
        D15 = rootView.findViewById(R.id.D15);
        D16 = rootView.findViewById(R.id.D16);
        D17 = rootView.findViewById(R.id.D17);
        D18 = rootView.findViewById(R.id.D18);
        D19 = rootView.findViewById(R.id.D19);
        D20 = rootView.findViewById(R.id.D20);
        D21 = rootView.findViewById(R.id.D21);
        D22 = rootView.findViewById(R.id.D22);
        D23 = rootView.findViewById(R.id.D23);
        D24 = rootView.findViewById(R.id.D24);
        D26 = rootView.findViewById(R.id.D26);
        D28 = rootView.findViewById(R.id.D28);
        D30 = rootView.findViewById(R.id.D30);
        D31 = rootView.findViewById(R.id.D31);
        D32 = rootView.findViewById(R.id.D32);
        D36 = rootView.findViewById(R.id.D36);
        D37 = rootView.findViewById(R.id.D37);
        D38 = rootView.findViewById(R.id.D38);

        G1 = rootView.findViewById(R.id.G1);
        G2 = rootView.findViewById(R.id.G2);
        G3 = rootView.findViewById(R.id.G3);
        G4 = rootView.findViewById(R.id.G4);
        G5 = rootView.findViewById(R.id.G5);
        G6 = rootView.findViewById(R.id.G6);
        G7 = rootView.findViewById(R.id.G7);
        G8 = rootView.findViewById(R.id.G8);
        G9 = rootView.findViewById(R.id.G9);
        G10 = rootView.findViewById(R.id.G10);
        G11 = rootView.findViewById(R.id.G11);
        G12 = rootView.findViewById(R.id.G12);
        G13 = rootView.findViewById(R.id.G13);
        G14 = rootView.findViewById(R.id.G14);
        G15 = rootView.findViewById(R.id.G15);
        G16 = rootView.findViewById(R.id.G16);
        G17 = rootView.findViewById(R.id.G17);
        G18 = rootView.findViewById(R.id.G18);
        G19 = rootView.findViewById(R.id.G19);
        G20 = rootView.findViewById(R.id.G20);
        G21 = rootView.findViewById(R.id.G21);
        G22 = rootView.findViewById(R.id.G22);
        G23 = rootView.findViewById(R.id.G23);
        G24 = rootView.findViewById(R.id.G24);
        G25 = rootView.findViewById(R.id.G25);
        G26 = rootView.findViewById(R.id.G26);
        G27 = rootView.findViewById(R.id.G27);
        G28 = rootView.findViewById(R.id.G28);
        G29 = rootView.findViewById(R.id.G29);
        G30 = rootView.findViewById(R.id.G30);
        G31 = rootView.findViewById(R.id.G31);
        G32 = rootView.findViewById(R.id.G32);
        G33 = rootView.findViewById(R.id.G33);
        G34 = rootView.findViewById(R.id.G34);
        G35 = rootView.findViewById(R.id.G35);
        G37 = rootView.findViewById(R.id.G37);
        G38 = rootView.findViewById(R.id.G38);
        G39 = rootView.findViewById(R.id.G39);

        H31 = rootView.findViewById(R.id.H31);
        H32 = rootView.findViewById(R.id.H32);
        H33 = rootView.findViewById(R.id.H33);
        H34 = rootView.findViewById(R.id.H34);
        H35 = rootView.findViewById(R.id.H35);
        H36 = rootView.findViewById(R.id.H36);

        J33 = rootView.findViewById(R.id.J33);
        J34 = rootView.findViewById(R.id.J34);
        J35 = rootView.findViewById(R.id.J35);
        J36 = rootView.findViewById(R.id.J36);
        J37 = rootView.findViewById(R.id.J37);
        J38 = rootView.findViewById(R.id.J38);

        lineChart1 = rootView.findViewById(R.id.lineChart1);
        lineChart2 = rootView.findViewById(R.id.lineChart2);
        lineChart3 = rootView.findViewById(R.id.lineChart3);

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


                    D1.setText(String.valueOf(B1Double * 0.03937));
                    D2.setText(String.valueOf(B2Double * 0.03937));
                    D3.setText(String.valueOf(B3Double * 0.03937));
                    D4.setText(String.valueOf(B4Double * 3.2808));
                    D5.setText(String.valueOf(B5Double * 0.03937));
                    D6.setText(String.valueOf(B6Double * 0.03937));
                    D7.setText(String.valueOf(B7Double * 3.2808));
                    D8.setText(String.valueOf(B8Double * 0.03937));
                    D9.setText(String.valueOf(B9Double * 0.03937));
                    D10.setText(String.valueOf(B10Double * 3.2808));
                    D11.setText(String.valueOf(B11Double * 0.03937));
                    D12.setText(String.valueOf(B12Double * 0.03937));
                    D13.setText(String.valueOf(B13Double * 3.2808));
                    D14.setText(String.valueOf(B14Double * 0.03937));
                    D15.setText(String.valueOf(B15Double * 0.03937));
                    D16.setText(String.valueOf(B16Double * 3.2808));
                    D17.setText(String.valueOf(B17Double * 0.03937));
                    D18.setText(String.valueOf(B18Double * 0.03937));
                    D19.setText(String.valueOf(B19Double * 3.2808));
                    D20.setText(String.valueOf(B20Double * 0.03937));
                    D21.setText(String.valueOf(B21Double * 14.503));
                    D22.setText(String.valueOf(B22Double * 3.2808));
                    D23.setText(String.valueOf(B23Double * 0.03937));
                    D24.setText(String.valueOf(B24Double * 3.2808));
                    D26.setText(String.valueOf(B26Double * 0.03937));
                    D28.setText(String.valueOf(B28Double * 0.03937));
                    D30.setText(String.valueOf(B30Double * 0.03937));
                    D31.setText(String.valueOf(B30Double * 15.85032));
                    D32.setText(String.valueOf(B32Double / (0.12 * 0.999)));
                    D36.setText(String.valueOf(B36Double * 3.2808));
                    D37.setText(String.valueOf(B37Double * 3.2808 / 1000));
                    D38.setText(String.valueOf(B38Double / (0.12 * 0.999)));

                    double P10 = Math.log10(B33Double / B34Double) / Math.log10(600/300);
                    double N3 = Math.log10(B33Double / B34Double) / Math.log10(600 / 300);
                    double R3 = Math.log10(B34Double / B35Double) / Math.log10(300 / 6);
                    double N13 = 0.408 * (B30Double * 15.85032) / Math.pow(((B11Double * 0.03937) - 2 * (B12Double * 0.03937)), 2);
                    double M14 = (((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) * Math.pow((B14Double - 2 * B15Double) / 1000, 2) * (B32Double * 1000)) / Math.pow(((B33Double - B34Double) / 1000), 2);
                    double Z14 = (4 * (B30Double / 1000)) / (Math.PI * Math.pow((B14Double - 2 * B15Double) / 1000, 2));
                    double M11 = (((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) * Math.pow((B11Double - 2 * B12Double) / 1000, 2) * (B32Double * 1000)) / Math.pow(((B33Double - B34Double) / 1000), 2);
                    double Z8 = (4 * (B30Double / 1000)) / (Math.PI * Math.pow((B8Double - 2 * B9Double) / 1000, 2));
                    double M5 = (((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) * Math.pow((B5Double - 2 * B6Double) / 1000, 2) * (B32Double * 1000)) / Math.pow(((B33Double - B34Double) / 1000), 2);
                    double Z11 = (4 * (B30Double / 1000)) / (Math.PI * Math.pow((B11Double - 2 * B12Double) / 1000, 2));
                    double N10 = 0.408 * (B30Double * 15.85032) / Math.pow(((B8Double * 0.03937) - 2 * (B9Double * 0.03937)), 2);
                    double M8 = (((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) * Math.pow((B8Double - 2 * B9Double) / 1000, 2) * (B32Double * 1000)) / Math.pow(((B33Double - B34Double) / 1000), 2);
                    double N7 = 0.408 * (B30Double * 15.85032) / Math.pow(((B5Double * 0.03937) - 2 * (B6Double * 0.03937)), 2);
                    double Z5 = (4 * (B30Double / 1000)) / (Math.PI * Math.pow((B5Double - 2 * B6Double) / 1000, 2));
                    double N19 = 0.408 * (B30Double * 15.85032) / Math.pow(((B17Double * 0.03937) - 2 * (B18Double * 0.03937)), 2);
                    double N16 = 0.408 * (B30Double * 15.85032) / Math.pow(((B14Double * 0.03937) - 2 * (B15Double * 0.03937)), 2);
                    double P16 = Math.log10(B33Double / B34Double) / Math.log10(600/300);
                    double P13 = Math.log10(B33Double / B34Double) / Math.log10(600 / 300);
                    double P7 = Math.log10(B33Double / B34Double) / Math.log10(600 / 300);
                    double AE5 = (((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) * ((B5Double - 2 * B6Double) / 1000)) / (Z5 * ((B33Double - B34Double) / 1000));
                    double Z17 = (4 * (B30Double / 1000)) / (Math.PI * Math.pow((B17Double - 2 * B18Double) / 1000, 2));
                    double M17 = (((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) * Math.pow((B17Double - 2 * B18Double) / 1000, 2) * (B32Double * 1000)) / Math.pow(((B33Double - B34Double) / 1000), 2);
                    double P19 = Math.log10(B33Double / B34Double) / Math.log10(600 / 300);
                    double X30 = (4 * B30Double / 1000) / (Math.PI * (Math.pow(B3Double / 1000, 2) - Math.pow(B8Double / 1000, 2)));
                    double X42 = (4 * B30Double / 1000) / (Math.PI * (Math.pow(B3Double / 1000, 2) - Math.pow(B17Double / 1000, 2)));
                    double X46 = (4 * B30Double / 1000) / (Math.PI * (Math.pow(B3Double / 1000, 2) - Math.pow(B20Double / 1000, 2)));
                    double AC24 = (4 * B30Double / 1000) / (Math.PI * (Math.pow(B23Double / 1000, 2) - Math.pow(B5Double / 1000, 2)));
                    double M28 = (B7Double > 0 && B30Double > 0) ? 25 * Math.pow(((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) / (B32Double * 1000), 0.5) : 0;
                    double M32 = (B10Double > 0 && B30Double > 0) ? 25 * Math.pow(((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) / (B32Double * 1000), 0.5) :  0;
                    double M36 = (B13Double > 0 && B30Double > 0) ? 25 * Math.pow(((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) / (B32Double * 1000), 0.5) : 0;
                    double M40 = (B16Double > 0 && B30Double > 0) ? 25 * Math.pow(((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) / (B32Double * 1000), 0.5) : 0;
                    double M44 = (B19Double > 0 && B30Double > 0) ? 25 * Math.pow(((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) / (B32Double * 1000), 0.5) : 0;
                    double P26 = 0.408 * (B30Double * 15.85032) / Math.pow((B23Double * 0.03937), 2 - Math.pow((B5Double * 0.03937), 2));
                    double P25 = 0.408 * (B30Double * 15.85032) / (Math.pow((B3Double * 0.03937), 2) - Math.pow((B5Double * 0.03937), 2));
                    double P29 = 0.408 * (B30Double * 15.85032) / (Math.pow((B3Double * 0.03937), 2) - Math.pow((B8Double * 0.03937), 2));
                    double X34 = (4 * B30Double / 1000) / (Math.PI * (Math.pow(B3Double / 1000, 2) - Math.pow(B11Double / 1000, 2)));
                    double X38 = (4 * B30Double / 1000) / (Math.PI * (Math.pow(B3Double / 1000, 2) - Math.pow(B14Double / 1000, 2)));
                    double P37 = 0.408 * (B30Double * 15.85032) / (Math.pow((B3Double * 0.03937), 2) - Math.pow((B14Double * 0.03937), 2));
                    double P41 = 0.408 * (B30Double * 15.85032) / (Math.pow((B3Double * 0.03937), 2) - Math.pow((B17Double * 0.03937), 2));
                    double P45 = 0.408 * (B30Double * 15.85032) / (Math.pow((B3Double * 0.03937), 2) - Math.pow((B20Double * 0.03937), 2));
                    double R26 = Math.log10(B34Double / B35Double) / Math.log10(300 / 6);
                    double R25 = Math.log10(B34Double / B35Double) / Math.log10(300 / 6);
                    double AF24 = (4 * B30Double / 1000) / (Math.PI * (Math.pow(B3Double / 1000, 2) - Math.pow(B5Double / 1000, 2)));
                    double V28 = (4 * B30Double / 1000) / (Math.PI * (Math.pow(B3Double / 1000, 2) - Math.pow(B8Double / 1000, 2)));
                    double V32 = (4 * B30Double / 1000) / (Math.PI * (Math.pow(B3Double / 1000, 2) - Math.pow(B11Double / 1000, 2)));
                    double R29 = Math.log10(B34Double / B35Double) / Math.log10(300 / 6);
                    double R33 = Math.log10(B34Double / B35Double) / Math.log10(300 / 6);
                    double V36 = (4 * B30Double / 1000) / (Math.PI * (Math.pow(B3Double / 1000, 2) - Math.pow(B14Double / 1000, 2)));
                    double R37 = Math.log10(B34Double / B35Double) / Math.log10(300 / 6);
                    double V40 = (4 * B30Double / 1000) / (Math.PI * (Math.pow(B3Double / 1000, 2) - Math.pow(B17Double / 1000, 2)));
                    double R41 = Math.log10(B34Double / B35Double) / Math.log10(300 / 6);
                    double V44 = (4 * B30Double / 1000) / (Math.PI * (Math.pow(B3Double / 1000, 2) - Math.pow(B20Double / 1000, 2)));
                    double R45 = Math.log10(B34Double / B35Double) / Math.log10(300 / 6);
                    double AB23 = (4 * B30Double / 1000) / (Math.PI * (Math.pow(B23Double / 1000, 2) - Math.pow(B5Double / 1000, 2)));
                    double AE23 = (4 * B30Double / 1000) / (Math.PI * (Math.pow(B3Double / 1000, 2) - Math.pow(B5Double / 1000, 2)));
                    double P33 = 0.408 * (B30Double * 15.85032) / (Math.pow((B3Double * 0.03937), 2) - Math.pow((B11Double * 0.03937), 2));
                    double O22 = (0.4 + 0.3 + 0.3 + 0.4) * 100000 * (B32Double * 1000) * Math.pow(B30Double / 1000, 2);
                    double N20 = B25Double * Math.PI * Math.pow(B26Double / 1000, 2) / 4;
                    double P20 = B27Double * Math.PI * Math.pow(B28Double / 1000, 2) / 4;
                    double R20 = B29Double * Math.PI * Math.pow(B30Double / 1000, 2) / 4;
                    double N21 = B21Double * 100000;
                    double T21 = (B30Double / 1000) * (B21Double * 100000);
                    double M25 = (B4Double > 0 && B30Double > 0) ? (4 * (B30Double / 1000)) / (Math.PI * (Math.pow(B23Double / 1000, 2) - Math.pow(B5Double / 1000, 2))) : 0;
                    double M26 = (B4Double > 0 && B30Double > 0) ? (4 * (B30Double / 1000)) / (Math.PI * (Math.pow(B3Double / 1000, 2) - Math.pow(B5Double / 1000, 2))) : 0;
                    double M29 = (B7Double > 0 && B30Double > 0) ? (4 * (B30Double / 1000)) / (Math.PI * (Math.pow(B3Double / 1000, 2) - Math.pow(B8Double / 1000, 2))) : 0;
                    double M33 = (B10Double > 0 && B30Double > 0) ? (4 * (B30Double / 1000)) / (Math.PI * (Math.pow(B3Double / 1000, 2) - Math.pow(B11Double / 1000, 2))) : 0;
                    double M37 = (B13Double > 0 && B30Double > 0) ? (4 * (B30Double / 1000)) / (Math.PI * (Math.pow(B3Double / 1000, 2) - Math.pow(B14Double / 1000, 2))) : 0;
                    double M41 = (B16Double > 0 && B30Double > 0) ? (4 * (B30Double / 1000)) / (Math.PI * (Math.pow(B3Double / 1000, 2) - Math.pow(B17Double / 1000, 2))) : 0;
                    double M45 = (B19Double > 0 && B30Double > 0) ? (4 * (B30Double / 1000)) / (Math.PI * (Math.pow(B3Double / 1000, 2) - Math.pow(B20Double / 1000, 2))) : 0;
                    double T48 = 0.6 * Math.PI * (Math.pow(B3Double / 1000, 2)) / 4;
                    double W12 = (4 * (B30Double / 1000)) / (Math.PI * Math.pow((B11Double - 2 * B12Double) / 1000, 2));
                    double W15 = (4 * (B30Double / 1000)) / (Math.PI * Math.pow((B14Double - 2 * B15Double) / 1000, 2));
                    double W18 = (4 * (B30Double / 1000)) / (Math.PI * Math.pow((B17Double - 2 * B18Double) / 1000, 2));
                    double AI20 = Math.pow(B37Double / 1000, 3) * (B32Double * 1000) * (B38Double * 1000 - B32Double * 1000) * 9.81 / Math.pow(((B33Double - B34Double) / 1000), 2);
                    double AK20 = Math.pow(B37Double / 1000, 2) * ((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) * (B32Double * 1000) / Math.pow(((B33Double - B34Double) / 1000), 2);

                    double R19 = (5.11 * B33Double) / Math.pow(1022, P19);
                    double R13 = (5.11 * B33Double) / Math.pow(1022, P13);
                    double R10 = (5.11 * B33Double) / Math.pow(1022, P10);
                    double R7 = (5.11 * B33Double) / Math.pow(1022, P7);
                    double T19 = 100 * R19 * Math.pow(((96 * N19) / ((B17Double * 0.03937) - 2 * (B18Double * 0.03937))), (P19 - 1));
                    double P3 = 0.511 * B34Double / Math.pow(511, N3);
                    double R16 = (5.11 * B33Double) / Math.pow(1022, P16);
                    double T13 = 100 * R13 * Math.pow((96 * N13) / ((B11Double * 0.03937) - 2 * (B12Double * 0.03937)), (P13 - 1));
                    double T10 = 100 * R10 * Math.pow((96 * N10) / ((B8Double * 0.03937) - 2 * (B9Double * 0.03937)), (P10 - 1));
                    double T7 = 100 * R7 * Math.pow((96 * N7) / ((B5Double * 0.03937) - 2 * (B6Double * 0.03937)), (P7 - 1));
                    double AG19 = (1.75 - Math.log10(P19)) / 7;
                    double AE19 = (Math.log10(P19) + 3.93) / 50;
                    double Z19 = 4270 - 1370 * P19;
                    double X19 = 3470 - 1370 * P19;
                    double V19 = 928 * N19 * ((B17Double * 0.03937) - 2 * (B18Double * 0.03937)) * (B32Double / (0.12 * 0.999)) / (T19 * Math.pow((3 * P19 + 1) / (4 * P19), P19));
                    double O17 = 2100 + 7.3 * Math.pow(M17, 0.58);
                    double AE17 = (((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) * ((B17Double - 2 * B18Double) / 1000)) / (Z17 * ((B33Double - B34Double) / 1000));
                    double AC17 = (Z17 * ((B17Double - 2 * B18Double) / 1000) * (B32Double * 1000)) / ((B33Double - B34Double) / 1000);
                    double T16 = 100 * R16 * Math.pow((96 * N16) / ((B14Double * 0.03937) - 2 * (B15Double * 0.03937)), (P16 - 1));
                    double O14 = 2100 + 7.3 * Math.pow(M14, 0.58);
                    double AE14 = (((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) * ((B14Double - 2 * B15Double) / 1000)) / (Z14 * ((B33Double - B34Double) / 1000));
                    double AC14 = (Z14 * ((B14Double - 2 * B15Double) / 1000) * (B32Double * 1000)) / ((B33Double - B34Double) / 1000);
                    double AG13 = (1.75 - Math.log10(P13)) / 7;
                    double AE13 = (Math.log10(P13) + 3.93) / 50;
                    double Z13 = 4270 - 1370 * P13;
                    double X13 = 3470 - 1370 * P13;
                    double V13 = 928 * N13 * ((B11Double * 0.03937) - 2 * (B12Double * 0.03937)) * (B32Double / (0.12 * 0.999)) / (T13 * Math.pow((3 * P13 + 1) / (4 * P13), P13));
                    double O11 = 2100 + 7.3 * Math.pow(M11, 0.58);
                    double AE11 = (((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) * ((B11Double - 2 * B12Double) / 1000)) / (Z11 * ((B33Double - B34Double) / 1000));
                    double AC11 = (Z11 * ((B11Double - 2 * B12Double) / 1000) * (B32Double * 1000)) / ((B33Double - B34Double) / 1000);
                    double AG10 = (1.75 - Math.log10(P10)) / 7;
                    double AE10 = (Math.log10(P10) + 3.93) / 50;
                    double Z10 = 4270 - 1370 * P10;
                    double X10 = 3470 - 1370 * P10;
                    double V10 = 928 * N10 * ((B8Double * 0.03937) - 2 * (B9Double * 0.03937)) * (B32Double / (0.12 * 0.999)) / (T10 * Math.pow((3 * P10 + 1) / (4 * P10), P10));
                    double O8 = 2100 + 7.3 * Math.pow(M8, 0.58);
                    double AE8 = (((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) * ((B8Double - 2 * B9Double) / 1000)) / (Z8 * ((B33Double - B34Double) / 1000));
                    double AC8 = (Z8 * ((B8Double - 2 * B9Double) / 1000) * (B32Double * 1000)) / ((B33Double - B34Double) / 1000);
                    double AG7 = (1.75 - Math.log10(P7)) / 7;
                    double AE7 = (Math.log10(P7) + 3.93) / 50;
                    double Z7 = 4270 - 1370 * P7;
                    double X7 = 3470 - 1370 * P7;
                    double V7 = 928 * N7 * ((B5Double * 0.03937) - 2 * (B6Double * 0.03937)) * (B32Double / (0.12 * 0.999)) / (T7 * Math.pow((3 * P7 + 1) / (4 * P7), P7));
                    double O5 = 2100 + 7.3 * Math.pow(M5, 0.58);
                    double AC5 = (Z5 * ((B5Double - 2 * B6Double) / 1000) * (B32Double * 1000)) / ((B33Double - B34Double) / 1000);
                    double AI19 = V19 <= X19 ? 16 / V19 : V19 > Z19 ? AE19 / Math.pow(V19, AG19) : ((V19 - (3470 - 1370 * P19)) / 800) * ((AE19 / Math.pow((4270 - 1370 * P19), AG19)) - (16 / (3470 - 1370 * P19))) + 16 / (3470 - 1370 * P19);
                    double Q17 = (O17 * ((B33Double - B34Double) / 1000)) / (((B17Double - 2 * B18Double) / 1000) * (B32Double * 1000));
                    double AG17 = AC17 / (1 + AE17 / 6);
                    double AG16 = (1.75 - Math.log10(P16)) / 7;
                    double AE16 = (Math.log10(P16) + 3.93) / 50;
                    double Z16 = 4270 - 1370 * P16;
                    double X16 = 3470 - 1370 * P16;
                    double V16 = 928 * N16 * ((B14Double * 0.03937) - 2 * (B15Double * 0.03937)) * (B32Double / (0.12 * 0.999)) / (T16 * Math.pow((3 * P16 + 1) / (4 * P16), P16));
                    double Q14 = (O14 * ((B33Double - B34Double) / 1000)) / (((B14Double - 2* B15Double) / 1000) * (B32Double * 1000));
                    double AG14 = AC14 / (1 + AE14 / 6);
                    double AI13 = V13 <= X13 ? 16 / V13 : V13 > Z13 ? AE13 / Math.pow(V13, AG13) : ((V13 - (3470 - 1370 * P13)) / 800) * ((AE13 / Math.pow((4270 - 1370 * P13), AG13)) - (16 / (3470 - 1370 * P13))) + 16 / (3470 - 1370 * P13);
                    double Q11 = (O11 * ((B33Double - B34Double) / 1000)) / (((B11Double - 2 * B12Double) / 1000) * (B32Double * 1000));
                    double AG11 = AC11 / (1 + AE11 / 6);
                    double AI10 = V10 <= X10 ? 16 / V10 : V10 > Z10 ? AE10 / Math.pow(V10, AG10) : ((V10 - (3470 - 1370 * P10)) / 800) * ((AE10 / Math.pow((4270 - 1370 * P10), AG10)) - (16 / (3470 - 1370 * P10))) + 16 / (3470 - 1370 * P10);
                    double Q8 = (O8 * ((B33Double - B34Double) / 1000)) / (((B8Double - 2 * B9Double) / 1000) * (B32Double * 1000));
                    double AG8 = AC8 / (1 + AE8 / 6);
                    double AI7 = V7 <= X7 ? 16 / V7 : V7 > Z7 ? AE7 / Math.pow(V7, AG7) : ((V7 - (3470 - 1370 * P7)) / 800) * ((AE7 / Math.pow((4270 - 1370 * P7), AG7)) - (16 / (3470 - 1370 * P7))) + 16 / (3470 - 1370 * P7);
                    double Q5 = (O5 * ((B33Double - B34Double) / 1000)) / (((B5Double - 2 * B6Double) / 1000) * (B32Double * 1000));
                    double AG5 = AC5 / (1 + AE5 / 6);
                    double AK19 = (AI19 * Math.pow(N19, 2) * (B32Double / (0.12 * 0.999))) / (25.8 * ((B17Double * 0.03937) - 2 * (B18Double * 0.03937)));
                    double T17 = (Math.PI * Math.pow((B17Double - 2 * B18Double) / 1000, 2) * Q17) / 4;
                    double AI17 = 0.075 / Math.pow(AG17, 0.125);
                    double AI16 = V16 <= X16 ? 16 / V16 : V16 > Z16 ? AE16 / Math.pow(V16, AG16) : ((V16 - (3470 - 1370 * P16)) / 800) * ((AE16 / Math.pow((4270 - 1370 * P16), AG16)) - (16 / (3470 - 1370 * P16))) + 16 / (3470 - 1370 * P16);
                    double T14 = (Math.PI * Math.pow((B14Double - 2 * B15Double) / 1000, 2) * Q14) / 4;
                    double AI14 = 0.075 / Math.pow(AG14, 0.125);
                    double AK13 = (AI13 * Math.pow(N13, 2) * (B32Double / (0.12 * 0.999))) / (25.8 * ((B11Double * 0.03937) - 2 * (B12Double * 0.03937)));
                    double T11 = (Math.PI * Math.pow((B11Double - 2 * B12Double) / 1000, 2) * Q11) / 4;
                    double AI11 = 0.075 / Math.pow(AG11, 0.125);
                    double AK10 = (AI10 * Math.pow(N10, 2) * (B32Double / (0.12 * 0.999))) / (25.8 * ((B8Double * 0.03937) - 2 * (B9Double * 0.03937)));
                    double T3 = 0.511 * B34Double / Math.pow(511, R3);
                    double T8 = (Math.PI * Math.pow((B8Double - 2 * B9Double) / 1000, 2) * Q8) / 4;
                    double AI8 = 0.075 / Math.pow(AG8, 0.125);
                    double AK7 = (AI7 * Math.pow(N7, 2) * (B32Double / (0.12 * 0.999))) / (25.8 * ((B5Double * 0.03937) - 2 * (B6Double * 0.03937)));
                    double T5 = (Math.PI * Math.pow((B5Double - 2 * B6Double) / 1000, 2) * Q5) / 4;
                    double AI5 = 0.075 / Math.pow(AG5, 0.125);
                    double AM19 = AK19 * (B16Double * 3.2808);
                    double W17 = B30Double <= (T17 * 1000) ? (128 * (B30Double / 1000) * ((B33Double - B34Double) / 1000) * B16Double) / (Math.PI * Math.pow((B17Double - 2 * B18Double) / 1000, 4)) + (16 * ((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) * B16Double) / (3 * ((B17Double - 2 * B18Double) / 1000)) : 0;
                    double AK17 = W17 == 0 ? (AI17 * 8 * Math.pow(B30Double / 1000, 2) * (B32Double * 1000) * B16Double) / (Math.pow(Math.PI, 2) * Math.pow((B17Double - 2 * B18Double) / 1000, 5)) : 0;
                    double AK16 = (AI16 * Math.pow(N16, 2) * (B32Double / (0.12 * 0.999))) / (25.8 * ((B14Double * 0.03937) - 2 * (B15Double * 0.03937)));
                    double AM16 = AK16 * (B13Double * 3.2808);
                    double W14 = B30Double <= (T14 * 1000) ? (128 * (B30Double / 1000) * ((B33Double - B34Double) / 1000) * B13Double) / (Math.PI * Math.pow((B14Double - 2 * B15Double) / 1000, 4)) + (16 * ((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) * B13Double) / (3 * ((B14Double - 2 * B15Double) / 1000)) : 0;
                    double AK14 = W14 == 0 ? (AI14 * 8 * Math.pow(B30Double / 1000, 2) * (B32Double * 1000) * B13Double) / (Math.pow(Math.PI, 2) * Math.pow((B14Double - 2 * B15Double) / 1000, 5)) : 0;
                    double AM13 = AK13 * (B10Double * 3.2808);
                    double W11 = B30Double <= (T11 * 1000) ? (128 * (B30Double / 1000) * ((B33Double - B34Double) / 1000) * B10Double) / (Math.PI * Math.pow((B11Double - 2 * B12Double) / 1000, 4)) + (16 * ((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) * B10Double) / (3 * ((B11Double - 2 * B12Double) / 1000)) : 0;
                    double AK11 = W11 == 0 ? (AI11 * 8 * Math.pow(B30Double / 1000, 2) * (B32Double * 1000) * B10Double) / (Math.pow(Math.PI, 2) * Math.pow((B11Double - 2 * B12Double) / 1000, 5)) : 0;
                    double AM10 = AK10 * (B7Double * 3.2808);
                    double W8 = B30Double <= (T8 * 1000) ? (128 * (B30Double / 1000) * ((B33Double - B34Double) / 1000) * B7Double) / (Math.PI * Math.pow((B8Double - 2 * B9Double) / 1000, 4)) + (16 * ((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) * B7Double) / (3 * ((B8Double - 2 * B9Double) / 1000)) : 0;
                    double AK8 = W8 == 0 ? (AI8 * 8 * Math.pow(B30Double / 1000, 2) * (B32Double * 1000) * B7Double) / (Math.pow(Math.PI, 2) * Math.pow((B8Double - 2 * B9Double) / 1000, 5)) : 0;
                    double AM7 = AK7 * (B4Double * 3.2808);
                    double W5 = B30Double <= (T5 * 1000) ? (128 * (B30Double / 1000) * ((B33Double - B34Double) / 1000) * B4Double) / (Math.PI * Math.pow((B5Double - 2 * B6Double) / 1000, 4)) + (16 * (((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479)) * B4Double) / (3 * ((B5Double - 2 * B6Double) / 1000)) : 0;
                    double AK5 = W5 == 0 ? (AI5 * 8 * Math.pow(B30Double / 1000, 2) * (B32Double * 1000) * B4Double) / Math.pow(Math.PI, 2) * Math.pow(((B5Double - 2 * B6Double) / 1000), 5) : 0;
                    double AO19 = AM19 * 6894.76;
                    double AN17 = AK17 == 0 ? W17 : AK17;
                    double AO16 = AM16 * 6894.76;
                    double AN14 = AK14 == 0 ? W14 : AK14;
                    double AO13 = AM13 * 6894.76;
                    double AN11 = AK11 == 0 ? W11 : AK11;
                    double AO10 = AM10 * 6894.76;
                    double AN8 = AK8 == 0 ? W8: AK8;
                    double AO7 = AM7 * 6894.76;
                    double AN5 = AK5 == 0 ? W5 : AK5;
                    double AS18 = (B16Double > 0 && B30Double > 0) ? (AN17 + AO19) / 2 : 0;
                    double AS15 = (B13Double > 0 && B30Double > 0) ? (AN14 + AO16) / 2 : 0;
                    double AS12 = (B10Double > 0 && B30Double > 0) ? (AN11 + AO13) / 2 : 0;
                    double AS9 = (B7Double > 0 && B30Double > 0) ? (AN8 + AO10) / 2 : 0;
                    double AS6 = (B4Double > 0 && B30Double > 0) ? (AN5 + AO7) / 2 : 0;
                    double AS21 = AS6 + AS9 + AS12 + AS15 + AS18;
                    double T45 = 5.11 * B34Double / Math.pow(511, R45);
                    double T41 = 5.11 * B34Double / Math.pow(511, R41);
                    double T37 = 5.11 * B34Double / Math.pow(511, R37);
                    double T33 = 5.11 * B34Double / Math.pow(511, R33);
                    double T29 = 5.11 * B34Double / Math.pow(511, R29);
                    double T25 = 5.11 * B34Double / Math.pow(511, R25);
                    double T26 = 5.11 * B34Double / Math.pow(511, R26);
                    double V45 = 100 * T45 * Math.pow(((144 * P45) / ((B3Double * 0.03937) - (B20Double * 0.03937))), (R45 - 1));
                    double V41 = 100 * T41 * Math.pow(((144 * P41) / ((B3Double * 0.03937) - (B17Double * 0.03937))), (R41 - 1));
                    double V37 = 100 * T37 * Math.pow(((144 * P37) / ((B3Double * 0.03937) - (B14Double * 0.03937))), (R37 - 1));
                    double V33 = 100 * T33 * Math.pow(((144 * P33) / ((B3Double * 0.03937) - (B11Double * 0.03937))), (R33 - 1));
                    double V29 = 100 * T29 * Math.pow(((144 * P29) / ((B3Double * 0.03937) - (B8Double * 0.03937))), (R29 - 1));
                    double V25 = 100 * T25 * Math.pow((144 * P25) / ((B3Double * 0.03937) - (B5Double * 0.03937)), (R25 - 1));
                    double V26 = 100 * T26 * Math.pow((144 * P26) / ((B23Double * 0.03937) - (B5Double * 0.03937)), (R26 - 1));
                    double AI45 = (1.75 - Math.log10(R45)) / 7;
                    double AG45 = (Math.log10(R45) + 3.93) / 50;
                    double AB45 = 4270 - 1370 * R45;
                    double Z45 = 3470 - 1370 * R45;
                    double X45 = 928 * P45 * ((B3Double * 0.03937) - (B20Double * 0.03937)) * (B32Double / (0.12 * 0.999)) / (V45 * Math.pow((2 * R45 + 1) / (3 * R45), R45));
                    double AI41 = (1.75 - Math.log10(R41)) / 7;
                    double AG41 = (Math.log10(R41) + 3.93) / 50;
                    double AB41 = 4270 - 1370 * R41;
                    double Z41 = 3470 - 1370 * R41;
                    double X41 = 928 * P41 * ((B3Double * 0.03937) - (B17Double * 0.03937)) * (B32Double / (0.12 * 0.999)) / (V41 * Math.pow((2 * R41 + 1) / (3 * R41), R41));
                    double AI37 = (1.75 - Math.log10(R37)) / 7;
                    double AG37 = (Math.log10(R37) + 3.93) / 50;
                    double AB37 = 4270 - 1370 * R37;
                    double Z37 = 3470 - 1370 * R37;
                    double X37 = 928 * P37 * ((B3Double * 0.03937) - (B14Double * 0.03937)) * (B32Double / (0.12 * 0.999)) / (V37 * Math.pow((2 * R37 + 1) / (3 * R37), R37));
                    double AI33 = (1.75 - Math.log10(R33)) / 7;
                    double AG33 = (Math.log10(R33) + 3.93) / 50;
                    double AB33 = 4270 - 1370 * R33;
                    double Z33 = 3470 - 1370 * R33;
                    double X33 = 928 * P33 * ((B3Double * 0.03937) - (B11Double * 0.03937)) * (B32Double / (0.12 * 0.999)) / (V33 * Math.pow((2 * R33 + 1) / (3 * R33), R33));
                    double AI29 = (1.75 - Math.log10(R29)) / 7;
                    double AG29 = (Math.log10(R29) + 3.93) / 50;
                    double AB29 = 4270 - 1370 * R29;
                    double Z29 = 3470 - 1370 * R29;
                    double X29 = 928 * P29 * ((B3Double * 0.03937) - (B8Double * 0.03937)) * (B32Double / (0.12 * 0.999)) / (V29 * Math.pow((2 * R29 + 1) / (3 * R29), R29));
                    double AN23 = ((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) * (B3Double / 1000 - B5Double / 1000) / (AE23 * ((B33Double - B34Double) / 1000));
                    double AJ23 = AE23 * (B3Double / 1000 - B5Double / 1000) * (B32Double * 1000) / ((B33Double - B34Double) / 1000);
                    double AI25 = (1.75 - Math.log10(R25)) / 7;
                    double AG25 = (Math.log10(R25) + 3.93) / 50;
                    double AB25 = 4270 - 1370 * R25;
                    double Z25 = 3470 - 1370 * R25;
                    double X25 = 928 * P25 * ((B3Double * 0.03937) - (B5Double * 0.03937)) * (B32Double / (0.12 * 0.999)) / (V25 * Math.pow((2 * R25 + 1) / (3 * R25), R25));
                    double AI26 = (1.75 - Math.log10(R26)) / 7;
                    double AG26 = (Math.log10(R26) + 3.93) / 50;
                    double AB26 = 4270 - 1370 * R26;
                    double Z26 = 3470 - 1370 * R26;
                    double X26 = 928 * P26 * ((B23Double * 0.03937) - (B5Double * 0.03937)) * (B32Double / (0.12 * 0.999)) / (V26 * Math.pow((2 * R26 + 1) / (3 * R26), R26));
                    double AL23 = ((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) * (B23Double / 1000 - B5Double / 1000) / (AB23 * ((B33Double - B34Double) / 1000));
                    double AH23 = AB23 * (B23Double / 1000 - B5Double / 1000) * (B32Double * 1000) / ((B33Double - B34Double) / 1000);
                    double M24 = (Math.pow(2 * R3 + 1, 2) / R3) * Math.pow((1 / (2 + R3)), ((R3 + 2) / (R3 + 1)));
                    double AK45 = X45 <= Z45 ? 24 / X45 : X45 > AB45 ? 1.5 * AG45 / Math.pow(X45, AI45) : ((X45 - (3470 - 1370 * R45)) / 800) * ((AG45 / Math.pow((4270 - 1370 * R45), AI45)) - (16 / (3470 - 1370 * R45))) + 24 / (3470 - 1370 * R45);
                    double N46 = (Math.pow(2 * R3 + 1, 2) / R3) * Math.pow((1 / (2 + R3)), ((R3 + 2) / (R3 + 1)));
                    double AA44 = ((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) * (B3Double / 1000 - B20Double / 1000) / (V44 * ((B33Double - B34Double) / 1000));
                    double Y44 = V44 * (B3Double / 1000 - B20Double / 1000) * (B32Double * 1000) / ((B33Double - B34Double) / 1000);
                    double AK41 = X41 <= Z41 ? 24 / X41 : X41 > AB41 ? 1.5 * AG41 / Math.pow(X41, AI41) : ((X41 - (3470 - 1370 * R41)) / 800) * ((AG41 / Math.pow((4270 - 1370 * R41), AI41)) - (16 / (3470 - 1370 * R41))) + 24 / (3470 - 1370 * R41);
                    double N42 = (Math.pow(2 * R3 + 1, 2) / R3) * Math.pow((1 / (2 + R3)), ((R3 + 2) / (R3 + 1)));
                    double AA40 = ((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) * (B3Double / 1000 - B17Double / 1000) / (V40 * ((B33Double - B34Double) / 1000));
                    double Y40 = V40 * (B3Double / 1000 - B17Double / 1000) * (B32Double * 1000) / ((B33Double - B34Double) / 1000);
                    double AK37 = X37 <= Z37 ? 24 / X37 : X37 > AB37 ? 1.5 * AG37 / Math.pow(X37, AI37) : ((X37 - (3470 - 1370 * R37)) / 800) * ((AG37 / Math.pow((4270 - 1370 * R37), AI37)) - (16 / (3470 - 1370 * R37))) + 24 / (3470 - 1370 * R37);
                    double N38 = (Math.pow(2 * R3 + 1, 2) / R3) * Math.pow((1 / (2 + R3)), ((R3 + 2) / (R3 + 1)));
                    double AA36 = ((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) * (B3Double / 1000 - B14Double / 1000) / (V36 * ((B33Double - B34Double) / 1000));
                    double Y36 = V36 * (B3Double / 1000 - B14Double / 1000) * (B32Double * 1000) / ((B33Double - B34Double) / 1000);
                    double AK33 = X33 <= Z33 ? 24 / X33 : X33 > AB33 ? 1.5 * AG33 / Math.pow(X33, AI33) : ((X33 - (3470 - 1370 * R33)) / 800) * ((AG33 / Math.pow((4270 - 1370 * R33), AI33)) - (16 / (3470 - 1370 * R33))) + 24 / (3470 - 1370 * R33);
                    double N34 = (Math.pow(2 * R3 + 1, 2) / R3) * Math.pow((1 / (2 + R3)), ((R3 + 2) / (R3 + 1)));
                    double AA32 = ((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) * (B3Double / 1000 - B11Double / 1000) / (V32 * ((B33Double - B34Double) / 1000));
                    double Y32 = V32 * (B3Double / 1000 - B11Double / 1000) * (B32Double * 1000) / ((B33Double - B34Double) / 1000);
                    double AK29 = X29 <= Z29 ? 24 / X29 : X29 > AB29 ? 1.5 * AG29 / Math.pow(X29, AI29) : ((X29 - (3470 - 1370 * R29)) / 800) * ((AG29 / Math.pow((4270 - 1370 * R29), AI29)) - (16 / (3470 - 1370 * R29))) + 24 / (3470 - 1370 * R29);
                    double AA28 = ((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) * (B3Double / 1000 - B8Double / 1000) / (V28 * ((B33Double - B34Double) / 1000));
                    double Y28 = V28 * (B3Double / 1000 - B8Double / 1000) * (B32Double * 1000) / ((B33Double - B34Double) / 1000);
                    double N30 = (Math.pow(2 * R3 + 1, 2) / R3) * Math.pow((1 / (2 + R3)), ((R3 + 2) / (R3 + 1)));
                    double AR23 = AJ23 / (1 + (AN23 / 6));
                    double AK24 = Math.pow(12, (1 - R3)) * Math.pow(3 * R3 / (2 * R3 + 1), R3) * Math.pow(AF24, (2 - R3)) * Math.pow(B3Double / 1000 - B5Double / 1000, R3) * (B32Double * 1000) / T3;
                    double AK25 = X25 <= Z25 ? 24 / X25 : X25 > AB25 ? 1.5 * AG25 / Math.pow(X25, AI25) : ((X25 - (3470 - 1370 * R25)) / 800) * ((AG25 / Math.pow((4270 - 1370 * R25), AI25)) - (16 / (3470 - 1370 * R25))) + 24 / (3470 - 1370 * R25);
                    double AK26 = X26 <= Z26 ? 24 / X26 : X26 > AB26 ? 1.5 * AG26 / Math.pow(X26, AI26) : ((X26 - (3470 - 1370 * R26)) / 800) * ((AG26 / Math.pow((4270 - 1370 * R26), AI26)) - (16 / (3470 - 1370 * R26))) + 24 / (3470 - 1370 * R26);
                    double AP23 = AH23 / (1 + (AL23 / 6));
                    double M23 = (B4Double > 0 && B30Double > 0) ? 25 * Math.pow(((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) / (B32Double * 1000), 0.5) : 0;
                    double AI24 = Math.pow(12, (1 - R3)) * Math.pow(3 * R3 / (2 * R3 + 1), R3) * Math.pow(AC24, (2 - R3)) * Math.pow(B23Double / 1000 - B5Double / 1000, R3) * (B32Double * 1000) / T3;
                    double O24 = 4848 / M24;
                    double AM45 = (AK45 * Math.pow(P45, 2) * (B32Double / (0.12 * 0.999))) / (25.81 * ((B3Double * 0.03937) - (B20Double * 0.03937)));
                    double AA46 = Math.pow(12, (1 - R3)) * Math.pow(3 * R3 / (2 * R3 + 1), R3) * Math.pow(X46, (2 - R3)) * Math.pow(B3Double / 1000 - B20Double / 1000, R3) * (B32Double * 1000) / T3;
                    double P46 = 4848 / N46;
                    double AC44 = Y44 / (1 + (AA44 / 6));
                    double AM41 = (AK41 * Math.pow(P41, 2) * (B32Double / (0.12 * 0.999))) / (25.81 * ((B3Double * 0.03937) - (B17Double * 0.03937)));
                    double AA42 = Math.pow(12, (1 - R3)) * Math.pow(3 * R3 / (2 * R3 + 1), R3) * Math.pow(X42, (2 - R3)) * Math.pow(B3Double / 1000 - B17Double / 1000, R3) * (B32Double * 1000) / T3;
                    double P42 = 4848 / N42;
                    double AC40 = Y40 / (1 + (AA40 / 6));
                    double AM37 = (AK37 * Math.pow(P37, 2) * (B32Double / (0.12 * 0.999))) / (25.81 * ((B3Double * 0.03937) - (B14Double * 0.03937)));
                    double AA38 = Math.pow(12, (1 - R3)) * Math.pow(3 * R3 / (2 * R3 + 1), R3) * Math.pow(X38, (2 - R3)) * Math.pow(B3Double / 1000 - B14Double / 1000, R3) * (B32Double * 1000) / T3;
                    double P38 = 4848 / N38;
                    double AC36 = Y36 / (1 + (AA36 / 6));
                    double AM33 = (AK33 * Math.pow(P33, 2) * (B32Double / (0.12 * 0.999))) / (25.81 * ((B3Double * 0.03937) - (B11Double * 0.03937)));
                    double AA34 = Math.pow(12, (1 - R3)) * Math.pow(3 * R3 / (2 * R3 + 1), R3) * Math.pow(X34, (2 - R3)) * Math.pow(B3Double / 1000 - B11Double / 1000, R3) * (B32Double * 1000) / T3;
                    double P34 = 4848 / N34;
                    double AC32 = Y32 / (1 + (AA32 / 6));
                    double AM29 = (AK29 * Math.pow(P29, 2) * (B32Double / (0.12 * 0.999))) / (25.81 * ((B3Double * 0.03937) - (B8Double * 0.03937)));
                    double AC28 = Y28 / (1 + (AA28 / 6));
                    double AA30 = Math.pow(12, (1 - R3)) * Math.pow(3 * R3 / (2 * R3 + 1), R3) * Math.pow(X30, (2 - R3)) * Math.pow(B3Double / 1000 - B8Double / 1000, R3) * (B32Double * 1000) / T3;
                    double P30 = 4848 / N30;
                    double AV23 = 0.09 / Math.pow((AR23), 0.125);
                    double AO24 = 0.09 / Math.pow((AK24), 0.125);
                    double AM25 = (AK25 * Math.pow(P25, 2) * (B32Double / (0.12 * 0.999))) / (25.81 * ((B3Double * 0.03937) - (B5Double * 0.03937)));
                    double AM26 = (AK26 * Math.pow(P26, 2) * (B32Double / (0.12 * 0.999))) / (25.81 * ((B23Double * 0.03937) - (B5Double * 0.03937)));
                    double AT23 = 0.09 / Math.pow((AP23), 0.125);
                    double S23 = M23 * Math.PI * (Math.pow(B3Double / 1000, 2) - Math.pow(B5Double / 1000, 2)) / 4;
                    double P23 = M23 * Math.PI * (Math.pow(B23Double / 1000, 2) - Math.pow(B5Double / 1000, 2)) / 4;
                    double AM24 = 0.09 / Math.pow((AI24), 0.125);
                    double T24 = (B4Double > 0 && B30Double > 0) ? (Math.PI * (Math.pow(B3Double / 1000, 2) - Math.pow(B5Double / 1000, 2)) / 4) * Math.pow(O24 * T3 * Math.pow((2 * R3 + 1) / R3, R3) / (Math.pow(12, (1 - R3)) * Math.pow(B3Double / 1000 - B5Double / 1000, R3) * (B32Double * 1000)), (1 / (2 - R3))) : 0;
                    double Q24 = (B4Double > 0 && B30Double > 0) ? (Math.PI * (Math.pow(B23Double / 1000, 2) - Math.pow(B5Double / 1000, 2)) / 4) * Math.pow(O24 * T3 * Math.pow((2 * R3 + 1) / R3, R3) / (Math.pow(12, (1 - R3)) * Math.pow(B23Double / 1000 - B5Double / 1000, R3) * (B32Double * 1000)), (1 / (2 - R3))) : 0;
                    double AO45 = AM45 * (B19Double * 3.2808);
                    double AC46 = 0.09 / Math.pow((AA46), 0.125);
                    double R46 = (B19Double > 0 && B30Double > 0) ? (Math.PI * (Math.pow(B3Double / 1000, 2) - Math.pow(B20Double / 1000, 2)) / 4) * Math.pow(P46 * T3 * Math.pow((2 * R3 + 1) / R3, R3) / (Math.pow(12, (1 - R3)) * Math.pow(B3Double / 1000 - B20Double / 1000, R3) * (B32Double * 1000)), (1 / (2 - R3))) : 0;
                    double AE44 = 0.09 / Math.pow((AC44), 0.125);
                    double P44 = M44 * Math.PI * (Math.pow(B3Double / 1000, 2) - Math.pow(B20Double / 1000, 2)) / 4;
                    double AO41 = AM41 * (B16Double * 3.2808);
                    double AC42 = 0.09 / Math.pow((AA42), 0.125);
                    double R42 = (B16Double > 0 && B30Double > 0) ? (Math.PI * (Math.pow(B3Double / 1000, 2) - Math.pow(B17Double / 1000, 2)) / 4) * Math.pow(P42 * T3 * Math.pow((2 * R3 + 1) / R3, R3) / (Math.pow(12, (1 - R3)) * Math.pow(B3Double / 1000 - B17Double / 1000, R3) * (B32Double * 1000)), (1 / (2 - R3))) : 0;
                    double AE40 = 0.09 / Math.pow((AC40), 0.125);
                    double P40 = M40 * Math.PI * (Math.pow(B3Double / 1000, 2) - Math.pow(B17Double / 1000, 2)) / 4;
                    double AO37 = AM37 * (B13Double * 3.2808);
                    double AC38 = 0.09 / Math.pow((AA38), 0.125);
                    double R38 = (B13Double > 0 && B30Double > 0) ? (Math.PI * (Math.pow(B3Double / 1000, 2) - Math.pow(B14Double / 1000, 2)) / 4) * Math.pow(P38 * T3 * Math.pow((2 * R3 + 1) / R3, R3) / (Math.pow(12, (1 - R3)) * Math.pow(B3Double / 1000 - B14Double / 1000, R3) * (B32Double * 1000)), (1 / (2 - R3))) : 0;
                    double AE36 = 0.09 / Math.pow((AC36), 0.125);
                    double P36 = M36 * Math.PI * (Math.pow(B3Double / 1000, 2) - Math.pow(B14Double / 1000, 2)) / 4;
                    double AO33 = AM33 * (B10Double * 3.2808);
                    double AC34 = 0.09 / Math.pow((AA34), 0.125);
                    double R34 = (B10Double > 0 && B30Double > 0) ? (Math.PI * (Math.pow(B3Double / 1000, 2) - Math.pow(B11Double / 1000, 2)) / 4) * Math.pow(P34 * T3 * Math.pow((2 * R3 + 1) / R3, R3) / (Math.pow(12, (1 - R3)) * Math.pow(B3Double / 1000 - B11Double / 1000, R3) * (B32Double * 1000)), (1 / (2 - R3))) : 0;
                    double AE32 = 0.09 / Math.pow((AC32), 0.125);
                    double P32 = M32 * Math.PI * (Math.pow(B3Double / 1000, 2) - Math.pow(B11Double / 1000, 2)) / 4;
                    double AO29 = AM29 * (B7Double * 3.2808);
                    double AE28 = 0.09 / Math.pow((AC28), 0.125);
                    double P28 = M28 * Math.PI * (Math.pow(B3Double / 1000, 2) - Math.pow(B8Double / 1000, 2)) / 4;
                    double AC30 = 0.09 / Math.pow((AA30), 0.125);
                    double R30 = (B7Double > 0 && B30Double > 0) ? (Math.PI * (Math.pow(B3Double / 1000, 2) - Math.pow(B8Double / 1000, 2)) / 4) * Math.pow(P30 * T3 * Math.pow((2 * R3 + 1) / R3, R3) / (Math.pow(12, (1 - R3)) * Math.pow(B3Double / 1000 - B8Double / 1000, R3) * (B32Double * 1000)), (1 / (2 - R3))) : 0;
                    double AS26 = (B4Double * 3.2808) <= (B22Double * 3.2808) ? AM26 * (B4Double * 3.2808) : AM26 * (B22Double * 3.2808) + AM25 * ((B4Double * 3.2808) - (B22Double * 3.2808));
                    double BA23 = B30Double / 1000 > S23 ? B22Double < B4Double ? AT23 * 8 * Math.pow(B30Double / 1000, 2) * (B32Double * 1000) * B22Double / (Math.pow(Math.PI, 2) * Math.pow(B23Double / 1000 - B5Double / 1000, 3) * Math.pow(B23Double / 1000 + B5Double / 1000, 2)) + AV23 * 8 * Math.pow(B30Double / 1000, 2) * (B32Double * 1000) * (B4Double - B22Double) / (Math.pow(Math.PI, 2) * Math.pow(B3Double / 1000 - B5Double / 1000, 3) * Math.pow(B3Double / 1000 + B5Double / 1000, 2)) : 0 : 0;
                    double AX23 = B30Double / 1000 > P23 ? B4Double <= B22Double ? AT23 * 8 * Math.pow(B30Double / 1000, 2) * (B32Double * 1000) * B4Double / (Math.pow(Math.PI, 2) * Math.pow(B23Double / 1000 - B5Double / 1000, 3) * Math.pow(B23Double / 1000 + B5Double / 1000, 2)) : 0 : 0;
                    double Y23 = B30Double / 1000 <= S23 ? B22Double < B4Double ? 128 * (B30Double / 1000) * ((B33Double - B34Double) / 1000) * B22Double / (Math.PI * Math.pow(B23Double / 1000 - B5Double / 1000, 3) * (B23Double / 1000 + B5Double / 1000)) + 16 * ((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) * B22Double / (3 * (B23Double / 1000 - B5Double / 1000)) + 128 * (B30Double / 1000) * ((B33Double - B34Double) / 1000) * (B4Double - B22Double) / (Math.PI * Math.pow(B3Double / 1000 - B5Double / 1000, 3) * (B3Double / 1000 + B5Double / 1000)) + 16 * ((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) * (B4Double - B22Double) / (3 * (B3Double / 1000 - B5Double / 1000)) : 0 : 0;
                    double V23 = B30Double / 1000 <= P23 ? B4Double <= B22Double ? 128 * (B30Double / 1000) * ((B33Double - B34Double) / 1000) * B4Double / (Math.PI * Math.pow(B23Double / 1000 - B5Double / 1000, 3) * (B23Double / 1000 + B5Double / 1000)) + 16 * ((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) * B4Double / (3 * (B23Double / 1000 - B5Double / 1000)) : 0 : 0;
                    double AU24 = B30Double / 1000 > T24 ? B4Double > B22Double ? AM24 * B22Double * Math.pow(AC24, 2) * (B32Double * 1000) / (2 * (B23Double / 1000 - B5Double / 1000)) + AO24 * (B4Double - B22Double) * Math.pow(AF24, 2) * (B32Double * 1000) / (2 * (B3Double / 1000 - B5Double / 1000)) : 0 : 0;
                    double AR24 = B30Double / 1000 > Q24 ? B4Double <= B22Double ? AM24 * B4Double * Math.pow(AC24, 2) * (B32Double * 1000) / (2 * (B23Double / 1000 - B5Double / 1000)) : 0 : 0;
                    double Z24 = B30Double / 1000 <= T24 ? B22Double < B4Double ? Math.pow(2, (2 + 4 * R3)) * T3 * Math.pow((2 * R3 + 1) * (B30Double / 1000) / (R3 * Math.PI * (B23Double / 1000 + B5Double / 1000)), R3) * B22Double / Math.pow((B23Double / 1000 - B5Double / 1000), (2 * R3 + 1)) + Math.pow(2, (2 + 4 * R3)) * T3 * Math.pow((2 * R3 + 1) * (B30Double / 1000) / (R3 * Math.PI * (B3Double / 1000 + B5Double / 1000)), R3) * (B4Double - B22Double) / Math.pow((B3Double / 1000 - B5Double / 1000), (2 * R3 + 1)) : 0 : 0;
                    double W24 = B30Double / 1000 <= Q24 ? B4Double <= B22Double ? Math.pow(2, (2 + 4 * R3)) * T3 * Math.pow((2 * R3 + 1) * (B30Double / 1000) / (R3 * Math.PI * (B23Double / 1000 + B5Double / 1000)), R3) * B4Double / Math.pow((B23Double / 1000 - B5Double / 1000), (2 * R3 + 1)) : 0 : 0;
                    double AQ45 = AO45 * 6894.76;
                    double AE46 = B30Double / 1000 > R46 ? AC46 * B19Double * Math.pow(X46, 2) * (B32Double * 1000) / (2 * (B3Double / 1000 - B20Double / 1000)) : 0;
                    double U46 = B30Double / 1000 <= R46 ? Math.pow(2, (2 + 4 * R3)) * T3 * Math.pow((2 * R3 + 1) * (B30Double / 1000) / (R3 * Math.PI * (B3Double / 1000 + B20Double / 1000)), R3) * B19Double / Math.pow((B3Double / 1000 - B20Double / 1000), (2 * R3 + 1)) : 0;
                    double AG44 = B30Double / 1000 > P44 ? AE44 * 8 * Math.pow(B30Double / 1000, 2) * (B32Double * 1000) * B19Double / (Math.pow(Math.PI, 2) * Math.pow(B3Double / 1000 - B20Double / 1000, 3) * Math.pow(B3Double / 1000 + B20Double / 1000, 2)) : 0;
                    double S44 = B30Double / 1000 <= P44 ? 128 * (B30Double / 1000) * ((B33Double - B34Double) / 1000) * B19Double / (Math.PI * Math.pow(B3Double / 1000 - B20Double / 1000, 3) * (B3Double / 1000 + B20Double / 1000)) + 16 * ((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) * B19Double / (3 * (B3Double / 1000 - B20Double / 1000)) : 0;
                    double AQ41 = AO41 * 6894.76;
                    double AE42 = B30Double / 1000 > R42 ? AC42 * B16Double * Math.pow(X42, 2) * (B32Double * 1000) / (2 * (B3Double / 1000 - B17Double / 1000)) : 0;
                    double U42 = B30Double / 1000 <= R42 ? Math.pow(2, (2 + 4 * R3)) * T3 * Math.pow((2 * R3 + 1) * (B30Double / 1000) / (R3 * Math.PI * (B3Double / 1000 + B17Double / 1000)), R3) * B16Double / Math.pow((B3Double / 1000 - B17Double / 1000), (2 * R3 + 1)) : 0;
                    double AG40 = B30Double / 1000 > P40 ? AE40 * 8 * Math.pow(B30Double / 1000, 2) * (B32Double * 1000) * B16Double / (Math.pow(Math.PI, 2) * Math.pow(B3Double / 1000 - B17Double / 1000, 3) * Math.pow(B3Double / 1000 + B17Double / 1000, 2)) : 0;
                    double S40 = B30Double / 1000 <= P40 ? 128 * (B30Double / 1000) * ((B33Double - B34Double) / 1000) * B16Double / (Math.PI * Math.pow(B3Double / 1000 - B17Double / 1000, 3) * (B3Double / 1000 + B17Double / 1000)) + 16 * ((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) * B16Double / (3 * (B3Double / 1000 - B17Double / 1000)) : 0;
                    double AQ37 = AO37 * 6894.76;
                    double AE38 = B30Double / 1000 > R38 ? AC38 * B13Double * Math.pow(X38, 2) * (B32Double * 1000) / (2 * (B3Double / 1000 - B14Double / 1000)) : 0;
                    double U38 = B30Double / 1000 <= R38 ? Math.pow(2, (2 + 4 * R3)) * T3 * Math.pow((2 * R3 + 1) * (B30Double / 1000) / (R3 * Math.PI * (B3Double / 1000 + B14Double / 1000)), R3) * B13Double / Math.pow((B3Double / 1000 - B14Double / 1000), (2 * R3 + 1)) : 0;
                    double AG36 = B30Double / 1000 > P36 ? AE36 * 8 * Math.pow(B30Double / 1000, 2) * (B32Double * 1000) * B13Double / (Math.pow(Math.PI, 2) * Math.pow(B3Double / 1000 - B14Double / 1000, 3) * Math.pow(B3Double / 1000 + B14Double / 1000, 2)) : 0;
                    double S36 = B30Double / 1000 <= P36 ? 128 * (B30Double / 1000) * ((B33Double - B34Double) / 1000) * B13Double / (Math.PI * Math.pow(B3Double / 1000 - B14Double / 1000, 3) * (B3Double / 1000 + B14Double / 1000)) + 16 * ((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) * B13Double / (3 * (B3Double / 1000 - B14Double / 1000)) : 0;
                    double AQ33 = AO33 * 6894.76;
                    double AE34 = B30Double / 1000 > R34 ? AC34 * B10Double * Math.pow(X34, 2) * (B32Double * 1000) / (2 * (B3Double / 1000 - B11Double / 1000)) : 0;
                    double U34 = B30Double / 1000 <= R34 ? Math.pow(2, (2 + 4 * R3)) * T3 * Math.pow((2 * R3 + 1) * (B30Double / 1000) / (R3 * Math.PI * (B3Double / 1000 + B11Double / 1000)), R3) * B10Double / Math.pow((B3Double / 1000 - B11Double / 1000), (2 * R3 + 1)) : 0;
                    double AG32 = B30Double / 1000 > P32 ? AE32 * 8 * Math.pow(B30Double / 1000, 2) * (B32Double * 1000) * B10Double / (Math.pow(Math.PI, 2) * Math.pow(B3Double / 1000 - B11Double / 1000, 3) * Math.pow(B3Double / 1000 + B11Double / 1000, 2)) : 0;
                    double S32 = B30Double / 1000 <= P32 ? 128 * (B30Double / 1000) * ((B33Double - B34Double) / 1000) * B10Double / (Math.PI * Math.pow(B3Double / 1000 - B11Double / 1000, 3) * (B3Double / 1000 + B11Double / 1000)) + 16 * ((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) * B10Double / (3 * (B3Double / 1000 - B11Double / 1000)) : 0;
                    double AQ29 = AO29 * 6894.76;
                    double AG28 = B30Double / 1000 > P28 ? AE28 * 8 * Math.pow(B30Double / 1000, 2) * (B32Double * 1000) * B7Double / (Math.pow(Math.PI, 2) * Math.pow(B3Double / 1000 - B8Double / 1000, 3) * Math.pow(B3Double / 1000 + B8Double / 1000, 2)) : 0;
                    double S28 = B30Double / 1000 <= P28 ? 128 * (B30Double / 1000) * ((B33Double - B34Double) / 1000) * B7Double / (Math.PI * Math.pow(B3Double / 1000 - B8Double / 1000, 3) * (B3Double / 1000 + B8Double / 1000)) + 16 * ((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) * B7Double / (3 * (B3Double / 1000 - B8Double / 1000)) : 0;
                    double AE30 = B30Double / 1000 > R30 ? AC30 * B7Double * Math.pow(X30, 2) * (B32Double * 1000) / (2 * (B3Double / 1000 - B8Double / 1000)) : 0;
                    double U30 = B30Double / 1000 <= R30 ? Math.pow(2, (2 + 4 * R3)) * T3 * Math.pow((2 * R3 + 1) * (B30Double / 1000) / (R3 * Math.PI * (B3Double / 1000 + B8Double / 1000)), R3) * B7Double / Math.pow((B3Double / 1000 - B8Double / 1000), (2 * R3 + 1)) :0;
                    double AU26 = AS26 * 6894.76;
                    double BD23 = V23 + Y23 + AX23 + BA23;
                    double BD24 = W24 + Z24 + AR24 + AU24;
                    double BD44 = (B19Double > 0 && B30Double > 0) ? ((S44 + AG44) + (U46 + AE46) + AQ45) / 3 : 0;
                    double BD40 = (B16Double > 0 && B30Double > 0) ? ((S40 + AG40) + (U42 + AE42) + AQ41) / 3 : 0;
                    double BD36 = (B13Double > 0 && B30Double > 0) ? ((S36 + AG36) + (U38 + AE38) + AQ37) / 3 : 0;
                    double BD32 = (B10Double > 0 && B30Double > 0) ? ((S32 + AG32) + (U34 + AE34) + AQ33) / 3 : 0;
                    double BD28 = (B7Double > 0 && B30Double > 0) ? ((U30 + AE30) + (S28 + AG28) + AQ29) / 3 : 0;
                    double BD25 = (B4Double > 0 && B30Double > 0) ? (BD24 + BD23 + AU26) / 3 : 0;
                    double BD47 = BD25 + BD28 + BD32 + BD36 + BD40 + BD44;
                    double T20 = P20 + N20 + R20;
                    double W20 = (B25Double == 0 && B27Double == 0 && B29Double == 0 ) ? 0 : Math.pow(B30Double / 1000, 2) * (B32Double * 1000) / (2 * Math.pow(0.95, 2) * Math.pow(T20, 2));
                    double Q21 = (B30Double / 1000) * ((R3 > 1 || N3 > 1) ? 0 : AS21 + BD47 + N21 + O22 + W20);
                    double AC20 = (B30Double / 1000) * W20;
                    double M51 = 0.6 * ((R3 > 1 || N3 > 1) ? 0 : AS21 + BD47 + N21 + O22 + W20) - W20;
                    double Z20 = (B25Double == 0 && B27Double == 0 && B29Double == 0) ? 0 : (B30Double / 1000) / T20;
                    double AF20 = (B32Double * 1000) * (B30Double / 1000) * Z20;
                    double AS7 = (B4Double > 0 && B30Double > 0) ? AK5 == 0 ? 1 : 2 : 0;
                    double AS10 = (B7Double > 0 && B30Double > 0) ? AK8 == 0 ? 1 : 2 : 0;
                    double M12 = (Math.pow(1 + 3 * N3, 2) / N3) * Math.pow((1 / (2 + N3)), ((N3 + 2) / (N3 + 1)));
                    double Z12 = Math.pow(8, (1 - N3)) * Math.pow(4 * N3 / (3 * N3 + 1), N3) * ((Math.pow(W12, (2 - N3)) * Math.pow((B11Double - 2 * B12Double) / 1000, N3) * (B32Double * 1000)) / P3);
                    double O12 = 6464 / M12;
                    double Q12 = Math.PI * Math.pow(((O12 * Math.pow((B11Double - 2 * B12Double) / 1000, (4 - 3 * N3)) * P3 * Math.pow((3 * N3 + 1) / N3, N3)) / (Math.pow(2, (7 - 3 * N3)) * (B32Double * 1000))), (1 / (2 - N3)));
                    double AB12 = 0.3164 / (Math.pow(Z12, 0.25));
                    double T12 = B30Double <= (Q12 * 1000) ? (4 * P3 * B10Double / ((B11Double - 2 * B12Double) / 1000)) * Math.pow(8 * ((3 * N3 + 1) / N3) * ((B30Double / 1000) / (Math.PI * Math.pow((B11Double - 2 * B12Double) / 1000, 3))), N3) : 0;
                    double AD12 = T12 == 0 ? (AB12 * B10Double * Math.pow(W12, 2) * (B32Double * 1000)) / (2 * ((B11Double - 2 * B12Double) / 1000)) : 0;
                    double AS13 = (B10Double > 0 && B30Double > 0) ? AD12 == 0 ? 1 : 2 : 0;
                    double M15 = (Math.pow(1 + 3 * N3, 2) / N3) * Math.pow((1 / (2 + N3)), ((N3 + 2) / (N3 + 1)));
                    double O15 = 6464 / M15;
                    double Z15 = Math.pow(8, (1 - N3)) * Math.pow(4 * N3 / (3 * N3 + 1), N3) * ((Math.pow(W15, (2 - N3)) * Math.pow((B14Double - 2 * B15Double)/1000, N3) * (B32Double * 1000)) / P3);
                    double Q15 = Math.PI * Math.pow(((O15 * Math.pow(((B14Double - 2 * B15Double) / 1000), (4 - 3 * N3)) * P3 * Math.pow((3 * N3 + 1) / N3, N3)) / (Math.pow(2, (7 - 3 * N3)) * (B32Double * 1000))), (1 / (2 - N3)));
                    double AB15 = 0.3164 / Math.pow(Z15, 0.25);
                    double T15 = B30Double <= (Q15 * 1000) ? (4 * P3 * B13Double / ((B14Double - 2 * B15Double) / 1000)) * Math.pow(8 * ((3 * N3 + 1) / N3) * ((B30Double / 1000) / (Math.PI * Math.pow((B14Double - 2 * B15Double) / 1000, 3))), N3) : 0;
                    double AD15 = T15 == 0 ? (AB15 * B13Double * Math.pow(W15, 2) * (B32Double * 1000)) / (2 * ((B14Double - 2 * B15Double) / 1000)) : 0;
                    double AS16 = (B13Double > 0 && B30Double > 0) ? AD15 == 0 ? 1 : 2 : 0;
                    double M18 = (Math.pow(1 + 3 * N3, 2) / N3) * Math.pow((1 / (2 + N3)), ((N3 + 2) / (N3 + 1)));
                    double Z18 = Math.pow(8, (1 - N3)) * Math.pow(4 * N3 / (3 * N3 + 1), N3) * ((Math.pow(W18, (2 - N3)) * Math.pow((B17Double - 2 * B18Double) / 1000, N3) * (B32Double * 1000)) / P3);
                    double O18 = 6464 / M18;
                    double AB18 = 0.3164 / Math.pow(Z18, 0.25);
                    double Q18 = Math.PI * Math.pow(((O18 * Math.pow(((B17Double - 2 * B18Double) / 1000), (4 - 3 * N3)) * P3 * Math.pow((3 * N3 + 1) / N3, N3)) / (Math.pow(2, (7 - 3 * N3)) * (B32Double * 1000))), (1 / (2 - N3)));
                    double T18 = B30Double <= (Q18 * 1000) ? (4 * P3 * B16Double / ((B17Double - 2 * B18Double) / 1000)) * Math.pow(8 * ((3 * N3 + 1) / N3) * ((B30Double / 1000) / (Math.PI * Math.pow((B17Double - 2 * B18Double) / 1000, 3))), N3) : 0;
                    double AD18 = T18 == 0 ? (AB18 * B16Double * Math.pow(W18, 2) * (B32Double * 1000)) / (2 * ((B17Double - 2 * B18Double) / 1000)) : 0;
                    double AS19 = (B16Double > 0 && B30Double > 0) ? AD18 == 0 ? 1 : 2 : 0;
                    double BC26 = (B4Double > 0 && B30Double > 0) ? B30Double <= (((Z24 + AU24 == 0) ? Q24 * 1000 : T24 * 1000) / 1.57) ? 1 : 2 : 0;
                    double BC29 = (B7Double > 0 && B30Double > 0) ? B30Double / 1000 <= R30 ? 1 : 2 : 0;
                    double BC33 = (B10Double > 0 && B30Double > 0) ? B30Double / 1000 <= R34 ? 1 : 2 : 0;
                    double AO20 = 4 * Math.pow((B37Double / 1000) * ((B38Double * 1000) - (B32Double * 1000)) / (B32Double * 1000), 0.5);
                    double AM20 = ((B33Double - B34Double) / 1000) * (AI20 - 6 * AK20) / ((B37Double / 1000) * (B32Double * 1000) * (18 + 0.61 * Math.pow(AI20, 0.5)));
                    double AQ20 = ((BC26 == 1 || BC26 == 0) && (BC29 == 1 || BC29 == 0) && (BC33 == 1 || BC33 == 0)) ? AM20 : AO20;
                    double M49 = Math.max(Math.max((((Z24 + AU24 == 0) ? Q24 * 1000 : T24 * 1000) / 1.57), ((R30 * 1000) / 1.57)), ((R34 * 1000) / 1.57));
                    double BC37 = (B13Double > 0 && B30Double > 0) ? B30Double / 1000 <= R38 ? 1 : 2 : 0;
                    double BC41 = (B16Double > 0 && B30Double > 0) ? B30Double / 1000 <= R42 ? 1 : 2 : 0;
                    double BC45 = (B19Double > 0 && B30Double > 0) ? B30Double / 1000 <= R46 ? 1 : 2 : 0;
                    double M50 = Math.sqrt(4 * T20 / Math.PI);
                    double O50 = 100000 * ((B33Double - B34Double) / 1000) / (M50 * (B32Double * 1000));
                    double R50 = O50 * T20;

                    double minM = 10000000;
                    double maxM = 0;
                    if (M25 != 0){
                        minM = minM > M25 ? M25 : minM;
                        maxM = maxM < M25 ? M25 : maxM;
                    }
                    if (M26 != 0){
                        minM = minM > M26 ? M26 : minM;
                        maxM = maxM < M26 ? M26 : maxM;
                    }
                    if (M29 != 0){
                        minM = minM > M29 ? M29 : minM;
                        maxM = maxM < M29 ? M29 : maxM;
                    }
                    if (M33 != 0){
                        minM = minM > M33 ? M33 : minM;
                        maxM = maxM < M33 ? M33 : maxM;
                    }
                    if (M37 != 0){
                        minM = minM > M37 ? M37 : minM;
                        maxM = maxM < M37 ? M37 : maxM;
                    }
                    if (M41 != 0){
                        minM = minM > M41 ? M41 : minM;
                        maxM = maxM < M41 ? M41 : maxM;
                    }
                    if (M45 != 0){
                        minM = minM > M45 ? M45 : minM;
                        maxM = maxM < M45 ? M45 : maxM;
                    }

                    G1.setText(String.valueOf(N3));
                    G2.setText(String.valueOf(P3));
                    G3.setText(String.valueOf(R3));
                    G4.setText(String.valueOf(T3));
                    G5.setText(String.valueOf((B33Double - B34Double) / 1000));
                    G6.setText(String.valueOf(B33Double / 2));
                    G7.setText(String.valueOf((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479));
                    G8.setText(String.valueOf(B13Double + B16Double + B19Double + B24Double));
                    G9.setText(String.valueOf(B4Double + B7Double + B10Double + B13Double + B16Double + B19Double + B24Double));
                    G10.setText(String.valueOf(N3 > 1 ? "n>1:Θ300?" : AS21));
                    G11.setText(String.valueOf(R3 > 1 ? "n>1:Θ6?" : BD47));
                    G12.setText(String.valueOf(O22 + 500000));
                    G13.setText(String.valueOf(W20));
                    G14.setText(String.valueOf((R3 > 1 || N3 > 1) ? "n>1:Θ300?" : AS21 + BD47 + N21 + O22 + W20));
                    G15.setText(String.valueOf((R3 > 1 || N3 > 1) ? "n>1" : B36Double > 0 ? (BD47 / (9.81 * B36Double) + B32Double * 1000) : "TVD- ?"));
                    G16.setText(String.valueOf(((Z24 + AU24 == 0) ? Q24 * 1000 : T24 * 1000) / 1.57));
                    G17.setText(String.valueOf((R30 * 1000) / 1.57));
                    G18.setText(String.valueOf((R34 * 1000) / 1.57));
                    G19.setText(String.valueOf((R38 * 1000) / 1.57));
                    G20.setText(String.valueOf((R42 * 1000) / 1.57));

                    G21.setText(String.valueOf(minM));
                    G22.setText(String.valueOf(maxM));
                    G23.setText(String.valueOf(B30Double > 0 ? Q21 : "Q-?"));
                    G24.setText(String.valueOf(B30Double > 0 ? T21 : "Q-?"));
                    G25.setText(String.valueOf(B30Double > 0 ? T21 * 100 / Q21 : "Q-?"));
                    G26.setText(String.valueOf(B30Double > 0 ? AC20 : "Q-?"));
                    G27.setText(String.valueOf(B30Double > 0 ? AC20 * 100 / Q21 : "Q-?"));
                    G28.setText(String.valueOf(B21Double == 0 ? 0 : M51 / 100000));
                    G29.setText(String.valueOf(Z20));
                    G30.setText(String.valueOf(AF20 / 9.81));
                    G31.setText(String.valueOf(AS7 == 0 ? "нет" : AS7 == 1 ? "ламинарный" : "Турб."));
                    G32.setText(String.valueOf(AS10 == 0 ? "нет" : AS10 == 1 ? "ламинарный" : "Турб."));
                    G33.setText(String.valueOf(AS13 == 0 ? "нет" : AS13 == 1 ? "ламинарный" : "Турб."));
                    G34.setText(String.valueOf(AS16 == 0 ? "нет" : AS16 == 1 ? "ламинарный" : "Турб."));
                    G35.setText(String.valueOf(AS19 == 0 ? "нет" : AS19 == 1 ? "ламинарный" : "Турб."));
                    G37.setText(String.valueOf(AQ20 < 0 ? 0 : AQ20));
                    G38.setText(String.valueOf((minM - (AQ20 < 0 ? 0 : AQ20)) > 0 ? minM - (AQ20 < 0 ? 0 : AQ20) : "↑ шлама невозможен"));
                    G39.setText(String.valueOf(B39String.equals("a < 50") ? (B30Double / (minM)) * (400000 * 1 / ((B32Double * 8.34) * (T3 * 1000))) / 197 : M49));

                    H31.setText(String.valueOf(BC26 == 0 ? "нет" : BC26 == 1 ? "ламинарный" : "Турб."));
                    H32.setText(String.valueOf(BC29 == 0 ? "нет" : BC29 == 1 ? "ламинарный" : "Турб."));
                    H33.setText(String.valueOf(BC33 == 0 ? "нет" : BC33 == 1 ? "ламинарный" : "Турб."));
                    H34.setText(String.valueOf(BC37 == 0 ? "нет" : BC37 == 1 ? "ламинарный" : "Турб."));
                    H35.setText(String.valueOf(BC41 == 0 ? "нет" : BC41 == 1 ? "ламинарный" : "Турб."));
                    H36.setText(String.valueOf(BC45 == 0 ? "нет" : BC45 == 1 ? "ламинарный" : "Турб."));

                    J33.setText(String.valueOf(R50 * 1000));
                    J34.setText(String.valueOf(T48 * 1000));
                    J35.setText(String.valueOf(((B30Double > 0 ? AC20 : 0) * 1.33 / 1000) / (Math.PI * (B3Double * 0.03937) * (B3Double * 0.03937) / 4)));
                    J36.setText(String.valueOf(T20 * 1000000));
                    J37.setText(String.valueOf((((minM - (AQ20 < 0 ? 0 : AQ20)) > 0 ? minM - (AQ20 < 0 ? 0 : AQ20) : 0) / minM) * 100));
                    J38.setText(String.valueOf((minM * 197) * (8.34 * B32Double) * (T3 * 1000) / (400000)));

                    ArrayList<Double> LC1X = new ArrayList<>();
                    LC1X.add(((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) + ((B33Double - B34Double) / 1000) * 0);
                    LC1X.add(((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) + ((B33Double - B34Double) / 1000) * 5.11);
                    LC1X.add(((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) + ((B33Double - B34Double) / 1000) * 170);
                    LC1X.add(((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) + ((B33Double - B34Double) / 1000) * 341);
                    LC1X.add(((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) + ((B33Double - B34Double) / 1000) * 511);
                    LC1X.add(((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) + ((B33Double - B34Double) / 1000) * 1022);

                    ArrayList<Double> LC1Y = new ArrayList<>();
                    LC1Y.add(0.0);
                    LC1Y.add(3.0);
                    LC1Y.add(100.0);
                    LC1Y.add(200.0);
                    LC1Y.add(300.0);
                    LC1Y.add(600.0);

                    lineChart1.setData(dataSetLineData("ВПЖ Бингама", Color.BLUE, LC1X, LC1Y));
                    lineChart1.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);
                    lineChart1.setDescription(null);

                    ArrayList<Double> LC2X = new ArrayList<>();
                    ArrayList<Double> LC2Y = new ArrayList<>();

                    ArrayList<Double> LC3X = new ArrayList<>();
                    ArrayList<Double> LC3Y = new ArrayList<>();

                    double L62 = 0.0;

                    for (int j = 0; j < 65; j++) {
                        double M62 = (((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) * Math.pow((B8Double - 2 * B9Double) / 1000, 2) * (B32Double * 1000)) / Math.pow(((B33Double - B34Double) / 1000), 2);
                        double R62 = (4 * (L62 / 1000)) / (Math.PI * Math.pow((B8Double - 2 * B9Double) / 1000, 2));
                        double N62 = 2100 + 7.3 * Math.pow(M62, 0.58);
                        double T62 = (((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) * ((B8Double - 2 * B9Double) / 1000)) / (R62 * ((B33Double - B34Double) / 1000));
                        double S62 = (R62 * ((B8Double - 2 * B9Double) / 1000) * (B32Double * 1000)) / ((B33Double - B34Double) / 1000);
                        double O62 = (N62 * ((B33Double - B34Double) / 1000)) / (((B8Double - 2 * B9Double) / 1000) * (B32Double * 1000));
                        double U62 = S62 / (1 + T62 / 6);
                        double P62 = (Math.PI * Math.pow((B8Double - 2 * B9Double) / 1000, 2) * O62) / 4;
                        double V62 = 0.075 / Math.pow(U62, 0.125);
                        double Q62 = L62 <= (P62 * 1000) ? (128 * (L62 / 1000) * ((B33Double - B34Double) / 1000) * B7Double) / (Math.PI * Math.pow((B8Double - 2 * B9Double) / 1000, 4)) + (16 * ((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) * B7Double) / (3 * ((B8Double - 2 * B9Double) / 1000)) : 0;
                        double W62 = Q62 == 0 ? (V62 * 8 * Math.pow(L62 / 1000, 2) * (B32Double * 1000) * B7Double) / (Math.pow(Math.PI, 2) * Math.pow((B8Double - 2 * B9Double) / 1000, 5)) : 0;

                        double M128 = 25 * Math.pow(((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) / (B32Double * 1000), 0.5);
                        double N128 = M128 * Math.PI * (Math.pow(B3Double / 1000, 2) - Math.pow(B8Double / 1000, 2)) / 4;
                        double U128 = L62 / 1000 > N128 ? T62 * 8 * Math.pow(L62 / 1000, 2) * (B32Double * 1000) * B7Double / (Math.pow(Math.PI, 2) * Math.pow(B3Double / 1000 - B8Double / 1000, 3) * Math.pow(B3Double / 1000 + B8Double / 1000, 2)) : 0;
                        double O128 = L62 / 1000 <= N128 ? 128 * (L62 / 1000) * ((B33Double - B34Double) / 1000) * B7Double / (Math.PI * Math.pow(B3Double / 1000 - B8Double / 1000, 3) * (B3Double / 1000 + B8Double / 1000)) + 16 * ((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) * B7Double / (3 * (B3Double / 1000 - B8Double / 1000)) : 0;

                        LC2X.add((W62 == 0 ? Q62 : W62) / 100000);
                        LC2Y.add(L62);

                        LC3X.add((O128 + U128) / 100000);
                        LC3Y.add(L62);

                        L62 += 1.0;
                    }

                    lineChart2.setData(dataSetLineData("Потери давления во 2-й секции по Бингаму", Color.BLUE, LC2X, LC2Y));
                    lineChart2.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);
                    lineChart2.setDescription(null);

                    lineChart3.setData(dataSetLineData("Потери давления в КП 2-й секции по Бингаму", Color.BLUE, LC3X, LC3Y));
                    lineChart3.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);
                    lineChart3.setDescription(null);

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

    }

    public LineData dataSetLineData(String name, Integer color, ArrayList<Double> x, ArrayList<Double> y){
        LineData lineData;
        LineDataSet dataset;
        ArrayList<Entry> entries = new ArrayList<>();
        for (int i = 0; i < x.size(); i++) {
            entries.add(new Entry((float) (x.get(i) + 0), (float) (y.get(i) + 0)));
        }

        dataset = new LineDataSet(entries, name);

        dataset.setDrawFilled(false);
        dataset.setColor(color);

        lineData = new LineData(dataset);

        return lineData;
    }
}