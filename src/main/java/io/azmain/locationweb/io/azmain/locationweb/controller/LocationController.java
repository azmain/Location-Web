package io.azmain.locationweb.io.azmain.locationweb.controller;

import io.azmain.locationweb.io.azmain.locationweb.entities.Location;
import io.azmain.locationweb.io.azmain.locationweb.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class LocationController {

    @Autowired
    LocationService service;

    @RequestMapping("/showCreate")
    public String showCreate(){
        return "createLocation";
    }

    @RequestMapping("/saveLoc")
    public String saveLocation(@ModelAttribute("location")Location location, ModelMap modelMap){
        Location savedLocation = service.saveLocation(location);

        String msg = "Successfully Saved Location - "+savedLocation.getName();
        modelMap.addAttribute("msg",msg);

        return "createLocation";
    }

    @RequestMapping("/displayLocations")
    public String displayLocations(ModelMap modelMap){
        List<Location> locations = service.getAllLocations();
        modelMap.addAttribute("locations",locations);
        return "displayLocations";
    }

    @RequestMapping("/deleteLocation")
    public String deleteLocation(@RequestParam("id") int id, ModelMap modelMap){
        //Location location = service.getLocationById(id);
        Location location = new Location();
        location.setId(id);
        service.deleteLocation(location);

        List<Location> locations = service.getAllLocations();
        modelMap.addAttribute("locations",locations);

        return "displayLocations";
    }

    @RequestMapping("/showLocation")
    public String showLocation(@RequestParam("id") int id, ModelMap modelMap){
        Location location = service.getLocationById(id);
        modelMap.addAttribute("location",location);
        return "updateLocation";
    }

    @RequestMapping("/updateLoc")
    public String updateLocation(@ModelAttribute("location")Location location, ModelMap modelMap){
        Location savedLocation = service.updateLocation(location);
        List<Location> locations = service.getAllLocations();
        modelMap.addAttribute("locations",locations);
        return "displayLocations";
    }

}
