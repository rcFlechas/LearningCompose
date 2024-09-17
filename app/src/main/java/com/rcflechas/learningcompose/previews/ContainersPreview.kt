package com.rcflechas.learningcompose.previews

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.rcflechas.learningcompose.containers.CustomBox
import com.rcflechas.learningcompose.containers.CustomColumn
import com.rcflechas.learningcompose.containers.CustomConstraintLayout
import com.rcflechas.learningcompose.containers.CustomRow
import com.rcflechas.learningcompose.ui.theme.LearningComposeTheme

@Preview(name = "Box", showBackground = true, showSystemUi = false)
@Composable
fun BoxPreview() {
    LearningComposeTheme {
        CustomBox()
    }
}

@Preview(name = "Column", showBackground = true, showSystemUi = true)
@Composable
fun ColumnPreview() {
    LearningComposeTheme {
        CustomColumn()
    }
}

@Preview(name = "Row", showBackground = true, showSystemUi = true)
@Composable
fun RowPreview() {
    LearningComposeTheme {
        CustomRow()
    }
}

@Preview(name = "ConstraintLayout", showBackground = true, showSystemUi = true)
@Composable
fun ConstraintLayoutPreview() {
    LearningComposeTheme {
        CustomConstraintLayout()
    }
}