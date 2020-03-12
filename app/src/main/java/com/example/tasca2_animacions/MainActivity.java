package com.example.tasca2_animacions;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private  ObjectAnimator fadein;




    private Button buttonFadeIn;
    private Button buttonFadeOut;
    private Button buttonZoomIn;
    private Button buttonZoomOut;
    private Button buttonLeftRight;
    private Button buttonTopBottom;
    private Button buttonBounce;
    private Button buttonFlash;
    private Button buttonRotate;
    private Button buttonSeveral;
    private ImageView imagen;
    private TextView textoRunning;
    private SeekBar velocidad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //BOTONES
        buttonFadeIn = findViewById(R.id.FadeIn);
        buttonFadeOut = findViewById(R.id.FadeOut);
        buttonZoomIn = findViewById(R.id.ZoomIn);
        buttonZoomOut = findViewById(R.id.ZoomOut);
        buttonLeftRight = findViewById(R.id.LeftRight);
        buttonTopBottom = findViewById(R.id.TopBottom);
        buttonBounce = findViewById(R.id.Bounce);
        buttonFlash = findViewById(R.id.Flash);
        buttonRotate = findViewById(R.id.Rotate);
        buttonSeveral = findViewById(R.id.Several);

        //IMAGES, TEXTVIEW, BARRA VELOCIDAD
        imagen = findViewById(R.id.imageView);
        velocidad = findViewById(R.id.seekBar);
        textoRunning = findViewById(R.id.textView);

        fadein = ObjectAnimator.ofFloat(textoRunning, "alpha", 0f, 1f);



    }
}
