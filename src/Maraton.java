public class Maraton {
    private final int[] zamanlar;
    private final String[] isimler;

    public Maraton(int[] zamanlar, String[] isimler) {
        this.zamanlar = zamanlar;
        this.isimler = isimler;
    }

    private int Birinci() {
        int min = 0;
        for (int i = 1; i < zamanlar.length; i++) {
            if (zamanlar[i] < zamanlar[min]) {
                min = i;
            }
        }
        System.out.printf("Birinci: %s %d dakika%n", isimler[min], zamanlar[min]);
        return min;
    }

    public int Ikinci(String[] isimler) {
        int enIyiDereceIndis = Birinci();
        int ikinciEnIyi = -1;

        for (int i = 0; i < zamanlar.length; i++) {
            if (i != enIyiDereceIndis && (ikinciEnIyi == -1 || zamanlar[i] < zamanlar[ikinciEnIyi])) {
                ikinciEnIyi = i;
            }
        }
        System.out.printf("İkinci : %s %d dakika%n", isimler[ikinciEnIyi], zamanlar[ikinciEnIyi]);
        return ikinciEnIyi;
    }


    public void Ucuncu() {
        int enIyiIndis = Ikinci(isimler);
        int min = -1;
        for (int i = 0; i < zamanlar.length; i++) {
            if (i != enIyiIndis && (min == -1 || zamanlar[i] < zamanlar[min])) {
                min = i;
            }
        }
        int ikinciEnIyi = min;
        int ucuncuEnIyi = -1;

        for (int i = 0; i < zamanlar.length; i++) {
            if (i != enIyiIndis && i != ikinciEnIyi && (ucuncuEnIyi == -1 || zamanlar[i] < zamanlar[ucuncuEnIyi])) {
                ucuncuEnIyi = i;
            }
        }

        System.out.printf("Üçüncü : %s  %d dakika%n", isimler[ucuncuEnIyi], zamanlar[ucuncuEnIyi]);
    }

    public void ogrencileriSiniflandir() {
        int[] siniflandirma = new int[3];

        for (int j : zamanlar) {
            if (j >= 200 && j <= 299) {
                siniflandirma[0]++;
            } else if (j >= 300 && j <= 399) {
                siniflandirma[1]++;
            } else {
                siniflandirma[2]++;
            }
        }
        System.out.println("A -> " + siniflandirma[0]);
        System.out.println("B -> " + siniflandirma[1]);
        System.out.println("C -> " + siniflandirma[2]);
    }
}
