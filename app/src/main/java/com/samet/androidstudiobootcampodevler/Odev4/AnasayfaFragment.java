package com.samet.androidstudiobootcampodevler.Odev4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.samet.androidstudiobootcampodevler.databinding.FragmentAnasayfaBinding;

public class AnasayfaFragment extends Fragment {

private FragmentAnasayfaBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding=FragmentAnasayfaBinding.inflate(inflater, container, false);

        binding.buttonGitA.setOnClickListener(view->{

         //   AnasayfaFragmentDirections


        });



        return binding.getRoot();
    }
}