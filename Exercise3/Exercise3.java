package Exercise3;

public class Exercise3 {
    public static void main(String[] args) {

    }
}

class Exercise3_1 {
    public static void main(String[] args) {
        byte b = 10;
        char ch = 'A';
        int i = 100;
        long l = 1000L;
//3-1. 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오)
        b = (byte)i;
        ch = (char)b;           // char는 음수 X이므로 byte를 char로 꼭 형변환을 해줘야함!!
        short s = (short)ch;    // 2byte로 같지만 char는 음수 X이므로 범위가 다름
        System.out.println(l);
        float f = (float)l;	    // 가능
        System.out.println(f);
        i = (int)ch;		    // 가능
    }
}

//3-2. 다음 연산의 결과와 그 이유를 적으세요.
class Exercise3_2{
    public static void main(String[] args){
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2);	// true &&가 먼저 진행됨
        System.out.println(y += 10 - x++);		        // 13 : y는 15가 되고 x는 빼진 후 +1이 되므로 15-2
        System.out.println(x += 2);				        // 4 : x에 +2한다
        System.out.println(!('A' <= c && c <= 'Z'));	// false : 'A' 와 c는 같고 c는 'Z'보다 작으므로 !(true && true)
        System.out.println('C' - c);				    // 2 : 'C'와 'A'의 문자코드의 차이는 2
        System.out.println('5' - '0');                  // 5 : 문자코드의 차이는 5
        System.out.println(c + 1);                      // 66 : +1 하면서 int로 형변환 됨
        System.out.println(++c);                        // B : +1한 값을 c(char)에 넣음
        System.out.println(c++);                        // B : c값을 출력 후 +1
        System.out.println(c);                          // C : 위에서 +1 된 후 값을 출력
    }
}



//3-3. 아래는 변수의 num 값 중에서 백의 자리 이하를 버리는 코드이다.
//만일 변수 num의 값이 '456'이라면 '400'이 되고, '111'이라면 '100'이 된다.
//알맞은 코드를 넣으시오.
class Exercise3_3 {
    public static void main(String[] args){
        int num = 456;
        int rest = num % 100;
        System.out.println(num - rest);
    }
}
//예상 결과 -> 400


//3-4. 아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다.
//만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 13개의 바구니가 필요할 것이다.
//알맞은 코드를 넣으시오.
class Exercise3_4{
    public static void main(String[] args){
        int numOfApples = 123; // 사과의 개수
        int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)

        int rest = numOfApples % sizeOfBucket;
        int numOfBucket = (rest == 0 ? numOfApples / sizeOfBucket : numOfApples / sizeOfBucket + 1); // 모든 사과를 담는데 필요한 바구니의 수

        System.out.println("필요한 바구니의 수 :"+numOfBucket);
    }
}
//예상 결과 -> 필요한 바구니의 수 :13



//3-5. 아래는 변수 num의 값에 따라 '양수', '음수', '0'을 출력하는 코드이다.
//삼항연산자를 이용해서 빈칸에 알맞은 코드를 넣으시오.
//Hint : 삼항 연산자를 두 번 사용할 것!
class Exercise3_5{
    public static void main(String[] args){
        int num = 10;
        System.out.println(num > 0 ? "양수" : (num == 0 ? 0 : "음수"));
    }
}
//예상 결과 : 양수



//3-6. 아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다.
//변환 공식이 'C = 5/9*(F-32)'라고 할 때, 빈 칸에 알맞은 코드를 넣으시오.
// 단, 변환값은 소수점 셋째자리에서 반올림하며, Math.round() 함수를 사용하지 않고 처리할 것!
class Exercise3_6{
    public static void main(String[] args){
        int fahrenheit = 100;
        float celcius =  5/9f * (fahrenheit-32);  // 37.77778
        celcius *= 100; // 3777.78
        celcius += 0.5; // 3778.28

        System.out.println(celcius);
        //float celcius = (int)((5/9f * (fahrenheit - 32)) * 100 + 0.5) / 100f;

        //float celcius = 5/9f;         // 소수점이 필요하므로 f를 붙여준다.
        System.out.println(celcius);
        celcius *= (fahrenheit - 32);   // 계산을 진행한다.
        System.out.println(celcius);
        celcius *= 100;                 // * 100 한다.
        System.out.println(celcius);
        celcius += 0.5;                 // + 0.5 한다. (반올림을 확인하기 위해 더함)
        System.out.println(celcius);
        celcius = (int)celcius;         // int로 형변환 한다. (정수 뒷 부분은 소수점 셋째자리 이후이므로 버릴 예정)
        System.out.println(celcius);
        celcius /= 100f;                // 100으로 나눠 원래 소수점 자리로 이동한다.
        System.out.println(celcius);

        System.out.println("Fahrenheit:"+fahrenheit);
        System.out.println("Celcius:"+celcius);
    }
}
//예상 결과 : Fahrenheit:100, Celcius:37.78