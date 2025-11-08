package BasicsOfJava;

public class SantoshTambaram extends Abstractionconcepts{

	@Override
	public void discount(int amount) {
		// TODO Auto-generated method stub
		double discount = amount*0.02;
		System.out.println("your discount is : "+discount);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstractionconcepts S = new SantoshTambaram();
		S.discount(1000);
		S.add(10, 10);
	}

	

}
