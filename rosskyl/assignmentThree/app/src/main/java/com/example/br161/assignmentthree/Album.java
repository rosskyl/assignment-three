package com.example.br161.assignmentthree;

/**
 * Created by al1694bc on 3/30/2015.
 */
public class Album {

    private String title;

    private String artist;

    private String publisher;

    private String genre;

    private String albumCoverName;

    private int numTracks;

    private int year;


    public Album(String title, String artist, String publisher, String genre,
                 String albumCoverName, int numTracks, int year) {

        this.title = title;
        this.artist = artist;
        this.publisher = publisher;
        this.genre = genre;
        this.albumCoverName = albumCoverName;
        this.numTracks = numTracks;
        this.year = year;
    }//end Album method

    public String getTitle() {

        return title;
    }//end getName method

    public String getArtist() {

        return artist;
    }//end getArtist method

    public String getPublisher() {

        return publisher;
    }//end getPublisher method

    public String getGenre() {

        return genre;
    }//end getGenre method

    public String getAlbumCoverName() {
        return albumCoverName;
    }//end getAlbumCoverName

    public int getNumTracks() {

        return numTracks;
    }//end getNumTracks method

    public int getYear() {

        return year;
    }//end getYear method
}//end Album class
