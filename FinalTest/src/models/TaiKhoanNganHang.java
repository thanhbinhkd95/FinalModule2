package models;

import commons.DocGhiTaiKhoan;

public abstract class TaiKhoanNganHang extends DocGhiTaiKhoan {
    private static int idTemp = 6;
    private static int id;
    private static String maTaiKhoan;
    private static String tenChuTaiKhoan;
    private static String ngayTaoTaiKhoan;

    public TaiKhoanNganHang() {
    }

    TaiKhoanNganHang(String name){
        this.id = idTemp++; // set id equal idTemp
    }

    public TaiKhoanNganHang(int id , String maTaiKhoan , String tenChuTaiKhoan , String ngayTaoTaiKhoan) {
        this.id = id;
        this.maTaiKhoan = maTaiKhoan;
        this.tenChuTaiKhoan = tenChuTaiKhoan;
        this.ngayTaoTaiKhoan = ngayTaoTaiKhoan;
    }

    public static int getIdTemp() {
        return idTemp;
    }

    public static void setIdTemp(int idTemp) {
        TaiKhoanNganHang.idTemp = idTemp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaTaiKhoan() {
        return maTaiKhoan;
    }

    public void setMaTaiKhoan(String maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }

    public String getTenChuTaiKhoan() {
        return tenChuTaiKhoan;
    }

    public void setTenChuTaiKhoan(String tenChuTaiKhoan) {
        this.tenChuTaiKhoan = tenChuTaiKhoan;
    }

    public String getNgayTaoTaiKhoan() {
        return ngayTaoTaiKhoan;
    }

    public void setNgayTaoTaiKhoan(String ngayTaoTaiKhoan) {
        this.ngayTaoTaiKhoan = ngayTaoTaiKhoan;
    }

    public String toString() {
        return "TaiKhoanNganHang{" +
                "id=" + id +
                ", maTaiKhoan='" + maTaiKhoan + '\'' +
                ", tenChuTaiKhoan='" + tenChuTaiKhoan + '\'' +
                ", ngayTaoTaiKhoan='" + ngayTaoTaiKhoan + '\'' +
                '}';
    }
    public abstract String showInfor();
}
