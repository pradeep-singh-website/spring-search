package com.Practice.forsearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class SearchService {

    @Autowired
    private  SearchRepo repo;

//    List<Institute> institutes=new ArrayList<>(Arrays.asList(
//            new Institute("Indian Institute of Science", 5000, "Karnataka", "Bangalore"),
//            new Institute("National Institute of Technology Karnataka", 4000, "Karnataka", "Mangalore"),
//            new Institute("Visvesvaraya Technological University", 4500, "Karnataka", "Belagavi"),
//            new Institute("Bangalore University", 4200, "Karnataka", "Bangalore")
//    ));

    public List<Institute> getAllInstitute() {
            //return institutes;
        return repo.findAll();
    }

    public List<Institute> getByState(String states) {
            return repo.getByState(states);
    }

    public Institute getMaxStudent(String states) {
        return repo.getMaxStudent(states);
    }

    public List<Institute> getBySearch(@RequestBody String keyword){

        return repo.getBySearch(keyword);
    }

//    public List<String> getMaxStudent() {
//        return repo.getMaxStudent();
//    }

//    public List<Institute> getInstituteByState(String states) {
//        List<Institute> allInstitute=repo.;
//        return allInstitute;
//    }


//    public String getInstituteByState(String states) {
//        return institutes.
//    }
}
