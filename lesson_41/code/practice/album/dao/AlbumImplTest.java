package practice.album.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.album.model.Photo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AlbumImplTest {

    Album album;
    Photo[]ph;
    LocalDateTime now=LocalDateTime.now();

    @BeforeEach
    void setUp() {
        album= new AlbumImpl(7);
        ph= new Photo[6];
        ph[0]=new Photo(1,1,"ph1","url1",now.minusDays(1));
        ph[1]=new Photo(1,2,"ph2","url2",now.minusDays(2));
        ph[2]=new Photo(1,3,"ph3","url3",now.minusDays(3));
        ph[3]=new Photo(2,1,"ph4","url4",now.minusDays(4));
        ph[4]=new Photo(2,2,"ph5","url5",now.minusDays(5));
        ph[5]=new Photo(2,3,"ph6","url6",now.minusDays(6));
        for (int i = 0; i < ph.length; i++) {
            album.addPhoto(ph[i]);
        }
    }

    @Test
    void addPhoto() {
    assertFalse(album.addPhoto(null));
    assertFalse(album.addPhoto(ph[1]));
    Photo photo= new Photo(3,1,"ph7","url7",now);
    assertTrue(album.addPhoto(photo));
    assertEquals(7,album.size());
    Photo photo1= new Photo(3,2,"ph8","url8",now);
    assertFalse(album.addPhoto(photo1));
    }

    @Test
    void removePhoto() {
        assertTrue(album.removePhoto(1,2));
        assertFalse(album.removePhoto(4,2));
        assertEquals(5,album.size());
        assertNull(album.getPhotoFromAlbum(1,2));//проверили, что вернется пустая ссылка
    }

    @Test
    void updatePhoto() {
        assertTrue(album.updatePhoto(1,1,"new url"));
        assertEquals("new url",album.getPhotoFromAlbum(1,1).getUrl());//проверили, что обновился url
    }

    @Test
    void getPhotoFromAlbum() {
        assertEquals(ph[4],album.getPhotoFromAlbum(2,2));
        assertNull(album.getPhotoFromAlbum(7,7)); //ищем несуществующее фото
    }

    @Test
    void getAllPhotosFromAlbum() {
        Photo[]actual=album.getAllPhotosFromAlbum(1);
        Photo[]exp={ph[0], ph[1], ph[2]};
        Arrays.sort(actual);
        assertArrayEquals(exp,actual);
    }

    @Test
    void getPhotosBetweenDate() {
        LocalDate ld=now.toLocalDate(); //завели переменную относительно сегодняшней даты; округлили до даты (убрали время)
        Photo[]actual=album.getPhotosBetweenDate(ld.minusDays(1),ld.minusDays(4));
        Arrays.sort(actual);
        Photo[]exp={ph[0],ph[1],ph[2]};
        assertArrayEquals(exp,actual);
    }

    @Test
    void size() {
        assertEquals(6,album.size());
    }
}