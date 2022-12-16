package com.samet.androidstudiobootcampodevler.Odev6;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import com.google.android.material.tabs.TabLayout;
import com.samet.androidstudiobootcampodevler.R;
import com.samet.androidstudiobootcampodevler.databinding.ActivityOdev6Binding;


public class Odev6Activity extends AppCompatActivity implements SearchView.OnQueryTextListener {

    private ActivityOdev6Binding binding;


    private TabLayout tabLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityOdev6Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //binding.odev6ToolBar.setTitle();
        setSupportActionBar(binding.odev6ToolBar);
        tabLayout = binding.tabLayoutToolBar;

            tabLayout.addTab(tabLayout.newTab().setText("Explore"));
            tabLayout.addTab(tabLayout.newTab().setText("PLUS"));
            tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
            binding.tabLayoutToolBar.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                @Override
                public void onTabSelected(TabLayout.Tab tab) {
                    if (tab.getPosition()==0){
                        Fragment fragment = new Fragment();
                        getFragmentManager()
                                .beginTransaction().replace(R.id.aliExpressDemoFragment, fragment).commit();
                    }else{
                        Fragment fragment = new Fragment();
                        getFragmentManager()
                                .beginTransaction().replace(R.id.odev6TestFragment, fragment).commit();
                    }
                }

                @Override
                public void onTabUnselected(TabLayout.Tab tab) {

                }

                @Override
                public void onTabReselected(TabLayout.Tab tab) {

                }


    });


}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu,menu);
        final MenuItem item=menu.findItem(R.id.action_search);
        final SearchView searchView = (SearchView) item.getActionView();

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        Log.e("Aranan kelime:",query);
        return true;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        Log.e("Aranan kelime:",newText);
        return false;
    }
}