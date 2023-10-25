public class SingleResponsibilityPrinciple {
//    This principle states that “a class should have only one reason to change” which means
//    every class should have a single responsibility or single job or single purpose
//
//    The principle can be well understood with an example. Imagine there is a class
//    called BankService which performs following operations.
//    Withdraw
//    Deposit
//    Print Pass Book
//    Get Loan Info
//    Send OTP
}

    // BAD PRACTICE !!
class BankService {
    public long deposit(long amount, String accountNo) {
        //deposit amount
        return 0;
    }
    public long withDraw(long amount, String accountNo) {
        //withdraw amount
        return 0;
    }
    public void printPassbook() {
        //update transaction info in passbook
    }
    public void getLoanInterestInfo(String loanType) {
        if (loanType.equals("homeLoan")) {
            //do some job
        }
        if (loanType.equals("personalLoan")) {
            //do some job
        }
        if (loanType.equals("car")) {
            //do some job
        }
    }
    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            //write email related logic
            //use JavaMailSenderAPI
        }
    }
}

    // INSTEAD!!
class PrinterService{
    public void printPassbook() {
        //update transaction info in passbook
    }
}
class LoanService{
    public void getLoanInterestInfo(String loanType) {
        if (loanType.equals("homeLoan")) {
            //do some job
        }
        if (loanType.equals("personalLoan")) {
            //do some job
        }
        if (loanType.equals("car")) {
            //do some job
        }
    }
}
class NotificationService{
    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            //write email related logic
            //use JavaMailSenderAPI
        }
    }
}
