package com.adri.what2watch

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.adri.what2watch.ui.theme.What2watchTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            What2watchTheme {
                    What2watchApp()
            }
        }
    }
}

@Composable
fun What2watchApp() {
    Text("What2Watch")
}

@Preview(showBackground = true)
@Composable
fun What2WatchAppPreview() {
    What2watchTheme {
        What2watchApp()
    }
}