package ru.exept_home;

public class Movie extends Event{
    public Movie(String title, int releaseYear, int age) {
        super(title, releaseYear, age);
    }

    /**
     * Создание фильмов
     * @return Movie[]
     */
    public static Movie[] getMovies(){
        return  new Movie[]{
                new Movie("Кино 1", 1995, 15),
                new Movie("Кино 2", 1997, 16),
                new Movie("Кино 3", 2000, 18),
                new Movie("Кино 4", 2010, 19),
        };
    }
}
