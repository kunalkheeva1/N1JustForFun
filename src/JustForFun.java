

public class JustForFun {
  public int rollNo;
  public String Name;
  JustForFun(int rollNo, String Name ){
      this.Name = Name;
      this.rollNo= rollNo;

  }
  public static void main(String []args) {
    JustForFun [] kk= new JustForFun[4];
    kk[0]= new JustForFun(1, "Kheeva");
    kk[1]= new JustForFun(2, "Kunal");

      System.out.println("Your name and roll numbers are"+ kk);

  }
}