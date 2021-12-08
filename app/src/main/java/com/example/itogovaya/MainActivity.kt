package com.example.itogovaya

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
var myLogin: String = ""

lateinit var navMainMenu: BottomNavigationView
private var frag: Fragment? = null
lateinit var chapter: String

val cartList: MutableList<Cart> = mutableListOf()

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        if (myLogin == ""){
            login()
        }

           frag = FragLogo()

                if (savedInstanceState != null) {
                    frag = supportFragmentManager.findFragmentById(savedInstanceState.getInt("tek_frag"))
                }


        replace_fragment(frag!!)

        navMainMenu = findViewById(R.id.main_navigation_menu)
        navMainMenu.setSelectedItemId(R.id.logoute)
        navMainMenu.setOnItemSelectedListener { item ->
            var key: Boolean = false
            when (item.itemId) {
                R.id.main_item_orders -> {
                    val secontActivityIntent = Intent(this, OrdersActivity::class.java)

                    startActivity(secontActivityIntent)

                }

                R.id.main_item_browser -> {
                    val weblink = Uri.parse("https://ya.ru")
                    val olIntent = Intent(Intent.ACTION_VIEW, weblink)
                    startActivity(olIntent)
                }

                R.id.logoute -> {myLogin =""
                    val LoginActivityIntent = Intent(this, LoginActivity::class.java)
                    startActivity(LoginActivityIntent)
                }


                R.id.main_item_about -> {frag = frag_about()
                    chapter = "ОБО МНЕ"
                    key = true
                }
            }

            if (key) {
                replace_fragment(frag!!)
            }

            true
        }

    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("tek_frag",R.id.main_fragment_view)
    }


    fun replace_fragment(fragment: Fragment){

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.main_fragment_view,fragment)
            .addToBackStack(fragment.tag)
            .commit()
    }

    fun login(){
        val LoginActivityIntent = Intent(this, LoginActivity::class.java)
        startActivity(LoginActivityIntent)
    }

}