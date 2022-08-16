package QuanLiNhanVien;

import QuanLiNhanVien.model.CongTy;

import java.util.Scanner;

public class Main {

    public static final String NHANVIEN = "Nhan vien";
    public static final String TRUONGPHONG = "Truong phong";
    public static final String GIAMDOC = "Giam doc";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CongTy congTy = new CongTy();
        do {
            Integer luaChon = luaChonThongTin(scanner);
            switch(luaChon) {
                case 1 :
                    nhapThongTinCongTy(congTy, scanner);
                    break;
                case 2 :
                    phanboNhanVien(congTy, scanner);
                    break;
                case 3 :
                    themNhanSu(congTy, scanner);
                    break;
                case 4 :
                    xoaNhanVien(congTy, scanner);
                    break;
                case 5 :
                    congTy.xuatThongTinNhanVien();
                    break;
                case 6 :
                    congTy.tinhTongLuongCongTy();
                    break;
                case 7 :
                    congTy.timNhanVienCoLuongCaoNhat();
                    break;
                case 8 :
                    congTy.timTruongPhongCoSoLuongNhanVienNhieuNhat();
                    break;
                case 9 :
                    congTy.sapXepNhanVienTheoLuongGiamDan();
                    break;
                case 10 :
                    congTy.timGiamDocCophanNhieuNhat();
                    break;
                case 11 :
                    System.exit(0);;
            }
        } while(true);
    }

    /**
     * @param scanner
     * @return thong tin lua chon
     */
    public static Integer luaChonThongTin(Scanner scanner) {
        System.out.println("1.Nhap thong tin congy ty : ");
        System.out.println("2.Phan bo nhan vien vao truong phong : ");
        System.out.println("3.Thêm thông tin một nhân sư : ");
        System.out.println("4.Xóa thông tin một nhân sư : ");
        System.out.println("5.Xuat thông tin toàn bộ người trong công ty  : ");
        System.out.println("6.Tính và xuất tổng lương cho toàn bộ công ty : ");
        System.out.println("7.Tìm nhân viên thường có lương cao nhất : ");
        System.out.println("8.Tìm trưởng phòng có số lượng nhân viên nhiều nhất : ");
        System.out.println("9. Sắp xếp nhân viên theo thứ tự lương giảm dần : ");
        System.out.println("10.Tìm giám đốc có số lượng cổ phần nhiều nhất : ");
        System.out.println("11.Thoat chuong trinh");
        return(Integer.parseInt(scanner.nextLine()));
    }

    /**
     * Nhập thông tin công ty
     * @param congTy
     * @param scanner
     */
    public static void nhapThongTinCongTy(CongTy congTy, Scanner scanner) {
        System.out.println("Nhap thong tin công ty :");
        congTy.setThongTinCongTy(scanner.nextLine());
    }

    /**
     * Phân bổ nhân viên
     * @param congTy
     * @param scanner
     */
    public static void phanboNhanVien(CongTy congTy, Scanner scanner) {
        congTy.phanboNhanVienVaoTruongPhong(scanner);
    }

    /**
     * Thêm nhân viên
     * @param congTy
     * @param scanner
     */
    public static void themNhanSu(CongTy congTy, Scanner scanner) {
        String nhapMaSo = "Nhập mã số nhân viên : ";
        String nhapHoTen = "Nhập họ tên nhân viên ";
        String nhapSoDienThoai = "Nhập số điện thoại nhân viên";
        String nhapSoNgayLamViec = "Nhập số ngày làm việc";
        String nhapChucVu = "Nhap chức vụ của nhân viên :";
        Integer maSo = congTy.nhapSo(nhapMaSo, scanner);
        String hoTen = congTy.nhapChuoi(nhapHoTen, scanner);
        String soDienThoai = congTy.nhapChuoi(nhapSoDienThoai, scanner);
        Integer soNgayLamViec = congTy.nhapSo(nhapSoNgayLamViec, scanner);
        String chucVu = congTy.nhapChucVu(nhapChucVu, scanner);
        // Biến chucVu tra ra dung gia tri cần
        if (NHANVIEN.equalsIgnoreCase(chucVu)) {
            congTy.themNhanVien(maSo, hoTen, soDienThoai, soNgayLamViec, scanner);
        } else if (TRUONGPHONG.equalsIgnoreCase(chucVu)) {
            congTy.themTruongPhong(maSo, hoTen, soDienThoai, soNgayLamViec);
        } else if (GIAMDOC.equalsIgnoreCase(chucVu)) {
            congTy.themGiamDoc(maSo, hoTen, soDienThoai, soNgayLamViec, scanner);
        }
    }

    /**
     * Xóa nhân viên
     * @param congTy
     * @param scanner
     */
    public static void xoaNhanVien(CongTy congTy, Scanner scanner) {
        System.out.print("Nhap ten nhan vien muon xoa : ");
        String tenNhanVien = scanner.nextLine();
        Integer soNhanVienXoa = congTy.xoaNhanVien(tenNhanVien);
        if (soNhanVienXoa == 0) {
            System.out.println("Sô nhân vien bi xoa : 0");
        } else {
            System.out.println("Sô nhân viên bi xoa : " + soNhanVienXoa);
        }
    }

}

