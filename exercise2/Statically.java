package exercise2;



public class Statically {

    public void moveAndShake() {
        System.out.println("Never stagnate in life.  Be agile, change, and improve...");
    }

    public void stubborn() {
        System.out.println("Please don't make me change... I just don't like it...");    
    }

    public void explain() {
        System.out.println("static keyword is mainly used for memory management. ");
        //write an explanation for how the keyword static behaves differently in javascript vs. java.
    }



    public static void main(String[] args) {

        Statically stats = new Statically();
        stats.moveAndShake();
        stats.stubborn();
        stats.explain();
    }}



    
