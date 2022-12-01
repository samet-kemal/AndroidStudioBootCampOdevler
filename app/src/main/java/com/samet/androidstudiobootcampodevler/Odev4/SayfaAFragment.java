package com.samet.androidstudiobootcampodevler.Odev4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.samet.androidstudiobootcampodevler.databinding.FragmentSayfaABinding;


public class SayfaAFragment extends Fragment {


private FragmentSayfaABinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding= FragmentSayfaABinding.inflate(inflater, container, false);
       binding.buttonGitB.setOnClickListener(view->{

          // AnasayfaFragmentDirections

       });


        return binding.getRoot();
    }
}