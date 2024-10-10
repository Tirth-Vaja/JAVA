import java.util.ArrayList;
import java.util.Scanner;

 class QuizGame {
    public static void main(String[] args) {
        ArrayList<Question> questions = new ArrayList<>();

        // Add questions to the list
        questions.add(new Question("What is the capital of India?", new String[] {"Delhi", "Mumbai", "Kolkata", "Chennai"}, 0));
        questions.add(new Question("Which planet is known as the Red Planet?", new String[] {"Mars", "Venus", "Jupiter", "Saturn"}, 0));
        questions.add(new Question("Who painted the Mona Lisa?", new String[] {"Leonardo da Vinci", "Pablo Picasso", "Vincent van Gogh", "Michelangelo"}, 0));
        questions.add(new Question("What is the largest ocean in the world?", new String[] {"Pacific Ocean", "Atlantic Ocean", "Indian Ocean", "Arctic Ocean"}, 0));
        questions.add(new Question("Which country won the 2022 FIFA World Cup?", new String[] {"Argentina", "France", "Brazil", "Germany"}, 0));

        Scanner scanner = new Scanner(System.in);

        int score = 0;
        for (Question question : questions) {
            System.out.println("\u001B[1m" + question.getQuestion() + "\u001B[0m");
            for (int i = 0; i < question.getAnswerOptions().length; i++) {
                System.out.print(i + ". " + question.getAnswerOptions()[i]+"  ");
                System.out.print("\n");
            }
            System.out.print("Enter your answer : ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == question.getCorrectAnswerIndex()) {
                score++;
                System.out.println("\u001B[32mCorrect!\u001B[0m");
            } else {
                System.out.println("\u001B[31mIncorrect. The correct answer is: " + question.getAnswerOptions()[question.getCorrectAnswerIndex()] + "\u001B[0m");
            }
        }

        System.out.println("Your score: " + score + "/" + questions.size());

        if (score==1){
            System.out.println("Bronze medal! Not bad, but you can do better.");
        }
        else if (score == 2) {
            System.out.println("Bronze medal! Not bad, but you can do better.");
        } else if (score >= 3 && score <= 4) {
            System.out.println("Silver medal! Great job, but you can aim for gold next time.");
        } else if (score == 5) {
            System.out.println("Gold medal! Excellent work! You're a quiz champion!");
        }
    }
}

class Question {
    private String question;
    private String[] answerOptions;
    private int correctAnswerIndex;

    public Question(String question, String[] answerOptions, int correctAnswerIndex) {
        this.question = question;
        this.answerOptions = answerOptions;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getAnswerOptions() {
        return answerOptions;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }
}