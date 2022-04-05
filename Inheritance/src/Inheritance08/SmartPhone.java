package Inheritance08;

public class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface {
   @Override
   public void sendCall() {
      System.out.println("링딩동 링딩동 리딩딩디ㅣ딩");
   }

   @Override
   public void receiveCall() {
      System.out.println("전화 옴");
   }

   @Override
   public void sendSMS() {
      System.out.println("문자슝");
   }

   @Override
   public void receiveSMS() {
      System.out.println("문자옴");
   }

   // MP3Interface의 추상 메소드 구현
   @Override
   public void play() {
      System.out.println("음악이딩ㄷ가ㅣㄷㅇ가딩가");
   }

   @Override
   public void stop() {
      System.out.println("음악 끝ㅌ");
   }

   // 추가로 작성한 메소드
   public void schedule() {
      System.out.println("일정 관리 함");
   }
   
}