package java_Advanced;

public class BitSet {

	public static void main(String[] args) {
		java.util.BitSet bitSet1 = new java.util.BitSet(16);
		java.util.BitSet bitSet2 = new java.util.BitSet(16);
	
		for(int i=0;i<16;i++) {
			if((i%2)== 0) bitSet1.set(i);
			System.out.println(bitSet1);
			System.out.println("\n");
			
			if((i%3)==0) bitSet2.set(i);
			System.out.println(bitSet2);
		}
		
	}
}
