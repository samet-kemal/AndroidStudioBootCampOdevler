package com.samet.androidstudiobootcampodevler.Odev2;

public class Odev2Main {
    public static void main(String[] args) {
            Odev2Sorular o= new Odev2Sorular();
            double donusum= o.donustur(90);

        System.out.println(90+"km="+donusum+"mil");
        System.out.println("-------------------------------");

            double alan=o.alanHesapla(45,96.5);
        System.out.println("Alan="+alan);
        System.out.println("-------------------------------");

               int faktoriyel=o.faktoriyel(6);
        System.out.println(6+"faktöriyel="+faktoriyel);
        System.out.println("-------------------------------");

               int eTekrar= o.eBul("kelebek");
        System.out.println("kelebek kelimesinde "+eTekrar+" tane e vardır");
        System.out.println("-------------------------------");


                double icAcilar=o.icAcilarToplamı(9);
        System.out.println("iç Açıllar Toplamı "+icAcilar+" derecedir");
        System.out.println("-------------------------------");

               double maas=o.maasHesapla(19);
        System.out.println("Maaş Toplamı: "+maas+" tl dir");
        System.out.println("-------------------------------");

                double otopark=o.otoparkUcreti(8);
        System.out.println("Otopark Ucreti Toplamı: "+otopark+" tl dir");
        System.out.println("-------------------------------");
    }
}
