class RecursionAdvanced19{

		
	public static int countPaths(int i,int j,int n,int m){

		if(i == n || j == m){

			return 0;	
		}
		if(i == n-1 && j == n-1){

			return 1;
		}

		//move downword
		int downpath = countPaths(i+1,j,n,m);

		//move rightword
		int rightpath = countPaths(i,j+1,n,m);

		return downpath + rightpath;
	}

	public static void main(String args[]){

		int n=3;
		int m=3;
		
		int totalpath = countPaths(0,0,n,m);

		System.out.println("Total Paths = "+totalpath);
	
	}

}