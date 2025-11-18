package com.lepilkin.pixletter


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lepilkin.pixletter.ui.theme.PixLetterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PixLetterTheme {
                GreetingText(message = "Royal Decree!\nDear Max,\nHis Majesty the King\nInvites you to a great feast!\nCome to the castle before sunset,\notherwise, you risk losing your head!", from = "From King Arthur", modifier = Modifier.padding(8.dp))
                }
            }
        }
    }




@Preview(showBackground = true)


@Composable
fun RoyaInvitationPreview() {

    PixLetterTheme {
        GreetingText(message = "Royal Decree!\nDear Max,\nHis Majesty the King\nInvites you to a great feast!\nCome to the castle before sunset,\notherwise, you risk losing your head!", from = "From King Arthur")

    }
}
@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = message,
            fontSize = 20.sp,
            lineHeight = 40.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )
    }
}
