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

import dev.artem.engineeringcalculator.MainActivity;
import dev.artem.engineeringcalculator.R;

public class VolumeForFragment extends Fragment {

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

    private EditText E1;
    private EditText E2;

    private TextView E3;
    private TextView E4;
    private TextView E5;
    private TextView E6;
    private TextView E7;
    private TextView E8;
    private TextView E9;
    private TextView E10;
    private TextView E11;
    private TextView E12;
    private TextView E13;
    private TextView E14;

    private TextView calculatorNameTV;

    private String calculatorName;

    MainActivity activity;
    private View rootView;

    public VolumeForFragment(String calculatorName){
        this.calculatorName = calculatorName;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = (MainActivity) activity;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.calculator_volume_for, null);

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

        E1 = rootView.findViewById(R.id.E1);
        E2 = rootView.findViewById(R.id.E2);


        E3 = rootView.findViewById(R.id.E3);
        E4 = rootView.findViewById(R.id.E4);
        E5 = rootView.findViewById(R.id.E5);
        E6 = rootView.findViewById(R.id.E6);
        E7 = rootView.findViewById(R.id.E7);
        E8 = rootView.findViewById(R.id.E8);
        E9 = rootView.findViewById(R.id.E9);
        E10 = rootView.findViewById(R.id.E10);
        E11 = rootView.findViewById(R.id.E11);
        E12 = rootView.findViewById(R.id.E12);
        E13 = rootView.findViewById(R.id.E13);
        E14 = rootView.findViewById(R.id.E14);

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

                    double E1Double = Double.parseDouble(E1.getText().toString());
                    double E2Double = Double.parseDouble(E2.getText().toString());

                    double V7 = (Math.PI * Math.pow(B3Double / 1000, 2)) / 4 - (Math.PI * Math.pow(B20Double / 1000, 2)) / 4;
                    double J6 = Math.PI * (Math.pow(B17Double / 1000 - 2 * (B18Double / 1000), 2)) / 4;
                    double J5 = Math.PI * (Math.pow(B14Double / 1000 - 2 * (B15Double / 1000), 2)) / 4;
                    double J4 = Math.PI * (Math.pow(B11Double / 1000 - 2 * (B12Double / 1000), 2)) / 4;
                    double J3 = Math.PI * (Math.pow(B8Double / 1000 - 2 * (B9Double / 1000), 2)) / 4;
                    double J2 = Math.PI * (Math.pow(B5Double / 1000 - 2 * (B6Double / 1000), 2)) / 4;
                    double M7 = B19Double == 0 ? 0 : V7;
                    double M6 = J6 * B16Double;
                    double M5 = J5 * B13Double;
                    double M4 = J4 * B10Double;
                    double M3 = J3 * B7Double;
                    double M2 = J2 * B4Double;
                    double M8 = M2 + M3 + M4 + M5 + M6 + M7;
                    double P7 = (Math.PI * Math.pow(B3Double / 1000, 2)) / 4 - M7 - V7;
                    double P6 = (Math.PI * Math.pow(B17Double / 1000, 2)) / 4 - J6;
                    double P5 = (Math.PI * Math.pow(B14Double / 1000, 2)) / 4 - J5;
                    double P4 = (Math.PI * Math.pow(B11Double / 1000, 2)) / 4 - J4;
                    double P3 = (Math.PI * Math.pow(B8Double / 1000, 2)) / 4 - J3;
                    double P2 = (Math.PI * Math.pow(B5Double / 1000, 2)) / 4 - J2;
                    double S7 = P7 * B19Double;
                    double S6 = P6 * B16Double;
                    double S5 = P5 * B13Double;
                    double S4 = P4 * B10Double;
                    double S3 = P3 * B7Double;
                    double S2 = P2 * B4Double;
                    double S8 = S2 + S3 + S4 + S5 + S6 + S7;
                    double V2 = (Math.PI * Math.pow(B3Double / 1000, 2)) / 4 - (Math.PI * Math.pow(B5Double/1000, 2)) / 4;
                    double Y2 = (Math.PI * Math.pow(B23Double / 1000, 2)) / 4 - (Math.PI * Math.pow(B5Double / 1000, 2)) / 4;
                    double V6 = (Math.PI * Math.pow(B3Double / 1000, 2)) / 4 - (Math.PI * Math.pow(B17Double/1000, 2)) / 4;
                    double V5 = (Math.PI * Math.pow(B3Double / 1000, 2)) / 4 - (Math.PI * Math.pow(B14Double/1000, 2)) / 4;
                    double V4 = (Math.PI * Math.pow(B3Double / 1000, 2)) / 4 - (Math.PI * Math.pow(B11Double/1000, 2)) / 4;
                    double V3 = (Math.PI * Math.pow(B3Double / 1000, 2)) / 4 - (Math.PI * Math.pow(B8Double/1000, 2)) / 4;
                    double AB2 = B4Double <= B22Double ? Y2 * B4Double : Y2 * B22Double + V2 * (B4Double - B22Double);
                    double Y7 = V7 * B19Double;
                    double Y6 = V6 * B16Double;
                    double Y5 = V5 * B13Double;
                    double Y4 = V4 * B10Double;
                    double Y3 = V3 * B7Double;
                    double Y8 = Y3 + Y4 + Y5 + Y6 + Y7 + AB2;
                    double J9 = M8 / ((B30Double / 1000) * 60);
                    double J10 = Y8 / ((B30Double / 1000) * 60);


