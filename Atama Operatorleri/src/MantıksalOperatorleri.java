public class MantıksalOperatorleri {
    public static void main(String[] args) {

        /*
        ----------------------------------------------------------
        && ve
        || veya
        ! değil   --- > bir şeyin zıttını almak için kullanılır
        ?: üçlü operatör --> ternary operator
            Eşitilğiin he riki tarafı aynı türde olması gerekiyor.
            Mesela Boolean ise true: false
            String ise "Evet" : "hayır" gibi
        ----------------------------------------------------------
        */

//        boolean a = !false;
//        System.out.println(a);
//        boolean sonuc = !(a>b);

        int a = 5;
        int b = 3;

//        boolean sonuc = a>2 &&  b<1;
//        boolean sonuc = a>7 ? true : false;
        String sonuc = a>7 ? "EVET BÜYÜKTÜR" : "HAYIR KÜÇÜKTÜR" ;


        System.out.println(sonuc);
    }
}
