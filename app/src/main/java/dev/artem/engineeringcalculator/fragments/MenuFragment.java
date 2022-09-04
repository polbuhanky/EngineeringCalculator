package dev.artem.engineeringcalculator.fragments;

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

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import dev.artem.engineeringcalculator.Constants.Constant;
import dev.artem.engineeringcalculator.MainActivity;
import dev.artem.engineeringcalculator.R;

public class MenuFragment extends Fragment {
    private RecyclerView menuRV;

    MainActivity activity;
    private View rootView;

    public MenuFragment(){
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = (MainActivity) activity;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.menu, null);

        menuRV = rootView.findViewById(R.id.menuRV);
        menuRV.setAdapter(new menuAdapter(activity, Constant.CALCULATORS_NAMES));

        return rootView;
    }

    class menuAdapter extends RecyclerView.Adapter<MenuFragment.menuAdapter.ViewHolder>{
        private String[] data;

        private Context context;

        public menuAdapter(Context context, String[] data){
            this.context = context;
            this.data = data;
        }

        @NonNull
        @Override
        public MenuFragment.menuAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.menu_item, parent, false);
            return new MenuFragment.menuAdapter.ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull MenuFragment.menuAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
            holder.itemTV.setText(data[position]);
            holder.backgroundItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Log.d("Adapter", "position: " + position);

                    FragmentManager myFragmentManager = ((FragmentActivity)context).getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = myFragmentManager.beginTransaction();

                    switch (position){
                        case 0:
                            fragmentTransaction.replace(R.id.big_container, new Calculator1Fragment(Constant.CALCULATORS_NAMES[position]));
                            break;

                        case 1:
                            fragmentTransaction.replace(R.id.big_container, new Calculator2Fragment(Constant.CALCULATORS_NAMES[position]));
                            break;

                        case 2:
                            fragmentTransaction.replace(R.id.big_container, new CalculatorMortarFragment(Constant.CALCULATORS_NAMES[position]));
                            break;

                        case 3:
                            fragmentTransaction.replace(R.id.big_container, new CalculatorPumpCapacity(Constant.CALCULATORS_NAMES[position]));
                            break;

                        case 4:
                            fragmentTransaction.replace(R.id.big_container, new CalculatorDrillPipeFragment(Constant.CALCULATORS_NAMES[position]));
                            break;

                        case 5:
                            fragmentTransaction.replace(R.id.big_container, new CalculatorFlowVelocityFragment(Constant.CALCULATORS_NAMES[position]));
                            break;

                        case 6:
                            fragmentTransaction.replace(R.id.big_container, new CalculatorContentSolidPhaseFragment(Constant.CALCULATORS_NAMES[position]));
                            break;

                        case 7:
                            fragmentTransaction.replace(R.id.big_container, new CalculatorSolidPhaseFragment(Constant.CALCULATORS_NAMES[position]));
                            break;

                        case 8:
                            fragmentTransaction.replace(R.id.big_container, new CalculatorFloculationFragment(Constant.CALCULATORS_NAMES[position]));
                            break;

                        case 9:
                            fragmentTransaction.replace(R.id.big_container, new CalculatorSolidControlFragment(Constant.CALCULATORS_NAMES[position]));
                            break;

                        case 10:
                            fragmentTransaction.replace(R.id.big_container, new CalculatorFallSolidControlFragment(Constant.CALCULATORS_NAMES[position]));
                            break;

                        case 11:
                            fragmentTransaction.replace(R.id.big_container, new CalculatorProductionSolidFragment(Constant.CALCULATORS_NAMES[position]));
                            break;

                        default:
                            fragmentTransaction.replace(R.id.big_container, new Calculator1Fragment(Constant.CALCULATORS_NAMES[0]));
                    }
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
