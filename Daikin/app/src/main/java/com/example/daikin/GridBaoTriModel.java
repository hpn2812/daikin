package com.example.daikin;

public class GridBaoTriModel {
    int hinhAnh;
    String noiDung;

    public GridBaoTriModel(int hinhAnh, String noiDung) {
        this.hinhAnh = hinhAnh;
        this.noiDung = noiDung;
    }

    public int getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }
}
