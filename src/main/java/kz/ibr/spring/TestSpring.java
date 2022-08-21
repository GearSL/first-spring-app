package kz.ibr.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Music rockMusic = context.getBean("rockMusic", Music.class);
        Music classicalMusic = context.getBean("classicalMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer();

        musicPlayer.setMusic(rockMusic);
        musicPlayer.playMusicList();
        musicPlayer.setMusic(classicalMusic);
        musicPlayer.playMusicList();

        context.close();
    }
}
