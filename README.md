

关注公众号学习更多知识

![](https://files.mdnice.com/user/15648/404c2ab2-9a89-40cf-ba1c-02df017a4ae8.jpg)




## Canvas
### Canvas绘制基本图像
#### Paint

#### 绘制圆
##### 代码

```kotlin
 Canvas(modifier = Modifier.size(300.dp)) {
            drawCircle(
                color = Color.Red,//填充颜色
                radius = 100.dp.toPx(),//设置绘制圆的半径
                center = Offset(size.width / 2, size.height / 2),//设置圆心中心坐标
                )
        }
```


##### 效果

![](https://files.mdnice.com/user/15648/63cd02d0-8b00-4523-9848-fef779fc9f2e.png)

#### 绘制点
##### 代码

```kotlin
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
```
##### 效果

![](https://files.mdnice.com/user/15648/ff731be5-7b82-4386-b972-66bbcba4c017.png)


#### 绘制线
##### 代码

```kotlin
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
```
##### 效果

![](https://files.mdnice.com/user/15648/088a59e9-0a23-4dee-b8da-a7ac2e27ff8d.png)



#### 绘制path
##### 代码

```kotlin
Canvas(modifier = Modifier.size(300.dp)) {
            val path = Path().apply {
                moveTo(0f, 0f)
                lineTo(size.width, 0f)
                lineTo(size.width, size.height)
                lineTo(0f, size.height)
                lineTo(0f, 0f)
                close()
            }
//            drawPath(path = path, color = Color.Red, style = Fill)//画path实心的
            drawPath(path = path, color = Color.Red, style = Stroke(width = 10f))//画path线段的形式，非实心
        }
```
##### 填充的效果

![](https://files.mdnice.com/user/15648/f4f15452-48b7-44b5-8b0a-cd98e06f6f75.png)

##### 画线的效果

![](https://files.mdnice.com/user/15648/42e33400-7270-4668-af26-0712b6759270.png)





## withTransform对绘制图形进行多个转换
本节实现对Rect进行旋转并缩放两倍的效果
### 代码

```kotlin
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
```
### 效果

![](https://files.mdnice.com/user/15648/eb95be1a-85f6-49a3-87b7-892982fe8594.png)
