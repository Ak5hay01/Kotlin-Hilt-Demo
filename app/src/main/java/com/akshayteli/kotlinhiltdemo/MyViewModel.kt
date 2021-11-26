package com.akshayteli.kotlinhiltdemo

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

/**
 * Created by Akshay Teli on 25,November,2021
 */
@HiltViewModel
class MyViewModel @Inject constructor(
    @Named("String2") testString2: String
) : ViewModel() {


     var string = testString2

    // --------------------------------------------- to check result in the logcat
//    init {
//        Log.d("ViewModel", "Test String from ViewModel: $testString2")
//    }

//    ------------------------------------------------------------------------------

//    to display result on the screen
    fun displayString():String{

        return  "Test String from ViewModel: $string"
    }


}