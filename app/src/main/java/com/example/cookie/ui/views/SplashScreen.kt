package com.example.cookie.ui.views
import android.annotation.SuppressLint
import androidx.activity.ComponentActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.cookie.R


@SuppressLint("CustomSplashScreen")
class SplashScreen : ComponentActivity() {

    @SuppressLint("NotConstructor")
    @Composable
    fun SplashScreen() {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painterResource(R.drawable.logo_foreground),
                contentDescription = null,
                modifier = Modifier.requiredSize(200.dp),
                contentScale = ContentScale.Fit,

            )
        }
    }
}

