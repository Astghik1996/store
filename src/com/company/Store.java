package com.company;

public class Store {
    private int countOfWorkers;
    private String name;
    private String phoneNumber;
    private int productNumber;


    public Store(int countOfWorkers,String name,String phoneNumber,int productNumber){
        setName(name);
        setCountOfWorkers(countOfWorkers);
        setPhoneNumber(phoneNumber);
        setProductNumber(productNumber);
    }

    public void SellProduct(){
        productNumber -- ;

        System.out.println(productNumber);

    }

    public void setCountOfWorkers(int countOfWorkers) {
        if (countOfWorkers >= 2 && countOfWorkers <= 50) {
            this.countOfWorkers = countOfWorkers;
        } else {
            System.out.println("count Of Workers must be in range 2 - 50");
        }
    }

    public void setName(String name) {
        if (name.length() >= 3) {
            this.name = name;
        } else {
            System.out.println("name must have at least 3 characters");
        }
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() == 8 ){
            for (int i = 0; i < 8; i++) {
                if (Character.isDigit(phoneNumber.charAt(i))){
                    this.phoneNumber = phoneNumber;
                }

            }

        }else {
            System.out.println("Your phone number is invalid");
        }


    }


    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }
}
