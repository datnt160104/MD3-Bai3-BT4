package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng của ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int cols = scanner.nextInt();

// Tạo ma trận từ nhập liệu của người dùng
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập giá trị tại [" + i + ", " + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

// Tương tự như bước 1 để tìm giá trị lớn nhất của ma trận
        int maxVal = matrix[0][0];
        int maxRow = 0;
        int maxCol = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxVal) {
                    maxVal = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

// In kết quả tìm được
        System.out.println("Giá trị lớn nhất là: " + maxVal + ", tọa độ: [" + maxRow + ", " + maxCol + "]");
    }
}
