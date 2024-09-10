public class question6_m {
	public static void main(String[] args) {
		String strNumber = "11.99";
		String strNumber1 = "Ab12Cd3";
		float number1 = 112.3f;
		float number2 = 984.5f;
		float number4 = -25.0f;
		float number6 = 0.0f;
		float number7 = 0.0f;
		int number3 = 20;
		System.out.println("Float converted to float:" + Float.toString(number1));
		System.out.println("String to float:	" + Float.parseFloat(strNumber));
		// System.out.println("String to float: "+Float.parseFloat(strNumber1));
		System.out.println("float to wrapper class:	" + Float.valueOf(number1));
		System.out.println("float to wrapper class:	" + Float.valueOf(strNumber));
		System.out.println("sum of floats    :	" + Float.sum(number1, number2));
		System.out.println("Minimum of floats:	" + Float.min(number1, number2));
		System.out.println("Maximum of floats:	" + Float.max(number1, number2));
		System.out.println("Square root of float:" + Math.sqrt(number4));
		System.out.println("Float divide by float:" + (number6 / number7));
		System.out.println("converting folat to int :" + (int) number1);
		System.out.println("converting int to float:" + (float) number3);
	}
}
