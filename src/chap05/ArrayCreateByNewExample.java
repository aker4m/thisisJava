package chap05;

public class ArrayCreateByNewExample {
	public static void main(String[] args){
		int num = 3;
		int[] arr1 = new int[num];
		for(int i=0;i<arr1.length;i++){
			System.out.println("arr1["+(i+1)+"] : "+ arr1[i]);
		}
		
		for(int i=0;i<arr1.length;i++){
			arr1[i]=(i+1)*10;
			System.out.println("arr1["+(i+1)+"] : "+ arr1[i]);
		}
		
		double[] arr2 = new double[num];
		for(int i=0;i<arr2.length;i++){
			System.out.println("arr2["+(i+1)+"] : "+ arr2[i]);
		}
		
		for(int i=0;i<arr2.length;i++){
			arr2[i] = (i+1)*0.1;
			System.out.println("arr2["+(i+1)+"] : "+ arr2[i]);
		}
		
		String[] arr3 = new String[num];
		for(int i=0;i<arr3.length;i++){
			System.out.println("arr3["+(i+1)+"] : "+ arr3[i]);
		}
		
		for(int i=0;i<arr3.length;i++){
			arr3[i]=(i+1)+"월";
			System.out.println("arr3["+(i+1)+"] : "+ arr3[i]);
		}
	}
}
