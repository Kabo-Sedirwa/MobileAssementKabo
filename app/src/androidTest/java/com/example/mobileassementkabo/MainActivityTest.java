package com.example.mobileassementkabo;



import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest  {

   public ActivityScenario<MainActivity>  scenario;

 @Before
   public  void  setUp(){

    scenario = ActivityScenario.launch(MainActivity.class);
    scenario.moveToState(Lifecycle.State.STARTED);
 }

 @Test
   public  void viewDetailsOnTap(){

/*
     onView(withId(R.id.recyclerView)).perform((androidx.test.espresso.ViewAction) RecyclerViewActions.actionOnItemAtPosition(1, ViewActions.click()));
*/




 }


}
