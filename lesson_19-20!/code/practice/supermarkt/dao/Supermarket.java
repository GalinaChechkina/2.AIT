package practice.supermarkt.dao;

import practice.supermarkt.model.Product;

public class Supermarket {
    private Product[] products;
    private int quantity;

    public Supermarket(int capacity){
        products=new Product[capacity];
    }

    public boolean addProduct(Product product){
        if (product==null || quantity== products.length || findProduct(product.getBarCode())!=null){
            return false;
        }
        products[quantity]=product;
        quantity++;
        return false;
    }

    public Product findProduct(long barcode){
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getBarCode() == barcode) {
                return products[i];
            }
        }
        return null;
    }

    public Product updateProduct(long barcode, double price) {

        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getBarCode() == barcode) {
                products[i].setPrice(price);
                return products[i];
            }
        }
        return null;
    }


    public boolean removeProduct(long barcode){
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getBarCode() == barcode&&products[i]!=products[products.length-1]) {
                products[i]=products[i+1];
                for (int j = i+1; j < products.length-1; j++) {
                    products[j]=products[j+1];
                }
                products[products.length-1]=null;
                quantity--;
                return true;
            } else {
                if (products[i] != null && products[i].getBarCode() == barcode&&products[i]==products[products.length-1]){
                    products[products.length-1]=null;
                    quantity--;
                    return true;
                }
            }
        }return false;
    }

    public void printAllProducts(){
        for (int i = 0; i < products.length; i++) {
            if (products[i]!=null) {
                System.out.println(products[i]);
            }
        }
    }
    public int getQuantity(){
        return quantity;
    }
}
