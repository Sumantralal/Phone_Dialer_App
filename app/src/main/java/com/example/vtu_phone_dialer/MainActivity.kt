package com.example.vtu_phone_dialer

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var cur:String=""
    lateinit var display: TextView
    lateinit var zero: Button
    lateinit var one: Button
    lateinit var two: Button
    lateinit var three: Button
    lateinit var four: Button
    lateinit var five: Button
    lateinit var six: Button
    lateinit var seven: Button
    lateinit var eight: Button
    lateinit var nine: Button
    lateinit var hash: Button
    lateinit var star: Button
    lateinit var call: Button
    lateinit var save: Button
    lateinit var clear: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        display=findViewById(R.id.display)
        zero=findViewById(R.id.b0)
        one=findViewById(R.id.b1)
        two=findViewById(R.id.b2)
        three=findViewById(R.id.b3)
        four=findViewById(R.id.b4)
        five=findViewById(R.id.b5)
        six=findViewById(R.id.b6)
        seven=findViewById(R.id.b7)
        eight=findViewById(R.id.b8)
        nine=findViewById(R.id.b9)
        hash=findViewById(R.id.hash)
        star=findViewById(R.id.star)
        call=findViewById(R.id.call)
        save=findViewById(R.id.save)
        clear=findViewById(R.id.clear)

        zero.setOnClickListener{
            cur+="0"
            display.text=cur
        }
        two.setOnClickListener{
            cur+="2"
            display.text=cur
        }
        three.setOnClickListener{
            cur+="3"
            display.text=cur
        }
        four.setOnClickListener{
            cur+="4"
            display.text=cur
        }
        five.setOnClickListener{
            cur+="5"
            display.text=cur
        }
        six.setOnClickListener{
            cur+="6"
            display.text=cur
        }
        seven.setOnClickListener{
            cur+="7"
            display.text=cur
        }
        eight.setOnClickListener{
            cur+="8"
            display.text=cur
        }
        nine.setOnClickListener{
            cur+="9"
            display.text=cur
        }
        hash.setOnClickListener{
            cur+="#"
            display.text=cur
        }
        star.setOnClickListener{
            cur+="*"
            display.text=cur
        }
        clear.setOnClickListener{
            display.text="";
            cur=""
        }
        call.setOnClickListener{
            val intent= Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+display.text))
            startActivity(intent)
        }
        save.setOnClickListener{
            val intent=Intent(ContactsContract.Intents.SHOW_OR_CREATE_CONTACT,Uri.parse("tel:"+display.text))

            intent.putExtra(ContactsContract.Intents.EXTRA_FORCE_CREATE,display.text)

            startActivity(intent)
        }
    }
}