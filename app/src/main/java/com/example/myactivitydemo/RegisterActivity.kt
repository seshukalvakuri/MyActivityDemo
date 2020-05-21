package com.example.myactivitydemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val rname_et = findViewById<EditText>(R.id.rname_et)
        val remail_et = findViewById<EditText>(R.id.remail_et)
        val rpass_et = findViewById<EditText>(R.id.rpass_et)
        val rcpass_et = findViewById<EditText>(R.id.rcpass_et)
        val rcity_et = findViewById<EditText>(R.id.rcity_et)
        val rzip_et = findViewById<EditText>(R.id.rzip_et)
        val raddress_et = findViewById<EditText>(R.id.raddress_et)
        val registerButton =  findViewById<Button>(R.id.rregisster_btn)
        registerButton.setOnClickListener(
            View.OnClickListener{
                val registerIntent = Intent(this@RegisterActivity, HomeActivity::class.java)
                registerIntent.putExtra("name", rname_et.text)
                registerIntent.putExtra("email", remail_et.text)
                registerIntent.putExtra("rpass", rpass_et.text)
                registerIntent.putExtra("rcpass", rcpass_et.text)
                registerIntent.putExtra("rcity", rcity_et.text)
                registerIntent.putExtra("rzip", rzip_et.text)
                registerIntent.putExtra("raddress", raddress_et.text)
               // Toast.makeText(this, "name="+ rname_et.text+", email="+ remail_et.text+ ",rcity="+rcity_et.text,Toast.LENGTH_LONG).show()

                startActivity(registerIntent)
            })
    }
}


