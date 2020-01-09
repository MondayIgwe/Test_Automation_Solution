package inheritance;


public interface My_Interface {

	public static final int RESULT = 0;
	public String[] myArray = {"joel","jessica"};
	
	
	default void getPara() {
	for(int i =0;i<myArray.length -1; i=+i) {
		System.out.println(String.valueOf(myArray[i]));
		break;
	}
	}
	
	static String getMyResutOid() {
		String urlString = "https://mondysys.com";
		return urlString;
	}
	
	public void name();
}
