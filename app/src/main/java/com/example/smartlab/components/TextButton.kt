package com.example.smartlab.components

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.smartlab.ui.theme.textButton


@Composable
fun TextButton(modifier: Modifier = Modifier,text:String,onClick:()-> Unit ={}) {
    Text(text = text,
        modifier = modifier
            .clickable { onClick() },
        color = textButton,
        fontSize = 20.sp,
        fontWeight = FontWeight.SemiBold
    )

}