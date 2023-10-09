package week_05;

public class Object {
	int id, price, number;
	String name;
	Object(int id, String name, int price, int number) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.number = number;
	}
	String getName() { return name; }
	int getPrice() { return price; }
	int getNumber() { return number; }
	void changeName(String name) { this.name = name; }
	void changePrice(int price) { this.price = price; }
	void changeNumber(int number) { this.number = number; }
	public void showData() {
		if(number==0) {
			System.out.println(id+"\t"+name+"\t"+price+"\t품절");
		}
		else {
			System.out.println(id+"\t"+name+"\t"+price+"\t"+number);
		}
	}
}
