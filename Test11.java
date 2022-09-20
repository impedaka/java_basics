
class Test11{
    public static void main(String[] args){
        double money = 1000000;
        int year =0;
        int minus = 80000;
        double interest = 1.03;

        while (money >= minus){
            money-=minus;
            money*=interest;
            year++;

        }
        System.out.println(year);
    }
}