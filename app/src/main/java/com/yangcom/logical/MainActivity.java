package com.yangcom.logical;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;

    private IntroFragment fragmentIntro;
    private IntentFragment fragmentIntent;
    private CalmFragment fragmentCalm;
    private ThirdFragment fragmentThird;
    private SimulateFragment fragmentSim;
    private FragmentTransaction transaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();

        fragmentIntro = new IntroFragment();
        fragmentCalm = new CalmFragment();
        fragmentIntent = new IntentFragment();
        fragmentThird = new ThirdFragment();
        fragmentSim = new SimulateFragment();

        transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frameLayout, fragmentIntro).commitAllowingStateLoss();
    }

    public void clickHandler(View view)
    {
        transaction = fragmentManager.beginTransaction();

        switch(view.getId())
        {
            case R.id.btn_fragmentCalm:
                transaction.replace(R.id.frameLayout, fragmentCalm).commitAllowingStateLoss();
                break;
            case R.id.btn_fragmentIntent:
                transaction.replace(R.id.frameLayout, fragmentIntent).commitAllowingStateLoss();
                break;
            case R.id.btn_fragmentThird:
                transaction.replace(R.id.frameLayout, fragmentThird).commitAllowingStateLoss();
                break;
            case R.id.btn_fragmentSimulation:
                transaction.replace(R.id.frameLayout, fragmentSim).commitAllowingStateLoss();
                break;
        }
    }
}
