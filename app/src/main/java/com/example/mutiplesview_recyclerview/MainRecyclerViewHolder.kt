package com.example.mutiplesview_recyclerview

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.mutiplesview_recyclerview.databinding.ActivityMainBinding
import com.example.mutiplesview_recyclerview.databinding.ResHeaderView1Binding
import com.example.mutiplesview_recyclerview.databinding.ResPersongaemView2Binding

sealed class MainRecyclerViewHolder(binding: ViewBinding):RecyclerView.ViewHolder(binding.root) {

    class CabecalhoViewHolder(val binding: ResHeaderView1Binding):MainRecyclerViewHolder(binding){

        fun bindCabecalho( b: MainRecyclerViewItem.cabecalho){
            binding.imageHeader.setImageResource(b.image)

        }

    }

    class PersonagemViewHolder(val binding:ResPersongaemView2Binding):MainRecyclerViewHolder(binding){

        fun bindPersonagens(p:MainRecyclerViewItem.Personagens){
            binding.nome.text=p.nome
            binding.filmePersonagem.text=p.filme
            binding.imgPersonagem.setImageResource(p.image)
            
        }
    }

}