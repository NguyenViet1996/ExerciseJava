package QuanLiNhanVien;

public class TruongPhong extends NhanSu {

    private final int soLuongNhanVien;

    public TruongPhong(int maSo, String hoTen, String soDienThoai, int soNgayLamViec, int soLuongNhanVien) {
        super(maSo, hoTen, soDienThoai, soNgayLamViec);
        this.soLuongNhanVien = soLuongNhanVien;
    }

    public int getSoLuongNhanVien() {
        return this.soLuongNhanVien;
    }

    public double getLuongMoiNgay() {
        return 200;
    }

    @Override
    public String toString() {
        return "Truong phong : {" +
                "Ma so : " + this.getMaSo() +
                ", Ho ten : " + this.getHoTen() +
                ", So dien thoai : " + this.getSoDienThoai() +
                ", So ngay lam viec : " + this.getSoNgayLamViec() +
                ", luong 1 ngay : " + this.getLuongMoiNgay() +
                ", Sô nhân vien : " + this.getSoLuongNhanVien() +
                '}';
    }

    @Override
    public void tinhLuong() {
        double luong = this.getLuongMoiNgay() * this.getSoNgayLamViec() + 100 * this.getSoLuongNhanVien();
    }


}
