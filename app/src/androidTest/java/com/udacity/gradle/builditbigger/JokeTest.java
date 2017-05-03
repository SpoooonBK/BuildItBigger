package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.udacity.gradle.builditbigger.interfaces.OnTaskCompleted;

import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertNotNull;

/**
 * Created by spoooon on 5/2/17.
 */
@RunWith(AndroidJUnit4.class)
public class JokeTest implements OnTaskCompleted {

    @Test
    public void EndPointsAsyncTaskTest(){

        Context appContext = InstrumentationRegistry.getTargetContext();

        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        endpointsAsyncTask.execute(appContext);
    }


    @Override
    public void onTaskCompleted(String result) {

        assertNotNull(result);

    }
}
