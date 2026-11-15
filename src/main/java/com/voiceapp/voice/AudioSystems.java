package com.voiceapp.voice;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Mixer;

public class AudioSystems {
    public static String getAudioSystem() {
        Mixer.Info[] mixers = AudioSystem.getMixerInfo();

        String text = "Audio Systems:\n";
        for (Mixer.Info mixerInfo : mixers) {
            text += mixerInfo.getName()  + "\n";
            
            if (mixer.getTargetLineInfo().length > 0) {
                text.append(info.getName());
            }
        }
        return text;
    }
    public static void main(String[] args) {
        System.out.println(getAudioSystem());
    }
}
