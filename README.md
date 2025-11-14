<div align="center">

# 📘 Aplikasi Catatan Harian  
### Java Swing — UTS Pemrograman Berorientasi Objek  
**Oleh: Muhammad Maulana — 2310010375 - 5C Reg Bjm**

</div>

---

<div align="center">

![Java Badge](https://img.shields.io/badge/Java-ED1D25?style=for-the-badge&logo=openjdk&logoColor=white)
![Swing Badge](https://img.shields.io/badge/Java%20Swing-0081CB?style=for-the-badge&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Selesai-blue?style=for-the-badge)

</div>

---

## 📖 Deskripsi Singkat
**Aplikasi Catatan Harian** adalah aplikasi GUI sederhana untuk membuat, mengedit, menyimpan, dan menghapus catatan menggunakan Java Swing.  
Proyek ini dibuat sebagai **Ujian Tengah Semester (UTS)** mata kuliah **Pemrograman Berorientasi Objek (PBO)**.

Aplikasi ini menggunakan konsep **OOP** secara lengkap dan menyediakan **fitur ekspor & impor data (.txt)** sesuai syarat tantangan UTS.

---

## 🎯 Mekanisme Penilaian UTS

| Kriteria Penilaian | Bobot | Status |
|--------------------|-------|--------|
| **Fungsional Aplikasi** | 20% | ✔ Terpenuhi |
| **Desain & User Experience** | 20% | ✔ Terpenuhi |
| **Penerapan Konsep OOP** | 15% | ✔ Terpenuhi |
| **Kreativitas & Inovasi Fitur** | 15% | ✔ Terpenuhi |
| **Dokumentasi Kode** | 10% | ✔ Terpenuhi |
| **Subtotal** | **80%** | ✔ |
| **Tantangan UTS** — Import & Export file (.txt / .json / .pdf / .xls) | **+20 poin** | ✔ Fitur Export & Import TXT |

**Total: 100 poin**

---

## ✨ Fitur Aplikasi

### 📝 Fitur Utama
- ➕ Tambah catatan  
- ✏ Edit catatan  
- ❌ Hapus catatan  
- 📄 Tampilkan isi catatan saat dipilih  
- 💾 Simpan catatan ke file `.txt`  
- 📂 Load catatan dari file `.txt`  
- 🎨 Tampilan GUI rapi, sederhana, dan mudah digunakan  

---

## 🧠 Penerapan Konsep OOP

### ✔ **1. Class**
- `model.Catatan`
- `service.CatatanManager`
- `ui.CatatFrame`

### ✔ **2. Object**
Setiap catatan baru adalah instansi dari class `Catatan`.

### ✔ **3. Encapsulation**
Atribut catatan menggunakan modifier `private` serta getter & setter.

### ✔ **4. Abstraction**
`CatatanManager` mengatur logika data, dipisahkan dari GUI.

### ✔ **5. Polymorphism**
Override method:
```java
@Override
public String toString() {
    return judul;
}
