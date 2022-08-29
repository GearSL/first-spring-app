package kz.ibr.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        GenreList genreList = context.getBean("genreList", GenreList.class);
        genreList.addMusicGenre(context.getBean("classicalMusic", ClassicalMusic.class));
        genreList.addMusicGenre(context.getBean("rockMusic", RockMusic.class));
        genreList.addMusicGenre(context.getBean("jazzMusic", JazzMusic.class));

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
    }
}
