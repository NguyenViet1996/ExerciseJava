package QuanLiNhanVien;

import java.util.Scanner;

public class Main {

    public static final String NHANVIEN = "Nhan vien";
    public static final String TRUONGPHONG = "Truong phong";
    public static final String GIAMDOC = "Giam doc";
    public static final String TONTAI = "ton tai";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CongTy congTy = new CongTy();
        do {
            int luaChon = luaChonThongTin(scanner);
            switch(luaChon) {
                case 1 :
                    nhapThongTinCongTy(congTy,scanner);
                case 2 :
                    phanboNhanVien(congTy,scanner);
                case 3 :
                    themNhanVien(congTy,scanner);
                case 4 :
                    xoaNhanVien(congTy,scanner);
                case 5 :
                    congTy.xuatThongTinNhanVien();
            }
        } while(true);
    }

    /**
     * @param scanner
     * @return thong tin lua chon
     */
    public static int luaChonThongTin(Scanner scanner) {
        System.out.println("1.Nhap thong tin congy ty : ");
        System.out.println("2.Phan bo nhan vien vao truong phong : ");
        System.out.println("3.Thêm thông tin một nhân sư : ");
        System.out.println("4.Xóa thông tin một nhân sư : ");
        System.out.println("5.Xuat thông tin toàn bộ người trong công ty  : ");
        System.out.println("6.Tìm nhân viên thường có lương cao nhất : ");
        System.out.println("7.Xuất tổng lương cho toàn công ty : ");
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
        System.out.println("Nhap thong tin nhan vien : ");
        String nhanVien = scanner.nextLine();
        System.out.println("Nhap thong tin truong phong :");
        String truongPhong = scanner.nextLine();
        congTy.phanboNhanVienVaoTruongPhong(nhanVien, truongPhong);
    }

    /**
     * Thêm nhân viên
     * @param congTy
     * @param scanner
     */
    public static void themNhanVien(CongTy congTy, Scanner scanner) {
        System.out.println("Nhap mã số nhân viên :");
        int maSo  = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap họ và tên nhân viên :");
        String hoTen = scanner.nextLine();
        System.out.println("Nhap số điện thoại nhân viên :");
        String soDienThoai = scanner.nextLine();
        System.out.println("Nhap số ngày làm việc của nhân viên :");
        int soNgayLamViec  = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap chức vụ của nhân viên :");
        String chucVu = scanner.nextLine();
        if (NHANVIEN.equalsIgnoreCase(chucVu)) {
            System.out.println("Nhap ten truong phong");
            String truongPhong = scanner.nextLine();
            congTy.themNhanVien(new NhanVien(maSo, hoTen, soDienThoai, soNgayLamViec, truongPhong));
        } else if (TRUONGPHONG.equalsIgnoreCase(chucVu)) {
            System.out.println("Nhap sô lượng nhân viên dưới quyền : ");
            int soLuongNhanVien = Integer.parseInt(scanner.nextLine());
            congTy.themNhanVien(new TruongPhong(maSo, hoTen, soDienThoai, soNgayLamViec, soLuongNhanVien));
        } else if (GIAMDOC.equalsIgnoreCase(chucVu)) {
            System.out.println("Nhap sô lượng nhân viên dưới quyền : ");
            double soCoPhan = Double.parseDouble(scanner.nextLine());
            congTy.themNhanVien(new GiamDoc(maSo, hoTen, soDienThoai, soNgayLamViec, soCoPhan));
        }
    }

    /**
     * Xóa nhân viên
     * @param congTy
     * @param scanner
     */
    public static void xoaNhanVien(CongTy congTy, Scanner scanner) {
        System.out.println("Nhập loại nhân viên muốn xóa : ");
        String loaiNhanVien = scanner.nextLine();
        String ketQuaKiemTra = congTy.kiemTraNhanVienCoTonTai(loaiNhanVien);
        if (TONTAI.equalsIgnoreCase(ketQuaKiemTra)) {
            if (NHANVIEN.equalsIgnoreCase(loaiNhanVien)) {
                System.out.println("Nhâp tên nhân viên muốn xóa :");
                String tenNhanVien = scanner.nextLine();
                congTy.xoaNhanVien(tenNhanVien);
            } else if (TRUONGPHONG.equalsIgnoreCase(loaiNhanVien)) {
                System.out.println("Nhâp tên truong phong muốn xóa :");
                String tenTruongPhong = scanner.nextLine();
                congTy.xoaTruongPhong(tenTruongPhong);
                congTy.xoaTruongPhongKhoiNhanVien(tenTruongPhong);
            } else if (GIAMDOC.equalsIgnoreCase(loaiNhanVien)) {
                System.out.println("Nhâp tên truong phong muốn xóa :");
                String tenGiamDoc = scanner.nextLine();
                congTy.xoaGiamDoc(tenGiamDoc);
            }
        }
    }




}

