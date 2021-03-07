package com.alkalynx.moviecatalogue.ui.home

import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import com.alkalynx.moviecatalogue.R
import com.alkalynx.moviecatalogue.utils.DataDummy
import org.junit.Before
import org.junit.Test

class HomeActivityTest{

    private val dummyMovies = DataDummy.generateDummyMovie()
    private val dummyTvShow = DataDummy.generateDummyTvShow()

    private fun categoriesString(categories: ArrayList<String>): String{
        var temp = ""
        categories.forEachIndexed { index, element ->
            temp += element
            if (index < categories.size - 1) temp += ", "
        }
        return temp
    }

    @Before
    fun setup(){
        ActivityScenario.launch(HomeActivity::class.java)
    }

    @Test
    fun loadMovies(){
        onView(withId(R.id.movieRecyclerView)).check(matches(isDisplayed()))
        onView(withId(R.id.movieRecyclerView)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyMovies.size))
    }

    @Test
    fun loadDetailMovie(){
        onView(withId(R.id.movieRecyclerView)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.movieTitleContent)).check(matches(isDisplayed()))
        onView(withId(R.id.movieReleaseContent)).check(matches(isDisplayed()))
        onView(withId(R.id.movieRatingContent)).check(matches(isDisplayed()))
        onView(withId(R.id.ratingProgress)).check(matches(isDisplayed()))
        onView(withId(R.id.movieCategoryContent)).check(matches(isDisplayed()))
        onView(withId(R.id.movieDescriptionContent)).check(matches(isDisplayed()))

        onView(withId(R.id.movieTitleContent)).check(matches(withText(dummyMovies[0].title)))
        onView(withId(R.id.movieReleaseContent)).check(matches(withText(dummyMovies[0].releaseDate)))
        onView(withId(R.id.movieRatingContent)).check(matches(withText("${dummyMovies[0].rating}%")))
        onView(withId(R.id.movieCategoryContent)).check(matches(withText(categoriesString(dummyMovies[0].category))))
        onView(withId(R.id.movieDescriptionContent)).check(matches(withText(dummyMovies[0].description)))

    }

    @Test
    fun loadTvShow(){
        onView(withText("TV SHOWS")).perform(click())
        onView(withId(R.id.tvShowRecyclerView)).check(matches(isDisplayed()))
        onView(withId(R.id.tvShowRecyclerView)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyTvShow.size))
    }


    @Test
    fun loadDetailTvShow(){
        onView(withText("TV SHOWS")).perform(click())
        onView(withId(R.id.tvShowRecyclerView)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.movieTitleContent)).check(matches(isDisplayed()))
        onView(withId(R.id.movieReleaseContent)).check(matches(isDisplayed()))
        onView(withId(R.id.movieRatingContent)).check(matches(isDisplayed()))
        onView(withId(R.id.ratingProgress)).check(matches(isDisplayed()))
        onView(withId(R.id.movieCategoryContent)).check(matches(isDisplayed()))
        onView(withId(R.id.movieDescriptionContent)).check(matches(isDisplayed()))

        onView(withId(R.id.movieTitleContent)).check(matches(withText(dummyTvShow[0].title)))
        onView(withId(R.id.movieReleaseContent)).check(matches(withText(dummyTvShow[0].releaseDate)))
        onView(withId(R.id.movieRatingContent)).check(matches(withText("${dummyTvShow[0].rating}%")))
        onView(withId(R.id.movieCategoryContent)).check(matches(withText(categoriesString(dummyTvShow[0].category))))
        onView(withId(R.id.movieDescriptionContent)).check(matches(withText(dummyTvShow[0].description)))

    }

}