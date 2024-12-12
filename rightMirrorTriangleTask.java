package taskCode;

public class rightMirrorTriangleTask {

    public static void main(String[] args) {
        int rows = 6;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) 
                System.out.print(" ");    // This loop prints spaces btw rows
            
            for (int j = 1; j <= i; j++) // This loop prints stars
                System.out.print("*");
            
            System.out.println(); 
        }
    }
}
