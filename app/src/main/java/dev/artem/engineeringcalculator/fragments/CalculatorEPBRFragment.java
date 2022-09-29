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

import dev.artem.engineeringcalculator.MainActivity;
import dev.artem.engineeringcalculator.R;

public class CalculatorEPBRFragment extends Fragment {

    private EditText B43;
    private EditText B44;

    private EditText B3;
    private EditText B4;
    private EditText B5;
    private EditText B7;
    private EditText B8;
    private EditText B10;
    private EditText B11;
    private EditText B13;
    private EditText B14;
    private EditText B16;
    private EditText B17;
    private EditText B19;
    private EditText B20;
    private EditText B22;
    private EditText B23;
    private EditText B30;
    private EditText B31;
    private EditText B32;
    private EditText B33;
    private EditText B34;
    private EditText B35;
    private EditText B36;

    private TextView B46;
    private TextView B47;
    private TextView calculatorNameTV;

    private String calculatorName;

    MainActivity activity;
    private View rootView;

    public CalculatorEPBRFragment(String calculatorName){
        this.calculatorName = calculatorName;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = (MainActivity) activity;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.calculator_epbr, null);

        init();
        initListeners();
        return rootView;
    }

    private void init(){
        B43 = rootView.findViewById(R.id.B43);
        B44 = rootView.findViewById(R.id.B44);

        B3 = rootView.findViewById(R.id.B3);
        B4 = rootView.findViewById(R.id.B4);
        B5 = rootView.findViewById(R.id.B5);
        B7 = rootView.findViewById(R.id.B7);
        B8 = rootView.findViewById(R.id.B8);
        B10 = rootView.findViewById(R.id.B10);
        B11 = rootView.findViewById(R.id.B11);
        B13 = rootView.findViewById(R.id.B13);
        B14 = rootView.findViewById(R.id.B14);
        B16 = rootView.findViewById(R.id.B16);
        B17 = rootView.findViewById(R.id.B17);
        B19 = rootView.findViewById(R.id.B19);
        B20 = rootView.findViewById(R.id.B20);
        B22 = rootView.findViewById(R.id.B22);
        B23 = rootView.findViewById(R.id.B23);
        B30 = rootView.findViewById(R.id.B30);
        B31 = rootView.findViewById(R.id.B31);
        B32 = rootView.findViewById(R.id.B32);
        B33 = rootView.findViewById(R.id.B33);
        B34 = rootView.findViewById(R.id.B34);
        B35 = rootView.findViewById(R.id.B35);
        B36 = rootView.findViewById(R.id.B36);

        B46 = rootView.findViewById(R.id.B46);
        B47 = rootView.findViewById(R.id.B47);

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
                    double B44Double = Double.parseDouble(B44.getText().toString());

                    double B3Double = Double.parseDouble(B3.getText().toString());
                    double B4Double = Double.parseDouble(B4.getText().toString());
                    double B5Double = Double.parseDouble(B5.getText().toString());
                    double B7Double = Double.parseDouble(B7.getText().toString());
                    double B8Double = Double.parseDouble(B8.getText().toString());
                    double B10Double = Double.parseDouble(B10.getText().toString());
                    double B11Double = Double.parseDouble(B11.getText().toString());
                    double B13Double = Double.parseDouble(B13.getText().toString());
                    double B14Double = Double.parseDouble(B14.getText().toString());
                    double B16Double = Double.parseDouble(B16.getText().toString());
                    double B17Double = Double.parseDouble(B17.getText().toString());
                    double B19Double = Double.parseDouble(B19.getText().toString());
                    double B20Double = Double.parseDouble(B20.getText().toString());
                    double B22Double = Double.parseDouble(B22.getText().toString());
                    double B23Double = Double.parseDouble(B23.getText().toString());
                    double B30Double = Double.parseDouble(B30.getText().toString());
                    double B31Double = Double.parseDouble(B31.getText().toString());
                    double B32Double = Double.parseDouble(B32.getText().toString());
                    double B33Double = Double.parseDouble(B33.getText().toString());
                    double B34Double = Double.parseDouble(B34.getText().toString());
                    double B35Double = Double.parseDouble(B35.getText().toString());
                    //double B36Double = Double.parseDouble(B36.getText().toString());

                    double N3 = Math.log10(B33Double / B34Double) / Math.log10(600 / 300);
                    double R3 = Math.log10(B34Double / B35Double) / Math.log10(300 / 6);
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

                    double T3 = 0.511 * B34Double / Math.pow(511, R3);
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
                    double BD44 = (B19Double > 0 && B31Double > 0) ? ((S44 + AG44) + (U46 + AE46) + AQ45) / 3 : 0;
                    double BD40 = (B16Double > 0 && B31Double > 0) ? ((S40 + AG40) + (U42 + AE42) + AQ41) / 3 : 0;
                    double BD36 = (B13Double > 0 && B31Double > 0) ? ((S36 + AG36) + (U38 + AE38) + AQ37) / 3 : 0;
                    double BD32 = (B10Double > 0 && B31Double > 0) ? ((S32 + AG32) + (U34 + AE34) + AQ33) / 3 : 0;
                    double BD28 = (B7Double > 0 && B31Double > 0) ? ((U30 + AE30) + (S28 + AG28) + AQ29) / 3 : 0;
                    double BD25 = (B4Double > 0 && B31Double > 0) ? (BD24 + BD23 + AU26) / 3 : 0;
                    double BD47 = BD25 + BD28 + BD32 + BD36 + BD40 + BD44;
                    double G3 = R3;
                    double G11 = G3 > 1 ? 0 : BD47;
                    double G1 = N3;
                    double B36 = 2600;
                    double G15 = (G3 > 1 || G1 > 1) ? 0 : B36 > 0 ? G11 / (9.81 * B36) + B32Double * 1000 : 0;
                    double G42 = G15;

                    B46.setText(String.valueOf(G42));
                    B47.setText(String.valueOf(G42 * 9.81 * B44Double / 100000));

                } catch (Exception e){
                    Log.d("MAIN", "Error: " + e);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };
        B43.addTextChangedListener(textWatcher);
        B44.addTextChangedListener(textWatcher);

        B3.addTextChangedListener(textWatcher);
        B4.addTextChangedListener(textWatcher);
        B5.addTextChangedListener(textWatcher);
        B7.addTextChangedListener(textWatcher);
        B8.addTextChangedListener(textWatcher);
        B10.addTextChangedListener(textWatcher);
        B11.addTextChangedListener(textWatcher);
        B13.addTextChangedListener(textWatcher);
        B14.addTextChangedListener(textWatcher);
        B16.addTextChangedListener(textWatcher);
        B17.addTextChangedListener(textWatcher);
        B19.addTextChangedListener(textWatcher);
        B20.addTextChangedListener(textWatcher);
        B22.addTextChangedListener(textWatcher);
        B23.addTextChangedListener(textWatcher);
        B30.addTextChangedListener(textWatcher);
        B31.addTextChangedListener(textWatcher);
        B32.addTextChangedListener(textWatcher);
        B33.addTextChangedListener(textWatcher);
        B34.addTextChangedListener(textWatcher);
        B35.addTextChangedListener(textWatcher);
        B36.addTextChangedListener(textWatcher);

    }
}