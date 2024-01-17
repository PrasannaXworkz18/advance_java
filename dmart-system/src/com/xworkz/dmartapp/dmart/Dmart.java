package com.xworkz.dmartapp.dmart;


import com.xworkz.dmartapp.exception.ProductPriceNotFoundException;
import com.xworkz.dmartapp.products.Products;

import java.util.Arrays;

public interface Dmart {

//    Products product[];
//    int index;
//    int id=1;
//    public Dmart(int size){
//        product=new Products[size];
//
//    }

      public boolean addProducts(Products product);//{
//        System.out.println("Add product method invoked");
//        boolean isAdded = false;
//        if(product!=null){
//            this.product[index]=product;
//            this.product[index].setProductId(id++);
//            //   this.product[index]=product;
//            index++;
//            isAdded = true;
//            System.out.println("Product added successfully");
//        }
//
//        return isAdded;
//    }
    public void getAllProducts();//{
//        System.out.println("Get All Products method invoked");
//        for (int index = 0; index <product.length ; index++) {
//            System.out.println(product[index].getProductId()+" "+product[index].getProductName()+" "+product[index].getProductPrice()+" "+product[index].getManufacturingDate()+" "+product[index].getExpiryDate()+" "+product[index].getProductRating()+" " + product[index].getProductType());
//
//
//        }
//    }

    public Products getProductByName(String name);//{
//        System.out.println("Get product by name method invoked");
//        Products productName = null;
//        for (int index = 0; index <this.product.length ; index++) {
//            if(product[index].getProductName().equals(name));
//            productName=product[index];
//            System.out.println("Product found .Got it by its name");
//
//        }
//        return productName;

//    }
    public Products getProductsById(int id);//{
//        System.out.println("get product by its id method is invoked");
//        Products productId = null;
//        for (int index = 0; index <this.product.length
//        ; index++) {
//            if(product[index].getProductId()==id){
//                productId=product[index];
//                System.out.println("Product is found.got it by its Id");
//            }
//
//        }
//        return productId;
//    }
    public Products getProductByType(String type);//{
//        System.out.println("get product by its type method is iinvoked");
//        Products productType = null;
//        for (int index = 0; index <this.product.length ; index++) {
//            if (product[index].getProductType().equals(type)){
//                productType = product[index];
//                System.out.println("Product is found.Got by it type");
//            }
//        }
//        return productType;

//    }
    public String getProductNameByPrice(int price) throws ProductPriceNotFoundException;//{
//        System.out.println("Get product Name by its price method is invoked");
//        String name=null;
//        for (int index = 0; index <this.product.length ; index++) {
//            if (product[index].getProductPrice()==price){
//                name=product[index].getProductName();
//                System.out.println("product name is found by its price");
//            }
//
//        }
//        return name;
//    }


    public String getProductInfoByName(String name);
    public  String getProductTypeByPrice(int price);

    public String getProductExperyDateById(int id);

    public boolean updateProductNamebyId(int Existingid,String updatedName);//{
//        System.out.println("Update Name by its Id method is invoked");
//        boolean isUpdated = false;
//        for (int index = 0; index <this.product.length ; index++) {
//            if (product[index].getProductId()==Existingid){
//                product[index].setProductName(updatedName);
//                isUpdated = true;
//                System.out.println("Product name updated Sucessfully By its id");
//
//            }
//
//        }
//        return isUpdated;
//    }

    public boolean updatePriceByName(String existingName,int updatesPrice);//{
//        System.out.println("Update price by its name method is invokes");
//        boolean isUpdated=false;
//        for (int i = 0; i <this.product.length ; i++) {
//            if (product[i].getProductName().equals(existingName)){
//                product[i].setProductPrice(updatesPrice);
//                isUpdated = true;
//                System.out.println("Product price updated successfully");
//            }
//
//        }
//        return isUpdated;
//    }

    public boolean updateManufacturingDatebyName(String name,String updatedMdate);//{
//        System.out.println("update manufacture method is invoked");
//        boolean isupdated = false;
//        for (int index=0;index<this.product.length;index++){
//            if (product[index].getProductName().equals(name)){
//                product[index].setManufacturingDate(updatedMdate);
//                isupdated =true;
//                System.out.println("Manufacture date updted sucessfully");
//            }
//        }
//        return isupdated;
//    }
    public void deleteProductByName(String name);//{
//        int index,newIndex;
//        for (index=0,newIndex=0;index<this.product.length;index++) {
//            if(!product[index].getProductName().equals(name)){
//                product[newIndex++]=product[index];
//                System.out.println("Given app is deleted");
//            }
//
//        }
//        product = Arrays.copyOf(product,newIndex);
//        // getAllNewApplication(application);
//    }

}