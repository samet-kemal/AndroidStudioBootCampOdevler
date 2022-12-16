package com.samet.androidstudiobootcampodevler.Odev6;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.samet.androidstudiobootcampodevler.databinding.FragmentAliExpressDemoBinding;

import java.util.ArrayList;
import java.util.List;

public class AliExpressDemoFragment extends Fragment {

    FragmentAliExpressDemoBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding= FragmentAliExpressDemoBinding.inflate(inflater, container, false);


        binding.urunOnerileriRv.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        List<Urunler> urunlerList = urunleriYukle();
        UrunOneriAdapter adapter = new UrunOneriAdapter(getContext(),urunlerList);
        binding.urunOnerileriRv.setAdapter(adapter);
        return binding.getRoot();

    }


    public List<Urunler> urunleriYukle(){

        ArrayList<Urunler> urunlers = new ArrayList<>();
        Urunler u1= new Urunler(1,362.50,"Erkek Ayakkabı",32,"u2foto2");
        Urunler u2= new Urunler(1,362.50,"Erkek Ayakkabı",32,"u2foto2");
        Urunler u3= new Urunler(1,362.50,"Erkek Ayakkabı",32,"u2foto2");
        Urunler u4= new Urunler(1,362.50,"Erkek Ayakkabı",32,"u2foto2");
        Urunler u5= new Urunler(1,362.50,"Erkek Ayakkabı",32,"u2foto2");
        Urunler u6= new Urunler(1,362.50,"Erkek Ayakkabı",32,"u2foto2");


        urunlers.add(u1);
        urunlers.add(u2);
        urunlers.add(u3);
        urunlers.add(u4);
        urunlers.add(u5);
        urunlers.add(u6);



        return urunlers;



    }






}