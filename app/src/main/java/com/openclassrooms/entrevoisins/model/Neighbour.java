package com.openclassrooms.entrevoisins.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Objects;

/**
 * Model object representing a Neighbour
 */
public class Neighbour implements Parcelable {

    /** Identifier */
    private Integer id;

    /** Full name */
    private String name;

    /** Avatar */
    private String avatarUrl;

    /** Favorite */
    private boolean favorite;

    /** address */
    private String address;

    /** telephone number */
    private String telephoneNumber;

    /** facebook */
    private String facebook;

    /** explanatory text */
    private String explanatoryText;

    /**
     * Constructor
     * @param id
     * @param name
     * @param avatarUrl
     */
    public Neighbour(Integer id,
                     String name,
                     String avatarUrl,
                     boolean favorite,
                     String address,
                     String telephoneNumber,
                     String facebook,
                     String explanatoryText
    ){
        this.id = id;
        this.name = name;
        this.avatarUrl = avatarUrl;
        this.favorite = favorite;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.facebook = facebook;
        this.explanatoryText = explanatoryText;
    }

    protected Neighbour (Parcel in) {
        this.id = in.readInt();
        this.name = in.readString();
        this.avatarUrl = in.readString();
        this.favorite = in.readInt() == 1;
        this.address = in.readString();
        this.telephoneNumber = in.readString();
        this.facebook = in.readString();
        this.explanatoryText = in.readString();
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

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(name);
        dest.writeString(avatarUrl);
        if (favorite){
            dest.writeInt(1);
        } else {
            dest.writeInt(0);
        }
        dest.writeString(address);
        dest.writeString(telephoneNumber);
        dest.writeString(facebook);
        dest.writeString(explanatoryText);
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getFacebook() {
        return facebook;
    }

    public String getExplanatoryText() {
        return explanatoryText;
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

    public String getAvatarUrl() {
        return avatarUrl;
    }

}
