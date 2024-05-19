package thick.tranmyngoc_63132347.dovui;

public class QuestionList {
    private int  i;
    public static int size;
    private String question, cau1, cau2, cau3, cau4, answers;
    private String userSelectedAnswers;


    public QuestionList(String question, String cau1, String cau2, String cau3, String cau4, String answers, String userSelectedAnswers) {
        this.question = question;
        this.cau1 = cau1;
        this.cau2 = cau2;
        this.cau3 = cau3;
        this.cau4 = cau4;
        this.answers = answers;
        this.userSelectedAnswers = userSelectedAnswers;
    }

    public static String get() {

        return null;
    }




    public void setQuestion(String question) {
        this.question = question;
    }

    public void setCau1(String cau1) {
        this.cau1 = cau1;
    }

    public void setCau2(String cau2) {
        this.cau2 = cau2;
    }

    public void setCau3(String cau3) {
        this.cau3 = cau3;
    }

    public void setCau4(String cau4) {
        this.cau4 = cau4;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }

    public void setUserSelectedAnswers(String userSelectedAnswers) {
        this.userSelectedAnswers = userSelectedAnswers;
    }

    public String getQuestion() {
        return question;
    }

    public String getCau1() {
        return cau1;
    }

    public String getCau2() {
        return cau2;
    }

    public String getCau3() {
        return cau3;
    }

    public String getCau4() {
        return cau4;
    }

    public String getAnswers() {
        return answers;
    }

    public String getUserSelectedAnswers() {
        return userSelectedAnswers;
    }

    public void setUserSelectedAnswer(String userSelectedAnswers){
        this.userSelectedAnswers = userSelectedAnswers;
    }
}