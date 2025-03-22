package com.Practice.forsearch;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SearchRepo extends JpaRepository<Institute,String> {

    @Query("SELECT i from Institute i where state=:states")
    List<Institute> getByState(String states);

    @Query("SELECT i FROM Institute i WHERE i.state = :states ORDER BY i.number_Of_Student DESC limit 1")
    Institute getMaxStudent(String states);

    @Query("SELECT i FROM Institute i WHERE " +
            "LOWER(i.college_name) LIKE LOWER(CONCAT('%', :keyword, '%')) ")
    List<Institute> getBySearch(String keyword);

//    @Query()
//    List<String> getMaxStudent();


    //List<Institute> getInstitute(String keyword);

}
