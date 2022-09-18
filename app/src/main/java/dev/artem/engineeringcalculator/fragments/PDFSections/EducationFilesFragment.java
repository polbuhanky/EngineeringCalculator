package dev.artem.engineeringcalculator.fragments.PDFSections;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;

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

import dev.artem.engineeringcalculator.Constants.Constant;
import dev.artem.engineeringcalculator.MainActivity;
import dev.artem.engineeringcalculator.R;
import dev.artem.engineeringcalculator.fragments.Calculator1Fragment;
import dev.artem.engineeringcalculator.fragments.Calculator2Fragment;
import dev.artem.engineeringcalculator.fragments.CalculatorContentSolidPhaseFragment;
import dev.artem.engineeringcalculator.fragments.CalculatorDrilingFluidsFragment;
import dev.artem.engineeringcalculator.fragments.CalculatorDrillPipeFragment;
import dev.artem.engineeringcalculator.fragments.CalculatorFallSolidControlFragment;
import dev.artem.engineeringcalculator.fragments.CalculatorFloculationFragment;
import dev.artem.engineeringcalculator.fragments.CalculatorFlowVelocityFragment;
import dev.artem.engineeringcalculator.fragments.CalculatorHydrauliclFragment;
import dev.artem.engineeringcalculator.fragments.CalculatorMortarFragment;
import dev.artem.engineeringcalculator.fragments.CalculatorMortarWeightingFragment;
import dev.artem.engineeringcalculator.fragments.CalculatorObsColonnaFragment;
import dev.artem.engineeringcalculator.fragments.CalculatorProductionSolidFragment;
import dev.artem.engineeringcalculator.fragments.CalculatorPumpCapacity;
import dev.artem.engineeringcalculator.fragments.CalculatorSolidControlFragment;
import dev.artem.engineeringcalculator.fragments.CalculatorSolidPhaseFragment;
import dev.artem.engineeringcalculator.fragments.PDFViewerFragment;

public class EducationFilesFragment extends Fragment {
    private RecyclerView menuRV;

    MainActivity activity;
    private View rootView;
    private String folderName;

    public EducationFilesFragment(String folderName){
        this.folderName = folderName;
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
            folders = getContext().getAssets().list("pdfs/" + folderName);
        } catch (IOException e) {
            Toast.makeText(getContext(), "Произошла ошибка при загрузки pdf файлов", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
        menuRV.setAdapter(new EducationFilesFragment.menuAdapter(activity, folders));

        return rootView;
    }

    class menuAdapter extends RecyclerView.Adapter<EducationFilesFragment.menuAdapter.ViewHolder>{
        private String[] data;
        private Context context;

        public menuAdapter(Context context, String[] data){
            this.context = context;
            this.data = data;
        }

        @NonNull
        @Override
        public EducationFilesFragment.menuAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.menu_item, parent, false);
            return new EducationFilesFragment.menuAdapter.ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull EducationFilesFragment.menuAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
            holder.itemTV.setText(data[position]);
            holder.backgroundItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d("Adapter", "position: " + position);
                    FragmentManager myFragmentManager = ((FragmentActivity)context).getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = myFragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.big_container, new PDFViewerFragment("pdfs" + "/"+ folderName+"/"+holder.itemTV.getText().toString()));
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }
            });
        }

        @Override
        public int getItemCount() {
            return data.length;
        }

        public class ViewHolder extends RecyclerView.ViewHolder{
            TextView itemTV;
            LinearLayout backgroundItem;

            ViewHolder(View view) {
                super(view);

                itemTV = view.findViewById(R.id.itemTV);
                backgroundItem = view.findViewById(R.id.backgroundItem);
            }
        }

    }
}

