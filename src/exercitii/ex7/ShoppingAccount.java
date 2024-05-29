package exercitii.ex7;

public class ShoppingAccount {
    //addressList - o listă de adrese
////firstName
////lastName
////currentPaymentMethod - poate fi de fapt un CreditCard sau un DebitCard
////currentBillingAddress Metode:
////addPaymentMethod()
////addAddress() ++++
////removePaymentMethod()
////removeAddress()
////selectPaymentMethod(String cardNumber) - setează currentPaymentMethod în funcție de numărul de card primit ca și parametru
////selectAddress(String street) - setează currentBillingAddress în funcție de strada primită ca și parametru
////generateInvoice(amount, address, card) - se va printa un mesaj în funcție de suma, cardul și adresa cu care a fost făcută tranzacția
//// (de exemplu: “Nume: Olimpiu Stefan. Ați plătit suma 2300 RON folosind cardul cu numărul 1234 1234 1234 1234 pentru adresa: str. Republicii, nr. 12, Cluj-Napoca”)

    private Adress[] Adresslist;
    private int numberOfAdress;
    private String firstName;
    private String lastName;
    private Card currentPaymentMethod;
    private Adress currentBillingAdress;


    public void setNumberOfAdress(int numberOfAdress) {
        this.numberOfAdress = numberOfAdress;
    }

    public ShoppingAccount(Adress[] adresslist, String firstName, String lastName, Card currentPaymentMethod, Adress currentBillingAdress, int numberOfAdress) {
        Adresslist = new Adress[100];
        this.firstName = firstName;
        this.lastName = lastName;
        this.currentPaymentMethod = currentPaymentMethod;
        this.currentBillingAdress = currentBillingAdress;
        this.numberOfAdress = numberOfAdress;
    }

    public Adress[] getAdresslist() {
        return Adresslist;
    }

    public void setAdresslist(Adress[] adresslist) {
        Adresslist = adresslist;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Card getCurrentPaymentMethod() {
        return currentPaymentMethod;
    }

    public void setCurrentPaymentMethod(Card currentPaymentMethod) {
        this.currentPaymentMethod = currentPaymentMethod;
    }

    public Adress getCurrentBillingAdress() {
        return currentBillingAdress;
    }

    public void setCurrentBillingAdress(Adress currentBillingAdress) {
        this.currentBillingAdress = currentBillingAdress;
    }

    public int getNumberOfAdress() {
        return numberOfAdress;
    }


    public Adress addAdress(String street, int number, String city) {
       Adress newAdress = new Adress(street,number,city);
       numberOfAdress++;
       return newAdress;
    }



        public void removeAdress (Adress selectedAdress){ // ??????????????
            for (int i = 0; i < numberOfAdress; i++) {
                if (getAdresslist()[i].getStreet().equals(selectedAdress.getStreet())) {

                    numberOfAdress--;
                }
            }

        }

//        public Card addPaymentMethod(String paymentMethod) {
//            if (paymentMethod.equals(PaymentMethod.DebitCard)){
//            Card card = new DebitCard();
//        } else if (paymentMethod.equals(PaymentMethod.CreditCard)){
//
//            }




    }
