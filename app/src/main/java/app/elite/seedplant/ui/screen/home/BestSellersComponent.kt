package app.elite.seedplant.ui.screen.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.elite.seedplant.R

@Composable
fun BestSellerComponent() {
    Spacer(modifier = Modifier.height(8.dp))
    LazyRow(content = {
        items(
            listOf(
                ItemForSell(R.drawable.item_one, 86, "Burrito"),
                ItemForSell(R.drawable.item_two, 75, "Kentia Plam"),
                ItemForSell(R.drawable.item_three, 14, "Sansevieria"),
                ItemForSell(R.drawable.item_four, 29, "Asparagus")
            )
        ) {
            BestSellersItem(it)
        }
    })
    Spacer(modifier = Modifier.height(24.dp))
}

@Composable
fun BestSellersItem(item: ItemForSell) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Box {
            Card(
                elevation = 0.dp,
                shape = RoundedCornerShape(16.dp),
                backgroundColor = Color(0xFFF5F5F5),
                modifier = Modifier.align(
                    Alignment.TopEnd
                ).size(125.dp)
            ) {

            }
            Image(bitmap = imageResource(id = item.image))
        }
        Text(text = "$${item.price}", fontSize = 48.sp)
        Text(text = item.name, fontSize = 20.sp, fontWeight = FontWeight.Bold)
    }
}

data class ItemForSell(
    val image: Int,
    val price: Int,
    val name: String
)