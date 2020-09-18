public class CscExamples{
	int questionNo;
	String category;
	String text;
	
	
	//getters and setters
	public void setQuestionNo(int questionNo){
		this.questionNo = questionNo;
	}
	public void setCategory(String category){
		this.category = category;
	}
	public void setText(String text){
		this.text = text;
	}
	
	public int getQuestionNo(){
		return questionNo;
	}
	public String getCategory(){
		return category;
	}
	public String getText(){
		return text;
	}
	
	public void addQuestion(CscExamples quiz){
		this.questionNo = quiz.questionNo;
		this.category = quiz.category;
		this.text = quiz.text;
	}
	public  void removeQuestion(int qId){
		//removeQuestion
	}
	public void editQuestion(int qId){
		//editQuestion
	}
}