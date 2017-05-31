package com.example.aulasamigas.proyectofinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Vistas extends AppCompatActivity {

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista);

        String  link = getIntent().getStringExtra("link");

        webView = (WebView)findViewById(R.id.vista);
        webView.loadUrl(link);
    }
}
