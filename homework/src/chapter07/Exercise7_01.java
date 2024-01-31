package chapter07;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
		for(int i = 0; i < CARD_NUM; i++) {
			if(i == 0 || i == 2 || i == 7) {
				cards[i] = new SutdaCard(i % 10 + 1, true);
			} else {
				cards[i] = new SutdaCard(i % 10 + 1, false);
			}
		}
	}

	//배열 cards에 담긴 카드의 위치를 뒤섞는다.(Math.random()사용)
	void shuffle() {
		for(int i = 0; i < 500; i++) {
			int idx1 = (int) (Math.random() * CARD_NUM);
			int idx2 = (int) (Math.random() * CARD_NUM);
			SutdaCard temp = cards[idx1];
			cards[idx1] = cards[idx2];
			cards[idx2] = temp;
		}
	}

	//배열 cards에서 지정된 위치의 SutdaCard를 반환한다.
	SutdaCard pick(int index) {
		return cards[index];
	}

	//배열 cards에서 임의의 위치의 SutdaCard를 반환한다.(Math.random()사용)
	SutdaCard pick() {
		int rand = (int) (Math.random() * CARD_NUM);
		return cards[rand];
	}

}
class SutdaCard {
	int num;
	boolean isKwang;
	SutdaCard() {
		this(1, true);
	}
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	// info()대신 Object클래스의 toString()을 오버라이딩했다.
	public String toString() {
		return num + ( isKwang ? "K":"");
	}

}

public class Exercise7_01 {

	public static void main(String[] args) {

		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i=0; i < deck.cards.length;i++) {
			System.out.print(deck.cards[i]+",");
		}
		
		System.out.println();
		System.out.println(deck.pick(0));
	}

}
