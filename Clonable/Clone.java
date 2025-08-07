class XYZ implements Cloneable {
int a;
double b;
XYZ cloneTest() {
try {
return (XYZ) super.clone();
} catch (CloneNotSupportedException e) {
System.out.println("Cloning Not Allowed");
return this;
}
}
}


class Clone {
public static void main(String args[])  {
XYZ x1 = new XYZ();
XYZ x2; 
x1.a = 10;
x1.b = 20;
x2 = x1.cloneTest(); // cloning x1
System.out.println("x1 : " + x1.a + " " + x1.b);
System.out.println("x2 : " + x2.a + " " + x2.b);
x1.a = 100;
x1.b = 200;
System.out.println("x1 : " + x1.a + " " + x1.b);
System.out.println("x2 : " + x2.a + " " + x2.b);
}
}
