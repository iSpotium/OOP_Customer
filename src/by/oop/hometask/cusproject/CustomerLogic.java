package by.oop.hometask.cusproject;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

public class CustomerLogic {
////////////////////////////////////////////////////////////
	public boolean searchCards(Customer cus) {

		int cardnum = cus.getCreditCardNumber();

		if ((100 <= cardnum) && (cardnum <= 116)) {
			return true;
		}
		return false;
	}

////////////////////////////////////////////////////////////
	public List<Customer> searchCardList(List<Customer> cus) {
		List<Customer> cardlis = new ArrayList<Customer>();
		for (Customer i : cus) {
			if (searchCards(i)) {
				cardlis.add(i);
			}
		}
		return cardlis;
	}

////////////////////////////////////////////////////////////
	public void printSearchCards(List<Customer> cus) {
		System.out.println("List of buyers whose credit card number is in the given interval");
		System.out.println("-------------------------------------------------------");

		for (Customer i : cus) {
			System.out.println(
					"Surname: " + i.getSurname() + ", Name: " + i.getName() + ", Patronymic: " + i.getPatronymic());
		}
	}

////////////////////////////////////////////////////////////
	public void surnamesAddToAnotherList(List<Customer> cus) {

		List<String> Surnames = new ArrayList<>();

		for (Customer i : cus) {
			Surnames.add(i.getSurname());
		}
		System.out.println(Surnames);
	}
///////////////////////////////////////////////////////////
	public void printList(List<Customer> cus) {
		for (Customer i : cus) {
			System.out.println("Surname: " + i.getSurname() + ", Name: " + i.getName() + ", Patronymic: " + i.getPatronymic());
		}
	}
///////////////////////////////////////////////////////////
}