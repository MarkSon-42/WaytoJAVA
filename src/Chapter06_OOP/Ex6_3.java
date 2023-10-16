package Chapter06_OOP;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

class Ex6_3 {
    public static void main(String[] args) {

        // Card.width, Card.height처럼 클래스변수(static)는 객체 생성 없이 클래스이름.클래스변수로 직접 사용 가능

        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);



        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        // 인스턴스 변수의 값을 변경
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ")");
        System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ")");
        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");

        // 클래스 변수의 값을 변경 가능!
        Card.width = 50;
        Card.height = 80;
        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ")");
        System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ")");
    }
}



class Card {
    String kind;
    int number;
    static int width = 100;
    // Card 클래스의 모든 인스턴스들이 공통된 값(너비와 높이)를 유지하기 위해서
    // static 으로 선언함
    static int height = 250;
}