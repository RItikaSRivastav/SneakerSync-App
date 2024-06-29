package com.example.sneakersync

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.tooling.preview.Preview
import com.example.sneakersync.Navigation.AppNavHost
import com.example.sneakersync.screens.ProductDetailScreen
import com.example.sneakersync.screens.ProductScreen
import com.example.sneakersync.ui.theme.SneakerSyncTheme

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SneakerSyncTheme {
               Scaffold(modifier = Modifier.fillMaxSize()
                 ) { innerPadding ->
                    AppNavHost(modifier = Modifier.padding(innerPadding))

                }


                }
            }
        }
    }



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SneakerSyncTheme {
        Greeting("Android")
    }
}
