package com.demo.LoadApi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Load {
	@Id
int loadId;
String loadingPoint;
String unloadingPoint;
String productType;
String noOfTruck;
String weight;
String comment;
String shipperId;
String Date;
public Load(int loadId, String loadingPoint, String unloadingPoint, String productType, String truckType, String weight,
		String comment, String shipperId, String date) {
	super();
	this.loadId = loadId;
	this.loadingPoint = loadingPoint;
	this.unloadingPoint = unloadingPoint;
	this.productType = productType;
	this.noOfTruck = truckType;
	this.weight = weight;
	this.comment = comment;
	this.shipperId = shipperId;
	Date = date;
}
public Load() {
	super();
	// TODO Auto-generated constructor stub
}
public int getLoadId() {
	return loadId;
}
public void setLoadId(int loadId) {
	this.loadId = loadId;
}
public String getLoadingPoint() {
	return loadingPoint;
}
public void setLoadingPoint(String loadingPoint) {
	this.loadingPoint = loadingPoint;
}
public String getUnloadingPoint() {
	return unloadingPoint;
}
public void setUnloadingPoint(String unloadingPoint) {
	this.unloadingPoint = unloadingPoint;
}
public String getProductType() {
	return productType;
}
public void setProductType(String productType) {
	this.productType = productType;
}
public String getTruckType() {
	return noOfTruck;
}
public void setTruckType(String truckType) {
	this.noOfTruck = truckType;
}
public String getWeight() {
	return weight;
}
public void setWeight(String weight) {
	this.weight = weight;
}
public String getComment() {
	return comment;
}
public void setComment(String comment) {
	this.comment = comment;
}
public String getShipperId() {
	return shipperId;
}
public void setShipperId(String shipperId) {
	this.shipperId = shipperId;
}
public String getDate() {
	return Date;
}
public void setDate(String date) {
	Date = date;
}
@Override
public String toString() {
	return "Load [loadId=" + loadId + ", loadingPoint=" + loadingPoint + ", unloadingPoint=" + unloadingPoint
			+ ", productType=" + productType + ", truckType=" + noOfTruck + ", weight=" + weight + ", comment="
			+ comment + ", shipperId=" + shipperId + ", Date=" + Date + "]";
}

}
