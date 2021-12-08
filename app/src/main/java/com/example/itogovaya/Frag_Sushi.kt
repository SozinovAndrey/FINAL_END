package com.example.itogovaya

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mrv.Sushi
import com.example.mrv.SushiAdapter

lateinit var sushiRV: RecyclerView

class Frag_Sushi : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_frag__sushi, container, false)


        val sushiList: List<Sushi> = listOf(
            Sushi("Колифорния -Люкс", "Хол.", 280),
            Sushi("Филадельфия ", "Хол.", 320),
            Sushi("Эби Темпура Маки", "Гор.", 340),
            Sushi("Саяки Маки", "Хол.", 240),
            Sushi("Урамаки", "Хол.", 300),
            Sushi("Тино Маки", "Гор.", 280),
            Sushi("Огами Маки ", "Зап.", 320),
            Sushi("Киото", "Гор.", 340),
            Sushi("Сет Хит", "Х/Г/З.", 2500),
            Sushi("Сет Пекин", "Х/Г/З.", 3000),
            Sushi("Ролл с тунцом", "Гор.", 270)
        )

        sushiRV = view.findViewById(R.id.sushiReciclerView)
        sushiRV.layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        sushiRV.adapter = SushiAdapter(sushiList)
      //  sushiRV.addItemDecoration(DividerItemDecoration(context,DividerItemDecoration.VERTICAL))
        return view
    }


}