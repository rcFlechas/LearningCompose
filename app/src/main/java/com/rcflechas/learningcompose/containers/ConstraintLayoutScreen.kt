package com.rcflechas.learningcompose.containers

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun CustomConstraintLayout() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (boxRed, boxBlue, boxYellow, boxGreen) = createRefs()

        Box(modifier = Modifier.size(125.dp).background(Color.Green).constrainAs(boxGreen) {
            start.linkTo(parent.start)
            top.linkTo(parent.top)
            end.linkTo(parent.end)
            bottom.linkTo(parent.bottom)
        })

        Box(modifier = Modifier.size(125.dp).background(Color.Yellow).constrainAs(boxYellow) {
            end.linkTo(boxGreen.start)
            bottom.linkTo(boxGreen.top)
        })

        Box(modifier = Modifier.size(125.dp).background(Color.Blue).constrainAs(boxBlue) {
            start.linkTo(boxGreen.end)
            bottom.linkTo(boxGreen.top)
        })
        
        Box(modifier = Modifier.size(125.dp).background(Color.Red).constrainAs(boxRed) {
            start.linkTo(parent.start)
            top.linkTo(boxGreen.bottom)
            end.linkTo(parent.end)
            bottom.linkTo(parent.bottom)
        })
    }
}