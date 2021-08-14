package com.ananananzhuo.composecanvessample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ananananzhuo.composecanvessample.ui.theme.ComposeCanvesSampleTheme
import com.ananananzhuo.composelib.ListView
import com.ananananzhuo.composelib.bean.ItemData
import com.ananananzhuo.composelib.buildTopBar
import com.ananananzhuo.composelib.constants.*
import com.ananananzhuo.composelib.statusbarColor
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCanvesSampleTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    rememberSystemUiController().apply {
        setStatusBarColor(statusbarColor, false)
        setNavigationBarColor(statusbarColor, false)
    }
    val controller = rememberNavController()
    Scaffold(topBar = {
        buildTopBar("Canvas绘制")
    }) {
        buildNavHost(controller)
    }
}

@Composable
fun buildNavHost(controller: NavHostController) {
    NavHost(navController = controller, startDestination = PAGE1) {
        composable(PAGE1) {
            Home(controller)
        }
        composable(PAGE2) {
            canvasDrawCycle()
        }
        composable(PAGE3) {
            canvasDrawPoints()
        }
        composable(PAGE4) {
            canvasDrawLines()
        }
        composable(PAGE5) {
            canvasDrawPath()
        }
        composable(PAGE6){
            canvasDRawScope()
        }
    }
}

@Composable
fun Home(controller: NavHostController) {
    val datas = remember {
        mutableStateListOf(
            ItemData(title = "画圆", tag = PAGE2),
            ItemData(title = "画多个点", tag = PAGE3),
            ItemData(title = "画线", tag = PAGE4),
            ItemData(title = "画路径path", tag = PAGE5),
            ItemData(title = "画过程中进行转换",tag = PAGE6)
        )
    }
    ListView(datas = datas, click = { itemData: ItemData, _, _ ->
        controller.navigate(itemData.tag)
    })
}