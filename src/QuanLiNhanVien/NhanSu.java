package QuanLiNhanVien;

public abstract class NhanSu {

    private final int maSo;
    private final String hoTen;
    private final String soDienThoai;
    private final int soNgayLamViec;

    public NhanSu(int maSo, String hoTen, String soDienThoai, int soNgayLamViec) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.soNgayLamViec = soNgayLamViec;
    }

    public int getMaSo() {
        return maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public int getSoNgayLamViec() {
        return soNgayLamViec;
    }

    public abstract double tinhLuong();

}
