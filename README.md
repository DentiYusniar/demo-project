# Selenium Test Automation – Java, TestNG, Maven

Repository ini berisi contoh **automation testing** menggunakan **Selenium WebDriver**, **Java**, **TestNG**, dan **Maven**.  
Project ini dibuat untuk mendemonstrasikan penerapan **Funcition automation testing** dengan pendekatan **Page Object Model (POM)**.

---

## 🧪 Tech Stack

### 🔹 Java
Java digunakan sebagai **bahasa pemrograman utama** untuk menulis script automation, termasuk test case, page object, dan konfigurasi test.

### 🔹 Selenium WebDriver
Selenium berfungsi sebagai **automation tool** untuk mengontrol browser (Chrome) dan melakukan simulasi interaksi user seperti:
- Input username & password
- Klik tombol
- Validasi halaman & pesan error

### 🔹 TestNG
TestNG adalah **testing framework** yang digunakan untuk:
- Menjalankan test case
- Mengatur urutan test (`priority`)
- Membuat assertion (validasi hasil test)
- Mengelola lifecycle test (`@Before`, `@After`, `@Test`)

### 🔹 Maven
Maven digunakan sebagai **build & dependency management tool** untuk:
- Mengelola library (Selenium, TestNG, dll)
- Menjalankan test secara terstruktur
- Memudahkan konfigurasi project

---

## 📂 Project Structure

- `base`  
  Berisi setup dan teardown WebDriver

- `page`  
  Berisi Page Object (locator & action)

- `test`  
  Berisi test case (positive & negative scenario)

---

## 🎯 Test Coverage

- Login dengan credential valid
- Login dengan password tidak valid
- Validasi URL setelah login
- Validasi error message saat login gagal

---

## 🚀 Purpose

Project ini dibuat sebagai:
- Contoh implementasi **Selenium + TestNG + Maven**
- Latihan automation testing berbasis Java
- Portofolio untuk posisi **QA / Automation Engineer**

