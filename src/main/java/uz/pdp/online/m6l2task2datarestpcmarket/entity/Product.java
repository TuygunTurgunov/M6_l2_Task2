package uz.pdp.online.m6l2task2datarestpcmarket.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.online.m6l2task2datarestpcmarket.entity.template.AbsEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
public class Product extends AbsEntity {

    @ManyToOne
    private Category category;

    @OneToOne
    private Attachment attachmentPhoto;

    @NotNull(message = "feature of product not be empty.")
    private  String feature;

    @ManyToOne
    private Measurement measurement;

    @NotNull(message = "product code not be null")
    @Column(unique = true,nullable = false)
    private String productCode;


    private Integer guarantee;


}
