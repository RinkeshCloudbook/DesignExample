package com.one.designexample.Activity;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.one.designexample.R;

public class AppBar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_bar);

        initToolbar();
    }

    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_menu);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Profile");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //Tools.setSystemBarColor(this);
        setSystemBarColor(this);
    }

    private void initComponent() {
        displayImageOriginal(this, (ImageView) findViewById(R.id.image_1), R.drawable.photo_male_2);
        displayImageOriginal(this, (ImageView) findViewById(R.id.image_2), R.drawable.photo_male_2);
        displayImageOriginal(this, (ImageView) findViewById(R.id.image_3), R.drawable.photo_male_2);
        displayImageOriginal(this, (ImageView) findViewById(R.id.image_4), R.drawable.photo_male_2);
        displayImageOriginal(this, (ImageView) findViewById(R.id.image_5), R.drawable.photo_male_2);
        displayImageOriginal(this, (ImageView) findViewById(R.id.image_6), R.drawable.photo_male_2);
    }

    private void displayImageOriginal(Context ctx, ImageView img, @DrawableRes int drawable) {
        try {
            Glide.with(ctx).load(drawable)
                    .crossFade()
                    .diskCacheStrategy(DiskCacheStrategy.NONE)
                    .into(img);
        } catch (Exception e) {
        }
    }

    public static void setSystemBarColor(Activity act) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = act.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(act.getResources().getColor(R.color.design_default_color_primary));
        }
    }
}