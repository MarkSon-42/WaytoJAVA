// 클래스 변수, 인스턴스 변수, 지역 변수

// 클래스 : 설계도

// 클래스 변수는 일반적으로 모든 클래스 인스턴스에 대해 동일해야 하는 상수,
// 공유 데이터 또는 구성 설정에 사용
package Chapter06_OOP;
class Variables {
    int iv;  // 인스턴스 변수
    static int cv;  // 클래스 변수 static변수, 공유 변수

    void method() {
        int lv = 0;  // 지역 변수
    }

}

// 영역 -> 1. 클래스 영역, 2. 메서드 영역

