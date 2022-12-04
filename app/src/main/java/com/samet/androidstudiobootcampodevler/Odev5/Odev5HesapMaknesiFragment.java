package com.samet.androidstudiobootcampodevler.Odev5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.samet.androidstudiobootcampodevler.databinding.FragmentOdev5HesapMaknesiBinding;


public class Odev5HesapMaknesiFragment extends Fragment {

    FragmentOdev5HesapMaknesiBinding binding;
    int toplam=0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        binding= FragmentOdev5HesapMaknesiBinding.inflate(inflater, container, false);

        binding.button0.setOnClickListener(view->{
            if (Double.parseDouble(binding.editTextNumber.getText().toString())==0){
                binding.editTextNumber.setText("0");
            }else{
                binding.editTextNumber.setText(binding.editTextNumber.getText().toString()+"0");
            }        });

        binding.button1.setOnClickListener(view->{
            if (Double.parseDouble(binding.editTextNumber.getText().toString())==0){
                binding.editTextNumber.setText("1");
            }else{
                binding.editTextNumber.setText(binding.editTextNumber.getText().toString()+"1");
            }


        });
        binding.button2.setOnClickListener(view->{
            if (Integer.valueOf(binding.editTextNumber.getText().toString())==0){
                binding.editTextNumber.setText("2");
            }else{
                binding.editTextNumber.setText(binding.editTextNumber.getText().toString()+"2");
            }
        });
        binding.button3.setOnClickListener(view->{
            if (Integer.valueOf(binding.editTextNumber.getText().toString())==0){
                binding.editTextNumber.setText("3");
            }else{
                binding.editTextNumber.setText(binding.editTextNumber.getText().toString()+"3");
            }
        });
        binding.button4.setOnClickListener(view->{
            if (Integer.valueOf(binding.editTextNumber.getText().toString())==0){
                binding.editTextNumber.setText("4");
            }else{
                binding.editTextNumber.setText(binding.editTextNumber.getText().toString()+"4");
            }
        });
        binding.button5.setOnClickListener(view->{
            if (Integer.valueOf(binding.editTextNumber.getText().toString())==0){
                binding.editTextNumber.setText("5");
            }else{
                binding.editTextNumber.setText(binding.editTextNumber.getText().toString()+"5");
            }
        });
        binding.button6.setOnClickListener(view->{
            if (Integer.valueOf(binding.editTextNumber.getText().toString())==0){
                binding.editTextNumber.setText("6");
            }else{
                binding.editTextNumber.setText(binding.editTextNumber.getText().toString()+"6");
            }
        });
        binding.button7.setOnClickListener(view->{
            if (Integer.valueOf(binding.editTextNumber.getText().toString())==0){
                binding.editTextNumber.setText("7");
            }else{
                binding.editTextNumber.setText(binding.editTextNumber.getText().toString()+"7");
            }
        });
        binding.button8.setOnClickListener(view->{
            if (Integer.valueOf(binding.editTextNumber.getText().toString())==0){
                binding.editTextNumber.setText("8");
            }else{
                binding.editTextNumber.setText(binding.editTextNumber.getText().toString()+"8");
            }
        });
        binding.button9.setOnClickListener(view->{
            if (Integer.valueOf(binding.editTextNumber.getText().toString())==0){
                binding.editTextNumber.setText("9");
            }else{
                binding.editTextNumber.setText(binding.editTextNumber.getText().toString()+"9");
            }        });

        binding.buttonTopla.setOnClickListener(view->{
            int sayi=Integer.valueOf(binding.editTextNumber.getText().toString());
            toplam=toplam+sayi;
            binding.editTextNumber.setText(""+toplam);

        });

        binding.buttonTemizle.setOnClickListener(view->{
            toplam=0;
            binding.editTextNumber.setText("0");
        });

        binding.buttonEsittir.setOnClickListener(view->{

            binding.editTextNumber2.setText("Toplam="+toplam);
        });

        binding.buttonSil.setOnClickListener(view->{
            binding.editTextNumber.setText("0");
        });

        return binding.getRoot();
    }
}