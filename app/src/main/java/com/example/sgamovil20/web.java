package com.example.sgamovil20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class web extends AppCompatActivity {

    WebView wv1;

    private static String DIRECCION_HOST = "";
    private static String UBICACION = "/sga";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        DIRECCION_HOST = MainActivity.get_DireccionHost();

        wv1 = (WebView)findViewById(R.id.wv1);
        wv1.setWebViewClient(new WebViewClient());
        wv1.getSettings().setJavaScriptEnabled(true);
        wv1.getSettings().setDomStorageEnabled(true);

        String sitio="http://" + DIRECCION_HOST + UBICACION;
        wv1.loadUrl(sitio);

    }
}
