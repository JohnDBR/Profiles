package com.example.profiles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.main_activity_fragment, PlacesFragment()).commit()
    }

    fun replaceFragment(fragment: Fragment) {
        Log.d("JOHN", "on Father's activity!")
        supportFragmentManager.beginTransaction().addToBackStack("fragment").replace(R.id.main_activity_fragment, fragment).commit()
    }
}
