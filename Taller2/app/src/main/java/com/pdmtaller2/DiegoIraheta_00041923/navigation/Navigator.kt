package com.pdmtaller2.DiegoIraheta_00041923.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.pdmtaller2.DiegoIraheta_00041923.screens.HomeScreen
import com.pdmtaller2.DiegoIraheta_00041923.screens.MyOrdersScreen
import com.pdmtaller2.DiegoIraheta_00041923.screens.SearchScreen
import com.pdmtaller2.DiegoIraheta_00041923.viewModel.restaurantViewModel

data class NavItem(val route: String, val name: String, val icon: ImageVector)

@Composable
fun Navigator(){
    val navController = rememberNavController()
    val restaurantViewModel : restaurantViewModel = viewModel()

    val barOptions = listOf(
        NavItem("HomeScreen", "Restaurants", Icons.Default.Home ),
        NavItem("SearchScreen", "Search", Icons.Default.Search ),
        NavItem("MyOrdersScreen", "My Orders", Icons.Default.DateRange)
    )

    Scaffold(
        bottomBar = {
            NavigationBar {
                val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route
                barOptions.forEach {
                        option ->
                    NavigationBarItem(
                        selected = currentRoute == option.route,
                        onClick = {
                            restaurantViewModel.clearRestaurant()
                            if (option.route == "HomeScreen") {
                                navController.navigate("HomeScreen") {
                                    popUpTo(0) { inclusive = true }
                                }
                            }
                            else if (currentRoute !== option.route) {
                                navController.navigate(option.route){
                                    popUpTo(navController.graph.startDestinationId){saveState = true}
                                    launchSingleTop = true
                                    restoreState = true
                                }
                            }
                        },
                        icon = { Icon(imageVector = option.icon, contentDescription = option.name)},
                        label = { Text(option.name)}

                    )
                }
            }
        }
    ) {
        innerPadding ->
        NavHost(navController = navController, startDestination = "HomeScreen", modifier = Modifier.padding(innerPadding)){
            composable("HomeScreen"){
                HomeScreen(restaurantViewModel,navController)
            }
            composable("SearchScreen"){
                SearchScreen(restaurantViewModel,navController)
            }
            composable("MyOrdersScreen"){
                MyOrdersScreen()
            }
        }
    }


}