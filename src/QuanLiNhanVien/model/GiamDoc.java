package QuanLiNhanVien.model;

public class GiamDoc extends NhanSu {

    private final Double coPhan;

    public GiamDoc(Integer maSo, String hoTen, String soDienThoai, Integer soNgayLamViec, Double coPhan) {
        super(maSo, hoTen, soDienThoai, soNgayLamViec);
        this.coPhan = coPhan;
    }

    public Double getCoPhan() {
        return coPhan;
    }

    public Integer getLuongMoiNgay() {
        return 300;
    }

    @Override
    public Integer tinhLuong() {
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
