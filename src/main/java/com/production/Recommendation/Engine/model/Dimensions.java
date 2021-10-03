package com.production.Recommendation.Engine.model;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "dimensions")
public class Dimensions
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(length = 50, nullable = false)
    private String Username;

    @Column
    private Integer age;


}
