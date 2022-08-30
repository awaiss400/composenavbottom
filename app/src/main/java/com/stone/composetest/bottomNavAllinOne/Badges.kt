package com.stone.composetest

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


@Composable
fun BottomBar(navController: NavHostController) {
    NavHost(navController=navController, startDestination = "home"){
        composable("home"){
HomeScreen()
        }
        composable("profile"){
ProfileScreen()
        }
        composable("settings"){
SettingsScreen()

        }
    }
}

@Composable
fun HomeScreen() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Text(" Home =" )
    }
}
@Composable
fun ProfileScreen() {
    Box(contentAlignment = Alignment.Center,modifier = Modifier.fillMaxSize()){
        Text(" Prof" )
    }
}@Composable
fun SettingsScreen() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Text(" Settings =" )
    }
}


