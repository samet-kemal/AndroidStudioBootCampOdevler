package com.samet.androidstudiobootcampodevler.Odev4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.samet.androidstudiobootcampodevler.R;
import com.samet.androidstudiobootcampodevler.databinding.FragmentSayfaBBinding;

public class SayfaBFragment extends Fragment {

private FragmentSayfaBBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding= FragmentSayfaBBinding.inflate(inflater, container, false);
       binding.buttonGitYfromB.setOnClickListener(view->{

           Navigation.findNavController(view).navigate(R.id.action_sayfaBFragment_to_sayfaYFragment);

       });


        return binding.getRoot();
    }


}