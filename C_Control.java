public class C_Control {
    public static void main(String[] args) {

    }
}

class Control1_1 {
    public static void main(String[] args) {
        char ch = 'b';
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("해당 문자는 영문 소문자입니다.");
        }
    }
}

class Control1_2 {
    public static void main(String[] args) {
        char ch = 'Z';
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("해당 문자는 영문 소문자입니다.");
        } else {
            System.out.println("해당 문자는 영문 소문자가 아닙니다.");
        }
    }
}

class Control1_3 {
    public static void main(String[] args) {
        char ch = 'p';

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("해당 문자는 영문 소문자입니다.");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("해당 문자는 영문 대문자입니다.");
        } else {
            System.out.println("해당 문자는 영문자가 아닙니다.");
        }

        int score = 70;

        if (score >= 90) {
            System.out.println("A등급입니다.");
        } else if(score >= 80) {
            System.out.println("B등급입니다.");
        } else if(score >= 70) {
            System.out.println("C등급입니다.");
        }
    }
}

class Control1_4 {
    public static void main(String[] args) {
        int score = 87;

        if (score >= 90) {
            if(score >= 95){
                System.out.println("A++등급입니다.");
            }else {
                System.out.println("A등급입니다.");
            }
        } else if(score >= 80) {
            if(score >= 85){
                System.out.println("B++등급입니다.");
            }else {
                System.out.println("B등급입니다.");
            }
        } else if(score >= 70) {
            if(score >= 75){
                System.out.println("C++등급입니다.");
            }else {
                System.out.println("C등급입니다.");
            }
        }else {
            System.out.println("D등급입니다.");
        }
    }
}

class Control2_1 {
    public static void main(String[] args) {
        int month = 8;
        String monthString = "";
        switch (month) {
            case 1:  monthString = "January";
                break;
            case 2:  monthString = "February";
                break;
            case 3:  monthString = "March";
                break;
            case 4:  monthString = "April";
                break;
            case 5:  monthString = "May";
                break;
            case 6:  monthString = "June";
                break;
            case 7:  monthString = "July";
                break;
            case 8:  monthString = "August";
                break;
            case 9:  monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            case 0: case 13:
                System.out.println("이런식으로 case 문을 사용할 수 있습니다.");
                break;
            case 15:
            default: monthString = "Invalid month";
        }
        System.out.println(monthString);
    }
}

class Control3_1 {
    public static void main(String[] args) {
        int i = 0;
        for (i = 0; i < 5; i++) {
            System.out.println("for 문이 " + (i + 1) + "번째 반복 실행중입니다.");
        }
        System.out.println("for 문이 종료된 후 변수 i의 값은 " + i + "입니다.");
    }
}

class Control3_2 {
    public static void main(String[] args) {
        // 1번
        int i = 0;
        for (i = 1; i <= 10; i = i * 2) {
            System.out.println("1번 i는 현재 " + (i) + "입니다."); // 1, 2, 4, 8 까지 출력 / 종료된 후 변수의 값은 16
        }
        System.out.println(i);
        System.out.println();
        // 2번
        i = 0;
        for (i = 10; i >= 1; i--) {
            System.out.println("2번 i는 현재 " + (i) + "입니다."); // 10부터 1까지 1씩 작아지게 출력 종료 후 변수의 값은 0
        }
        System.out.println(i);
    }
}

class Control3_3 {
    public static void main(String[] args) {
        // 초기화 시 변수 2개 사용 가능합니다. 단, 타입이 같아야 한다.
        for (int i = 1, j = 10; i <= 10; i++, j--) {
            System.out.println("i는 현재 " + (i) + "입니다.");
            System.out.println("j는 현재 " + (j) + "입니다.");
        }
        System.out.println();
        // 이렇게 변수 2개를 사용하여 조건식을 구성할 수 있습니다.
        for (int k = 1, t = 10; k <= 10 && t > 2; k++, t--) {
            System.out.println("k는 현재 " + (k) + "입니다.");
            System.out.println("t는 현재 " + (t) + "입니다.");
        }
    }
}

