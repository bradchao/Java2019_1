package tw.org.iii.myjava;

public class MyATM {
	public static void main(String[] args) {
		ATM atm = new ATM();
		Bank bank = new Bank(atm);
		Person pA = new Person(atm, "A");
		Person pB = new Person(atm, "B");
		Person pC = new Person(atm, "C");
		Person pD = new Person(atm, "D");
		bank.start();
		pA.start();pB.start();pC.start();pD.start();
	}
}
class ATM {
	private int limit = 1000;
	private int money;
	void add(int add) {
		if (money + add > limit) {
			System.out.println("add:xxx");
		}else {
			money += add;
			System.out.println("add:" + add + " => " + money);
		}
	}
	void get(int get, String name) {
		if (money < get) {
			System.out.println("get:xxx");
		}else {
			money -= get;
			System.out.println(name + " get:" + get + " => " + money);
		}
	}
}
class Bank extends Thread {
	private ATM atm;
	Bank(ATM atm){this.atm = atm;}
	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			synchronized (atm) {
				atm.add(500);
			}
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
			}
		}
	}
}
class Person extends Thread {
	private ATM atm;
	private String name;
	Person(ATM atm, String name){this.atm = atm; this.name = name;}
	@Override
	public void run() {
		for (int i=0; i<50; i++) {
			synchronized (atm) {
				atm.get((int)(Math.random()*100+1), name);
			}
			try {
				Thread.sleep(100);
			}catch (Exception e) {
			}
		}
		System.out.println(name + ":stop");
	}
	
}
