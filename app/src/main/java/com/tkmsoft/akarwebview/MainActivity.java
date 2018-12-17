package com.tkmsoft.akarwebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "loading,,,", Toast.LENGTH_SHORT).show();
        WebView webView = findViewById(R.id.webView);
        webView.loadUrl("http://3qaronline.net/admin/auth");
    }
}