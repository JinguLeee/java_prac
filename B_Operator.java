public class B_Operator {
    public static void main(String[] args) {

    }
}

class Operator1_1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        // + 연산자는 피연산자가 2개인 이항 연산자 임으로 단항 연산자인 -x 의 -가 먼저 실행된다.
        System.out.print("-x + 3 = ");
        System.out.println(-x + 3); // -10 + 3 = -7

        System.out.print("x + 3 * y = ");
        System.out.println(x + 3 * y); // 10 + (3 * 20) = 70

        System.out.print("x + 3 > y - 2 = ");
        System.out.println(x + 3 > y - 2); // false
        System.out.print("x + 3 < y - 2 = ");
        System.out.println(x + 3 < y - 2); // true

        System.out.print("x > 3 && y < 2 = ");
        System.out.println(x > 3 && y < 2); // false

        int result = x + y * 3;
        System.out.println("result = " + result); // 10 + (20 * 3), result = 70
    }
}

class Operator2_1 {
    public static void main(String[] args) {
        int k = 0, j = 3;

        // 후위 형
        k = j++;
        System.out.println("k = j++;, k = " + k);
        System.out.println("k = j++;, j = " + j);
        // 다르게 표현 가능
//        k = j;
//        j++;
//        System.out.println("k = j++;, k = " + k);
//        System.out.println("k = j++;, j = " + j);

        // 값 초기화
        k = 0;
        j = 3;

        // 전위 형
        k = ++j;
        System.out.println("k = ++j;, k = " + k);
        System.out.println("k = ++j;, j = " + j);
        // 다르게 표현 가능
//        ++j;
//        k = j;
//        System.out.println("k = ++j;, k = " + k);
//        System.out.println("k = ++j;, j = " + j);

    }
}

class Operator2_2 {
    public static void main(String[] args) {
        int i = -10;
        i = +i;
        System.out.println("i = +i; = " + i);

        i = -10;
        i = -i;
        System.out.println("i = -i; = " + i);
    }
}

class Operator3_1 {
    public static void main(String[] args) {
        int i = 65, num = 10;
        char ch = 'A';
        float f = 1.6f;

        System.out.println("(char)i = " + (char)i);
        System.out.println("(int)ch = " + (int)ch);
        System.out.println("(int)f = " + (int)f);
        System.out.println("(float)num = " + (float)num);
    }
}

class Operator3_2 {
    public static void main(String[] args) {
        // 큰 타입을 작은 타입에 저장!
        // int i = 3.14f; // Error 발생
        int i = (int)3.14f; // 형변환 필요!
        System.out.println("i = " + i);

        // 예외 경우 확인

        // 100 은 int 타입 따라서 아래 코드는 현재 큰 타입(int)을 작은 타입(byte)에 넣고 있음!
        // 컴퓨터는 byte의 범위가 -128 ~ 127 인 것을 알고 있다.
        // 따라서 100을 byte b 에 집어 넣어도 값 손실이 발생하지 않는 다는 것을 알기 때문에
        // 자동으로 형변환을 해준다.
        // byte b = (byte)100; -> 컴파일러가 자동 형변환
        byte b = 100; // OK
        System.out.println("b = " + b);

        // 위의 경우는 100 은 리터럴 즉, 상수이기 때문에 컴파일러가 값을 명확하게 알지만
        // 아래 num 은 변수, 따라서 확신할 수 없기 때문에 Error 발생
        int num = 100;
        // byte b2 = num; // Error 발생
        byte b2 = (byte) num; // byte 타입으로 형변환
        System.out.println("b2 = " + b2);

        //  byte b3 = 1000; // Error 발생, 범위를 넘어감
        byte b3 = (byte) 1000;
        // OK, 그러나 값 손실 발생, b3 에는 -24 가 저장됨
        // 즉, 상수여도 값 손실이 일어나면 자동 형변환 불가능!
        System.out.println("b3 = " + b3);

        byte b4 = (byte) 895; // 127
        System.out.println("b4 = " + b4);
    }
}

class Operator4_1 {
    public static void main(String[] args) {
        int a = 10, b = 4;

        // 덧셈
        System.out.print("a + b = ");
        System.out.println(a + b);

        // 뺄셈
        System.out.print("a - b = ");
        System.out.println(a - b);

        // 곱셈
        System.out.print("a * b = ");
        System.out.println(a * b);

        // 나눗셈
        // 소수점 이하는 버려진다.
        System.out.print("a / b = ");
        System.out.println(a / b);

        // 10 / 4.0f -> 10.0f / 4.0f -> 2.5
        // 소수점 이하를 살리기 위한 방법
        System.out.print("a / (float)b = ");
        System.out.println(a / (float)b);
    }
}

class Operator4_2 {
    public static void main(String[] args) {
        char ch = '2';

        // 문자 '2' 는 숫자로 50, '0' 은 48
        // 따라서 int 타입으로 자동으로 변하기 때문에 50 - 48 = 2
        System.out.print("ch - '0' = ");
        System.out.println(ch - '0');

        int a = 1_000_000; // 1백만
        int b = 2_000_000; // 2백만

        // a * b = 2_000_000_000_000 -> 10^12
        // long 에 저장하려는 것은 맞지만 a * b 의 결과 타입이 int
        // 따라서 이미 계산을 할 때 오버플로우 발생! -> 따라서 계산을 할 때 형변환 필요!
        // long l = a * b; // -1454759936

        long l = (long)a * b;
        // long * int -> long * long => 1_000_000L * 2_000_000 -> 1_000_000L * 2_000_000L
        System.out.println("l = " + l);
    }
}

