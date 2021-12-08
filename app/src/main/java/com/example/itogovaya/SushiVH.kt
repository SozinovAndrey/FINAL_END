package com.example.mrv

import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.itogovaya.Cart
import com.example.itogovaya.R
import com.example.itogovaya.cartList


class SushiVH(itemView: View): RecyclerView.ViewHolder(itemView) {

    private val nameTextView: TextView = itemView.findViewById(R.id.name_text_view)
    private val typeTextView:TextView = itemView.findViewById(R.id.type_text_view)
    private val priceTextView:TextView = itemView.findViewById(R.id.price_text_view)
    private val imageButton:ImageButton = itemView.findViewById(R.id.sushi_button_view)




    //натягиваем данные получает класс  User
    fun bind(sushi: Sushi){
        nameTextView.text = sushi.name
        typeTextView.text = sushi.type
        priceTextView.text = sushi.price.toString()

        imageButton.setOnClickListener{

            //добавили в корзину понажатию
            Toast.makeText(itemView.context,
                nameTextView.text as String +"-Добавлена в корзину!", Toast.LENGTH_SHORT).show()



            cartList.add( Cart(cartList.size +1,nameTextView.text as String +"," + typeTextView.text,
                priceTextView.text.toString().toInt(),
                1,
                priceTextView.text.toString().toInt()
                //1
            )
            )


        }
    }

}

