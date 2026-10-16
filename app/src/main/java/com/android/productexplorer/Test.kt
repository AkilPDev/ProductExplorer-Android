package com.android.productexplorer

import android.content.ComponentName
import android.content.ServiceConnection
import android.os.IBinder

fun main(){


}

class Test{
    var a = 0
     val c = 0
    companion object{
        var b = 0
    }
 /*   fun Thread{
        Thread{
            a++
            b++
            c++
        }.start()
    }*/
}

private val serviceConnection = object : ServiceConnection {
    override fun onServiceConnected(p0: ComponentName?, p1: IBinder?) {
        TODO("Not yet implemented")
    }

    override fun onServiceDisconnected(p0: ComponentName?) {
        TODO("Not yet implemented")
    }

}