package chap8;
/*
 * final ���� �Ұ�
 * final method : ������ �Ұ�. �������̵� �Ұ� �޼���
 * abstract <=> final �ݴ밳���� �ǹ�
 * 		abstract : �ݵ�� �������̵� �ؾߵ�
 * 		final : ����� �������̵� �� �� ����
 */
public class FinalMethod {
	protected final void finalMethod() {
		System.out.println("finalMethod �������̵� �Ұ� �޼���");
	}
}

class SubMethod extends FinalMethod {
//	@Override
//	protected void finalMethod() {
//		System.out.println("finalMethod �������̵� �Ұ� �޼���");
//	}
}
