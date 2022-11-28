package day31_PracticeTasks;

import java.util.Arrays;

public class MoviesObject {

    public static void main(String[] args) {

        Movie movie1 = new Movie("USA", "Journey to SDET: Cydeo Batch 25", "10/25/2021","Kuzzat Altay" );

        movie1.addCast("Asiya");

        String[] casts = {"Ahmet", "Kardo", "Kuzen"};

        movie1.addCasts(casts);

        System.out.println(movie1);


    }



}
