package com.example.smartlab.layouts

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.smartlab.components.TextButton
import com.example.smartlab.ui.theme.textButton


@Composable
fun CardPaticient (modifier: Modifier = Modifier) {
    Column {
        Row {
            Text(text="Создание карты пациента")
            TextButton(text="Пропустить", fontSize =15.sp)
        }
    }
}

@Preview
@Composable
private fun CardPaticientView() {

}