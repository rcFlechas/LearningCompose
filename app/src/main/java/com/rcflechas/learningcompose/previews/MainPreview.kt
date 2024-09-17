package com.rcflechas.learningcompose.previews

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.rcflechas.learningcompose.Greeting
import com.rcflechas.learningcompose.ui.theme.LearningComposeTheme

@Preview(
    name = "Greeting",
    showBackground = true,
    showSystemUi = false,
    apiLevel = 29,
    device = Devices.PIXEL_4
)
@Composable
fun GreetingPreview() {
    LearningComposeTheme {
        Greeting(
            "Android Dev hello 1",
            Modifier
                .fillMaxWidth()
                .clickable {
                }
        )
    }
}

