package com.example.demo.entity.train;


import com.example.entity.train.WagonModel;
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
//@Table(name = "wagon",
//        uniqueConstraints=
//        @UniqueConstraint(columnNames={"number", "wagon_type"})
//)

public class WagonEntity extends WagonModel {

}