                    double P10 = Math.log10(B33Double / B34Double) / Math.log10(600/300);
                    double R3 = Math.log10(B34Double / B35Double) / Math.log10(300 / 6);
                    double AC24 = (4 * B30Double / 1000) / (Math.PI * (Math.pow(B23Double / 1000, 2) - Math.pow(B5Double / 1000, 2)));
                    double AF24 = (4 * B30Double / 1000) / (Math.PI * (Math.pow(B3Double / 1000, 2) - Math.pow(B5Double / 1000, 2)));
                    double M25 = (B4Double > 0 && B30Double > 0) ? (4 * (B30Double / 1000)) / (Math.PI * (Math.pow(B23Double / 1000, 2) - Math.pow(B5Double / 1000, 2))) : 0;
                    double M26 = (B4Double > 0 && B30Double > 0) ? (4 * (B30Double / 1000)) / (Math.PI * (Math.pow(B3Double / 1000, 2) - Math.pow(B5Double / 1000, 2))) : 0;
                    double M29 = (B7Double > 0 && B30Double > 0) ? (4 * (B30Double / 1000)) / (Math.PI * (Math.pow(B3Double / 1000, 2) - Math.pow(B8Double / 1000, 2))) : 0;
                    double M33 = (B10Double > 0 && B30Double > 0) ? (4 * (B30Double / 1000)) / (Math.PI * (Math.pow(B3Double / 1000, 2) - Math.pow(B11Double / 1000, 2))) : 0;
                    double AI20 = Math.pow(B37Double / 1000, 3) * (B32Double * 1000) * (B38Double * 1000 - B32Double * 1000) * 9.81 / Math.pow(((B33Double - B34Double) / 1000), 2);
                    double AK20 = Math.pow(B37Double / 1000, 2) * ((B34Double - ((B33Double - B34Double) / 1000) * 1000) * 0.479) * (B32Double * 1000) / Math.pow(((B33Double - B34Double) / 1000), 2);

