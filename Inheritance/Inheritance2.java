public class Inheritance2 {
    static class A{
        int money;
        private int pocketMoney;

        void fill(int money, int pocketMoney){
            this.money = money;
            this.pocketMoney = pocketMoney;
        }

        public int getPocketMoney(){
            return pocketMoney;
        }
    }

    static class B extends A{
        int total;
        void sum(){
            total = money + getPocketMoney();
        }
    }

    public static void main(String[] args) {
        B subob = new B();
        subob.fill(10, 12);
        subob.sum();
        System.out.println("Total :" + subob.total);
    }
}
