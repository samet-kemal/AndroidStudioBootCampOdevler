package com.samet.androidstudiobootcampodevler.Odev4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.samet.androidstudiobootcampodevler.R;
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

           Navigation.findNavController(view).navigate(R.id.action_sayfaAFragment_to_sayfaBFragment);


       });


        return binding.getRoot();
    }
}