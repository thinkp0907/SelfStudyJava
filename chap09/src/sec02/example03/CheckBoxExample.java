package sec02.example03;

public class CheckBoxExample {

	public static void main(String[] args) {
		CheckBox cb = new CheckBox();
		cb.setOnSelectListener(new CheckBox.OnSelectListener() {
			@Override
			public void onSelect() {
				System.out.println("배경을 변경합니다.");
			}
		});
		cb.select();
	}

}
