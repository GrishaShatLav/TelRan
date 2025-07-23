package telran.album.dao;

import telran.album.model.Photo;

import java.time.LocalDate;

public interface Album {

    boolean addPhoto(Photo photo);
    boolean removePhoto(int photold, int albumld);
    boolean updatePhoto(int photold, int albumld, String url);
    Photo getPhotoFromAlbum(int photold, int albumld);
    Photo[] getAllPhotoFromAlbum(int albumld);
    int size();
    Photo[] getPhotoBetweenDate(LocalDate dateFrom, LocalDate dateTo);



}
