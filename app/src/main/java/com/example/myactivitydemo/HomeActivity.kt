package com.example.myactivitydemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home.*


class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val bundle:Bundle? = intent.extras

        val rzip = bundle?.get("rzip")
        val name = bundle?.get("name")
        val email = bundle?.get("email")
        val rcity = bundle?.get("rcity")
        val raddress = bundle?.get("raddress")

        name_et.text = name.toString()
        email_et.text = email.toString()
        city_et.text = rcity.toString()
        zip_et.text = rzip.toString()
        address_et.text = raddress.toString()

    }

}
