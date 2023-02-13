public class Exercise2 {
    public static void main(String[] args) {

    }
}

class Exercise2_4 {
    public static void main(String[] args) {
        //2-4. 다음 중 변수를 잘못 초기화 한 것은?
        //byte b = 256;		    // 이것
        //char c = '';			// 이것
        //char answer = 'no';	// 이것
        //float f = 3.14		// 이것
        //double d = 1.4e3f;
    }
}

class Exercise2_7 {
    public static void main(String[] args){

//2-7. 다음 문장들의 출력 결과를 적으세요. 오류가 있는 문장의 경우, '오류' 라고 적으세요.
        // System.out.println("1" + "2"); 	// 12
        // System.out.println(true + "");	// true
        // System.out.println('A' + 'B');	// AB
        // System.out.println('1' + 2);	    // 12
        // System.out.println('1' + '2');	// 12
        // System.out.println('J' +"ava");	// Java
        // System.out.println(true + null);	// 오류
    }
}

//2-8. 아래는 변수 x, y, z의 값을 서로 바꾸는 예제이다. 결과와 같이 출력되도록 코드를 넣으세요.
class Exercise2_8{
    public static void main(String[] args){
        int x = 1;
        int y = 2;
        int z = 3;

        int a = z;
        z = x;
        x = y;
        y = a;

        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
    }
}
//예상 결과 : x=2, y=3, z=1