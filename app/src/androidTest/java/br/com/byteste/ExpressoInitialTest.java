package br.com.byteste;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import espresso.EspressoActivity;
import espresso.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by feliciano on 24/02/16.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class ExpressoInitialTest {

    public static final String STRING_TO_BE_TYPED = "Espresso";

    @Rule
    public ActivityTestRule<EspressoActivity> mActivityTestRule = new ActivityTestRule<EspressoActivity>
            (EspressoActivity.class);

    @Test
    public void changeText_sameToast() throws Exception{

        onView(withId(R.id.edit)).perform(typeText(STRING_TO_BE_TYPED),closeSoftKeyboard());
        onView(withId(R.id.btn)).perform(click());
        //onView(withText(STRING_TO_BE_TYPED)).check(matches(isDisplayed()));
    }
}
