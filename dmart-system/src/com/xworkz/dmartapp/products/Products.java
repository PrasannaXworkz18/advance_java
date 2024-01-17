package com.xworkz.dmartapp.products;

import lombok.*;

@Setter@Getter@NoArgsConstructor@AllArgsConstructor@ToString

public class Products {

    private String productName;
    private int productId;
    private String productType;
    private double productPrice;
    private String manufacturingDate;
    private String expiryDate;
    private double productRating;

}
