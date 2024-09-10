public class question7_m {
	public static void main(String[] args) {
		String strNumber = "11.99";
		String strNumber1 = "Ab12Cd3";
		double number1 = 112.3;
		double number2 = 984.5;
		double number4 = -25.0;
		double number6 = 0.0;
		double number7 = 0.0;
		int number3 = 20;
		System.out.println("Double converted to double:" + Double.toString(number1));
		System.out.println("String to double:	" + Float.parseFloat(strNumber));
		// System.out.println("String to double: "+Double.parseDouble(strNumber1));
		System.out.println("double to wrapper class:	" + Double.valueOf(number1));
		System.out.println("double to wrapper class:	" + Float.valueOf(strNumber));
		System.out.println("sum of double    :	" + Double.sum(number1, number2));
		System.out.println("Minimum of double:	" + Double.min(number1, number2));
		System.out.println("Maximum of double:	" + Double.max(number1, number2));
		System.out.println("Square root of double:" + Math.sqrt(number4));
		System.out.println("Float divide by double:" + (number6 / number7));
		System.out.println("converting double to int :" + (int) number1);
		System.out.println("converting int to double:" + (double) number3);
	}
}
