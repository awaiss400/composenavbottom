package com.stone.composetest

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.window.Dialog

@Composable
fun DailogBx() {
    var isopen by remember {
        mutableStateOf(false)
    }
    Column(Modifier.fillMaxWidth(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = { isopen=true}) {
            Text(text = "CLick")
        }
    if (isopen){
        Dialog(onDismissRequest = { isopen=false}) {
            Column(Modifier.fillMaxWidth(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                Box(modifier = Modifier.background(Color.Red).fillMaxWidth()) {
                    Text(text = "Box", color = Color.White)
                }
            }
        }
    }
    }
}