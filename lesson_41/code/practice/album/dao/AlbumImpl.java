package practice.album.dao;

import practice.album.model.Photo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class AlbumImpl implements Album {

    static Comparator<Photo>comparator=(p1,p2)->{
        int res=p1.getDate().compareTo(p2.getDate());
        return res!=0 ? res : Integer.compare(p1.getPhotoId(), p2.getPhotoId());
    };

    private Photo[] photos;
    private int size;

    public AlbumImpl(int capacity){
        photos=new Photo[capacity];
    } //конструктор, задающий новый массив

    @Override
    public boolean addPhoto(Photo photo) {  // если фото нулевое, если уже нет места в альбоме и если фото уже существует
        if(photo==null || size== photos.length || getPhotoFromAlbum(photo.getAlbumId(),photo.getPhotoId())!=null){
            return false;
        }
        //пытаемся найти место для нашей фотки с помощью бинарного поиска
        //скорее всего положительный готовый индекс не найдется, и бинарный поиск выдаст отрицательный результат,
        //т.е. возможное место для фотки с отрицательным знаком и без 1

        int ind= Arrays.binarySearch(photos,0,size,photo,comparator);
        ind= ind>=0 ? ind: -ind-1;
        System.arraycopy(photos,ind,photos,ind+1,size-ind);
        photos[ind]=photo;
        size++;
        return true;
    }

    @Override
    public boolean removePhoto(int albumId, int photoId) {
        for (int i = 0; i < size; i++) {
            if(photos[i].getPhotoId() == photoId && photos[i].getAlbumId() == albumId){
                System.arraycopy(photos,i+1,photos,i,size-i-1);
                photos[--size]=null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updatePhoto(int albumId, int photoId, String url) {
        Photo photo=getPhotoFromAlbum(albumId,photoId);
        if (photo==null){
            return false;
        }
        photo.setUrl(url);
        return true;
    }

    @Override
    public Photo getPhotoFromAlbum(int albumId, int photoId) {
        Photo pattern= new Photo(albumId,photoId,null,null,null);
        for (int i = 0; i < size; i++) {
            if (photos[i].equals(pattern)){
                return photos[i];
            }
        }
        return null;
    }

    @Override
    public Photo[] getAllPhotosFromAlbum(int albumId) {
        return findByPredicate(p-> p.getAlbumId()==albumId); //нас устроят р, у которых albumId совпадают
    }

    private Photo[]findByPredicate(Predicate<Photo> predicate){
        Photo[]res=new Photo[size];
        int j=0;                   //счетчик найденных в альбоме фото
        for (int i = 0; i < size; i++) {
            if (predicate.test(photos[i])){
                res[j]=photos[i];
                j++;
            }
        }
        return Arrays.copyOf(res,j); //вернули обрезанный массив (без нулей)
    }

    @Override
    public Photo[] getPhotosBetweenDate(LocalDate dateFrom, LocalDate dateTo) {
        Photo pattern = new Photo(0, Integer.MIN_VALUE, null, null, dateFrom.atStartOfDay()); // вводим объектную переменную
        int from = -Arrays.binarySearch(photos, 0, size, pattern, comparator) -1; // находим индекс начального фото (левый край)
        //        from = from >= 0 ? from : -from - 1;
        pattern = new Photo(0, Integer.MAX_VALUE, null, null, LocalDateTime.of(dateTo, LocalTime.MAX)); // находим правый край
        int to = -Arrays.binarySearch(photos, 0, size, pattern, comparator) - 1;
        //        to = to >= 0 ? to : -to - 1;
        return Arrays.copyOfRange(photos, from, to); // Range - диапазон, создаем новый массив с нужными фото

    }

    @Override
    public int size() {
        return size;
    }

}
