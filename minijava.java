import java.util.Scanner;
import java.time.Instant;

class TypingTutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] exercises = {
                "The quick brown fox jumps over the lazy dog",
                "Hello world",
                "Practice makes perfect",
                "Out of sight, out of mind",
                "A penny saved is a penny earned",

                "believe receive separate definitely necessary",
                "there their they're hear here",
                "ight tion ough",

                "The cat is on the mat.",
                "The cat is on the mat, and the dog is in the yard.",
                "Because the cat was on the mat, the dog barked.",

                // ... Add more exercise if you want
        };

        for (String exercise : exercises) {
            System.out.println("Type the following: "+"\u001B[1m"+ exercise+ "\u001B[0m");
            long startTime = Instant.now().toEpochMilli();
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("stop")) {
                System.out.println("Terminating the program.");
                return;
            }
            long endTime = Instant.now().toEpochMilli();

            ErrorReport errorReport = evaluateExercise(exercise, userInput);
            double timeTaken = (endTime - startTime) / 1000.0;
            double wpm = (exercise.length() - errorReport.getErrors()) / (timeTaken / 60.0) / 5; // Calculate WPM

            System.out.println("\u001B[31mErrors: " + errorReport.getErrors()+"\u001B[0m\n");
            System.out.println("\u001B[32mTime taken: " + timeTaken + " seconds\u001B[0m");
            System.out.println("\u001B[32mWPM: " + wpm +"\u001B[0m\n");
            System.out.println("\u001B[1m\u001B[31mError report:\u001B[0m\u001B[0m\n");
            System.out.println(errorReport.getReport());
            System.out.println();
        }
    }

    public static ErrorReport evaluateExercise(String expected, String actual) {
        int errors = 0;
        StringBuilder report = new StringBuilder();

        String[] expectedWords = expected.split(" ");
        String[] actualWords = actual.split(" ");

        for (int i = 0; i < Math.max(expectedWords.length, actualWords.length); i++) {
            if (i >= expectedWords.length) {
                report.append("\u001B[31mExtra word: \u001B[0ms").append(actualWords[i]).append("\n");
                errors++;
            } else if (i >= actualWords.length) {
                report.append("\u001B[31mMissing word: \u001B[0m").append(expectedWords[i]).append("\n");
                errors++;
            } else if (!expectedWords[i].equals(actualWords[i])) {
                report.append("Expected '").append("\u001B[32m"+expectedWords[i]+"\u001B[0m").append("' but got '").append("\u001B[31m"+actualWords[i]+"\u001B[0m").append("'\n");
                errors++;
            }
        }

        return new ErrorReport(errors, report.toString());
    }

    public static class ErrorReport {
        private int errors;
        private String report;

        public ErrorReport(int errors, String report) {
            this.errors = errors;
            this.report = report;
        }

        public int getErrors() {
            return errors;
        }

        public String getReport() {
            return report;
        }
    }
}