
package com.example.pratik.arraylistproblem;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Description {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("qns")
    @Expose
    private String qns;
    @SerializedName("ans")
    @Expose
    private String ans;
    @SerializedName("place")
    @Expose
    private String place;
    @SerializedName("__v")
    @Expose
    private Integer v;

    /**
     * No args constructor for use in serialization
     *
     */
    public Description() {
    }

    /**
     *
     * @param id
     * @param v
     * @param qns
     * @param place
     * @param ans
     */
    public Description(String id, String qns, String ans, String place, Integer v) {
        super();
        this.id = id;
        this.qns = qns;
        this.ans = ans;
        this.place = place;
        this.v = v;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQns() {
        return qns;
    }

    public void setQns(String qns) {
        this.qns = qns;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

}
