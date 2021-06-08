package manager;

import commons.DocGhiTaiKhoan;
import models.TaiKhoanNganHang;
import models.TaiKhoanThanhToan;
import models.TaiKhoanTietKiem;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThemTaiKhoan {
    public static Scanner scanner = new Scanner(System.in);

    public static void themTaiKhoan() {
        System.out.println("Thêm Tài Khoản mới \n1.Thêm Tài khoản tiết kiệm\n2.Thêm Tài khoản thanh toán");
        String chon = scanner.nextLine();
        if (chon.equals("1")) {
            themTaiKhoanTietKiem();
        } else {
            themTaiKhoanThanhToan();
        }
    }

    public static void themTaiKhoanTietKiem() {
        System.out.println("Nhập mã ID: ");
        int id = TaiKhoanNganHang.getIdTemp();
        System.out.println("Nhập mã tài khoản: ");
        String maKhachHang = scanner.nextLine();
        System.out.println("Nhập họ và tên chủ tài khoản");
        String hoTen = scanner.nextLine();
        System.out.println("Ngày tạo tài khoản");
        String ngayTaoTaiKhoan = scanner.nextLine();
        System.out.println("Số tiền gởi tiết kiệm");
        String soTienGui = scanner.nextLine();
        System.out.println("Ngày gởi tiết kiệm");
        String ngayGui = scanner.nextLine();
        System.out.println("Lãi Suất");
        String laiSuat = scanner.nextLine();
        System.out.println("Kỳ hạn");
        String kyHan = scanner.nextLine();
        TaiKhoanTietKiem taiKhoanTietKiem = new TaiKhoanTietKiem(id , maKhachHang , hoTen , ngayTaoTaiKhoan , soTienGui , ngayGui , laiSuat , kyHan);
        DocGhiTaiKhoan.ghiTaiKhoan(taiKhoanTietKiem.toString());

    }

    public static void themTaiKhoanThanhToan() {
        System.out.println("Nhập mã ID: ");
        int id = TaiKhoanNganHang.getIdTemp();
        System.out.println("Nhập mã tài khoản: ");
        String maKhachHang = scanner.nextLine();
        System.out.println("Nhập họ và tên chủ tài khoản");
        String hoTen = scanner.nextLine();
        System.out.println("Nhập số thẻ");
        String ngayTaoTaiKhoan = scanner.nextLine();
        String soThe = scanner.nextLine();
        System.out.println("Nhập số tiền nộp thêm mới");
        String soTien = scanner.nextLine();

        TaiKhoanThanhToan taiKhoanThanhToan = new TaiKhoanThanhToan(id , maKhachHang , hoTen , ngayTaoTaiKhoan , soThe , soTien);
        DocGhiTaiKhoan.ghiTaiKhoan(taiKhoanThanhToan.toString());
    }

    public static void hienThiThongTinKhachHang() {
        System.out.println("Danh sách tài khoản Ngân Hàng: ");
        ArrayList<TaiKhoanNganHang> taiKhoanNganHangArrayList = (ArrayList<TaiKhoanNganHang>) DocGhiTaiKhoan.docTaiKhoan();
        for (TaiKhoanNganHang taiKhoanNganHang : taiKhoanNganHangArrayList) {
            System.out.println(taiKhoanNganHang);
            ;
        }

    }

    public static void timKiemKhachHangBangMaKhachHang() {
        System.out.println("Nhập mã khách hàng:");
        String maKhachHang = scanner.nextLine();
        List<TaiKhoanNganHang> taiKhoanArrayList = DocGhiTaiKhoan.docTaiKhoan();
        for (TaiKhoanNganHang khachHang : taiKhoanArrayList) {
            if (khachHang.getMaTaiKhoan().equals(maKhachHang)) {
                System.out.println("Đã tìm được khách hàng: ");
                if (khachHang instanceof TaiKhoanNganHang) {
                    ( (TaiKhoanThanhToan) khachHang ).showInfor();
                    return;
                } else {
                    ( (TaiKhoanTietKiem) khachHang ).showInfor();
                    return;
                }
            }
        }
        System.out.println("Không tìm thấy mã khách hàng này");
    }

    public static void timKiemKhachHangBangMaTen() {
        System.out.println("Nhập tên khách hàng: ");
        String tenKhachHang = scanner.nextLine();
        List<TaiKhoanNganHang> taiKhoanArrayList = DocGhiTaiKhoan.docTaiKhoan();
        for (TaiKhoanNganHang khachHang : taiKhoanArrayList) {
            if (khachHang.getTenChuTaiKhoan().equals(tenKhachHang)) {
                System.out.println("Đã tìm được khách hàng: ");
                if (khachHang instanceof TaiKhoanNganHang) {
                    ( (TaiKhoanTietKiem) khachHang ).showInfor();
                } else {
                    ( (TaiKhoanThanhToan) khachHang ).showInfor();
                }
            }
        }
    }

    public static void timKiemKhachHang() {
        System.out.println("Tìm bằng\n1.Mã khách hàng\n2.Họ tên");
        String chon = scanner.nextLine();
        if (chon.equals("1")) {
            timKiemKhachHangBangMaKhachHang();
        } else {
            timKiemKhachHangBangMaTen();
        }
    }

}

