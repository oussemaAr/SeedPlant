package app.elite.seedplant.ui.screen.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import app.elite.seedplant.ui.orange200

@Composable
fun SearchComponent() {
    Spacer(modifier = Modifier.height(36.dp))
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(text = "What are you looking for?")
        Spacer(modifier = Modifier.height(4.dp))
        SearchByType()
        Spacer(modifier = Modifier.height(4.dp))
        OutlinedTextField(
            value = "",
            onValueChange = { /*TODO*/ },
            label = { Text(text = "Enter your keywords") },
            modifier = Modifier.fillMaxWidth(),
            trailingIcon = { Icon(imageVector = Icons.Default.Search, tint = Color.Black) }
        )
        Spacer(modifier = Modifier.height(24.dp))
        Divider(modifier = Modifier.padding(horizontal = 16.dp))
    }
}


@Composable
fun SearchByType() {
    Card(
        shape = MaterialTheme.shapes.medium,
        backgroundColor = orange200,

        ) {
        Row(
            modifier = Modifier.padding(16.dp).fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Type")
            DropDown()
        }
    }
}

@Composable
fun DropDown() {
    val items = listOf(
        "Trailing & Climbing Plants",
        "Trailing & Climbing Plants",
        "Trailing & Climbing Plants",
        "Trailing & Climbing Plants"
    )
    var showMenu by remember { mutableStateOf(false) }
    var selectedIndex by remember { mutableStateOf(0) }
    DropdownMenu(
        toggle = {
            Row {
                Text(
                    text = items[selectedIndex],
                    fontWeight = FontWeight.Light,
                    modifier = Modifier.clickable(onClick = { showMenu = true })
                )
                Icon(imageVector = Icons.Default.ArrowDropDown)
            }
        },
        expanded = showMenu,
        onDismissRequest = { showMenu = false },

        ) {
        items.forEachIndexed { index, s ->
            DropdownMenuItem(
                onClick = {
                    selectedIndex = index
                    showMenu = false
                }
            ) {
                Text(text = s)
            }
        }
    }
}