class RecursionQDemo{

	public static int first = -1;
	public static int last = -1;

	public static void stringRev(String str , int index , char d,int n){

		if(index == str.length()){

			System.out.println("First D = "+first+" index");
			System.out.println("Last D = "+last+" index");
			System.out.println("Total D = "+n);
			return;
		}

		if(d == str.charAt(index)){


			n +=1;

			if(first == -1){

				first = index;
			}else{

				last = index;

			}
			
		}

		stringRev(str,index+1,d,n);

	}

	public static void main(String args[]){
	

		String str="sadadfaagsta";
		int n=0;
		stringRev(str,0,'d',n);
			
	}

}