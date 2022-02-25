package ge.example.dunkin.model;

import lombok.Data;

import javax.persistence.*;

@SequenceGenerator(sequenceName = "distribution_id_seq", name = "example",allocationSize = 1)
@Entity
@Data
@Table(name = "distribution")
public class Distribution {
    @Id
    @GeneratedValue(generator = "example",strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "product_id")
    private Integer productId;
    @Column(name = "amount")
    private Double amount;
    @Column(name = "product_type_id")
    private Integer productTypeId;
}
