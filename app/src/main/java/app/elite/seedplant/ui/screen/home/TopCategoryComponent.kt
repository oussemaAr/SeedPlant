package app.elite.seedplant.ui.screen.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.elite.seedplant.R

@Preview
@Composable
fun TopCategoryComponent() {
    Card(
        modifier = Modifier.padding(16.dp).fillMaxWidth(),
        backgroundColor = Color(0xFFF5F5F5),
        shape = RoundedCornerShape(
            topLeft = 16F,
            topRight = 0F,
            bottomLeft = 0F,
            bottomRight = 16F
        )
    ) {
        Row {
            Image(
                bitmap = imageResource(id = R.drawable.image_plant_two),
                modifier = Modifier.background(color = Color(0xFFEFEFEF))
            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.align(Alignment.CenterVertically)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Flowering Plants",
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                )
                Text(
                    text = "12 Products",
                    fontSize = 16.sp,
                )

            }
        }

    }
}