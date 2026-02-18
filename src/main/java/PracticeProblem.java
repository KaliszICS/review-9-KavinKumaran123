public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int lettersToFive(String b , char a){
		int i = 0;
		int c = 0;
		if (b.indexOf(a)==-1){
			return -1;
		}
		while (i< b.length()&& c <5 ){
			if (b.charAt(i) == a){
				c++;

			}
			i++;

		}
		return i;

	}
	public static int countLetter(String a, char b){
		int i = 0;
		int c = 0;
		while (i< a.length()){
			if (a.charAt(i) == b){
				c++;
			}
			i++;

		}
		return c;

	}
	public static int oddSum(int a, int b){

		int c = 0;
		if (a > b){
			int d = a;
			a= b;
			b = d;
		}
		while (a <= b){
			if (a%2 !=0){
				c = c+a;
			}
			a++;

		}
		return c;

	}

}
