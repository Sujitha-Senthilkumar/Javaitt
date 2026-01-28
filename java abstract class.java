import java.util.*;
abstract class Mobile{
	String brand;
	abstract void setBrand(String s);
	String getBrand(){
		return Brand;
	}
}
class MyMobile extends Mobile{
    void setBrand(String s){
        this.brand=s;
    }
}
public class Main{
	
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		MyMobile new_brand=new MyMobile();
		new_brand.setBrand(brand);
		System.out.println("The title is: "+new_brand.getBrand());
      	sc.close();
		
	}
}