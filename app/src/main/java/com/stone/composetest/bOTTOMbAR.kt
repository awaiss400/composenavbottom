//package com.stone.composetest
//
//import androidx.compose.material.*
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.Home
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.navigation.NavController
//import androidx.navigation.compose.currentBackStackEntryAsState
//
//sealed class Screens(val route:String) {
////    object Login : Screens(route = "loginscreen")
////    object Profile : Screens(route = "{data}/profilescreen")
//}
//@androidx.compose.runtime.Composable
//fun BootomNAv( navcontroller: NavController,items:List<Screens>) {
//val navBackStackEntry by navcontroller.currentBackStackEntryAsState()
//val currentdest=navBackStackEntry?.destination
//
//    BottomNavigation {
//        items.forEach{
//           BottomNavigationItem(selected = currentdest?.route==it.route, onClick = { navcontroller.navigate(it.route)}) {
//
//           }
//        }
//    }
