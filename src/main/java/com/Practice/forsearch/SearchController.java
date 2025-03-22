package com.Practice.forsearch;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@Controller
public class SearchController {

    @Autowired
    private SearchService service;

    @GetMapping("/")
    public List<Institute> getInstitute(){

        return service.getAllInstitute();
    }

    @GetMapping("/state")
    public List<Institute> getBYState(@RequestBody String states){
        System.out.println( states);
        return service.getByState(states);
    }

    @GetMapping("/maxStudent")
    public Institute getMaxStudent(@RequestBody String states){
        return service.getMaxStudent(states);
    }

    @GetMapping("/search/{keyword}")
    public List<Institute> getBySearch(@PathVariable String keyword){
        return service.getBySearch(keyword);
    }

//    @PostMapping("/")
//    public String putDetails(){

//        return "Success";
//    }
//    @GetMapping("/states")
//    public List<Institute> getInstituteByState(@RequestParam String states){
//        return service.getInstituteByState(states);
//    }

}
