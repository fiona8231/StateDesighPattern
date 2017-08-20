
public class Main {

    public static void main (String[] args){

        ATMMachine atmMachine = new ATMMachine();
        atmMachine.insertCard();
        atmMachine.ejectCard();
        atmMachine.insertCard();
        atmMachine.insertPin(123);
        atmMachine.requestCash(2000);




    }
}
