public class Test {

    public static void main(String[] args){

        // ExecutePrimitiveData();
        RemainderUsage();

        
    }

    private static void ExecutePrimitiveData(){
        // Data Types (Primitive)
        byte byteData = 123;
        short shortData = 12345;
        char charData = 38;
        int intData = 1234567890;
        long longData = 12312412412123l;
        double doubleNumber = 10.123456;
        float floatNumber = 10.123456789012345f;
        boolean booleanData = true;

        
        logger("byteData: " + byteData);
        logger("shortData: " + shortData);
        logger("charData: " + charData);
        logger("intData: " + intData);
        logger("longData: " + longData);
        logger("doubleNumber: " + doubleNumber);
        logger("floatNumber: " + floatNumber);
        logger("booleanData: " + booleanData);
    }

    private static void ExecuteNonPrimitiveData(){
        String stringData = "Hello , I am String Data";
        // Object objectData = {}
    }

    private static void RemainderUsage() {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i % arr.length]);
        }
    }



    // function for logging a message
    private static void logger(String message){
        System.out.println(message);
    }
}
