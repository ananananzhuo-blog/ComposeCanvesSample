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


@Composable
fun canvasDrawCycle() {
    Box(modifier = Modifier.fillMaxSize(1f), contentAlignment = Alignment.Center) {
        Canvas(modifier = Modifier.size(300.dp)) {
            drawCircle(
                color = Color.Red,//填充颜色
                radius = 100.dp.toPx(),//设置绘制圆的半径
                center = Offset(size.width / 2, size.height / 2),//设置圆心中心坐标
                )
        }
    }
}