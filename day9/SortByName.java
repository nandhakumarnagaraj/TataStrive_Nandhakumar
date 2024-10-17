package day9;

import java.util.Comparator;

public class SortByName implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o2.getProductName().compareTo(o1.getProductName());
	}

}