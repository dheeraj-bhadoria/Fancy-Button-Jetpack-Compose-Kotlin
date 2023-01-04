package com.jetpack.mylibrary
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


class FancyButton {

    @Composable
    fun FancyButton(button_width: Dp,
                    button_height: Dp,
                    button_color: Color,
                    button_radius: Dp,
                    button_outlined_color: Color,
                    button_outlined_width: Dp,
                    button_icon: ImageVector,
                    button_icon_color: Color,
                    button_text: String,
                    button_text_color: Color,
                    button_text_size: Dp
    ) {

        Box(
            Modifier
                .width(
                    button_width
                )
                .height(
                    button_height
                )
                .background(
                    button_color
                ).clip(
                    RoundedCornerShape(button_radius)
                ).border(
                    button_outlined_width,
                    button_outlined_color,
                    shape = RoundedCornerShape(button_radius),
                ).clickable {

                    Log.d("Button", "Pressed")

                }

        ){

            Row(
                modifier = Modifier.align(alignment = Alignment.Center)
            ) {
                Icon(
                    button_icon,
                    contentDescription = "",
                    tint = button_icon_color
                )

                Text(button_text,
                    Modifier.size(button_text_size),
                    color = button_text_color, )

            }

        }

    }
}