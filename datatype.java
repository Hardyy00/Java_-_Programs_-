public class datatype{
    public static void main(String[] args){
        int var_int_max = Integer.MAX_VALUE;
        int var_int_min = Integer.MIN_VALUE;
        System.out.println("Maximum value of int = " + var_int_max);
        System.out.println("Minimum value of int = " + var_int_min);

        byte Byte_var_max = Byte.MAX_VALUE;
        byte Byte_var_min = Byte.MIN_VALUE;
        System.out.println("Maximum Value of Byte = " + Byte_var_max);
        System.out.println("Minimum Value of Byte = " + Byte_var_min);

        short Short_var_max = Short.MAX_VALUE;
        short Short_var_min = Short.MIN_VALUE;
        System.out.println("Maximum Value of Short = " + Short_var_max);
        System.out.println("Minimum Value of Short = " + Short_var_min);

        long Long_var_max = Long.MAX_VALUE;
        long Long_var_min = Long.MIN_VALUE;
        System.out.println("Maximum Value of Long = " + Long_var_max);
        System.out.println("Minimum Value of Long = " + Long_var_min);

        int a = var_int_max /2 ;
        byte b = (byte)(Byte_var_min/2);
        short c = (short)(Short_var_min/2);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}