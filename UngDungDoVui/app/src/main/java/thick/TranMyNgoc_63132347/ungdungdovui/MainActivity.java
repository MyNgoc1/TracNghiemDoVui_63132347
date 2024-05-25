package thick.TranMyNgoc_63132347.ungdungdovui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout btnJava, btnHtml, btnPython, btnSql;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();

        btnJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển sang JavaActivity
                Intent intent = new Intent(MainActivity.this, JavaActivity.class);
                startActivity(intent);
            }
        });

        btnHtml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển sang HtmlActivity
                Intent intent = new Intent(MainActivity.this, HtmlActivity.class);
                startActivity(intent);
            }
        });

        btnPython.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển sang PythonActivity
                Intent intent = new Intent(MainActivity.this, PythonActivity.class);
                startActivity(intent);
            }
        });

        btnSql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển sang AndroidActivity
                Intent intent = new Intent(MainActivity.this, SqlActivity.class);
                startActivity(intent);
            }
        });
    }

    public void TimDieuKhien(){
        btnJava = findViewById(R.id.btnJava);
        btnHtml = findViewById(R.id.btnHtml);
        btnPython = findViewById(R.id.btnPython);
        btnSql = findViewById(R.id.btnSql);
    }
}
