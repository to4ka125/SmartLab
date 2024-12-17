package com.example.smartlab.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PrimaryButton(modifier: Modifier = Modifier, onClick: () -> Unit = {}, Enable:Boolean=true, text:String) {
    Button(
        onClick = {},
        modifier=modifier,
        enabled = Enable,
        shape = RoundedCornerShape(10.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = AccentColor,
            contentColor = Color.White,
            disabledContentColor = Color.White,
            disabledContainerColor = AccentInactiveColor
        )
    ) {
        Text(
            text = text,
            fontSize = 17.sp,
            fontWeight = FontWeight.SemiBold,
            lineHeight = 24.sp
        )
    }

}
