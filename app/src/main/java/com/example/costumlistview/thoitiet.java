package com.example.costumlistview;

public class thoitiet {
    private String Thanhpho;
    private String Mota;
    private int Hinh;
    public thoitiet(String thanhpho, String mota, int hinh){
        Thanhpho = thanhpho;
        Mota = mota;
        Hinh = hinh;
    }

    public String getThanhpho() {
        return Thanhpho;
    }

    public void setThanhpho(String thanhpho) {
        Thanhpho = thanhpho;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String mota) {
        Mota = mota;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }
}
