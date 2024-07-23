public class StringObject {
    public static void main(String[] args){
        // assign the array of character value in string;
        char[] messageChars = {'H','E', 'L', 'L', 'O'};

        // equivalent to i love you in ASCII code
        byte[] byteCodes= {73,32,108,111, 118, 101, 32, 121, 111, 117};
        String message = new String(messageChars);
        String byteMessage = new String(byteCodes);

        System.out.println(message);
        System.out.println(byteMessage);
    }
}
