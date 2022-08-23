package kz.ibr.spring;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
    String[] playlist = {"Hungarian Rhapsody", "Symphony No. 4", "Stars and Stripes Forever"};
    @Override
    public String[] getSong() {
        return playlist;
    }
}
