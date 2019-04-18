package Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Bill {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int idBill;
	private User user;
	private List<Product> ListOfProducts = new ArrayList<Product>();
	private double totalPrice;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Product> getListOfProducts() {
		return ListOfProducts;
	}
	public void setListOfProducts(List<Product> listOfProducts) {
		ListOfProducts = listOfProducts;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

}
