import java.util.Scanner;

public class LupinMaze {
    // Movimientos: arriba, abajo, izquierda, derecha
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine().trim());
        String salida = "";

        while (T > 0) {
            T = T - 1;

            String[] nm = sc.nextLine().trim().split("\\s+");
            int N = Integer.parseInt(nm[0]);
            int M = Integer.parseInt(nm[1]);

            char[][] grid = new char[N][M];
            int sr = -1, sc2 = -1, er = -1, ec = -1;

            for (int i = 0; i < N; i++) {
                String line = sc.nextLine();
                for (int j = 0; j < M; j++) {
                    grid[i][j] = line.charAt(j);
                    if (grid[i][j] == 'L') {
                        sr = i;
                        sc2 = j;
                    } else if (grid[i][j] == 'E') {
                        er = i;
                        ec = j;
                    }
                }
            }

            // Matriz de distancias, inicializada en -1 (no visitado)
            int[][] dist = new int[N][M];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    dist[i][j] = -1;
                }
            }

            // Cola implementada con arreglos simples y dos indices (frente y final)
            int[] colaR = new int[N * M];
            int[] colaC = new int[N * M];
            int frente = 0;
            int fin = 0;

            dist[sr][sc2] = 0;
            colaR[fin] = sr;
            colaC[fin] = sc2;
            fin = fin + 1;

            while (frente < fin) {
                int r = colaR[frente];
                int c = colaC[frente];
                frente = frente + 1;

                if (r == er && c == ec) {
                    break;
                }

                for (int d = 0; d < 4; d++) {
                    int nr = r + dx[d];
                    int nc = c + dy[d];

                    if (nr >= 0 && nr < N && nc >= 0 && nc < M &&
                        grid[nr][nc] != '#' && dist[nr][nc] == -1) {
                        dist[nr][nc] = dist[r][c] + 1;
                        colaR[fin] = nr;
                        colaC[fin] = nc;
                        fin = fin + 1;
                    }
                }
            }

            if (dist[er][ec] == -1) {
                salida = salida + "NO\n";
            } else {
                salida = salida + dist[er][ec] + "\n";
            }
        }

        System.out.print(salida);
    }
}
