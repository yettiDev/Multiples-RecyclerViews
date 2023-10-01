package com.example.mutiplesview_recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mutiplesview_recyclerview.databinding.ResHeaderView1Binding
import com.example.mutiplesview_recyclerview.databinding.ResPersongaemView2Binding
import java.lang.IllegalArgumentException

class MainRecyclerViewAdapter: RecyclerView.Adapter<MainRecyclerViewHolder>() {
    var list = mutableListOf<MainRecyclerViewItem>()

    fun setListData(list:MutableList<MainRecyclerViewItem>){
      this.list=list
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainRecyclerViewHolder {
        return when(viewType){
            PERSONAGENS -> MainRecyclerViewHolder.PersonagemViewHolder(
                ResPersongaemView2Binding.inflate(LayoutInflater.from(parent.context), parent, false)

            )
            CABECALHO -> MainRecyclerViewHolder.CabecalhoViewHolder(
                ResHeaderView1Binding.inflate(LayoutInflater.from(parent.context), parent, false)

            )

            else -> throw IllegalArgumentException ("ARGUMENTO INVÁLIDO")
        }
    }


    override fun getItemCount(): Int = list.size


    override fun getItemViewType(position: Int): Int {
        return when(
            list[position]){
            is MainRecyclerViewItem.Personagens -> PERSONAGENS
            is  MainRecyclerViewItem.cabecalho -> CABECALHO
        }
    }

    override fun onBindViewHolder(holder: MainRecyclerViewHolder, position: Int) {
        when(holder){
            is MainRecyclerViewHolder.CabecalhoViewHolder -> holder.bindCabecalho(list[position] as MainRecyclerViewItem.cabecalho)
            is MainRecyclerViewHolder.PersonagemViewHolder -> holder.bindPersonagens(list[position] as MainRecyclerViewItem.Personagens)
        }
    }

    companion object{
        const val PERSONAGENS=0
        const val CABECALHO=1
    }
}