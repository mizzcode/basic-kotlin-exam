package com.dicoding.exam.optionalexam3

// TODO
fun manipulateString(str: String, int: Int): String {
    var index = -1
//    loop total index dari string
    for (i in str.indices) {
//        jika setelah di cek index nya ternyata sebuah digit atau angka maka index angka tersebut dimasukan ke variable index dan stop loop nya
        if (str[i].isDigit()) {
            index = i
            break
        }
    }
//  jika tidak ada angka pada string, langsung aja kembalikan string dan angka
    return if (index == -1) {
        str + int
    } else {
//        mendapatkan kata dicoding yaitu dari index 0 sampai 7, karena lastIndex pada substring tidak diambil
        val dicoding = str.substring(0, index)
//        mengambil angka pada string kemudian ubah menjadi int maka semua 0 didepan akan di buang
        val numberLastWord = str.substring(index).toInt()
//        proses mengkalikan angka diakhir kata dan integer dari parameter kedua
        val number = numberLastWord * int
//        menggabungkan kata dan angka
        dicoding + number
    }
}