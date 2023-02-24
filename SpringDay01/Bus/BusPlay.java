package SpringDay01.Bus;
import java.util.Scanner;

public class BusPlay {
    public static void main(String[] arg){
        TransportationFunction bus1 = new Bus("001", 1200);
//        TransportationFunction bus2 = new Bus("002", 1200);
//        System.out.println(((Transportation) bus1).carNum);
//        System.out.println(((Transportation) bus2).carNum);

        boolean play = true;
        while (play){
            System.out.println("D : 운행");
            System.out.println("C : 상태 변경");
            System.out.println("B : 승객 탑승");
            System.out.println("F : 주유하기");
//        System.out.println("S : 속도 변경"); 운행에 넣은 기능
            System.out.println("Q : 퇴근퇴근~~!!");
            System.out.println(((Transportation) bus1).getCarNum() + "번 버스 (현재 속도 : " + ((Transportation) bus1).getCurrentSpeed() + " , 현재 탑승 인원 : " + ((Transportation) bus1).getCurrentPassenger() + ")");
            System.out.print("작동할 기능을 선택해주세요 : ");

            Scanner sc = new Scanner(System.in);
            String work = sc.next();
            switch (work) {
                case "D":   // 운행 Drive
                case "d":
                    bus1.Drive();
                    break;
                case "C":   // 상태 변경 CarStatusChange
                case "c":
                    bus1.CarStatusChange(((Transportation) bus1).getCarStatus().equals("drive")  ? "garage" : "drive"); // 현재 상태가 두개밖에 없으니 알아서 바꿔주는걸로!
                    break;
                case "B":    // 승객 탑승 PassengerOnBoard
                case "b":
                    bus1.PassengerOnBoard();
                    break;
                case "F":   // 주유하기
                case "f":
                    bus1.Fueling();
                    break;
                case "S":   // 속도 변경 SpeedChange
                case "s":
                    bus1.SpeedChange();
                    break;
                case "Q":
                case "q":
                    play = false;
                    System.out.println("퇴근을 합니다. 내일 또 봐~!^^");
                    break;
                default:
                    System.out.println("\n제대로 입력바람 ㅡ0ㅡ");
                    break;
            }
        }

    }
}