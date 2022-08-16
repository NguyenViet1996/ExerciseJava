package QuanLiNhanVien.model;

public abstract class NhanSu {

    private final Integer maSo;
    private final String hoTen;
    private final String soDienThoai;
    private final Integer soNgayLamViec;

    public NhanSu(Integer maSo, String hoTen, String soDienThoai, Integer soNgayLamViec) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.soNgayLamViec = soNgayLamViec;
    }

    public Integer getMaSo() {
        return maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public Integer getSoNgayLamViec() {
        return soNgayLamViec;
    }

    public abstract Integer tinhLuong();

}
