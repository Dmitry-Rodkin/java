class Bubble {
	public static void main(String args[]){
		int num[] = { 1, 3, 4, 8, 5, 6, 0, 22, 56, 33333};
		int a, b, t;
		int size;
		
		size = 10;
		
		//nativ array 
		
		System.out.print("Исходный массив");
		for (int i = 0; i < size; i++)
			System.out.print(" " + num[i]);
		System.out.println();
		
		//ђеализция алгоритма пузырьковой сортировки 
		for (a=1; a < size; a++)
			for(b = size-1; b >= a; b--) {
				if (num[b-1] > num[b]){
					
					
					
					t = num[b-1];
					num[b-1] = num[b];
					num[b] = t;
				}
				
			}
			// Отображаем отсортированный массив
			System.out.print("Отсортированный массив");
			for(int i = 0; i < size; i++)
				System.out.print(" " + num[i]);
			System.out.println();
	}
}

		