
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class Sound {
    public static void playSound(String local) {  
    try {  
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(local).getAbsoluteFile());  
        Clip clip = AudioSystem.getClip();  
        clip.open(audioInputStream);  
        clip.start();  
    } catch (Exception ex) {  
        System.out.println("NÃO ENCONTROU ARQUIVO!");  
        ex.printStackTrace();  
    }  
}  
}
