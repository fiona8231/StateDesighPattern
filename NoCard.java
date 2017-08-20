
public class NoCard implements ATMState {

    ATMMachine atmMachine;
    //Constructor
    public NoCard (ATMMachine newATMMachine){
        this.atmMachine = newATMMachine;
    }
    @Override
    public void insetCard() {
        System.out.println("Please Enter A PIN");
        atmMachine.setATMState(atmMachine.getYesCardState());

    }

    @Override
    public void ejectCard() {
        System.out.println("Enter a card fist");
    }

    @Override
    public void insertPin(int pinNumber) {

        System.out.println("Enter a card fist");
    }

    @Override
    public void requstCash(int withdrawTotalCash) {
        System.out.println("Enter a card fist");

    }
}
