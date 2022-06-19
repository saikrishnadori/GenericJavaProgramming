package ArrayProgram;

public class ThreeDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][][]= {{{1,2,3,4},{5,6,7,8}},{{1,2,3,4},{5,6,7,8}}};
		
		for(int i=0;i<a.length;i++) {
			for (int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.println(a[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
			
		}

	
	}

}
