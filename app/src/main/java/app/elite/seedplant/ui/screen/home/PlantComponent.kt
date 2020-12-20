package app.elite.seedplant.ui.screen.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.elite.seedplant.R

@Composable
fun PlantComponent() {
    PlantItem()
}


@Preview
@Composable
fun PreviewPlantItem() {
    PlantItem()
}

@Composable
fun PlantItem() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(16.dp)
    ) {
        Image(bitmap = imageResource(id = R.drawable.plant_image))
        Text(text = "Peperomia", fontSize = 48.sp)
        Text(text = "$35", fontSize = 48.sp)
        Spacer(modifier = Modifier.height(8.dp))
        Button(
            shape = RectangleShape,
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(0xFF131313)
            )
        ) {
            Text(
                text = "DISCOVER NOW",
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth().padding(8.dp),
            )
        }
    }
}
