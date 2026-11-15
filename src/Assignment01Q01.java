public class Assignment01Q01 {
    public static void main(String[] args) {
        for (String st: args) 
        {
            char ch = st.charAt(0);
            int CurrAscii = (int) ch;
            if(CurrAscii%5 == 0) {
                System.out.println(ch);
            }       
        }
    }
}
