package com.example.smartlab.layouts

import android.graphics.Color
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.smartlab.components.OnBoardDescription
import com.example.smartlab.components.PrimaryButton
import com.example.smartlab.components.TextButton
import com.example.smartlab.components.TextInput


@Composable
fun PatientCard(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(60.dp)){
        Row() {
            Text(
                text = "Создание карты \nпациента",
                lineHeight = 28.sp,
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.weight(1f)
            )
            TextButton(
                text = "Пропустить",
                onClick = {},
                fontSize = 15.sp,
                modifier = Modifier.padding(top = 8.dp, end = 0.dp, start = 0.dp, bottom = 0.dp)
            )
        }
        Spacer(modifier.height(16.dp))
        OnBoardDescription(
            text = "Без карты пациента вы не сможете заказать анализы.\n" +
                    "В картах пациентов будут храниться результаты анализов вас и ваших близких."
        )
        Spacer(modifier.height(20.dp))
        TextInput(placeholder = "Имя", modifier = Modifier.fillMaxWidth())
        Spacer(modifier.height(24.dp))
        TextInput(placeholder = "Отчество", modifier = Modifier.fillMaxWidth())
        Spacer(modifier.height(24.dp))
        TextInput(placeholder = "Фамилия", modifier = Modifier.fillMaxWidth())
        Spacer(modifier.height(24.dp))
        TextInput(placeholder = "Дата рождения", modifier = Modifier.fillMaxWidth())
        Spacer(modifier.height(24.dp))
            Spacer(modifier.height(48.dp))
            PrimaryButton(
                text = "Создать",
                modifier = Modifier.fillMaxWidth().height(56.dp),
                Enable = false
            )


        }
    }

@Preview
@Composable
private fun PatientCardPrev() {
    PatientCard()
}