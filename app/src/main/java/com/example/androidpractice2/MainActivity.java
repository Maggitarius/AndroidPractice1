    package com.example.androidpractice2;
    
    import android.content.Intent;
    import android.os.Bundle;
    import android.view.View;
    import android.view.animation.Animation;
    import android.view.animation.AnimationUtils;
    import android.widget.Button;
    
    import androidx.activity.EdgeToEdge;
    import androidx.appcompat.app.AppCompatActivity;
    
    public class MainActivity extends AppCompatActivity {
    
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            EdgeToEdge.enable(this);
            setContentView(R.layout.activity_main);
    
            Button buttonToFrameAnimation = findViewById(R.id.buttonToFrameAnimation);
            Button buttonToTweenAnimation = findViewById(R.id.buttonToTweenAnimation);
    
            Animation slideInLeft = AnimationUtils.loadAnimation(this, R.anim.slide_in_left);
            buttonToFrameAnimation.startAnimation(slideInLeft);
    
            Animation slideInRight = AnimationUtils.loadAnimation(this, R.anim.slide_in_right);
            buttonToTweenAnimation.startAnimation(slideInRight);
    
            buttonToFrameAnimation.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent);
                }
            });
    
            buttonToTweenAnimation.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                    startActivity(intent);
                }
            });
        }
    }
