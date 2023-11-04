public class nested1 {
    public static void main(String a[]){//this program runs nested loop
        for(int i=1;i<=2;i++){
            System.out.println("outer: "+ i);
            for(int j=1;j<=3;j++){
                System.out.println(" inner: "+ j);
            }
        }
    }
}
