package zam2021PR1HK1;

public class BattleShipMap {
    public static void main(String[] args) {
        int[][] map = new int[][]{{0, 0, 0, +2, 0, +1, +1, 0, 0, 0,},
                {0, +3, -1, +2, 0, 0, 0, +2, 0, 0},
                {0, +3, -1, 0, +4, +4, 0, 0, +2, +2},
                {0, 0, +2, 0, 0, 0, 0, 0, 0, 0},
                {-1, 0, +2, 0, -1, +2, +2, 0, 0, 0},
                {-3, +1, 0, 0, -3, 0, -1, 0, 0, +3},
                {0, 0, 0, -3, 0, 0, 0, -1, 0, +3},
                {0, 0, -2, 0, -2, 0, -2, 0, 0, 0}};
        for (int i = 0; i < map.length; i++)
        {
            for (int j = 0; j < map[i].length; j++)
            {
                System.out.print(map[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public int totalBattleShipStrength(char player){
int sum = 0;
for (int i = 0; i<map.l)
    }
}