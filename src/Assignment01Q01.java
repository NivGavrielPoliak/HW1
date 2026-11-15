public class Assignment01Q01 {
    public static void main(String[] args) {
        int LastAscii = 32;
        for (char ch: args[0].toCharArray()) {
            int CurrAscii = (int) ch;
            if(CurrAscii%5 == 0 && LastAscii == 32) {
                System.out.println(ch);
            }        
            LastAscii = CurrAscii;
        }
    }
}
