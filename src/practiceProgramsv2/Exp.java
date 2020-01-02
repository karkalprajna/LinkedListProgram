package practiceProgramsv2;

public class Exp {

	public static void main(String[] args) {
		try {
			throw new Exp1();
		} catch (Exp0 e) {
			System.out.println("Expo...");
			
		}catch (Exception exp) {
			System.out.println("Exception...");
			
		}
		
		

	}

	

}
