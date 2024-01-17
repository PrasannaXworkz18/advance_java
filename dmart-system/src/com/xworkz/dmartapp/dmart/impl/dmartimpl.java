package com.xworkz.dmartapp.dmart.impl;

import com.xworkz.dmartapp.dmart.Dmart;
import com.xworkz.dmartapp.exception.*;
import com.xworkz.dmartapp.products.Products;

import java.util.*;

public class dmartimpl implements Dmart {

    List<Products> list = new ArrayList<>();
 //   Products product[];
    int index;
    int id=1;
    public dmartimpl(){

        //product=new Products[size];
    }

    @Override
    public boolean addProducts(Products product) {
        System.out.println("Add product method invoked");
        boolean isAdded = false;
        if(product!=null){
            product.setProductId(id++);
            this.list.add(product);
            //this.product[index]=product;
            isAdded = true;
            System.out.println("Product added successfully");
        }
        try{
            if (isAdded==false){
                ProductNotFoundException productNotFoundException=
                        new ProductNotFoundException("");
                throw productNotFoundException;
            }
        }catch (Exception e){
            System.out.println("added product not found");
        }
        return isAdded;
    }

    @Override
    public void getAllProducts() {
        System.out.println("Get All Products method invoked");
//        for (int index = 0; index <this.product.length ; index++) {
//            System.out.println(product[index].getProductId()+" "+product[index].getProductName()+" "+product[index].getProductPrice()+" "+product[index].getManufacturingDate()+" "+product[index].getExpiryDate()+" "+product[index].getProductRating()+" " + product[index].getProductType());
//        }
        for (Products pro:list) {
            System.out.println(pro);
        }
    }

    @Override
    public Products getProductByName(String name) {
        System.out.println("Get product by name method invoked");
        Products productName = null;
        for (Products pro:list) {
            if(pro.getProductName()==name){
                productName=pro;
            }
        }

        try{
//        for (int index = 0; index <this.product.length ; index++) {
//            if(product[index].getProductName().equals(name)){
//            productName=product[index];
//            System.out.println("Product found .Got it by its name");}
//
//        }
            if (productName==null){
                ProductNotFoundException productNotFoundException=
                        new ProductNotFoundException("");
                throw productNotFoundException;
            }
        }catch (Exception e){
            System.out.println("wrong name");
        }
        return productName;
    }

    @Override
    public  String getProductTypeByPrice(int price){
        System.out.println("Get product type by price method invoked");
        String ref=null;
//        for(int index=0;index<this.product.length;index++){
//            if(product[index].getProductPrice()==price){
//                ref=product[index].getProductType();
//                System.out.println("product type is found");
//            }
//        }
        for (Products pro:list) {
            if(pro.getProductPrice()==price){
                ref=pro.getProductType();
            }
        }
        try{
            if(ref==null){
                ProductTypeNotFoundException productTypeNotFoundException=
                        new ProductTypeNotFoundException("");
                throw productTypeNotFoundException;
            }
        }catch (Exception e){
            System.out.println("product type not found");
        }
        return ref;
    }

    @Override
    public String getProductExperyDateById(int id){
        System.out.println("get experydate by id method invoked");
        String dummy =null;
//        for (int index=0;index<this.product.length;index++){
//            if (product[index].getProductId()==id){
//                dummy=product[index].getExpiryDate();
//            }
//        }
        for (Products pro:list) {
            if(pro.getProductId()==id){
                dummy=pro.getExpiryDate();
            }
        }
        try{
            if(dummy==null){
                InputMismatchException inputMismatchException=
                        new InputMismatchException("");
                throw inputMismatchException;
            }
        }catch (Exception e){
            System.out.println("id missmatched");
        }
        return dummy;
    }

    @Override
    public Products getProductsById(int id) {
        System.out.println("get product by its id method is invoked");
        Products productId = null;
        try{
//            for (int index = 0; index <this.product.length ; index++) {
//                if(product[index].getProductId()==id){
//                    productId=product[index];
//                    System.out.println("Product is found.got it by its Id");
//                }
//
//            }
            for (Products pro:list) {
                if(pro.getProductId()==id){
                    productId=pro;
                }
            }
           if(id>0){
               if (productId==null){
                   InputMismatchException inputMismatchException =
                           new InputMismatchException("not found");
                   throw inputMismatchException;
               }
           }
       }catch (Exception e){
            System.out.println("id not found");
    //       e.printStackTrace();
       }
        return productId;
    }

