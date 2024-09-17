package com.rcflechas.learningcompose.containers

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.rcflechas.learningcompose.components.CustomSpacer

// Column replace horizontal LinearLayout
@Composable
fun CustomRow() {
    Row(modifier = Modifier.fillMaxSize()) {
        Row(
            Modifier
                .weight(0.4f)
                .border(1.dp, Color.Green)
                .fillMaxHeight(), horizontalArrangement = Arrangement.SpaceEvenly) {
            Text(text = "1", modifier = Modifier.background(Color.Red))
            Text(text = "2", modifier = Modifier.background(Color.Blue))
            Text(text = "3", modifier = Modifier.background(Color.Green))
        }
        Row(
            Modifier
                .weight(0.6f)
                .border(1.dp, Color.Blue)
                .fillMaxHeight()
                .horizontalScroll(
                    rememberScrollState()
                )) {
            Text(text = "HELLO 1", modifier = Modifier
                .background(Color.Red)
                .fillMaxHeight()
                .height(100.dp))

            CustomSpacer(width = 12)

            Text(text = "HELLO 2", modifier = Modifier
                .background(Color.Blue)
                .fillMaxHeight()
                .height(100.dp))
            Text(text = "HELLO 3", modifier = Modifier
                .background(Color.Green)
                .fillMaxHeight()
                .height(100.dp))
            Text(text = "HELLO 4", modifier = Modifier
                .background(Color.Yellow)
                .fillMaxHeight()
                .height(100.dp))
            Text(text = "HELLO 5", modifier = Modifier
                .background(Color.Cyan)
                .fillMaxHeight()
                .height(100.dp))
            Text(text = "HELLO 6", modifier = Modifier
                .background(Color.Magenta)
                .fillMaxHeight()
                .height(100.dp))
            Text(text = "HELLO 1", modifier = Modifier
                .background(Color.Red)
                .fillMaxHeight()
                .height(100.dp))
            Text(text = "HELLO 2", modifier = Modifier
                .background(Color.Blue)
                .fillMaxHeight()
                .height(100.dp))
            Text(text = "HELLO 3", modifier = Modifier
                .background(Color.Green)
                .fillMaxHeight()
                .height(100.dp))
            Text(text = "HELLO 4", modifier = Modifier
                .background(Color.Yellow)
                .fillMaxHeight()
                .height(100.dp))
            Text(text = "HELLO 5", modifier = Modifier
                .background(Color.Cyan)
                .fillMaxHeight()
                .height(100.dp))
            Text(text = "HELLO 6", modifier = Modifier
                .background(Color.Magenta)
                .fillMaxHeight()
                .height(100.dp))
            Text(text = "HELLO 1", modifier = Modifier
                .background(Color.Red)
                .fillMaxHeight()
                .height(100.dp))
            Text(text = "HELLO 2", modifier = Modifier
                .background(Color.Blue)
                .fillMaxHeight()
                .height(100.dp))
            Text(text = "HELLO 3", modifier = Modifier
                .background(Color.Green)
                .fillMaxHeight()
                .height(100.dp))
            Text(text = "HELLO 4", modifier = Modifier
                .background(Color.Yellow)
                .fillMaxHeight()
                .height(100.dp))
            Text(text = "HELLO 5", modifier = Modifier
                .background(Color.Cyan)
                .fillMaxHeight()
                .height(100.dp))
            Text(text = "HELLO 6", modifier = Modifier
                .background(Color.Magenta)
                .fillMaxHeight()
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