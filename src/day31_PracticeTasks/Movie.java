package day31_PracticeTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {

    public String country,title, genre, releaseDate, director;
    public ArrayList<String> casts = new ArrayList<>();

    public Movie(String country, String title, String releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.releaseDate = releaseDate;
        this.director = director;
    }

    public void addCast(String str){
        casts.add(str);
    }

    public void addCasts(String[] array){
        casts.addAll(Arrays.asList(array));
    }

    @Override
    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", total number of size =" + casts.size() +
                '}';
    }
}




// public ArrayList<Tester> testersList = new ArrayList<>();