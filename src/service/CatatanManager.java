/**
 *
 * @author Muhammad Maulana 2310010375
 */

package service;

import model.Catatan;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CatatanManager {
    private final List<Catatan> daftar = new ArrayList<>();

    // Tambah catatan
    public void tambah(Catatan c) {
        daftar.add(c);

    }

    // Hapus catatan
    public void hapus(Catatan c){
        daftar.remove(c);
    }
    
    public void clear() {
        daftar.clear();
    }


    // Update / edit catatan
    public void updateCatatan(int index, Catatan c) {
        if (index >= 0 && index < daftar.size()) {
            daftar.set(index, c);
        }
    }

    // Ambil seluruh catatan (untuk ditampilkan di list)
    public List<Catatan> getAll() {
        return daftar;
    }

    // Ambil 1 catatan berdasarkan index list
    public Catatan get(int index) {
        if (index >= 0 && index < daftar.size()) {
            return daftar.get(index);
        }
        return null;
    }


    // ========= FitUR BONUS: Simpan ke file (.txt) =========
    public void simpanKeFile(File file) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (Catatan c : daftar) {
                bw.write("----TITLE----");
                bw.newLine();
                bw.write(c.getJudul());
                bw.newLine();
                bw.write("----BODY----");
                bw.newLine();
                bw.write(c.getIsi());
                bw.newLine();
                bw.write("----ENDNOTE----");
                bw.newLine();
            }
        }
    }

    // ========= FitUR BONUS: Load dari file =========
    public void loadDariFile(File file) throws IOException {
        daftar.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            String judul = null;
            StringBuilder isi = null;

            while ((line = br.readLine()) != null) {
                if ("----TITLE----".equals(line)) {
                    judul = br.readLine();
                } else if ("----BODY----".equals(line)) {
                    isi = new StringBuilder();
                    while ((line = br.readLine()) != null && !"----ENDNOTE----".equals(line)) {
                        isi.append(line).append(System.lineSeparator());
                    }
                    daftar.add(new Catatan(judul, isi.toString()));
                }
            }
        }
    }
}
