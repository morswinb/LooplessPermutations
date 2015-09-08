package TestsAndExamples;

import Permute.Int.PermutationRecieverInt;

public class IntegerLock implements PermutationRecieverInt{
	
	private int key;
	private boolean opened=false;
	
	public IntegerLock(int key){
		this.key=key;
	}
	
	boolean isOpened(){
		return opened;
		
	}
	
	@Override
	public void recieve9(int s1, int s2, int s3, int s4, int s5, int s6,
			int s7, int s8, int s9) {

		int guess=	s1*100000000+
					s2*10000000+
					s3*1000000+
					s4*100000+
					s5*10000+
					s6*1000+
					s7*100+
					s8*10+s9;
		
		if(guess==key){
			opened=true;
		}
					
	}

	@Override
	public void recieve2(int s1, int s2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recieve3(int s1, int s2, int s3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recieve4(int s1, int s2, int s3, int s4) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recieve5(int s1, int s2, int s3, int s4, int s5) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recieve6(int s1, int s2, int s3, int s4, int s5, int s6) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recieve7(int s1, int s2, int s3, int s4, int s5, int s6, int s7) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recieve8(int s1, int s2, int s3, int s4, int s5, int s6,
			int s7, int s8) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recieve10(int s1, int s2, int s3, int s4, int s5, int s6,
			int s7, int s8, int s9, int s10) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recieve11(int s1, int s2, int s3, int s4, int s5, int s6,
			int s7, int s8, int s9, int s10, int s11) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recieve12(int s1, int s2, int s3, int s4, int s5, int s6,
			int s7, int s8, int s9, int s10, int s11, int s12) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recieve13(int s1, int s2, int s3, int s4, int s5, int s6,
			int s7, int s8, int s9, int s10, int s11, int s12, int s13) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recieve14(int s1, int s2, int s3, int s4, int s5, int s6,
			int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recieve15(int s1, int s2, int s3, int s4, int s5, int s6,
			int s7, int s8, int s9, int s10, int s11, int s12, int s13,
			int s14, int s15) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recieve16(int s1, int s2, int s3, int s4, int s5, int s6,
			int s7, int s8, int s9, int s10, int s11, int s12, int s13,
			int s14, int s15, int s16) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recieve17(int s1, int s2, int s3, int s4, int s5, int s6,
			int s7, int s8, int s9, int s10, int s11, int s12, int s13,
			int s14, int s15, int s16, int s17) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recieve18(int s1, int s2, int s3, int s4, int s5, int s6,
			int s7, int s8, int s9, int s10, int s11, int s12, int s13,
			int s14, int s15, int s16, int s17, int s18) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recieve19(int s1, int s2, int s3, int s4, int s5, int s6,
			int s7, int s8, int s9, int s10, int s11, int s12, int s13,
			int s14, int s15, int s16, int s17, int s18, int s19) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recieve20(int s1, int s2, int s3, int s4, int s5, int s6,
			int s7, int s8, int s9, int s10, int s11, int s12, int s13,
			int s14, int s15, int s16, int s17, int s18, int s19, int s20) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recieve21(int s1, int s2, int s3, int s4, int s5, int s6,
			int s7, int s8, int s9, int s10, int s11, int s12, int s13,
			int s14, int s15, int s16, int s17, int s18, int s19, int s20,
			int s21) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recieve22(int s1, int s2, int s3, int s4, int s5, int s6,
			int s7, int s8, int s9, int s10, int s11, int s12, int s13,
			int s14, int s15, int s16, int s17, int s18, int s19, int s20,
			int s21, int s22) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recieve23(int s1, int s2, int s3, int s4, int s5, int s6,
			int s7, int s8, int s9, int s10, int s11, int s12, int s13,
			int s14, int s15, int s16, int s17, int s18, int s19, int s20,
			int s21, int s22, int s23) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recieve24(int s1, int s2, int s3, int s4, int s5, int s6,
			int s7, int s8, int s9, int s10, int s11, int s12, int s13,
			int s14, int s15, int s16, int s17, int s18, int s19, int s20,
			int s21, int s22, int s23, int s24) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recieve25(int s1, int s2, int s3, int s4, int s5, int s6,
			int s7, int s8, int s9, int s10, int s11, int s12, int s13,
			int s14, int s15, int s16, int s17, int s18, int s19, int s20,
			int s21, int s22, int s23, int s24, int s25) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recieve26(int s1, int s2, int s3, int s4, int s5, int s6,
			int s7, int s8, int s9, int s10, int s11, int s12, int s13,
			int s14, int s15, int s16, int s17, int s18, int s19, int s20,
			int s21, int s22, int s23, int s24, int s25, int s26) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recieve27(int s1, int s2, int s3, int s4, int s5, int s6,
			int s7, int s8, int s9, int s10, int s11, int s12, int s13,
			int s14, int s15, int s16, int s17, int s18, int s19, int s20,
			int s21, int s22, int s23, int s24, int s25, int s26, int s27) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recieve28(int s1, int s2, int s3, int s4, int s5, int s6,
			int s7, int s8, int s9, int s10, int s11, int s12, int s13,
			int s14, int s15, int s16, int s17, int s18, int s19, int s20,
			int s21, int s22, int s23, int s24, int s25, int s26, int s27,
			int s28) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recieve29(int s1, int s2, int s3, int s4, int s5, int s6,
			int s7, int s8, int s9, int s10, int s11, int s12, int s13,
			int s14, int s15, int s16, int s17, int s18, int s19, int s20,
			int s21, int s22, int s23, int s24, int s25, int s26, int s27,
			int s28, int s29) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recieve30(int s1, int s2, int s3, int s4, int s5, int s6,
			int s7, int s8, int s9, int s10, int s11, int s12, int s13,
			int s14, int s15, int s16, int s17, int s18, int s19, int s20,
			int s21, int s22, int s23, int s24, int s25, int s26, int s27,
			int s28, int s29, int s30) {
		// TODO Auto-generated method stub
		
	}
	
}