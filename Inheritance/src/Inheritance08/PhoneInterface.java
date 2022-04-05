package Inheritance08;

interface PhoneInterface { // 인터페이스 선언
      final int TIMEOUT = 10000; // 상수 필드 선언

      void sendCall(); // 추상 메소드

      void receiveCall(); // 추상 메소드

      default void printLogo() { // default 메소드
         // default를 붙이지 않으면 일반 메소드가 되기 떼문에 오류
         // 프로그래머들이 인터페이스에도 일반 메소드를 작성할 수 있도록

         System.out.println("** Phone **");
      }
}