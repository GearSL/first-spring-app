package kz.ibr.spring;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private final GenreList genreList;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public MusicPlayer(GenreList genreList) {
        this.genreList = genreList;
    }

    public String playMusic() {
        List<Music> genreList = this.genreList.getGenreList();
        Random random = new Random();
        int genreIndex = random.nextInt(genreList.size());
        Music musicGenre = genreList.get(genreIndex);
        return "Playing: " + musicGenre.getSong();
    }
}
