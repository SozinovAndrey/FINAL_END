package com.example.itogovaya

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


//Адаптер всегда принимает список
//Адаптер эо абстрактный класс
class CartAdapter(private val cartList: List<Cart>): RecyclerView.Adapter<CartVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartVH {
        val itemView =  LayoutInflater.from(parent.context)
            .inflate(R.layout.cart_list_item,parent,false)
        return CartVH(itemView)
    }

    override fun onBindViewHolder(holder: CartVH, position: Int) {
        val cart = cartList[position]
        holder.bind(cart)
    }

    override fun getItemCount(): Int {
        return cartList.size
    }


}