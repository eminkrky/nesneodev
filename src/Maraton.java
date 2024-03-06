public class Maraton {
    private String[] isimler;
    private int[] sureler;

    public Maraton(String[] isimler , int[] sureler) {
        this.isimler = isimler;
        this.sureler = sureler;
    }

    public int getbirinci() {
        int min = 0;
        for (int i = 0; i < sureler.length; i++) {
            if (sureler[i]<sureler[min])
                min = i;
        }
        System.out.printf("Birinci: %s %d %n",isimler[min],sureler[min]);
        return min;
    }
    public int getikinci(int birinci) {
       int min = -1;
       for (int i = 0; i < sureler.length; i++) {
            if (i!=birinci&&(min==-1||sureler[i]<sureler[min]))
                min = i;
        }
        System.out.printf("İkinci: %s %d %n",isimler[min],sureler[min]);
        return min;
    }
    public int getucuncu(int birinci,int ikinci) {
        int min = -1;
        for (int i = 0; i < sureler.length; i++) {
            if (i!=birinci&&(i!=ikinci&&(min==-1||sureler[i]<sureler[min])))
                min = i;
        }
        System.out.printf("Üçüncü: %s %d %n",isimler[min],sureler[min]);
        return min;
    }
    public void getsininflandir(){
        int a=0;
        int b=0;
        int c=0;
        for (int i = 0; i < sureler.length; i++) {
            if (sureler[i]>=200&&sureler[i]<=299)
                a++;
            else if (sureler[i]>=300&&sureler[i]<=399)
                b++;
               else c++;
            }
        System.out.printf("A -> %s%nB -> %s%nC -> %s",a,b,c);
        }
}
