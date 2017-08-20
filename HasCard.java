
public class HasCard implements ATMState{
    ATMMachine atmMachine;
    //Constructor
    public HasCard(ATMMachine newATMMachine){
        this.atmMachine = newATMMachine;
    }

    @Override
    public void insetCard() {

        System.out.println("You can not insert more than one card");

    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected");
        atmMachine.setATMState((ATMState) atmMachine.getNoCardState());

    }

    @Override
    public void insertPin(int pinNumber) {
        if(pinNumber ==123){
            System.out.println("Correct PIN");
            atmMachine.correctPinEntered = true;
            atmMachine.setATMState(atmMachine.getHasPin());
        } else
        {
            System.out.println("Wrong PIN");
            atmMachine.correctPinEntered = false;
            System.out.println("Card ejected!");
            atmMachine.setATMState(atmMachine.getNoCardState());
        }

    }

    @Override
    public void requstCash(int withdrawTotalCash) {
        System.out.println("Enter PIN first");

    }
}
