package mypack;

public class JavaAllDatatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Byte byteObj = Byte.valueOf((byte)127);
		        Short shortObj = Short.valueOf((short)32000);
		        Integer intObj = Integer.valueOf(100000);
		        Long longObj = Long.valueOf(10000000000L);
		        Float floatObj = Float.valueOf(3.14f);
		        Double doubleObj = Double.valueOf(12345.6789);
		        Character charObj = Character.valueOf('J');
		        Boolean boolObj = Boolean.valueOf(true);

		        // Displaying values
		        System.out.println("Byte value: " + byteObj);
		        System.out.println("Short value: " + shortObj);
		        System.out.println("Integer value: " + intObj);
		        System.out.println("Long value: " + longObj);
		        System.out.println("Float value: " + floatObj);
		        System.out.println("Double value: " + doubleObj);
		        System.out.println("Character value: " + charObj);
		        System.out.println("Boolean value: " + boolObj);
	
	}

}
