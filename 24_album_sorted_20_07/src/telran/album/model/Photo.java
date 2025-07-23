package telran.album.model;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

public class Photo implements Comparable<Photo>{
    int albumld;
    int photold;
    String title;
    String url;
    LocalDateTime date;





    public void setUrl(String url) {
        this.url = url;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAlbumld() {
        return albumld;
    }

    public int getPhotold() {
        return photold;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Photo(int albumld, int photold, String title, String url, LocalDateTime date) {
        this.albumld = albumld;
        this.photold = photold;
        this.title = title;
        this.url = url;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "albumld=" + albumld +
                ", photold=" + photold +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Photo photo = (Photo) o;
        return albumld == photo.albumld && photold == photo.photold && Objects.equals(title, photo.title) && Objects.equals(url, photo.url) && Objects.equals(date, photo.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(albumld, photold);
    }

    @Override
    public int compareTo(Photo o) {
        return date.compareTo(o.date);
    }
}
