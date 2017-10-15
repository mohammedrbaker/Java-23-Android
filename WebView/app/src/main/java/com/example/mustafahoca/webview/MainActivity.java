package com.example.mustafahoca.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webViewVektorel = (WebView) findViewById(R.id.webViewVektorel);
        webViewVektorel.loadUrl("http://www.vektorelbilisim.com/");
        webViewVektorel.setWebViewClient(new WebViewClient());
        webViewVektorel.getSettings().setJavaScriptEnabled(true);

    }
}
