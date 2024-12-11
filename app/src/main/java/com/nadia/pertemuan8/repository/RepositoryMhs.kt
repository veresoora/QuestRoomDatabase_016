package com.nadia.pertemuan8.repository

import com.nadia.pertemuan8.data.entity.Mahasiswa

interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)
}