package com.rcflechas.learningcompose.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun CustomTriStateCheckbox() {
    Column {
        var state by rememberSaveable { mutableStateOf(ToggleableState.Indeterminate) }

        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            TriStateCheckbox(state = state, onClick = {
                state = when(state) {
                    ToggleableState.On -> ToggleableState.Off
                    ToggleableState.Off -> ToggleableState.Indeterminate
                    ToggleableState.Indeterminate -> ToggleableState.On
                }
            })
            Text(text = "Example Tri state")
        }
    }
}



@Composable
fun CustomCheckbox() {

    Column {
        getOptions(titles = listOf("Example 1", "Example 2", "Example 3")).forEach { checkInfo ->
            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                Checkbox(
                    checked = checkInfo.selected,
                    onCheckedChange = { checkInfo.onCheckedChange(checkInfo.selected.not()) }
                )
                Text(text = checkInfo.title)
            }
        }
    }
}

@Composable
fun getOptions(titles: List<String>): List<CheckInfo> {
    return titles.map {
        var state by rememberSaveable { mutableStateOf(false) }
        CheckInfo(
            title = it,
            selected = state,
            onCheckedChange = { state = it }
        )
    }
}

data class CheckInfo(
    val title: String,
    val selected: Boolean = false,
    val onCheckedChange: (Boolean) -> Unit
)