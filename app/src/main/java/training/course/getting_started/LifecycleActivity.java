package training.course.getting_started;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class LifecycleActivity extends AppCompatActivity {
    public static final String TAG = LifecycleActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        Logs.d(TAG+" onCreate");

        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        setupViews();
    }

    private void setupViews() {
        findViewById(R.id.lifecycle_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LifecycleActivity.this,CustomActionBarActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Logs.d(TAG+" onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Logs.d(TAG+" onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Logs.d(TAG+" onResume");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Logs.d(TAG+" onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Logs.d(TAG+" onRestoreInstanceState");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Logs.d(TAG+" onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Logs.d(TAG+" onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Logs.d(TAG+" onDestory");
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        Logs.d(TAG+" onTrimMemory level:"+level);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        Logs.d(TAG + " onLowMemory");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Logs.d(TAG+" onActivityResult");
    }
}
