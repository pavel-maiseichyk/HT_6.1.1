package com.example.ht_611;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private static final String LIFECYCLE_TAG = "LIFECYCLE_TAG";
private TextView textView;
    private static final String BUNDLE = "BUNDLE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.theOnlyTextView);
        Button button = findViewById(R.id.changeActivityButton);

        String methodName = "onCreate()";
        Log.d(LIFECYCLE_TAG, methodName);
        textView.append("\n" + methodName);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MainActivity.class));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        String methodName = "onStart()";
        Log.d(LIFECYCLE_TAG, methodName);
        textView.append("\n" + methodName);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        String methodName = "onPostResume()";
        Log.d(LIFECYCLE_TAG, methodName);
        textView.append("\n" + methodName);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        String methodName = "onPostCreate()";
        Log.d(LIFECYCLE_TAG, methodName);
        textView.append("\n" + methodName);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        String methodName = "onRestart()";
        Log.d(LIFECYCLE_TAG, methodName);
        textView.append("\n" + methodName);
    }

    @Override
    protected void onStop() {
        super.onStop();
        String methodName = "onStop()";
        Log.d(LIFECYCLE_TAG, methodName);
        textView.append("\n" + methodName);
    }

    @Override
    protected void onPause() {
        super.onPause();
        String methodName = "onPause()";
        Log.d(LIFECYCLE_TAG, methodName);
        textView.append("\n" + methodName);
    }

    @Override
    protected void onResume() {
        super.onResume();
        String methodName = "onResume()";
        Log.d(LIFECYCLE_TAG, methodName);
        textView.append("\n" + methodName);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        String methodName = "onResume()";
        Log.d(LIFECYCLE_TAG, methodName);
        textView.append("\n" + methodName);
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        String methodName = "onKeyLongPress()";
        Log.d(LIFECYCLE_TAG, methodName);
        textView.append("\n" + methodName);
        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        String methodName = "onKeyDown()";
        Log.d(LIFECYCLE_TAG, methodName);
        textView.append("\n" + methodName);
        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        textView.setText(savedInstanceState.getString(BUNDLE));
        String methodName = "onRestoreInstanceState()";
        Log.d(LIFECYCLE_TAG, methodName);
        textView.append("\n" + methodName);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putString(BUNDLE, textView.getText().toString());
        String methodName = "onSaveInstanceState()";
        Log.d(LIFECYCLE_TAG, methodName);
        textView.append("\n" + methodName);
        super.onSaveInstanceState(outState);
    }
}