package com.example.itogovaya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.appbar.AppBarLayout


class LoginActivity : AppCompatActivity() {

    lateinit var imputText: EditText
    lateinit var enterButtonLogin: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        this.setTitle("")
        setContentView(R.layout.activity_login)

        imputText = findViewById(R.id.input_login)
        enterButtonLogin = findViewById(R.id.button_login)

        enterButtonLogin.setOnClickListener {

            myLogin = imputText.getText().toString()



            if (myLogin != ""){

                imputText.getText().clear()
                val MainActivityIntent = Intent(this, MainActivity::class.java)
                startActivity(MainActivityIntent)

            }else{
                Toast.makeText(this,"Укажите свой Логин!",Toast.LENGTH_LONG).show()

            }


        }


    }
}