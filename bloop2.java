public class bloop2 { // this program runs dicrement of "i" in break-loop statement
    public static void main(String[] args) {
        for(int i=100;i>=0;i--){
            if(i==50){
                break;
            }
            System.out.println(i);//output 100,99,98,97,......,51
        }
    }
}
