package com.example.my_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Log_In extends AppCompatActivity {
    ImageView love , star , share;
    boolean React_Love , React_Star;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log__in);
        Toast.makeText(this, "OnCreat", Toast.LENGTH_SHORT).show();

        love = findViewById(R.id.favorite);
        love.setImageResource(isLove() ?R.drawable.ic_baseline_favorite:R.drawable.un_favorite);
        love.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (React_Love == false){
                    setLove(!isLove());
                    love.setImageResource(isLove() ?R.drawable.ic_baseline_favorite:R.drawable.un_favorite);

                }else
                    setLove(!isLove());
                love.setImageResource(isLove() ?R.drawable.un_favorite:R.drawable.ic_baseline_favorite);

            }

        });

        star = findViewById(R.id.star);
        star.setImageResource(isStar() ?R.drawable.ic_baseline_star:R.drawable.un_star);
        star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (React_Star==false){
                    setStar(!isStar());
                    star.setImageResource(isStar() ?R.drawable.ic_baseline_star:R.drawable.un_star);
                    Toast.makeText(Log_In.this, "Un Saved", Toast.LENGTH_SHORT).show();
                }else
                    setStar(!isStar());
                star.setImageResource(isStar() ?R.drawable.un_star:R.drawable.ic_baseline_star);
                Toast.makeText(Log_In.this, "Saved", Toast.LENGTH_SHORT).show();

            }
        });

    }

    private void setStar(boolean star) {
        React_Star = star;
    }

    private boolean isStar() {
        return React_Star;
    }

    private boolean isLove() {
        return React_Love;
    }

    private void setLove(boolean love) {
        React_Love = love;
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "OnPaus", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "OnRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show();
    }
}
