package com.rcflechas.learningcompose.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun CustomSwitch() {
    var state by rememberSaveable { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            // Switch component
            Switch(
                checked = state,
                onCheckedChange = { state = it }
            )

            // Spacer to add some space between the Switch and the Text
            Spacer(modifier = Modifier.width(8.dp))

            // Text component to display the label
            Text(text = if (state) "Switch is ON" else "Switch is OFF")
        }

        Switch(
            checked = state,
            onCheckedChange = { state = it },
            enabled = true,
            colors = SwitchDefaults.colors(
                uncheckedThumbColor = Color.Red,
                checkedThumbColor = Color.Green,
                uncheckedTrackColor = Color(0xFFFACDD1),
                checkedTrackColor = Color(0xFFD5FACD),
                uncheckedBorderColor = Color.Red,
                checkedBorderColor = Color.Green
            )
        )
    }
}