package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Director director1 = new Director("Datka Mamatzhanova");
        List<Cast> castList1 = new ArrayList<>();
        castList1.add(new Cast("Gulnur", "bride"));
        castList1.add(new Cast("Manas", "groom"));
//-------------------------------------------------------------------------------


        Director director2 = new Director("Joanne Rowling");
        List<Cast> castList2 = new ArrayList<>();
        castList2.add(new Cast("Daniel Radcliffe", "Harry Potter"));
        castList2.add(new Cast("Emma Watson", "Hermione Granger"));

//-------------------------------------------------------------------------------

        Director director3 = new Director("James Cameron");
        List<Cast> castList3 = new ArrayList<>();
        castList3.add(new Cast("Leonardo DiCaprio", "Jack Dawson"));
        ;
        castList3.add(new Cast("Kate Winslet", "Rose Dewitt Bukater"));
//--------------------------------------------------------------------------------

        Director director4 = new Director("Kim Eun-hee");
        List<Cast> castList4 = new ArrayList<>();
        castList4.add(new Cast("Bae Yong-joon", "Kang Joon-sang"));
        castList4.add(new Cast("Choi Ji-woo", "Jeong Yoo-jin"));
        castList4.add(new Cast("Park Yong-ha", "Kim Sang-hyuk"));
        castList4.add(new Cast("Park Sol-mi", "Oh Chae-rin"));
        //---------------------------------------------------------------

        Director director5 = new Director("Park Hye-kyung");
        List<Cast> castList5 = new ArrayList<>();
        castList5.add(new Cast("Choi Ji-woo", "Han Jung Seo"));
        castList5.add(new Cast("Kim Tae Hee", "Han Yu Ri"));
//---------------------------------------------------------------------

        Director director6 = new Director("James Cameron");
        List<Cast> castList6 = new ArrayList<>();
        castList6.add(new Cast("Michelle Rodriguez", "Trudy Chacon"));
        castList6.add(new Cast("Zoe Saldana", "as Neytiri"));
        //--------------------------------------------------------

        Director director7 = new Director("Kim Eun-hee");
        List<Cast> castList7 = new ArrayList<>();
        castList7.add(new Cast("Kim So hyun", "Ko Eun byul"));
        castList7.add(new Cast("Zoe Saldana", "Trudy Chacon"));
//----------------------------------------------------------------------

        Director director8 = new Director("Aijzmal Asangazieva");
        List<Cast> castList8 = new ArrayList<>();
        castList8.add(new Cast("Datka", "Daty"));
        castList8.add(new Cast("Gulzhan", "Guljan eje"));
        castList8.add(new Cast("Zhaulanbek", "Zhaulan"));
        castList8.add(new Cast("Nurdin", "Kadyrov"));
        castList8.add(new Cast("Dastan", "Arzymatov"));


        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("Wedding story", 2020, "Drama", director1, castList1));
        movieList.add(new Movie("Harry Potter", 2001, "Fantastic", director2, castList2));
        movieList.add(new Movie("Titanic", 1997, "Drama", director3, castList3));
        movieList.add(new Movie("Winter sonata", 2002, "Drama,love story,TV series", director4, castList4));
        movieList.add(new Movie("Stairway to Heaven", 2003, "TV series", director5, castList5));
        movieList.add(new Movie("Avatar", 2009, "Fantasric", director6, castList6));
        movieList.add(new Movie("The call", 2022, "Action", director7, castList7));
        movieList.add(new Movie("Bad guys", 2022, "Action", director8, castList8));


        //------------------------------------------------------------------------

        FindAble findAble = new FindClass();
        SortAble sortAble = new SortClass();


        while (true) {
            System.out.println("~~~~~~~~~~~~~~~~COMANDS~~~~~~~~~~~~~~~~");
            System.out.println("Press 1 to find by movie's name");
            System.out.println("Press 2 to find by year");
            System.out.println("Press 3 to find by movie's description");
            System.out.println("Press 4 to find by director's name");
            System.out.println("Press 5 to find by actor's name");
            System.out.println("Press 6 to find by actor's role");
            System.out.println("Press 7 to sort movie by name");
            System.out.println("Press 8 to sort movie by year");
            System.out.println("Press 9 to sort movie by director");
            System.out.println("Press 10 to sort movie by actor name");
            System.out.println("Press 11 to print full movie's sorted by name");
            System.out.println("Press 12 to print full movie's sorted by years");

            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    findAble.findMovieByName(movieList);
                    break;

                case 2:
                    findAble.findMovieByYear(movieList);
                    break;

                case 3:
                    findAble.findMovieByDescription(movieList);
                    break;

                case 4:
                    findAble.findMovieByDirectorName(movieList);
                    break;

                case 5:
                    findAble.findMovieByActorName(movieList);
                    break;

                case 6:
                    findAble.findMovieByRole(movieList);
                    break;

                case 7:
                    sortAble.sortByMoviesName(movieList);
                    break;

                case 8:
                    sortAble.sortByYear(movieList);
                    break;

                case 9:
                    sortAble.sortByDirectorName(movieList);
                    break;

                case 10:
                    sortAble.sortByActorName(movieList);
                    break;

            }
        }

    }
}
