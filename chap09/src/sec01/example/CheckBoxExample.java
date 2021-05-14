package sec01.example;

public class CheckBoxExample {
	public static void main(String[] args) {
		CheckBox cb = new CheckBox();
		
		cb.setOnElectListener(new BackgroundChangeListener());
		cb.select();
	}
}
