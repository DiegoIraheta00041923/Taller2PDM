package com.pdmtaller2.DiegoIraheta_00041923.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.pdmtaller2.DiegoIraheta_00041923.models.Dish
import com.pdmtaller2.DiegoIraheta_00041923.data.order
import com.skydoves.landscapist.ImageOptions
import com.skydoves.landscapist.glide.GlideImage

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyOrdersScreen(){
    Column {
        TopAppBar(title = { Text("My Orders") })
        LazyColumn {
            items(order){
                order ->
                orderCard(order)
            }
        }
    }
}

@Composable
fun orderCard(dish : Dish){
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
                    contentScale = ContentScale.Fit,
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
            }
        }
    }
}