    @Override
    public Products getProductByType(String type) {
        System.out.println("get product by its type method is iinvoked");
        Products productType = null;

//        for (int index = 0; index <this.product.length ; index++) {
//            if (product[index].getProductType().equals(type)){
//                productType = product[index];
//                System.out.println("Product is found.Got by it type");
//            }
//        }
        for (Products pro:list) {
            if(pro.getProductType()==type){
                productType=pro;
            }
        }
        try{
            if(productType ==null) {
                ProductNotFoundException productNotFoundException =
                        new ProductNotFoundException("");
                throw productNotFoundException;
            }
        }catch (Exception e){
            System.out.println("Product not found");
        }
        return productType;
    }

    @Override
    public String getProductNameByPrice(int price) throws ProductNotFoundException{
        System.out.println("Get product Name by its price method is invoked");
        String name=null;
//        for (int index = 0; index <this.product.length ; index++) {
//            if (product[index].getProductPrice()==price){
//                name=product[index].getProductName();
//                System.out.println("product name is found by its price");
//            }
//        }
        for (Products pro:list) {
            if(pro.getProductPrice()==price){
                name=pro.getProductName();
            }
        }
        return name;
    }

    @Override
    public String getProductInfoByName(String name){
        System.out.println("Get Product Info By name method invoked");
        String info=null;
//        for(int index=0;index<this.product.length;index++){
//            if(product[index].getProductName()==name){
//                info=product[index].getProductType();product[index].getProductId();product[index].getProductPrice();product[index].getExpiryDate();product[index].getManufacturingDate();product[index].getProductRating();
//            }
//        }
        for (Products pro:list) {
            if(pro.getProductName()==name){
                System.out.println(pro);
            }
        }
        try{
            if (info==null){
                ProductNameNotFoundException productNameNotFoundException=
                        new ProductNameNotFoundException("");
                throw productNameNotFoundException;
            }
        }catch (Exception e){
            System.out.println("product name not found");
        }
        return name;
    }

    @Override
    public boolean updateProductNamebyId(int Existingid, String updatedName) {
        System.out.println("Update Name by its Id method is invoked");
        boolean isUpdated = false;
//        for (int index = 0; index <this.product.length ; index++) {
//            if (product[index].getProductId()==Existingid){
//                product[index].setProductName(updatedName);
//                isUpdated = true;
//                System.out.println("Product name updated Sucessfully By its id");
//            }
//        }
        for (Products pro:list) {
            if(pro.getProductId()==id){
                System.out.println(pro.getProductName());
            }
        }

        try{
            if (isUpdated==false){
                IdNotFoundException idNotFoundException=
                        new IdNotFoundException("");
                throw idNotFoundException;
            }
        }catch (Exception e){
            System.out.println("id not found");
        }
        return isUpdated;
    }

    @Override
    public boolean updatePriceByName(String existingName, int updatesPrice) {
        System.out.println("Update price by its name method is invokes");
        boolean isUpdated=false;
//        for (int i = 0; i <this.product.length ; i++) {
//            if (product[i].getProductName().equals(existingName)){
//                product[i].setProductPrice(updatesPrice);
//                isUpdated = true;
//                System.out.println("Product price updated successfully");
//            }
//        }
        for (Products pro:list) {
            if(pro.getProductName().equals(existingName)){
                isUpdated=true;
            }
        }
        try{
            if (isUpdated==false){
                ProductNameNotFoundException productNameNotFoundException=
                        new ProductNameNotFoundException("");
                throw productNameNotFoundException;
            }
        }catch (Exception e){
            System.out.println("product name not found");
        }
        return isUpdated;
    }

    @Override
    public boolean updateManufacturingDatebyName(String name, String updatedMdate) {
        System.out.println("update manufacture method is invoked");
        boolean isupdated = false;
//        for (int index=0;index<this.product.length;index++){
//            if (product[index].getProductName().equals(name)){
//                product[index].setManufacturingDate(updatedMdate);
//                isupdated =true;
//                System.out.println("Manufacture date updted sucessfully");
//            }
//        }
        for (Products pro:list) {
            if(pro.getProductName().equals(name)){
                isupdated=true;
            }
        }
        try{
            if (isupdated==false){
                ProductNameNotFoundException productNameNotFoundException=
                        new ProductNameNotFoundException("");
                throw productNameNotFoundException;
            }
        }catch (Exception e){
            System.out.println("product name not found");
        }
        return isupdated;
    }

    @Override
    public void deleteProductByName(String name) {
        Iterator<Products> iterator= list.iterator();
        while (iterator.hasNext()){
            if (iterator.next().getProductName().equals(name)){
                iterator.remove();
            }
        }

    }
}
