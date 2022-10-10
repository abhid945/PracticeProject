//package com.coditas.StudentManagementAPI.entities;
//
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//public class Address {
//
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int addressId;
//    private int houseNo;
//    private String area;
//    private String district;
//    private String city;
//    private int pincode;
//
//    public int getHouseNo() {
//        return houseNo;
//    }
//
//    public void setHouseNo(int houseNo) {
//        this.houseNo = houseNo;
//    }
//
//    public String getArea() {
//        return area;
//    }
//
//    public void setArea(String area) {
//        this.area = area;
//    }
//
//    public String getDistrict() {
//        return district;
//    }
//
//    public void setDistrict(String district) {
//        this.district = district;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public int getPincode() {
//        return pincode;
//    }
//
//    public void setPincode(int pincode) {
//        this.pincode = pincode;
//    }
//
//    @Override
//    public String toString() {
//        return "Address{" +
//                "addressId=" + addressId +
//                ", houseNo=" + houseNo +
//                ", area='" + area + '\'' +
//                ", district='" + district + '\'' +
//                ", city='" + city + '\'' +
//                ", pincode=" + pincode +
//                '}';
//    }
//}
