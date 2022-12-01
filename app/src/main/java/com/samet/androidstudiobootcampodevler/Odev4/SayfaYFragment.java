package com.samet.androidstudiobootcampodevler.Odev4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.samet.androidstudiobootcampodevler.databinding.FragmentSayfaYBinding;

public class SayfaYFragment extends Fragment {

    private FragmentSayfaYBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding=FragmentSayfaYBinding.inflate(inflater, container, false);


        return binding.getRoot();


    }



}