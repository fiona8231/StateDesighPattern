
public class HasCorrectPin implements ATMState{

    ATMMachine atmMachine;
    //Constructor
    public HasCorrectPin(ATMMachine newATMMachine){
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
        System.out.println("Already enter the PIN");
    }

    @Override
    public void requstCash(int withdrawTotalCash) {

        if(withdrawTotalCash > atmMachine.cashInMachine){
            System.out.println("Dont have enough cash");
            System.out.println("Card ejected");
            atmMachine.setATMState(atmMachine.getNoCardState());
        } else {
            System.out.println(withdrawTotalCash + "is provided by the machine ");
            atmMachine.setCashInMachine(atmMachine.cashInMachine - withdrawTotalCash);
            System.out.println(atmMachine.cashInMachine + "left in your account!");

            System.out.println("Card ejected");
            atmMachine.setATMState(atmMachine.getNoCardState());

            if(atmMachine.cashInMachine <= 0){
                atmMachine.setATMState(atmMachine.getNoCash());

            }

        }


    }
}
