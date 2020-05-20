import com.sun.javaws.IconUtil;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Bishop bishop = new Bishop();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tọa độ ban đầu: ");
        String position = scanner.nextLine();

        char nowColumnChar = position.charAt(0);
        int nowColumn = nowColumnChar - 97;
        int nowRow = Integer.parseInt(position.substring(1)) - 1;

        bishop.setX(nowColumn);
        bishop.setY(nowRow);

        System.out.println("Nhập tọa độ di chuyển");
        String nextPosition = scanner.nextLine();
        char nextColumnChar = nextPosition.charAt(0);
        int nextColumn = nextColumnChar - 97;
        int nextRow = Integer.parseInt(nextPosition.substring(1)) - 1;

        boolean result = bishop.isValidPath(nextRow, nextColumn);

        if (result) {
            System.out.println("đi đúng");
        } else {
            System.out.println("đi sai");
        }
    }
}
