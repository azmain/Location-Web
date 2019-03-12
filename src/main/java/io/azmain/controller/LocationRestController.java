package io.azmain.controller;

import io.azmain.entities.Location;
import io.azmain.repos.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/locations")
public class LocationRestController {

    @Autowired
    LocationRepository locationRepository;

    @GetMapping
    public List<Location> getLocations(){
        return locationRepository.findAll();
    }

    @PostMapping
    public Location createLocation(@RequestBody Location location){
        return locationRepository.save(location);
    }

    @PutMapping
    public Location updateLocation(@RequestBody Location location){
        return locationRepository.save(location);
    }

    @DeleteMapping("/{id}")
    public void deleteLocation(@PathVariable("id") int id){
        locationRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public void getLocationById(@PathVariable("id") int id){
        locationRepository.findById(id);
    }

}
