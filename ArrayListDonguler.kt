package com.nidakilic.lessonone.collections

fun main(){
val meyveler=ArrayList<String>()

    meyveler.add("çilek")
    meyveler.add("elma")
    meyveler.add("erik")
    meyveler.add("kiraz")

    for (meyve in meyveler){
        println("sonuc:$meyve")
    }
}