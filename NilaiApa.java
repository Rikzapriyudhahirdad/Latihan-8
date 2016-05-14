package Latihan8;

public class NilaiApa implements I1, D1 {

    private String angka;

    public void setAngka(String a) {
        this.angka = a;
    }

    public String getAngka() {
        return angka;
    }

    @Override
    public void nilaiInteger() {
        int a = Integer.parseInt(getAngka());
        System.out.println("Nilai " + a + " adalah Integer");
    }

    @Override
    public void nilaiDouble() {
 //       double b = Double.parseDouble(getAngka());
        System.out.println("Nilai " + getAngka() + " adalah Double");
    }

    public void testAngkaApa() {
        if (angka.contains(",")) {
            nilaiDouble();
        } else if (angka.contains(".")) {
            System.out.println("PEMASUKAN ANGKA SALAH, PERHATIKAN KOMA ATAU TITIK");
        } else {
            nilaiInteger();
        }

    }

}
