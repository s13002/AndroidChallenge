package jp.ac.it_college.std.s13002.androidchallenge;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import jp.ac.it_college.std.s13002.androidchallenge.R;

public class ResultActivity extends Activity implements View.OnClickListener{

    private TextView scoreText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        int resultScore = getIntent().getIntExtra("score", 0);
        scoreText = (TextView) findViewById(R.id.result_score);
        scoreText.setText(String.valueOf(resultScore));
        findViewById(R.id.back_title_button).setOnClickListener(this);
        findViewById(R.id.finish_button).setOnClickListener(this);
    }




    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            new AlertDialog.Builder(this)
                    .setCancelable(false)
                    .setTitle("終了の確認")
                    .setPositiveButton("はい",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    finish();
                                }
                            })
                    .setNegativeButton("いいえ",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                }
                            })
                    .show();
            return true;
        }else {
            return false;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.result, menu);
        return true;
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back_title_button:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;

            case R.id.finish_button:
                moveTaskToBack(true);
                break;
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }




}
