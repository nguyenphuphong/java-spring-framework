package vn.kase.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tb_names")
@SequenceGenerator(name = "name_id_generator", sequenceName = "sq_name_id", allocationSize = 1)
public class Name {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "name_id_generator")
    private Integer id;

    @Column(name = "short_name")
    private String shortName;

    @Column(name = "full_name")
    private String fullName;
}
