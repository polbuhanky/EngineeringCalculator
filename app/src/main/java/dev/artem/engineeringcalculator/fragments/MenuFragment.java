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

import dev.artem.engineeringcalculator.MainActivity;
import dev.artem.engineeringcalculator.R;

public class MenuFragment extends Fragment {
    private RecyclerView menuRV;
    String[] data = {"Необходимая плотность при смешивании растворов", "Изменение плотности при добавлении раствора"};

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
        menuRV.setAdapter(new menuAdapter(activity, data));

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
                            fragmentTransaction.replace(R.id.big_container, new Calculator1Fragment());
                            break;

                        case 1:
                            fragmentTransaction.replace(R.id.big_container, new Calculator2Fragment());
                            break;

                        default:
                            fragmentTransaction.replace(R.id.big_container, new Calculator1Fragment());
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
