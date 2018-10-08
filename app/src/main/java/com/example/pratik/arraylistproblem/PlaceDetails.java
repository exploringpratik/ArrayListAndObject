
package com.example.pratik.arraylistproblem;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class PlaceDetails {

    @SerializedName("descriptions")
    @Expose
    private List<Description> descriptions = null;
    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("imageURL")
    @Expose
    private String imageURL;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("overallDetails")
    @Expose
    private String overallDetails;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("updatedAt")
    @Expose
    private String updatedAt;
    @SerializedName("__v")
    @Expose
    private Integer v;

    /**
     * No args constructor for use in serialization
     *
     */
    public PlaceDetails() {
    }

    /**
     *
     * @param updatedAt
     * @param id
     * @param v
     * @param location
     * @param createdAt
     * @param name
     * @param longitude
     * @param latitude
     * @param overallDetails
     * @param imageURL
     * @param descriptions
     */
    public PlaceDetails(List<Description> descriptions, String id, String name, String location, String imageURL, String latitude, String longitude, String overallDetails, String createdAt, String updatedAt, Integer v) {
        super();
        this.descriptions = descriptions;
        this.id = id;
        this.name = name;
        this.location = location;
        this.imageURL = imageURL;
        this.latitude = latitude;
        this.longitude = longitude;
        this.overallDetails = overallDetails;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.v = v;
    }

    public List<Description> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<Description> descriptions) {
        this.descriptions = descriptions;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getOverallDetails() {
        return overallDetails;
    }

    public void setOverallDetails(String overallDetails) {
        this.overallDetails = overallDetails;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

}
