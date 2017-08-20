import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class AtmOutOfMoney implements ATMState {

    ATMMachine atmMachine;
    //Constructor
    public AtmOutOfMoney(ATMMachine newATMMachine){
        this.atmMachine = newATMMachine;
    }
    @Override
    public void insetCard() {
        System.out.println("We dont have money");

    }

    @Override
    public void ejectCard() {
        System.out.println("We dont have money, you dont enter a card");
    }

    @Override
    public void insertPin(int pinNumber) {
        System.out.println("We dont have money");
    }

    @Override
    public void requstCash(int withdrawTotalCash) {

        System.out.println("We dont have money");

    }
}
