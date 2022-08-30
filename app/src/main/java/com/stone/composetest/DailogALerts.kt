package com.stone.composetest

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun AlertDialogsBoxes() {
    var isopen by remember {
        mutableStateOf(false)
    }
    Column(
        Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { isopen = true }) {
            Text(text = "CLick")
        }
if (isopen){
    AlertDialog(onDismissRequest = {}, title = { Text(text = "Dialog box")}, text = {
        Text(text = "djucnucn ddshdh hd hd")
    }, modifier = Modifier.fillMaxWidth().fillMaxHeight(),
        buttons = {
        Button(onClick = { isopen=false }) {
            Text(text = "|CLocl")
        }
    },)
}
    }

}
