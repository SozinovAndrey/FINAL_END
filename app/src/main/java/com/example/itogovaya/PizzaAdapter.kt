package com.example.mrv


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.itogovaya.R

//Адаптер всегда принимает список
//Адаптер эо абстрактный класс
class PizzaAdapter(private val pizzaList: List<pizza>): RecyclerView.Adapter<PizzaVH>() {

    //СОздает Объект для SushiVH и кладет в него верстку
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PizzaVH {

        // вызываем верстку
        val itemView =  LayoutInflater.from(parent.context)
            .inflate(R.layout.pizza_list_item,parent,false)
        return PizzaVH(itemView)

    }

    override fun onBindViewHolder(holder: PizzaVH, position: Int) {
        val sushi = pizzaList[position]
        holder.bind(sushi)
    }

    override fun getItemCount(): Int {
        return pizzaList.size
    }


}