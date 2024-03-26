package com.simpleform.model;

import jakarta.persistence.*;

import java.util.Objects;
@Entity
@Table(name="book_table")
public class BookModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String kitapadi;
    String kitapyazari;
    String yayinevi;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKitapadi() {
        return kitapadi;
    }

    public void setKitapadi(String kitapadi) {
        this.kitapadi = kitapadi;
    }

    public String getKitapyazari() {
        return kitapyazari;
    }

    public void setKitapyazari(String kitapyazari) {
        this.kitapyazari = kitapyazari;
    }

    public String getYayinevi() {
        return yayinevi;
    }

    public void setYayinevi(String yayinevi) {
        this.yayinevi = yayinevi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookModel bookModel = (BookModel) o;
        return Objects.equals(id, bookModel.id) && Objects.equals(kitapadi, bookModel.kitapadi) && Objects.equals(kitapyazari, bookModel.kitapyazari) && Objects.equals(yayinevi, bookModel.yayinevi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, kitapadi, kitapyazari, yayinevi);
    }


}
