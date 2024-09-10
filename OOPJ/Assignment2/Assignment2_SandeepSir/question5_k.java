public class question5_k {  
    public static void main(String[] args) {          
        long i = 7;  
        System.out.println("Number = " + i);  
        //returns the string representation of the Long value in binary form  
        System.out.println("Binary representation is = " + Long.toBinaryString(i));
      //returns the string representation of the Long value in Octal form 
        System.out.println("Octal representation is = " + Long.toOctalString(i));
      //returns the string representation of the Long value in Hexadecimal form 
        System.out.println("Hexadecimal representation is = " + Long.toHexString(i));
        
    }  
}  