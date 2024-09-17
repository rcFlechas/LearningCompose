package com.rcflechas.learningcompose.containers

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.rcflechas.learningcompose.components.CustomSpacer

// Column replace vertical LinearLayout
@Composable
fun CustomColumn() {
    Column(modifier = Modifier.fillMaxSize()) {
        Column(
            Modifier
                .weight(0.3f)
                .border(1.dp, Color.Green)
                .fillMaxWidth(), verticalArrangement = Arrangement.SpaceEvenly) {
            Text(text = "HELLO 1", modifier = Modifier.background(Color.Red))
            Text(text = "HELLO 2", modifier = Modifier.background(Color.Blue))
            Text(text = "HELLO 3", modifier = Modifier.background(Color.Green))
            Text(text = "HELLO 4", modifier = Modifier.background(Color.Yellow))
            Text(text = "HELLO 5", modifier = Modifier.background(Color.Cyan))
            Text(text = "HELLO 6", modifier = Modifier.background(Color.Magenta))
        }
        Column(
            Modifier
                .weight(0.7f)
                .border(1.dp, Color.Blue)
                .fillMaxWidth()
                .verticalScroll(
                    rememberScrollState()
                )) {
            Text(text = "HELLO 1", modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .height(100.dp))
            Text(text = "HELLO 2", modifier = Modifier
                .background(Color.Blue)
                .fillMaxWidth()
                .height(100.dp))

            CustomSpacer(height = 16)

            Text(text = "HELLO 3", modifier = Modifier
                .background(Color.Green)
                .fillMaxWidth()
                .height(100.dp))
            Text(text = "HELLO 4", modifier = Modifier
                .background(Color.Yellow)
                .fillMaxWidth()
                .height(100.dp))
            Text(text = "HELLO 5", modifier = Modifier
                .background(Color.Cyan)
                .fillMaxWidth()
                .height(100.dp))
            Text(text = "HELLO 6", modifier = Modifier
                .background(Color.Magenta)
                .fillMaxWidth()
                .height(100.dp))
            Text(text = "HELLO 1", modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .height(100.dp))
            Text(text = "HELLO 2", modifier = Modifier
                .background(Color.Blue)
                .fillMaxWidth()
                .height(100.dp))
            Text(text = "HELLO 3", modifier = Modifier
                .background(Color.Green)
                .fillMaxWidth()
                .height(100.dp))
            Text(text = "HELLO 4", modifier = Modifier
                .background(Color.Yellow)
                .fillMaxWidth()
                .height(100.dp))
            Text(text = "HELLO 5", modifier = Modifier
                .background(Color.Cyan)
                .fillMaxWidth()
                .height(100.dp))
            Text(text = "HELLO 6", modifier = Modifier
                .background(Color.Magenta)
                .fillMaxWidth()
                .height(100.dp))
            Text(text = "HELLO 1", modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .height(100.dp))
            Text(text = "HELLO 2", modifier = Modifier
                .background(Color.Blue)
                .fillMaxWidth()
                .height(100.dp))
            Text(text = "HELLO 3", modifier = Modifier
                .background(Color.Green)
                .fillMaxWidth()
                .height(100.dp))
            Text(text = "HELLO 4", modifier = Modifier
                .background(Color.Yellow)
                .fillMaxWidth()
                .height(100.dp))
            Text(text = "HELLO 5", modifier = Modifier
                .background(Color.Cyan)
                .fillMaxWidth()
                .height(100.dp))
            Text(text = "HELLO 6", modifier = Modifier
                .background(Color.Magenta)
                .fillMaxWidth()
                .height(100.dp))
            Text(text = "HELLO 1", modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .height(100.dp))
            Text(text = "HELLO 2", modifier = Modifier
                .background(Color.Blue)
                .fillMaxWidth()
                .height(100.dp))
            Text(text = "HELLO 3", modifier = Modifier
                .background(Color.Green)
                .fillMaxWidth()
                .height(100.dp))
            Text(text = "HELLO 4", modifier = Modifier
                .background(Color.Yellow)
                .fillMaxWidth()
                .height(100.dp))
            Text(text = "HELLO 5", modifier = Modifier
                .background(Color.Cyan)
                .fillMaxWidth()
                .height(100.dp))
            Text(text = "HELLO 6", modifier = Modifier
                .background(Color.Magenta)
                .fillMaxWidth()
                .height(100.dp))
            Text(text = "HELLO 1", modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .height(100.dp))
            Text(text = "HELLO 2", modifier = Modifier
                .background(Color.Blue)
                .fillMaxWidth()
                .height(100.dp))
            Text(text = "HELLO 3", modifier = Modifier
                .background(Color.Green)
                .fillMaxWidth()
                .height(100.dp))
            Text(text = "HELLO 4", modifier = Modifier
                .background(Color.Yellow)
                .fillMaxWidth()
                .height(100.dp))
            Text(text = "HELLO 5", modifier = Modifier
                .background(Color.Cyan)
                .fillMaxWidth()
                .height(100.dp))
            Text(text = "HELLO 6", modifier = Modifier
                .background(Color.Magenta)
                .fillMaxWidth()
                .height(100.dp))
            Text(text = "HELLO 1", modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .height(100.dp))
            Text(text = "HELLO 2", modifier = Modifier
                .background(Color.Blue)
                .fillMaxWidth()
                .height(100.dp))
            Text(text = "HELLO 3", modifier = Modifier
                .background(Color.Green)
                .fillMaxWidth()
                .height(100.dp))
            Text(text = "HELLO 4", modifier = Modifier
                .background(Color.Yellow)
                .fillMaxWidth()
                .height(100.dp))
            Text(text = "HELLO 5", modifier = Modifier
                .background(Color.Cyan)
                .fillMaxWidth()
                .height(100.dp))
            Text(text = "HELLO 6", modifier = Modifier
                .background(Color.Magenta)
                .fillMaxWidth()
                .height(100.dp))
        }
    }
}