package SpringDay01.Bus;

interface TransportationFunction{
    void Drive();               //운행
    boolean CarStatusChange(String Status);
    void PassengerOnBoard();    // 승객 탑승
    void PassengerGetOff();     // 승객 하차
    boolean SpeedChange();         // 속도 변경
    void Fueling();
}
