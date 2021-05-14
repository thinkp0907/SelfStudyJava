package sec01.example;

public class CheckBox {
	OnSelectListener listener;
	
	void setOnElectListener(OnSelectListener listener) {
		this.listener = listener;
	}
	
	void select() {
		listener.onSelect();
	}
	
	static interface OnSelectListener {
		public void onSelect();
	}
}
