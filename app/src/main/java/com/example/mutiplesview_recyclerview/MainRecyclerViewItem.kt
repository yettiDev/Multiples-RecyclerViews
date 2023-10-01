package com.example.mutiplesview_recyclerview

sealed class MainRecyclerViewItem {

class cabecalho(
    val image:Int

):MainRecyclerViewItem()

class Personagens(
    val image:Int,
    val nome:String,
    val filme:String
    ):MainRecyclerViewItem()

}