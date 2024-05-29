package exercitii.ex7;

public class DebitCard extends Card implements Payable {
    //    /Clasa DebitCard, care va extinde Card și va implementa interfața Payable
////Atribute:
////
////maxTransactionAmount Metode:
////pay() - nu se va putea plăti mai mult decât maxTransactionAmount +++
////changeTransactionLimit() - va da o nouă valoare atributului maxTransactionAmount +++


    private int maxTransactionAmount;

    public DebitCard(boolean isActive, int PIN, int cardNumber, String cardHolderName, int cardBalance,int maxTransactionAmount) {
        super(isActive, PIN, cardNumber, cardHolderName, cardBalance);
        this.maxTransactionAmount = maxTransactionAmount;
    }


public void changeTransactionLimit(int newTransactionLimit){
        maxTransactionAmount = newTransactionLimit;
}

    @Override
    public void pay(double amount) {
    if (amount>maxTransactionAmount){
        System.out.println("nu se poate plati cu aceasta suma");
    }
    }
}





