package by.oop.hometask.cusproject;

import java.util.List;
import java.util.*;

public class CustomerMain {

	public static void main(String[] args) {

		CustomerLogic cusLog = new CustomerLogic();
		List<Customer> datalist = new ArrayList<Customer>();

		datalist.add(new Customer(7552, "Melnic", "Sofia", "Alexseevna", "Grodno, st.Lenin, 25", 110, "BY5761288"));
		datalist.add(
				new Customer(6751, "Fursova", "Veronica", "Andreevna", "Brest, st.17 september, 2", 112, "BY8795133"));
		datalist.add(new Customer(8364, "Herington", "Billy", "Gachimychovich", "Los Angeles, st.Marks Place, 89", 115,
				"LA32187573"));
		datalist.add(new Customer(7138, "Alexey", "Sosov", "Romanovich", "Moscow, st.Pobed, 87", 775, "RU24754138"));

		List<Customer> rez = new ArrayList<Customer>();

		rez = cusLog.searchCardList(datalist);
		cusLog.printSearchCards(rez);

		System.out.println();

		System.out.println("Sorted surname DataList");
		System.out.println("|---------------------------------------------------------------|");
		Collections.sort(datalist);
		cusLog.printList(datalist);
		System.out.println("|---------------------------------------------------------------|");
	}

}