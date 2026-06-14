package demo;

 


	import java.util.Scanner;

	class QuestionService extends AbstractQuiz {

	    @Override
	    void playQuiz(Question[] questions) {

	        Scanner sc = new Scanner(System.in);

	        int score = 0;

	        for (int i = 0; i < questions.length; i++) {

	            Question q = questions[i];

	            System.out.println("\n" + q.question);

	            System.out.println("1. " + q.opt1);
	            System.out.println("2. " + q.opt2);
	            System.out.println("3. " + q.opt3);
	            System.out.println("4. " + q.opt4);

	            System.out.print("Enter answer: ");

	            int userAnswer = sc.nextInt();

	            if (userAnswer == q.answer) {

	                System.out.println("Correct!");
	                score++;

	            } else {

	                System.out.println("Wrong!");
	            }
	        }

	        System.out.println("\nFinal Score = " + score);
	    }
	}


