package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        if (sideLength <= 0) {
            System.out.println("Invalid size. Please enter a positive integer.");
            return;
        }

        for (int i = 1; i <= sideLength; i++) {
            for (int j = 1; j <= sideLength; j++) {
                if (i == 1 || i == sideLength || j == 1 || j == sideLength) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
