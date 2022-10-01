package ru.poly;

public class Main {
    public static void main(String[] args) {
       /*
       x y -
       x - -
       x - -
       x - -
       x y z
        */
        boolean[][] tracks = {
                {false, true, true},
                {true, false, true},
                {true, true, true},
                {true, true, false},
                {false, true, false}
        };
        Instrument[] instruments = {
                new Piano(),
                new Flute(),
                new Guitar()
        };
        Song song = new Song(tracks, instruments);
        song.play();
    }
}
