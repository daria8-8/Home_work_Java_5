public class Ex3 {
    private int[] column; 
    private int[] rup;
    private int[] lup;
    private int[] queen;
    private int num;
    public Ex3() {
        column = new int[8+1];
        rup = new int[(2*8)+1];
        lup = new int[(2*8)+1];
        for (int i = 1; i <= 8; i++)
            column[i] = 0;
        for (int i = 1; i <= (2*8); i++)
            rup[i] = lup[i] = 0; 
        queen = new int[8+1];
    }
    public void backtrack(int i) {
        if (i > 8) {
            showAnswer();
        } else {
            for (int j = 1; j <= 8; j++) {
                if ((column[j] == 0) && (rup[i+j] == 0) && (lup[i-j+8] == 0)) {
                    queen[i] = j; 
                    column[j] = rup[i+j] = lup[i-j+8] = 1;
                    backtrack(i+1); 
                    column[j] = rup[i+j] = lup[i-j+8] = 0;
                }
            }
        }
    }
    protected void showAnswer() {
        num++;
        System.out.println("\nОтвет" + num);
        for (int y = 1; y <= 8; y++) {
            for (int x = 1; x <= 8; x++) {
                if(queen[y]==x) {
                    System.out.print("Q");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Ex3 queen = new Ex3();
        queen.backtrack(1);
    }
}