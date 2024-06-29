package com.example.sneakersync.Navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHost
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.sneakersync.screens.ProductDetailScreen
import com.example.sneakersync.screens.ProductScreen
import java.security.AccessController

@Composable
fun AppNavHost(
    modifier: Modifier=Modifier,
    startDestination: String= NavigationItems.PRODUCTS

) {
   val navController = rememberNavController()
    NavHost(navController = navController, startDestination = startDestination){
       composable(NavigationItems.PRODUCTS){
           ProductScreen(navController)
       }
        composable(
            "{$NavigationItems.PRODUCT_DETAILS}/{id}",
            arguments = listOf(navArgument("id"){ type= NavType.StringType})
        ){
            val id = it.arguments?.getString("id")
           if(id!=null)
            ProductDetailScreen(id, navController)
        }
    }

}