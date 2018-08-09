package _54_isNumeric;

public class Main {
    public static void main(String[] args) {
            Solution solution = new Solution();
            String test = "-1E-16";
            char[] list = test.toCharArray();
            System.out.printf(solution.isNumeric(list)+"");
    }
}
