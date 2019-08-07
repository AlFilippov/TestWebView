package com.alexandr.testwebview.webview;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Client extends WebViewClient {

    @SuppressWarnings("deprecation") @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }

    @TargetApi(Build.VERSION_CODES.N) @Override
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        view.loadUrl(request.getUrl().toString());
        return true;
    }
    //Show loader on url load
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        // Then show progress  Dialog
        // in standard case YourActivity.this

    }

    // Called when all page resources loaded
    public void onPageFinished(WebView view, String url) {
        try {
            // Close progressDialog


        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}