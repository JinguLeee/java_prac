package Example;

import java.util.Date;

public class A_Variable {
    public static void main(String[] args) {
        System.out.println("Hello, Sparta!");

        int[] num = new int[5];
        num[3] = 28;
        System.out.println(num);
        System.out.println(num[3]);
        System.out.println(num[1]);

        int[] newAge = {1, 2, 3};
        for (int i = 0; i < newAge.length; i++) {
            System.out.print(newAge[i]);
        }
        System.out.println(newAge);

        int[] num1 = new int[]{1, 2, 3};
        int[] num2 = {1, 2, 3};
        for (int i = 0; i < num1.length; i++) {
            System.out.print(num1[i]);
            System.out.print(num2[i]);
        }

        Variable1_4 instance = new Variable1_4 ();
        int ib = instance.instanceVal;
        int ib2 = instance.instanceVal2;
        int ib3 = instance.classVal;
    }
}

class Variable1_1 {
    boolean flag;
    char grade;
    byte val;
    short sval;
    int num;
    long price;
    float tax;
    double score;
}

class Variable1_2 {
    public static void main(String[] args) {
        boolean flag = false;
        char grade = 'A';
        byte val = 127;
        short sval = 128;
        int num = 32768;
        long price = 2_147_483_648L;
        float tax = 3.14f;
        double score = 3.14159265358979;

        System.out.println("boolean = " + flag);
        System.out.println("char = " + grade);
        System.out.println("byte = " + val);
        System.out.println("short = " + sval);
        System.out.println("int = " + num);
        System.out.println("long = " + price);
        System.out.println("float = " + tax);
        System.out.println("double = " + score);
    }
}

class Variable1_3 {
    public static void main(String[] args) {
        int year, age = 23;

        year = age + 2000;
        System.out.println("year = " + year); // 2023

        // 변수의 값을 읽어오는 과정
        // year = age + 2000;
        // year = 23 + 2000;
        // year = 2023;

        age = age + 1;
        System.out.println("age = " + age); // 24
        System.out.println("year = " + year); // 2023

        // 변수의 값을 읽어오는 과정
        // age = age + 1;
        // age = 23 + 1;
        // age = 24;
        // 프로그램은 순차적으로 코드가 실행되기 때문에
        // 여기서 age의 값이 바뀌었다고 year에 영향을 주지 않는다.
    }
}

class Variable1_4 {
    static int classVal = 100; // 클래스 변수
    int instanceVal = 200; // 인스턴스 변수
    int instanceVal2 = 300; // 인스턴스 변수

    public static void main(String[] args) {
        int num; // 지역 변수
//        System.out.println("int = " + num); // Error 발생
        num = 300;
        System.out.println("int = " + num); // 300

        // 인스턴스 변수
//        System.out.println("instanceVal = " + instanceVal); // Error 발생
        Variable1_4 instance = new Variable1_4 (); // 인스턴스 변수 사용을 위해 객체 생성
        System.out.println("instanceVal = " + instance.instanceVal); // 200

        // 클래스 변수
        System.out.println("classVal = " + classVal);
        // 같은 크래스 내부는 바로 접근 가능
        System.out.println("Main.classVal = " + Variable1_4.classVal);
        // 클래스 변수 : 클래스명.클래스변수명 으로 접근 or
    }
}

class Variable2_1 {
    public static void main(String[] args) {
        int score = 100;
        System.out.println("score = " + score);
        score = 90;
        System.out.println("score = " + score);

        final int finalScore = 100;
        System.out.println("finalScore = " + finalScore);
//         finalScore = 90; // Error 발생
    }
}

class Variable2_2 {
    public static void main(String[] args) {
        int score = 100;
        final int finalScore = 1000;
        /*score : 변수
        finalScore : 상수
        100, 1000 : 리터럴*/
    }
}

class Variable2_3 {
    public static void main(String[] args) {
        // boolean flag1 = 22; // Error 발생
        boolean flag2 = false; // true, false 만 가능!

        // char grade1 = 'AA'; // Error 발생
        // char grade2 = "A"; // Error 발생
        char grade3 = 'A'; // char 타입은 이렇게 하나의 문자만 가능!
        char ch = '\n'; // 개행문자(\n, \t 등) 가능!

        // String name1 = 'C'; // Error 발생
        // String name2 = 'Choi'; // Error 발생
        String str = "C"; // 한 문자 가능! 문자가 하나여도 문자열로 인식!
        String name3 = "choi"; // 여러 문자 가능!

        // byte val1 = 128; // Error 발생
        byte val2 = 127; // int 와 같은 리터럴로 저장하지만 범위가 지정되어 있음! -128 ~ 127

        short sval = 128;

        // 리터럴 접두사 예제
        // int의 진수 표현
        int ob = 0b0101; // 2진수, 접두사 0b
        int i = 100; // 10진수
        int oct = 0100; // 8진수, 접두사 0
        int hex = 0x100; // 16진수, 접두사 0x

        long price = 2_147_483_648L; // _ 를 사용하여 숫자 표현 가능!
        // long l1 = 2_147_483_648; // Error 발생, int 범위를 넘었으니 L 접미사 필수!
        long l2 = 100; // int의 범위를 넘지 않으면 L 생략 가능!

        // float tax1 = 3.14;
        float tax2 = 3.14f;

        double score1 = 3.14159265358979; // d 생략 가능!
        double score2 = 3.14159265358979d;

        float f1 = 10f; // 10.0f
        double d1 = 10.; // 10.0
        double d2 = .10; // 0.10
        double d3 = 1e3; // 1000.0 , e3 = 10의 3제곱
        double d4 = -1e3; // -1000.0
    }
}

