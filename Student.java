public class Student extends Person{
	// String fio - Фамилия и имя - тянем из родителя
	// int age - возраст тянем из родителя
	private int cntTaskDone; // количество решеных заданий
	private static int cntTaskDoneAll; // количество решеных заданий всей группой
	private Mentor mentor; // ментор
	private boolean allTaskDone; // true - решены все задачи
	
	public Student(String pFio, int pAge, String pMentorFio, int pMentorAge){
		super(pFio, pAge);
		setCntTaskDone(0);
		this.mentor = new Mentor(pMentorFio, pMentorAge);
		setAllTaskDone(false);
	}
	
	// Методы get и set для fio тянем из родителя
	// Методы get и set для age тянем из родителя
	
	// Методы get и set для cntTaskDone
	public int getCntTaskDone(){
		return this.cntTaskDone;
	}
	
	public void setCntTaskDone(int pCnt){
		this.cntTaskDone = pCnt;
	}	
	
	// Методы get и set для allTaskDone
	public boolean getAllTaskDone(){
		return this.allTaskDone;
	}
	
	public void setAllTaskDone(boolean pStatus){
		this.allTaskDone = pStatus;
	}
	
	// Метод по решеной задаче
	private void taskDone(Task pTask) {
		// Нужны доп провеки по автоматическому решению и отправке ментору
		this.cntTaskDone++;
		cntTaskDoneAll++;
	}
	
	public void tasksDone(Task[] pTasks, int pCntTasks){
		while(!this.allTaskDone){
			if (this.cntTaskDone < pCntTasks) {
				System.out.println("Пока что решены не все задачи");
				this.taskDone(pTasks[this.cntTaskDone]);
			} else {
				System.out.println("Все задачи решены");
				this.allTaskDone = true;
			}
		}
	}
}
