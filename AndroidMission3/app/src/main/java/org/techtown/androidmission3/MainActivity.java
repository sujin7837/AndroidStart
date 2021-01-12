package org.techtown.androidmission3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView01;
    ImageView imageView02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView01=findViewById(R.id.imageView1);
        imageView02=findViewById(R.id.imageView2);

        Button button1=findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveImageDown();
            }
        });

        Button button2=findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveImageUp();
            }
        });
    }

    private void moveImageDown() {
        //setImageResource(0): 이미지를 비워줌
        imageView01.setImageResource(R.drawable.beach);
        imageView02.setImageResource(R.drawable.dream02);

        //invalidate()를 호출하면 화면을 갱신함
        imageView01.invalidate();
        imageView02.invalidate();
    }

    private void moveImageUp() {
        imageView01.setImageResource(R.drawable.dream02);
        imageView02.setImageResource(R.drawable.beach);

        imageView01.invalidate();
        imageView02.invalidate();
    }

}