package com.song.respstatus.domain;

public class City {
    private Long id;
    private Long province_Id;
    private String city_name;
    private String description;

    public Long getProvince_Id() {
        return province_Id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setProvince_Id(Long province_Id) {
        this.province_Id = province_Id;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }



    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
