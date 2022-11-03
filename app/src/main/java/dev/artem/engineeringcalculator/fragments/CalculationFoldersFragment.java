package dev.artem.engineeringcalculator.fragments;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import dev.artem.engineeringcalculator.Constants.Constant;
import dev.artem.engineeringcalculator.MainActivity;
import dev.artem.engineeringcalculator.R;
import dev.artem.engineeringcalculator.fragments.calculators.CNCFragment;
import dev.artem.engineeringcalculator.fragments.calculators.Calculator1Fragment;
import dev.artem.engineeringcalculator.fragments.calculators.Calculator2Fragment;
import dev.artem.engineeringcalculator.fragments.calculators.CalculatorContentSolidPhaseFragment;
import dev.artem.engineeringcalculator.fragments.calculators.CalculatorDrilingFluidsFragment;
import dev.artem.engineeringcalculator.fragments.calculators.CalculatorDrillPipeFragment;
import dev.artem.engineeringcalculator.fragments.calculators.CalculatorEPBRFragment;
import dev.artem.engineeringcalculator.fragments.calculators.CalculatorFallSolidControlFragment;
import dev.artem.engineeringcalculator.fragments.calculators.CalculatorFloculationFragment;
import dev.artem.engineeringcalculator.fragments.calculators.CalculatorFlowVelocityFragment;
import dev.artem.engineeringcalculator.fragments.calculators.CalculatorHydrauliclFragment;
import dev.artem.engineeringcalculator.fragments.calculators.CalculatorMortarFragment;
import dev.artem.engineeringcalculator.fragments.calculators.CalculatorMortarWeightingFragment;
import dev.artem.engineeringcalculator.fragments.calculators.CalculatorObsColonnaFragment;
import dev.artem.engineeringcalculator.fragments.calculators.CalculatorProductionSolidFragment;
import dev.artem.engineeringcalculator.fragments.calculators.CalculatorPumpCapacity;
import dev.artem.engineeringcalculator.fragments.calculators.CalculatorPumpSupplyFragment;
import dev.artem.engineeringcalculator.fragments.calculators.CalculatorRheologyLiquidsFragment;
import dev.artem.engineeringcalculator.fragments.calculators.CalculatorSolidCalculationMethodFragment;
import dev.artem.engineeringcalculator.fragments.calculators.CalculatorSolidControlFragment;
import dev.artem.engineeringcalculator.fragments.calculators.CalculatorSolidPhaseFragment;
import dev.artem.engineeringcalculator.fragments.calculators.CalculatorVolumeDensityFragment;
import dev.artem.engineeringcalculator.fragments.calculators.HydraulicsFragment;
import dev.artem.engineeringcalculator.fragments.calculators.SwabSurgeFragment;
import dev.artem.engineeringcalculator.fragments.calculators.VolumeForFragment;
import dev.artem.engineeringcalculator.utils.ComparatorFolders;

public class CalculationFoldersFragment extends Fragment {
    private RecyclerView menuRV;

    MainActivity activity;
    private View rootView;
    private String path = "";

    public CalculationFoldersFragment(String path) {
        if (path != null) {
            this.path = path + "/";
        }
    }

