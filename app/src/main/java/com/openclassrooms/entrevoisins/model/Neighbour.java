package com.openclassrooms.entrevoisins.model;


import android.os.Parcel;
import android.os.Parcelable;

import java.util.Objects;

/**
 * Model object representing a Neighbour
 */
public class Neighbour implements Parcelable {


    private Integer id;
    private String name;
    private String avatarUrl;
    private String address;
    private String phone;
    private String facebook;
    private String about;
    private boolean favorite;


    /**
     * Constructor
     * @param id
     * @param name
     * @param avatarUrl
     */
    public Neighbour(Integer id, String name, String avatarUrl, String place, String phoneNumber, String facebook, String about) {
        this.id = id;
        this.name = name;
        this.avatarUrl = avatarUrl;
        this.address = place;
        this.phone = phoneNumber;
        this.facebook = facebook;
        this.about = about;
        this.favorite = false;
    }

    public boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    protected Neighbour(Parcel in) {
        if (in.readByte() == 0) {
            id = null;
        } else {
            id = in.readInt();
        }
        name = in.readString();
        avatarUrl = in.readString();
        address = in.readString();
        phone = in.readString();
        facebook = in.readString();
        about = in.readString();
    }

    public static final Creator<Neighbour> CREATOR = new Creator<Neighbour>() {
        @Override
        public Neighbour createFromParcel(Parcel in) {
            return new Neighbour(in);
        }


        @Override
        public Neighbour[] newArray(int size) {
            return new Neighbour[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (id == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(id);
        }
        dest.writeString(name);
        dest.writeString(avatarUrl);
        dest.writeString(address);
        dest.writeString(phone);
        dest.writeString(facebook);
        dest.writeString(about);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }





    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Neighbour neighbour = (Neighbour) o;
        return Objects.equals(id, neighbour.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int describeContents() {
        return 0;
    }


}