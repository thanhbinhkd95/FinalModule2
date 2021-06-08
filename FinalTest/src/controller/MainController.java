package controller;

import manager.HienThiTaiKhoan;
import manager.ThemTaiKhoan;
import manager.XoaTaiKhoan;

import java.io.IOException;
import java.util.Scanner;

public class MainController {
    public static void main(String[] args) throws IOException {
        Scanner scanner =new Scanner(System.in);
        int bienDem =0;
        while (bienDem<1){
            System.out.println("Chọn chức năng theo số (để tiếp tục):\n" +
                    "1.Thêm mới \n" +
                    "2.Xóa\n" +
                    "3.Xem danh sách tài khoản ngân hàng\n" +
                    "4.Tìm kiếm\n" +
                    "5.Thoát\n");
            String luaChon = scanner.nextLine();
            switch (luaChon){
                case "1":
                    ThemTaiKhoan.themTaiKhoan();
                    break;
                case "2":
                    XoaTaiKhoan.xoaTaiKhoan();
                    break;
                case "3":
                    HienThiTaiKhoan.hienThiTatCa();
                    break;
                case "4":
                    ThemTaiKhoan.timKiemKhachHang();
                    break;
                case "5":
                    bienDem++;
                    break;
                default:
                    System.err.println("Không có lựa chọn này!");
            }
        }

    }

}
