public class StringMethods {
    public static void main(String[] args){
        String message = "Java is fun";
        System.out.println("message.length() - "+message.length());
        System.out.println("message.toUpperCase() - "+message.toUpperCase());
        System.out.println("message.toLowerCase() - "+message.toLowerCase());
        System.out.println("message.trim() - "+message.trim());
        System.out.println("message.substring(0, 3) - "+message.substring(0, 3));
        System.out.println("message.substring(8) - "+message.substring(8));
        System.out.println("message.replace() - "+message.replace("fun", "challenging"));
        System.out.println("message.startsWith() - "+message.startsWith("Java"));
        System.out.println("message.endsWith() - "+message.endsWith("Java"));
        System.out.println("message.charAt(0) - "+message.charAt(0));
        System.out.println("message.indexOf(\"fun\") - "+message.indexOf("fun"));
        System.out.println("message.lastIndexOf(\"a\") - "+message.lastIndexOf("a"));
        System.out.println("message.equals(\"Java is fun\") - "+message.equals("java is fun"));
        System.out.println("message.equalsIgnoreCase(\"java is fun\") - "+message.equalsIgnoreCase("java is fun"));
        System.out.println("message.compareTo(\"Java is fun\") - "+message.compareTo("java is fun"));
        System.out.println("String.valueOf(true) - "+String.valueOf(true));
    }   
}
