package Ex_4;

public class Ex4_Main {
    public static void main(String[] args) {
        // Đối tượng tạo từ interface
        RemoteControl smartLight = new RemoteControl() {
            @Override
            public void powerOn() {
                System.out.println("Đèn đã bật");
            }

            @Override
            public void checkBattery() {
                RemoteControl.super.checkBattery();
            }
        };
        smartLight.checkBattery();
        smartLight.powerOn();


    }
}