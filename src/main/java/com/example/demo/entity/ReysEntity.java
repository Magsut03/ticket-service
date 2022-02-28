package com.example.demo.entity;


import com.example.demo.entity.station.DistinationEntity;
import com.example.demo.entity.station.StationEntity;
import com.example.demo.entity.train.TrainEntity;
import com.example.entity.ReysModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "reys")
public class ReysEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private StationEntity fromStation;

    @ManyToOne
    private StationEntity toStation;

    @OneToOne
    private TrainEntity train;

    @ManyToMany
    @JoinTable(
            name = "reys_distionation",
            joinColumns = @JoinColumn(name = "reys_id"),
            inverseJoinColumns = @JoinColumn(name = "distination_id")
    )
    private List<DistinationEntity> distination;

}
