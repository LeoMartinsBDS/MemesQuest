package oieee;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Leonardo
 */
public class musica {

    private Clip clip;

    public Clip getClip() {
        return clip;
    }

    public void setClip(Clip clip) {
        this.clip = clip;
    }

    public void playSound(String soundName) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            System.out.println("Erro ao executar SOM!" + ex.getMessage());
        }
    }

    public void stop() {
        if (clip.isRunning()) {
            clip.stop();
        }

    }

    public void errou(String faustão) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(faustão).getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            System.out.println("Erro ao executar SOM!" + ex.getMessage());
        }
    }
    
    public void lowsound(String baixo){
    try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(baixo).getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            FloatControl gainControl
                    = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(-10.0f);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            System.out.println("Erro ao executar SOM!" + ex.getMessage());
        }
    }
    
    
}


