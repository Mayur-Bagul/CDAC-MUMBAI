public class question3_f {  
    public static void main(String[] args) {  
        String strNumber="Ab12Cd3";  
        //returns the value of string to this Short as a short
        short b2=Short.parseShort(strNumber);  
        System.out.println(b2);  // throw a NumberFormatException
    }  
}  