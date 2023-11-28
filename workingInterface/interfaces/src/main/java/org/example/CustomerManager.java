package org.example;

public class CustomerManager {
    private ICustomerDal customerDal;
    public CustomerManager(ICustomerDal customerDal){
        this.customerDal = customerDal;
    }
    public void add(){
        //Bağımlıyız.Yanlış kullanım
        //OracleCustomerDal oracleCustomerDal = new OracleCustomerDal();
        customerDal.add();
    }
}
