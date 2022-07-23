public class ejercicio1{
public void ejercicio1fp() {
    int[][] mA={{41,4,8},{12,16,20},{4,10,6}};
    int[][] mB={{40,2,4},{6,8,10},{2,5,3}}; 
    int[][] mR=new int[mA.length][mB.length];
    for (int i = 0; i < mA.length; i++) {
        for (int j = 0; j < mA[0].length; j++) {
            mR[i][j]=mA[i][j]-mB[i][j];
        }
    }
    imprimirMatrix(mR);
}

public void imprimirMatrix(int[][] m) {
    for (int i = 0; i < m.length; i++) {
        for (int j = 0; j < m[0].length; j++) {
            System.out.print(m[i][j]+"\t");
        }
        System.out.println("");
    }
}
public static void main(String[] args) {
    new ejercicio1().ejercicio1fp();
    
}
}