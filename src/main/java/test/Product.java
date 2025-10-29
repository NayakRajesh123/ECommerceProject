package test;

public class Product {
private String code;
private String name;
private double price;
private int qty;
public void setQuantity(int int1) {
	
}
public void setPrice(double double1) {
	
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Product [code=" + code + ", name=" + name + ", price=" + price + ", qty=" + qty + "]";
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public double getPrice() {
	return price;
}
}
