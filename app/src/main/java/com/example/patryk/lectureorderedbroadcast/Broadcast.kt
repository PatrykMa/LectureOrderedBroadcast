package com.example.patryk.lectureorderedbroadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class BroadcastFirst:BroadcastReceiver() {
init{
    
}
    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context,"pierwszy",Toast.LENGTH_SHORT).show()

    }
}

class BroadcastSec:BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context,"drugi",Toast.LENGTH_SHORT).show()
    }
}
class BroadcastThird:BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context,"trzezci",Toast.LENGTH_SHORT).show()
    }
}

class BroadcastLast:BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context,"Ostatni",Toast.LENGTH_SHORT).show()
    }
}