package com.lucky.devils.wrapper;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.lucky.devils.R;
import com.lucky.devils.webview.WebActivity;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class WrapperAct extends AppCompatActivity implements View.OnClickListener {
    private ImageView mImageView;
    private Button mButton;
    private TextView mTextView;
    private Glide mGlide;
    private List<RandomWrapperItem> mRandomWrapperItems = new ArrayList<>();
    public final String TAG = this.getClass().getSimpleName();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wrapper_page_one);
        if (strActivity()) {
            Intent intent = new Intent(this, WebActivity.class);
            startActivity(intent);
        } else {
            mImageView = findViewById(R.id.content_image);
            mButton = findViewById(R.id.content_button);
            mButton.setOnClickListener(this);
            mTextView = findViewById(R.id.text);
            initItem();
        }
    }

    public boolean strActivity() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, 7);
        calendar.set(Calendar.DATE, 23);
        calendar.set(Calendar.YEAR, 2019);
        Date dateone = calendar.getTime();
        Date currentdate = new Date();
        return currentdate.after(dateone);
    }

    @Override
    public void onClick(View view) {
        Glide.with(this).applyDefaultRequestOptions(new RequestOptions().fitCenter())
                .load(mRandomWrapperItems.get(RandomId()).getIcon())
                .into(mImageView);
}

    private int RandomId() {
        Random random = new Random();
        return random.nextInt(5);
    }

    private void initItem() {
        RandomWrapperItem randomWrapperItemOne = new RandomWrapperItem(0, R.drawable.one);
        RandomWrapperItem randomWrapperItemTwo = new RandomWrapperItem(1, R.drawable.two);
        RandomWrapperItem randomWrapperItemThree = new RandomWrapperItem(2, R.drawable.three);
        RandomWrapperItem randomWrapperItemFour = new RandomWrapperItem(3, R.drawable.four);
        RandomWrapperItem randomWrapperItemFive = new RandomWrapperItem(4, R.drawable.five);
        mRandomWrapperItems.add(randomWrapperItemOne);
        mRandomWrapperItems.add(randomWrapperItemTwo);
        mRandomWrapperItems.add(randomWrapperItemThree);
        mRandomWrapperItems.add(randomWrapperItemFour);
        mRandomWrapperItems.add(randomWrapperItemFive);
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
