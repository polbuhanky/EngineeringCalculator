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

import java.util.ArrayList;
import java.util.Formatter;

import dev.artem.engineeringcalculator.Constants.SaveInfo;
import dev.artem.engineeringcalculator.MainActivity;
import dev.artem.engineeringcalculator.R;

public class CalculatorHydrauliclFragment extends Fragment {

    private EditText g2;
    private EditText o31;
    private EditText f6;
    private EditText f7;
    private EditText f8;
    private EditText f9;
    private EditText f10;
    private EditText f11;
    private EditText f12;
    private EditText f13;
    private EditText f14;
    private EditText f15;
    private EditText f16;
    private EditText f17;
    private EditText f18;
    private EditText f19;
    private EditText f20;
    private EditText f21;
    private EditText f22;
    private EditText f23;
    private EditText f24;
    private EditText f25;
    private EditText f26;
    private EditText f27;
    private EditText f28;
    private EditText f29;
    private EditText f30;
    private EditText f31;

    private TextView resultSizemm;
    private TextView result1;
    private TextView result2;
    private TextView result3;
    private TextView result4;
    private TextView result5;
    private TextView result6;
    private TextView result7;
    private TextView result8;
    private TextView result9;
    private TextView result10;
    private TextView result11;
    private TextView result12;
    private TextView result13;
    private TextView result14;
    private TextView result15;
    private TextView result16;
    private TextView result17;
    private TextView result18;
    private TextView result19;
    private TextView result20;
    private TextView result21;
    private TextView result22;
    private TextView result23;
    private TextView result24;
    private TextView result25;
    private TextView result26;
    private TextView result27;
    private TextView result28;
    private TextView result29;
    private TextView result30;
    private TextView result31;
    private TextView calculatorNameTV;

    private String calculatorName;

    MainActivity activity;
    private View rootView;

    public CalculatorHydrauliclFragment(String calculatorName){
        this.calculatorName = calculatorName;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = (MainActivity) activity;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.calculator_hydraulic, null);

