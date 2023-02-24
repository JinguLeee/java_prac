package SpringDay01.Bus;

import java.util.InputMismatchException;
import java.util.Scanner;

class Bus extends Transportation{
    int busCharge;          // 요금
    public Bus(String carNum, int busCharge) {
        super(carNum);
        this.maxPassenger = 30;
        this.currentPassenger = 0;
        this.busCharge = busCharge;
        this.carStatus = "drive";       // 객체 생성시 최초 상태는 '운행' 상태가 되도록
        // 버스일 때 (운행, 차고지 행) {drive, garage}
    }
    @Override
    public boolean CarStatusChange(String carStatus) {
        switch (carStatus){
            case "drive":
                if (this.carStatus.equals("drive")) return false;
                if (!Checkfueling()) return false;
                this.carStatus  = "drive";
                System.out.println("운전을 시작합니다~!\n");
                return true;
            case "garage":
                if (this.carStatus.equals("garage")) return false;
                this.carStatus  = "garage";
                if (this.currentPassenger > 0){
                    System.out.println(this.currentPassenger + "명의 손님이 타고있습니다. 다 내쫓겠습니다 ㅇㅅㅇ");
                    this.currentPassenger = 0;
                }
                System.out.println("차고지로 갑니다ㅜ0ㅜ\n");
                return true;
            default:
                System.out.println("잘못된 변경입니다.\n");
                return false;
        }

    }
    @Override
    public void PassengerOnBoard() {    // 승객 탑승
        if (carStatus != "drive") {
            System.out.println("현재는 운행하지 않습니다.\n");
            return;
        }

        boolean input = true;
        int passengerIn = 0;
        while (input) {
            try {
                System.out.printf("탑승 인원을 입력해주세요 : ");
                Scanner sc2 = new Scanner(System.in);
                passengerIn = sc2.nextInt();
                input = false;
            } catch (InputMismatchException e) {
                System.out.println("숫자를 제대로 입력하세욧 !! ㅡㅅㅡ");
                input = true;
            }
        }

        if (currentPassenger + passengerIn < maxPassenger) {
            currentPassenger += passengerIn;
            System.out.println("승객이 탑승했습니다!");
            System.out.println("현재 승객 인원 : " + currentPassenger);
            System.out.println("잔여 승객 인원 : " + (maxPassenger - currentPassenger));
            System.out.println("요금 확인 : " + (passengerIn * busCharge) + "\n");
        }
        else System.out.println("만석입니다. 다음 차를 이용해주세요.\n");
    }
}