package com.samet.androidstudiobootcampodevler.Odev6;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {
    public PagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AliExpressDemoFragment();
        } else  {
            return new Odev6TestFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
