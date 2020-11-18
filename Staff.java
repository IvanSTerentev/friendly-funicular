public interface Staff{
	void helpStudent(Student pStudent);
	
	default void giveExtMaterials(){
		System.out.println("Тут есть все: https://habr.com/ru/");
	}
}
