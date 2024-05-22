package com.project.zoomclone.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.project.zoomclone.Greeting
import com.project.zoomclone.R
import com.project.zoomclone.ui.theme.ZoomCloneTheme

@Composable
fun TopAppBar(title: String, idIcon: Int, iconVisible: Boolean = true, onIconClick: () -> Unit = {}) {
    Box(
        modifier = Modifier
            .background(color = Color.DarkGray)
            .fillMaxWidth()
            .height(56.dp)
            .padding(horizontal = 4.dp),
        contentAlignment = Alignment.CenterEnd

    ) {
        Text(
            text = title,
            fontSize = 17.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.align(
                Alignment.Center
            ),
            color = MaterialTheme.colorScheme.inverseOnSurface
        )

        if (iconVisible) IconButton(onClick = { onIconClick }) {
            Icon(
                painter = painterResource(id = idIcon),
                contentDescription = "",
                tint = MaterialTheme.colorScheme.inverseOnSurface
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ZoomCloneTheme {
        TopAppBar("Android", coil.base.R.drawable.ic_100tb) {

        }
    }
}