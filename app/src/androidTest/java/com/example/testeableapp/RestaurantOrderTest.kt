package com.example.testeableapp

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import org.junit.Rule
import org.junit.Test

class RestaurantOrderTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

   /* @Test
    fun appTitleVisible() {

        composeTestRule.waitForIdle()

        composeTestRule
            .onNodeWithTag("appTitle")
            .assertIsDisplayed()
    }

   @Test
    fun appSubtitleVisible() {

        composeTestRule.waitForIdle()

        composeTestRule
            .onNodeWithTag("appSubtitle")
            .assertIsDisplayed()
    }

    @Test
    fun menuSectionTitleVisible() {

        composeTestRule.waitForIdle()

        composeTestRule
            .onNodeWithTag("menuSectionTitle")
            .assertIsDisplayed()
    }

   @Test
    fun orderSectionTitleVisible() {

        composeTestRule.waitForIdle()

        composeTestRule
            .onNodeWithTag("orderSectionTitle")
            .assertIsDisplayed()
    }*/

    @Test
    fun firstMenuItemVisible() {

        composeTestRule.waitForIdle()

        composeTestRule
            .onNodeWithTag("menuItemName_1")
            .assertIsDisplayed()
    }
}