package com.nadia.pertemuan8.repository

import com.nadia.pertemuan8.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)

    fun getAllMhs () : Flow<List<Mahasiswa>>

    fun getMhs(nim: String) : Flow<Mahasiswa>

    suspend fun deletMhs (mahasiswa: Mahasiswa)

    suspend fun updateMhs (mahasiswa: Mahasiswa)
}