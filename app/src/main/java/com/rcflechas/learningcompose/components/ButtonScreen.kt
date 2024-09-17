package com.rcflechas.learningcompose.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rcflechas.learningcompose.ui.theme.Purple80
import com.rcflechas.learningcompose.ui.theme.PurpleGrey40

@Preview(showSystemUi = true)
@Composable
fun CustomButton() {

    var counter by remember {
        mutableIntStateOf(0)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row {
            Button(
                colors = ButtonDefaults.buttonColors(
                    containerColor = Purple80,
                    contentColor = Color(0xFFFFFFFF),
                ),
                border = BorderStroke(2.dp, color = PurpleGrey40),
                onClick = { counter +=1 }
            ) {
                Text(text = "Click me!", style = TextStyle(
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = FontFamily.Cursive,
                    fontSize = 16.sp
                ))
            }
            CustomSpacer(width = 4)
            OutlinedButton(onClick = { counter +=1 }) {
                Text(text = "Click me!", style = TextStyle(
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = FontFamily.Cursive,
                    fontSize = 16.sp
                ))
            }
            CustomSpacer(width = 4)
            TextButton(onClick = { counter +=1 }) {
                Text(text = "Click me!", style = TextStyle(
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = FontFamily.Cursive,
                    fontSize = 16.sp
                ))
            }
        }
        CustomSpacer(height = 8)
        Text(
            text = "Clicks: $counter"
        )
    }
}