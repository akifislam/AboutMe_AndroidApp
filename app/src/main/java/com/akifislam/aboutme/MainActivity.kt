// Project About Me
package com.akifislam.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nicknametext = findViewById<TextView>(R.id.nickname_text)
        var nicknameedit = findViewById<EditText>(R.id.nicknameEdit)
        var donebutton = findViewById<TextView>(R.id.done_btn)



        var nickname = nicknameedit.text.toString()
        nicknametext.text = nickname


        donebutton.setOnClickListener {
            nicknametext.text = nicknameedit.text
            nicknameedit.text.clear()
            //view gone
            nicknameedit.visibility = EditText.GONE
            donebutton.visibility = Button.GONE
            //Hide Keyboard
            nicknameedit.clearFocus()
            val inputMethodManager = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(currentFocus?.windowToken, 0)

        }


    }
}