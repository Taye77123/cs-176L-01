import java.util.Scanner;
public class HousePainting {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//get all inputs
		System.out.print("Enter house length: ");
		double houseLength = sc.nextDouble();
		System.out.print("Enter house width: ");
		double houseWidth = sc.nextDouble();
		System.out.print("Enter house hight: ");
		double houseHight = sc.nextDouble();
		
		System.out.print("Enter window length: ");
		double windowLength = sc.nextDouble();
		System.out.print("Enter window width: ");
		double windowWidth = sc.nextDouble();
		System.out.print("Enter window hight: ");
		double windowHight = sc.nextDouble();
		
		System.out.print("Enter door length: ");
		double doorLength = sc.nextDouble();
		System.out.print("Enter door width: ");
		double doorWidth = sc.nextDouble();
		System.out.print("Enter door hight: ");
		double doorHight = sc.nextDouble();
		//do calculations
		SqFtpeak = (houseLength * houseWidth + .5 * houseLength) + (houseHight - houseWidth);
		(houseLength * houseLength);

		
		//output results
		System.out.print(houseLength);
		System.out.print(houseWidth);
		System.out.print(houseHight);
	
	}
	

}
