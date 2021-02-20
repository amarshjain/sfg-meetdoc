package com.springframework.sfgmeetdoc.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "types")
public class PatientType extends BaseEntity {

    @Column(name = "name")
    private String name;

    }
