package com.example.examen_cinthiaiza

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.example.examen_cinthiaiza.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var appBarConfiguration: AppBarConfiguration


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        drawerLayout=binding.drawerLayout
        val navController=this.findNavController(R.id.navigationFragment)
        NavigationUI.setupActionBarWithNavController(this,navController,drawerLayout)


        appBarConfiguration=AppBarConfiguration(navController.graph,drawerLayout)
        NavigationUI.setupWithNavController(binding.navView,navController)
    }
    override fun onSupportNavigateUp(): Boolean {
        var navController =this.findNavController(R.id.navigationFragment)
        return NavigationUI.navigateUp(navController,appBarConfiguration)
    }
}