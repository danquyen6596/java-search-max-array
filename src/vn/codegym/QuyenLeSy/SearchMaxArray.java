package vn.codegym.QuyenLeSy;

import java.util.Scanner;

public class SearchMaxArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, j;
        double max;

        System.out.print("Nhập vào số dòng: ");
        i = scanner.nextInt();

        System.out.print("Nhập vào số cột: ");
        j = scanner.nextInt();
        double[][] array = new double[i][j];

        System.out.println("Nhập vào danh sách phẩn tử của mảng: ");
        for (int row = 0; row < array.length; row++)
        {
            for (int column = 0; column < array[row].length; column++)
            {
                System.out.print("a["+row+"]["+column+"] = ");
                array[row][column] = scanner.nextDouble();
            }
        }

        max = 0;

        for (int row2 = 0; row2 < array.length; row2++)
        {
            for (int column2 = 0; column2 < array[row2].length; column2++)
            {
                if(array[row2][column2] > max)
                    max = array[row2][column2];
            }
        }

        System.out.print("Phần tử lớn nhất trong mảng là: "+max);
    }
}