class Variable3_1 {
    public static void main(String[] args) {
        // 부호있는 경우
        short sMin = -32768;
        short sMax = 32767;

        // short 타입에서 최솟값 범위를 넘었을 때
        // sMin - 1 = 32767
        System.out.println("sMin = " + sMin);
        System.out.print("sMin - 1 = ");
        System.out.println((short) (sMin - 1));

        // short 타입에서 최댓값 범위를 넘었을 때
        // sMax + 1 = -32768
        System.out.println("sMax = " + sMax);
        System.out.print("sMax + 1 = ");
        System.out.println((short) (sMax + 1));

        // 부호없는 경우
        char cMin = 0;
        char cMax = 65535;

        // short 타입에서 최솟값 범위를 넘었을 때
        // cMin - 1 = 65535
        System.out.println("cMin = " + (int) cMin);
        System.out.print("cMin - 1 = ");
        System.out.println((int) (--cMin));

        // short 타입에서 최댓값 범위를 넘었을 때
        // cMax + 1 = 0
        System.out.println("cMax = " + (int) cMax);
        System.out.print("cMax + 1 = ");
        System.out.println((int) (++cMax));
    }
}

class Variable3_3  {
    public static void main(String[] args) {
        int num = 5;
        char ch = '5';

        // 숫자 -> 문자열
        System.out.println("num + \"\" = " + num + "");
        // num 이 "5" 로 변환되었기 때문에 "5" + "5" 로  결과값은 "55"
        System.out.println("num + \"\" + \"5\" = " + num + "" + "5");

        // 문자 -> 문자열
        System.out.println("ch + \"\" = " + ch + "");
        // ch 이 '5' 에서 "5" 로 변환되었기 때문에 "5" + "8" 로  결과값은 "58"
        System.out.println("ch + \"\" + \"8\" = " + ch + "" + "8");

    }
}

class Variable3_4  {
    public static void main(String[] args) {
        String str1 = "100";
        String str2 = "3.14";
        String str3 = "8";

        // 문자열 -> 숫자
        System.out.println("Integer.parseInt(str) = " + Integer.parseInt(str1));
        // Integer.parseInt() 은 int 타입만 가능
//         System.out.println("Integer.parseInt(str2) = " + Integer.parseInt(str2)); // Error 발생
        System.out.println("Double.parseDouble(str2) = " + Double.parseDouble(str2));

        // 문자열 -> 문자
        System.out.println("str1.charAt(0) = " + str1.charAt(0) + str1.charAt(1) + str1.charAt(2));
        System.out.println("str3.charAt(0) = " + str3.charAt(0));
    }
}

class Variable3_5 {
    public static void main(String[] args) {
        // Date import 필요!
        Date date; // 참조형 변수 date 를 선언
        date = new Date(); // date 에 객체의 주소를 저장 , new 는 객체를 생성하는 명령어

        System.out.println(date); // Wed Jan 11 20:54:45 KST 2023
    }
}

class Variable4_2 {
    public static void main(String[] args) {
        String s1 = "A" + "B"; // "AB"
        System.out.println("s1 = " + s1);

        // 문자열은 문자열하고만 결합할 수 있기 때문에
        // 숫자를 문자열로 바꾼 다음에 결합 합니다.
        String s2 = "" + 7;
        // "" + 7 => "" + "7" = "7"
        System.out.println("s2 = " + s2);

        // 문자열 결합 순서에 의한 차이 확인!
        String s3 = "" + 7 + 7;
        // "" + 7 + 7 => "7" + 7 => "7" + "7" = "77"
        System.out.println("s3 = " + s3);

        String s4 = 7 + 7 + "";
        // 7 + 7 + "" => 14 + "" = "14"
        System.out.println("s4 = " + s4);
    }
}

class Variable4_3 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        // x 와 y 값을 교환해 보겠습니다.
        x = y; // x = 20;
        // 변수는 하나의 값 밖에 저장할 수 없기 때문에 기존의 x의 값 10은 사라지고 20이 됩니다.
        y= x; // y = 20;
        // y는 20 이된 x의 값을 받습니다.

        System.out.println("x = " + x); // 20
        System.out.println("y = " + y); // 20

        System.out.println();
        // 교환이 제대로 되지 않았습니다!

        int a = 10, b = 20;
        int tmp; // 교환에 중간다리 역할을 해 줄 변수 하나를 선언합니다.
        // a 와 b 값을 교환해 보겠습니다.
        tmp = a; // a = 10, tmp = 10
        a = b; // b = 20, a = 20
        b = tmp; // tmp = 10, b = 10

        // 결과로 a = 20, b = 10 이어야 됩니다.
        System.out.println("a = " + a); // 20
        System.out.println("b = " + b); // 10
        System.out.println("tmp = " + tmp); // 10

        // 교환이 성공적으로 되었습니다!
        System.out.println((int)'C');
    }
}