package dev.artem.engineeringcalculator;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Build;
import android.os.Bundle;

import dev.artem.engineeringcalculator.fragments.MainMenuFragment;
import dev.artem.engineeringcalculator.utils.StatusBarUtils;

public class MainActivity extends AppCompatActivity {

    FragmentManager myFragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setNavigationBarColor(getResources().getColor(R.color.white));
        StatusBarUtils.setColor(this, getResources().getColor(R.color.grey), 0);

        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setNavigationBarColor(getResources().getColor(R.color.BarColor));
        }

        init();
        initListeners();
    }

    private void init(){
        myFragmentManager = getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = myFragmentManager.beginTransaction();
        MainMenuFragment mainMenuFragment = new MainMenuFragment();
        fragmentTransaction.add(R.id.big_container, mainMenuFragment);
        fragmentTransaction.commit();
    }

    private void initListeners(){

    }
}