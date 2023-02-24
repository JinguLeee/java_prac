package SpringDay01.Bus;

import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Transportation implements TransportationFunction{
    private int maxPassenger;       // 최대 승객수
    private int currentPassenger;   // 현재 승객수
    private String carNum;          // (버스) 번호
    private int fueling;            // 주유량
    private int currentSpeed;       // 현재 속도
    private int maxSpeed;           // 최대 속도
    private String carStatus;       // 상태

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    public int getCurrentPassenger() {
        return currentPassenger;
    }

    public void setCurrentPassenger(int currentPassenger) {
        this.currentPassenger = currentPassenger;
    }

    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum;
    }

    public int getFueling() {
        return fueling;
    }

    public void setFueling(int fueling) {
        this.fueling = fueling;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(String carStatus) {
        this.carStatus = carStatus;
    }



    public Transportation(String carNum) {
        this.fueling = 100;
        this.currentSpeed = 0;
        this.maxSpeed = 120;
        this.carNum = carNum;
    }

    @Override
    public void Drive() {               // 운행
        if (this.getCarStatus().equals("drive")) System.out.println("\n운행을 시작합니다!");
        if (!CarStatusChange("drive")) return;

        boolean drive = true;
        while (drive){
            drive = SpeedChange();
        }
    }

    abstract public boolean CarStatusChange(String Status);

    abstract public void PassengerOnBoard();

    @Override
    public void PassengerGetOff() {
        if (carStatus != "drive") {
            System.out.println("현재는 운행하지 않습니다.\n");
            return;
        }
        boolean input = true;
        int passengerIn = 0;
        while (input) {
            try {
                System.out.printf("하차 인원을 입력해주세요 : ");
                Scanner sc2 = new Scanner(System.in);
                passengerIn = sc2.nextInt();
                input = false;
            } catch (InputMismatchException e) {
                System.out.println("숫자를 제대로 입력하세욧 !! ㅡㅅㅡ");
                input = true;
            }
        }

        if (currentPassenger - passengerIn < 0) {
            currentPassenger -= passengerIn;
            System.out.println("승객이 하차했습니다! 현재 탑승 인원 : " + currentPassenger + "\n");
        }
        else System.out.println("귀신이 있나요? 다시 시도하세요 ㅡ0ㅡ\n");
    }

    @Override
    public boolean SpeedChange() {         // 속도 변경
        if (carStatus != "drive") return false;
        if (!Checkfueling()) return false;

        int speed = 0;
        boolean input = true;
        while (input){
            try {
                System.out.printf("\n속도를 입력해주세요 ( 가속 : 양수 / 감속 : 음수 / 현재 속도가 0일 때 멈춥니다.) : ");
                Scanner sc = new Scanner(System.in);
                speed = sc.nextInt();
                input = false;
            } catch (InputMismatchException e) {
                System.out.println("숫자를 제대로 입력하세욧 !! ㅡㅅㅡ");
                input = true;
            }
        }

        if (currentSpeed == 0  && currentSpeed + speed == 0){
            System.out.println("움직임이 없습니다.\n");
            return false;
        }
        currentSpeed = (currentSpeed + speed > 0 ? (currentSpeed + speed < 150 ? currentSpeed+ speed : 150) : 0);
        fueling -= 10;
        System.out.println("현재 속도 : " + currentSpeed);
        System.out.println("주유량 : " + fueling);
        if (currentSpeed == 0) {
            System.out.println("끼이이익 멈춤~!\n");
            return false;
        }
        return true;
    }

    @Override
    public void Fueling() {
        if (carStatus != "garage") {
            System.out.println("차고지에서만 가능한 기능입니다.\n");
            return;
        }
        if (fueling == 100) {
            System.out.println("주유할 공간이 없습니다.\n");
            return;
        }
        System.out.println("주유를 시작합니다! 현재 주유량 : " + fueling);
        fueling = 100;
        System.out.println("주유가 완료되었습니다! 현재 주유량 : " + fueling + "\n");
    }

    public boolean Checkfueling(){
        if (fueling >= 10) return true;
        System.out.println("주유량을 확인해주세요.\n");
        CarStatusChange("garage");
        return false;
    }
}
