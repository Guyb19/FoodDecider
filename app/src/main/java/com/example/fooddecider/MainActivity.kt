package com.example.fooddecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val Foodtypes = arrayListOf("Pizza","Agadir","El Capone", "Rootz" ,"Falafel", "Shawarma")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener{
            val rand = Random()
            val randfood = rand.nextInt(Foodtypes.count())
            SelectedFoodTxt.text = Foodtypes[randfood]
        }

        AddFoodBtn.setOnClickListener {
            val newfood = AddFoodTxt.text.toString()
            Foodtypes.add(newfood)
            AddFoodTxt.text.clear()
        }
    }

}
