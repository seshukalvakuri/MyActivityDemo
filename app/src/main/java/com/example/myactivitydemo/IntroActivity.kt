package com.example.myactivitydemo

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class IntroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        val loginButton =  findViewById<Button>(R.id.signin_btn)
        loginButton.setOnClickListener(
            View.OnClickListener{
                val loginIntent = Intent(this@IntroActivity, RegisterActivity::class.java  )
                startActivity(loginIntent)
            })

    }
}
