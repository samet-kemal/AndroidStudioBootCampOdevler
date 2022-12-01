package com.samet.androidstudiobootcampodevler.Odev4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.samet.androidstudiobootcampodevler.R;
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

            Navigation.findNavController(view).navigate(R.id.action_anasayfaFragment_to_sayfaAFragment);


        });

        binding.buttonGitX.setOnClickListener(view->{

            //   AnasayfaFragmentDirections

            Navigation.findNavController(view).navigate(R.id.action_anasayfaFragment_to_sayfaXFragment);


        });



        return binding.getRoot();
    }
}