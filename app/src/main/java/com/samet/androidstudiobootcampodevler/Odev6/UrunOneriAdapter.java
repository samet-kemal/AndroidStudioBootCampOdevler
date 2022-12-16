package com.samet.androidstudiobootcampodevler.Odev6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.samet.androidstudiobootcampodevler.databinding.CardUrunOnerileriBinding;

import java.util.List;

public class UrunOneriAdapter extends RecyclerView.Adapter<UrunOneriAdapter.CardViewHolder>  {
    private Context mContext;
    private List<Urunler> UrunListesi;

    public UrunOneriAdapter(Context mContext, List<Urunler> urunListesi) {
        this.mContext = mContext;
        UrunListesi = urunListesi;
    }

    public class CardViewHolder extends RecyclerView.ViewHolder{
        private  CardUrunOnerileriBinding binding;
        public CardViewHolder(@NonNull CardUrunOnerileriBinding binding) {

            super(binding.getRoot());
            this.binding=binding;

        }
    }
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        CardUrunOnerileriBinding binding= CardUrunOnerileriBinding.inflate(LayoutInflater.from(mContext),parent,false);

        return new CardViewHolder(binding);
    }
    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {

        Urunler urun =UrunListesi.get(position);
        CardUrunOnerileriBinding t = holder.binding;

        t.imageViewUrun.setImageResource(mContext.getResources().getIdentifier(urun.getUrunFotoAdi(),"drawable",mContext.getPackageName()));
        t.textViewFiyat.setText(urun.getUrunFiyat()+"₺");
        t.textViewsatisMiktar.setText(String.valueOf(urun.getUrunSatisMiktar())+"Adet satıldı");
        t.textViewurunAciklama.setText(urun.getUrunAciklama());


        t.cardViewUtunOneriler.setOnClickListener(view->{

        });

    }

    @Override
    public int getItemCount() {
        return UrunListesi.size();
    }





}
