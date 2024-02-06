public class TestAccount {

    public static void main(String[] args) {
        Account a1 = new Account("1","John", 2500);
        System.out.println(a1.toString());
        System.out.println("id: "+a1.getId() +", name: " + a1.getName() + ", balance: "+ a1.getBalance() + ", credit: "+ a1.credit(2400) + ", debit:" + a1.debit(2600) + ", after transfer: " + a1.transferTo(new Account("6", "Tom", 1500),2500));
    }





}
