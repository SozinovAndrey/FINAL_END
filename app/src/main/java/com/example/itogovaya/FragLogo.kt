package com.example.itogovaya

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible


class FragLogo : Fragment() {

    lateinit var saleImages: ImageView
    lateinit var nameUser: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_frag_logo, container, false)


        saleImages = view.findViewById(R.id.imageView3)
        nameUser = view.findViewById(R.id.myLogin)

        return view
    }

    fun login() = if (myLogin != "") {
        saleImages.isVisible = true
        nameUser.text = "Добро пожаловать, $myLogin"
    } else {
        saleImages.isVisible = false
    }

    override fun onResume() {
        super.onResume()
        login()
    }

}