                    double R10 = (5.11 * B33Double) / Math.pow(1022, P10);
                    double T3 = 0.511 * B34Double / Math.pow(511, R3);
                    double M24 = (Math.pow(2 * R3 + 1, 2) / R3) * Math.pow((1 / (2 + R3)), ((R3 + 2) / (R3 + 1)));
                    double N34 = (Math.pow(2 * R3 + 1, 2) / R3) * Math.pow((1 / (2 + R3)), ((R3 + 2) / (R3 + 1)));
                    double N30 = (Math.pow(2 * R3 + 1, 2) / R3) * Math.pow((1 / (2 + R3)), ((R3 + 2) / (R3 + 1)));
                    double AK24 = Math.pow(12, (1 - R3)) * Math.pow(3 * R3 / (2 * R3 + 1), R3) * Math.pow(AF24, (2 - R3)) * Math.pow(B3Double / 1000 - B5Double / 1000, R3) * (B32Double * 1000) / T3;
                    double AI24 = Math.pow(12, (1 - R3)) * Math.pow(3 * R3 / (2 * R3 + 1), R3) * Math.pow(AC24, (2 - R3)) * Math.pow(B23Double / 1000 - B5Double / 1000, R3) * (B32Double * 1000) / T3;
                    double O24 = 4848 / M24;
                    double P34 = 4848 / N34;
                    double P30 = 4848 / N30;
                    double AO24 = 0.09 / Math.pow((AK24), 0.125);
                    double AM24 = 0.09 / Math.pow((AI24), 0.125);
                    double T24 = (B4Double > 0 && B30Double > 0) ? (Math.PI * (Math.pow(B3Double / 1000, 2) - Math.pow(B5Double / 1000, 2)) / 4) * Math.pow(O24 * T3 * Math.pow((2 * R3 + 1) / R3, R3) / (Math.pow(12, (1 - R3)) * Math.pow(B3Double / 1000 - B5Double / 1000, R3) * (B32Double * 1000)), (1 / (2 - R3))) : 0;
                    double Q24 = (B4Double > 0 && B30Double > 0) ? (Math.PI * (Math.pow(B23Double / 1000, 2) - Math.pow(B5Double / 1000, 2)) / 4) * Math.pow(O24 * T3 * Math.pow((2 * R3 + 1) / R3, R3) / (Math.pow(12, (1 - R3)) * Math.pow(B23Double / 1000 - B5Double / 1000, R3) * (B32Double * 1000)), (1 / (2 - R3))) : 0;
                    double R34 = (B10Double > 0 && B30Double > 0) ? (Math.PI * (Math.pow(B3Double / 1000, 2) - Math.pow(B11Double / 1000, 2)) / 4) * Math.pow(P34 * T3 * Math.pow((2 * R3 + 1) / R3, R3) / (Math.pow(12, (1 - R3)) * Math.pow(B3Double / 1000 - B11Double / 1000, R3) * (B32Double * 1000)), (1 / (2 - R3))) : 0;
                    double R30 = (B7Double > 0 && B30Double > 0) ? (Math.PI * (Math.pow(B3Double / 1000, 2) - Math.pow(B8Double / 1000, 2)) / 4) * Math.pow(P30 * T3 * Math.pow((2 * R3 + 1) / R3, R3) / (Math.pow(12, (1 - R3)) * Math.pow(B3Double / 1000 - B8Double / 1000, R3) * (B32Double * 1000)), (1 / (2 - R3))) : 0;
                    double AU24 = B30Double / 1000 > T24 ? B4Double > B22Double ? AM24 * B22Double * Math.pow(AC24, 2) * (B32Double * 1000) / (2 * (B23Double / 1000 - B5Double / 1000)) + AO24 * (B4Double - B22Double) * Math.pow(AF24, 2) * (B32Double * 1000) / (2 * (B3Double / 1000 - B5Double / 1000)) : 0 : 0;
                    double Z24 = B30Double / 1000 <= T24 ? B22Double < B4Double ? Math.pow(2, (2 + 4 * R3)) * T3 * Math.pow((2 * R3 + 1) * (B30Double / 1000) / (R3 * Math.PI * (B23Double / 1000 + B5Double / 1000)), R3) * B22Double / Math.pow((B23Double / 1000 - B5Double / 1000), (2 * R3 + 1)) + Math.pow(2, (2 + 4 * R3)) * T3 * Math.pow((2 * R3 + 1) * (B30Double / 1000) / (R3 * Math.PI * (B3Double / 1000 + B5Double / 1000)), R3) * (B4Double - B22Double) / Math.pow((B3Double / 1000 - B5Double / 1000), (2 * R3 + 1)) : 0 : 0;
                    double BC26 = (B4Double > 0 && B30Double > 0) ? B30Double <= (((Z24 + AU24 == 0) ? Q24 * 1000 : T24 * 1000) / 1.57) ? 1 : 2 : 0;
                    double BC29 = (B7Double > 0 && B30Double > 0) ? B30Double / 1000 <= R30 ? 1 : 2 : 0;
                    double BC33 = (B10Double > 0 && B30Double > 0) ? B30Double / 1000 <= R34 ? 1 : 2 : 0;
                    double AO20 = 4 * Math.pow((B37Double / 1000) * ((B38Double * 1000) - (B32Double * 1000)) / (B32Double * 1000), 0.5);
                    double AM20 = ((B33Double - B34Double) / 1000) * (AI20 - 6 * AK20) / ((B37Double / 1000) * (B32Double * 1000) * (18 + 0.61 * Math.pow(AI20, 0.5)));
                    double AQ20 = ((BC26 == 1 || BC26 == 0) && (BC29 == 1 || BC29 == 0) && (BC33 == 1 || BC33 == 0)) ? AM20 : AO20;

                    double L12 = M33 != 0 ? 1 : 0;
                    double L11 = M29 != 0 ? 1 : 0;
                    double L10 = 1;
                    double L9 = 1;
                    double M12 = M33;
                    double M11 = M29;
                    double M10 = M26;
                    double M9 = M25;
                    double L13 = L9 + L10 + L11 + L12;
                    double M13 = M9 + M10 + M11 + M12;
                    double O9 = M13 / L13;
                    double O10 = O9 - (AQ20 < 0 ? 0 : AQ20);
                    double O11 = (E2Double / O10) / 60;
                    double R12 = B11Double > 0 ? (100 * V4) / ((B30Double / 1000) * 60) : 0;
                    double R11 = B8Double > 0 ? (100 * V3) / ((B30Double / 1000) * 60) : 0;
                    double R9 = (B5Double > 0 && B23Double > 0) ? (100 * Y2) / ((B30Double / 1000) * 60) : 0;

                    E3.setText(String.valueOf(M8));
                    E4.setText(String.valueOf(S8));
                    E5.setText(String.valueOf(Y8));
                    E6.setText(String.valueOf(M8 + Y8));
                    E7.setText(String.valueOf(J9));
                    E8.setText(String.valueOf(J10));
                    E9.setText(String.valueOf(J9 + J10));
                    E10.setText(String.valueOf(O11));
                    E11.setText(String.valueOf(B10Double == 0 ? 0 : R12));
                    E12.setText(String.valueOf(B7Double == 0 ? 0 : R11));
                    E13.setText(String.valueOf(B4Double == 0 ? 0 : R10));
                    E14.setText(String.valueOf(R9));

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
        E1.addTextChangedListener(textWatcher);
        E2.addTextChangedListener(textWatcher);

    }
}