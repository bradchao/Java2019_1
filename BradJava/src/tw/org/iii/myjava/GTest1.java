package tw.org.iii.myjava;

public class GTest1 {

	public static void main(String[] args) {
		MyCal<Integer> obj1 = new MyCal();
		System.out.println(obj1.addInt(3, 4));
		System.out.println(obj1.addDouble(3, 4));

		MyCal<Double> obj2 = new MyCal();
		System.out.println(obj2.addInt(3.0, 4.0));
		System.out.println(obj2.addDouble(3.0, 4.0));

	}

}
class MyCal<T extends Number> {
	double addDouble(T x,T y){
		return x.doubleValue() + y.doubleValue();
	}
	int addInt(T x,T y){
		return x.intValue() + y.intValue();
	}
}
