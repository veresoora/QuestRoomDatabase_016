package com.nadia.pertemuan8.data.dao

import androidx.room.Dao
import androidx.room.Insert
import com.nadia.pertemuan8.data.entity.Mahasiswa

@Dao
interface MahasiswaDao {
    @Insert
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)
}