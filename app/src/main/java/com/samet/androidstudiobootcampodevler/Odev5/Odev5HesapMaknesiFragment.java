package com.samet.androidstudiobootcampodevler.Odev5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.samet.androidstudiobootcampodevler.databinding.FragmentOdev5HesapMaknesiBinding;


public class Odev5HesapMaknesiFragment extends Fragment {

    FragmentOdev5HesapMaknesiBinding binding;
    double toplam=0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        binding= FragmentOdev5HesapMaknesiBinding.inflate(inflater, container, false);

        binding.button0.setOnClickListener(view->{
            binding.editTextNumber.setText("0");
        });

        binding.button1.setOnClickListener(view->{
            binding.editTextNumber.setText("1");

        });
        binding.button2.setOnClickListener(view->{
            binding.editTextNumber.setText("2");

        });
        binding.button3.setOnClickListener(view->{
            binding.editTextNumber.setText("3");

        });
        binding.button4.setOnClickListener(view->{
            binding.editTextNumber.setText("4");

        });
        binding.button5.setOnClickListener(view->{
            binding.editTextNumber.setText("5");

        });
        binding.button6.setOnClickListener(view->{
            binding.editTextNumber.setText("6");

        });
        binding.button7.setOnClickListener(view->{
            binding.editTextNumber.setText("7");

        });
        binding.button8.setOnClickListener(view->{
            binding.editTextNumber.setText("8");

        });
        binding.button9.setOnClickListener(view->{
            binding.editTextNumber.setText("9");
        });

        binding.buttonTopla.setOnClickListener(view->{
            double sayi=Double.parseDouble(binding.editTextNumber.getText().toString());
            toplam=toplam+sayi;
            binding.editTextNumber.setText(""+toplam);

        });

        binding.buttonTemizle.setOnClickListener(view->{
            toplam=0;
            binding.editTextNumber.setText("0");
        });

        binding.buttonEsittir.setOnClickListener(view->{

            binding.editTextNumber.setText("Sonuc:"+toplam);
        });

        return binding.getRoot();
    }
}