public class Person{
	private String fio; // Фамилия и Имя 
	private int age; // Возраст
	
	public Person(String pFio, int pAge){
		setFio(pFio);
		setAge(pAge);
	}
	
	// Методы get и set для fio
	public String getFio(){
		return this.fio;
	}
	
	public void setFio(String pFio){
		this.fio = pFio;
	}
	
	// Методы get и set для age
	public int getAge(){
		return this.age;
	}
	
	public void setAge(int pAge){
		this.age = pAge;
	}
}
