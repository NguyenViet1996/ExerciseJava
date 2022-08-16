package QuanLiNhanVien.model;

public class NhanVien extends NhanSu {

    private Integer idTruongPhong;

    public NhanVien(Integer maSo, String hoTen, String soDienThoai, Integer soNgayLamViec, Integer idTruongPhong) {
        super(maSo, hoTen, soDienThoai, soNgayLamViec);
        this.idTruongPhong = idTruongPhong;;
    }

    public void setIdTruongPhong(Integer idTruongPhong) {
        this.idTruongPhong = idTruongPhong;
    }

    public Integer getIdTruongPhong() {
        return idTruongPhong;
    }

    public Integer getLuongMoiNgay() {
        return 100;
    }

    @Override
    public Integer tinhLuong() {
        return this.getLuongMoiNgay() * this.getSoNgayLamViec();
    }

    @Override
    public String toString() {
        return "Nhan vien thường : {" +
                "Ma so : " + this.getMaSo() +
                ", Ho ten : " + this.getHoTen() +
                ", So dien thoai : " + this.getSoDienThoai() +
                ", So ngay lam viec : " + this.getSoNgayLamViec() +
                ", luong 1 ngay : " + this.getLuongMoiNgay() +
                ", truong phong là : " + this.getIdTruongPhong() +
                ",tong luong : " + this.tinhLuong() +
                '}';
    }

}
