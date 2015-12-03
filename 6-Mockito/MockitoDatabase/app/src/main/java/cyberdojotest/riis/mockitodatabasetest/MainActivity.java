package cyberdojotest.riis.mockitodatabasetest;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SQLHelper db = new SQLHelper(this);
        User joeSmith = new User("Joe", "Smith");
        db.addUser(joeSmith);
    }
}
