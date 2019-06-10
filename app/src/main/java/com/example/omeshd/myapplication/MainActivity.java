package com.example.omeshd.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView1 = (WebView) findViewById(R.id.webView1);

        webView1.setWebContentsDebuggingEnabled(false);

        webView1.getSettings().setJavaScriptEnabled(true);
        webView1.loadUrl("http://www.facebook.com");

    }
}
