package thick.tranmyngoc_63132347.dovui;

import static thick.tranmyngoc_63132347.dovui.R.id.*;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private String SelectedTopicName="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout java = findViewById(R.id.java);
        final LinearLayout html = findViewById(R.id.html);
        final LinearLayout python = findViewById(R.id.python);
        final LinearLayout android = findViewById(R.id.android);


        final Button batdau= findViewById(R.id.batdau);

        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SelectedTopicName="java";
                java.setBackgroundResource(R.drawable.bacground3);
                html.setBackgroundResource(R.drawable.background);
                python.setBackgroundResource(R.drawable.background);
                android.setBackgroundResource(R.drawable.background);
            }
        });

        html.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SelectedTopicName="html";
                html.setBackgroundResource(R.drawable.bacground3);
                java.setBackgroundResource(R.drawable.background);
                python.setBackgroundResource(R.drawable.background);
                android.setBackgroundResource(R.drawable.background);
            }
        });

        python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SelectedTopicName="python";
                python.setBackgroundResource(R.drawable.bacground3);
                html.setBackgroundResource(R.drawable.background);
                java.setBackgroundResource(R.drawable.background);
                android.setBackgroundResource(R.drawable.background);
            }
        });

        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SelectedTopicName="android";
                android.setBackgroundResource(R.drawable.bacground3);
                html.setBackgroundResource(R.drawable.background);
                python.setBackgroundResource(R.drawable.background);
                java.setBackgroundResource(R.drawable.background);
            }
        });

        batdau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(SelectedTopicName.isEmpty()){
                    Toast.makeText(MainActivity.this,"Vui lòng chọn chủ đề", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("chontopic",SelectedTopicName);
                    startActivity(intent);
                }
            }
        });
    }
}