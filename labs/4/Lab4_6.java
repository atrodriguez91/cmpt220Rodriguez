// Troubleshooted with classmate
public class Lab4_6 {

	public static void main(String[] args) {
		
		int[] arrayList = new int[20];
		arrayList[0] = -1;
		arrayList = addNumber(arrayList, 1);
		arrayList= addNumber(arrayList, 2);
		arrayList = addNumber(arrayList, 3);
		arrayList = addNumber(arrayList, 4);
		arrayList = addNumber(arrayList, 5);
		arrayList = addNumber(arrayList, 6);
		arrayList = addNumber(arrayList, 7);
		arrayList = addNumber(arrayList, 8);
		arrayList = addNumber(arrayList, 9);
		arrayList = addNumber(arrayList, 10);
		
		for(int i = 0; i < arrayList.length; i++) {
			if(arrayList[i] == -1) {
				break;	
			}
			
			System.out.println(arrayList[i]);
		}
		arrayList = speciAdd(arrayList, 10, 3);
		arrayList = speciAdd(arrayList, 100, 7);
		System.out.println();
		
		for(int i = 0; i < arrayList.length; i++) {
			if(arrayList[i] == -1) {
				break;	
			}
			
			System.out.println(arrayList[i]);
		}

	}

	public static int[] speciAdd(int[] arr, int num, int pos) {
		int[] newArray = new int[arr.length];
		for(int i =0; i < arr.length-1; i++) {
			if(i > pos - 1) {
				newArray[i] = arr[i-1];	
			}
			else if(i < pos - 1) {
				newArray[i] = arr[i];	
			}
			else {
				newArray[i] = num;	
			}
		}
		return newArray;
		
	}
	
	public static int[] addNumber(int[] arry, int num) {
		for(int i = 0; i < arry.length-1; i++) {
			if(arry[i] == -1) {
				arry[i] = num;
				arry[i+1] = -1;
				return arry;
			}
		}
		return arry;
	}


	}


