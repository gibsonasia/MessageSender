package com.example.msgsender

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import org.junit.Assert.*
import org.junit.Test

class DisplayMsgActivityTest {

    @Test
    fun text_view_test() {

        onView(withId(R.id.textView)).check(matches(isDisplayed()))
        //isDisplayed()
        // result.check(ViewAssertion())
    }
}