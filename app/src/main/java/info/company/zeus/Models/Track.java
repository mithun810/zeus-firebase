package info.company.zeus.Models;

import java.util.ArrayList;

/**
 * Created by prashanth on 3/25/17.
 */

public class Track {
    String Name;
    String Artist;
    String Album;
    long seek_value;
    ArrayList<String> upvotes;
    ArrayList<String> downvotes;
    String URL;

    public void addUpvote(String useremail){
        if(!upvotes.contains(useremail)) {
            upvotes.add(useremail);
            if(downvotes.contains(useremail))
                downvotes.remove(useremail);
        }
    }

    public void addDownvote(String useremail){
        if(!downvotes.contains(useremail)) {
            downvotes.add(useremail);
            if(upvotes.contains(useremail))
                upvotes.remove(useremail);
        }
    }

    public Track(String name, String artist, String album, String URL) {
        Name = name;
        Artist = artist;
        Album = album;
        seek_value = 0; //value in milliseconds
        this.upvotes = new ArrayList<>();
        this.downvotes = new ArrayList<>();
        this.URL = URL;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Track track = (Track) o;

        if (!Name.equals(track.Name)) return false;
        if (!Artist.equals(track.Artist)) return false;
        return Album.equals(track.Album);

    }

    @Override
    public int hashCode() {
        int result = Name.hashCode();
        result = 31 * result + Artist.hashCode();
        result = 31 * result + Album.hashCode();
        return result;
    }
}