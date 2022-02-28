package com.example.demo.entity.user;

import com.example.demo.entity.base.BaseEntity;
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
@Table(name = "role")
public class RoleEntity extends BaseEntity {
    @Enumerated(EnumType.STRING)
    private RoleEnum name;

}
