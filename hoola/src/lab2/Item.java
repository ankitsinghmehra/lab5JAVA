package lab2;

abstract class Item {

	private int uid;
	private String title;
	private int copies;
	
	
	public Item(int uid, String title, int copies) {
		this.uid = uid;
		this.title = title;
		this.copies = copies;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCopies() {
		return copies;
	}
	public void setCopies(int copies) {
		this.copies = copies;
	}
	
	abstract void print();
	abstract void checkIn();
	abstract void checkOut();
	abstract void addItem();
	
}
