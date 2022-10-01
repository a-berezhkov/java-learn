package ru.poly;

public class Song {
    private boolean[][] tracks;
    private Instrument[] instruments;

    public Song(boolean[][] tracks, Instrument[] instruments){
        this.tracks  = tracks;
        this.instruments = instruments;
    }

    public void play(){
        /**  Инструмент
         *   0 1 3 4 5
         * в f f t f t
         * р f f f f f
         * е
         * м
         * я
         *
         */

        for(int time = 0; time < tracks.length; time++){
            boolean[] shouldPlay = tracks[time];
            for (int i = 0; i < instruments.length; i++){
                Instrument instrument = instruments[i];
                if (shouldPlay[i]){
                    System.out.print(" " + instrument.play() + " ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();

        }
    }

}
