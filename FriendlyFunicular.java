import java.util.Random;

public class FriendlyFunicular{
	public static void main(String[] argv){
		Random r = new Random();
		Mentor m1 = new Mentor("Пшончик", 20);
		Mentor m2 = new Mentor("Жирик", 25);
		
		Student[] students = new Student[20];
		
		for (int i = 0; i < students.length; i++){
			if (i%2 == 0){
				students[i] = new Student("Студент №" + i, 17 + i, m1);
			} else {
				students[i] = new Student("Студент №" + i, 17 + i, m2);
			}
		}
		
		Task[] task = new Task[60];
		
		for (int i = 0; i < task.length; i++){
			if (i%2 == 0){
				task[i] = new Test(i);
			} else if (i%3 == 0) {
				task[i] = new Code(i);
			} else {
				task[i] = new DragAndDrop(i);
			}
		}
		
		for (int i = 0; i < students.length; i++){
			int j = r.nextInt(task.length);
			
			students[i].tasksDone(task, j);
		}
	}
}
