package com.example.smartlab.layouts

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.smartlab.R
import com.example.smartlab.ui.theme.EmailColor
import com.example.smartlab.components.PrimaryButton
import com.example.smartlab.components.TextInput

@Composable
fun Authorization (modifier: Modifier = Modifier) {
    Column(modifier = modifier
        .fillMaxSize()
        .padding(top = 59.dp, start = 20.dp,end=20.dp, bottom = 56.dp)){
        Row {
            Image(ImageBitmap.imageResource(R.drawable.hello),null, modifier = Modifier.width(32.dp).height(32.dp))
            Spacer(Modifier.width(16.dp))
            Text(text = "Добро пожаловать!", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        }
        Spacer(Modifier.size(20.dp))
        Text(
            text = "Войдите, чтобы пользоваться функциями приложения",
            fontSize = 15.sp,
            lineHeight = 20.sp,
            fontWeight = FontWeight(400)
        )
        Spacer(Modifier.size(64.dp))
        Text(
            text = "Вход по E-mail",
            fontSize = 14.sp,
            lineHeight = 20.sp,
            fontWeight = FontWeight(400),
            color = EmailColor
        )
        Spacer(Modifier.height(4.dp))
        TextInput(placeholder = "example@mail.ru", modifier = Modifier.fillMaxWidth(1f))
        Spacer(Modifier.size(32.dp))
        PrimaryButton(onClick={}, text = "Далее", Enable = false,modifier = Modifier.fillMaxWidth(1f).height(56.dp))
    }
}


@Preview
@Composable
private fun AuthorizationPrev () {
    Authorization()
}