package Chapter06_OOP;

public class Ex6_12_class_instance {
    class Card{
        //  cv 개별 속성 (클래스 변수)
        String kind;
        int number;

        // iv 공통 속성 (인스턴스 변수)
        static int width = 100;
        static int height = 250;

        Card c = new Card();  // 객체 생성

    }

}

// 카드 : 객체

// 카드의 숫자, 무늬 : 개별 값

// 객체마다 다르게 유지되어야 함!

// 카드의 폭, 높이 -> 모든 객체가 공통적으로 가져야 하는 속성

// 카드에는 무늬, 숫자, 폭, 높이가 있다고 하면

// 무늬와 숫자는 객체마다 다르게 ()

// 폭과 높이는 객체마다 같게 () -> static을 붙인다!

