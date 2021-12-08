package com.example.itogovaya

import android.view.View
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView



class CartVH(itemView: View): RecyclerView.ViewHolder(itemView) {

    private val keyTextView: TextView = itemView.findViewById(R.id.key_text_view)
    private val nameTextView: TextView = itemView.findViewById(R.id.name_text_view)
    private val priceTextView: TextView = itemView.findViewById(R.id.price_text_view)
    private val kolTextView: EditText = itemView.findViewById(R.id.kol_text_view)
    private val summaTextView: TextView = itemView.findViewById(R.id.summa_text_view)

    private val imageButton: ImageButton = itemView.findViewById(R.id.delete_cart_view)

    //натягиваем данные получает класс  User
    fun bind(Car_Item: Cart){
        keyTextView.text = Car_Item.key.toString()
        nameTextView.text = "${Car_Item.name}"
     //   kolTextView. = "${Car_Item.price.toString()}"
        kolTextView.setText("${Car_Item.kol}")
        priceTextView.text = "${Car_Item.price} руб."
        summaTextView.text = "${Car_Item.summa} руб."

        imageButton.setOnClickListener{

            //добавили в корзину понажатию
            Toast.makeText(itemView.context,
                nameTextView.text as String +"- удалена из  корзины!", Toast.LENGTH_SHORT).show()

        }
    }


}