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
import androidx.compose.ui.graphics.PointMode
import androidx.compose.ui.unit.dp

/**
 * author  :mayong
 * function:
 * date    :2021/8/14
 **/

/**
 * 绘制多个点
 */
@Composable
fun canvasDrawPoints() {

    Box(modifier = Modifier.fillMaxSize(1f), contentAlignment = Alignment.Center) {
        Canvas(modifier = Modifier.size(300.dp)) {
            val points = mutableListOf<Offset>()
            val width = size.width.toInt()
            for (i in 1 until width step 40) {
                points.add(Offset(i.toFloat(), i.toFloat()))//正斜向的点
                val x = width / 2 + width / 2 - i
                points.add(Offset(x.toFloat(), i.toFloat()))//反斜向的点
            }
            drawPoints(
                points = points,
                pointMode = PointMode.Points,
                color = Color.Red,
                strokeWidth = 5.dp.toPx(),

                )
        }
    }
}