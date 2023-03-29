package com.nidakilic.lessonone.collections

fun main(){
    val u1=ürünler(1,"telefon",6000)
    val u2=ürünler(2,"pc",9000)
    val u3=ürünler(3,"saat",700)

    var ürünlerListesi=ArrayList<ürünler>()
    ürünlerListesi.add(u1)
    ürünlerListesi.add(u2)
    ürünlerListesi.add(u3)
    for(u in ürünlerListesi){
        println("id:${u.id}- ad:${u.ad}-fiyat:${u.fiyat}")

        println("fiyat artan")
var siralaması=ürünlerListesi.sortedWith(compareBy{it.fiyat})
for(u in siralaması){
        println("id:${u.id}- ad:${u.ad}-fiyat:${u.fiyat}")
    }
}}