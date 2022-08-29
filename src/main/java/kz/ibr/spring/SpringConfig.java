package kz.ibr.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }
    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }
    @Bean
    public JazzMusic jazzMusic(){
        return new JazzMusic();
    }

    @Bean
    public GenreList genreList(){
        return new GenreList();
    }

    @Bean
    public MusicPlayer musicPlayer(GenreList genreList){
        return new MusicPlayer(genreList);
    }

    @Bean
    public Computer computer(MusicPlayer musicPlayer){
        return new Computer(musicPlayer);
    }
}
