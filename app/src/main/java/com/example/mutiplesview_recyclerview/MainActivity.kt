package com.example.mutiplesview_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mutiplesview_recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private  var adapter:MainRecyclerViewAdapter= MainRecyclerViewAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerMain.setHasFixedSize(true)
        binding.recyclerMain.layoutManager=LinearLayoutManager(this)
        binding.recyclerMain.adapter=adapter
        adapter.setListData(getSetListData())


    }

    private fun getSetListData(): MutableList<MainRecyclerViewItem> {
        val list = mutableListOf<MainRecyclerViewItem>()
        list.add(MainRecyclerViewItem.Personagens(R.drawable.disneymickey1, "Mickey","MICKEYMOUSE"))
        list.add(MainRecyclerViewItem.cabecalho(R.drawable.mickey_banner))

        list.add(MainRecyclerViewItem.Personagens(R.drawable.elza_icon, "Elza","Frozen"))
        list.add(MainRecyclerViewItem.cabecalho(R.drawable.frozen_banner))

        list.add(MainRecyclerViewItem.Personagens(R.drawable.mikeicon, "Mike Wazowski","Monstros S.A"))
        list.add(MainRecyclerViewItem.cabecalho(R.drawable.monstro_sa_banner))

        list.add(MainRecyclerViewItem.Personagens(R.drawable.alladin, "Alladin","Alladin"))
        list.add(MainRecyclerViewItem.cabecalho(R.drawable.alladin_banner))

        list.add(MainRecyclerViewItem.Personagens(R.drawable.mcqueen_icon, "McQueen","Carros"))
        list.add(MainRecyclerViewItem.cabecalho(R.drawable.carros_banner))



        return list
    }


}