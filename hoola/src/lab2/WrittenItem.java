package lab2;

public abstract class WrittenItem extends Item{

	private String pages;
	public WrittenItem(int uid, String title, int copies,String pages) {
		super(uid, title, copies);
		// TODO Auto-generated constructor stub
		this.pages=pages;
	}

	public String getPages() {
		return pages;
	}

	public void setPages(String pages) {
		this.pages = pages;
	}

	abstract int pages();
}
