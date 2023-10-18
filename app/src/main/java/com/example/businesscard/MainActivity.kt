package com.example.businesscard

import android.inputmethodservice.Keyboard
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.businesscard.ui.theme.BusinesscardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinesscardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        foto()
                        info("Muhammad Bahri Syahputra", "Bahrisyp@gmail.com", "08114187071")
                    }
                }
            }
        }
    }
}
@Composable
fun foto(modifier: Modifier = Modifier){
    Icon(
        imageVector = Icons.Default.AccountBox,
        contentDescription = "Foto",
        modifier = modifier
            .size(width = 200.dp, height = 200.dp)
            .padding(top = 30.dp)
    )
}
@Composable
fun info(name: String, email:String, nohp:String, modifier: Modifier = Modifier) {
    Column{
        Row{
            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = null
            )
            Text(
                text = "Nama: $name",
                modifier = modifier
            )
        }
    Row {
        Icon(
            imageVector = Icons.Default.Email,
            contentDescription = null
        )
        Text(
            text = "Email $email",
            modifier = modifier
        )
    }
    Row {
        Icon(
            imageVector = Icons.Default.Call,
            contentDescription = null
        )
        Text(
            text = "No HP: $nohp",
            modifier = modifier
        )
    }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinesscardTheme {
        Column {
        foto()
        info("Muhammad Bahri Syahputra", "Bahrisyp@gmail.com", "08114187071")
        }
        }
}