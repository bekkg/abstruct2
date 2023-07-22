public class A extends Bank{
    public  String bal ;

    public A(String bal) {
        this.bal = bal;
    }

    @Override
    public void getBalance() {
        System.out.println("100 $$");

    }

    public String getBal() {
        return bal;
    }

    public void setBal(String bal) {
        this.bal = bal;
    }

    @Override
    public String toString() {
        return "A{" +
                "bal='" + bal + '\'' +
                '}';
    }
}
