package com.ajit.singh.mylibrary;

import android.content.Intent;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class MyClassTest {

  @Rule
  public ActivityTestRule<MyClass> rule = new ActivityTestRule<MyClass>(MyClass.class, true, false);

  @Test
  public void shouldName() throws Exception {
    rule.launchActivity(new Intent());
    onView(withId(R.id.textView)).check(matches(isDisplayed()));
  }
}
