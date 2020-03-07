package com.example.msgsender

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import org.junit.Assert.*
import org.junit.Test

class MainActivityTest{

    @Test
    fun button_click_test(){
        onView(withId(R.id.send_bttn)).perform(click())
    }

}