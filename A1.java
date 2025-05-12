class A1 {
  void f1 () {
    System.out.print("class-A ");
  }
}
class B extends A1 {
  void f1 () {
    System.out.print("Class-B ");
  }
} 
   
class Main {
  public static void main (String s[]) {
    A1 refA = new A1();
    A1 refB = new B();
  
    refA.f1();
    refB.f1();
  }
}