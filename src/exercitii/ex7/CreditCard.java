package exercitii.ex7;

public class CreditCard extends Card implements Payable {
    //
//Clasa CreditCard, care va extinde Card și va implementa interfața Payable
//Atribute:
//
//maxOverDraft - nu se va putea schimba valoarea acestui atribut Metode:
//pay() - nu se va putea plăti mai mult decât cardBalance + maxOverDraft ++++

        private final int maxOverDraft;

    public CreditCard(boolean isActive, int PIN, int cardNumber, String cardHolderName, int cardBalance,int maxOverDraft) {
        super(isActive, PIN, cardNumber, cardHolderName, cardBalance);
        this.maxOverDraft = maxOverDraft;
    }

    @Override
    public void pay(double amount) {
        if (amount > getCardBalance()+ maxOverDraft){
            System.out.println("nu se poate plati cu aceasta suma");
        }
    }

}
