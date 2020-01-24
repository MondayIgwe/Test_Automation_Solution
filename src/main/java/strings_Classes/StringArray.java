package strings_Classes;

public class StringArray {

	String n = "";
	int num = 0;
	double d = 0.3;
	long l = 544454;
	short s = 88;
	char c = 'D';
	boolean bo = false;
	byte b = 33;

	public String getN() {
		return n;
	}

	public void setN(String n) {
		this.n = n;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public double getD() {
		return d;
	}

	public void setD(double d) {
		this.d = d;
	}

	public long getL() {
		return l;
	}

	public void setL(long l) {
		this.l = l;
	}

	public short getS() {
		return s;
	}

	public void setS(short s) {
		this.s = s;
	}

	public char getC() {
		return c;
	}

	public void setC(char c) {
		this.c = c;
	}

	public boolean isBo() {
		return bo;
	}

	public void setBo(boolean bo) {
		this.bo = bo;
	}

	public byte getB() {
		return b;
	}

	public void setB(byte b) {
		this.b = b;
	}

	public String[] getDemo() {
		return demo;
	}

	public void setDemo(String[] demo) {
		this.demo = demo;
	}

	String[] demo = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

	public static void main(String[] args) {
		
		new StringArray().show();
	}

	void show() {
		for (String x : demo) {
			System.out.println(x);

		}
	}

}
