import java.lang.String;
import java.lang.ArrayList;


public class Person {
	
	private final String address;
	private float longitude;
	private float latitude;
	public final String name;


	Person(String n, String a) {
		name = n;
		address = a;
	}

	float[] GetLocation() {
		return [longitude, latitude];
	}

	float GetLong() {
		return longitude;
	}

	float GetLat() {
		return latitude;
	}

	void AddressToCoordinates() {
		return;
	}





	public static void main(String[] args) {
		

	}
}