package com.pbo2;

public class VirtualDemo {
    public static void main(String[] args) {

        Gaji s = new Gaji("wahyu", "KUBAR", 3, 5000.00);

        // upcasting
        Pegawai e = new Gaji("ini nama", "samarinda", 2, 2500.00);
        System.out.println("memanggil mailCheck berdasarkan referennsi gaji --> ");

        s.mailCheck();

        System.out.println("\nmemanggil mailCheck berdasarkan referensi pegawai -->");
        e.mailCheck();

        /*
         * hasil ouput "menyusun pegawai" keluar 2x, karena:
         * adanya constructor objek dari class gaji dan class gaji merupakan turunan 
         * dari class pegawai sehingga class gaji juga akan 
         * mengakses method-method yang ada di class pegawai, dan karena method pegawai 
         * yang ada di class pegawai tidak berubah pada class gaji, maka akan tetap menampilkan 
         * "menyusun pegawai".
         * lalu juga terdapat upcasting dari gaji(child) dengan menggunakan tipe data pegawai(parent) 
         * maka dia juga mengakses method pegawai yang ada di class pegawai.
         * 
         * Oleh karena itu, kalimat "menyusun pegawai" keluar 2x pada terminal.
         */
    }
}
