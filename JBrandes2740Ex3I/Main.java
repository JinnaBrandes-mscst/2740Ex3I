package Ex3I;



import javax.swing.DefaultListModel;

public class Main {

	public static void main(String[] args) {
//		char [] answers = {'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D'};
//		DefaultListModel answersList = new DefaultListModel();
//		answersList.addElement("B");
//		answersList.addElement("C");
//		answersList.addElement("A");
//		answersList.addElement("D");
//		answersList.addElement("C");
//		answersList.addElement("A");
//		answersList.addElement("D");
//		answersList.addElement("B");
//		answersList.addElement("A");
//		answersList.addElement("C");
//		DriverExam exam = new DriverExam(answersList);
		DriverExamObjMapper mapper = new DriverExamObjMapper("DriverExam.txt");
		DriverExam exam = mapper.getDriverExam();
		
		DefaultListModel responsesListModel = new DefaultListModel();
		responsesListModel.addElement("B");
		responsesListModel.addElement("C");
		responsesListModel.addElement("Z");
		responsesListModel.addElement("D");
		responsesListModel.addElement("C");
		responsesListModel.addElement("A");
		responsesListModel.addElement("D");
		responsesListModel.addElement("B");
		responsesListModel.addElement("A");
		responsesListModel.addElement("C");
		
		exam.setResponses(responsesListModel);
		
		System.out.println("First invalid response: " + exam.validate());
		System.out.println("Total Correct: " + exam.totalCorrect());
		System.out.println("Total Incorrect: " + exam.totalIncorrect());
		
		if(exam.passed())
			System.out.println("Passed test");
		else
			System.out.println("Try Again");
		
		System.out.print("Questions missed:");
		int[] missed = exam.questionsMissed();
		int i=0;
		
		while(i < missed.length && missed[i] > 0){
			System.out.print(" " + missed[i]);
			i++;
		}
		return;
	}

}
