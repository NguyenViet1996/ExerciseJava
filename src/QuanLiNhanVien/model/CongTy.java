package QuanLiNhanVien.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CongTy {

    private String thongTinCongTy;
    private List<NhanSu> danhSachNhanSu;
    public static final String NHANVIEN = "Nhan vien";
    public static final String TRUONGPHONG = "Truong phong";
    public static final String GIAMDOC = "Giam doc";

    public CongTy() {
        this.danhSachNhanSu = new ArrayList<>();
    }

    public String getThongTinCongTy() {
        return thongTinCongTy;
    }

    public void setThongTinCongTy(String thongTinCongTy) {
        this.thongTinCongTy = thongTinCongTy;
    }

    /**
     * Thêm nhân viên mới
     * @param maSo
     * @param hoTen
     * @param soDienThoai
     * @param soNgayLamViec
     * @param scanner
     */
    public void themNhanVien(Integer maSo, String hoTen, String soDienThoai, Integer soNgayLamViec, Scanner scanner) {
        List<TruongPhong> danhSachTruongPhong = new ArrayList<>();
        for (NhanSu nhansu : this.danhSachNhanSu) {
            if (nhansu instanceof TruongPhong) {
                danhSachTruongPhong.add((TruongPhong) nhansu);
            }
        }
        if (danhSachTruongPhong.size() == 0) {
            System.out.println("Không tồn tại trưởng phòng trong danh sách ");
        } else {
            System.out.println("Danh sach cac truong phong : ");
            for (TruongPhong truongphong : danhSachTruongPhong) {
                System.out.println(truongphong);
            }
        }
        String nhapIdTruongPhong = "Nhap ma so id truong phong : ";
        Integer idTruongPhong = this.nhapSo(nhapIdTruongPhong, scanner);
        for (TruongPhong truongphong : danhSachTruongPhong) {
            if (Objects.equals(truongphong.getMaSo(), idTruongPhong)) {
                truongphong.getDanhSachNhanVienDuoiQuyen().add(new NhanVien(maSo, hoTen, soDienThoai, soNgayLamViec, idTruongPhong));
                break;
            };
        }
        this.danhSachNhanSu.add(new NhanVien(maSo, hoTen, soDienThoai, soNgayLamViec, idTruongPhong));
    }

    /**
     * Thêm trưởng phòng mới
     * @param maSo
     * @param hoTen
     * @param soDienThoai
     * @param soNgayLamViec
     */
    public void themTruongPhong(Integer maSo, String hoTen, String soDienThoai, Integer soNgayLamViec) {
        this.danhSachNhanSu.add(new TruongPhong(maSo, hoTen, soDienThoai, soNgayLamViec));
    }

    /**
     * Thêm giám đốc
     * @param maSo
     * @param hoTen
     * @param soDienThoai
     * @param soNgayLamViec
     * @param scanner
     */
    public void themGiamDoc(Integer maSo, String hoTen, String soDienThoai, Integer soNgayLamViec, Scanner scanner) {
        String nhapSoCoPhan = "Nhập số cổ phần : ";
        Double coPhan = this.nhapSoThapPhan(nhapSoCoPhan, scanner);
        this.danhSachNhanSu.add(new GiamDoc(maSo, hoTen, soDienThoai, soNgayLamViec, coPhan));
    }

    /**
     * Kiem tra du lieu chuoi
     * @param scanner
     * @return
     */
    public String nhapChuoi(String yeuCauNhapChuoi, Scanner scanner) {
        String chuoiDuLieu;
        do {
            System.out.println(yeuCauNhapChuoi);
            chuoiDuLieu = (scanner.nextLine()).trim();
        } while (chuoiDuLieu.length() == 0);
        return chuoiDuLieu;
    }

    /**
     * Kiem tra du lieu so nguyen duong
     * @param yeuCauNhapSo
     * @param scanner
     * @return
     */
    public Integer nhapSo(String yeuCauNhapSo, Scanner scanner) {
        Integer duLieuSoNguyen;
        do {
            System.out.println(yeuCauNhapSo);
            try {
                duLieuSoNguyen = Integer.parseInt(scanner.nextLine());
                if (duLieuSoNguyen > 0) break;
            } catch(Exception e) {
                System.out.println(e);
            }
        } while(true);
        return duLieuSoNguyen;
    }

    /**
     * Kiem tra du lieu so nguyen thap phan lon hon 0
     * @param yeuCauNhapSo
     * @param scanner
     * @return
     */
    public Double nhapSoThapPhan(String yeuCauNhapSo, Scanner scanner) {
        Double duLieuSoThapPhan;
        do {
            System.out.println(yeuCauNhapSo);
            try {
                duLieuSoThapPhan = Double.parseDouble(scanner.nextLine());
                if (duLieuSoThapPhan > 0) break;
            } catch(Exception e) {
                System.out.println(e);
            }
        } while(true);
        return duLieuSoThapPhan;
    }

    /**
     * Kiem tra chuc vu nhan vien
     * @param yeuCauNhapChucVu
     * @param scanner
     * @return
     */
    public String nhapChucVu(String yeuCauNhapChucVu, Scanner scanner) {
        String chucVu = null;
        while(true) {
            chucVu = this.nhapChuoi(yeuCauNhapChucVu,scanner);
            if (NHANVIEN.equalsIgnoreCase(chucVu) || GIAMDOC.equalsIgnoreCase(chucVu) || TRUONGPHONG.equalsIgnoreCase(chucVu)) {
                break;
            }
        }
        return chucVu;
    }

    /**
     * Phân bô nhân vien vao truong phong
     * @param scanner
     */
    public void phanboNhanVienVaoTruongPhong(Scanner scanner) {
        if (this.danhSachNhanSu.size() == 0) {
            System.out.println("Danh sach nhân viên trống .");
        } else {
            List<TruongPhong> danhSachTruongPhong = new ArrayList<>();
            for (NhanSu nhansu : this.danhSachNhanSu) {
                if (nhansu instanceof TruongPhong) danhSachTruongPhong.add((TruongPhong) nhansu);
            }
            if (danhSachTruongPhong.size() == 0) {
                System.out.println("Trong danh sach không có trưởng phòng");
            } else {
                for (TruongPhong truongphong : danhSachTruongPhong) {
                    System.out.println(truongphong);
                }
                String nhapMaSo = "Nhập mã số nhân viên : ";
                String nhapHoTen = "Nhập họ tên nhân viên ";
                String nhapSoDienThoai = "Nhập số điện thoại nhân viên";
                String nhapSoNgayLamViec = "Nhập số ngày làm việc";
                Integer maSo = this.nhapSo(nhapMaSo, scanner);
                String hoTen = this.nhapChuoi(nhapHoTen, scanner);
                String soDienThoai = this.nhapChuoi(nhapSoDienThoai, scanner);
                Integer soNgayLamViec = this.nhapSo(nhapSoNgayLamViec, scanner);
                this.themNhanVien(maSo, hoTen, soDienThoai, soNgayLamViec, scanner);
            }
        }
    }

    /**
     * Xoa nhan vien
     * @param tenNhanVien
     * @return
     */
    public Integer xoaNhanVien(String tenNhanVien) {
        Integer soNhanVienBiXoa = 0;
        if (this.danhSachNhanSu.size() >0) {
            for (NhanSu nhansu : this.danhSachNhanSu) {
                if (tenNhanVien.equalsIgnoreCase(nhansu.getHoTen())) {
                    if (nhansu instanceof TruongPhong) {
                        this.xoaTruongPhongThamChieuToiNhanVien(nhansu.getMaSo());
                    }
                    this.danhSachNhanSu.remove(this.danhSachNhanSu.indexOf(nhansu));
                    soNhanVienBiXoa++;
                }
            }
        }
        return soNhanVienBiXoa;

    }

    /**
     * Ngắt liên kết trưởng phòng với nhân viên đang tham chiếu tới
     * @param idTruongPhong
     */
    public void xoaTruongPhongThamChieuToiNhanVien(Integer idTruongPhong) {
        for (NhanSu nhansu : this.danhSachNhanSu) {
            if ((nhansu instanceof NhanVien) &&  (idTruongPhong == ((NhanVien) nhansu).getIdTruongPhong())) {
                    ((NhanVien) nhansu).setIdTruongPhong(0);
            }
        }
    }

    /**
     * Xuat thong tin nhan vien
     */
    public void xuatThongTinNhanVien() {
        if (this.danhSachNhanSu.size() > 0) {
            System.out.println(this.getThongTinCongTy());
            for (NhanSu nhansu : this.danhSachNhanSu) {
                System.out.println(nhansu);
            }
        } else {
            System.out.println("Danh sach nhan vien trống .");
        }

    }

    /**
     * Tinh tong luong cong ty
     */
    public void tinhTongLuongCongTy() {
        int tongLuong = 0;
        for (NhanSu nhansu : this.danhSachNhanSu) {
            tongLuong += nhansu.tinhLuong();
        }
        System.out.println("Tổng lương công ty : " + tongLuong);
    }

    /**
     * Tìm nhân viên thường có lương cao nhất
     */
    public void timNhanVienCoLuongCaoNhat() {
        List<NhanSu> listNhanVien = this.danhSachNhanSu.stream().filter(nhansu -> nhansu instanceof NhanVien)
            .sorted((nhanvien1,nhanvien2)-> Double.compare(nhanvien2.tinhLuong(),nhanvien1.tinhLuong())).collect(Collectors.toList());
        List<NhanSu> listNhanVienCoLuongCaoNhat = new ArrayList<>();
        NhanSu nhanVienLuongCaoNhat = listNhanVien.get(0);
        for (int i = 1 ; i < (listNhanVien.size() - 1); i++) {
            if (listNhanVien.get(i).tinhLuong() > nhanVienLuongCaoNhat.tinhLuong()) {
                nhanVienLuongCaoNhat = listNhanVien.get(i);
                listNhanVienCoLuongCaoNhat.add(nhanVienLuongCaoNhat);
            } else if (listNhanVien.get(i).tinhLuong() == nhanVienLuongCaoNhat.tinhLuong()) {
                listNhanVienCoLuongCaoNhat.add(listNhanVien.get(i));
            }
        }
        if (listNhanVienCoLuongCaoNhat.size() > 0) {
            System.out.println("Nhân viên thường có lương cao nhất : ");
            for (NhanSu nhansu : listNhanVienCoLuongCaoNhat) {
                System.out.println(nhansu);
            }
        } else {
            System.out.println("Danh sach nhân viên không có nhân viên thường");
        }

    }

    /**
     * Tìm trưởng phòng có số lượng nhân viên nhiều nhất
     */
    public void timTruongPhongCoSoLuongNhanVienNhieuNhat() {
        List<NhanSu> listTruongPhong = this.danhSachNhanSu.stream().filter(nhansu -> nhansu instanceof TruongPhong).collect(Collectors.toList());
        listTruongPhong = listTruongPhong.stream().sorted((truongphong1, truongphong2)
            -> Integer.compare(((TruongPhong) truongphong2).getDanhSachNhanVienDuoiQuyen().size(),((TruongPhong) truongphong1).getDanhSachNhanVienDuoiQuyen().size())).collect(Collectors.toList());
        List<NhanSu> listTruongPhongCoLuongCaoNhat = new ArrayList<>();
        NhanSu truongPhongCoSoLuongNhanVienNhieuNhat = listTruongPhong.get(0);
        for (int i = 1; i < (listTruongPhong.size() - 1); i++) {
            if (((TruongPhong)listTruongPhong.get(i)).getDanhSachNhanVienDuoiQuyen().size() > ((TruongPhong)truongPhongCoSoLuongNhanVienNhieuNhat).getDanhSachNhanVienDuoiQuyen().size()) {
                truongPhongCoSoLuongNhanVienNhieuNhat = listTruongPhong.get(i);
                listTruongPhongCoLuongCaoNhat.add(truongPhongCoSoLuongNhanVienNhieuNhat);
            } else if (((TruongPhong)listTruongPhong.get(i)).getDanhSachNhanVienDuoiQuyen().size() == ((TruongPhong)truongPhongCoSoLuongNhanVienNhieuNhat).getDanhSachNhanVienDuoiQuyen().size()) {
                listTruongPhongCoLuongCaoNhat.add(listTruongPhong.get(i));
            }
        }
        if (listTruongPhongCoLuongCaoNhat.size() > 0) {
            System.out.println("Truong phong có lương cao nhất : ");
            for (NhanSu nhansu : listTruongPhongCoLuongCaoNhat) {
                System.out.println(nhansu);
            }
        } else {
            System.out.println("Danh sach nhân viên không có truong phong");
        }
    }

    /**
     * Sap xep nhan vien theo luong giam dan
     */
    public void sapXepNhanVienTheoLuongGiamDan() {
        this.danhSachNhanSu = this.danhSachNhanSu.stream().sorted((nhansu1, nhansu2)-> Double.compare(nhansu2.tinhLuong(),nhansu1.tinhLuong())).collect(Collectors.toList());
        for (NhanSu nhansu : this.danhSachNhanSu) {
            System.out.println(nhansu);
        }
    }

    /**
     * Tìm giám đốc có cổ phần nhiều nhất
     */
    public void timGiamDocCophanNhieuNhat() {
        List<NhanSu> listGiamDoc = this.danhSachNhanSu.stream().filter(nhansu -> nhansu instanceof GiamDoc).collect(Collectors.toList());
        listGiamDoc = listGiamDoc.stream().sorted((giamdoc1, giamdoc2)
            -> Double.compare(((GiamDoc) giamdoc2).getCoPhan(),((GiamDoc) giamdoc1).getCoPhan())).collect(Collectors.toList());
        List<NhanSu> listGiamDocCoPhanNhieuNhat = new ArrayList<>();
        NhanSu giamDocCoPhanNhieuNhat = listGiamDoc.get(0);
        for (int i = 1 ; i < (listGiamDoc.size() - 1); i++) {
            if (((GiamDoc)listGiamDoc.get(i)).getCoPhan() > ((GiamDoc)giamDocCoPhanNhieuNhat).getCoPhan()) {
                giamDocCoPhanNhieuNhat = listGiamDoc.get(i);
                listGiamDocCoPhanNhieuNhat.add(giamDocCoPhanNhieuNhat);
            } else if (((GiamDoc)listGiamDoc.get(i)).getCoPhan() == ((GiamDoc)giamDocCoPhanNhieuNhat).getCoPhan()) {
                listGiamDocCoPhanNhieuNhat.add(listGiamDoc.get(i));
            }
        }
        if (listGiamDocCoPhanNhieuNhat.size() > 0) {
            System.out.println("Giam1 đốc có lương cao nhất : ");
            for (NhanSu nhansu : listGiamDocCoPhanNhieuNhat) {
                System.out.println(nhansu);
            }
        } else {
            System.out.println("Danh sach nhân viên không có giám đốc");
        }
    }

}
