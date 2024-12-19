package com.example.smartlab.layouts

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.lerp

import androidx.compose.ui.unit.sp
import com.example.smartlab.R
import com.example.smartlab.components.OnBoardDescription
import com.example.smartlab.components.PrimaryButton
import com.example.smartlab.ui.theme.AccentInactiveColor
import com.example.smartlab.ui.theme.InputBGColor
import com.example.smartlab.components.TextInput
import com.example.smartlab.ui.theme.AccentColor
import com.example.smartlab.ui.theme.InputFocusedBorderColor
import com.example.smartlab.ui.theme.InputStrokeColor
import com.example.smartlab.ui.theme.textDescription
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

@Composable
fun CodeConfirmation(modifier: Modifier = Modifier, OnClick:()->Unit) {
    val textField = remember { mutableStateListOf("","","","","","") }

    var timerSeconds by remember { mutableStateOf(60) }

    var isTimerRunning by remember { mutableStateOf(true) }

    val allFieldsFilled = textField.all { it.isNotBlank() }

    LaunchedEffect(key1 = isTimerRunning) {
        if (isTimerRunning) {
            while (timerSeconds > 0) {
                delay(1000L)
                timerSeconds--
            }
            isTimerRunning = false
        }
    }


    Column(modifier = modifier
        .fillMaxSize()
        .padding(top = 24.dp, start = 20.dp,end=20.dp, bottom = 56.dp)){

        val supabaseUrl ="https://tzqaajdkrazubgkrsaow.supabase.co";
        val supabaseKey ="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InR6cWFhamRrcmF6dWJna3JzYW93Iiwicm9sZSI6ImFub24iLCJpYXQiOjE3MzQ2Mjc3MTQsImV4cCI6MjA1MDIwMzcxNH0.HGywS1RnYta73ORLJ21VnccU4EaDGi9drecyWsF8rVY";


        Button(
            onClick = {OnClick()},
            modifier = Modifier.padding(0.dp),

            colors = ButtonDefaults.buttonColors(
                containerColor = InputBGColor,
                contentColor = Color.White,
                disabledContentColor = Color.White,
                disabledContainerColor = AccentInactiveColor
            ),
            shape = RoundedCornerShape(9.dp),

        ) {
           Image(imageVector = ImageVector.vectorResource(R.drawable.vector),null)
        }
        Spacer(modifier.height(132.dp))
        Text(text = "Введите код из E-mail",
            fontSize = 17.sp,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        )
        Spacer(Modifier.height(20.dp))
        Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
            textField.forEachIndexed{index,value->
                OutlinedTextField(
                    value=value, onValueChange = {newValue->
                        textField[index] = newValue
                    },modifier = Modifier.size(48.dp)
                    , colors = OutlinedTextFieldDefaults.colors(
                        focusedContainerColor = InputBGColor,
                        unfocusedContainerColor = InputBGColor,
                        focusedPlaceholderColor = Color.Black.copy(alpha = 0.5f),
                        unfocusedPlaceholderColor = Color.Black.copy(alpha = 0.5f),
                        focusedBorderColor = InputFocusedBorderColor,
                        unfocusedBorderColor = InputStrokeColor,
                        cursorColor = AccentColor
                    ),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    )
                )
            }
        }
        Spacer(Modifier.height(20.dp))

        if (isTimerRunning) {
            Text(
                text = "Отправить код повторно можно\nбудет через $timerSeconds секунд",
                style = TextStyle(fontSize = 14.sp, color = Color.Gray),
                textAlign = TextAlign.Center,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        } else {
            PrimaryButton(modifier = Modifier, text = "Выслать код повторно",onClick = {
                timerSeconds = 60
                isTimerRunning = true
            })
        }
    }
}



@Preview
@Composable
private fun CodeConfirmationView() {
    CodeConfirmation(OnClick = {})
}