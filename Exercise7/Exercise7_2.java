package Exercise7;

//7-2. 연습문제 7-1. 의 SutdaDeck클래스에 다음에 정의된 새로운 메서드를 추가하고 테스트 하시오.
//        [주의] Math.random()을 사용하는 경우 실행결과와 다를 수 있음.
//        메서드명 : shuffle
//        기 능 : 배열 cards에 담긴 카드의 위치를 뒤섞는다.(Math.random()사용)
//        반환타입 : 없음
//        매개변수 : 없음
//        메서드명 : pick
//        기 능 : 배열 cards에서 지정된 위치의 SutdaCard를 반환한다.
//        반환타입 : SutdaCard
//        매개변수 : int index - 위치
//        메서드명 : pick
//        기 능 : 배열 cards에서 임의의 위치의 SutdaCard를 반환한다.(Math.random()사용)
//        반환타입 : SutdaCard
//        매개변수 : 없음
class SutdaDeck2 {
    final int CARD_NUM = 20;
    SutdaCard3[] cards = new SutdaCard3[CARD_NUM];

    SutdaDeck2() {
        // 연습문제 7-1 의 답이므로 내용생략
        for (int i = 0; i < cards.length; i++){
            switch (i+1){
                case 1:
                case 3:
                case 8:
                    cards[i] = new SutdaCard3(i % 10 + 1, true);
                    break;
                default:
                    cards[i] = new SutdaCard3(i % 10 + 1, false);
                    break;
            }
        }
    }

    void shuffle() {
        for (int i = 0; i < cards.length; i++){
            int random = (int)(Math.random() * cards.length);
            SutdaCard3 cardNum = cards[0];
            cards[0] = cards[random];
            cards[random] = cardNum;
        }
    }

    SutdaCard3 pick(int index) {
        if(index < 0 || index >= CARD_NUM) return null; // index의 유효성 검사
        return cards[index];
    }

    SutdaCard3 pick() {
        int index = (int)(Math.random() * cards.length);
        return cards [index];
    }
} // SutdaDeck

class SutdaCard3 {
    int num;
    boolean isKwang;

    SutdaCard3() {
        this(1, true);
    }

    SutdaCard3(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + ( isKwang ? "K":"");
    }
}

class ExerciseTest {
    public static void main(String args[]) {
        SutdaDeck2 deck = new SutdaDeck2();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for(int i=0; i < deck.cards.length;i++)
            System.out.print(deck.cards[i]+",");

        System.out.println();
        System.out.println(deck.pick(0));
    }
}
//예상결과)
// 1K
// 7
// 2,6,10,1K,7,3,10,5,7,8,5,1,2,9,6,9,4,8K,4,3K,
// 2
