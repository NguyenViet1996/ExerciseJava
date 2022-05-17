package HotelManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Hotel {

		private  List<Customer> listCustomer;

		public Hotel() {
				this.listCustomer = new ArrayList<>();
		}

		public void addNewCustomer(Customer customer) {
				this.listCustomer.add(customer);
		}

		public void deleteCustomer(String identityCardNumber) {
				this.listCustomer = this.listCustomer.stream().filter(customer -> !customer.getIdentityCardNumber()
						.equalsIgnoreCase(identityCardNumber)).collect(Collectors.toList());
		}

		// different solution to delete record
//		public void deleteCustomer(String identityCardNumber) {
//				for (int i = 0;i < this.listCustomer.size(); i++) {
//						if(this.listCustomer.get(i).getIdentityCardNumber().equalsIgnoreCase(identityCardNumber)) {
//								this.listCustomer.remove(i);
//						}
//				}
//		}

		public void caculateMoneyRent() {
				for (Customer customer : this.listCustomer) {
						customer.setTotalPay(customer.getAmountDayRent() * customer.getRoom().getPrice());
				}
		}

		public void viewTheBillToCustomer() {
				for (Customer customer : this.listCustomer) {
						System.out.println(customer);
				}
		}

}
