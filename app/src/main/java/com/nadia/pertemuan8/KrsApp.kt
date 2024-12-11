package com.nadia.pertemuan8

import android.app.Application
import com.nadia.pertemuan8.dependeciesinjection.ContainerApp

class KrsApp : Application() { //Fungsinya untuk menyimpan instance
    lateinit var containerApp: ContainerApp
    override fun onCreate() {
        super.onCreate()
        containerApp = ContainerApp(this) //Membuat instance ContainerApp
        // instance adalah object yang dibuat dari class
    }
}