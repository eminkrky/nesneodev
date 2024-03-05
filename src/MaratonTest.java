public class MaratonTest {
    public static void main(String[] args) {

        String[] isimler = {"Kadir", "Gökhan", "Hakan", "Suzan", "Pınar", "Mehmet", "Ali", "Emel"
                , "Fırat", "James", "Jale", "Ersin", "Deniz", "Gözde", "Anıl", "Burak"};

        int[] sure = {341, 273, 278, 329, 445, 402, 388, 270, 243, 334, 412, 393, 299, 343, 317, 265};

        Maraton mrton = new Maraton(isimler,sure);
        int birinciindis=mrton.getbirinci();
        int ikinciindis=mrton.getikinci(birinciindis);
        int ucuncuindis=mrton.getucuncu(birinciindis,ikinciindis);
        mrton.getsininflandir();
    }
}
