package dev.artem.engineeringcalculator;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import dev.artem.engineeringcalculator.fragments.MenuFragment;
import dev.artem.engineeringcalculator.utils.StatusBarUtils;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    FragmentManager myFragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int mounth = calendar.get(Calendar.MONTH);
        if(day < 31 && mounth == 7){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }
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