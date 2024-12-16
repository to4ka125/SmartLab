package com.example.smartlab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.lifecycleScope
import com.example.smartlab.layouts.OnBoard
import com.example.smartlab.ui.theme.SmartLabTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        var keepSplashScreen = true
        super.onCreate(savedInstanceState)
        splashScreen.setKeepOnScreenCondition{keepSplashScreen}
        lifecycleScope.launch {
            delay(2000)
            keepSplashScreen = false
        }
        enableEdgeToEdge()
        setContent {
            SmartLabTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    OnBoard(buttonText="Пропустить", headerText = "Анализы"
                        ,decriptionText="Экспресс сбор и получение проб",
                        dotsImg = ImageBitmap.imageResource(R.drawable.group1),
                        ilustrasion= ImageBitmap.imageResource(R.drawable.img1),
                        modifier = Modifier.padding(innerPadding))
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