class Control3_4 {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            System.out.println(i + "단 시작합니다.");
            for (int j = 1; j < 10; j++) {
                System.out.println("j는 현재 " + (j) + "입니다.");
                System.out.println(i + "*" + j + "=" + (i * j));
            }
        }
    }
}

class Control3_5 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};

        for (int e : arr) {
            System.out.print(e + " ");
        }
    }
}

// 0.0 <= Math.random() < 1.0
// 1 부터 5 사이의 random 한 정수 값 구하기
//      1. 0.0 * 5 <= Math.random() * 5 < 1.0 * 5
//      2. (int)0.0 <= (int)(Math.random() * 5) < (int)5.0
//      3. 0 + 1 <= (int)(Math.random() * 5) + 1 < 5 + 1
//      4. 1 <= (int)(Math.random() * 5) + 1 < 6
class Control4_1 {
    public static void main(String[] args) {
        // 괄호 { } 안의 내용을 20번 반복
        // 1. 1 ~ 10 사이의 난수를 20개 출력하시오.
        // 1,2,3,4,5,6,7,8,9,10

        for (int i = 0; i < 10; i++) {
            System.out.println((int)(Math.random() * 10) + 1);
        }

        // 2. -5 ~ 5 사이의 난수를 20개 출력하시오.
        // -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5
        for (int i = 0; i < 20; i++) {
            // 1번
            System.out.println((int) (Math.random() * 11) - 5);  // 1. 0 <= x * 11 < 11 int로 변환하면 0 ~ 10 -5하면 -5 ~ 5
//            System.out.println(Math.random() * 10); // 1. 0.0 * 10 <= x * 10 < 1.0 * 10
//            System.out.println((int)(Math.random() * 10)); // 2. 0 <= (int)(x * 10) < 10
//            System.out.println((int)(Math.random() * 10) + 1); // 3. 1 <= (int)(x * 10) + 1 < 11

            // 2번
            double random = Math.random();
//            System.out.println((int)(Math.random() * 11)); // 0 ~ 10
            //System.out.println((int)(Math.random() * 11) - 5); // -5 ~ 5
        }
    }
}

class Control5_1 {
    public static void main(String[] args) {
        int i = 10; // while 반복 횟수 , 즉 for 문의 초기화

//        while (i-- != 0) {
//            System.out.println(i);
//        }

        // 위 코드와 같은 동작을 수행합니다.
        while (i != 0) {
            i--;
            System.out.println(i);
        }
    }
}

class Control5_2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (sum <= 100) {
            System.out.println("i = " + i);
            System.out.println("sum = " + sum);
            sum += ++i;
        }
    }
}

class Control5_3 {
    public static void main(String[] args) {
        int j = 1;

        do {
            System.out.println("do / while 문이 " + j + "번째 반복 실행중입니다.");
            j++; // 이 부분을 삭제하면 무한 루프에 빠지게 됨.
        } while (j < 20);

        System.out.println("do / while 문이 종료된 후 변수 j의 값은 " + j + "입니다.");
    }
}

class Control6_1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (true) {
            if(sum > 100)
                break;
            ++i;
            sum += i;
        }

        System.out.println("i = " + i);
        System.out.println("sum = " + sum);
    }
}

class Control6_2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            // 3의 배수는 건너뜀 : 3, 6, 9
            if (i % 3 == 0)
                continue;
            System.out.println("i = " + i);
        }
    }
}

class Control6_3 {
    public static void main(String[] args) {
        allLoop :
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i == 5) {
                    break allLoop;
                }
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}

class Control6_4 {
    public static void main(String[] args) {
        int i = 2;
        allLoop :
        while (true) {
            for (int j = 1; j < 10; j++) {
                if (i == 5) {
                    break allLoop;
                }
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            i++;
        }
    }
}

class Control6_5 {
    public static void main(String[] args) {
        allLoop : for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i == 5) {
                    continue allLoop;
                }
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}