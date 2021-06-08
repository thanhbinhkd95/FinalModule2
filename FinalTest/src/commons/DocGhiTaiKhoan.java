package commons;

import models.TaiKhoanNganHang;
import models.TaiKhoanThanhToan;
import models.TaiKhoanTietKiem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class DocGhiTaiKhoan {
    public static List<TaiKhoanNganHang> docTaiKhoan() {
        List<TaiKhoanNganHang> taikhoan = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("F:\\FinalTest\\src\\data\\bank_accounts.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                if (strings.length == 8) {
                    TaiKhoanTietKiem TK = new TaiKhoanTietKiem(parseInt(strings[0]), strings[1] , strings[2], strings[3],strings[4] , strings[5], strings[6], strings[7]);
                    taikhoan.add(TK);
                } else {
                    TaiKhoanThanhToan TT =new TaiKhoanThanhToan(parseInt(strings[0]), strings[1], strings[2], strings[3],strings[4], strings[5]);
                    taikhoan.add(TT);
                }
            }
            bufferedReader.close();
            fileReader.close();
        }catch (Exception e) {
            e.getStackTrace();
        }
        return taikhoan;
    }



    public static void ghiTaiKhoan(String taiKhoanNganHang) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("F:\\FinalTest\\src\\data\\bank_accounts.csv", true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.newLine();
            bufferedWriter.close();

            } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }




   /* public static List<TaiKhoanThanhToan> docTaiKhoanThanhToan() {
        List<TaiKhoanThanhToan> taikhoan = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("F:\\FinalTest\\src\\data\\bank_accounts.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                if (strings.length ==6) {
                    TaiKhoanThanhToan TT =new TaiKhoanThanhToan(parseInt(strings[0]), strings[1], strings[2], strings[3],strings[4], strings[5]);
                    taikhoan.add(TT);
                }
            }
        }catch (Exception e) {
            e.getStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return taikhoan;
    }
    public static List<TaiKhoanTietKiem> docTaiKhoanTietKiem() {
        List<TaiKhoanTietKiem> taikhoan = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("F:\\FinalTest\\src\\data\\bank_accounts.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                if (strings.length == 3) {
                    TaiKhoanTietKiem TK = new TaiKhoanTietKiem(parseInt(strings[0]), strings[1] , strings[2], strings[3],strings[4] , strings[5], strings[6], strings[7]);
                    taikhoan.add(TK);
                }
            }
        }catch (Exception e) {
            e.getStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return taikhoan;
    }*/


}