        init();
        initListeners();
        return rootView;
    }

    private void init(){
        g2 = rootView.findViewById(R.id.g2);
        o31 = rootView.findViewById(R.id.o31);
        f6 = rootView.findViewById(R.id.f6);
        f7 = rootView.findViewById(R.id.f7);
        f8 = rootView.findViewById(R.id.f8);
        f9 = rootView.findViewById(R.id.f9);
        f10 = rootView.findViewById(R.id.f10);
        f11 = rootView.findViewById(R.id.f11);
        f12 = rootView.findViewById(R.id.f12);
        f13 = rootView.findViewById(R.id.f13);
        f14 = rootView.findViewById(R.id.f14);
        f15 = rootView.findViewById(R.id.f15);
        f16 = rootView.findViewById(R.id.f16);
        f17 = rootView.findViewById(R.id.f17);
        f18 = rootView.findViewById(R.id.f18);
        f19 = rootView.findViewById(R.id.f19);
        f20 = rootView.findViewById(R.id.f20);
        f21 = rootView.findViewById(R.id.f21);
        f22 = rootView.findViewById(R.id.f22);
        f23 = rootView.findViewById(R.id.f23);
        f24 = rootView.findViewById(R.id.f24);
        f25 = rootView.findViewById(R.id.f25);
        f26 = rootView.findViewById(R.id.f26);
        f27 = rootView.findViewById(R.id.f27);
        f28 = rootView.findViewById(R.id.f28);
        f29 = rootView.findViewById(R.id.f29);
        f30 = rootView.findViewById(R.id.f30);
        f31 = rootView.findViewById(R.id.f31);

        resultSizemm = rootView.findViewById(R.id.resultSizemm);
        result1 = rootView.findViewById(R.id.result1);
        result2 = rootView.findViewById(R.id.result2);
        result3 = rootView.findViewById(R.id.result3);
        result4 = rootView.findViewById(R.id.result4);
        result5 = rootView.findViewById(R.id.result5);
        result6 = rootView.findViewById(R.id.result6);
        result7 = rootView.findViewById(R.id.result7);
        result8 = rootView.findViewById(R.id.result8);
        result9 = rootView.findViewById(R.id.result9);
        result10 = rootView.findViewById(R.id.result10);
        result11 = rootView.findViewById(R.id.result11);
        result12 = rootView.findViewById(R.id.result12);
        result13 = rootView.findViewById(R.id.result13);
        result14 = rootView.findViewById(R.id.result14);
        result15 = rootView.findViewById(R.id.result15);
        result16 = rootView.findViewById(R.id.result16);
        result17 = rootView.findViewById(R.id.result17);
        result18 = rootView.findViewById(R.id.result18);
        result19 = rootView.findViewById(R.id.result19);
        result20 = rootView.findViewById(R.id.result20);
        result21 = rootView.findViewById(R.id.result21);
        result22 = rootView.findViewById(R.id.result22);
        result23 = rootView.findViewById(R.id.result23);
        result24 = rootView.findViewById(R.id.result24);
        result25 = rootView.findViewById(R.id.result25);
        result26 = rootView.findViewById(R.id.result26);
        result27 = rootView.findViewById(R.id.result27);
        result28 = rootView.findViewById(R.id.result28);
        result29 = rootView.findViewById(R.id.result29);
        result30 = rootView.findViewById(R.id.result30);
        result31 = rootView.findViewById(R.id.result31);
        calculatorNameTV = rootView.findViewById(R.id.calculatorNameTV);

        calculatorNameTV.setText(calculatorName.toUpperCase());

        ArrayList<String> nums = SaveInfo.GetData(getClass().getSimpleName());
        if (nums != null){
            f6.setText(nums.get(0));
            f7.setText(nums.get(1));
            f8.setText(nums.get(2));
            f9.setText(nums.get(3));
            f10.setText(nums.get(4));
            f11.setText(nums.get(5));
            f12.setText(nums.get(6));
            f13.setText(nums.get(7));
            f14.setText(nums.get(8));
            f15.setText(nums.get(9));
            f16.setText(nums.get(10));
            f17.setText(nums.get(11));
            f18.setText(nums.get(12));
            f19.setText(nums.get(13));
            f20.setText(nums.get(14));
            f21.setText(nums.get(15));
            f22.setText(nums.get(16));
            f23.setText(nums.get(17));
            f24.setText(nums.get(18));
            f25.setText(nums.get(19));
            f26.setText(nums.get(20));
            f27.setText(nums.get(21));
            f28.setText(nums.get(22));
            f29.setText(nums.get(23));
            f30.setText(nums.get(24));
            f31.setText(nums.get(25));
            g2.setText(nums.get(26));

            Calculate();
        }
    }

    private static double customLog(double logNumber, double base) {
        return Math.log(logNumber) / Math.log(base);
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
        g2.addTextChangedListener(textWatcher);
        f6.addTextChangedListener(textWatcher);
        f7.addTextChangedListener(textWatcher);
        f8.addTextChangedListener(textWatcher);
        f9.addTextChangedListener(textWatcher);
        f10.addTextChangedListener(textWatcher);
        f11.addTextChangedListener(textWatcher);
        f12.addTextChangedListener(textWatcher);
        f13.addTextChangedListener(textWatcher);
        f14.addTextChangedListener(textWatcher);
        f15.addTextChangedListener(textWatcher);
        f16.addTextChangedListener(textWatcher);
        f17.addTextChangedListener(textWatcher);
        f18.addTextChangedListener(textWatcher);
        f19.addTextChangedListener(textWatcher);
        f20.addTextChangedListener(textWatcher);
        f21.addTextChangedListener(textWatcher);
        f22.addTextChangedListener(textWatcher);
        f23.addTextChangedListener(textWatcher);
        f24.addTextChangedListener(textWatcher);
        f25.addTextChangedListener(textWatcher);
        f26.addTextChangedListener(textWatcher);
        f27.addTextChangedListener(textWatcher);
        f28.addTextChangedListener(textWatcher);
        f29.addTextChangedListener(textWatcher);
        f30.addTextChangedListener(textWatcher);
        f31.addTextChangedListener(textWatcher);

        TextWatcher textWatcher2 = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                try {
                    resultSizemm.setText(String.valueOf(Double.parseDouble(o31.getText().toString()) / 32 * 25.4));
                }catch (Exception e){
                    Log.d("MAIN", "Error: " + e);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };
        o31.addTextChangedListener(textWatcher2);

    }

    public void Calculate(){
        double f6Double = Double.parseDouble(f6.getText().toString());
        double f7Double = Double.parseDouble(f7.getText().toString());
        double f8Double = Double.parseDouble(f8.getText().toString());
        double f9Double = Double.parseDouble(f9.getText().toString());
        double f10Double = Double.parseDouble(f10.getText().toString());
        double f11Double = Double.parseDouble(f11.getText().toString());
        double f12Double = Double.parseDouble(f12.getText().toString());
        double f13Double = Double.parseDouble(f13.getText().toString());
        double f14Double = Double.parseDouble(f14.getText().toString());
        double f15Double = Double.parseDouble(f15.getText().toString());
        double f16Double = Double.parseDouble(f16.getText().toString());
        double f17Double = Double.parseDouble(f17.getText().toString());
        double f18Double = Double.parseDouble(f18.getText().toString());
        double f19Double = Double.parseDouble(f19.getText().toString());
        double f20Double = Double.parseDouble(f20.getText().toString());
        double f21Double = Double.parseDouble(f21.getText().toString());
        double f22Double = Double.parseDouble(f22.getText().toString());
        double f23Double = Double.parseDouble(f23.getText().toString());
        double f24Double = Double.parseDouble(f24.getText().toString());
        double f25Double = Double.parseDouble(f25.getText().toString());
        double f26Double = Double.parseDouble(f26.getText().toString());
        double f27Double = Double.parseDouble(f27.getText().toString());
        double f28Double = Double.parseDouble(f28.getText().toString());
        double f29Double = Double.parseDouble(f29.getText().toString());
        double f30Double = Double.parseDouble(f30.getText().toString());
        double f31Double = Double.parseDouble(f31.getText().toString());
        double g2Double = Double.parseDouble(g2.getText().toString());

        ArrayList<String> data = new ArrayList<>();

        data.add(String.valueOf(f6Double));
        data.add(String.valueOf(f7Double));
        data.add(String.valueOf(f8Double));
        data.add(String.valueOf(f9Double));
        data.add(String.valueOf(f10Double));
        data.add(String.valueOf(f11Double));
        data.add(String.valueOf(f12Double));
        data.add(String.valueOf(f13Double));
        data.add(String.valueOf(f14Double));
        data.add(String.valueOf(f15Double));
        data.add(String.valueOf(f16Double));
        data.add(String.valueOf(f17Double));
        data.add(String.valueOf(f18Double));
        data.add(String.valueOf(f19Double));
        data.add(String.valueOf(f20Double));
        data.add(String.valueOf(f21Double));
        data.add(String.valueOf(f22Double));
        data.add(String.valueOf(f23Double));
        data.add(String.valueOf(f24Double));
        data.add(String.valueOf(f25Double));
        data.add(String.valueOf(f26Double));
        data.add(String.valueOf(f27Double));
        data.add(String.valueOf(f28Double));
        data.add(String.valueOf(f29Double));
        data.add(String.valueOf(f30Double));
        data.add(String.valueOf(f31Double));
        data.add(String.valueOf(g2Double));

        SaveInfo.SaveString(getClass().getSimpleName(), data);

        double AA25 = 2100;

        double R29 = f29Double;
        double R25 = f25Double * 264.2;
        double R28 = f28Double;
        double R15 = f15Double / 25.4;
        double R8 = f6Double / 25.4;
        double R7 = R28 + R29;
        double R6 = R28 + R7;
        double R27 = f27Double * 8.33;
        double R20 = f20Double / 25.4;
        double R16 = f16Double / 25.4;
        double R24 = f24Double / 25.4;
        double R23 = f23Double / 0.3048;
        double R17 = f17Double / 0.3048;
        double R21 = f21Double / 25.4;
        double R22 = f22Double / 0.3048;
        double R19 = f19Double / 0.3048;
        double R14 = f14Double / 25.4;
        double R13 = f13Double / 0.3048;
        double R9 = f7Double / 25.4;
        double R10 = f8Double / 25.4;
        double R11 = f9Double / 25.4;
        double R12 = f12Double / 0.3048;
        double R30 = f30Double / 25.4;
        double R31 = f31Double * 8.33;

        double S11 = f10Double / 25.4;

        double U14 = R25 / (R8 * R8 - R15 * R15);
        double U17 = 8.69 * (R8 - R15);
        double U25 = R25 / (R8 * R8 - R20 * R20);

        double T9 = Math.log10(2);
        double T8 = Math.log10(R6 / R7);
        double T7 = T8 / T9;
        double T24 = Math.pow(U25, (2 - T7));
        double U18 = Math.pow(U14, (2 - T7));
        double T18 = R27 / R7;
        double U27 = 43.64 * T18 * T24;
        double T17 = Math.pow(U17, T7);
        double T14 = 43.64 * T18 * U18;
        double T13 = T14 * T17;
        double T25 = 8.69 * (R8 - R20);
        double T27 = Math.pow(T25, T7);
        double T23 = U27 * T27;
        double T12 = Math.pow(511, T7);
        double T11 = (5.11 * R7);
        double T30 = (R8 * R8 - R15 * R15);
        double T35 = (24.51 * R25) / T30;
        double S4 = R8 - R15;
        double S3 = 0.8 * (2 + 1 / T7) * T35;
        double T4 = S3 / S4;
        double T10 = T11 / T12;
        double T3 = T10 * Math.pow(T4, T7);
        double T6 = (T3 * 100) / T4;
        double T20 = (24.51 * R25 / (R16 * R16));
        double T19 = 928 * R27 * T20 * R16 / (60 * T6);
        double T32 = 43.64 * R27 * T17;
        double T31 = AA25 * R7;
        double U32 = T31 / T32;
        double U31 = Math.pow(U32, 1 / (2 - T7));
        double T28 = T30 * U31;
        double T29 = T28 / 264.2;
        double S43 = 8.69 * (R8 - R20);
        double S44 = Math.pow(S43, T7);
        double S42 = 43.64 * R27 * S44;
        double S45 = T31 / S42;
        double S46 = Math.pow(S45, (1 / (2 - T7)));
        double S41 = (R8 * R8 - R20 * R20);
        double T41 = S41 * S46;
        double T42 = T41 / 264.2;
        double T33 = (24.51 * T28) / T30;
        double T34 = T33 * 0.3048;
        double T36 = T35 * 0.3048;
        double T45 = (24.51 * T41) / S41;
        double T46 = T45 * 0.3048;
        double T43 = (24.51 * R25) / S41;
        double T44 = T43 * 0.3048;
        double X4 = Math.pow(T7, 0.215);
        double W7 = ((6.96 * 0.0001 * T3) / (R8 - R15)) * (R17 + R19);
        double Y4 = 0.25 / X4;
        double X3 = customLog(T7, 2.718);
        double X6 = Math.pow(T19, Y4);
        double Y3 = (9.57 + X3) / 30.297;
        double W30 = 24.51 * R25 / (R24 * R24);
        double Y6 = Y3 / X6;
        double V30 = 2.691 * 0.000001 * R27 * Y6 * (W30 * W30);
        double V28 = V30 / R24 * R23;
        double V29 = V28 * 0.0703;
        double T21 = 24.51 * R25 / (R21 * R21);
        double V26 = 2.691 * 0.000001 * R27 * Y6 * (T21 * T21);
        double W26 = V26 / R21 * R22;
        double Y17 = 2.691 * 0.000001 * R27 * Y6 * (T35 * T35);
        double Y15 = Y17 / (R8 - R15) * (R17 + R19);
        double Z12 = 2.691 * 0.000001 * R27 * Y6 * (T35 * T35);
        double Z10 = Z12 / (R8 - R15) * R13;
        double Z8 = ((6.96 * 0.0001 * T3) / (R14 - R15)) * R13;
        double W13 = ((6.96 * 0.0001 * T3) / (R8 - R20) * R22);
        double V15 = 2.691 * 0.000001 * R27 * Y6 * (T35 * T35);
        double W15 = V15 / (R8 - R20) * R22;
        double AB26 = T23 < 4000 ? Z8 : Z10;
        double AA27 = T23 < 4000 ? W13 : W15;
        double AA26 = T13 < 4000 ? W7 : Y15;
        double AA30 = AA26 + AB26 + AA27;
        double AA31 = AA30 * 0.0703;
        double V25 = 2.691 * 0.000001 * R27 * Y6 * (T20 * T20);
        double W25 = V25 / R16 * R17;
        double V23 = W25 + W26;
        double V24 = V23 * 0.0703;
        double W36 = R9 * R9 * 0.785 + R10 * R10 * 0.785 + R11 * R11 * 0.785 + S11 * S11 * 0.785;
        double V36 = 10858 * (W36 * W36);
        double V38 = R27 * (R25 * R25);
        double V34 = V38 / V36;
        double V35 = V34 * 0.07030696;
        double V33 = AA31 + V24 + V29;
        double V41 = V33 + V35;
        double X48 = V41 * f25Double;
        double X49 = V35 * f25Double;
        double V32 = AA30 + V23 + V28;
        double V39 = V32 + V34;
        double V42 = (V39 * R25) / 1714;
        double V43 = (R25 * V34) / 1714;
        double V44 = (V43 / V42) * 100;
        double V45 = (0.32086 * R25) / W36;
        double V46 = V45 * 0.3048;
        double V47 = (R27 * R25 * V45) / 1930;
        double V48 = V47 * 0.45359;
        double S38 = AA30 / (0.052 * R12) + R27;
        double S39 = S38 / 8.33;
        double W68 = R14 * R14 - R15 * R15;
        double S67 = (24.51 * R25) / W68;
        double S65 = 0.8 * (2 + 1 / T7) * S67;
        double T65 = S65 / (R14 - R15);
        double T64 = T10 * Math.pow(T65, T7);
        double S58 = 0.8 * (2 + 1 / T7) * T43;
        double T66 = (T64 * 100) / T65;
        double T58 = S58/(R8-R20);
        double T57 = T10 * Math.pow(T58, T7);
        double T62 = R27 * T66;
        double S61 = R31 - R27;
        double T59 = (T57 * 100) / T58;
        double U62 = Math.pow(T62, 0.333);
        double S62 = Math.pow(S61, 0.667);
        double T51 = R27 * T6;
        double S50 = R31 - R27;
        double T56 = R27 * T59;
        double S55 = R31 - R27;
        double V62 = S62 / U62;
        double S60 = 175 * R30;
        double U51 = Math.pow(T51, 0.333);
        double S51 = Math.pow(S50, 0.667);
        double U56 = Math.pow(T56, 0.333);
        double S56 = Math.pow(S55, 0.667);
        double T60 = S60 * V62;
        double V51 = S51 / U51;
        double V56 = S56 / U56;
        double S54 = 175 * R30;
        double R66 = S67 - T60;
        double S49 = 175 * R30;
        double T49 = S49 * V51;
        double T52 = T35 - T49;
        double S69 = R22 / T43 + (R17 - R13) / T35 + R13 / S67;
        double T54 = S54 * V56;
        double R58 = T43 - T54;
        double S70 = R22 / R58 + (R17 - R13) / T52 + R13 / R66;
        double V69 = R12 / S70;
        double S71 = R12 / S69;
        double V71 = S71 - V69;
        double V72 = V71 * 0.3048;
        double V70 = V69 * 0.3048;
        double S72 = S71 * 0.3048;
        double S48 = f30Double / 10 * 0.03281;
        double S47 = 2 * 32.18 * S48 * S48 * ((f31Double * 62.3) - (f27Double * 62.3));
        double T47 = S47 / (92.6 * T6 * 0.000673);
        double T48 = T47 * 0.3048;
        double F87 = f11Double;
        double F83 = f6Double;
        double G107 = F87 <= 5 ? 0.95 : F87 <= 7 ? 1 : F87 <= 9 ? 1.02 : F87 <= 15 ? 1.03 : F87 <= 20 ? 1.04 : F87 <= 25 ? 1.06 : 1.08;
        double F107 = F83 < 220 ? 0.12 : F83 <= 300 ? 0.14 : F83 <= 312 ? 0.16 : 0.17;
        double F99 = F107 * G107 * F83 * 60/1000;
        double D107 = F99 * 1000/60;
        double R101 = f27Double * 8.33;
        double R99 = F99 * 264.2;
        double R94 = f20Double / 25.4;
        double R84 = f6Double / 25.4;
        double R93 = f17Double / 0.3048;
        double R96 = f22Double / 0.3048;
        double R97 = f23Double / 0.3048;
        double R89 = f13Double / 0.3048;
        double T83 = Math.log10(2);
        double R103 = f29Double;
        double R102 = f28Double;
        double H108 = f12Double <= 1000 ? 1.2 : f12Double <= 1500 ? 1.18 : f12Double <= 2000 ? 1.16 : f12Double <= 2500 ? 1.12 : f12Double <= 3000 ? 1.07 : 1;
        double F108 = f6Double < 220 ? 105 : f6Double <= 300 ? 95 : f6Double <= 312 ? 85 : f6Double <= 350 ? 75 : 70;
        double F109 = F108 * H108;
        double D110 = (0.32086 * R99) / (F109 / 0.3048);
        double E110 = D110 / 3 / 0.785;
        double F110 = Math.sqrt(E110);
        double F111 = F110 * 25.4;
        double L113 = Double.parseDouble(String.format("%.0f",(F111 / 25.4 * 32)).replace(",","."));
        double L112 = Double.parseDouble(String.format("%.0f",(F111 / 25.4 * 32)).replace(",","."));
        double L111 = Double.parseDouble(String.format("%.0f",(F111 / 25.4 * 32)).replace(",","."));
        double M113 = L113 / 32 * 25.4;
        double M112 = L112 / 32 * 25.4;
        double M111 = L111 / 32 * 25.4;
        double F86 = M113;
        double F85 = M112;
        double F84 = M111;
        double R98 = f24Double / 25.4;
        double R95 = f21Double / 25.4;
        double R92 = f16Double / 25.4;
        double W93 = 8.69 * (R84 + R94);
        double V91 = R99 / W93;
        double W91 = R84 - R94;
        double R82 = R102 + R103;
        double X85 = 3.75 * R82 * R89;
        double R81 = R102 + R82;
        double T82 = Math.log10(R81 / R82);
        double T81 = T82 / T83;
        double R90 = f14Double / 25.4;
        double R91 = f15Double / 25.4;
        double W86 = 8.69 * (R84 + R91);
        double W85 = R99 / W86;
        double W84 = (R84 - R91);
        double Y86 = 8.69 * (R90 + R91);
        double Y85 = R99 / Y86;
        double Y84 = R90 - R91;
        double X86 = Math.pow(Y84, 2 * T81 + 1) * 1000;
        double W92 = Math.pow(W91, 2 * T81 + 1) * 1000;
        double V94 = 3.75 * R82 * R96;
        double V86 = Math.pow(W84, 2 * T81 + 1) * 1000;
        double R87 = F86 / 25.4;
        double R86 = F85 / 25.4;
        double R85 = F84 / 25.4;
        double W105 = Math.pow(R98, 4.86);
        double W104 = Math.pow(R99, 1.86);
        double W101 = Math.pow(R95, 4.86);
        double W99 = Math.pow(R92, 4.86);
        double X84 = Math.pow(Y85, T81);
        double X83 = X85 / X86;
        double V92 = Math.pow(V91, T81);
        double V93 = V94 / W92;
        double V84 = Math.pow(W85, T81);
        double V85 = 3.75 * R82 * (R93 - R89);
        double V83 = V85 / V86;
        double W110 = R85 * R85 * 0.785 + R86 * R86 * 0.785 + R87 * R87 * 0.785;
        double V105 = R97 / W105;
        double V104 = 0.000061 * R101 * W104;
        double V101 = (R93 / W99) + (R96 / W101);
        double V99 = Math.pow(R99, 1.86);
        double Y82 = X83 / X84;
        double V87 = V93 * V92;
        double V81 = V83 * V84;
        double V110 = 10858 * (W110 * W110);
        double V111 = R101 * (R99 * R99);
        double V102 = V104 * V105;
        double V97 = 0.000061 * R101 * V99 * V101;
        double V95 = V81 + V87 + Y82;
        double V108 = V111 / V110;
        double V103 = V102 * 0.0703;
        double V98 = V97 * 0.0703;
        double V96 = V95 * 0.0703;
        double V109 = V108 * 0.0703;
        double V107 = V96 + V98 + V103;
        double V113 = V107 + V109;
        double O93 = V113;
        double V117 = (0.32086 * R99) / W110;
        double V118 = V117 * 0.3048;
        double O97 = V118;
        double R88 = f12Double / 0.3048;
        double T104 = (R84 * R84 - R91 * R91);
        double W140 = R90 * R90 - R91 * R91;
        double S113 = (R84 * R84 - R94 * R94);
        double T109 = (24.51 * R99) / T104;
        double T115 = (24.51 * R99) / S113;
        double S139 = (24.51 * R99) / W140;
        double S141 = R96 / T115 + (R93 - R89) / T109 + R89 / S139;
        double S143 = R88 / S141;
        double S144 = S143 * 0.3048;
        double O102 = S144;
        double R104 = f30Double / 25.4;
        double S121 = 175 * R104;
        double S132 = 175 * R104;
        double R105 = f31Double * 8.33;
        double S133 = R105 - R101;
        double S127 = R105 - R101;
        double S122 = R105 - R101;
        double S130 = 0.8 * (2 + 1 / T81) * T115;
        double T130 = S130 / (R84 - R94);
        double S78 = 0.8 * (2 + 1 / T81) * T109;
        double S80 = R84 - R91;
        double S137 = 0.8 * (2 + 1 / T81) * S139;
        double T85 = 5.11 * R82;
        double T86 = Math.pow(511, T81);
        double T84 = T85 / T86;
        double T137 = S137 / (R90 - R91);
        double T136 = T84 * Math.pow(T137, T81);
        double T78 = S78 / S80;
        double T77 = T84 * Math.pow(T78, T81);
        double T129 = T84 * Math.pow(T130, T81);
        double T138 = (T136 * 100) / T137;
        double T80 = (T77 * 100) / T78;
        double T131 = (T129 * 100) / T130;
        double T134 = R101 * T138;
        double T123 = R101 * T80;
        double T128 = R101 * T131;
        double U134 = Math.pow(T134, 0.333);
        double U123 = Math.pow(T123, 0.333);
        double U128 = Math.pow(T128, 0.333);
        double S123 = Math.pow(S122, 0.667);
        double S128 = Math.pow(S127, 0.667);
        double S134 = Math.pow(S133, 0.667);
        double V134 = S134 / U134;
        double V123 = S123 / U123;
        double V128 = S128 / U128;
        double T132 = S132 * V134;
        double T121 = S121 * V123;
        double S126 = 175 * R104;
        double T126 = S126 * V128;
        double R138 = S139 - T132;
        double T124 = T109 - T121;
        double R130 = T115 - T126;
        double S142 = R96 / R130 + (R93 - R89) / T124 + R89 / R138;
        double V141 = R88 / S142;
        double V142 = V141 * 0.3048;
        double O101 = V142;

        result1.setText(String.valueOf(T13));
        result2.setText(String.valueOf(T23));
        result3.setText(String.valueOf(T19));
        result4.setText(String.valueOf(T29));
        result5.setText(String.valueOf(T42));
        result6.setText(String.valueOf(T34));
        result7.setText(String.valueOf(T36));
        result8.setText(String.valueOf(T46));
        result9.setText(String.valueOf(T44));
        result10.setText(String.valueOf(V29));
        result11.setText(String.valueOf(V24));
        result12.setText(String.valueOf(AA31));
        result13.setText(String.valueOf(V35));
        result14.setText(String.valueOf(V41));
        result15.setText(String.valueOf(X48));
        result16.setText(String.valueOf(X49));
        result17.setText(String.valueOf(V44));
        result18.setText(String.valueOf(V46));
        result19.setText(String.valueOf(V48));
        result20.setText(String.valueOf(S39));
        result21.setText(String.valueOf(V72));
        result22.setText(String.valueOf(V70));
        result23.setText(String.valueOf(S72));
        result24.setText(String.valueOf(T48));
        result25.setText(String.valueOf(D107));
        result26.setText(String.valueOf(F99));
        result27.setText(String.valueOf(O93));
        result28.setText(String.valueOf(F84));
        result29.setText(String.valueOf(O97));
        result30.setText(String.valueOf(O102));
        result31.setText(String.valueOf(O101));
    }
}