package com.ananananzhuo.composecanvessample

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp
import java.math.BigDecimal
import kotlin.math.sqrt

/**
 * author  :mayong
 * function:绘制椭圆
 * date    :2021/8/14
 **/

@Composable
fun canvasDrawEllipse() {
    Box(modifier = Modifier.fillMaxSize(1f), contentAlignment = Alignment.Center) {
        Canvas(
            modifier = Modifier
                .fillMaxSize(1f)
                .padding(30.dp)
        ) {
            drawCircle(brush = ShaderBrush(Shader()))
            drawArc(
                color = Color.Red,
                0f,
                sweepAngle = 360f,
                useCenter = true,
                topLeft = Offset(0f, 0f),
                style = Stroke()
            )
        }
    }
}