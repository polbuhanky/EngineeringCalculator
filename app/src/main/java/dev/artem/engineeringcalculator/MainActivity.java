package dev.artem.engineeringcalculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
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

    private RecyclerView menuRV;
    String[] data = {"Необходимая плотность при смешивании растворов", "Изменение плотности при добавлении раствора"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        initListeners();
    }

    private void init(){
        menuRV = findViewById(R.id.menuRV);
        menuRV.setAdapter(new menuAdapter(data));
    }

    private void initListeners(){

    }

    class menuAdapter extends RecyclerView.Adapter<menuAdapter.ViewHolder>{
        private String[] data;

        public menuAdapter(String[] data){
            this.data = data;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.menu_item, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
            holder.itemTV.setText(data[position]);
            holder.backgroundItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent;

                    Log.d("Adapter", "position: " + position);

                    switch (position){
                        case 0:
                            intent = new Intent(MainActivity.this, Calculator1.class);
                            break;

                        case 1:
                            intent = new Intent(MainActivity.this, Calculator2.class);
                            break;

                        default:
                            intent = new Intent(MainActivity.this, Calculator1.class);
                    }

                    startActivity(intent);
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