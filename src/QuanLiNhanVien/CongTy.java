package QuanLiNhanVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class CongTy {

    private String thongTinCongTy;
    private List<NhanSu> danhSachNhanVien;
    public static final String NHANVIEN = "Nhân viên";
    public static final String TRUONGPHONG = "Trưởng phòng";
    public static final String GIAMDOC = "Giam đốc";

    public CongTy() {
        this.danhSachNhanVien = new ArrayList<>();
    }

    public String getThongTinCongTy() {
        return thongTinCongTy;
    }

    public void setThongTinCongTy(String thongTinCongTy) {
        this.thongTinCongTy = thongTinCongTy;
    }

    public void themNhanVien(NhanSu nhanSu) {
        this.danhSachNhanVien.add(nhanSu);
    }

    /**
     * Phân bô nhân vien vao truong phong
     * @param nhanVien
     * @param truongPhong
     */
    public void phanboNhanVienVaoTruongPhong(String nhanVien, String truongPhong) {
        if (this.danhSachNhanVien.size() == 0) {
            System.out.println("Danh sach nhân viên trống .");
        } else {
             for(NhanSu nhansu : this.danhSachNhanVien) {
                 if (nhansu instanceof NhanVien) {
                     if (nhanVien.equalsIgnoreCase(nhansu.getHoTen())) {
                         if (((NhanVien) nhansu).getTruongPhong() == null) {
                             ((NhanVien) nhansu).setTruongPhong(truongPhong);
                             System.out.println("Phân bổ thành công");
                         }  else {
                             System.out.println("Nhan vien : " + nhansu.getHoTen() + " đã làm việc cùng với trưởng phòng : " + ((NhanVien) nhansu).getTruongPhong());
                         }
                     }
                 }
             }
        }
    }

    /**
     * Kiem tra nhan vien co ton tai hay khong
     * @param loaiNhanVien
     * @return
     */
    public String kiemTraNhanVienCoTonTai(String loaiNhanVien) {
        String ketQuaKiemTraNhanVien = "";
        boolean khongTonTai = true;
        if (this.danhSachNhanVien.size() == 0) {
            System.out.println("Danh sach nhân viên trống .");
        } else {
            if (NHANVIEN.equalsIgnoreCase(loaiNhanVien)) {
                for (NhanSu nhansu : this.danhSachNhanVien) {
                    if (nhansu instanceof NhanVien) {
                        khongTonTai = false;
                        System.out.println("Trong danh sách nhân viên có tồn tại : " + loaiNhanVien);
                        return ketQuaKiemTraNhanVien = "ton tai";
                    }
                }
            } else if (TRUONGPHONG.equalsIgnoreCase(loaiNhanVien)) {
                for (NhanSu nhansu : this.danhSachNhanVien) {
                    if (nhansu instanceof TruongPhong) {
                        khongTonTai = false;
                        System.out.println("Trong danh sách nhân viên có tồn tại : " + loaiNhanVien);
                        return ketQuaKiemTraNhanVien = "ton tai";
                    }
                }
            } else if (GIAMDOC.equalsIgnoreCase(loaiNhanVien)) {
                for (NhanSu nhansu : this.danhSachNhanVien) {
                    if (nhansu instanceof GiamDoc) {
                        khongTonTai = false;
                        System.out.println("Trong danh sách nhân viên có tồn tại : " + loaiNhanVien);
                        return ketQuaKiemTraNhanVien = "ton tai";
                    }
                }
            }
        }
        if (khongTonTai) {
            System.out.println("Trong danh sách nhân viên không tồn tai " + loaiNhanVien);
        }
        return ketQuaKiemTraNhanVien;
    }

    /**
     * Xoa nhan vien khoi danh sach
     * @param tenNhanVien
     */
    public void xoaNhanVien(String tenNhanVien) {
        for (NhanSu nhansu : this.danhSachNhanVien) {
            if ( (nhansu instanceof NhanVien) && tenNhanVien.equalsIgnoreCase(nhansu.getHoTen()) ) {
               this.danhSachNhanVien.remove(this.danhSachNhanVien.indexOf(nhansu));

            }
        }
    }

    /**
     * Xoa truong phong khoi danh sach
     * @param tenTruongPhong
     */
    public void xoaTruongPhong(String tenTruongPhong) {
        for (NhanSu nhansu : this.danhSachNhanVien) {
            if ( (nhansu instanceof TruongPhong) && tenTruongPhong.equalsIgnoreCase(nhansu.getHoTen()) ) {
                this.danhSachNhanVien.remove(this.danhSachNhanVien.indexOf(nhansu));

            }
        }
    }

    /**
     * Xoa ten truong phong khoi nhan vien
     * @param tenTruongPhong
     */
    public void xoaTruongPhongKhoiNhanVien(String tenTruongPhong) {
        for (NhanSu nhansu : this.danhSachNhanVien) {
            if ( (nhansu instanceof NhanVien) && tenTruongPhong.equalsIgnoreCase(((NhanVien) nhansu).getTruongPhong()) ) {
                ((NhanVien) nhansu).setTruongPhong("");
            }
        }
    }

    /**
     * Xoa giam doc khoi danh sach
     * @param tenGiamDoc
     */
    public void xoaGiamDoc(String tenGiamDoc) {
        for (NhanSu nhansu : this.danhSachNhanVien) {
            if ( (nhansu instanceof NhanVien) && tenGiamDoc.equalsIgnoreCase(nhansu.getHoTen()) ) {
                this.danhSachNhanVien.remove(this.danhSachNhanVien.indexOf(nhansu));

            }
        }
    }

    public void xuatThongTinNhanVien() {
        if (this.danhSachNhanVien.size() > 0) {
            for (NhanSu nhansu : this.danhSachNhanVien) {
                System.out.println(nhansu);
            }
        } else {
            System.out.println("Danh sach nhan vien trống .");
        }

    }

}
