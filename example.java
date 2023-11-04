class example{
  public static void main(String args []) {//this program runs greetings depend on current time
    int time=20;

    if(time<6){
      System.out.println("good morning");
    } else if(time>=12 && time<15){
      System.out.println("good afternoon");
    }else if ( time>=15 && time<19){
      System.out.println("good evening");
    } else if (time>=20 && time<22){
      System.out.println("good night");
    } else{
      System.out.println("good day");// output good night
    }
  }
}
