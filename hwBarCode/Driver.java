public class Driver{
    public static void main(String[]args){
	BarCode b1 = new BarCode("11231");
        BarCode b2 = new BarCode(b1);
	System.out.println(b1);
	System.out.println(b2);
	System.out.println(b1.equals(b2));
	System.out.println(b1.compareTo(b2));
	BarCode b3 = new BarCode("10012");
	System.out.println(b1.equals(b3));
	System.out.println(b1.compareTo(b3));
    }
}