package com.nadia.pertemuan8.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.nadia.pertemuan8.data.dao.MahasiswaDao
import com.nadia.pertemuan8.data.entity.Mahasiswa

//Mendefinisikan database dengan tabel Mahasiswa
@Database(entities = [Mahasiswa::class], version = 1, exportSchema = false)
abstract class KrsDatabase : RoomDatabase(){

    //Mendefinisikan fungsi untuk mengakses data Mahasiswa
    abstract fun  mahasiswaDao(): MahasiswaDao

    companion object{
        @Volatile //memastikan bahwa nilai variabel instance selalu sama di semua
        private var Instances: KrsDatabase? = null

        fun getDatabase(context: Context): KrsDatabase{
            return (Instances ?: synchronized(this){
                Room.databaseBuilder(
                    context.applicationContext,
                    KrsDatabase::class.java,
                    "KrsDatabase" //Nama Database
                )
                    .build().also { Instances = it }
            })
        }
    }
}