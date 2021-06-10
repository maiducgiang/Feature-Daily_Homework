package com.example.myapplication

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityScreen2Binding
import org.w3c.dom.Text

class Screen2: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_screen2)
        val intent = intent
        val name : String? = intent.getStringExtra("name")
        val contact : String? = intent.getStringExtra("contact")
        val schedule : String? = intent.getStringExtra("schedule")
        val textname : TextView = findViewById<TextView>(R.id.textview_screen2_name)
        val textschedule : TextView = findViewById<TextView>(R.id.textview_screen2_schedule)
        val textcontact : TextView = findViewById<TextView>(R.id.textView_screen2_contact)
        Log.d("Activity2", "start")
    }
}
