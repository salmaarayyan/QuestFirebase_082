package com.example.myfirebase.view.controlNavigasi

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun DataSiswaApp(navController: NavController = rememberNavController(), modifier: Modifier = Modifier) {
    HostNavigasi(navController = navController)
}