    public CalculationFoldersFragment() {

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = (MainActivity) activity;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.menu, null);
        menuRV = rootView.findViewById(R.id.menuRV);
        String[] folders = new String[0];
        try {
            folders = getContext().getAssets().list("calculators" + "/" + path);
            folders = sortDirectories(folders);
//            List<String> list = sortAsNumbers(folders);
//            folders = list.toArray(new String[0]);
        } catch (IOException e) {
            Toast.makeText(getContext(), "Произошла ошибка при загрузке данных", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
        menuRV.setAdapter(new menuAdapter(activity, new ArrayList<>(Arrays.asList(folders))));

        return rootView;
    }

    class menuAdapter extends RecyclerView.Adapter<menuAdapter.ViewHolder> {
        private ArrayList<String> data;

        private Context context;

        public menuAdapter(Context context, ArrayList<String> data) {
            this.context = context;
            this.data = data;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.menu_item, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {

            holder.backgroundItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d("Adapter", "position: " + position);
                    FragmentManager myFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = myFragmentManager.beginTransaction();
                    String selectedText = holder.itemTV.getText().toString();
                    if (data.get(position).contains("$")) {
                        openCalculator(data.get(position));
                    } else {
                        fragmentTransaction.replace(R.id.big_container, new CalculationFoldersFragment(path + selectedText));
                    }
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }
            });
            try {
                holder.itemTV.setText(data.get(position).replaceFirst("\\$", ""));

            }
            catch (Exception ignored){
                ignored.printStackTrace();
            }
        }

        private void openCalculator(String str) {
            FragmentManager myFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = myFragmentManager.beginTransaction();
            switch (str.substring(str.indexOf('.') + 2)) {
                case "Необходимая плотность при смешивании растворов":
                    fragmentTransaction.replace(R.id.big_container, new Calculator1Fragment(str));
                    break;

                case "Изменение плотности при добавлении раствора":
                    fragmentTransaction.replace(R.id.big_container, new Calculator2Fragment(str));
                    break;

                case "Утяжеление раствора":
                    fragmentTransaction.replace(R.id.big_container, new CalculatorMortarFragment(str));
                    break;

                case "Производительность двухцилиндрового насоса":
                    fragmentTransaction.replace(R.id.big_container, new CalculatorPumpCapacity(str));
                    break;

                case "Объём скважины - бур. труб - обс. колонны":
                    fragmentTransaction.replace(R.id.big_container, new CalculatorDrillPipeFragment(str));
                    break;

                case "Скорость потока раствора в затрубъе скважины":
                    fragmentTransaction.replace(R.id.big_container, new CalculatorFlowVelocityFragment(str));
                    break;

                case "Определение содержания твёрдой фазы расчётным методом":
                    fragmentTransaction.replace(R.id.big_container, new CalculatorContentSolidPhaseFragment(str));
                    break;

                case "Определение содержания твёрдой фазы по реторте":
                    fragmentTransaction.replace(R.id.big_container, new CalculatorSolidPhaseFragment(str));
                    break;

                case "Контроль плотности центрифугой, методом 'FLOCULATION'":
                    fragmentTransaction.replace(R.id.big_container, new CalculatorFloculationFragment(str));
                    break;

                case "Контроль плотности при бурении, методом 'SOLID CONTROL'":
                    fragmentTransaction.replace(R.id.big_container, new CalculatorSolidControlFragment(str));
                    break;

                case "Снижение плотности центрифугой, методом 'SOLID CONTROL'":
                    fragmentTransaction.replace(R.id.big_container, new CalculatorFallSolidControlFragment(str));
                    break;

                case "Наработка твёрдой фазы в растворе в процессе бурения":
                    fragmentTransaction.replace(R.id.big_container, new CalculatorProductionSolidFragment(str));
                    break;

                case "Гидравлические расчёты":
                    fragmentTransaction.replace(R.id.big_container, new CalculatorHydrauliclFragment(str));
                    break;

                case "Реология буровых растворов в скважине":
                    fragmentTransaction.replace(R.id.big_container, new CalculatorDrilingFluidsFragment(str));
                    break;

                case "Объём скважины - бур. труб - обс. колонны 2":
                    fragmentTransaction.replace(R.id.big_container, new CalculatorObsColonnaFragment(str));
                    break;

                case "Утяжеление раствора 2":
                    fragmentTransaction.replace(R.id.big_container, new CalculatorMortarWeightingFragment(str));
                    break;

                case "Реология  жидкостей, в вискозиметре 'FANN'":
                    fragmentTransaction.replace(R.id.big_container, new CalculatorRheologyLiquidsFragment(str));
                    break;

                case "Определение содержания тв. фазы в р-ре расчётным методом":
                    fragmentTransaction.replace(R.id.big_container, new CalculatorSolidCalculationMethodFragment(str));
                    break;

                case "Зависимость объёмного содержания тв. фазы плотностью 2.6г на см3 от плотности пресного бурового раствора и содержания нефти":
                    fragmentTransaction.replace(R.id.big_container, new CalculatorVolumeDensityFragment(str));
                    break;

                case "Скорость р-ра в затрубье при  Q=1м3 на мин":
                    fragmentTransaction.replace(R.id.big_container, new CalculatorPumpSupplyFragment(str));
                    break;

                case "Гидравлика":
                    fragmentTransaction.replace(R.id.big_container, new HydraulicsFragment(str));
                    break;

                case "ЭПЦБР":
                    fragmentTransaction.replace(R.id.big_container, new CalculatorEPBRFragment(str));
                    break;

                case "Рассчёт влияния поршневания на давление в скважине при СПО":
                    fragmentTransaction.replace(R.id.big_container, new SwabSurgeFragment(str));
                    break;

                case "Рассчёт влияния СНС на давление в скважине":
                    fragmentTransaction.replace(R.id.big_container, new CNCFragment(str));
                    break;

                case "Объёмы и циклы":
                    fragmentTransaction.replace(R.id.big_container, new VolumeForFragment(str));
                    break;
                default:
                    Log.e("openCalc", "str: " + str.substring(str.indexOf('.') + 2));
                    fragmentTransaction.replace(R.id.big_container, new Calculator1Fragment(Constant.CALCULATORS_NAMES[0]));
            }
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();

        }

