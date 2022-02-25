package ge.example.dunkin.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "products")
public class Product {
    @Id
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "type_id")
    private Integer typeId;
    @Column(name = "single_prise")
    private Double singlePrise;
    @Column(name = "quantity")
    private Integer quantity;
}
