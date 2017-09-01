package com.song.respstatus.controller;

import com.song.respstatus.ResponseHttpStatus;
import com.song.respstatus.domain.City;
import com.song.respstatus.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CityRestController {

    @Autowired
    private CityService cityService;



    @RequestMapping(value =  "/api/city/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseHttpStatus> findOneCity(@PathVariable("id") Long id){
        City city = cityService.findById(id);
        ResponseHttpStatus ress = new ResponseHttpStatus();
        ress.setCode("200");
        ress.setMsg("");
        ress.setData(city);
        return new ResponseEntity<ResponseHttpStatus>(ress, HttpStatus.OK);
    }

    @RequestMapping(value = "/api/city",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseHttpStatus> findAllCity() {
        List<City> citys = cityService.findAllCity();
        ResponseHttpStatus ress = new ResponseHttpStatus();
        ress.setData(citys);
        ress.setCode("200");
        ress.setMsg("");
        return new ResponseEntity<ResponseHttpStatus>(ress,HttpStatus.OK);
    }

    @RequestMapping(value = "/api/city",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseHttpStatus> createCity(@RequestBody City city){
        cityService.saveCity(city);
        ResponseHttpStatus ress = new ResponseHttpStatus();
        ress.setMsg("创建成功！");
        ress.setCode("200");
        return new ResponseEntity<ResponseHttpStatus>(ress,HttpStatus.OK);
    }

    @RequestMapping(value = "/api/city",method = RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseHttpStatus> modifyCity(@RequestBody City city){
        cityService.updateCity(city);
        ResponseHttpStatus ress = new ResponseHttpStatus();
        ress.setCode("200");
        ress.setMsg("跟新成功！");
        return new ResponseEntity<ResponseHttpStatus>(ress,HttpStatus.OK);
    }

    @RequestMapping(value = "/api/city",method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseHttpStatus> deleteCity(@PathVariable("id") Long id){
        cityService.deleteCity(id);
        ResponseHttpStatus ress = new ResponseHttpStatus();
        ress.setMsg("删除成功！");
        ress.setCode("200");
        return new ResponseEntity<ResponseHttpStatus>(ress,HttpStatus.OK);
    }

}
