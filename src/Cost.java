import java.util.Scanner;
public class Cost {

	public static void main(String[] args) {
		double area,cost=0;
		String type;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter required area");
		area=sc.nextDouble();
		System.out.println("1.standard_material\n"+"2.above_standard_material\n"+"3.high_standard_material\n"+"4.High_standard_material_and_fully_automated\n"+"enter your chice");
		type=sc.next();
		switch(type)
		{
		case "standard_material":cost=area*1200;break;
		case "above_standard_material":cost=area*1500;break;
		case "high_standard_material":cost=area*1800;break;
		case "High_standard_material_and_fully_automated":cost=area*2500;break;
		default: System.out.println("enter a valid choice");break;
		}
		System.out.println("House construction cost is: "+cost+"INR");
	}

}
