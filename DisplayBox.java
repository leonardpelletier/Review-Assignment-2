
class DisplayBox {

    public static void main(String[] args) {
        displayBox(6,3);
        System.out.println("");
        displayBox(1,7);
        System.out.println("");
        displayBox(8,9);
    }

    public static void displayBox(int w, int h) {
        for (int j = 0; j < h; j++) {
            for (int i = 0; i < w; i++) {
                System.out.print("$");
            }
            System.out.println("");
        }
    }
}