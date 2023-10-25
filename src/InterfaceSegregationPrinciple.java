public class InterfaceSegregationPrinciple {
    //This principle is the first principle that applies to Interfaces instead of classes in
    // SOLID and it is similar to the single responsibility principle. It states that “do not
    // force any client to implement an interface which is irrelevant to them“.
    //
    //For example let’s say you have an interface called UPIPayment like below.
}
interface UPIPayments {
    public void payMoney();
    public void getScratchCard();
    public void getCashBackAsCreditBalance();
}

//Now let’s talk about few implementation for UPIPayments like Google Pay and Paytm.
//
//Google Pay support these features so he can directly implement this UPIPayments but Paytm
// doesn’t support getCashBackAsCreditBalance() feature so here we shouldn’t force client
// paytm to override this method by implementating UPIPayments.

    //INSTEAD !!
interface CashbackManager{
        public void getCashBackAsCreditBalance();
}
//Now we can remove getCashBackAsCreditBalance from UPIPayments interface!!!!