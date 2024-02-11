package src.java.string;

public class stringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Devil");
        System.out.println(sb);

        // charAt() at index o
        System.out.println(sb.charAt(0));

        // set charAt() at index o = P
        sb.setCharAt(0,'p');
        System.out.println(sb);

        // add and shift in index o
        sb.insert(0,"s");
        System.out.println(sb);

        // delete
        sb.delete(0,1);  // 0 to 0 and 1 is excluded
        System.out.println(sb);

        StringBuilder sbNew=new StringBuilder("D");
        sbNew.append("e");
        sbNew.append("v");
        sbNew.append("i");
        sbNew.append("l");
        System.out.println(sbNew);
    }
}
