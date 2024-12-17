package com.example.smartlab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.lifecycleScope
import com.example.smartlab.layouts.OnBoard
import com.example.smartlab.ui.theme.SmartLabTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalFoundationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        enableEdgeToEdge()
        setContent {
            val pagerState = rememberPagerState(pageCount = {
                3
            })
            SmartLabTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HorizontalPager(state = pagerState) {page->
                        if (page == 0) {

                            OnBoard(
                                buttomText = "Пропустить", headeText = "Анализы",
                                descriptionText = "Экспресс сбор и получение проб",
                                dotsImageBitmap = ImageBitmap.imageResource(R.drawable.group1),
                                illustration = ImageBitmap.imageResource(R.drawable.img1),
                                modifier = Modifier.padding(innerPadding)
                            )
                        }else if (page==1) {

                            OnBoard(
                                buttomText = "Пропустить", headeText = "Уведомления",
                                descriptionText = "Вы быстро узнаете о результатах",
                                dotsImageBitmap = ImageBitmap.imageResource(R.drawable.group2),
                                illustration = ImageBitmap.imageResource(R.drawable.img2),
                                modifier = Modifier.padding(innerPadding))
                        }else{

                            OnBoard(
                                buttomText = "Завершить", headeText = "Мониторинг",
                                descriptionText = "Наши врачи всегда наблюдают \n" +
                                        "за вашими показателями здоровья",
                                dotsImageBitmap = ImageBitmap.imageResource(R.drawable.group3),
                                illustration = ImageBitmap.imageResource(R.drawable.img3),
                                modifier = Modifier.padding(innerPadding))
                        }



                    }

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

}