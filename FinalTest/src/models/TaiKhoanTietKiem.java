package models;

public  class TaiKhoanTietKiem extends TaiKhoanNganHang {
    static String soTienTK;
    static String ngayGuiTK;
    static String laiSuat;
    static String kiHan;

    public TaiKhoanTietKiem() {
    }

    public TaiKhoanTietKiem(String soTienTK , String ngayGuiTK , String laiSuat , String kiHan) {
        this.soTienTK = soTienTK;
        this.ngayGuiTK = ngayGuiTK;
        this.laiSuat = laiSuat;
        this.kiHan = kiHan;
    }

    public TaiKhoanTietKiem(String name , String soTienTK , String ngayGuiTK , String laiSuat , String kiHan) {
        super(name);
        this.soTienTK = soTienTK;
        this.ngayGuiTK = ngayGuiTK;
        this.laiSuat = laiSuat;
        this.kiHan = kiHan;
    }

    public TaiKhoanTietKiem(int id , String maTaiKhoan , String tenChuTaiKhoan , String ngayTaoTaiKhoan , String soTienTK , String ngayGuiTK , String laiSuat , String kiHan) {
        super(id , maTaiKhoan , tenChuTaiKhoan , ngayTaoTaiKhoan);
        this.soTienTK = soTienTK;
        this.ngayGuiTK = ngayGuiTK;
        this.laiSuat = laiSuat;
        this.kiHan = kiHan;
    }

    public String toString() {
        return "TaiKhoanTietKiem{" +
                "soTienTK='" + soTienTK + '\'' +
                ", ngayGuiTK='" + ngayGuiTK + '\'' +
                ", laiSuat='" + laiSuat + '\'' +
                ", kiHan='" + kiHan + '\'' +
                '}';
    }

    @Override
    public String showInfor() {
        return null;
    }
}
