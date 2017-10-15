package com.example.mustafahoca.instagram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = (WebView) findViewById(R.id.webViewIns);
        webView.loadUrl("https://www.instagram.com");
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
    }

    public void araBenimIcin(View view) {
        EditText editText = (EditText) findViewById(R.id.editTextAra);
        String araMetini = editText.getText().toString();
        webView.loadUrl("https://www.instagram.com/"+araMetini+"/");
    }
}
