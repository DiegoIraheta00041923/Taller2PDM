package com.pdmtaller2.DiegoIraheta_00041923.viewModel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.ViewModel
import com.pdmtaller2.DiegoIraheta_00041923.models.Restaurant

class restaurantViewModel: ViewModel(){
    private val _selectRestaurant = mutableStateOf<Restaurant?>(null)
    val selectedRestaurant: State<Restaurant?> = _selectRestaurant

    fun selectRestaurant(restaurant: Restaurant){
        _selectRestaurant.value = restaurant
    }

    fun clearRestaurant(){
        _selectRestaurant.value = null
    }
}