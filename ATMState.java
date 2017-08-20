
public interface ATMState {
    void insetCard();
    void ejectCard();
    void insertPin(int pinNumber);
    void requstCash(int withdrawTotalCash);


}
