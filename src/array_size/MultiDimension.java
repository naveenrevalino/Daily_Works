package array_size;

public class MultiDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int refvar[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print(refvar[i][j]+" ");	
			}
			System.out.println();
			
		}
	

	}

}
