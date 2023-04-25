public class Stufen {
    public static void main(String[] args) {
        int numStufen = 4;
        int StufenWeite = 8;

        for(int i = 0; i < numStufen; i++) {
            for(int j = 0; j <(i+1) * StufenWeite; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
