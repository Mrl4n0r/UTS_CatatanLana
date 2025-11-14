/**
 *
 * @author Muhammad Maulana 2310010375
 */
package model;

public class Catatan {
    private String judul;
    private String isi;

    public Catatan(String judul, String isi) {
        this.judul = judul;
        this.isi = isi;
    }

    public String getJudul() { return judul; }
    public String getIsi() { return isi; }

    @Override
    public String toString() {
        return judul; // supaya tampil judul di JList
    }
    public void setJudul(String judul) {
    this.judul = judul;
}

    public void setIsi(String isi) {
        this.isi = isi;
}

}
