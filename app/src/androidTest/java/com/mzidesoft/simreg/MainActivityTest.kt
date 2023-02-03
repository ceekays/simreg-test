package com.mzidesoft.simreg


import androidx.test.core.app.launchActivity
import org.junit.Assert.*
import org.junit.runner.RunWith
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Test
    fun testThatToolbarHasTheRightTitle() {
        val scenario = launchActivity<MainActivity>()

        onView(withId(R.id.toolbar))
            .check(matches(hasDescendant(withText("Sim Registration"))))

        scenario.close()
    }
}