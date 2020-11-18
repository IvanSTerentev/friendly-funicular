public class DragAndDrop extends Task implements Autochecked{
	private String[][] variants;
	
	public DragAndDrop(int pNum){
		super();
		
		String[][] variants = {
				{"Что-то №1", "Что-то №2"},
				{"Как-то №1", "Как-то №2"}
			};
			
		this.num = pNum;
	}
}