        @Override
        public int getItemCount() {
            return data.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            TextView itemTV;
            LinearLayout backgroundItem;

            ViewHolder(View view) {
                super(view);
                itemTV = view.findViewById(R.id.itemTV);
                backgroundItem = view.findViewById(R.id.backgroundItem);
            }
        }

    }



    public static String [] sortDirectories(String [] a) {
        ArrayList<String> arrayForFolders = new ArrayList<>();
        ArrayList<String> arrayForCalculators = new ArrayList<>();
        ArrayList<String> arrayForPdfs = new ArrayList<>();
        String[] resultArray = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i].contains("$")) {
                arrayForCalculators.add(a[i]);
            }
            else if(a[i].contains(".pdf")) {
                arrayForPdfs.add(a[i]);
            }
            else {
                arrayForFolders.add(a[i]);
            }
        }
        for (int i = 0; i < arrayForCalculators.size(); i++) {
            arrayForCalculators.set(i, arrayForCalculators.get(i).replaceFirst(" ", "~"));
        }
        for (int i = 0; i < arrayForFolders.size(); i++) {
            arrayForFolders.set(i, arrayForFolders.get(i).replaceFirst(" ", "~"));
        }
        for (int i = 0; i < arrayForPdfs.size(); i++) {
            arrayForPdfs.set(i, arrayForPdfs.get(i).replaceFirst(" ", "~"));
        }
        Collections.sort(arrayForFolders, new ComparatorFolders());
        Collections.sort(arrayForCalculators, new ComparatorFolders());
        Collections.sort(arrayForPdfs, new ComparatorFolders());
        for (int i = 0; i < arrayForFolders.size(); i++) {
            resultArray[i] = arrayForFolders.get(i);
        }
        for (int i = 0; i < arrayForPdfs.size(); i++) {
            resultArray[arrayForFolders.size() + i] = arrayForPdfs.get(i);
        }
        for (int i = 0; i < arrayForCalculators.size(); i++) {
            resultArray[arrayForFolders.size() + arrayForPdfs.size() + i] = arrayForCalculators.get(i);
        }
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = resultArray[i].replaceFirst("~", " ");
        }
        return resultArray;
    }

}

