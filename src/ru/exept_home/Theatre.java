package ru.exept_home;

public class Theatre extends Event{
    public Theatre(String title, int releaseYear, int age) {
        super(title, releaseYear, age);
    }

    /**
     * Создание фильмов
     * @return Movie[]
     */
    public static Theatre[] getTheatres(){
        return  new Theatre[]{
                new Theatre("Театр 1", 0, 15),
                new Theatre("Театр 2", 1997, 16),
                new Theatre("Театр 3", 2000, 18),
                new Theatre("Театр 4", 2010, 19),
        };
    }
}
