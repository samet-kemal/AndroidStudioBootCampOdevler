package com.samet.androidstudiobootcampodevler.Odev6;

import java.io.Serializable;

public class Urunler implements Serializable {

   private int id;


   private double urunFiyat;
   private String urunAciklama;
   private int UrunSatisMiktar;
   private String urunFotoAdi;


   public Urunler(int id, double urunFiyat, String urunAciklama, int urunSatisMiktar, String urunFotoAdi) {
      this.id = id;
      this.urunFiyat = urunFiyat;
      this.urunAciklama = urunAciklama;
      UrunSatisMiktar = urunSatisMiktar;
      this.urunFotoAdi = urunFotoAdi;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public double getUrunFiyat() {
      return urunFiyat;
   }

   public void setUrunFiyat(double urunFiyat) {
      this.urunFiyat = urunFiyat;
   }

   public String getUrunAciklama() {
      return urunAciklama;
   }

   public void setUrunAciklama(String urunAciklama) {
      this.urunAciklama = urunAciklama;
   }

   public int getUrunSatisMiktar() {
      return UrunSatisMiktar;
   }

   public void setUrunSatisMiktar(int urunSatisMiktar) {
      UrunSatisMiktar = urunSatisMiktar;
   }

   public String getUrunFotoAdi() {
      return urunFotoAdi;
   }

   public void setUrunFotoAdi(String urunFotoAdi) {
      this.urunFotoAdi = urunFotoAdi;
   }
}
