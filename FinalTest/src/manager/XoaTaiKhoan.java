package manager;

import commons.DocGhiTaiKhoan;
import models.TaiKhoanNganHang;

import java.util.List;
import java.util.Scanner;

public class XoaTaiKhoan {
        public static void xoaTaiKhoan(){
            String taiKhoanList;
           taiKhoanList= DocGhiTaiKhoan.docTaiKhoan();
            Scanner scanner =new Scanner(System.in);
            System.out.println("Nhập số tài khoản bạn muốn xóa:");
            String xoaTaiKhoan =scanner.nextLine();
            boolean flag=true;
            for (int i = 0; i <taiKhoanList.size() ; i++) {
                if(xoaTaiKhoan.equals(taiKhoanList.get(i).getMaTaiKhoan())){
                    System.out.println("Bạn có muốn xóa phương tiện có biển kiểm soát là :" +xoaTaiKhoan +" không? Nhấn phím 1 nếu đồng ý!");
                    String ok = scanner.nextLine();
                    if(Integer.parseInt(ok)==1){
                        taiKhoanList.remove(taiKhoanList.get(i));
                        DocGhiTaiKhoan.ghiTaiKhoan(taiKhoanList);
                        System.out.println("Đã xóa phương tiện có biển kiểm soát là :" + xoaTaiKhoan);}
                    flag=true;
                    break;
                } else {
                    flag=false;
                }
            } if(!flag){
                System.out.println("Không có mã tài khoản nanyf!");
            }
        }
}
