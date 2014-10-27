package me.pereda;

import android.content.Intent;
import android.test.suitebuilder.annotation.SmallTest;
import android.view.View;

/**
 * Created by Alvaro on 27/10/2014.
 */
public class MyActivityTest extends
        android.test.ActivityUnitTestCase<MyActivity> {
    private MyActivity activity;

    public MyActivityTest() {
        super(MyActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        Intent intent = new Intent(getInstrumentation().getTargetContext(),
                MyActivity.class);
        startActivity(intent, null, null);
        activity = getActivity();
    }

    @SmallTest
    public void testLayout() {
        int visibility = activity.findViewById(R.id.my_hello_text_view).getVisibility();
        assertEquals(visibility, View.VISIBLE);
        fail("Torrija");
    }
}
