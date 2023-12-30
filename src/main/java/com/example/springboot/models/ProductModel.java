package com.example.springboot.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.hateoas.RepresentationModel;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = ProductModel.TABLE_NAME)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductModel extends RepresentationModel<ProductModel> {
    public static final String TABLE_NAME = "tb_products";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idProduct;
    private String name;
    private BigDecimal value;
}
