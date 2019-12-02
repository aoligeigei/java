package test;

import java.util.HashSet;

public class test {
public static void main(String[] args) {
	HashSet<Short> s = new HashSet<Short>();
	for(Short i=0;i<100;i++) {
		s.add(i);
		s.remove(i-1);
	
	}
	
  Short  x=3;
    s.remove(x);
	System.out.println(s);
 

//	int []x=new int [25];
//	System.out.println(x[25]);
//}
}	
}
