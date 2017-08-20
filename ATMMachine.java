
//context

public class ATMMachine {

    ATMState hascard;
    ATMState noCard;
    ATMState hasCorrectPin;
    ATMState atmOutOfMoney;

    ATMState atmState;
    int cashInMachine = 2000;
    boolean correctPinEntered = false;


    //constructor
    public ATMMachine(){

        this.hascard = new HasCard(this);
        this.noCard = new NoCard(this);
        this.hasCorrectPin = new HasCorrectPin(this);
        this.atmOutOfMoney = new AtmOutOfMoney(this);

        atmState = noCard;

        if(cashInMachine < 0){
            atmState = atmOutOfMoney;

        }
    }

    void setATMState(ATMState newATMState){
        this.atmState = newATMState;
    }

     public  void setCashInMachine(int newCashInMachine){
        this.cashInMachine = newCashInMachine;
    }


    //Mehods in ATMState
    public void insertCard(){
         atmState.insetCard();
     }

     public void ejectCard(){
        atmState.ejectCard();
     }

     public void requestCash(int  withdrawTotalCash){
         atmState.requstCash( withdrawTotalCash);

     }

     public void insertPin(int pinNumber){
         atmState.insertPin(pinNumber);

     }
     public ATMState getYesCardState(){ return hascard; }
    public ATMState getNoCardState(){ return noCard; }
    public  ATMState getHasPin(){ return hasCorrectPin; }
    public  ATMState getNoCash(){ return atmOutOfMoney; }

    }

