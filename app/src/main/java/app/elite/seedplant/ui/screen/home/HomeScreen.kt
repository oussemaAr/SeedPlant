package app.elite.seedplant.ui.screen.home

import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.elite.seedplant.ui.screen.base.BaseComponent
import java.util.*

@Composable
fun HomeScreen() {
    Scaffold {
        HomeContent()
    }
}

@Composable
fun AppTopBar() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        Row {
            Spacer(modifier = Modifier.weight(1F))
            Icon(imageVector = Icons.Default.Notifications)
        }
        Text(
            text = "SeedPlant",
            fontSize = 75.sp,
        )
        Text(
            text = "Most Plants grow from seeds".toUpperCase(Locale.getDefault()),
            fontSize = 18.sp,
        )
    }
}

@Composable
fun HomeContent() {
    ScrollableColumn {

        AppTopBar()

        SearchComponent()

        BaseComponent(title = "Our Story") {
            StoryComponent()
        }

        BaseComponent(title = "Plant Of The Month") {
            PlantComponent()
        }

        BaseComponent(title = "Top Category") {
            TopCategoryComponent()
        }

        BaseComponent(title = "Best Sellers") {
            BestSellerComponent()
        }
        Spacer(modifier = Modifier.height(36.dp))
    }
}





