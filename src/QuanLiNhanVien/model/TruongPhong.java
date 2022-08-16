package QuanLiNhanVien.model;

import java.util.ArrayList;
import java.util.List;

public class TruongPhong extends NhanSu {

    private final List<NhanVien> danhSachNhanVienDuoiQuyen;

    public TruongPhong(Integer maSo, String hoTen, String soDienThoai, Integer soNgayLamViec) {
        super(maSo, hoTen, soDienThoai, soNgayLamViec);
        this.danhSachNhanVienDuoiQuyen = new ArrayList<>();
    }

    public List<NhanVien> getDanhSachNhanVienDuoiQuyen() {
        return this.danhSachNhanVienDuoiQuyen;
    }

    public Integer getLuongMoiNgay() {
        return 200;
    }

    @Override
    public Integer tinhLuong() {
        return this.getLuongMoiNgay() * this.getSoNgayLamViec() + 100 * this.danhSachNhanVienDuoiQuyen.size();
    }

    @Override
    public String toString() {
        return "Truong phong : {" +
                "Ma so : " + this.getMaSo() +
                ", Ho ten : " + this.getHoTen() +
                ", So dien thoai : " + this.getSoDienThoai() +
                ", So ngay lam viec : " + this.getSoNgayLamViec() +
                ", luong 1 ngay : " + this.getLuongMoiNgay() +
                ", Sô nhân vien : " + this.getDanhSachNhanVienDuoiQuyen().size() +
                ", tong luong : " + this.tinhLuong() +
                '}';
    }

}
