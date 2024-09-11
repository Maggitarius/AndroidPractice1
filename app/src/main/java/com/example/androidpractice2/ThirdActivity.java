package com.example.androidpractice2;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        ImageView imageView = findViewById(R.id.imageViewTweenAnimation);

        Animation tweenAnimation = AnimationUtils.loadAnimation(this, R.anim.tween_animation);
        imageView.startAnimation(tweenAnimation);
    }
}
