package com.example.mrv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.itogovaya.R


//Адаптер всегда принимает список
//Адаптер эо абстрактный класс
class SushiAdapter(private val sushiList: List<Sushi>): RecyclerView.Adapter<SushiVH>() {

    //СОздает Объект для SushiVH и кладет в него верстку
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SushiVH {

        // вызываем верстку
        val itemView =  LayoutInflater.from(parent.context)
            .inflate(R.layout.sushi_list_item,parent,false)
        return SushiVH(itemView)

    }

    override fun onBindViewHolder(holder: SushiVH, position: Int) {
        val sushi = sushiList[position]
        holder.bind(sushi)
    }

    override fun getItemCount(): Int {
        return sushiList.size
    }


}