import java.util.*;

class recursion {
	public static void main(String[] args){
		System.out.println(binary(24));
	}
	static String binary(int a){
		if (a == 1){
			return "1";
		}
		else {
			return binary(a/2) + a%2;
		}
	}
}

