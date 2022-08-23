package kz.ibr.spring;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    String[] playlist = {"Wind Cries", "Rock That Body", "Jailhouse Rock"};
    @Override
    public String[] getSong() {
        return playlist;
    }
}
