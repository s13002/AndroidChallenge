package jp.ac.it_college.std.s13003.androidchallenge;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by s13003 on 14/08/07.
 */
public class GameActivity extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);
        android.util.Log.v("gameActivity", "onCreate");
    }



    public void Block() {

    }
}
