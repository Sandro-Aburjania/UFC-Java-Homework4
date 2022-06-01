package ge.ufc.homework3.main;

public class Main {
    public static void main(String[] args) {

        //უპარამეტრო, მნიშვნელობას ანიჭებს სიგანეს
        Rectangle rec1 = new Rectangle();

        System.out.println(rec1.getLength());
        System.out.println(rec1.getWidth());

        //ერთ პარამეტრიანი, მნიშვნელბოას ანიჭებს სიგრძეს
        Rectangle rec2 = new Rectangle(15);

        System.out.println("");
        System.out.println(rec2.getLength());
        System.out.println(rec2.getWidth());

        //ორ პარამტრიანი, მნიშვნელობას ანიჭებს სიგრძესა და სიგანეს
        Rectangle rec3 = new Rectangle(23, 18);

        System.out.println("");
        System.out.println(rec3.getLength());
        System.out.println(rec3.getWidth());

        //გადავაჭარმე მაქსიმალურ მნიშვნელობას და ამიტომ მიანიჭა შესაბამის ველში განსაზღვრული სიგრძე და სიგანე
        Rectangle rec4 = new Rectangle(60, 48);

        System.out.println("");
        System.out.println(rec4.getLength());
        System.out.println(rec4.getWidth());


        Rectangle[] recArr = {rec1, rec2, rec3, rec4};

        System.out.println("");
        System.out.println(Rectangle.largestArea(recArr));


    }
}