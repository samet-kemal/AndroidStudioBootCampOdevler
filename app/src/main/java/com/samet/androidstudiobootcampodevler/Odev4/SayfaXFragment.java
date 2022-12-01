package com.samet.androidstudiobootcampodevler.Odev4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.samet.androidstudiobootcampodevler.databinding.FragmentSayfaXBinding;

public class SayfaXFragment extends Fragment {

private FragmentSayfaXBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding = FragmentSayfaXBinding.inflate(inflater, container, false);

       binding.buttonGitYfromX.setOnClickListener(view->{

       });

        return binding.getRoot();
    }
}