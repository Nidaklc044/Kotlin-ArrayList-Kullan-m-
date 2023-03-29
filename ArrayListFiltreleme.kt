package com.nidakilic.lessonone.collections

fun main(){
    val o1=Ogrenci(1,"Ali","11A")
    val o2=Ogrenci(2,"Ahmet","9C")
    val o3=Ogrenci(3,"Mehmet","10A")

    val ogrenciler=ArrayList<Ogrenci>()
    ogrenciler.add(o1)
    ogrenciler.add(o2)
    ogrenciler.add(o3)
    
    val sonucListe=ogrenciler.filter { it.no>2 }// no 2 den büyük olanları bana getir
    for(o in sonucListe){
        println("*****************")
        println("ogrenci no:${o.no}")
        println("ogrenci ad:${o.ad}")
        println("ogrenci sınıf:${o.sinif}")
    }
    val sonucListesi=ogrenciler.filter{(it.ad).contains("A")}// içinde a harfi olanlar


    for(o in sonucListesi){
        println("*****************")
        println("ogrenci no:${o.no}")
        println("ogrenci ad:${o.ad}")
        println("ogrenci sınıf:${o.sinif}")
    }

}