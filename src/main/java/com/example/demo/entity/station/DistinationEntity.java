package com.example.demo.entity.station;


import com.example.entity.station.DistinationModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "distination")
public class DistinationEntity extends DistinationModel {
    @ManyToOne
    private StationEntity station;
}
