package com.rcflechas.learningcompose.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun CustomTextField() {

    var dynamicText by remember {
        mutableStateOf("")
    }

    Column(modifier = Modifier.fillMaxSize()) {
        TextField(
            label = { Text(text = "Placeholder...")},
            value = dynamicText,
            onValueChange = {
                dynamicText = if (it.contains("a")) {
                    it.replace("a", "")
                } else {
                    it
                }
            }
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun CustomOutlinedTextField() {

    var dynamicText by remember {
        mutableStateOf("")
    }

    Column(modifier = Modifier.fillMaxSize()) {
        OutlinedTextField(
            modifier = Modifier
                .width(200.dp)
                .padding(16.dp),
            label = {
                Text(text = "This is an example!", style = TextStyle(
                    color = Color.Green,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = FontFamily.Cursive
                )
                )
            },
            value = dynamicText,
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Green,
                unfocusedBorderColor = Color.Red
            ),
            onValueChange = {
                dynamicText = it
            }
        )
    }
}