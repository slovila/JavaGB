package JavaGB;

public class task_1 {
    public static void main(String[] args) {
        boolean[] bool = {false, false, true, false, false, true, true, true};
        System.out.println("  P\t" + "|"+   "Q\t" + "|"+ "P & Q\t"+ "|"+"P | Q\t"+ "|"+"P ^ Q \t" + "|"+"!P\t"+ "|");
        for (int i = 0; i < bool.length; i++) {
            boolean p = bool[i++];
            boolean q = bool[i];
            System.out.println(p + "\t" +"|"+ q + "\t"+"|" + (p & q) + "\t"+"|" + (p | q) + "\t"+"|" + (p ^ q) + "\t"+"|" + !p+"\t"+"|");
        }
    }
    }
    

