package com.samet.androidstudiobootcampodevler.Odev6;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.samet.androidstudiobootcampodevler.databinding.FragmentOdev6TestBinding;


public class Odev6TestFragment extends Fragment {

    FragmentOdev6TestBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding=FragmentOdev6TestBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }
}