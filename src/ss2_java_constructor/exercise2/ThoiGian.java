package ss2_java_constructor.exercise2;

public class ThoiGian {
    private int hour;
    private int minute;
    private int second;

    public ThoiGian(){
        hour = 00;
        minute = 00;
        second = 00;
    }

    public ThoiGian(int hour){
        this.hour = hour;
        this.minute = 00;
        this.second = 00;
    }

    public ThoiGian(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
        this.second = 00;
    }

    public ThoiGian(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public ThoiGian(ThoiGian other){
        this.hour = other.hour;
        this.minute = other.minute;
        this.second = other.second;
    }

    void outPut(){
        System.out.printf("%d:%02d:%02d", hour, minute, second);
    }
}
