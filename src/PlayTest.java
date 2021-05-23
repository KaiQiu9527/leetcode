public class PlayTest {

    public void play(int argument){
        System.out.println(argument * 10);
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a = a ^ b;   //a = 11110
        b = a ^ b;   //b = 01010
        a = a ^ b;   //a = 101 00
        System.out.println(a + "," + b);
        //a = 1010 b = 10100
        //01010
        //10100
        //11110

    }

    public void func1(int num){
        StringBuffer sb = new StringBuffer();
        while (num > 0) {
            sb.append(num % 10);
            num = num/10;
        }
        int revertNum = Integer.parseInt(sb.toString());
        System.out.println(revertNum);
    }


}
