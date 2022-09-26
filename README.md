## Object-oriented Programming (Lab Work) Template Guides
Nama : ADELINA SUCIKO
Nim : 21343001
Analisis Jobsheet 5:
Pada jobsheet ini menggunakan class Scanner, BufferedReader, JOptionPane
a. Scanner merupakan class yang menyediakan fungsi-fungsi untuk mengambil input dari keyboard. Untuk menggunakan Scanner, kita perlu mengimpor ke dalam kode: import java.util.Scanner; Dalam Scanner tidak perlu mengkonversikan variabel lain ketika ada perhitungan matematika dan bisa langsung dihtiung. 

b. BufferedReader Data yang akan diproses aritmatika harus dikonversikan dulu dari tipe data String ke tipe data angka yang diperlukan. Data yang diperoleh dari inputan kelas BufferedReader tipe datanya selalu String. Untuk menggunakan BufferedReader ini perlu mengimpor ke dalam program dengan kode: 
import java.io.BufferedReader; 
import java.io.InputStreamReade;
import java.io.IOException;
Dalam kelas BufferedReader untuk mendeklaraskan maka digunakan kode: BufferedReader DataMasuk = new BufferedReader (new InputStreamReader(System.in));
kode ini menyatakan bahwa pendeklarasian sebuah variabel bernama DataMasuk dengan tipe BufferedReader

c. JOptionPane merupakan sebuah kelas yang menyediakan jendela dialog. JOptionPane bisa kita gunakan untuk mengambil input, menampilkan informasi, menampilkan pesan error, menampilkan dialog konfirmasi, dan lain-lain. JOptionPane digunakan untuk input dan output data yang menampilkan dialog box agar memudahkan pengguna.
Sebelum menggunakan JOptionPane , kita harus mengimpornya terlebih dahulu ke dalam program dengan kode: import javax.swing.JOptionPane;
