// PROGRAM JAVA DI RUNNING DARI ATAS KE BAWAH
public class Variable {
    public static void main(String[] args) {
        // Variable adalah tempat menyimpan data.
        // java adalah bahasa static type, sehingga sebuah variable hanya bisa digunakan untuk menyimpan type data yang sama.
        // tidak dapat berubah-rubah type data seperti bahasa pemrograman Javascript.

        // untuk membuat variable di java kita bisa menggunakan nama type data lalu di ikuti dengan nama variable nya
        // nama variable tidak boleh mengandung whitespace (spasi, enter, tab) dan tidak boleh seluruhnya number.

        String nama;
        nama = "Arif";

        int age = 30;

        String address = "Bima";

        System.out.println("Nama: " + nama);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);

        // jika memasukan nama variable yang sama maka akan membuat output yang baru
        // karena java membaca dari atas ke bawah
        nama = "An";
        System.out.println("Nama: " + nama);

        // KATA KUNCI "VAR"
        // sejak java V10, java sudah mendukung pembuatan variable dengan kata kunci "var",
        // sehingga kita tidak perlu menyebutkan type datanya
        // jika menggunakan "var" maka perlu value / nilai yang harus dibuat dari variable secara langsung.

        var name = "Coba";
        System.out.println("Nama: " + name);

        // tidak bisa menggunakan
        // var name;
        // name = "coba"

        // KATA KUNCI FINAL
        // secara default variable di java dapat di ubah-ubah nilainya
        // jika kita ingin membuat sebuah variable yang datanya tidak boleh di ubah setelah pertama kali dibuat,
        // kita bisa menggunakan kata kunci final
        // istilah variable seperti ini, banyak juga yang menyebutnya konstant.

        final var cobafinal = "Belajar Java"; // constant; nilai awal tidak bisa di rubah
        System.out.println("Nama: " + cobafinal);

        // error
        // cobafinal = "Java Belajar"; // nilai awal tidak bisa di rubah.

    }
}
