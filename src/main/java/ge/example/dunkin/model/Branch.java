package ge.example.dunkin.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "branches")
public class Branch {
    @Id
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "amount")
    private Double amount;
}
