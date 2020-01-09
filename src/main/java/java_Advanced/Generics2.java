package java_Advanced;

public class Generics2 <T> {

	private T t;
	
	public void add(T t) {
		this.t=t;	
	}
	
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t=t;
	}
	
	public static void main(String[] args) {
		Generics2<Integer> iGenerics2 = new Generics2<Integer>();
		Generics2<String> sGenerics2 = new Generics2<String>();
		Generics2<Double> dGenerics2 = new Generics2<Double>();
		Generics2<Float> fGenerics2 = new Generics2<Float>();
		
		iGenerics2.add(23222);
		sGenerics2.add(new String("monn"));
		dGenerics2.set(3.3);
		
		System.out.printf("Integer Value :%d\n\n",iGenerics2.get());
		System.out.printf(sGenerics2.get()+" \n"+dGenerics2.get());
		
	}
}
