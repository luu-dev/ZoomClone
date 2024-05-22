package com.project.zoomclone.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun DefaultHorizontalDivider(
    modifier: Modifier = Modifier,
) {
    Box(modifier = Modifier.fillMaxSize()) {
        // Your content here
        Divider(color = Color.Gray, thickness = 1.dp)
    }
}