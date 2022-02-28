package com.example.demo.entity.train;


import com.example.entity.train.PlaceModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "places")
public class PlaceEntity extends PlaceModel {

    @ManyToOne
    private WagonEntity wagonEntity;

}
