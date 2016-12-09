import java.util.Scanner;

public class Tax {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		double sum = 0;
		if(i<=1500){
			sum = i*0.03;
		}else if(i<=4500){
			sum = 1500*0.03+(i-1500)*0.1;
		}else if(i<=9000){
			sum = 1500*0.03+3000*0.1+(i-4500)*0.2;
		}else if(i<=35000){
			sum = 1500*0.03+3000*0.1+4500*0.2+(i-9000)*0.25;
		}else if(i<=55000){
			sum = 1500*0.03+3000*0.1+4500*0.2+26000*0.25+(i-35000)*0.3;
		}else if(i<=80000){
			sum = 1500*0.03+3000*0.1+4500*0.2+26000*0.25+20000*0.3+(i-55000)*0.35;
		}else{
			sum = 1500*0.03+3000*0.1+4500*0.2+26000*0.25+20000*0.3+25000*0.35+(i-80000)*0.45;
		}
		System.out.println("所需要缴纳的税费为："+sum);
	}
}
