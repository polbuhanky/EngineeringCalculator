package dev.artem.engineeringcalculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
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

import dev.artem.engineeringcalculator.fragments.MenuFragment;
import dev.artem.engineeringcalculator.utils.StatusBarUtils;

public class MainActivity extends AppCompatActivity {

    FragmentManager myFragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setNavigationBarColor(getResources().getColor(R.color.white));
        StatusBarUtils.setColor(this, getResources().getColor(R.color.teal_700), 0);

        init();
        initListeners();
    }

    private void init(){
        myFragmentManager = getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = myFragmentManager.beginTransaction();
        MenuFragment menuFragment = new MenuFragment();
        fragmentTransaction.add(R.id.big_container, menuFragment);
        fragmentTransaction.commit();
    }

    private void initListeners(){

    }
}