package demo;
 
	

	public class Main {

	    public static void main(String[] args) {

	        Question[] questions = new Question[4];

	        questions[0] = new Question(
	                1,
	                "Size of int in Java?",
	                "2 bytes",
	                "4 bytes",
	                "8 bytes",
	                "16 bytes",
	                2
	        );

	        questions[1] = new Question(
	                2,
	                "Which keyword creates object?",
	                "class",
	                "new",
	                "this",
	                "void",
	                2
	        );

	        questions[2] = new Question(
	                3,
	                "Which follows FIFO?",
	                "Stack",
	                "Queue",
	                "Tree",
	                "Graph",
	                2
	        );

	        questions[3] = new Question(
	                4,
	                "Single line comment symbol?",
	                "//",
	                "/* */",
	                "#",
	                "<!-- -->",
	                1
	        );

	        QuestionService service = new QuestionService();

	        service.playQuiz(questions);
	    }
	}


