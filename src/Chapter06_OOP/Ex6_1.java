package Chapter06_OOP;

class Ex6_1 {

    // 클래스명 변수명;
    // -> 클래스의 객체를 참조하기 위한 참조변수를 선언

    // 변수명 = new 클래스명();
    // ->  클래스의 객체를 생성 후, 객체의 주소를 참조 변수에 저장 (인스턴스 생성후 변수에 저장)

    // Tv t;
    // -> Tv 클래스 타입의 참조변수 t를 선언

    // t = new Tv();
    // -> Tv 인스턴스를 생성한 후, 생성된 Tv 인스턴스의 주소를 t에 저장
    public static void main(String args[]) {
        Tv t;
        t = new Tv();
        t.channel = 7;
        t.channelDown();
        System.out.println("���� ä���� " + t.channel + " �Դϴ�.");
    }
}

// Tv 클래스 선언 : Tv 설계도를 작성하는 것

class Tv {
    // Tv의 속성 ( 멤버변수 )

    // 1. 색상
    String color;  // line18 t = new Tv(); 에서 기본값으로 초기화됨 color = null

    // 2. 전원 상태
    boolean power; // false

    // 3. 채널
    int channel; // 0


    // Tv의 기능 ( 메서드 )

    // 1. Tv on/off
    void power() { power = !power; }

    // 2. channel up
    void channelUp() { ++channel; }

    // 3. channel down
    void channelDown() { --channel; }

}