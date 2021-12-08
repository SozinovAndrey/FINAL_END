package com.example.itogovaya

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mrv.PizzaAdapter
import com.example.mrv.pizza

lateinit var pizzaRV: RecyclerView

class Frag_Pizza : Fragment() {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        activity?.actionBar?.title = myLogin + " Вы вошли в разедел - ПИЦЦА"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activity?.actionBar?.title = myLogin + " Вы вошли в разедел - ПИЦЦА"

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        val view = inflater.inflate(R.layout.fragment_frag__pizza, container, false)

        val pizzaList: List<pizza> = listOf(
            pizza("Греческая",25, 300),
            pizza("Греческая",30, 400),
            pizza("Греческая",35, 500),

            pizza("Карбонара",25, 280),
            pizza("Карбонара",30, 380),
            pizza("Карбонара",35, 500),

            pizza("Бавария",25, 300),
            pizza("Бавария",30, 400),
            pizza("Бавария",35, 500),

            pizza("Барбекю",25, 280),
            pizza("Барбекю",30, 380),
            pizza("Барбекю",35, 480),

            pizza("Аморе",25, 270),
            pizza("Аморе",30, 370),
            pizza("Аморе",35, 480)
        )

        activity?.actionBar?.title = myLogin + " Вы вошли в разедел - ПИЦЦА"

        pizzaRV = view.findViewById(R.id.pizzaReciclerView)
        pizzaRV.layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        pizzaRV.adapter = PizzaAdapter(pizzaList)
     //   pizzaRV.addItemDecoration(DividerItemDecoration(context,DividerItemDecoration.VERTICAL))

        return view
    }


}