class Operator5_1 {
    public static void main(String[] args) {
        // round() : 실수를 소수점 첫 째자리에서 반올림한 정수를 반환합니다.
        // ceil() : 올림값을 double 형으로 반환합니다.
        // floor() : 내림값을 double 형으로 반환합니다.
        // abs() : int, double 기본형 모두 사용 가능하며 절대값을 얻습니다.

        long result = Math.round(3.645678);
        System.out.println("result = " + result);

        // 소수점 4째 자리에서 반올림한 값을 구하라!
        double pi = 3.141592;
        System.out.println(Math.round(pi * 1000) / 1000f);
        // pi * 1000 = 3141.592
        // Math.round(3141.592) = 3142
        // 3142 / 1000.0 = 3.142
        double shortPi = Math.round(pi * 1000) / 1000.0;
        System.out.println(shortPi); // 3.142

        // 3.141 구하기!
        double pi2 = 3.141592;
        System.out.println((int)(pi2 * 1000)/1000f);
        // pi2 * 1000 = 3141.592
        // (int)3141.592
        System.out.println("(int)(pi2 * 1000) = " + (int) (pi2 * 1000));
        System.out.println("(int)(pi2 * 1000) / 1000.0  = " + (int) (pi2 * 1000) / 1000.0);
    }
}

class Operator5_2 {
    public static void main(String[] args) {
        double num = 3.14;

        System.out.println("반올림 : " + Math.round(num)); // 반올림 : 3
        System.out.println("올림 : " + Math.ceil(num)); // 올림 : 4.0
        System.out.println("내림 : " + Math.floor(num)); // 내림 : 3.0
        System.out.println("절대값 : " + Math.abs(num*-1)); // 절대값 : 3.14
    }
}

class Operator5_3 {
    public static void main(String[] args) {
        int x = 10;
        int y = 8;

        System.out.print("x를 y로 나눈 몫 = ");
        System.out.println(x / y);

        System.out.print("x를 y로 나눈 나머지 = ");
        System.out.println(x % y);

        // 부호 무시 확인
        int n = 3;
        int z = -3;
        System.out.println("x / n = " + x / n);
        System.out.println("x % n = " + x % n);
        System.out.println("x / z = " + x / z);
        System.out.println("x % z = " + x % z);
    }
}

class Operator6_1 {
    public static void main(String[] args) {
        int n1 = 10, n2 = 6;
        char c1 = 'A', c2 = 'B';

        System.out.print("n1 >= n2 = " ); // true
        System.out.println(n1 >= n2);
        System.out.print("n1 <= n2 = " ); // false
        System.out.println(n1 <= n2);

        System.out.print("n1 == n2 = " ); // false
        System.out.println(n1 == n2);
        System.out.print("n1 != n2 = " ); // true
        System.out.println(n1 != n2);

        // 산술변환 규칙에 의해서 char 타입이 int 타입으로 변환되어 연산됨
        System.out.print("c1 < c2 = "); // true
        System.out.println(c1 < c2); // 65 < 66
        System.out.print("c1 > c2 = "); // false
        System.out.println(c1 > c2); // 65 > 66
    }
}

class Operator6_2 {
    public static void main(String[] args) {
        String s1 = "사랑";
        String s2 = "사랑";

        System.out.print("s1 == s2 = "); // true
        System.out.println(s1 == s2);
        System.out.println("s1.equals(s2) = " + s1.equals(s2)); // true

        // 하지만!
        // 문자열 비교에는 == 대신 equals()를 사용해야 합니다.
        //        equals : 비교하고자 하는 두 피연산자의 값 자체를 비교합니다.
        //        == : 비교하고자 하는 두 피연산자의 주소값을 비교합니다.
        String s3 = new String("사랑");
        System.out.print("s1 == s3 = "); // false
        System.out.println(s1 == s3);
        System.out.println("s1.equals(s3) = " + s1.equals(s3)); // true
    }
}

class Operator7_1 {
    public static void main(String[] args) {
        boolean result1, result2, result3, result4, reusult5, result6;

        char ch1 = 'a', ch2 = 'B';  // 'a' : 97 , 'A' : 65, 'B' : 66, 'C' : 67

        result1 = ch1 > 'A' && ch2 < 'C';
        result2 = ch1 == 'A' && ch2 < 'C';

        result3 = ch1 > 'A' || ch2 < 'C';
        result4 = ch1 < 'A' || ch2 > 'C';

        System.out.println("&& 연산자에 의한 결과 result1 = " + result1); // true
        System.out.println("&& 연산자에 의한 결과 result2 = " + result2); // false

        System.out.println("|| 연산자에 의한 결과 result3 = " + result3); // true
        System.out.println("|| 연산자에 의한 결과 result4 = " + result4); // false

        System.out.println("! 연산자에 의한 결과 result4 = " + !result4); // true

        System.out.println();

        int num = 10;
        // num 은 2의 배수 그리고 3의 배수이다.
        reusult5 = num % 2 == 0 && num % 3 == 0;
        System.out.println("num 은 2의 배수 그리고 3의 배수 = " + reusult5); // false

        // num 은 2의 배수 또는 3의 배수이다.
        result6 = num % 2 == 0 || num % 3 == 0;
        System.out.println("num 은 2의 배수 또는 3의 배수 = " + result6); // true
    }
}