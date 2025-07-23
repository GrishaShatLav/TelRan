package telran.album.dao;


import telran.album.model.Photo;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;


public class AlbumImpl implements Album {


    private Photo[] photos;
    private int size;


    public AlbumImpl(int capacity) {
        photos = new Photo[capacity];
    }


    @Override
    public boolean addPhoto(Photo photo) {
        if (size == photos.length || photo == null
                || getPhotoFromAlbum(photo.getPhotold(), photo.getAlbumld()) != null) {
            return false;
        }
        int index = Arrays.binarySearch(photos, 0, size, photo);
        index = index < 0 ? -index - 1 : index;
        System.arraycopy(photos, index, photos, index + 1, size - index);
        photos[index] = photo;
        size++;
        return true;
    }


    @Override
    public boolean removePhoto(int photoId, int albumId) {
        Photo pattern = new Photo(albumId, photoId, null, null, null);
        for (int i = 0; i < size; i++) {
            if (photos[i].equals(pattern)) {
                System.arraycopy(photos, i + 1, photos, i, size - i - 1);
                photos[--size] = null;
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean updatePhoto(int photoId, int albumId, String url) {
        Photo photo = getPhotoFromAlbum(photoId, albumId);
        if (photo == null) {
            return false;
        }
        photo.setUrl(url);
        return true;
    }


    @Override
    public Photo getPhotoFromAlbum(int photoId, int albumId) {
        Photo pattern = new Photo(albumId, photoId, null, null, null);
        for (int i = 0; i < size; i++) {
            if (photos[i].equals(pattern)) {
                return photos[i];
            }
        }
        return null;
    }


    @Override
    public Photo[] getAllPhotoFromAlbum(int albumId) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (Objects.equals(photos[i].getAlbumld(), albumId)) {
                count++;
            }
        }
        int index = 0;
        Photo[] right = new Photo[count];
        for (int i = 0; i < size; i++) {
            if (Objects.equals(photos[i].getAlbumld(), albumId)) {
                right[index] = photos[i];
                index++;
            }

        }

        if (right.length == 0) {
            return null;
        }
        return right;
    }


    @Override
    public Photo[] getPhotoBetweenDate(LocalDate dateFrom, LocalDate dateTo) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            LocalDate date = LocalDate.from(photos[i].getDate());
            if ((date.isEqual(dateFrom) || date.isAfter(dateFrom)) &&
                    (date.isEqual(dateTo) || date.isBefore(dateTo))) {
                count++;
            }
        }

        if (count == 0) {
            return null;
        }

        Photo[] result = new Photo[count];
        int index = 0;

        for (int i = 0; i < size; i++) {
            LocalDate date = LocalDate.from(photos[i].getDate());
            if ((date.isEqual(dateFrom) || date.isAfter(dateFrom)) &&
                    (date.isEqual(dateTo) || date.isBefore(dateTo))) {
                result[index++] = photos[i];
            }
        }

        return result;
    }


    @Override
    public int size() {
        return size;
    }
}

