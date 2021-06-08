package models;

public class TaiKhoanThanhToan extends TaiKhoanNganHang {
    static String soThe;
    static String soTien;

    public TaiKhoanThanhToan(int i , String string , String soTien) {
    }

    public TaiKhoanThanhToan(String soThe , String soTien) {
        this.soThe = soThe;
        this.soTien = soTien;
    }

    public TaiKhoanThanhToan(String name , String soThe , String soTien) {
        super(name);
        this.soThe = soThe;
        this.soTien = soTien;
    }

    public TaiKhoanThanhToan(int id , String maTaiKhoan , String tenChuTaiKhoan , String ngayTaoTaiKhoan , String soThe , String soTien) {
        super(id , maTaiKhoan , tenChuTaiKhoan , ngayTaoTaiKhoan);
        this.soThe = soThe;
        this.soTien = soTien;
    }

    public String getSoThe() {
        return soThe;
    }

    public void setSoThe(String soThe) {
        this.soThe = soThe;
    }

    public String getSoTien() {
        return soTien;
    }

    public void setSoTien(String soTien) {
        this.soTien = soTien;
    }

    public String toString() {
        return "TaiKhoanThanhToan{" +
                "soThe='" + soThe + '\'' +
                ", soTien='" + soTien + '\'' +
                '}';
    }

    @Override
    public String showInfor() {
        return null;
    }

}
