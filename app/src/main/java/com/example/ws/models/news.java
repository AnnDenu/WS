package com.example.ws.models;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;

import androidx.annotation.NonNull;

public class news  implements Parcelable{
    int id;

    String name, description, price, image;

    protected news (Parcel in){
    id = in.readInt();
    name = in.readString();
    description = in.toString();
    price = in.readString();
    image = in.readString();
    }

//Конструктор
    public news(int id, String name, String description, String price, String image) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
    }

    public static final Parcelable.Creator<news> CREATOR = new Parcelable.Creator<news>() {
        @Override
        public news createFromParcel(Parcel in) {
            return new news(in);
        }

        @Override
        public news[] newArray(int size) {
            return new news[size];
        }
    };

    //Геттер и Сеттер
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {

    }
}
