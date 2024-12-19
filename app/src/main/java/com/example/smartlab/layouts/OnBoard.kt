package com.example.smartlab.layouts

import android.graphics.drawable.BitmapDrawable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.smartlab.R
import com.example.smartlab.components.OnBoardDescription
import com.example.smartlab.components.OnBoardHeader
import com.example.smartlab.components.TextButton
import com.example.smartlab.ui.theme.textDescription

@Composable
fun OnBoard(modifier: Modifier = Modifier, buttomText: String,
            headeText: String, descriptionText: String,
            dotsImageBitmap: ImageBitmap,
            illustration: ImageBitmap ,
            onClick: () -> Unit) {
    Column(modifier = modifier.fillMaxSize().padding(20.dp)) {

        Row {
            TextButton(text = buttomText, modifier = Modifier.weight(1f),
                onClick = { onClick() }, fontSize = 20.sp)
            Image(ImageBitmap.imageResource(R.drawable.shapeadd),
                null,
                modifier = Modifier.weight(1f)
                    .fillMaxSize(0.3f),
                alignment=Alignment.CenterEnd)
        }
        Spacer(Modifier.height(29.dp))
        OnBoardHeader(text = headeText, modifier = Modifier.align(Alignment.CenterHorizontally))
        Spacer(Modifier.height(29.dp))
        OnBoardDescription(text = descriptionText, modifier = Modifier.align(Alignment.CenterHorizontally))
        Spacer(Modifier.height(60.dp))
        Image(dotsImageBitmap,null, modifier = Modifier.align(Alignment.CenterHorizontally).size(58.dp))
//        Spacer(Modifier.weight(1f))
        Image(illustration,null, modifier = Modifier.align(Alignment.CenterHorizontally).fillMaxSize(0.8f))
    }
}

