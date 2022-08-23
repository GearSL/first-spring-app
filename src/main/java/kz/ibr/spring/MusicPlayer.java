package kz.ibr.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private final Music rockMusic;
    private final Music classicalMusic;
    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music rockMusic, @Qualifier("classicalMusic") Music classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }

    public String playMusic(MusicalGenres genre) {
        //Реализация №1 через IF
//        Random random = new Random();
//        int songId = random.nextInt(classicalMusic.getSong().length);
//        if(genre == MusicalGenres.CLASSICAL){
//            return classicalMusic.getSong()[songId];
//        }
//        return rockMusic.getSong()[songId];

        //Реализация №2 через switch
        switch (genre) {
            case ROCK -> {
                Random random = new Random();
                int songId = random.nextInt(rockMusic.getSong().length);
                return rockMusic.getSong()[songId];
            }
            case CLASSICAL -> {
                Random random = new Random();
                int songId = random.nextInt(classicalMusic.getSong().length);
                return classicalMusic.getSong()[songId];
            }
            default -> {
                return "Can't find music genre";
            }
        }
    }
}
