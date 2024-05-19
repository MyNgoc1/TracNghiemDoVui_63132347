package thick.tranmyngoc_63132347.dovui;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class QuestionBank {
    private static List<QuestionList> javaQuestion() {
        final List<QuestionList> questionLists = new ArrayList<>();

        final QuestionList cau1 = new QuestionList("Kết quả của biểu thức Java + 8 + 2 là gì?", "10", "Java82", "\"Java82\"", "\"Java10\"", "\"Java82\"", "");
        final QuestionList cau2 = new QuestionList("Phương thức nào trong Java được sử dụng để tạo một đối tượng mới?", "new()", "construct()", "create()", "initialize()", "new()", "");
        final QuestionList cau3 = new QuestionList("Để tạo một mảng có kích thước động, bạn sử dụng:", "Array", "ArrayList", "Vector", "LinkedList", "ArrayList", "");
        final QuestionList cau4 = new QuestionList("Phương thức main() trong Java phải có cú pháp:", "public void main(String[] args)", "public static void main(String[] args)", "void main(String[] args)", "static void main(String[] args)", "public static void main(String[] args)", "");
        final QuestionList cau5 = new QuestionList("Trong Java, phạm vi truy cập public là:", "Chỉ trong cùng lớp", "Trong cùng package và các lớp con", "Trong cùng package", "Có thể truy cập từ bất kỳ nơi nào", "Có thể truy cập từ bất kỳ nơi nào", "");
        final QuestionList cau6 = new QuestionList("Từ khóa nào được sử dụng để khai báo một biến với giá trị không thể thay đổi?", "final", "const", "immutable", "static", "final", "");

        questionLists.add(cau1);
        questionLists.add(cau2);
        questionLists.add(cau3);
        questionLists.add(cau4);
        questionLists.add(cau5);
        questionLists.add(cau6);

        return questionLists;
    }

    private static List<QuestionList> htmlQuestion() {
        final List<QuestionList> questionLists = new ArrayList<>();

        final QuestionList cau1 = new QuestionList("Thẻ HTML nào được sử dụng để chèn một đoạn mã JavaScript vào trang web?", "<script>", "<code>", "<js>", "<program>", "<script>", "");
        final QuestionList cau2 = new QuestionList("Thuộc tính nào được sử dụng để chỉ định màu nền của một phần tử HTML?", "color", "bgcolor", "background-color", "fill", "background-color", "");
        final QuestionList cau3 = new QuestionList("Thẻ nào được sử dụng để tạo ra một form trong HTML?", "<form>", "<input>", "<label>", "<submit>", "<form>", "");
        final QuestionList cau4 = new QuestionList("Thẻ HTML nào được sử dụng để tạo ra một khung tài liệu?", "<frame>", "<iframe>", "<window>", "<border>", "<iframe>", "");
        final QuestionList cau5 = new QuestionList("Thuộc tính nào được sử dụng để chỉ định chiều rộng của một phần tử HTML?", "height", "size", "width", "dimension", "width", "");
        final QuestionList cau6 = new QuestionList("Thẻ HTML nào được sử dụng để tạo ra một phần tử không có phần tử bao bọc?", "<hr>", "<br>", "<img>", "Tất cả các đáp án trên", "Tất cả các đáp án trên", "");

        questionLists.add(cau1);
        questionLists.add(cau2);
        questionLists.add(cau3);
        questionLists.add(cau4);
        questionLists.add(cau5);
        questionLists.add(cau6);

        return questionLists;
    }


    private static List<QuestionList> pythonQuestion() {
        final List<QuestionList> questionLists = new ArrayList<>();

        final QuestionList cau1 = new QuestionList("Python là ngôn ngữ lập trình:", "Biên dịch", "Thông dịch", "Cả A và B", "Không thuộc cả A và B", "Thông dịch", "");
        final QuestionList cau2 = new QuestionList("Câu lệnh nào trong Python dùng để khai báo một hàm?", "function", "func", "procedure", "def", "def", "");
        final QuestionList cau3 = new QuestionList("Biến trong Python có thể lưu trữ:", "Số nguyên", "Số thực", "Chuỗi ký tự", "Tất cả các đáp án trên", "Tất cả các đáp án trên>", "");
        final QuestionList cau4 = new QuestionList("Câu lệnh nào trong Python dùng để lặp lại một đoạn code?", "for", "while", "Cả for và while", "repeat", "Cả for và while", "");
        final QuestionList cau5 = new QuestionList("Phương thức nào trong Python dùng để kiểm tra kiểu dữ liệu của một biến?", "type()", "type() và isinstance()", "isinstance()", "id()", "type() và isinstance()", "");
        final QuestionList cau6 = new QuestionList("Câu lệnh nào trong Python dùng để xử lý ngoại lệ?", "try-except và raise", "try-except", "if-else", "raise", "try-except và raise", "");

        questionLists.add(cau1);
        questionLists.add(cau2);
        questionLists.add(cau3);
        questionLists.add(cau4);
        questionLists.add(cau5);
        questionLists.add(cau6);

        return questionLists;
    }


    private static List<QuestionList> androidQuestion() {
        final List<QuestionList> questionLists = new ArrayList<>();

        final QuestionList cau1 = new QuestionList("Để gửi thông báo đến người dùng trong ứng dụng Android, bạn có thể sử dụng:", "Notification", "Toast", "Snackbar", "Tất cả các đáp án trên", "Tất cả các đáp án trên", "");
        final QuestionList cau2 = new QuestionList("Để phát triển giao diện người dùng (UI) trong Android, bạn có thể sử dụng:", "XML", "Java", "Kotlin", "Kotlin và XML", "Kotlin và XML", "");
        final QuestionList cau3 = new QuestionList("Để lưu trữ dữ liệu cục bộ trong ứng dụng Android, bạn có thể sử dụng:", "Shared Preferences", "Room", "SQLite", "Tất cả các đáp án trên", "Tất cả các đáp án trên", "");
        final QuestionList cau4 = new QuestionList("Thành phần nào không phải là một trong những thành phần cơ bản của một ứng dụng", "Activity", "Service", "BroadcastReceiver", "ViewModel", "ViewModel", "");
        final QuestionList cau5 = new QuestionList("Ngôn ngữ lập trình chính được sử dụng để phát triển ứng dụng Android là:", "Java", "C++", "Python", "Swift", "Java", "");
        final QuestionList cau6 = new QuestionList("Android là hệ điều hành dựa trên:", "Linux", "Windows", "iOS", "macOS", "Linux", "");

        questionLists.add(cau1);
        questionLists.add(cau2);
        questionLists.add(cau3);
        questionLists.add(cau4);
        questionLists.add(cau5);
        questionLists.add(cau6);

        return questionLists;
    }

    public static List<QuestionList> getQuestions(String selecTopicName) {
        switch (selecTopicName) {
            case "java":
                return javaQuestion();
            case "html":
                return htmlQuestion();
            case "python":
                return pythonQuestion();
            default:
                return androidQuestion();

        }
    }
}