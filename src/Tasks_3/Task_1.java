package Tasks_3;
public class Task_1 {
    public static void main(String[] args) {
        int mul [][] = new int[10][10];
        int i,j;
        for(i=0;i<10;i++){
            for(j=0;j< 10;j++){
                mul[i][j]=(i+1)*(j+1);
                System.out.print(mul[i][j]+"\t");
            }
            System.out.println();
        }
    }
}