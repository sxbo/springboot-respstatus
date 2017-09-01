package com.song.respstatus.dao;

import com.song.respstatus.domain.City;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


import java.util.List;

public interface CityDao {

    @Select("SELECT * FROM city")
    List<City> findAllCity();

    @Select("SELECT * FROM city WHERE id = #{id}")
    City findById(Long id);

    @Insert("INSERT INTO city(province_Id,city_name,description) VALUES (#{province_Id},#{city_name},#{description})")
    Long saveCity(City city);

    @Update("UPDATE city SET province_Id=#{province_Id},city_name=#{city_name},description=#{description} WHERE id =#{id}")
    Long updateCity(City city);

    @Delete("DELETE FROM city WHERE id =#{id}")
    Long deleteCity(Long id);
}
