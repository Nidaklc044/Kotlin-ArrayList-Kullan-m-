package com.nidakilic.lessonone.collections

fun main(){
    val k1=Kisiler(1,"Ahmet")
    val k2= Kisiler(2,"Ayşe")
    val k3=Kisiler(3,"Ali")

    val kisilerArrayList=ArrayList<Kisiler>()
    kisilerArrayList.add(k1)
    kisilerArrayList.add(k2)
    kisilerArrayList.add(k3)

    println("önce")

    for (k in kisilerArrayList){
        println("k:${k.kisiNo},${k.kisiAdı}")


    }
}