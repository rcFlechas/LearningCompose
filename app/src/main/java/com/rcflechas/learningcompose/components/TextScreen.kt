package com.rcflechas.learningcompose.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun CustomText() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "This is an example!")
        Text(text = "This is an example!", fontSize = 32.sp)
        Text(text = "This is an example!", color = Color.Blue)
        Text(text = "This is an example!", fontWeight = FontWeight.Bold)
        Text(text = "This is an example!", fontWeight = FontWeight.ExtraLight)
        Text(text = "This is an example!", style = TextStyle(
            color = Color.Green,
            fontWeight = FontWeight.SemiBold,
            fontFamily = FontFamily.Cursive
        ))
        Text(text = "This is an example!", textDecoration = TextDecoration.LineThrough)
        Text(text = "This is an example!", textDecoration = TextDecoration.Underline)
        Text(text = "This is an example!", textDecoration = TextDecoration.combine(
            listOf(TextDecoration.LineThrough, TextDecoration.Underline)
        ))
    }
}