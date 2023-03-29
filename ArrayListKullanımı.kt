package com.nidakilic.lessonone.collections

fun main(){
    //tanımlama
    val meyveler=ArrayList<String>()

    //veri ekleme

    meyveler.add("elma")
    meyveler.add("erik")
    meyveler.add("kiraz")

    println(meyveler)

    //güncelleme
    meyveler[1]="yeni erik"
    println(meyveler)

    //ekleme
    meyveler.add(1,"çilek")
    println(meyveler)

    //okuma
    println(meyveler.get(2))
    println(meyveler[0])
}