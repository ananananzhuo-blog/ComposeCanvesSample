package com.ananananzhuo.composecanvessample

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.withTransform
import androidx.compose.ui.unit.dp

/**
 * author  :mayong
 * function:
 * date    :2021/8/14
 **/

@Composable
fun canvasDRawScope() {
    Box(modifier = Modifier.fillMaxSize(1f), contentAlignment = Alignment.Center) {
        Canvas(modifier = Modifier.size(300.dp)) {
            withTransform({
                rotate(30f, Offset(size.width / 2, size.height / 2))
                scale(2f, 2f)
            }) {
                drawRect(
                    Color.Red,
                    topLeft = Offset((300.dp.toPx() - 200) / 2, (300.dp.toPx() - 200) / 2),
                    size = Size(200f, 200f),
                )
            }
        }
    }
}