
public class Classes {
    public static void main(String[] args){
        Television t = new Television();
        t.changeChannel(12);
        t.changeVolume(30);

        System.out.println(t.getChannel());
        System.out.println(t.getVolume());
    }
}
