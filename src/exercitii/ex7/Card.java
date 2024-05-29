package exercitii.ex7;

import java.util.Scanner;

public class Card {

// isActive
//PIN
//cardNumber
//cardHolderName
//cardBalance Metode:
//changePin() - schimbă valoarea PIN-ului, dar doar dacă aceasta este o valoare formată din 4 cifre +++
//freezeCard() - face ca cardul să fie inactiv +++

    private boolean isActive;
    private int PIN;
    private int cardNumber;
    private String cardHolderName;
    private int cardBalance;


    public Card(boolean isActive, int PIN, int cardNumber, String cardHolderName, int cardBalance) {
        this.isActive = isActive;
        this.PIN = PIN;
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.cardBalance = cardBalance;
    }


    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getPIN() {
        return PIN;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public int getCardBalance() {
        return cardBalance;
    }

    public void setCardBalance(int cardBalance) {
        this.cardBalance = cardBalance;
    }

    public void freezeCard(){
        isActive=false;
    }
    public int changePIN(int newPIN){
        if (newPIN>1000 && newPIN<9999){
            PIN = newPIN;
            return PIN;
        }
        return -1;
    }


}


