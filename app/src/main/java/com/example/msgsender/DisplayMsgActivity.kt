package com.example.msgsender

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_display_msg.*


class DisplayMsgActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_msg)

      val message = intent.getStringExtra(EXTRA_MESSAGE)

       findViewById<TextView>(R.id.textView).apply {
            text = message

            object : CountDownTimer(10000, 1000) {
                override fun onTick(millisUntilFinished: Long) {
                }

                override fun onFinish() {
                  //  reSend()
                    finish()
                }
            }.start()
        }
    }


    }
