import java.util.ArrayList;
import java.util.Collections;

public class Game{
	ArrayList cards;
	public static void main(String[] args) {
		Game g = new Game();
		g.deal();
		g.display();
	}
	
	public ArrayList deal(){
		if(cards == null){
			cards = new ArrayList();
			for(int i=1;i<=52;i++){
				cards.add(i);
			}
		}
		Collections.shuffle(cards);
		return cards; 	
	}
	
	public void display(){
		String[] player = {"东家","西家","南家","北家"};
		for(int i=0;i<4;i++){
			System.out.print(player[i] + ": ");
			for(int j=i*13;j<(i+1)*13;j++){
				System.out.print(cards.get(j) + ", ");
			}
			System.out.println();
		}	
	}
}