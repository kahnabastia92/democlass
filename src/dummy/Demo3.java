package dummy;

public class Demo3 {

	public static void main(String[] args) {
		Object login[][]=new Object[4][2];
		login[0][0]="userid";
		login[0][1]="password";
		login[1][0]="Admin1";
		login[1][1]=123;
		login[2][0]="Admin2";
		login[2][1]="456";
		login[3][0]="Admin3";
		login[3][1]="789";
		
		
		for (int row = 0; row < login.length; row++) {
			for (int col = 0; col < login[row].length; col++) {
				System.out.println("\n"+login[row][col]);
			}
		}

	}

}
