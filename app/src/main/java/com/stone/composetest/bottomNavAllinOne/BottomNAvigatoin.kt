package com.stone.composetest.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.stone.composetest.bottomNavAllinOne.BottomNAvItems

@Composable
fun BottomNavBar(items:List<BottomNAvItems>, navController: NavController, modifier: Modifier=Modifier, onitemClick:(BottomNAvItems)->Unit) {
val backStackEntry=navController.currentBackStackEntryAsState()
    BottomNavigation(backgroundColor = Color.DarkGray, elevation = 5.dp, modifier = modifier) {
   items.forEach{item->
       val selected= item.route==backStackEntry.value?.destination?.route
       BottomNavigationItem(
           selected =selected,
           onClick = { onitemClick(item) }, selectedContentColor = Color.Green,
           icon = {
Column(horizontalAlignment = Alignment.CenterHorizontally) {
    if (item.count>0){
        BadgedBox(badge = { Text(text = item.count.toString())}) {
            Icon(imageVector = item.icon, contentDescription =item.title )
        }
    }else{            Icon(imageVector = item.icon, contentDescription =item.title )
    }
}
           }
       )
   }
}
}