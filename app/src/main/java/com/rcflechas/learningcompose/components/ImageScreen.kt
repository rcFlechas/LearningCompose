package com.rcflechas.learningcompose.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rcflechas.learningcompose.R

@Preview(showSystemUi = true)
@Composable
fun CustomImage() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(12.dp)
            .background(
                Color.White
            )
            .border(1.dp, Color.LightGray)
    ) {
        Box(modifier = Modifier.width(60.dp).height(60.dp).padding(4.dp)) {
            Image(
                modifier = Modifier
                    .clip(CircleShape)
                    .border(1.dp, Color.Cyan, CircleShape),
                contentScale = ContentScale.Fit,
                painter = painterResource(id = R.drawable.profile),
                contentDescription = "Artist image"
            )
            Icon(
                modifier = Modifier.align(Alignment.BottomEnd),
                painter = painterResource(id = R.drawable.baseline_check_circle_24),
                tint = Color.Cyan,
                contentDescription = "Check mark"
            )
        }
        Column(modifier = Modifier.padding(end = 4.dp)) {
            Text(text = "Renzon Caceres", fontWeight = FontWeight.SemiBold)
            Text(
                text = "Software Engineer",
                style = TextStyle(
                    color = Color.Gray,
                    fontFamily = FontFamily.Cursive
                )
            )
        }
    }
}