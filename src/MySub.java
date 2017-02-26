//public class MySub extends MySuper {
//
//int z = 8;
//
//int myMethod(){
//return z;
//}
//
//public static void main(String[] args){
//
//MySuper mySuper = new MySub();
//
//MySub mySub = (MySub) mySuper;
//
//System.out.print("-x" + mySuper.myMethod() + "-x" + mySuper.z);
//System.out.print("-x" + mySub.myMethod() + "-x" + mySub.z);
//}
//}


public class MySub extends MySuper {

int i = 3;

public int method(){
return i * i;
}
public static void main(String[] args){
MySuper s = new MySub();
System.out.print("-x" + s.method());
System.out.print("-x" + s.i);
}
}
