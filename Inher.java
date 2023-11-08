interface E {
    void methodE();
  }
  
  class D implements E {
    public void lessons() {
      System.out.println("Be Wise");
    }
  
    @Override
    public void methodE() {
      lessons();
    }
  }
  
  class C extends D implements E {
    public void thinkBig() {
      System.out.println("Be Silent");
    }
  
    @Override
    public void methodE() {
      super.methodE();
      thinkBig();
    }
  }
  
  class B extends C implements E {
    public void keepromise() {
      System.out.println("Be Patience");
    }
  
    @Override
    public void methodE() {
      super.methodE();
      keepromise();
    }
  }
  
  class A extends B implements E {
    public void Nevermind() {
      System.out.println("Be Humble");
    }
  
    @Override
    public void methodE() {
      super.methodE();
      Nevermind();
    }
  }
  
  public class Inher {
    public static void main(String[] args) {
      A a = new A();
      a.methodE();
    }
  }