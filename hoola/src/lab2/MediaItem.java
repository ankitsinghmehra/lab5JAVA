package lab2;

public abstract class MediaItem  extends Item{

	 private String runtime;
	public MediaItem(int uid, String title, int copies,String runtime) {
		super(uid, title, copies);
		// TODO Auto-generated constructor stub
		this.runtime=runtime;
	}
	public String getRuntime() {
		return runtime;
	}
	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}
	
	abstract String runTime();
}
