package com.metehanbolat.movingtextanimationcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.movingtextanimationcompose.ui.theme.MovingTextAnimationComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MovingTextAnimationComposeTheme {

            }
        }
    }
}
