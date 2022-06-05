package QuanLiNhanVien;

public class NhanVien extends NhanSu {

    private String truongPhong;

    public NhanVien(int maSo, String hoTen, String soDienThoai, int soNgayLamViec, String truongPhong) {
        super(maSo, hoTen, soDienThoai, soNgayLamViec);
        this.truongPhong = truongPhong;
    }

    public void setTruongPhong(String truongPhong) {
        this.truongPhong = truongPhong;
    }

    public String getTruongPhong() {
        return truongPhong;
    }

    public double getLuongMoiNgay() {
        return 100;
    }

    @Override
    public String toString() {
        return "Nhan vien thường : {" +
                "Ma so : " + this.getMaSo() +
                ", Ho ten : " + this.getHoTen() +
                ", So dien thoai : " + this.getSoDienThoai() +
                ", So ngay lam viec : " + this.getSoNgayLamViec() +
                ", luong 1 ngay : " + this.getLuongMoiNgay() +
                ", truong phong là : " + this.getTruongPhong() +
                '}';
    }

    @Override
    public void tinhLuong() {
        double luong = this.getLuongMoiNgay() * this.getSoNgayLamViec();
    }
}
