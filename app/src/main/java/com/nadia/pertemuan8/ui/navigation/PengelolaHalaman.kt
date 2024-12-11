package com.nadia.pertemuan8.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.nadia.pertemuan8.ui.view.mahasiswa.DestinasiInsert
import com.nadia.pertemuan8.ui.view.mahasiswa.InserMhsView
import com.nadia.pertemuan8.ui.view.mahasiswa.InsertBodyMhs

@Composable
fun PengelolaHalaman(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = DestinasiInsert.route
    ) {
        composable(
            route = DestinasiInsert.route
        ){
            InserMhsView(
                onBack = {},
                onNavigate = { }
            )
        }
    }
}