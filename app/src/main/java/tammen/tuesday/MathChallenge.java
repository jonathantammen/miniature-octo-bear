import java.util.Random;
import java.Math;

public class MathChallenge extends Challenge {
	Random rand;
	String[] types;
	public MathChallenge() {
		super();
		types = {"Add", "Subtract", "Multiply", "Divide"};
		rand = new Random();
	}

	// TODO: implement a timer similar to quizup

	String getType() {
		int typeIndex = rand.nextInt(System.currentTimeMillis());
		typeIndex = Math.abs(typeIndex) % 4;	
		return typeIndex;
	} 
	
	int[] getNumerics() {
		int problem = getType();
		int[] returnVals = {0, 0, 0, problem}
		switch(types[problem]) {
			case "Add": 
				returnVals[0] = rand.nextInt(System.currentTimeMillis());
				returnVals[0] = Math.abs(returnVals[0] % 100);		
				returnVals[1] = rand.nextInt(System.currentTimeMillis());
				returnVals[1] = Math.abs(returnVals[1] % 100);
				
				returnVals[2] = returnVals[0] + returnVals[1];
				return returnVals;
		
			case "Subtract":
				returnVals[0] = rand.nextInt(System.currentTimeMillis());
				returnVals[0] = Math.abs(returnVals[0] % 100);		
				returnVals[1] = rand.nextInt(System.currentTimeMillis());
				returnVals[1] = Math.abs(returnVals[1] % 100);
				int swapSpace = Math.max(returnVals[0], returnVals[1]);
				if (swapSpace == returnVals[1])	 {	
					returnVals[1] = returnVals[0];
					returnVals[0] = swapSpace;
				}
				returnVals[2] = returnVals[0] - returnVals[1];
				return returnVals;
		
			case "Multiply:
				returnVals[0] = rand.nextInt(System.currentTimeMillis());
				returnVals[0] = Math.abs(returnVals[0] % 15);		
				returnVals[1] = rand.nextInt(System.currentTimeMillis());
				returnVals[1] = Math.abs(returnVals[1] % 15);
				returnVals[2] = returnVals[0] * returnVals[1];
				return returnVals;


			case "Divide":
				returnVals[1] = rand.nextInt(System.currentTimeMillis());
				returnVals[1] = Math.abs(returnVals[1] % 10);		
				while(returnVals[0] == 0 || returnVals[0] % returnVals[1] != 0){
					returnVals[0] = rand.nextInt(System.currentTimeMillis());
					returnVals[0] = Math.abs(returnVals[0] % 100);		
				}
				returnVals[2] = returnVals[0] / returnVals[1];					

			default: return {0, 0, 0, problem};		
		}
	void problemPrinter() {
		int[] vals = getNumerics();
		switch (vals[3]) {
			case 0:
				System.out.println(vals[0].toString() + " + " + vals[1] + " = ?");


		}
	}

	}
	
	// TODO: change into format for android
	void problemPrinter 

}
