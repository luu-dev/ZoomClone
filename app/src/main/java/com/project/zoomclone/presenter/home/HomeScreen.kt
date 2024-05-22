package com.project.zoomclone.presenter.home

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.project.zoomclone.R
import com.project.zoomclone.component.DefaultHorizontalDivider
import com.project.zoomclone.component.StatusBarColor
import com.project.zoomclone.component.TopAppBar
import com.project.zoomclone.ui.theme.ZoomCloneTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    onNewMeetingClick: () -> Unit = {},
    onJoinMeetingClick: () -> Unit = {},
) {
    StatusBarColor(color = Color.DarkGray)
    Scaffold(topBar = {
        TopAppBar(title = "Screen", idIcon = androidx.core.R.drawable.ic_call_answer_video)
    }) { innerPadding ->
        Column {
            Row(
                modifier = Modifier
                    .padding(innerPadding)
                    .background(MaterialTheme.colorScheme.surface)
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                LobbyItem(
                    icon = painterResource(id = androidx.core.R.drawable.ic_call_answer),
                    "record",
                    color = Color.Blue
                )
                LobbyItem(
                    icon = painterResource(id = androidx.core.R.drawable.ic_call_answer),
                    "record",
                    color = Color.Blue
                )
                LobbyItem(
                    icon = painterResource(id = androidx.core.R.drawable.ic_call_answer),
                    "record",
                    color = Color.Blue
                )
                LobbyItem(
                    icon = painterResource(id = androidx.core.R.drawable.ic_call_answer),
                    "record",
                    color = Color.Blue
                )

            }
            DefaultHorizontalDivider()
        }

    }
}

@Composable
fun LobbyItem(
    icon: Painter,
    caption: String,
    color: Color,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(16.dp))
                .background(color = color)
                .size(64.dp)
                .clickable { onClick() },
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = icon,
                contentDescription = caption,
                tint = MaterialTheme.colorScheme.onPrimary
            )
        }
        Text(
            text = caption,
            fontSize = 12.sp,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            letterSpacing = (-0.45).sp
        )

    }
}


@Preview(showBackground = true)
@Composable
fun HomePreview() {
    ZoomCloneTheme {
        HomeScreen()
    }
}

