package app.elite.seedplant

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.ui.platform.setContent
import androidx.navigation.compose.rememberNavController
import app.elite.seedplant.ui.SeedPlantTheme
import app.elite.seedplant.ui.screen.home.HomeScreen

class MainActivity : AppCompatActivity() {


    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SeedPlantTheme {
                HomeScreen()
            }

        }
    }

}
