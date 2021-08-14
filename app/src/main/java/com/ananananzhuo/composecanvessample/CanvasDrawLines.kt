package com.ananananzhuo.composecanvessample

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/**
 * author  :mayong
 * function:
 * date    :2021/8/14
 **/


/**
 * 画直线
 */
@Composable
fun canvasDrawLines() {
    Box(modifier = Modifier.fillMaxSize(1f), contentAlignment = Alignment.Center) {
        Canvas(modifier = Modifier.size(300.dp)) {
            drawLine(
                color = Color.Red,
                start = Offset(0f, 0f),
                end = Offset(size.width, size.height),
                strokeWidth = 5f
            )
        }
    }
}