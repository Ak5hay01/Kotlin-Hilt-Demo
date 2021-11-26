package com.akshayteli.kotlinhiltdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    @Named("String1")
    lateinit var testString: String

    private val viewModel: MyViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//      ---------------------------------------  To display viewModel data in the logcat
//        Log.d("MainActivity", "Test String from MainActivity: $testString")
//        viewModel
//      ---------------------------------------------------------------------------------

//        Bind details to the textView
        val textView = findViewById<TextView>(R.id.text_view)
        textView.text = viewModel.displayString()

    }
}