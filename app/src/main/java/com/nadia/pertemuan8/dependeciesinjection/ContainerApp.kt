package com.nadia.pertemuan8.dependeciesinjection

import android.content.Context
import com.nadia.pertemuan8.data.database.KrsDatabase
import com.nadia.pertemuan8.repository.LocalRepositoryMhs
import com.nadia.pertemuan8.repository.RepositoryMhs

interface InterfaceContainerApp {
    val repositoryMhs: RepositoryMhs
}

class ContainerApp(private val context: Context) : InterfaceContainerApp{
    override val repositoryMhs: RepositoryMhs by lazy {
        LocalRepositoryMhs(KrsDatabase.getDatabase(context).mahasiswaDao())
    }
}