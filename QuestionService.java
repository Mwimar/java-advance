
import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String selection[] = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "How Many legs Cow?", "6", "4", "1", "7", "4");
        questions[1] = new Question(2, "How Many legs ant?", "3", "2", "6", "10", "6");
        questions[2] = new Question(3, "How Many legs Man?", "2", "3", "8", "6", "2");
        questions[3] = new Question(4, "How Many legs Spider?", "8", "5", "2", "1","8");
        questions[4] = new Question(5, "How Many legs Snake", "0", "8", "10", "3", "0");

        // Question q1 = new Question();

        // questions[1] = new Question();
        // questions[2] = q1;

    }

    public void playQuiz() {
        int i = 0;
        for (Question q : questions) {

            System.out.println("Question no:" + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.next();
            i++;

        }
        for (String s : selection) {
            System.out.println(s);
        }
    }
    
    public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            Question que = questions[i];
            String answer = que.getAnswer();

            
        }
    }

}
