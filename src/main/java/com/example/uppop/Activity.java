package com.example.uppop;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.Data;


import java.util.List;


@Entity
@Data
@Table(name = "activity")
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_activity")
    private Long idActivity;

    @Column(name = "date_time")
    private String dateTime;

    @Column(name = "location")
    private String location;

    @Column(name = "nameactivity")
    private String nameActivity;

    @Column(name = "category")
    private String category;

    @Column(name = "detail")
    private String detail;

    @OneToMany(mappedBy = "activity")
    private List<PersonActivity> personActivities;
    // getters and setters
}
