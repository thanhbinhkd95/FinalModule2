package manager;

import commons.DocGhiTaiKhoan;
import models.TaiKhoanNganHang;

import java.util.ArrayList;
import java.util.List;

public class HienThiTaiKhoan {
    public static void hienThiTatCa(){
            ArrayList<TaiKhoanNganHang> taiKhoanNganHangArrayListArrayList = (ArrayList<TaiKhoanNganHang>) DocGhiTaiKhoan.docTaiKhoan();
            for (TaiKhoanNganHang o: taiKhoanNganHangArrayListArrayList){
                System.out.println(o);

        }
    }
}
