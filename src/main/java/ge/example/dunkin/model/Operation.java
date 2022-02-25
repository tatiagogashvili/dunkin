package ge.example.dunkin.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "operations")
public class Operation {
    @Id
    private Integer id;
    @Column(name = "product_id")
    private Integer productId;
    @Column(name = "transaction")
    private String transactions;
    @Column(name = "amount")
    private Double amount;
}
