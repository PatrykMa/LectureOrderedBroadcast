package com.example.patryk.lectureorderedbroadcast

import android.content.IntentFilter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.app.Activity
import android.content.Intent



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button_send).setOnClickListener {
            val intent = Intent("com.example.PAM")
            sendOrderedBroadcast(
                intent,
                null,//pozwolenia
                BroadcastLast(),//ostatni domyślny recriver
                null,// wątek na którym wykona sie onResoult
                Activity.RESULT_OK,//wartość inicjalizująca resoultCode
                null,//initial data
                null// iniial extras
            )
        }
    }

    lateinit var br1 : BroadcastFirst
    lateinit var br2 : BroadcastSec
    lateinit var br3 : BroadcastThird
    override fun onResume() {

        val filter1 = IntentFilter("com.example.PAM")
        filter1.priority=3

        br1 = BroadcastFirst()

        registerReceiver(br1, filter1)

         var filter2 = IntentFilter("com.example.PAM")
        filter1.priority=2
        br2 = BroadcastSec()
        registerReceiver(br2, filter2)

        val filter3 = IntentFilter("com.example.PAM")
        filter1.priority=1
        br3 = BroadcastThird()
        registerReceiver(br3, filter3)

        super.onResume()
    }

    override fun onPause() {
        unregisterReceiver(br1)
        unregisterReceiver(br2)
        unregisterReceiver(br3)
        super.onPause()
    }
}
