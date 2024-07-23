

public class Television {
       private int channel;
       private int volume;

       public int getVolume()
       {
              return this.volume;
       }

       public int getChannel()
       {
              return this.channel;
       }
       
       public void changeChannel(int newChannel)
       {
        this.channel = newChannel;
       };

       public void changeVolume(int newVolume)
       {
        this.volume = newVolume;
       }
}
