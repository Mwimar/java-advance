public class QuestionService {

    Question[] questions = new Question[5];

    public QuestionService() {
        questions[0] = new Question(1, "What is Int", "Framework", "Library", "Language", "Class", "Language");
        questions[1] = new Question(1, "What is Java", "primitive", "Library", "Language", "Class", "primitive");
        questions[2] = new Question(1, "What is Object", "Framework", "Reference", "Language", "Class", "Reference");
        questions[3] = new Question(1, "What is String", "Framework", "nonprimitive", "Language", "Class", "nonprimitive");
        questions[4] = new Question(1, "What is Main", "Class", "Library", "Language", "object", "Class");
        
            
        // Question q1 = new Question();

        // questions[1] = new Question();
        // questions[2] = q1;

    }

    public void displayQuestions() {
        for (Question q : questions) {
            
            System.out.println(q.getAnswer());
        }
    }

}
