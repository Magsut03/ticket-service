package com.example.demo.entity.train;


import com.example.entity.train.TrainModel;
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
@Table(name = "train")
public class TrainEntity extends TrainModel {

    @ManyToMany
    @JoinTable(
            name = "train_wagon",
            joinColumns = @JoinColumn(name = "train_id"),
            inverseJoinColumns = @JoinColumn(name = "wagon_id")
    )
    private List<WagonEntity> wagonEntityList;

}
