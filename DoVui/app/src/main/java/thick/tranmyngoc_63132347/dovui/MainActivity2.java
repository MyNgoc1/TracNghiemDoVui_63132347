package thick.tranmyngoc_63132347.dovui;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity2 extends AppCompatActivity {

    private TextView questions;
    private TextView question;

    private AppCompatButton cau1, cau2, cau3, cau4;
    private AppCompatButton nextBtn;

    private Timer quizTimer;
    private int totalTimeInMins =1;
    private int seconds= 0;


    private List<QuestionList> questionList;

    private int currentQuestionPosition = 0;

    private String selectedOptionByUser = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final ImageView backBtn = findViewById(R.id.backBtn);
        final TextView timer= findViewById(R.id.timer);
        final TextView selectedTopicName = findViewById(R.id.topicName);

        questions =findViewById(R.id.questions);
        question = findViewById(R.id.question);

        cau1= findViewById(R.id.cau1);
        cau2= findViewById(R.id.cau2);
        cau3= findViewById(R.id.cau3);
        cau4= findViewById(R.id.cau4);

        nextBtn =findViewById(R.id.nextBtn);
        final String getSelectedTopicName = getIntent().getStringExtra("Chontopic");
        selectedTopicName.setText(getSelectedTopicName);

        questionList= QuestionBank.getQuestions(getSelectedTopicName);

        startTimer(timer);

        questions.setText((currentQuestionPosition)+"/"+questionList.size());
        question.setText(questionList.get(0).getQuestion());
        cau1.setText(questionList.get(0).getCau1());
        cau2.setText(questionList.get(0).getCau2());
        cau3.setText(questionList.get(0).getCau3());
        cau4.setText(questionList.get(0).getCau4());


        cau1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = cau1.getText().toString();
                    cau1.setBackgroundResource(R.drawable.background5);
                    cau1.setTextColor(Color.WHITE);

                    revealAnwers();
                    questionList.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);

                }
            }
        });

        cau2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = cau2.getText().toString();
                    cau2.setBackgroundResource(R.drawable.background5);
                    cau2.setTextColor(Color.WHITE);

                    revealAnwers();
                    questionList.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);

                }
            }
        });

        cau3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = cau3.getText().toString();
                    cau3.setBackgroundResource(R.drawable.background5);
                    cau3.setTextColor(Color.WHITE);

                    revealAnwers();
                    questionList.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);

                }
            }
        });

        cau4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = cau4.getText().toString();
                    cau4.setBackgroundResource(R.drawable.background5);
                    cau4.setTextColor(Color.WHITE);

                    revealAnwers();
                    questionList.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);

                }
            }
        });

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedOptionByUser.isEmpty()){
                    Toast.makeText(MainActivity2.this, "Vui lòng chọn lại", Toast.LENGTH_SHORT).show();
                }
                else{
                    changeNextQuestion();
                }
            }
        });

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quizTimer.purge();
                quizTimer.cancel();

                startActivity(new Intent(MainActivity2.this, MainActivity.class));
                finish();
            }
        });

    }
    /*
    backbtn onclick
    */
private void changeNextQuestion(){
    currentQuestionPosition++;
    if((currentQuestionPosition+1) == questionList.size()){
        nextBtn.setText("Hoàn thành trò chơi");
    }
    if(currentQuestionPosition< questionList.size()){
        selectedOptionByUser="";
        cau1.setBackgroundResource(R.drawable.background);
        cau1.setTextColor(Color.parseColor("#1F6BB8"));

        cau2.setBackgroundResource(R.drawable.background);
        cau2.setTextColor(Color.parseColor("#1F6BB8"));

        cau3.setBackgroundResource(R.drawable.background);
        cau3.setTextColor(Color.parseColor("#1F6BB8"));

        cau4.setBackgroundResource(R.drawable.background);
        cau4.setTextColor(Color.parseColor("#1F6BB8"));

        questions.setText((currentQuestionPosition)+"/"+questionList.size());
        question.setText(questionList.get(currentQuestionPosition).getQuestion());
        cau1.setText(questionList.get(currentQuestionPosition).getCau1());
        cau2.setText(questionList.get(currentQuestionPosition).getCau2());
        cau3.setText(questionList.get(currentQuestionPosition).getCau3());
        cau4.setText(questionList.get(currentQuestionPosition).getCau4());

    }
    else {
        Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
        intent.putExtra("Chính xác", getCorrectAnswers());
        intent.putExtra("Không chính xác",getIncorrectAnswers());
        startActivity(intent);
        finish();
    }
}
    private void startTimer(TextView timerTextView){
        quizTimer= new Timer();
        quizTimer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if(seconds == 0){
                    totalTimeInMins--;
                    seconds= 59;
                } else if (seconds == 0 && totalTimeInMins ==0) {
                    quizTimer.purge();
                    quizTimer.cancel();

                    Toast.makeText(MainActivity2.this,"Thời gian kết thúc", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                    intent.putExtra("Đúng", getCorrectAnswers() );
                    intent.putExtra("Không đúng",getIncorrectAnswers() );
                    startActivity(intent);

                    finish();
                }
                else {
                    seconds--;
                }

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        String finalMinutes= String.valueOf(totalTimeInMins);
                        String finalSeconds = String.valueOf(seconds);
                        if(finalMinutes.length() == 1){
                            finalMinutes="0"+finalMinutes;
                        }

                        if(finalSeconds.length()==1){
                            finalSeconds = "0"+finalSeconds;
                        }
                        timerTextView.setText(finalMinutes +":"+finalSeconds);
                    }
                });
            }
        },1000, 1000);

    }
    private int getCorrectAnswers(){
        int correctAnswers = 0;
        for(int i = 0; i< QuestionList.size; i++){
            final String getUserSelectedAnswer = QuestionList.get();
            final String getAnswer = QuestionList.get();
            if(getUserSelectedAnswer.equals(getAnswer)){
                correctAnswers++;
            }
        }
        return correctAnswers;
    }

    private int getIncorrectAnswers(){
        int correctAnswers = 0;
        for(int i = 0; i< QuestionList.size; i++){
            final String getUserSelectedAnswer = QuestionList.get();
                final String getAnswer = QuestionList.get();
            if(!getUserSelectedAnswer.equals(getAnswer)){
                correctAnswers++;
            }
        }
        return correctAnswers;
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        quizTimer.purge();
        quizTimer.cancel();

        startActivity(new Intent(MainActivity2.this, MainActivity.class));
        finish();
    }

    private void revealAnwers(){
        final String getAnswer = questionList.get(currentQuestionPosition).getAnswers();
        if(cau1.getText().toString().equals(getAnswer)){
            cau1.setBackgroundResource(R.drawable.background5);
            cau1.setTextColor(Color.WHITE);
        }
        else if(cau1.getText().toString().equals(getAnswer)){
            cau2.setBackgroundResource(R.drawable.background5);
            cau2.setTextColor(Color.WHITE);
        }
        else if(cau3.getText().toString().equals(getAnswer)){
            cau3.setBackgroundResource(R.drawable.background5);
            cau3.setTextColor(Color.WHITE);
        }
        else if(cau4.getText().toString().equals(getAnswer)){
            cau4.setBackgroundResource(R.drawable.background5);
            cau4.setTextColor(Color.WHITE);
        }
    }
}