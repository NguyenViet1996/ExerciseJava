package QuanLiNhanVien;

public class TruongPhong extends NhanSu {

    private int soLuongNhanVien;

    public TruongPhong(int maSo, String hoTen, String soDienThoai, int soNgayLamViec, int soLuongNhanVien) {
        super(maSo, hoTen, soDienThoai, soNgayLamViec);
        this.soLuongNhanVien = soLuongNhanVien;
    }

    public void setSoLuongNhanVien(int soLuongNhanVien) {
        this.soLuongNhanVien = soLuongNhanVien;
    }

    public int getSoLuongNhanVien() {
        return this.soLuongNhanVien;
    }

    public double getLuongMoiNgay() {
        return 200;
    }

    @Override
    public double tinhLuong() {
        return this.getLuongMoiNgay() * this.getSoNgayLamViec() + 100 * this.getSoLuongNhanVien();
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
                ", tong luong : " + this.tinhLuong() +
                '}';
    }

}
