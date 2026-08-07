package com.ifce.advplayer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.ifce.advplayer.feature.home.HomeScreen
import com.ifce.advplayer.ui.theme.ADVPlayerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ADVPlayerTheme {
                HomeScreen(
                    onSelectVideo = {}
                )
            }
        }
    }
}