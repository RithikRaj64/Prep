import java.util.Scanner;

public class MatrixRepresentation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of vertices : ");
        int v = s.nextInt();


        System.out.println("Enter the number of edges : ");
        int e = s.nextInt();

        int graph[][] = new int[v][v];

        int src, des;

        for(int i=1; i<=e; i++) {
            System.out.println("Enter the source of Edge " + i);
            src = s.nextInt();

            System.out.println("Enter the destination of Edge " + i);
            des = s.nextInt();
            
            graph[src-1][des-1] = graph[des-1][src-1] = 1;
        }

        for(int i=0; i<v; i++) {
            for(int j=0; j<v; j++) System.out.print(graph[i][j] + " ");
            System.out.println();
        }

        s.close();
    }
}
