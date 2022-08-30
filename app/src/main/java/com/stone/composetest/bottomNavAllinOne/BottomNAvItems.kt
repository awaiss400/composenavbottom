package com.stone.composetest.bottomNavAllinOne

import android.widget.ImageView
import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNAvItems(
    val title:String,
    val count:Int=0,
    val icon:ImageVector,
    val route:String
) {
}