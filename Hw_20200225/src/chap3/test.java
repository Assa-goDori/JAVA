package chap3;

public class test {

	public static void main(String[] args) {
		//byte var1 = 128; 		// int ���� : -128 ~ 127
		short var2 = 128; 		// ����
		int var3 = (int)28L; 	// ���������ȯ
		long var4 = 128L;		// ����
		//float var5 = 1.2; 		// ���̻� f �ٿ����� or ����ȯ ������ (float)1.2 �ۼ�
		double var6 = 1.2;		// ����
		float var7 = 42e1f; 	// 42x10^1 = 420 (e = 10.0) / ��°� : 420.0 
		float var8 = 0x0123; 	// 16���� 256 + 32 + 3 / ��°� : 291.0
		float var9 = '1'; 		// char => float ����ȯ / ASCII�ڵ� 49 = 1 / ��°� : 49.0 
	}
}