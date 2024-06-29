package com.example.sneakersync.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.sneakersync.Navigation.NavigationItems
import com.example.sneakersync.R
import com.example.sneakersync.model.Product
import com.example.sneakersync.screens.components.ProductItem


@Composable
fun ProductScreen(
    navController: NavController
) {
    val products :List<Product> = remember {
        getProductList()
    }

    LazyVerticalGrid(columns = GridCells.Fixed(2), modifier = Modifier.padding(8.dp)) {
        items(products){
            ProductItem(product =it){
               navController.navigate("{$NavigationItems.PRODUCT_DETAILS}/${it.id}")
            }
        }

    }

}

fun getProductList() : List<Product>{
    return  listOf(
        Product(
            id = "1",
            color = Color.Gray,
            price = 1200f,
            name = "Sneaker light",
            dicountPrice = 1000f,
            rating = 4.5f,
            imageRes = R.drawable.image,
            size = 8

        ),
        Product(
            id = "2",
            color = Color.Gray,
            price = 1300f,
            name = "Casual sneaker",
            dicountPrice = 1100f,
            rating = 4.7f,
            imageRes = R.drawable.shoes2,
            size = 10
    ),
        Product(
            id = "3",
            color = Color.Yellow,
            price = 1370f,
            name = "Light Weight shoes",
            dicountPrice = 1100f,
            rating = 4.5f,
            imageRes = R.drawable.image3,
            size = 9
    ),
        Product(
            id = "4",
            color = Color.Yellow,
            price = 1340f,
            name = "Comfortable",
            dicountPrice = 1200f,
            rating = 4.4f,
            imageRes = R.drawable.sneaker4,
            size = 8
    ),
        Product(
            id = "5",
            color = Color.Yellow,
            price = 1200f,
            name = "charming shoes",
            dicountPrice = 1000f,
            rating = 4.6f,
            imageRes = R.drawable.sneaker5,
            size = 10
    ),
        Product(
            id = "6",
            color = Color.Yellow,
            price = 1500f,
            name = "Classic look",
            dicountPrice = 1360f,
            rating = 4.7f,
            imageRes = R.drawable.sneaker6,
            size = 11
    ),
        Product(
            id = "7",
            color = Color.Gray,
            price = 1480f,
            name = "Casual fit",
            dicountPrice = 1200f,
            rating = 4.7f,
            imageRes = R.drawable.image7,
            size = 12
    ),
        Product(
            id = "8",
            color = Color.Gray,
            price = 1400f,
            name = "Sneaker look!",
            dicountPrice = 1300f,
            rating = 4.7f,
            imageRes = R.drawable.image10,
            size = 9
        ),
        Product(
            id = "9",
            color = Color.Yellow,
            price = 1200f,
            name = "Sneaker Blue",
            dicountPrice = 1000f,
            rating = 4.5f,
            imageRes = R.drawable.sneaker9,
            size = 10
        ),
        Product(
            id = "10",
            color = Color.Yellow,
            price = 1300f,
            name = "Sneaker light",
            dicountPrice = 1140f,
            rating = 4.5f,
            imageRes = R.drawable.shoes1,
            size = 8
    )
    )
}