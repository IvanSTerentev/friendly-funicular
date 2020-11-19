import java.util.Random;

public class Mentor extends Person implements Staff{
	private boolean mood; // настроение true - хорошее
	private Random rand;
	
	public Mentor(String pFio, int pAge){
		super(pFio, pAge);
		setMood(true);
		this.rand = new Random();
	}
	
	@Override
	public void helpStudent(Student pStudent){
		System.out.println(pStudent.getFio() + " все отлично!");
	}
	
	public boolean checkCode(Task pTask){
		this.mood = (rand.nextInt(2000) > 1000);
		
		String strPrint = (this.mood)? " задача принята" : " задача не принята";
		
		System.out.println(pTask.num + strPrint);
		
		return this.mood;
	}
	
	public boolean getMood(){
		return this.mood;
	}
	
	public void setMood(boolean pMood){
		this.mood = pMood;
	}
}
