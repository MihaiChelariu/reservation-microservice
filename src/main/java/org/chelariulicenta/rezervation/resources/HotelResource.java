package org.chelariulicenta.rezervation.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "HotelFeignClient", url="http://localhost:8091/api/hotel")
public interface HotelResource {

    @GetMapping("/getAllHotels")
    List<VHotel> getHotel();

    @GetMapping("/getHotel/{id}")
    VHotel getHotel(@PathVariable("id") Integer id);
}
