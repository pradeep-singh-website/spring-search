package com.Practice.forsearch;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Institute {
    @Id
    int id;
    String college_name;
    int number_Of_Student;
    String state;
    String city;
}
