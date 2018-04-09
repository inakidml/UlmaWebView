package com.example.aidazuaudiovisuales.ulmawebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide(); // para ocultar la action bar
        WebView web = (WebView)findViewById(R.id.web_view);
        web.getSettings().setJavaScriptEnabled(true);
        web.setWebViewClient(new WebClient()); //para que no abra otro browser
        web.loadUrl("file:///mnt/usb_storage/USB_DISK0/web prueba/index.html");
    }

    private class WebClient extends WebViewClient {   //para que no se abra otro browser

    }
}
