package com.pdmtaller2.DiegoIraheta_00041923.screens

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.pdmtaller2.DiegoIraheta_00041923.models.Dish
import com.pdmtaller2.DiegoIraheta_00041923.viewModel.restaurantViewModel
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.IconButton
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.pdmtaller2.DiegoIraheta_00041923.models.Restaurant
import com.pdmtaller2.DiegoIraheta_00041923.data.order
import com.pdmtaller2.DiegoIraheta_00041923.data.restaurants
import com.skydoves.landscapist.ImageOptions
import com.skydoves.landscapist.glide.GlideImage
import java.text.Normalizer
//Funcion para ignorar tildes

fun String.normalize(): String {
    return Normalizer.normalize(this, Normalizer.Form.NFD)
        .replace("\\p{Mn}+".toRegex(), "")
        .lowercase()
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen(viewModel: restaurantViewModel, navController: NavController) {
    val restaurant = viewModel.selectedRestaurant.value
    var dishes by remember { mutableStateOf(listOf<Dish>()) }
    var searchRestaurant by remember { mutableStateOf(listOf<Restaurant>()) }
    Column() {
        TopAppBar(
            title = {
                if (restaurant == null) {
                    Text("Busqueda")
                } else {
                    Text(restaurant.name)
                }
            },
            navigationIcon = {
                if (restaurant != null) {
                    IconButton(onClick = { navController.navigate("HomeScreen") }) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                }
            }
        )
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            if (restaurant != null) {
                Text(restaurant.description)
            }
            var searchText by remember { mutableStateOf("") }
            TextField(
                value = searchText,
                onValueChange = { searchText = it },
                label = { Text("Qué deseas comer?") },
                leadingIcon = { Icon(Icons.Default.Search, contentDescription = "Buscador") },
                modifier = Modifier.fillMaxWidth()
            )
            if (restaurant != null) {
                if (searchText.isEmpty()) {
                    dishes = restaurant.menu
                } else {
                    dishes = restaurant.menu.filter {
                        it.name.normalize().contains(searchText.normalize().trim(), ignoreCase = true)
                    }
                }
                LazyColumn {
                    items(dishes) { dish ->
                        dishesCard(dish)
                    }
                }

            } else {
                if (searchText.isEmpty()) {
                    Text("Busca tu platillo favorito")
                    searchRestaurant = emptyList()
                } else {
                    searchRestaurant = restaurants.filter {
                        it.menu.any { dish -> dish.name.normalize().contains(searchText.normalize().trim(), ignoreCase = true) }
                                || it.categories.any { category ->
                            category.normalize().contains(
                                searchText.normalize().trim(),
                                ignoreCase = true
                            )
                        }
                    }
                }
            }
            LazyColumn {
                items(searchRestaurant) { restaurant ->
                    restaurantCard(restaurant, navController, viewModel)
                }
            }

        }
    }
}





@Composable
fun dishesCard(dish : Dish){
    val context = LocalContext.current
    Box(modifier = Modifier.padding(8.dp).background(Color.White).border(shape = RoundedCornerShape(8.dp),color = Color.Black, width = 1.dp).fillMaxWidth()) {
        Row(
            modifier = Modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            GlideImage(
                imageModel = { dish.imageURL },
                modifier = Modifier
                    .height(100.dp)
                    .width(100.dp),
                imageOptions = ImageOptions(
                    contentScale = ContentScale.Crop,
                ),
                loading = {
                    CircularProgressIndicator()
                },
                failure = {
                    Text("Error")
                }
            )
            Spacer(modifier = Modifier.width(16.dp).padding(8.dp))
            Column {
                Text(dish.name, modifier = Modifier, color = Color.Black)
                Text(dish.description, modifier = Modifier, color = Color.Black)
                Button(
                    onClick = { order.add(dish)
                        Toast.makeText(context, "${dish.name} Añadido al carrito", Toast.LENGTH_SHORT).show()
                    }
                ) {
                    Text("Añadir al carrito")
                }
            }
        }
    }
}

@Composable
fun restaurantCard(restaurant: Restaurant, navController: NavController, viewmodel: restaurantViewModel){
    Box(modifier = Modifier.padding(8.dp).background(Color.White).border(shape = RoundedCornerShape(8.dp),color = Color.Black, width = 1.dp).fillMaxWidth()
        .clickable {
        viewmodel.selectRestaurant(restaurant)
        navController.navigate("SearchScreen")
    }) {
        Row(
            modifier = Modifier.padding(8.dp).background(Color.White),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            GlideImage(
                imageModel = { restaurant.imageURL },
                modifier = Modifier
                    .height(100.dp)
                    .width(100.dp),
                imageOptions = ImageOptions(
                    contentScale = ContentScale.Crop
                ),
                loading = {
                    CircularProgressIndicator()
                },
                failure = {
                    Text("Error")
                }
            )
            Spacer(modifier = Modifier.width(16.dp).padding(8.dp))
            Column {
                Text(restaurant.name, modifier = Modifier, color = Color.Black)
                Text(restaurant.description, modifier = Modifier, color = Color.Black)
            }
        }
    }
}

