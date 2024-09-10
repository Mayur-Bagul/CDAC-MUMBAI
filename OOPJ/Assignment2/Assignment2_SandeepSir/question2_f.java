public class question2_f {  
    public static void main(String[] args) {  
        String strNumber="Ab12Cd3";  
        //returns the value of string to this Byte as a byte  
        byte b2=Byte.parseByte(strNumber);  
        System.out.println(b2);  // throw a NumberFormatException
    }  
}  