package com.example.daikin;

public class GridHomeModel {
    int hinhAnh;
    String noiDung;
    String time;

    public GridHomeModel(int hinhAnh, String noiDung, String time) {
        this.hinhAnh = hinhAnh;
        this.noiDung = noiDung;
        this.time = time;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
