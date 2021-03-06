package fr.istic.malah.tp2.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import static fr.istic.malah.tp2.config.DAODataDefinition.CODE;
import static fr.istic.malah.tp2.config.DAODataDefinition.DEPARTMENT;
import static fr.istic.malah.tp2.config.DAODataDefinition.NAME;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Table(name = DEPARTMENT)
public class Department extends BaseEntity {

    @Column(name = NAME)
    private String name;

    @Column(name = CODE)
    private String code;
}
