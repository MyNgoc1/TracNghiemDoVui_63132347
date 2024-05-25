package thick.TranMyNgoc_63132347.ungdungdovui;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Random;

public class SqlActivity extends AppCompatActivity {

    private Spinner spinnerQuestion;
    private Button btnAnswer1, btnAnswer2, btnAnswer3, btnAnswer4;

    private String[] questions = {"SQL là viết tắt của cụm từ nào sau đây?", "Từ khóa nào được sử dụng để chọn dữ liệu từ một bảng?", "Để xóa dữ liệu từ một bảng, chúng ta sử dụng từ khóa nào?",};
    private String[][] answers = {
            {"Structured Question Language", " Standardized Query Language", " Structured Query Language", "Systematic Query Language"},
            {"SELECT", "FROM", " WHERE", " FILTER"},
            {"DELETE FROM", "DROP", "REMOVE", "TRUNCATE"}

    };
    private int[] correctAnswerIndexes = {1, 1, 2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);

        // Find the views by their IDs
        spinnerQuestion = findViewById(R.id.btnQuestion);
        btnAnswer1 = findViewById(R.id.btnAnswer1);
        btnAnswer2 = findViewById(R.id.btnAnswer2);
        btnAnswer3 = findViewById(R.id.btnAnswer3);
        btnAnswer4 = findViewById(R.id.btnAnswer4);

        // Set up the Spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, questions);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerQuestion.setAdapter(adapter);

        // Set up the Spinner click listener
        spinnerQuestion.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                updateAnswerButtons(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Do nothing
            }
        });

        // Set click listeners for the buttons
        btnAnswer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(0);
            }
        });

        btnAnswer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(1);
            }
        });

        btnAnswer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(2);
            }
        });

        btnAnswer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(3);
            }
        });
    }

    private void updateAnswerButtons(int questionIndex) {
        // Randomize the order of the answers
        int[] answerOrder = {0, 1, 2, 3};
        //    shuffleArray(answerOrder);

        btnAnswer1.setText(answers[questionIndex][answerOrder[0]]);
        btnAnswer2.setText(answers[questionIndex][answerOrder[1]]);
        btnAnswer3.setText(answers[questionIndex][answerOrder[2]]);
        btnAnswer4.setText(answers[questionIndex][answerOrder[3]]);
    }

    private void checkAnswer(int answerIndex) {
        int currentQuestionIndex = spinnerQuestion.getSelectedItemPosition();
        if (answerIndex == correctAnswerIndexes[currentQuestionIndex]) {
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
            highlightCorrectAnswer(answerIndex);
        } else {
            Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show();
            highlightWrongAnswer(answerIndex);
        }
    }

    private void highlightCorrectAnswer(int correctIndex) {
        switch (correctIndex) {
            case 0:
                btnAnswer1.setBackgroundColor(Color.GREEN);
                break;
            case 1:
                btnAnswer2.setBackgroundColor(Color.GREEN);
                break;
            case 2:
                btnAnswer3.setBackgroundColor(Color.GREEN);
                break;
            case 3:
                btnAnswer4.setBackgroundColor(Color.GREEN);
                break;
        }
    }

    private void highlightWrongAnswer(int wrongIndex) {
        switch (wrongIndex) {
            case 0:
                btnAnswer1.setBackgroundColor(Color.RED);
                break;
            case 1:
                btnAnswer2.setBackgroundColor(Color.RED);
                break;
            case 2:
                btnAnswer3.setBackgroundColor(Color.RED);
                break;
            case 3:
                btnAnswer4.setBackgroundColor(Color.RED);
                break;
        }
    }

    private void shuffleArray(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}