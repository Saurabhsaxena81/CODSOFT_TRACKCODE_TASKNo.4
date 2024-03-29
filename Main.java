import java.util.Scanner;


/**
 * Quiz Questions and Options 
 * 
 * Timer 
 * Question Display
 * 
 * Answer Submission
 * 
 * Score Calculation
 * 
 */
class Quiz {
    private String[] questions;
    private String[][] options;
    private char[] answers;
    private int score;

    public Quiz() {
        questions = new String[]{
            "Who wrote 'Java Programming'?",
            "What is the correct way to declare a method that takes an integer parameter and returns a boolean value in Java?",
            "What is the output of the following code snippet?                                  int x = 10;\r\n" + //
                                "if (x > 5) {\r\n" + //
                                "    System.out.println(\"Hello\");\r\n" + //
                                "} else {\r\n" + //
                                "    System.out.println(\"World\");\r\n" + //
                                "}\r\n" + //
                                "",
                            
            " Which of the following data types in Java is used to store a single character?",
            
            "What is the purpose of the super keyword in Java?"
        };

        options = new String[][]{
            {"A) James Gosling", "B) William Shakespeare", "C) Dennish Richi", "D) F. Guido van Rossum."},{"a) boolean checkValue(int x)",
                "b) boolean checkValue()",
                "c) void checkValue(int x)",
                "d) boolean checkValue(boolean x)"},
            {"a) Hello",
                "b) World",
                "c) Hello World",
                "d) Compilation Error"},
                {"a) int"
                    ,"b) float"
                    ,"c) char"
                    ,"d) String"},

                    {"a) To access static variables",
                        "b) To access the parent class's methods and variables",
                        "c) To declare a superclass",
                        "d) To create a new instance of a class"},
            
            
        };

        answers = new char[]{'A','A','A' ,'C','B'};
        score = 0;
    }

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your answer (A, B, C, D): ");
            char userAnswer = scanner.nextLine().toUpperCase().charAt(0);

            if (userAnswer == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + answers[i] + "\n");
            }

            // Simulate timer delay (1 seconds)
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        scanner.close();
        displayResult();
    }

    public void displayResult() {
        
        System.out.println("Quiz completed!");
        System.out.println("Your Score: " + score + "/" + questions.length);
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to My Quiz Application!!");
        Quiz quiz = new Quiz();
        
        quiz.startQuiz();
        System.out.println("Thanks for Attempting Quiz!");
       
    }
}

/*
 * 🎯 Title: Building an Interactive Quiz Application in Java

Project Overview:
During my Java programming journey, I created an interactive Quiz Application to challenge users with multiple-choice questions and evaluate their knowledge.

Key Features:

🧠 Quiz Questions: Designed a set of questions across different topics to engage users and test their understanding.

🕒 Timer Functionality: Implemented a timer feature to simulate time constraints for answering each question, enhancing the quiz experience.

📋 Question Display: Displayed questions and multiple-choice options dynamically to guide users through the quiz seamlessly.

✔️ Answer Submission: Allowed users to submit their answers and provided instant feedback on correctness.

🏆 Score Calculation: Calculated and displayed the user's final score based on the number of correct answers.

Learning Outcomes:

Enhanced proficiency in Java programming fundamentals, including arrays, loops, and user input handling.
Explored concepts of simulation, timers, and interactive user interfaces in Java console applications.
Strengthened problem-solving skills through implementing scoring algorithms and user feedback mechanisms.
Next Steps:

Enhance UI/UX with graphical elements using JavaFX or Swing for a more interactive quiz experience.
Implement features like leaderboard, topic-wise quizzes, and difficulty levels to expand application capabilities.
Conclusion:
Developing the Quiz Application was an enriching experience, combining technical skills with creativity to deliver a fun and educational platform for users.

#JavaProgramming #QuizApplication #InteractiveLearning #SoftwareDevelopment #LinkedInPost
 */