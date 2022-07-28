package by.oop.hometask.cusproject;

public class Customer implements Comparable<Customer>{
	private int id;
	private String surname;
	private String name;
	private String patronymic;
	private String adress;
	private int creditCardNumber;
	private String bankAccountNumber;

	public Customer() {
		id = 0;
		surname = "";
		name = "";
		patronymic = "";
		adress = "";
		creditCardNumber = 0;
		bankAccountNumber = "";
	}

	public Customer(int id, String surname, String name, String patronymic, String adress, int creditCardNumber,
			String bankAccountNumber) {
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.adress = adress;
		this.creditCardNumber = creditCardNumber;
		this.bankAccountNumber = bankAccountNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", surname=" + surname + ", name=" + name + ", patronymic=" + patronymic
				+ ", adress=" + adress + ", creditCardNumber=" + creditCardNumber + ", bankAccountNumber="
				+ bankAccountNumber + ", getId()=" + getId() + ", getSurname()=" + getSurname() + ", getName()="
				+ getName() + ", getPatronymic()=" + getPatronymic() + ", getAdress()=" + getAdress()
				+ ", getCreditCardNumber()=" + getCreditCardNumber() + ", getBankAccountNumber()="
				+ getBankAccountNumber() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public int compareTo(Customer o) {
		return surname.compareTo(o.getSurname());
	}

}