package com.rcflechas.learningcompose.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun CustomRadioButton() {
    RadioGroup()
}

@Composable
fun RadioGroup() {
    var selectedOption by rememberSaveable { mutableStateOf("Option 1") }
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {
        RadioButtonWithText(
            text = "Option 1",
            selected = selectedOption == "Option 1",
            onClick = { selectedOption = "Option 1" }
        )
        RadioButtonWithText(
            text = "Option 2",
            selected = selectedOption == "Option 2",
            onClick = { selectedOption = "Option 2" }
        )
        RadioButtonWithText(
            text = "Option 3",
            selected = selectedOption == "Option 3",
            onClick = { selectedOption = "Option 3" }
        )
    }
}

@Composable
fun RadioButtonWithText(text: String, selected: Boolean, onClick: () -> Unit) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(4.dp)
        .clickable {
            onClick.invoke()
        }, verticalAlignment = Alignment.CenterVertically) {
        RadioButton(
            selected = selected,
            onClick = onClick
        )
        Text(text = text)
    }
}
