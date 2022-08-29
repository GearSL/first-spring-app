package kz.ibr.spring;

import java.util.ArrayList;
import java.util.List;

public class GenreList {
    List<Music> genreList = new ArrayList<>();

    public void addMusicGenre(Music music) {
        this.genreList.add(music);
    }
    public List<Music> getGenreList() {
        return this.genreList;
    }
}
