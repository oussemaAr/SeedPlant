package app.elite.seedplant.ui.screen.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import app.elite.seedplant.R

@Composable
fun StoryComponent() {
    val state =  rememberLazyListState(2)
    LazyRow(content = {
        val data = listOf(
            "Grass\nTROPICAL GRASS",
            "Grass\nTROPICAL GRASS",
            "Grass\nTROPICAL GRASS",
            "Grass\nTROPICAL GRASS",
            "Grass\nTROPICAL GRASS",
        )
        items(data) {
            CardItem(it)
        }
    }, state = state )
}

@Composable
fun CardItem(text: String) {
    val annotatedString = AnnotatedString.Builder(text)
        .apply {
            addStyle(
                SpanStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 72.sp
                ), 0, 5
            )
        }
    Card(modifier = Modifier.padding(8.dp)) {
        Box {
            Text(
                text = annotatedString.toAnnotatedString(),
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier.zIndex(10F)
                    .align(Alignment.Center)
            )
            Image(bitmap = imageResource(id = R.drawable.image_one))
        }
    }
}


@Preview
@Composable
fun PreviewCardItem() {
    CardItem(text = "Grass\nTOPICAL GRASS")
}
