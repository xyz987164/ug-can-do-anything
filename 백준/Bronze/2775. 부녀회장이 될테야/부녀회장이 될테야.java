import java.io.*;
import java.util.*;

public class Main{
    public static int[][] APT = new int[15][15];
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        makeAPT();
        
        int T=Integer.parseInt(br.readLine());
        
        for(int i=0; i<T; i++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            sb.append(APT[k][n]).append('\n');
        }
        System.out.println(sb);
    }
    
    public static void makeAPT(){
        for(int i=0; i<15; i++){
            APT[i][1]=1;
            APT[0][i]=i;
        }
        for(int i=1; i<15; i++){
            for(int j=2; j<15; j++){
                APT[i][j] = APT[i][j-1]+APT[i-1][j];
            }
        }
    }
    
}