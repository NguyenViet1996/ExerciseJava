package QuanLiNhanVien;

public class GiamDoc extends NhanSu {

    private final double coPhan;

    public GiamDoc(int maSo, String hoTen, String soDienThoai, int soNgayLamViec, double coPhan) {
        super(maSo, hoTen, soDienThoai, soNgayLamViec);
        this.coPhan = coPhan;
    }

    public double getCoPhan() {
        return coPhan;
    }

    public double getLuongMoiNgay() {
        return 300;
    }

    @Override
    public double tinhLuong() {
        return this.getLuongMoiNgay() * this.getSoNgayLamViec();
    }

    @Override
    public String toString() {
        return "Giam dôc : {" +
                "Ma so : " + this.getMaSo() +
                ", Ho ten : " + this.getHoTen() +
                ", So dien thoai : " + this.getSoDienThoai() +
                ", So ngay lam viec : " + this.getSoNgayLamViec() +
                ", luong 1 ngay : " + this.getLuongMoiNgay() +
                ", Sô cô phân : " + this.getCoPhan() +
                ", tong luong : " + this.tinhLuong() +
                '}';
    }

}
