package com.example.myactivitydemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginButton =  findViewById<Button>(R.id.login_btn)
        loginButton.setOnClickListener(
            View.OnClickListener{
                val loginIntent = Intent(this@MainActivity, IntroActivity::class.java)
                    startActivity(loginIntent)
            })

        val regButton =  findViewById<Button>(R.id.toregister_btn)
        regButton.setOnClickListener(
            View.OnClickListener{
                val regIntent = Intent(this@MainActivity, RegisterActivity::class.java)
                startActivity(regIntent)
            })

    }
}
