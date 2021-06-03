package com.example.myapplication

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.Group
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityMainBinding

class information(val name: String, val add: String, val photo: Int, val follower: Int, val follow: Int)
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        //Log.v("Activiti", "onCreate")
        Toast.makeText(this@MainActivity, "HELLO", Toast.LENGTH_LONG).show()
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
                this, R.layout.activity_main)
        val Giang: information = information("Mai Duc Giang", "Hop Ly, Lap Thach, Vinh Phuc", 456, 602, 290)
        binding.name = Giang.name
        binding.add = Giang.add
        binding.photo = Giang.photo.toString()
        binding.follow = Giang.follow.toString()
        binding.follower = Giang.follower.toString()
        binding.codeCheck = "ẩn thông tin"
        val button: Button = findViewById(R.id.buttonCheck)
        button.setOnClickListener {
            val group: Group = findViewById(R.id.group)
            if (group.visibility == View.GONE) {
                group.visibility = View.VISIBLE
                binding.codeCheck = "ẩn thông tin"
            } else {
                group.visibility = View.GONE
                binding.codeCheck = "bấm để xem"
            }
        }

        val cost : EditText = findViewById(R.id.textScreen)
        val nextScreen : Button = findViewById(R.id.nextScreen)
        nextScreen.isClickable = false
        cost.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {
                //sau khi văn bản thay đổi

            }

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
                //trước khi văn bản thay đổi
                val email: String = cost.text.toString()
                if(email.isBlank()){
                    binding.texthello = email
                    nextScreen.isClickable = true
                    nextScreen.setOnClickListener(){
                        setContentView(R.layout.activity_screen2)
                    }
                }
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                //trên văn bản thay đổi

            }
        })
    }

    /*override fun onStart() {
        super.onStart()
        Toast.makeText(this@MainActivity, "HELLO", Toast.LENGTH_LONG).show()
        Log.d("Activity", "onStart")
    }
    override fun onResume() {
        super.onResume()
        Toast.makeText(this@MainActivity, "HELLO",Toast.LENGTH_LONG).show()
        Log.d("Activity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Activity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Activity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Activity", "onDestroy")
    }*/
}