public class Main {
    public static void main(String[] args) {
        int[] tab = new int[10];
        for (int i = tab.length - 1; i >= 0; i--) {
            tab[i] = 9 - i;
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.println("array[" + i + "]=" + tab[i]);
        }
    }
}
