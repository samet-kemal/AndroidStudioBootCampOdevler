package com.samet.androidstudiobootcampodevler.Odev2;

public class Odev2Sorular {

   public double donustur(double km){

      double mil = km*0.61;
      return mil;
   }

   public double alanHesapla(double kenar1,double kenar2){

      double alan= kenar1*kenar2;
      return  alan;

   }

   public int faktoriyel(int sayi){
      int faktor=1;
      for (int i = sayi; i >= 1; --i){
         faktor=faktor*i;

      }
      return faktor;

   }

   public int eBul(String kelime){

      int sayac=0;
      for (int i=1;i<kelime.length();i++){
         char harf=kelime.charAt(i);
         if (harf=='e'){
            sayac++;
         }
      }
      return sayac;

   }

   public double icAcilarToplamı(int kenarSayisi){
      double toplam=(kenarSayisi-2)*180;
      double icAci=toplam/kenarSayisi;
      System.out.println("Çokgenin bir iç açısı "+icAci+" derecedir");
      return toplam;
   }




   public double maasHesapla(int calisilanGun){
      double maas=0;
      if (calisilanGun<18.75){
         maas=calisilanGun*8*40;
      }else{
         double mesaiGunu=calisilanGun-18.75;
         double normalGunMaasi=calisilanGun-mesaiGunu;
         maas=mesaiGunu*8*80+normalGunMaasi*8*40;
      }
      return maas;
   }

   public double otoparkUcreti(int sure){
      double ucret =0;
      if (sure==1){
         ucret=50;

      }else{

         int asimSuresi=sure-1;
         ucret=asimSuresi*10+50;

      }
      return ucret;
   }





}
