package com.alexandr.testwebview;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Client extends WebViewClient {

    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        // If url contains mailto link then open Mail Intent
        if (url.contains("mailto:")) {
            // Could be cleverer and use a regex
            //Open links in new browser
            view.getContext().startActivity(
                    new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
            // Here we can open new activity
            return true;
        }else {
            // Stay within this webview and load url
            view.loadUrl(url);
            return true;
        }
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