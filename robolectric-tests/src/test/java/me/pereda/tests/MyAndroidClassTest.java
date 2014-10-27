package me.pereda.tests;
import android.view.View;

import me.pereda.R;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.util.ActivityController;

import me.pereda.MyActivity;
import me.pereda.RobolectricGradleTestRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(RobolectricGradleTestRunner.class)
public class MyAndroidClassTest {
    @Test
    public void testWhenActivityCreatedHelloTextViewIsVisible() throws Exception {
        MyActivity activity = new MyActivity();
        ActivityController.of(activity).attach().create();
        int visibility = activity.findViewById(R.id.my_hello_text_view).getVisibility();
        assertEquals(visibility, View.VISIBLE);
    }
}