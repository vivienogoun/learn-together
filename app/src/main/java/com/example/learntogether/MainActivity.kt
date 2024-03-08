package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Article(
                        image = painterResource(id = R.drawable.bg_compose_background),
                        title = stringResource(R.string.article_title),
                        intro = stringResource(R.string.article_intro),
                        body = stringResource(R.string.article_body)
                    )
                }
            }
        }
    }
}

@Composable
fun Article(image: Painter, title: String, intro: String, body: String, modifier: Modifier = Modifier) {
    Column(modifier) {
        Image(painter = image, contentDescription = title)
        Column {
            Text(text = title, fontSize = 24.sp, modifier = Modifier.padding(16.dp))
            Text(text = intro, textAlign = TextAlign.Justify, modifier = Modifier.padding(start = 16.dp, end = 16.dp))
            Text(text = body, textAlign = TextAlign.Justify, modifier = Modifier.padding(16.dp))
        }
    }
}