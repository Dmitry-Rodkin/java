// ������������ ����������� �������
class ArrayDemo{
	public static void main(String agrs []){
		int sample[]  = new int[10];
		int i;
		
		for(i = 0; i < 10; i = i + 1)
			sample[i] = i;
		
		for (i = 0; i < 10; i++)
			System.out.println("������� [" + i + " ]: " + sample[i]);
	}
}
