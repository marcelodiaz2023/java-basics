import java.util.Random;

public class BookNumber {
    private String ISBN;

    public BookNumber(){
        this.ISBN = GenerateIsbnCode();
    }
    
    public String code(){
        return this.ISBN;
    }

    private String GenerateIsbnCode(){
        Random rand = new Random();
        int eanPrefix = rand.nextInt(900)+100;
        int registrationGroup = rand.nextInt(90)+10;
        int registrant = rand.nextInt(89999)+10000;
        int publication = rand.nextInt(89)+10;
        int checkDigit = rand.nextInt(9)+1;

        return String.format("%s-%s-%s-%s-%s", eanPrefix, registrationGroup, registrant, publication, checkDigit);

    }
}