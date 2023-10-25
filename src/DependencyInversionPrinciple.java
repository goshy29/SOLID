public class DependencyInversionPrinciple {
    //The principle states that we must use abstraction (abstract classes and interfaces)
    // instead of concrete implementations. High-level modules should not depend on the
    // low-level module but both should depend on the abstraction.

    //You go to a local store to buy something, and you decide to pay for it by using your card.
    // So, when you give your card to the clerk for making the payment, the clerk doesn’t bother
    // to check what kind of card you have given (Debit or Credit card).
}

    //BAD PRACTICE !!
class DebitCard{
        public void doTransaction(int amount){
            System.out.println("tx done with DebitCard");
        }
}
class CreditCard{
    public void doTransaction(int amount){
        System.out.println("tx done with CreditCard");
    }
}
class ShoppingMall {
    private DebitCard debitCard;
    public ShoppingMall(DebitCard debitCard) {
        this.debitCard = debitCard;
    }
    public void doPayment(Object order, int amount){              debitCard.doTransaction(amount);
    }
    public static void main(String[] args) {
        DebitCard debitCard=new DebitCard();
        ShoppingMall shoppingMall=new ShoppingMall(debitCard);
        shoppingMall.doPayment("some order",5000);
    }
}

    // INSTEAD !!
interface BankCard {
        public void doTransaction(int amount);
}
class CreditCardSRP implements BankCard{
    public void doTransaction(int amount){
        System.out.println("tx done with CreditCard");
    }
}
class DebitCardSRP implements BankCard{
    public void doTransaction(int amount){
        System.out.println("tx done with DebitCard");
    }
}
class ShoppingMallSRP {
    private BankCard bankCard;
    public ShoppingMallSRP(BankCard bankCard) {
        this.bankCard = bankCard;
    }
    public void doPayment(Object order, int amount){
        bankCard.doTransaction(amount);
    }
    public static void main(String[] args) {
        BankCard bankCard = new CreditCardSRP();
        ShoppingMallSRP shoppingMall1 = new ShoppingMallSRP(bankCard);
        shoppingMall1.doPayment("do some order", 10000);
    }
}
