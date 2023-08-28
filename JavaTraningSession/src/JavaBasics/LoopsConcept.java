package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1.while loop:
		//disadvantage of while loop: it will generate inifinite loop if you dont give incremental/decremental part 
		//print 1 to 10
		
		int i =1;//initialization
		while(i<=10){//conditional
			System.out.println(i);
			i=i+1;//incremental/decremental
		}
		
		System.out.println("********");
		
		//j++ means j = j + 1
		
           //2. for loop:
		   for(int j=1; j<=10;j++){//intilialization, Conditional, Incremental
			   System.out.println(j);
		   }
		
		//print 10 to 1
		   //k-- means k = k-1
		   //10 9 8 7 6 5 4 3 2 1 
		   for(int k=10; k>=1; k--){//intialization, Conditonal, Decremantal
		   System.out.println(k);
		   }
		
		
		
		
	}

}
