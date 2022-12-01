package com.samet.androidstudiobootcampodevler;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.fragment.NavHostFragment;

import com.samet.androidstudiobootcampodevler.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        NavHostFragment navHostFragment=
                (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.AnasayfaFragmentContainerView);
        //NavController navController = navHostFragment.getNavController();
       //NavigationUI.setupWithNavController(navController);

    }
}