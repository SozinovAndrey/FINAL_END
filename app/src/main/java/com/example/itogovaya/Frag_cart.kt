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
import com.example.mrv.pizza

lateinit var cartRV: RecyclerView




class Frag_cart : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_frag_cart, container, false)




        cartRV = view.findViewById(R.id.cartReciclerView)
        cartRV.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        cartRV.adapter = CartAdapter(cartList)
   //     cartRV.addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))


        return view
    }


}