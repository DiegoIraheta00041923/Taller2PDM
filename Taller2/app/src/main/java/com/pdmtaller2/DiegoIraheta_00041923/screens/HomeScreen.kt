package com.pdmtaller2.DiegoIraheta_00041923.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.pdmtaller2.DiegoIraheta_00041923.models.Restaurant
import com.pdmtaller2.DiegoIraheta_00041923.data.restaurants
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

import com.pdmtaller2.DiegoIraheta_00041923.data.categories
import com.pdmtaller2.DiegoIraheta_00041923.viewModel.restaurantViewModel
import com.skydoves.landscapist.ImageOptions
import com.skydoves.landscapist.glide.GlideImage


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(viewModel: restaurantViewModel, navController: NavController){
        Column(
        ) {
            TopAppBar(
                title = { Text("FoodSpot") }
            )
            LazyColumn(
                modifier = Modifier.fillMaxSize()
            ) {

                items(categories) { category ->
                    Text(
                        text = category, modifier = Modifier.padding(8.dp),
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold

                        )
                    )
                    Spacer(modifier = Modifier.padding(5.dp))
                    RestaurantOptions(category, restaurants,viewModel,navController)
                }

            }
        }
    }


@Composable
fun RestaurantOptions(category: String, restaurants: List<Restaurant>, viewModel: restaurantViewModel, navController: NavController){
    val categoriesRestaurant = restaurants.filter { it.categories.contains(category) }
    LazyRow (
        modifier = Modifier.background(Color.Transparent),
        horizontalArrangement = Arrangement.spacedBy(15.dp)
    ) {
       items(categoriesRestaurant){  restaurant ->
            Box(modifier = Modifier.padding(5.dp)
                .clickable {
                viewModel.selectRestaurant(restaurant)
                navController.navigate("SearchScreen")
            }){
                Column {
                    GlideImage(
                        imageModel = {restaurant.imageURL},
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp),
                        imageOptions = ImageOptions(
                            contentScale = ContentScale.Fit
                        ),
                        loading = {
                            CircularProgressIndicator()
                        },
                        failure = {
                            Text("Error")
                        }
                    )
                    Text(text = restaurant.name)
                }
            }
        }
    }
}
