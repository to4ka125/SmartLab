package com.example.smartlab.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.smartlab.ui.theme.textDescription

@Composable
fun OnBoardDescription (modifier: Modifier = Modifier,text:String) {
    Text(
        text = text,
        modifier = modifier,
        color = textDescription,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 20.sp
    )
}