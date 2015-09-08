package Permute.Int;

public class PermutationGeneratorInt {

	public static void permute (PermutationRecieverInt pr,int[] s){

		if(s.length==2){
			gen2_0(pr,s[0], s[1]);
		}

		if(s.length==3){
			gen3_0(pr,s[0], s[1], s[2]);
		}

		if(s.length==4){
			gen4_0(pr,s[0], s[1], s[2], s[3]);
		}

		if(s.length==5){
			gen5_0(pr,s[0], s[1], s[2], s[3], s[4]);
		}

		if(s.length==6){
			gen6_0(pr,s[0], s[1], s[2], s[3], s[4], s[5]);
		}

		if(s.length==7){
			gen7_0(pr,s[0], s[1], s[2], s[3], s[4], s[5], s[6]);
		}

		if(s.length==8){
			gen8_0(pr,s[0], s[1], s[2], s[3], s[4], s[5], s[6], s[7]);
		}

		if(s.length==9){
			gen9_0(pr,s[0], s[1], s[2], s[3], s[4], s[5], s[6], s[7], s[8]);
		}

		if(s.length==10){
			gen10_0(pr,s[0], s[1], s[2], s[3], s[4], s[5], s[6], s[7], s[8], s[9]);
		}

		if(s.length==11){
			gen11_0(pr,s[0], s[1], s[2], s[3], s[4], s[5], s[6], s[7], s[8], s[9], s[10]);
		}

		if(s.length==12){
			gen12_0(pr,s[0], s[1], s[2], s[3], s[4], s[5], s[6], s[7], s[8], s[9], s[10], s[11]);
		}

		if(s.length==13){
			gen13_0(pr,s[0], s[1], s[2], s[3], s[4], s[5], s[6], s[7], s[8], s[9], s[10], s[11], s[12]);
		}

		if(s.length==14){
			gen14_0(pr,s[0], s[1], s[2], s[3], s[4], s[5], s[6], s[7], s[8], s[9], s[10], s[11], s[12], s[13]);
		}

		if(s.length==15){
			gen15_0(pr,s[0], s[1], s[2], s[3], s[4], s[5], s[6], s[7], s[8], s[9], s[10], s[11], s[12], s[13], s[14]);
		}

		if(s.length==16){
			gen16_0(pr,s[0], s[1], s[2], s[3], s[4], s[5], s[6], s[7], s[8], s[9], s[10], s[11], s[12], s[13], s[14], s[15]);
		}

		if(s.length==17){
			gen17_0(pr,s[0], s[1], s[2], s[3], s[4], s[5], s[6], s[7], s[8], s[9], s[10], s[11], s[12], s[13], s[14], s[15], s[16]);
		}

		if(s.length==18){
			gen18_0(pr,s[0], s[1], s[2], s[3], s[4], s[5], s[6], s[7], s[8], s[9], s[10], s[11], s[12], s[13], s[14], s[15], s[16], s[17]);
		}

		if(s.length==19){
			gen19_0(pr,s[0], s[1], s[2], s[3], s[4], s[5], s[6], s[7], s[8], s[9], s[10], s[11], s[12], s[13], s[14], s[15], s[16], s[17], s[18]);
		}

		if(s.length==20){
			gen20_0(pr,s[0], s[1], s[2], s[3], s[4], s[5], s[6], s[7], s[8], s[9], s[10], s[11], s[12], s[13], s[14], s[15], s[16], s[17], s[18], s[19]);
		}

		if(s.length==21){
			gen21_0(pr,s[0], s[1], s[2], s[3], s[4], s[5], s[6], s[7], s[8], s[9], s[10], s[11], s[12], s[13], s[14], s[15], s[16], s[17], s[18], s[19], s[20]);
		}

		if(s.length==22){
			gen22_0(pr,s[0], s[1], s[2], s[3], s[4], s[5], s[6], s[7], s[8], s[9], s[10], s[11], s[12], s[13], s[14], s[15], s[16], s[17], s[18], s[19], s[20], s[21]);
		}

		if(s.length==23){
			gen23_0(pr,s[0], s[1], s[2], s[3], s[4], s[5], s[6], s[7], s[8], s[9], s[10], s[11], s[12], s[13], s[14], s[15], s[16], s[17], s[18], s[19], s[20], s[21], s[22]);
		}

		if(s.length==24){
			gen24_0(pr,s[0], s[1], s[2], s[3], s[4], s[5], s[6], s[7], s[8], s[9], s[10], s[11], s[12], s[13], s[14], s[15], s[16], s[17], s[18], s[19], s[20], s[21], s[22], s[23]);
		}

		if(s.length==25){
			gen25_0(pr,s[0], s[1], s[2], s[3], s[4], s[5], s[6], s[7], s[8], s[9], s[10], s[11], s[12], s[13], s[14], s[15], s[16], s[17], s[18], s[19], s[20], s[21], s[22], s[23], s[24]);
		}

		if(s.length==26){
			gen26_0(pr,s[0], s[1], s[2], s[3], s[4], s[5], s[6], s[7], s[8], s[9], s[10], s[11], s[12], s[13], s[14], s[15], s[16], s[17], s[18], s[19], s[20], s[21], s[22], s[23], s[24], s[25]);
		}

		if(s.length==27){
			gen27_0(pr,s[0], s[1], s[2], s[3], s[4], s[5], s[6], s[7], s[8], s[9], s[10], s[11], s[12], s[13], s[14], s[15], s[16], s[17], s[18], s[19], s[20], s[21], s[22], s[23], s[24], s[25], s[26]);
		}

		if(s.length==28){
			gen28_0(pr,s[0], s[1], s[2], s[3], s[4], s[5], s[6], s[7], s[8], s[9], s[10], s[11], s[12], s[13], s[14], s[15], s[16], s[17], s[18], s[19], s[20], s[21], s[22], s[23], s[24], s[25], s[26], s[27]);
		}

		if(s.length==29){
			gen29_0(pr,s[0], s[1], s[2], s[3], s[4], s[5], s[6], s[7], s[8], s[9], s[10], s[11], s[12], s[13], s[14], s[15], s[16], s[17], s[18], s[19], s[20], s[21], s[22], s[23], s[24], s[25], s[26], s[27], s[28]);
		}

		if(s.length==30){
			gen30_0(pr,s[0], s[1], s[2], s[3], s[4], s[5], s[6], s[7], s[8], s[9], s[10], s[11], s[12], s[13], s[14], s[15], s[16], s[17], s[18], s[19], s[20], s[21], s[22], s[23], s[24], s[25], s[26], s[27], s[28], s[29]);
		}

	}

	private static final void gen2_0(PermutationRecieverInt pr,int s1, int s2){
		pr.recieve2(s1, s2);
		pr.recieve2(s2, s1);
	}

	private static final void gen3_0(PermutationRecieverInt pr,int s1, int s2, int s3){
		gen3_1(pr,s1, s2, s3);
		gen3_1(pr,s2, s3, s1);
		gen3_1(pr,s3, s1, s2);
	}

	private static final void gen3_1(PermutationRecieverInt pr,int s1, int s2, int s3){
		pr.recieve3(s1, s2, s3);
		pr.recieve3(s1, s3, s2);
	}

	private static final void gen4_0(PermutationRecieverInt pr,int s1, int s2, int s3, int s4){
		gen4_1(pr,s1, s2, s3, s4);
		gen4_1(pr,s2, s3, s4, s1);
		gen4_1(pr,s3, s4, s1, s2);
		gen4_1(pr,s4, s1, s2, s3);
	}

	private static final void gen4_1(PermutationRecieverInt pr,int s1, int s2, int s3, int s4){
		gen4_2(pr,s1, s2, s3, s4);
		gen4_2(pr,s1, s3, s4, s2);
		gen4_2(pr,s1, s4, s2, s3);
	}

	private static final void gen4_2(PermutationRecieverInt pr,int s1, int s2, int s3, int s4){
		pr.recieve4(s1, s2, s3, s4);
		pr.recieve4(s1, s2, s4, s3);
	}

	private static final void gen5_0(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5){
		gen5_1(pr,s1, s2, s3, s4, s5);
		gen5_1(pr,s2, s3, s4, s5, s1);
		gen5_1(pr,s3, s4, s5, s1, s2);
		gen5_1(pr,s4, s5, s1, s2, s3);
		gen5_1(pr,s5, s1, s2, s3, s4);
	}

	private static final void gen5_1(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5){
		gen5_2(pr,s1, s2, s3, s4, s5);
		gen5_2(pr,s1, s3, s4, s5, s2);
		gen5_2(pr,s1, s4, s5, s2, s3);
		gen5_2(pr,s1, s5, s2, s3, s4);
	}

	private static final void gen5_2(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5){
		gen5_3(pr,s1, s2, s3, s4, s5);
		gen5_3(pr,s1, s2, s4, s5, s3);
		gen5_3(pr,s1, s2, s5, s3, s4);
	}

	private static final void gen5_3(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5){
		pr.recieve5(s1, s2, s3, s4, s5);
		pr.recieve5(s1, s2, s3, s5, s4);
	}

	private static final void gen6_0(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6){
		gen6_1(pr,s1, s2, s3, s4, s5, s6);
		gen6_1(pr,s2, s3, s4, s5, s6, s1);
		gen6_1(pr,s3, s4, s5, s6, s1, s2);
		gen6_1(pr,s4, s5, s6, s1, s2, s3);
		gen6_1(pr,s5, s6, s1, s2, s3, s4);
		gen6_1(pr,s6, s1, s2, s3, s4, s5);
	}

	private static final void gen6_1(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6){
		gen6_2(pr,s1, s2, s3, s4, s5, s6);
		gen6_2(pr,s1, s3, s4, s5, s6, s2);
		gen6_2(pr,s1, s4, s5, s6, s2, s3);
		gen6_2(pr,s1, s5, s6, s2, s3, s4);
		gen6_2(pr,s1, s6, s2, s3, s4, s5);
	}

	private static final void gen6_2(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6){
		gen6_3(pr,s1, s2, s3, s4, s5, s6);
		gen6_3(pr,s1, s2, s4, s5, s6, s3);
		gen6_3(pr,s1, s2, s5, s6, s3, s4);
		gen6_3(pr,s1, s2, s6, s3, s4, s5);
	}

	private static final void gen6_3(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6){
		gen6_4(pr,s1, s2, s3, s4, s5, s6);
		gen6_4(pr,s1, s2, s3, s5, s6, s4);
		gen6_4(pr,s1, s2, s3, s6, s4, s5);
	}

	private static final void gen6_4(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6){
		pr.recieve6(s1, s2, s3, s4, s5, s6);
		pr.recieve6(s1, s2, s3, s4, s6, s5);
	}

	private static final void gen7_0(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7){
		gen7_1(pr,s1, s2, s3, s4, s5, s6, s7);
		gen7_1(pr,s2, s3, s4, s5, s6, s7, s1);
		gen7_1(pr,s3, s4, s5, s6, s7, s1, s2);
		gen7_1(pr,s4, s5, s6, s7, s1, s2, s3);
		gen7_1(pr,s5, s6, s7, s1, s2, s3, s4);
		gen7_1(pr,s6, s7, s1, s2, s3, s4, s5);
		gen7_1(pr,s7, s1, s2, s3, s4, s5, s6);
	}

	private static final void gen7_1(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7){
		gen7_2(pr,s1, s2, s3, s4, s5, s6, s7);
		gen7_2(pr,s1, s3, s4, s5, s6, s7, s2);
		gen7_2(pr,s1, s4, s5, s6, s7, s2, s3);
		gen7_2(pr,s1, s5, s6, s7, s2, s3, s4);
		gen7_2(pr,s1, s6, s7, s2, s3, s4, s5);
		gen7_2(pr,s1, s7, s2, s3, s4, s5, s6);
	}

	private static final void gen7_2(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7){
		gen7_3(pr,s1, s2, s3, s4, s5, s6, s7);
		gen7_3(pr,s1, s2, s4, s5, s6, s7, s3);
		gen7_3(pr,s1, s2, s5, s6, s7, s3, s4);
		gen7_3(pr,s1, s2, s6, s7, s3, s4, s5);
		gen7_3(pr,s1, s2, s7, s3, s4, s5, s6);
	}

	private static final void gen7_3(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7){
		gen7_4(pr,s1, s2, s3, s4, s5, s6, s7);
		gen7_4(pr,s1, s2, s3, s5, s6, s7, s4);
		gen7_4(pr,s1, s2, s3, s6, s7, s4, s5);
		gen7_4(pr,s1, s2, s3, s7, s4, s5, s6);
	}

	private static final void gen7_4(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7){
		gen7_5(pr,s1, s2, s3, s4, s5, s6, s7);
		gen7_5(pr,s1, s2, s3, s4, s6, s7, s5);
		gen7_5(pr,s1, s2, s3, s4, s7, s5, s6);
	}

	private static final void gen7_5(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7){
		pr.recieve7(s1, s2, s3, s4, s5, s6, s7);
		pr.recieve7(s1, s2, s3, s4, s5, s7, s6);
	}

	private static final void gen8_0(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8){
		gen8_1(pr,s1, s2, s3, s4, s5, s6, s7, s8);
		gen8_1(pr,s2, s3, s4, s5, s6, s7, s8, s1);
		gen8_1(pr,s3, s4, s5, s6, s7, s8, s1, s2);
		gen8_1(pr,s4, s5, s6, s7, s8, s1, s2, s3);
		gen8_1(pr,s5, s6, s7, s8, s1, s2, s3, s4);
		gen8_1(pr,s6, s7, s8, s1, s2, s3, s4, s5);
		gen8_1(pr,s7, s8, s1, s2, s3, s4, s5, s6);
		gen8_1(pr,s8, s1, s2, s3, s4, s5, s6, s7);
	}

	private static final void gen8_1(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8){
		gen8_2(pr,s1, s2, s3, s4, s5, s6, s7, s8);
		gen8_2(pr,s1, s3, s4, s5, s6, s7, s8, s2);
		gen8_2(pr,s1, s4, s5, s6, s7, s8, s2, s3);
		gen8_2(pr,s1, s5, s6, s7, s8, s2, s3, s4);
		gen8_2(pr,s1, s6, s7, s8, s2, s3, s4, s5);
		gen8_2(pr,s1, s7, s8, s2, s3, s4, s5, s6);
		gen8_2(pr,s1, s8, s2, s3, s4, s5, s6, s7);
	}

	private static final void gen8_2(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8){
		gen8_3(pr,s1, s2, s3, s4, s5, s6, s7, s8);
		gen8_3(pr,s1, s2, s4, s5, s6, s7, s8, s3);
		gen8_3(pr,s1, s2, s5, s6, s7, s8, s3, s4);
		gen8_3(pr,s1, s2, s6, s7, s8, s3, s4, s5);
		gen8_3(pr,s1, s2, s7, s8, s3, s4, s5, s6);
		gen8_3(pr,s1, s2, s8, s3, s4, s5, s6, s7);
	}

	private static final void gen8_3(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8){
		gen8_4(pr,s1, s2, s3, s4, s5, s6, s7, s8);
		gen8_4(pr,s1, s2, s3, s5, s6, s7, s8, s4);
		gen8_4(pr,s1, s2, s3, s6, s7, s8, s4, s5);
		gen8_4(pr,s1, s2, s3, s7, s8, s4, s5, s6);
		gen8_4(pr,s1, s2, s3, s8, s4, s5, s6, s7);
	}

	private static final void gen8_4(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8){
		gen8_5(pr,s1, s2, s3, s4, s5, s6, s7, s8);
		gen8_5(pr,s1, s2, s3, s4, s6, s7, s8, s5);
		gen8_5(pr,s1, s2, s3, s4, s7, s8, s5, s6);
		gen8_5(pr,s1, s2, s3, s4, s8, s5, s6, s7);
	}

	private static final void gen8_5(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8){
		gen8_6(pr,s1, s2, s3, s4, s5, s6, s7, s8);
		gen8_6(pr,s1, s2, s3, s4, s5, s7, s8, s6);
		gen8_6(pr,s1, s2, s3, s4, s5, s8, s6, s7);
	}

	private static final void gen8_6(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8){
		pr.recieve8(s1, s2, s3, s4, s5, s6, s7, s8);
		pr.recieve8(s1, s2, s3, s4, s5, s6, s8, s7);
	}

	private static final void gen9_0(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9){
		gen9_1(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9);
		gen9_1(pr,s2, s3, s4, s5, s6, s7, s8, s9, s1);
		gen9_1(pr,s3, s4, s5, s6, s7, s8, s9, s1, s2);
		gen9_1(pr,s4, s5, s6, s7, s8, s9, s1, s2, s3);
		gen9_1(pr,s5, s6, s7, s8, s9, s1, s2, s3, s4);
		gen9_1(pr,s6, s7, s8, s9, s1, s2, s3, s4, s5);
		gen9_1(pr,s7, s8, s9, s1, s2, s3, s4, s5, s6);
		gen9_1(pr,s8, s9, s1, s2, s3, s4, s5, s6, s7);
		gen9_1(pr,s9, s1, s2, s3, s4, s5, s6, s7, s8);
	}

	private static final void gen9_1(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9){
		gen9_2(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9);
		gen9_2(pr,s1, s3, s4, s5, s6, s7, s8, s9, s2);
		gen9_2(pr,s1, s4, s5, s6, s7, s8, s9, s2, s3);
		gen9_2(pr,s1, s5, s6, s7, s8, s9, s2, s3, s4);
		gen9_2(pr,s1, s6, s7, s8, s9, s2, s3, s4, s5);
		gen9_2(pr,s1, s7, s8, s9, s2, s3, s4, s5, s6);
		gen9_2(pr,s1, s8, s9, s2, s3, s4, s5, s6, s7);
		gen9_2(pr,s1, s9, s2, s3, s4, s5, s6, s7, s8);
	}

	private static final void gen9_2(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9){
		gen9_3(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9);
		gen9_3(pr,s1, s2, s4, s5, s6, s7, s8, s9, s3);
		gen9_3(pr,s1, s2, s5, s6, s7, s8, s9, s3, s4);
		gen9_3(pr,s1, s2, s6, s7, s8, s9, s3, s4, s5);
		gen9_3(pr,s1, s2, s7, s8, s9, s3, s4, s5, s6);
		gen9_3(pr,s1, s2, s8, s9, s3, s4, s5, s6, s7);
		gen9_3(pr,s1, s2, s9, s3, s4, s5, s6, s7, s8);
	}

	private static final void gen9_3(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9){
		gen9_4(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9);
		gen9_4(pr,s1, s2, s3, s5, s6, s7, s8, s9, s4);
		gen9_4(pr,s1, s2, s3, s6, s7, s8, s9, s4, s5);
		gen9_4(pr,s1, s2, s3, s7, s8, s9, s4, s5, s6);
		gen9_4(pr,s1, s2, s3, s8, s9, s4, s5, s6, s7);
		gen9_4(pr,s1, s2, s3, s9, s4, s5, s6, s7, s8);
	}

	private static final void gen9_4(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9){
		gen9_5(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9);
		gen9_5(pr,s1, s2, s3, s4, s6, s7, s8, s9, s5);
		gen9_5(pr,s1, s2, s3, s4, s7, s8, s9, s5, s6);
		gen9_5(pr,s1, s2, s3, s4, s8, s9, s5, s6, s7);
		gen9_5(pr,s1, s2, s3, s4, s9, s5, s6, s7, s8);
	}

	private static final void gen9_5(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9){
		gen9_6(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9);
		gen9_6(pr,s1, s2, s3, s4, s5, s7, s8, s9, s6);
		gen9_6(pr,s1, s2, s3, s4, s5, s8, s9, s6, s7);
		gen9_6(pr,s1, s2, s3, s4, s5, s9, s6, s7, s8);
	}

	private static final void gen9_6(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9){
		gen9_7(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9);
		gen9_7(pr,s1, s2, s3, s4, s5, s6, s8, s9, s7);
		gen9_7(pr,s1, s2, s3, s4, s5, s6, s9, s7, s8);
	}

	private static final void gen9_7(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9){
		pr.recieve9(s1, s2, s3, s4, s5, s6, s7, s8, s9);
		pr.recieve9(s1, s2, s3, s4, s5, s6, s7, s9, s8);
	}

	private static final void gen10_0(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10){
		gen10_1(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen10_1(pr,s2, s3, s4, s5, s6, s7, s8, s9, s10, s1);
		gen10_1(pr,s3, s4, s5, s6, s7, s8, s9, s10, s1, s2);
		gen10_1(pr,s4, s5, s6, s7, s8, s9, s10, s1, s2, s3);
		gen10_1(pr,s5, s6, s7, s8, s9, s10, s1, s2, s3, s4);
		gen10_1(pr,s6, s7, s8, s9, s10, s1, s2, s3, s4, s5);
		gen10_1(pr,s7, s8, s9, s10, s1, s2, s3, s4, s5, s6);
		gen10_1(pr,s8, s9, s10, s1, s2, s3, s4, s5, s6, s7);
		gen10_1(pr,s9, s10, s1, s2, s3, s4, s5, s6, s7, s8);
		gen10_1(pr,s10, s1, s2, s3, s4, s5, s6, s7, s8, s9);
	}

	private static final void gen10_1(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10){
		gen10_2(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen10_2(pr,s1, s3, s4, s5, s6, s7, s8, s9, s10, s2);
		gen10_2(pr,s1, s4, s5, s6, s7, s8, s9, s10, s2, s3);
		gen10_2(pr,s1, s5, s6, s7, s8, s9, s10, s2, s3, s4);
		gen10_2(pr,s1, s6, s7, s8, s9, s10, s2, s3, s4, s5);
		gen10_2(pr,s1, s7, s8, s9, s10, s2, s3, s4, s5, s6);
		gen10_2(pr,s1, s8, s9, s10, s2, s3, s4, s5, s6, s7);
		gen10_2(pr,s1, s9, s10, s2, s3, s4, s5, s6, s7, s8);
		gen10_2(pr,s1, s10, s2, s3, s4, s5, s6, s7, s8, s9);
	}

	private static final void gen10_2(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10){
		gen10_3(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen10_3(pr,s1, s2, s4, s5, s6, s7, s8, s9, s10, s3);
		gen10_3(pr,s1, s2, s5, s6, s7, s8, s9, s10, s3, s4);
		gen10_3(pr,s1, s2, s6, s7, s8, s9, s10, s3, s4, s5);
		gen10_3(pr,s1, s2, s7, s8, s9, s10, s3, s4, s5, s6);
		gen10_3(pr,s1, s2, s8, s9, s10, s3, s4, s5, s6, s7);
		gen10_3(pr,s1, s2, s9, s10, s3, s4, s5, s6, s7, s8);
		gen10_3(pr,s1, s2, s10, s3, s4, s5, s6, s7, s8, s9);
	}

	private static final void gen10_3(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10){
		gen10_4(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen10_4(pr,s1, s2, s3, s5, s6, s7, s8, s9, s10, s4);
		gen10_4(pr,s1, s2, s3, s6, s7, s8, s9, s10, s4, s5);
		gen10_4(pr,s1, s2, s3, s7, s8, s9, s10, s4, s5, s6);
		gen10_4(pr,s1, s2, s3, s8, s9, s10, s4, s5, s6, s7);
		gen10_4(pr,s1, s2, s3, s9, s10, s4, s5, s6, s7, s8);
		gen10_4(pr,s1, s2, s3, s10, s4, s5, s6, s7, s8, s9);
	}

	private static final void gen10_4(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10){
		gen10_5(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen10_5(pr,s1, s2, s3, s4, s6, s7, s8, s9, s10, s5);
		gen10_5(pr,s1, s2, s3, s4, s7, s8, s9, s10, s5, s6);
		gen10_5(pr,s1, s2, s3, s4, s8, s9, s10, s5, s6, s7);
		gen10_5(pr,s1, s2, s3, s4, s9, s10, s5, s6, s7, s8);
		gen10_5(pr,s1, s2, s3, s4, s10, s5, s6, s7, s8, s9);
	}

	private static final void gen10_5(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10){
		gen10_6(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen10_6(pr,s1, s2, s3, s4, s5, s7, s8, s9, s10, s6);
		gen10_6(pr,s1, s2, s3, s4, s5, s8, s9, s10, s6, s7);
		gen10_6(pr,s1, s2, s3, s4, s5, s9, s10, s6, s7, s8);
		gen10_6(pr,s1, s2, s3, s4, s5, s10, s6, s7, s8, s9);
	}

	private static final void gen10_6(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10){
		gen10_7(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen10_7(pr,s1, s2, s3, s4, s5, s6, s8, s9, s10, s7);
		gen10_7(pr,s1, s2, s3, s4, s5, s6, s9, s10, s7, s8);
		gen10_7(pr,s1, s2, s3, s4, s5, s6, s10, s7, s8, s9);
	}

	private static final void gen10_7(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10){
		gen10_8(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen10_8(pr,s1, s2, s3, s4, s5, s6, s7, s9, s10, s8);
		gen10_8(pr,s1, s2, s3, s4, s5, s6, s7, s10, s8, s9);
	}

	private static final void gen10_8(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10){
		pr.recieve10(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		pr.recieve10(s1, s2, s3, s4, s5, s6, s7, s8, s10, s9);
	}

	private static final void gen11_0(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11){
		gen11_1(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen11_1(pr,s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s1);
		gen11_1(pr,s3, s4, s5, s6, s7, s8, s9, s10, s11, s1, s2);
		gen11_1(pr,s4, s5, s6, s7, s8, s9, s10, s11, s1, s2, s3);
		gen11_1(pr,s5, s6, s7, s8, s9, s10, s11, s1, s2, s3, s4);
		gen11_1(pr,s6, s7, s8, s9, s10, s11, s1, s2, s3, s4, s5);
		gen11_1(pr,s7, s8, s9, s10, s11, s1, s2, s3, s4, s5, s6);
		gen11_1(pr,s8, s9, s10, s11, s1, s2, s3, s4, s5, s6, s7);
		gen11_1(pr,s9, s10, s11, s1, s2, s3, s4, s5, s6, s7, s8);
		gen11_1(pr,s10, s11, s1, s2, s3, s4, s5, s6, s7, s8, s9);
		gen11_1(pr,s11, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
	}

	private static final void gen11_1(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11){
		gen11_2(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen11_2(pr,s1, s3, s4, s5, s6, s7, s8, s9, s10, s11, s2);
		gen11_2(pr,s1, s4, s5, s6, s7, s8, s9, s10, s11, s2, s3);
		gen11_2(pr,s1, s5, s6, s7, s8, s9, s10, s11, s2, s3, s4);
		gen11_2(pr,s1, s6, s7, s8, s9, s10, s11, s2, s3, s4, s5);
		gen11_2(pr,s1, s7, s8, s9, s10, s11, s2, s3, s4, s5, s6);
		gen11_2(pr,s1, s8, s9, s10, s11, s2, s3, s4, s5, s6, s7);
		gen11_2(pr,s1, s9, s10, s11, s2, s3, s4, s5, s6, s7, s8);
		gen11_2(pr,s1, s10, s11, s2, s3, s4, s5, s6, s7, s8, s9);
		gen11_2(pr,s1, s11, s2, s3, s4, s5, s6, s7, s8, s9, s10);
	}

	private static final void gen11_2(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11){
		gen11_3(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen11_3(pr,s1, s2, s4, s5, s6, s7, s8, s9, s10, s11, s3);
		gen11_3(pr,s1, s2, s5, s6, s7, s8, s9, s10, s11, s3, s4);
		gen11_3(pr,s1, s2, s6, s7, s8, s9, s10, s11, s3, s4, s5);
		gen11_3(pr,s1, s2, s7, s8, s9, s10, s11, s3, s4, s5, s6);
		gen11_3(pr,s1, s2, s8, s9, s10, s11, s3, s4, s5, s6, s7);
		gen11_3(pr,s1, s2, s9, s10, s11, s3, s4, s5, s6, s7, s8);
		gen11_3(pr,s1, s2, s10, s11, s3, s4, s5, s6, s7, s8, s9);
		gen11_3(pr,s1, s2, s11, s3, s4, s5, s6, s7, s8, s9, s10);
	}

	private static final void gen11_3(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11){
		gen11_4(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen11_4(pr,s1, s2, s3, s5, s6, s7, s8, s9, s10, s11, s4);
		gen11_4(pr,s1, s2, s3, s6, s7, s8, s9, s10, s11, s4, s5);
		gen11_4(pr,s1, s2, s3, s7, s8, s9, s10, s11, s4, s5, s6);
		gen11_4(pr,s1, s2, s3, s8, s9, s10, s11, s4, s5, s6, s7);
		gen11_4(pr,s1, s2, s3, s9, s10, s11, s4, s5, s6, s7, s8);
		gen11_4(pr,s1, s2, s3, s10, s11, s4, s5, s6, s7, s8, s9);
		gen11_4(pr,s1, s2, s3, s11, s4, s5, s6, s7, s8, s9, s10);
	}

	private static final void gen11_4(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11){
		gen11_5(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen11_5(pr,s1, s2, s3, s4, s6, s7, s8, s9, s10, s11, s5);
		gen11_5(pr,s1, s2, s3, s4, s7, s8, s9, s10, s11, s5, s6);
		gen11_5(pr,s1, s2, s3, s4, s8, s9, s10, s11, s5, s6, s7);
		gen11_5(pr,s1, s2, s3, s4, s9, s10, s11, s5, s6, s7, s8);
		gen11_5(pr,s1, s2, s3, s4, s10, s11, s5, s6, s7, s8, s9);
		gen11_5(pr,s1, s2, s3, s4, s11, s5, s6, s7, s8, s9, s10);
	}

	private static final void gen11_5(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11){
		gen11_6(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen11_6(pr,s1, s2, s3, s4, s5, s7, s8, s9, s10, s11, s6);
		gen11_6(pr,s1, s2, s3, s4, s5, s8, s9, s10, s11, s6, s7);
		gen11_6(pr,s1, s2, s3, s4, s5, s9, s10, s11, s6, s7, s8);
		gen11_6(pr,s1, s2, s3, s4, s5, s10, s11, s6, s7, s8, s9);
		gen11_6(pr,s1, s2, s3, s4, s5, s11, s6, s7, s8, s9, s10);
	}

	private static final void gen11_6(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11){
		gen11_7(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen11_7(pr,s1, s2, s3, s4, s5, s6, s8, s9, s10, s11, s7);
		gen11_7(pr,s1, s2, s3, s4, s5, s6, s9, s10, s11, s7, s8);
		gen11_7(pr,s1, s2, s3, s4, s5, s6, s10, s11, s7, s8, s9);
		gen11_7(pr,s1, s2, s3, s4, s5, s6, s11, s7, s8, s9, s10);
	}

	private static final void gen11_7(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11){
		gen11_8(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen11_8(pr,s1, s2, s3, s4, s5, s6, s7, s9, s10, s11, s8);
		gen11_8(pr,s1, s2, s3, s4, s5, s6, s7, s10, s11, s8, s9);
		gen11_8(pr,s1, s2, s3, s4, s5, s6, s7, s11, s8, s9, s10);
	}

	private static final void gen11_8(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11){
		gen11_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen11_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s10, s11, s9);
		gen11_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s11, s9, s10);
	}

	private static final void gen11_9(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11){
		pr.recieve11(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		pr.recieve11(s1, s2, s3, s4, s5, s6, s7, s8, s9, s11, s10);
	}

	private static final void gen12_0(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12){
		gen12_1(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen12_1(pr,s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s1);
		gen12_1(pr,s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s1, s2);
		gen12_1(pr,s4, s5, s6, s7, s8, s9, s10, s11, s12, s1, s2, s3);
		gen12_1(pr,s5, s6, s7, s8, s9, s10, s11, s12, s1, s2, s3, s4);
		gen12_1(pr,s6, s7, s8, s9, s10, s11, s12, s1, s2, s3, s4, s5);
		gen12_1(pr,s7, s8, s9, s10, s11, s12, s1, s2, s3, s4, s5, s6);
		gen12_1(pr,s8, s9, s10, s11, s12, s1, s2, s3, s4, s5, s6, s7);
		gen12_1(pr,s9, s10, s11, s12, s1, s2, s3, s4, s5, s6, s7, s8);
		gen12_1(pr,s10, s11, s12, s1, s2, s3, s4, s5, s6, s7, s8, s9);
		gen12_1(pr,s11, s12, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen12_1(pr,s12, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
	}

	private static final void gen12_1(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12){
		gen12_2(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen12_2(pr,s1, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s2);
		gen12_2(pr,s1, s4, s5, s6, s7, s8, s9, s10, s11, s12, s2, s3);
		gen12_2(pr,s1, s5, s6, s7, s8, s9, s10, s11, s12, s2, s3, s4);
		gen12_2(pr,s1, s6, s7, s8, s9, s10, s11, s12, s2, s3, s4, s5);
		gen12_2(pr,s1, s7, s8, s9, s10, s11, s12, s2, s3, s4, s5, s6);
		gen12_2(pr,s1, s8, s9, s10, s11, s12, s2, s3, s4, s5, s6, s7);
		gen12_2(pr,s1, s9, s10, s11, s12, s2, s3, s4, s5, s6, s7, s8);
		gen12_2(pr,s1, s10, s11, s12, s2, s3, s4, s5, s6, s7, s8, s9);
		gen12_2(pr,s1, s11, s12, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen12_2(pr,s1, s12, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
	}

	private static final void gen12_2(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12){
		gen12_3(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen12_3(pr,s1, s2, s4, s5, s6, s7, s8, s9, s10, s11, s12, s3);
		gen12_3(pr,s1, s2, s5, s6, s7, s8, s9, s10, s11, s12, s3, s4);
		gen12_3(pr,s1, s2, s6, s7, s8, s9, s10, s11, s12, s3, s4, s5);
		gen12_3(pr,s1, s2, s7, s8, s9, s10, s11, s12, s3, s4, s5, s6);
		gen12_3(pr,s1, s2, s8, s9, s10, s11, s12, s3, s4, s5, s6, s7);
		gen12_3(pr,s1, s2, s9, s10, s11, s12, s3, s4, s5, s6, s7, s8);
		gen12_3(pr,s1, s2, s10, s11, s12, s3, s4, s5, s6, s7, s8, s9);
		gen12_3(pr,s1, s2, s11, s12, s3, s4, s5, s6, s7, s8, s9, s10);
		gen12_3(pr,s1, s2, s12, s3, s4, s5, s6, s7, s8, s9, s10, s11);
	}

	private static final void gen12_3(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12){
		gen12_4(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen12_4(pr,s1, s2, s3, s5, s6, s7, s8, s9, s10, s11, s12, s4);
		gen12_4(pr,s1, s2, s3, s6, s7, s8, s9, s10, s11, s12, s4, s5);
		gen12_4(pr,s1, s2, s3, s7, s8, s9, s10, s11, s12, s4, s5, s6);
		gen12_4(pr,s1, s2, s3, s8, s9, s10, s11, s12, s4, s5, s6, s7);
		gen12_4(pr,s1, s2, s3, s9, s10, s11, s12, s4, s5, s6, s7, s8);
		gen12_4(pr,s1, s2, s3, s10, s11, s12, s4, s5, s6, s7, s8, s9);
		gen12_4(pr,s1, s2, s3, s11, s12, s4, s5, s6, s7, s8, s9, s10);
		gen12_4(pr,s1, s2, s3, s12, s4, s5, s6, s7, s8, s9, s10, s11);
	}

	private static final void gen12_4(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12){
		gen12_5(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen12_5(pr,s1, s2, s3, s4, s6, s7, s8, s9, s10, s11, s12, s5);
		gen12_5(pr,s1, s2, s3, s4, s7, s8, s9, s10, s11, s12, s5, s6);
		gen12_5(pr,s1, s2, s3, s4, s8, s9, s10, s11, s12, s5, s6, s7);
		gen12_5(pr,s1, s2, s3, s4, s9, s10, s11, s12, s5, s6, s7, s8);
		gen12_5(pr,s1, s2, s3, s4, s10, s11, s12, s5, s6, s7, s8, s9);
		gen12_5(pr,s1, s2, s3, s4, s11, s12, s5, s6, s7, s8, s9, s10);
		gen12_5(pr,s1, s2, s3, s4, s12, s5, s6, s7, s8, s9, s10, s11);
	}

	private static final void gen12_5(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12){
		gen12_6(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen12_6(pr,s1, s2, s3, s4, s5, s7, s8, s9, s10, s11, s12, s6);
		gen12_6(pr,s1, s2, s3, s4, s5, s8, s9, s10, s11, s12, s6, s7);
		gen12_6(pr,s1, s2, s3, s4, s5, s9, s10, s11, s12, s6, s7, s8);
		gen12_6(pr,s1, s2, s3, s4, s5, s10, s11, s12, s6, s7, s8, s9);
		gen12_6(pr,s1, s2, s3, s4, s5, s11, s12, s6, s7, s8, s9, s10);
		gen12_6(pr,s1, s2, s3, s4, s5, s12, s6, s7, s8, s9, s10, s11);
	}

	private static final void gen12_6(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12){
		gen12_7(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen12_7(pr,s1, s2, s3, s4, s5, s6, s8, s9, s10, s11, s12, s7);
		gen12_7(pr,s1, s2, s3, s4, s5, s6, s9, s10, s11, s12, s7, s8);
		gen12_7(pr,s1, s2, s3, s4, s5, s6, s10, s11, s12, s7, s8, s9);
		gen12_7(pr,s1, s2, s3, s4, s5, s6, s11, s12, s7, s8, s9, s10);
		gen12_7(pr,s1, s2, s3, s4, s5, s6, s12, s7, s8, s9, s10, s11);
	}

	private static final void gen12_7(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12){
		gen12_8(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen12_8(pr,s1, s2, s3, s4, s5, s6, s7, s9, s10, s11, s12, s8);
		gen12_8(pr,s1, s2, s3, s4, s5, s6, s7, s10, s11, s12, s8, s9);
		gen12_8(pr,s1, s2, s3, s4, s5, s6, s7, s11, s12, s8, s9, s10);
		gen12_8(pr,s1, s2, s3, s4, s5, s6, s7, s12, s8, s9, s10, s11);
	}

	private static final void gen12_8(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12){
		gen12_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen12_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s10, s11, s12, s9);
		gen12_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s11, s12, s9, s10);
		gen12_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s12, s9, s10, s11);
	}

	private static final void gen12_9(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12){
		gen12_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen12_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s11, s12, s10);
		gen12_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s12, s10, s11);
	}

	private static final void gen12_10(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12){
		pr.recieve12(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		pr.recieve12(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s12, s11);
	}

	private static final void gen13_0(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13){
		gen13_1(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen13_1(pr,s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s1);
		gen13_1(pr,s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s1, s2);
		gen13_1(pr,s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s1, s2, s3);
		gen13_1(pr,s5, s6, s7, s8, s9, s10, s11, s12, s13, s1, s2, s3, s4);
		gen13_1(pr,s6, s7, s8, s9, s10, s11, s12, s13, s1, s2, s3, s4, s5);
		gen13_1(pr,s7, s8, s9, s10, s11, s12, s13, s1, s2, s3, s4, s5, s6);
		gen13_1(pr,s8, s9, s10, s11, s12, s13, s1, s2, s3, s4, s5, s6, s7);
		gen13_1(pr,s9, s10, s11, s12, s13, s1, s2, s3, s4, s5, s6, s7, s8);
		gen13_1(pr,s10, s11, s12, s13, s1, s2, s3, s4, s5, s6, s7, s8, s9);
		gen13_1(pr,s11, s12, s13, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen13_1(pr,s12, s13, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen13_1(pr,s13, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
	}

	private static final void gen13_1(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13){
		gen13_2(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen13_2(pr,s1, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s2);
		gen13_2(pr,s1, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s2, s3);
		gen13_2(pr,s1, s5, s6, s7, s8, s9, s10, s11, s12, s13, s2, s3, s4);
		gen13_2(pr,s1, s6, s7, s8, s9, s10, s11, s12, s13, s2, s3, s4, s5);
		gen13_2(pr,s1, s7, s8, s9, s10, s11, s12, s13, s2, s3, s4, s5, s6);
		gen13_2(pr,s1, s8, s9, s10, s11, s12, s13, s2, s3, s4, s5, s6, s7);
		gen13_2(pr,s1, s9, s10, s11, s12, s13, s2, s3, s4, s5, s6, s7, s8);
		gen13_2(pr,s1, s10, s11, s12, s13, s2, s3, s4, s5, s6, s7, s8, s9);
		gen13_2(pr,s1, s11, s12, s13, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen13_2(pr,s1, s12, s13, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen13_2(pr,s1, s13, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
	}

	private static final void gen13_2(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13){
		gen13_3(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen13_3(pr,s1, s2, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s3);
		gen13_3(pr,s1, s2, s5, s6, s7, s8, s9, s10, s11, s12, s13, s3, s4);
		gen13_3(pr,s1, s2, s6, s7, s8, s9, s10, s11, s12, s13, s3, s4, s5);
		gen13_3(pr,s1, s2, s7, s8, s9, s10, s11, s12, s13, s3, s4, s5, s6);
		gen13_3(pr,s1, s2, s8, s9, s10, s11, s12, s13, s3, s4, s5, s6, s7);
		gen13_3(pr,s1, s2, s9, s10, s11, s12, s13, s3, s4, s5, s6, s7, s8);
		gen13_3(pr,s1, s2, s10, s11, s12, s13, s3, s4, s5, s6, s7, s8, s9);
		gen13_3(pr,s1, s2, s11, s12, s13, s3, s4, s5, s6, s7, s8, s9, s10);
		gen13_3(pr,s1, s2, s12, s13, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen13_3(pr,s1, s2, s13, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
	}

	private static final void gen13_3(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13){
		gen13_4(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen13_4(pr,s1, s2, s3, s5, s6, s7, s8, s9, s10, s11, s12, s13, s4);
		gen13_4(pr,s1, s2, s3, s6, s7, s8, s9, s10, s11, s12, s13, s4, s5);
		gen13_4(pr,s1, s2, s3, s7, s8, s9, s10, s11, s12, s13, s4, s5, s6);
		gen13_4(pr,s1, s2, s3, s8, s9, s10, s11, s12, s13, s4, s5, s6, s7);
		gen13_4(pr,s1, s2, s3, s9, s10, s11, s12, s13, s4, s5, s6, s7, s8);
		gen13_4(pr,s1, s2, s3, s10, s11, s12, s13, s4, s5, s6, s7, s8, s9);
		gen13_4(pr,s1, s2, s3, s11, s12, s13, s4, s5, s6, s7, s8, s9, s10);
		gen13_4(pr,s1, s2, s3, s12, s13, s4, s5, s6, s7, s8, s9, s10, s11);
		gen13_4(pr,s1, s2, s3, s13, s4, s5, s6, s7, s8, s9, s10, s11, s12);
	}

	private static final void gen13_4(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13){
		gen13_5(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen13_5(pr,s1, s2, s3, s4, s6, s7, s8, s9, s10, s11, s12, s13, s5);
		gen13_5(pr,s1, s2, s3, s4, s7, s8, s9, s10, s11, s12, s13, s5, s6);
		gen13_5(pr,s1, s2, s3, s4, s8, s9, s10, s11, s12, s13, s5, s6, s7);
		gen13_5(pr,s1, s2, s3, s4, s9, s10, s11, s12, s13, s5, s6, s7, s8);
		gen13_5(pr,s1, s2, s3, s4, s10, s11, s12, s13, s5, s6, s7, s8, s9);
		gen13_5(pr,s1, s2, s3, s4, s11, s12, s13, s5, s6, s7, s8, s9, s10);
		gen13_5(pr,s1, s2, s3, s4, s12, s13, s5, s6, s7, s8, s9, s10, s11);
		gen13_5(pr,s1, s2, s3, s4, s13, s5, s6, s7, s8, s9, s10, s11, s12);
	}

	private static final void gen13_5(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13){
		gen13_6(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen13_6(pr,s1, s2, s3, s4, s5, s7, s8, s9, s10, s11, s12, s13, s6);
		gen13_6(pr,s1, s2, s3, s4, s5, s8, s9, s10, s11, s12, s13, s6, s7);
		gen13_6(pr,s1, s2, s3, s4, s5, s9, s10, s11, s12, s13, s6, s7, s8);
		gen13_6(pr,s1, s2, s3, s4, s5, s10, s11, s12, s13, s6, s7, s8, s9);
		gen13_6(pr,s1, s2, s3, s4, s5, s11, s12, s13, s6, s7, s8, s9, s10);
		gen13_6(pr,s1, s2, s3, s4, s5, s12, s13, s6, s7, s8, s9, s10, s11);
		gen13_6(pr,s1, s2, s3, s4, s5, s13, s6, s7, s8, s9, s10, s11, s12);
	}

	private static final void gen13_6(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13){
		gen13_7(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen13_7(pr,s1, s2, s3, s4, s5, s6, s8, s9, s10, s11, s12, s13, s7);
		gen13_7(pr,s1, s2, s3, s4, s5, s6, s9, s10, s11, s12, s13, s7, s8);
		gen13_7(pr,s1, s2, s3, s4, s5, s6, s10, s11, s12, s13, s7, s8, s9);
		gen13_7(pr,s1, s2, s3, s4, s5, s6, s11, s12, s13, s7, s8, s9, s10);
		gen13_7(pr,s1, s2, s3, s4, s5, s6, s12, s13, s7, s8, s9, s10, s11);
		gen13_7(pr,s1, s2, s3, s4, s5, s6, s13, s7, s8, s9, s10, s11, s12);
	}

	private static final void gen13_7(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13){
		gen13_8(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen13_8(pr,s1, s2, s3, s4, s5, s6, s7, s9, s10, s11, s12, s13, s8);
		gen13_8(pr,s1, s2, s3, s4, s5, s6, s7, s10, s11, s12, s13, s8, s9);
		gen13_8(pr,s1, s2, s3, s4, s5, s6, s7, s11, s12, s13, s8, s9, s10);
		gen13_8(pr,s1, s2, s3, s4, s5, s6, s7, s12, s13, s8, s9, s10, s11);
		gen13_8(pr,s1, s2, s3, s4, s5, s6, s7, s13, s8, s9, s10, s11, s12);
	}

	private static final void gen13_8(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13){
		gen13_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen13_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s10, s11, s12, s13, s9);
		gen13_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s11, s12, s13, s9, s10);
		gen13_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s12, s13, s9, s10, s11);
		gen13_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s13, s9, s10, s11, s12);
	}

	private static final void gen13_9(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13){
		gen13_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen13_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s11, s12, s13, s10);
		gen13_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s12, s13, s10, s11);
		gen13_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s13, s10, s11, s12);
	}

	private static final void gen13_10(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13){
		gen13_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen13_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s12, s13, s11);
		gen13_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s13, s11, s12);
	}

	private static final void gen13_11(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13){
		pr.recieve13(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		pr.recieve13(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s13, s12);
	}

	private static final void gen14_0(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14){
		gen14_1(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen14_1(pr,s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s1);
		gen14_1(pr,s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s1, s2);
		gen14_1(pr,s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s1, s2, s3);
		gen14_1(pr,s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s1, s2, s3, s4);
		gen14_1(pr,s6, s7, s8, s9, s10, s11, s12, s13, s14, s1, s2, s3, s4, s5);
		gen14_1(pr,s7, s8, s9, s10, s11, s12, s13, s14, s1, s2, s3, s4, s5, s6);
		gen14_1(pr,s8, s9, s10, s11, s12, s13, s14, s1, s2, s3, s4, s5, s6, s7);
		gen14_1(pr,s9, s10, s11, s12, s13, s14, s1, s2, s3, s4, s5, s6, s7, s8);
		gen14_1(pr,s10, s11, s12, s13, s14, s1, s2, s3, s4, s5, s6, s7, s8, s9);
		gen14_1(pr,s11, s12, s13, s14, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen14_1(pr,s12, s13, s14, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen14_1(pr,s13, s14, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen14_1(pr,s14, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
	}

	private static final void gen14_1(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14){
		gen14_2(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen14_2(pr,s1, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s2);
		gen14_2(pr,s1, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s2, s3);
		gen14_2(pr,s1, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s2, s3, s4);
		gen14_2(pr,s1, s6, s7, s8, s9, s10, s11, s12, s13, s14, s2, s3, s4, s5);
		gen14_2(pr,s1, s7, s8, s9, s10, s11, s12, s13, s14, s2, s3, s4, s5, s6);
		gen14_2(pr,s1, s8, s9, s10, s11, s12, s13, s14, s2, s3, s4, s5, s6, s7);
		gen14_2(pr,s1, s9, s10, s11, s12, s13, s14, s2, s3, s4, s5, s6, s7, s8);
		gen14_2(pr,s1, s10, s11, s12, s13, s14, s2, s3, s4, s5, s6, s7, s8, s9);
		gen14_2(pr,s1, s11, s12, s13, s14, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen14_2(pr,s1, s12, s13, s14, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen14_2(pr,s1, s13, s14, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen14_2(pr,s1, s14, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
	}

	private static final void gen14_2(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14){
		gen14_3(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen14_3(pr,s1, s2, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s3);
		gen14_3(pr,s1, s2, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s3, s4);
		gen14_3(pr,s1, s2, s6, s7, s8, s9, s10, s11, s12, s13, s14, s3, s4, s5);
		gen14_3(pr,s1, s2, s7, s8, s9, s10, s11, s12, s13, s14, s3, s4, s5, s6);
		gen14_3(pr,s1, s2, s8, s9, s10, s11, s12, s13, s14, s3, s4, s5, s6, s7);
		gen14_3(pr,s1, s2, s9, s10, s11, s12, s13, s14, s3, s4, s5, s6, s7, s8);
		gen14_3(pr,s1, s2, s10, s11, s12, s13, s14, s3, s4, s5, s6, s7, s8, s9);
		gen14_3(pr,s1, s2, s11, s12, s13, s14, s3, s4, s5, s6, s7, s8, s9, s10);
		gen14_3(pr,s1, s2, s12, s13, s14, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen14_3(pr,s1, s2, s13, s14, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen14_3(pr,s1, s2, s14, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
	}

	private static final void gen14_3(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14){
		gen14_4(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen14_4(pr,s1, s2, s3, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s4);
		gen14_4(pr,s1, s2, s3, s6, s7, s8, s9, s10, s11, s12, s13, s14, s4, s5);
		gen14_4(pr,s1, s2, s3, s7, s8, s9, s10, s11, s12, s13, s14, s4, s5, s6);
		gen14_4(pr,s1, s2, s3, s8, s9, s10, s11, s12, s13, s14, s4, s5, s6, s7);
		gen14_4(pr,s1, s2, s3, s9, s10, s11, s12, s13, s14, s4, s5, s6, s7, s8);
		gen14_4(pr,s1, s2, s3, s10, s11, s12, s13, s14, s4, s5, s6, s7, s8, s9);
		gen14_4(pr,s1, s2, s3, s11, s12, s13, s14, s4, s5, s6, s7, s8, s9, s10);
		gen14_4(pr,s1, s2, s3, s12, s13, s14, s4, s5, s6, s7, s8, s9, s10, s11);
		gen14_4(pr,s1, s2, s3, s13, s14, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen14_4(pr,s1, s2, s3, s14, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
	}

	private static final void gen14_4(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14){
		gen14_5(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen14_5(pr,s1, s2, s3, s4, s6, s7, s8, s9, s10, s11, s12, s13, s14, s5);
		gen14_5(pr,s1, s2, s3, s4, s7, s8, s9, s10, s11, s12, s13, s14, s5, s6);
		gen14_5(pr,s1, s2, s3, s4, s8, s9, s10, s11, s12, s13, s14, s5, s6, s7);
		gen14_5(pr,s1, s2, s3, s4, s9, s10, s11, s12, s13, s14, s5, s6, s7, s8);
		gen14_5(pr,s1, s2, s3, s4, s10, s11, s12, s13, s14, s5, s6, s7, s8, s9);
		gen14_5(pr,s1, s2, s3, s4, s11, s12, s13, s14, s5, s6, s7, s8, s9, s10);
		gen14_5(pr,s1, s2, s3, s4, s12, s13, s14, s5, s6, s7, s8, s9, s10, s11);
		gen14_5(pr,s1, s2, s3, s4, s13, s14, s5, s6, s7, s8, s9, s10, s11, s12);
		gen14_5(pr,s1, s2, s3, s4, s14, s5, s6, s7, s8, s9, s10, s11, s12, s13);
	}

	private static final void gen14_5(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14){
		gen14_6(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen14_6(pr,s1, s2, s3, s4, s5, s7, s8, s9, s10, s11, s12, s13, s14, s6);
		gen14_6(pr,s1, s2, s3, s4, s5, s8, s9, s10, s11, s12, s13, s14, s6, s7);
		gen14_6(pr,s1, s2, s3, s4, s5, s9, s10, s11, s12, s13, s14, s6, s7, s8);
		gen14_6(pr,s1, s2, s3, s4, s5, s10, s11, s12, s13, s14, s6, s7, s8, s9);
		gen14_6(pr,s1, s2, s3, s4, s5, s11, s12, s13, s14, s6, s7, s8, s9, s10);
		gen14_6(pr,s1, s2, s3, s4, s5, s12, s13, s14, s6, s7, s8, s9, s10, s11);
		gen14_6(pr,s1, s2, s3, s4, s5, s13, s14, s6, s7, s8, s9, s10, s11, s12);
		gen14_6(pr,s1, s2, s3, s4, s5, s14, s6, s7, s8, s9, s10, s11, s12, s13);
	}

	private static final void gen14_6(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14){
		gen14_7(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen14_7(pr,s1, s2, s3, s4, s5, s6, s8, s9, s10, s11, s12, s13, s14, s7);
		gen14_7(pr,s1, s2, s3, s4, s5, s6, s9, s10, s11, s12, s13, s14, s7, s8);
		gen14_7(pr,s1, s2, s3, s4, s5, s6, s10, s11, s12, s13, s14, s7, s8, s9);
		gen14_7(pr,s1, s2, s3, s4, s5, s6, s11, s12, s13, s14, s7, s8, s9, s10);
		gen14_7(pr,s1, s2, s3, s4, s5, s6, s12, s13, s14, s7, s8, s9, s10, s11);
		gen14_7(pr,s1, s2, s3, s4, s5, s6, s13, s14, s7, s8, s9, s10, s11, s12);
		gen14_7(pr,s1, s2, s3, s4, s5, s6, s14, s7, s8, s9, s10, s11, s12, s13);
	}

	private static final void gen14_7(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14){
		gen14_8(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen14_8(pr,s1, s2, s3, s4, s5, s6, s7, s9, s10, s11, s12, s13, s14, s8);
		gen14_8(pr,s1, s2, s3, s4, s5, s6, s7, s10, s11, s12, s13, s14, s8, s9);
		gen14_8(pr,s1, s2, s3, s4, s5, s6, s7, s11, s12, s13, s14, s8, s9, s10);
		gen14_8(pr,s1, s2, s3, s4, s5, s6, s7, s12, s13, s14, s8, s9, s10, s11);
		gen14_8(pr,s1, s2, s3, s4, s5, s6, s7, s13, s14, s8, s9, s10, s11, s12);
		gen14_8(pr,s1, s2, s3, s4, s5, s6, s7, s14, s8, s9, s10, s11, s12, s13);
	}

	private static final void gen14_8(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14){
		gen14_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen14_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s10, s11, s12, s13, s14, s9);
		gen14_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s11, s12, s13, s14, s9, s10);
		gen14_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s12, s13, s14, s9, s10, s11);
		gen14_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s13, s14, s9, s10, s11, s12);
		gen14_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s14, s9, s10, s11, s12, s13);
	}

	private static final void gen14_9(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14){
		gen14_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen14_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s11, s12, s13, s14, s10);
		gen14_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s12, s13, s14, s10, s11);
		gen14_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s13, s14, s10, s11, s12);
		gen14_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s14, s10, s11, s12, s13);
	}

	private static final void gen14_10(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14){
		gen14_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen14_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s12, s13, s14, s11);
		gen14_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s13, s14, s11, s12);
		gen14_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s14, s11, s12, s13);
	}

	private static final void gen14_11(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14){
		gen14_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen14_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s13, s14, s12);
		gen14_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s14, s12, s13);
	}

	private static final void gen14_12(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14){
		pr.recieve14(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		pr.recieve14(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s14, s13);
	}

	private static final void gen15_0(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15){
		gen15_1(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen15_1(pr,s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s1);
		gen15_1(pr,s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s1, s2);
		gen15_1(pr,s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s1, s2, s3);
		gen15_1(pr,s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s1, s2, s3, s4);
		gen15_1(pr,s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s1, s2, s3, s4, s5);
		gen15_1(pr,s7, s8, s9, s10, s11, s12, s13, s14, s15, s1, s2, s3, s4, s5, s6);
		gen15_1(pr,s8, s9, s10, s11, s12, s13, s14, s15, s1, s2, s3, s4, s5, s6, s7);
		gen15_1(pr,s9, s10, s11, s12, s13, s14, s15, s1, s2, s3, s4, s5, s6, s7, s8);
		gen15_1(pr,s10, s11, s12, s13, s14, s15, s1, s2, s3, s4, s5, s6, s7, s8, s9);
		gen15_1(pr,s11, s12, s13, s14, s15, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen15_1(pr,s12, s13, s14, s15, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen15_1(pr,s13, s14, s15, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen15_1(pr,s14, s15, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen15_1(pr,s15, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
	}

	private static final void gen15_1(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15){
		gen15_2(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen15_2(pr,s1, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s2);
		gen15_2(pr,s1, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s2, s3);
		gen15_2(pr,s1, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s2, s3, s4);
		gen15_2(pr,s1, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s2, s3, s4, s5);
		gen15_2(pr,s1, s7, s8, s9, s10, s11, s12, s13, s14, s15, s2, s3, s4, s5, s6);
		gen15_2(pr,s1, s8, s9, s10, s11, s12, s13, s14, s15, s2, s3, s4, s5, s6, s7);
		gen15_2(pr,s1, s9, s10, s11, s12, s13, s14, s15, s2, s3, s4, s5, s6, s7, s8);
		gen15_2(pr,s1, s10, s11, s12, s13, s14, s15, s2, s3, s4, s5, s6, s7, s8, s9);
		gen15_2(pr,s1, s11, s12, s13, s14, s15, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen15_2(pr,s1, s12, s13, s14, s15, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen15_2(pr,s1, s13, s14, s15, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen15_2(pr,s1, s14, s15, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen15_2(pr,s1, s15, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
	}

	private static final void gen15_2(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15){
		gen15_3(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen15_3(pr,s1, s2, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s3);
		gen15_3(pr,s1, s2, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s3, s4);
		gen15_3(pr,s1, s2, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s3, s4, s5);
		gen15_3(pr,s1, s2, s7, s8, s9, s10, s11, s12, s13, s14, s15, s3, s4, s5, s6);
		gen15_3(pr,s1, s2, s8, s9, s10, s11, s12, s13, s14, s15, s3, s4, s5, s6, s7);
		gen15_3(pr,s1, s2, s9, s10, s11, s12, s13, s14, s15, s3, s4, s5, s6, s7, s8);
		gen15_3(pr,s1, s2, s10, s11, s12, s13, s14, s15, s3, s4, s5, s6, s7, s8, s9);
		gen15_3(pr,s1, s2, s11, s12, s13, s14, s15, s3, s4, s5, s6, s7, s8, s9, s10);
		gen15_3(pr,s1, s2, s12, s13, s14, s15, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen15_3(pr,s1, s2, s13, s14, s15, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen15_3(pr,s1, s2, s14, s15, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen15_3(pr,s1, s2, s15, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
	}

	private static final void gen15_3(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15){
		gen15_4(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen15_4(pr,s1, s2, s3, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s4);
		gen15_4(pr,s1, s2, s3, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s4, s5);
		gen15_4(pr,s1, s2, s3, s7, s8, s9, s10, s11, s12, s13, s14, s15, s4, s5, s6);
		gen15_4(pr,s1, s2, s3, s8, s9, s10, s11, s12, s13, s14, s15, s4, s5, s6, s7);
		gen15_4(pr,s1, s2, s3, s9, s10, s11, s12, s13, s14, s15, s4, s5, s6, s7, s8);
		gen15_4(pr,s1, s2, s3, s10, s11, s12, s13, s14, s15, s4, s5, s6, s7, s8, s9);
		gen15_4(pr,s1, s2, s3, s11, s12, s13, s14, s15, s4, s5, s6, s7, s8, s9, s10);
		gen15_4(pr,s1, s2, s3, s12, s13, s14, s15, s4, s5, s6, s7, s8, s9, s10, s11);
		gen15_4(pr,s1, s2, s3, s13, s14, s15, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen15_4(pr,s1, s2, s3, s14, s15, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen15_4(pr,s1, s2, s3, s15, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
	}

	private static final void gen15_4(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15){
		gen15_5(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen15_5(pr,s1, s2, s3, s4, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s5);
		gen15_5(pr,s1, s2, s3, s4, s7, s8, s9, s10, s11, s12, s13, s14, s15, s5, s6);
		gen15_5(pr,s1, s2, s3, s4, s8, s9, s10, s11, s12, s13, s14, s15, s5, s6, s7);
		gen15_5(pr,s1, s2, s3, s4, s9, s10, s11, s12, s13, s14, s15, s5, s6, s7, s8);
		gen15_5(pr,s1, s2, s3, s4, s10, s11, s12, s13, s14, s15, s5, s6, s7, s8, s9);
		gen15_5(pr,s1, s2, s3, s4, s11, s12, s13, s14, s15, s5, s6, s7, s8, s9, s10);
		gen15_5(pr,s1, s2, s3, s4, s12, s13, s14, s15, s5, s6, s7, s8, s9, s10, s11);
		gen15_5(pr,s1, s2, s3, s4, s13, s14, s15, s5, s6, s7, s8, s9, s10, s11, s12);
		gen15_5(pr,s1, s2, s3, s4, s14, s15, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen15_5(pr,s1, s2, s3, s4, s15, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
	}

	private static final void gen15_5(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15){
		gen15_6(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen15_6(pr,s1, s2, s3, s4, s5, s7, s8, s9, s10, s11, s12, s13, s14, s15, s6);
		gen15_6(pr,s1, s2, s3, s4, s5, s8, s9, s10, s11, s12, s13, s14, s15, s6, s7);
		gen15_6(pr,s1, s2, s3, s4, s5, s9, s10, s11, s12, s13, s14, s15, s6, s7, s8);
		gen15_6(pr,s1, s2, s3, s4, s5, s10, s11, s12, s13, s14, s15, s6, s7, s8, s9);
		gen15_6(pr,s1, s2, s3, s4, s5, s11, s12, s13, s14, s15, s6, s7, s8, s9, s10);
		gen15_6(pr,s1, s2, s3, s4, s5, s12, s13, s14, s15, s6, s7, s8, s9, s10, s11);
		gen15_6(pr,s1, s2, s3, s4, s5, s13, s14, s15, s6, s7, s8, s9, s10, s11, s12);
		gen15_6(pr,s1, s2, s3, s4, s5, s14, s15, s6, s7, s8, s9, s10, s11, s12, s13);
		gen15_6(pr,s1, s2, s3, s4, s5, s15, s6, s7, s8, s9, s10, s11, s12, s13, s14);
	}

	private static final void gen15_6(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15){
		gen15_7(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen15_7(pr,s1, s2, s3, s4, s5, s6, s8, s9, s10, s11, s12, s13, s14, s15, s7);
		gen15_7(pr,s1, s2, s3, s4, s5, s6, s9, s10, s11, s12, s13, s14, s15, s7, s8);
		gen15_7(pr,s1, s2, s3, s4, s5, s6, s10, s11, s12, s13, s14, s15, s7, s8, s9);
		gen15_7(pr,s1, s2, s3, s4, s5, s6, s11, s12, s13, s14, s15, s7, s8, s9, s10);
		gen15_7(pr,s1, s2, s3, s4, s5, s6, s12, s13, s14, s15, s7, s8, s9, s10, s11);
		gen15_7(pr,s1, s2, s3, s4, s5, s6, s13, s14, s15, s7, s8, s9, s10, s11, s12);
		gen15_7(pr,s1, s2, s3, s4, s5, s6, s14, s15, s7, s8, s9, s10, s11, s12, s13);
		gen15_7(pr,s1, s2, s3, s4, s5, s6, s15, s7, s8, s9, s10, s11, s12, s13, s14);
	}

	private static final void gen15_7(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15){
		gen15_8(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen15_8(pr,s1, s2, s3, s4, s5, s6, s7, s9, s10, s11, s12, s13, s14, s15, s8);
		gen15_8(pr,s1, s2, s3, s4, s5, s6, s7, s10, s11, s12, s13, s14, s15, s8, s9);
		gen15_8(pr,s1, s2, s3, s4, s5, s6, s7, s11, s12, s13, s14, s15, s8, s9, s10);
		gen15_8(pr,s1, s2, s3, s4, s5, s6, s7, s12, s13, s14, s15, s8, s9, s10, s11);
		gen15_8(pr,s1, s2, s3, s4, s5, s6, s7, s13, s14, s15, s8, s9, s10, s11, s12);
		gen15_8(pr,s1, s2, s3, s4, s5, s6, s7, s14, s15, s8, s9, s10, s11, s12, s13);
		gen15_8(pr,s1, s2, s3, s4, s5, s6, s7, s15, s8, s9, s10, s11, s12, s13, s14);
	}

	private static final void gen15_8(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15){
		gen15_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen15_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s10, s11, s12, s13, s14, s15, s9);
		gen15_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s11, s12, s13, s14, s15, s9, s10);
		gen15_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s12, s13, s14, s15, s9, s10, s11);
		gen15_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s13, s14, s15, s9, s10, s11, s12);
		gen15_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s14, s15, s9, s10, s11, s12, s13);
		gen15_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s15, s9, s10, s11, s12, s13, s14);
	}

	private static final void gen15_9(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15){
		gen15_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen15_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s11, s12, s13, s14, s15, s10);
		gen15_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s12, s13, s14, s15, s10, s11);
		gen15_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s13, s14, s15, s10, s11, s12);
		gen15_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s14, s15, s10, s11, s12, s13);
		gen15_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s15, s10, s11, s12, s13, s14);
	}

	private static final void gen15_10(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15){
		gen15_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen15_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s12, s13, s14, s15, s11);
		gen15_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s13, s14, s15, s11, s12);
		gen15_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s14, s15, s11, s12, s13);
		gen15_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s15, s11, s12, s13, s14);
	}

	private static final void gen15_11(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15){
		gen15_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen15_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s13, s14, s15, s12);
		gen15_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s14, s15, s12, s13);
		gen15_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s15, s12, s13, s14);
	}

	private static final void gen15_12(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15){
		gen15_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen15_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s14, s15, s13);
		gen15_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s15, s13, s14);
	}

	private static final void gen15_13(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15){
		pr.recieve15(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		pr.recieve15(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s15, s14);
	}

	private static final void gen16_0(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16){
		gen16_1(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen16_1(pr,s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s1);
		gen16_1(pr,s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s1, s2);
		gen16_1(pr,s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s1, s2, s3);
		gen16_1(pr,s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s1, s2, s3, s4);
		gen16_1(pr,s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s1, s2, s3, s4, s5);
		gen16_1(pr,s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s1, s2, s3, s4, s5, s6);
		gen16_1(pr,s8, s9, s10, s11, s12, s13, s14, s15, s16, s1, s2, s3, s4, s5, s6, s7);
		gen16_1(pr,s9, s10, s11, s12, s13, s14, s15, s16, s1, s2, s3, s4, s5, s6, s7, s8);
		gen16_1(pr,s10, s11, s12, s13, s14, s15, s16, s1, s2, s3, s4, s5, s6, s7, s8, s9);
		gen16_1(pr,s11, s12, s13, s14, s15, s16, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen16_1(pr,s12, s13, s14, s15, s16, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen16_1(pr,s13, s14, s15, s16, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen16_1(pr,s14, s15, s16, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen16_1(pr,s15, s16, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen16_1(pr,s16, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
	}

	private static final void gen16_1(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16){
		gen16_2(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen16_2(pr,s1, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s2);
		gen16_2(pr,s1, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s2, s3);
		gen16_2(pr,s1, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s2, s3, s4);
		gen16_2(pr,s1, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s2, s3, s4, s5);
		gen16_2(pr,s1, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s2, s3, s4, s5, s6);
		gen16_2(pr,s1, s8, s9, s10, s11, s12, s13, s14, s15, s16, s2, s3, s4, s5, s6, s7);
		gen16_2(pr,s1, s9, s10, s11, s12, s13, s14, s15, s16, s2, s3, s4, s5, s6, s7, s8);
		gen16_2(pr,s1, s10, s11, s12, s13, s14, s15, s16, s2, s3, s4, s5, s6, s7, s8, s9);
		gen16_2(pr,s1, s11, s12, s13, s14, s15, s16, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen16_2(pr,s1, s12, s13, s14, s15, s16, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen16_2(pr,s1, s13, s14, s15, s16, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen16_2(pr,s1, s14, s15, s16, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen16_2(pr,s1, s15, s16, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen16_2(pr,s1, s16, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
	}

	private static final void gen16_2(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16){
		gen16_3(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen16_3(pr,s1, s2, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s3);
		gen16_3(pr,s1, s2, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s3, s4);
		gen16_3(pr,s1, s2, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s3, s4, s5);
		gen16_3(pr,s1, s2, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s3, s4, s5, s6);
		gen16_3(pr,s1, s2, s8, s9, s10, s11, s12, s13, s14, s15, s16, s3, s4, s5, s6, s7);
		gen16_3(pr,s1, s2, s9, s10, s11, s12, s13, s14, s15, s16, s3, s4, s5, s6, s7, s8);
		gen16_3(pr,s1, s2, s10, s11, s12, s13, s14, s15, s16, s3, s4, s5, s6, s7, s8, s9);
		gen16_3(pr,s1, s2, s11, s12, s13, s14, s15, s16, s3, s4, s5, s6, s7, s8, s9, s10);
		gen16_3(pr,s1, s2, s12, s13, s14, s15, s16, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen16_3(pr,s1, s2, s13, s14, s15, s16, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen16_3(pr,s1, s2, s14, s15, s16, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen16_3(pr,s1, s2, s15, s16, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen16_3(pr,s1, s2, s16, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
	}

	private static final void gen16_3(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16){
		gen16_4(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen16_4(pr,s1, s2, s3, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s4);
		gen16_4(pr,s1, s2, s3, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s4, s5);
		gen16_4(pr,s1, s2, s3, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s4, s5, s6);
		gen16_4(pr,s1, s2, s3, s8, s9, s10, s11, s12, s13, s14, s15, s16, s4, s5, s6, s7);
		gen16_4(pr,s1, s2, s3, s9, s10, s11, s12, s13, s14, s15, s16, s4, s5, s6, s7, s8);
		gen16_4(pr,s1, s2, s3, s10, s11, s12, s13, s14, s15, s16, s4, s5, s6, s7, s8, s9);
		gen16_4(pr,s1, s2, s3, s11, s12, s13, s14, s15, s16, s4, s5, s6, s7, s8, s9, s10);
		gen16_4(pr,s1, s2, s3, s12, s13, s14, s15, s16, s4, s5, s6, s7, s8, s9, s10, s11);
		gen16_4(pr,s1, s2, s3, s13, s14, s15, s16, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen16_4(pr,s1, s2, s3, s14, s15, s16, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen16_4(pr,s1, s2, s3, s15, s16, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen16_4(pr,s1, s2, s3, s16, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
	}

	private static final void gen16_4(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16){
		gen16_5(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen16_5(pr,s1, s2, s3, s4, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s5);
		gen16_5(pr,s1, s2, s3, s4, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s5, s6);
		gen16_5(pr,s1, s2, s3, s4, s8, s9, s10, s11, s12, s13, s14, s15, s16, s5, s6, s7);
		gen16_5(pr,s1, s2, s3, s4, s9, s10, s11, s12, s13, s14, s15, s16, s5, s6, s7, s8);
		gen16_5(pr,s1, s2, s3, s4, s10, s11, s12, s13, s14, s15, s16, s5, s6, s7, s8, s9);
		gen16_5(pr,s1, s2, s3, s4, s11, s12, s13, s14, s15, s16, s5, s6, s7, s8, s9, s10);
		gen16_5(pr,s1, s2, s3, s4, s12, s13, s14, s15, s16, s5, s6, s7, s8, s9, s10, s11);
		gen16_5(pr,s1, s2, s3, s4, s13, s14, s15, s16, s5, s6, s7, s8, s9, s10, s11, s12);
		gen16_5(pr,s1, s2, s3, s4, s14, s15, s16, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen16_5(pr,s1, s2, s3, s4, s15, s16, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen16_5(pr,s1, s2, s3, s4, s16, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
	}

	private static final void gen16_5(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16){
		gen16_6(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen16_6(pr,s1, s2, s3, s4, s5, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s6);
		gen16_6(pr,s1, s2, s3, s4, s5, s8, s9, s10, s11, s12, s13, s14, s15, s16, s6, s7);
		gen16_6(pr,s1, s2, s3, s4, s5, s9, s10, s11, s12, s13, s14, s15, s16, s6, s7, s8);
		gen16_6(pr,s1, s2, s3, s4, s5, s10, s11, s12, s13, s14, s15, s16, s6, s7, s8, s9);
		gen16_6(pr,s1, s2, s3, s4, s5, s11, s12, s13, s14, s15, s16, s6, s7, s8, s9, s10);
		gen16_6(pr,s1, s2, s3, s4, s5, s12, s13, s14, s15, s16, s6, s7, s8, s9, s10, s11);
		gen16_6(pr,s1, s2, s3, s4, s5, s13, s14, s15, s16, s6, s7, s8, s9, s10, s11, s12);
		gen16_6(pr,s1, s2, s3, s4, s5, s14, s15, s16, s6, s7, s8, s9, s10, s11, s12, s13);
		gen16_6(pr,s1, s2, s3, s4, s5, s15, s16, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen16_6(pr,s1, s2, s3, s4, s5, s16, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
	}

	private static final void gen16_6(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16){
		gen16_7(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen16_7(pr,s1, s2, s3, s4, s5, s6, s8, s9, s10, s11, s12, s13, s14, s15, s16, s7);
		gen16_7(pr,s1, s2, s3, s4, s5, s6, s9, s10, s11, s12, s13, s14, s15, s16, s7, s8);
		gen16_7(pr,s1, s2, s3, s4, s5, s6, s10, s11, s12, s13, s14, s15, s16, s7, s8, s9);
		gen16_7(pr,s1, s2, s3, s4, s5, s6, s11, s12, s13, s14, s15, s16, s7, s8, s9, s10);
		gen16_7(pr,s1, s2, s3, s4, s5, s6, s12, s13, s14, s15, s16, s7, s8, s9, s10, s11);
		gen16_7(pr,s1, s2, s3, s4, s5, s6, s13, s14, s15, s16, s7, s8, s9, s10, s11, s12);
		gen16_7(pr,s1, s2, s3, s4, s5, s6, s14, s15, s16, s7, s8, s9, s10, s11, s12, s13);
		gen16_7(pr,s1, s2, s3, s4, s5, s6, s15, s16, s7, s8, s9, s10, s11, s12, s13, s14);
		gen16_7(pr,s1, s2, s3, s4, s5, s6, s16, s7, s8, s9, s10, s11, s12, s13, s14, s15);
	}

	private static final void gen16_7(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16){
		gen16_8(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen16_8(pr,s1, s2, s3, s4, s5, s6, s7, s9, s10, s11, s12, s13, s14, s15, s16, s8);
		gen16_8(pr,s1, s2, s3, s4, s5, s6, s7, s10, s11, s12, s13, s14, s15, s16, s8, s9);
		gen16_8(pr,s1, s2, s3, s4, s5, s6, s7, s11, s12, s13, s14, s15, s16, s8, s9, s10);
		gen16_8(pr,s1, s2, s3, s4, s5, s6, s7, s12, s13, s14, s15, s16, s8, s9, s10, s11);
		gen16_8(pr,s1, s2, s3, s4, s5, s6, s7, s13, s14, s15, s16, s8, s9, s10, s11, s12);
		gen16_8(pr,s1, s2, s3, s4, s5, s6, s7, s14, s15, s16, s8, s9, s10, s11, s12, s13);
		gen16_8(pr,s1, s2, s3, s4, s5, s6, s7, s15, s16, s8, s9, s10, s11, s12, s13, s14);
		gen16_8(pr,s1, s2, s3, s4, s5, s6, s7, s16, s8, s9, s10, s11, s12, s13, s14, s15);
	}

	private static final void gen16_8(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16){
		gen16_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen16_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s10, s11, s12, s13, s14, s15, s16, s9);
		gen16_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s11, s12, s13, s14, s15, s16, s9, s10);
		gen16_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s12, s13, s14, s15, s16, s9, s10, s11);
		gen16_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s13, s14, s15, s16, s9, s10, s11, s12);
		gen16_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s14, s15, s16, s9, s10, s11, s12, s13);
		gen16_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s15, s16, s9, s10, s11, s12, s13, s14);
		gen16_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s16, s9, s10, s11, s12, s13, s14, s15);
	}

	private static final void gen16_9(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16){
		gen16_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen16_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s11, s12, s13, s14, s15, s16, s10);
		gen16_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s12, s13, s14, s15, s16, s10, s11);
		gen16_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s13, s14, s15, s16, s10, s11, s12);
		gen16_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s14, s15, s16, s10, s11, s12, s13);
		gen16_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s15, s16, s10, s11, s12, s13, s14);
		gen16_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s16, s10, s11, s12, s13, s14, s15);
	}

	private static final void gen16_10(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16){
		gen16_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen16_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s12, s13, s14, s15, s16, s11);
		gen16_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s13, s14, s15, s16, s11, s12);
		gen16_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s14, s15, s16, s11, s12, s13);
		gen16_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s15, s16, s11, s12, s13, s14);
		gen16_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s16, s11, s12, s13, s14, s15);
	}

	private static final void gen16_11(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16){
		gen16_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen16_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s13, s14, s15, s16, s12);
		gen16_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s14, s15, s16, s12, s13);
		gen16_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s15, s16, s12, s13, s14);
		gen16_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s16, s12, s13, s14, s15);
	}

	private static final void gen16_12(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16){
		gen16_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen16_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s14, s15, s16, s13);
		gen16_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s15, s16, s13, s14);
		gen16_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s16, s13, s14, s15);
	}

	private static final void gen16_13(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16){
		gen16_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen16_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s15, s16, s14);
		gen16_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s16, s14, s15);
	}

	private static final void gen16_14(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16){
		pr.recieve16(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		pr.recieve16(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s16, s15);
	}

	private static final void gen17_0(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17){
		gen17_1(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen17_1(pr,s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s1);
		gen17_1(pr,s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s1, s2);
		gen17_1(pr,s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s1, s2, s3);
		gen17_1(pr,s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s1, s2, s3, s4);
		gen17_1(pr,s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s1, s2, s3, s4, s5);
		gen17_1(pr,s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s1, s2, s3, s4, s5, s6);
		gen17_1(pr,s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s1, s2, s3, s4, s5, s6, s7);
		gen17_1(pr,s9, s10, s11, s12, s13, s14, s15, s16, s17, s1, s2, s3, s4, s5, s6, s7, s8);
		gen17_1(pr,s10, s11, s12, s13, s14, s15, s16, s17, s1, s2, s3, s4, s5, s6, s7, s8, s9);
		gen17_1(pr,s11, s12, s13, s14, s15, s16, s17, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen17_1(pr,s12, s13, s14, s15, s16, s17, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen17_1(pr,s13, s14, s15, s16, s17, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen17_1(pr,s14, s15, s16, s17, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen17_1(pr,s15, s16, s17, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen17_1(pr,s16, s17, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen17_1(pr,s17, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
	}

	private static final void gen17_1(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17){
		gen17_2(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen17_2(pr,s1, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s2);
		gen17_2(pr,s1, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s2, s3);
		gen17_2(pr,s1, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s2, s3, s4);
		gen17_2(pr,s1, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s2, s3, s4, s5);
		gen17_2(pr,s1, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s2, s3, s4, s5, s6);
		gen17_2(pr,s1, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s2, s3, s4, s5, s6, s7);
		gen17_2(pr,s1, s9, s10, s11, s12, s13, s14, s15, s16, s17, s2, s3, s4, s5, s6, s7, s8);
		gen17_2(pr,s1, s10, s11, s12, s13, s14, s15, s16, s17, s2, s3, s4, s5, s6, s7, s8, s9);
		gen17_2(pr,s1, s11, s12, s13, s14, s15, s16, s17, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen17_2(pr,s1, s12, s13, s14, s15, s16, s17, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen17_2(pr,s1, s13, s14, s15, s16, s17, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen17_2(pr,s1, s14, s15, s16, s17, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen17_2(pr,s1, s15, s16, s17, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen17_2(pr,s1, s16, s17, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen17_2(pr,s1, s17, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
	}

	private static final void gen17_2(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17){
		gen17_3(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen17_3(pr,s1, s2, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s3);
		gen17_3(pr,s1, s2, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s3, s4);
		gen17_3(pr,s1, s2, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s3, s4, s5);
		gen17_3(pr,s1, s2, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s3, s4, s5, s6);
		gen17_3(pr,s1, s2, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s3, s4, s5, s6, s7);
		gen17_3(pr,s1, s2, s9, s10, s11, s12, s13, s14, s15, s16, s17, s3, s4, s5, s6, s7, s8);
		gen17_3(pr,s1, s2, s10, s11, s12, s13, s14, s15, s16, s17, s3, s4, s5, s6, s7, s8, s9);
		gen17_3(pr,s1, s2, s11, s12, s13, s14, s15, s16, s17, s3, s4, s5, s6, s7, s8, s9, s10);
		gen17_3(pr,s1, s2, s12, s13, s14, s15, s16, s17, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen17_3(pr,s1, s2, s13, s14, s15, s16, s17, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen17_3(pr,s1, s2, s14, s15, s16, s17, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen17_3(pr,s1, s2, s15, s16, s17, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen17_3(pr,s1, s2, s16, s17, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen17_3(pr,s1, s2, s17, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
	}

	private static final void gen17_3(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17){
		gen17_4(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen17_4(pr,s1, s2, s3, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s4);
		gen17_4(pr,s1, s2, s3, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s4, s5);
		gen17_4(pr,s1, s2, s3, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s4, s5, s6);
		gen17_4(pr,s1, s2, s3, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s4, s5, s6, s7);
		gen17_4(pr,s1, s2, s3, s9, s10, s11, s12, s13, s14, s15, s16, s17, s4, s5, s6, s7, s8);
		gen17_4(pr,s1, s2, s3, s10, s11, s12, s13, s14, s15, s16, s17, s4, s5, s6, s7, s8, s9);
		gen17_4(pr,s1, s2, s3, s11, s12, s13, s14, s15, s16, s17, s4, s5, s6, s7, s8, s9, s10);
		gen17_4(pr,s1, s2, s3, s12, s13, s14, s15, s16, s17, s4, s5, s6, s7, s8, s9, s10, s11);
		gen17_4(pr,s1, s2, s3, s13, s14, s15, s16, s17, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen17_4(pr,s1, s2, s3, s14, s15, s16, s17, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen17_4(pr,s1, s2, s3, s15, s16, s17, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen17_4(pr,s1, s2, s3, s16, s17, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen17_4(pr,s1, s2, s3, s17, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
	}

	private static final void gen17_4(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17){
		gen17_5(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen17_5(pr,s1, s2, s3, s4, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s5);
		gen17_5(pr,s1, s2, s3, s4, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s5, s6);
		gen17_5(pr,s1, s2, s3, s4, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s5, s6, s7);
		gen17_5(pr,s1, s2, s3, s4, s9, s10, s11, s12, s13, s14, s15, s16, s17, s5, s6, s7, s8);
		gen17_5(pr,s1, s2, s3, s4, s10, s11, s12, s13, s14, s15, s16, s17, s5, s6, s7, s8, s9);
		gen17_5(pr,s1, s2, s3, s4, s11, s12, s13, s14, s15, s16, s17, s5, s6, s7, s8, s9, s10);
		gen17_5(pr,s1, s2, s3, s4, s12, s13, s14, s15, s16, s17, s5, s6, s7, s8, s9, s10, s11);
		gen17_5(pr,s1, s2, s3, s4, s13, s14, s15, s16, s17, s5, s6, s7, s8, s9, s10, s11, s12);
		gen17_5(pr,s1, s2, s3, s4, s14, s15, s16, s17, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen17_5(pr,s1, s2, s3, s4, s15, s16, s17, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen17_5(pr,s1, s2, s3, s4, s16, s17, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen17_5(pr,s1, s2, s3, s4, s17, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
	}

	private static final void gen17_5(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17){
		gen17_6(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen17_6(pr,s1, s2, s3, s4, s5, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s6);
		gen17_6(pr,s1, s2, s3, s4, s5, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s6, s7);
		gen17_6(pr,s1, s2, s3, s4, s5, s9, s10, s11, s12, s13, s14, s15, s16, s17, s6, s7, s8);
		gen17_6(pr,s1, s2, s3, s4, s5, s10, s11, s12, s13, s14, s15, s16, s17, s6, s7, s8, s9);
		gen17_6(pr,s1, s2, s3, s4, s5, s11, s12, s13, s14, s15, s16, s17, s6, s7, s8, s9, s10);
		gen17_6(pr,s1, s2, s3, s4, s5, s12, s13, s14, s15, s16, s17, s6, s7, s8, s9, s10, s11);
		gen17_6(pr,s1, s2, s3, s4, s5, s13, s14, s15, s16, s17, s6, s7, s8, s9, s10, s11, s12);
		gen17_6(pr,s1, s2, s3, s4, s5, s14, s15, s16, s17, s6, s7, s8, s9, s10, s11, s12, s13);
		gen17_6(pr,s1, s2, s3, s4, s5, s15, s16, s17, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen17_6(pr,s1, s2, s3, s4, s5, s16, s17, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen17_6(pr,s1, s2, s3, s4, s5, s17, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
	}

	private static final void gen17_6(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17){
		gen17_7(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen17_7(pr,s1, s2, s3, s4, s5, s6, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s7);
		gen17_7(pr,s1, s2, s3, s4, s5, s6, s9, s10, s11, s12, s13, s14, s15, s16, s17, s7, s8);
		gen17_7(pr,s1, s2, s3, s4, s5, s6, s10, s11, s12, s13, s14, s15, s16, s17, s7, s8, s9);
		gen17_7(pr,s1, s2, s3, s4, s5, s6, s11, s12, s13, s14, s15, s16, s17, s7, s8, s9, s10);
		gen17_7(pr,s1, s2, s3, s4, s5, s6, s12, s13, s14, s15, s16, s17, s7, s8, s9, s10, s11);
		gen17_7(pr,s1, s2, s3, s4, s5, s6, s13, s14, s15, s16, s17, s7, s8, s9, s10, s11, s12);
		gen17_7(pr,s1, s2, s3, s4, s5, s6, s14, s15, s16, s17, s7, s8, s9, s10, s11, s12, s13);
		gen17_7(pr,s1, s2, s3, s4, s5, s6, s15, s16, s17, s7, s8, s9, s10, s11, s12, s13, s14);
		gen17_7(pr,s1, s2, s3, s4, s5, s6, s16, s17, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen17_7(pr,s1, s2, s3, s4, s5, s6, s17, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
	}

	private static final void gen17_7(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17){
		gen17_8(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen17_8(pr,s1, s2, s3, s4, s5, s6, s7, s9, s10, s11, s12, s13, s14, s15, s16, s17, s8);
		gen17_8(pr,s1, s2, s3, s4, s5, s6, s7, s10, s11, s12, s13, s14, s15, s16, s17, s8, s9);
		gen17_8(pr,s1, s2, s3, s4, s5, s6, s7, s11, s12, s13, s14, s15, s16, s17, s8, s9, s10);
		gen17_8(pr,s1, s2, s3, s4, s5, s6, s7, s12, s13, s14, s15, s16, s17, s8, s9, s10, s11);
		gen17_8(pr,s1, s2, s3, s4, s5, s6, s7, s13, s14, s15, s16, s17, s8, s9, s10, s11, s12);
		gen17_8(pr,s1, s2, s3, s4, s5, s6, s7, s14, s15, s16, s17, s8, s9, s10, s11, s12, s13);
		gen17_8(pr,s1, s2, s3, s4, s5, s6, s7, s15, s16, s17, s8, s9, s10, s11, s12, s13, s14);
		gen17_8(pr,s1, s2, s3, s4, s5, s6, s7, s16, s17, s8, s9, s10, s11, s12, s13, s14, s15);
		gen17_8(pr,s1, s2, s3, s4, s5, s6, s7, s17, s8, s9, s10, s11, s12, s13, s14, s15, s16);
	}

	private static final void gen17_8(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17){
		gen17_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen17_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s10, s11, s12, s13, s14, s15, s16, s17, s9);
		gen17_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s11, s12, s13, s14, s15, s16, s17, s9, s10);
		gen17_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s12, s13, s14, s15, s16, s17, s9, s10, s11);
		gen17_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s13, s14, s15, s16, s17, s9, s10, s11, s12);
		gen17_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s14, s15, s16, s17, s9, s10, s11, s12, s13);
		gen17_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s15, s16, s17, s9, s10, s11, s12, s13, s14);
		gen17_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s16, s17, s9, s10, s11, s12, s13, s14, s15);
		gen17_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s17, s9, s10, s11, s12, s13, s14, s15, s16);
	}

	private static final void gen17_9(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17){
		gen17_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen17_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s11, s12, s13, s14, s15, s16, s17, s10);
		gen17_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s12, s13, s14, s15, s16, s17, s10, s11);
		gen17_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s13, s14, s15, s16, s17, s10, s11, s12);
		gen17_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s14, s15, s16, s17, s10, s11, s12, s13);
		gen17_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s15, s16, s17, s10, s11, s12, s13, s14);
		gen17_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s16, s17, s10, s11, s12, s13, s14, s15);
		gen17_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s17, s10, s11, s12, s13, s14, s15, s16);
	}

	private static final void gen17_10(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17){
		gen17_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen17_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s12, s13, s14, s15, s16, s17, s11);
		gen17_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s13, s14, s15, s16, s17, s11, s12);
		gen17_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s14, s15, s16, s17, s11, s12, s13);
		gen17_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s15, s16, s17, s11, s12, s13, s14);
		gen17_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s16, s17, s11, s12, s13, s14, s15);
		gen17_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s17, s11, s12, s13, s14, s15, s16);
	}

	private static final void gen17_11(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17){
		gen17_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen17_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s13, s14, s15, s16, s17, s12);
		gen17_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s14, s15, s16, s17, s12, s13);
		gen17_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s15, s16, s17, s12, s13, s14);
		gen17_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s16, s17, s12, s13, s14, s15);
		gen17_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s17, s12, s13, s14, s15, s16);
	}

	private static final void gen17_12(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17){
		gen17_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen17_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s14, s15, s16, s17, s13);
		gen17_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s15, s16, s17, s13, s14);
		gen17_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s16, s17, s13, s14, s15);
		gen17_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s17, s13, s14, s15, s16);
	}

	private static final void gen17_13(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17){
		gen17_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen17_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s15, s16, s17, s14);
		gen17_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s16, s17, s14, s15);
		gen17_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s17, s14, s15, s16);
	}

	private static final void gen17_14(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17){
		gen17_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen17_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s16, s17, s15);
		gen17_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s17, s15, s16);
	}

	private static final void gen17_15(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17){
		pr.recieve17(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		pr.recieve17(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s17, s16);
	}

	private static final void gen18_0(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18){
		gen18_1(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen18_1(pr,s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s1);
		gen18_1(pr,s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s1, s2);
		gen18_1(pr,s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s1, s2, s3);
		gen18_1(pr,s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s1, s2, s3, s4);
		gen18_1(pr,s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s1, s2, s3, s4, s5);
		gen18_1(pr,s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s1, s2, s3, s4, s5, s6);
		gen18_1(pr,s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s1, s2, s3, s4, s5, s6, s7);
		gen18_1(pr,s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s1, s2, s3, s4, s5, s6, s7, s8);
		gen18_1(pr,s10, s11, s12, s13, s14, s15, s16, s17, s18, s1, s2, s3, s4, s5, s6, s7, s8, s9);
		gen18_1(pr,s11, s12, s13, s14, s15, s16, s17, s18, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen18_1(pr,s12, s13, s14, s15, s16, s17, s18, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen18_1(pr,s13, s14, s15, s16, s17, s18, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen18_1(pr,s14, s15, s16, s17, s18, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen18_1(pr,s15, s16, s17, s18, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen18_1(pr,s16, s17, s18, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen18_1(pr,s17, s18, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen18_1(pr,s18, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
	}

	private static final void gen18_1(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18){
		gen18_2(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen18_2(pr,s1, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s2);
		gen18_2(pr,s1, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s2, s3);
		gen18_2(pr,s1, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s2, s3, s4);
		gen18_2(pr,s1, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s2, s3, s4, s5);
		gen18_2(pr,s1, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s2, s3, s4, s5, s6);
		gen18_2(pr,s1, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s2, s3, s4, s5, s6, s7);
		gen18_2(pr,s1, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s2, s3, s4, s5, s6, s7, s8);
		gen18_2(pr,s1, s10, s11, s12, s13, s14, s15, s16, s17, s18, s2, s3, s4, s5, s6, s7, s8, s9);
		gen18_2(pr,s1, s11, s12, s13, s14, s15, s16, s17, s18, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen18_2(pr,s1, s12, s13, s14, s15, s16, s17, s18, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen18_2(pr,s1, s13, s14, s15, s16, s17, s18, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen18_2(pr,s1, s14, s15, s16, s17, s18, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen18_2(pr,s1, s15, s16, s17, s18, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen18_2(pr,s1, s16, s17, s18, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen18_2(pr,s1, s17, s18, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen18_2(pr,s1, s18, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
	}

	private static final void gen18_2(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18){
		gen18_3(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen18_3(pr,s1, s2, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s3);
		gen18_3(pr,s1, s2, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s3, s4);
		gen18_3(pr,s1, s2, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s3, s4, s5);
		gen18_3(pr,s1, s2, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s3, s4, s5, s6);
		gen18_3(pr,s1, s2, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s3, s4, s5, s6, s7);
		gen18_3(pr,s1, s2, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s3, s4, s5, s6, s7, s8);
		gen18_3(pr,s1, s2, s10, s11, s12, s13, s14, s15, s16, s17, s18, s3, s4, s5, s6, s7, s8, s9);
		gen18_3(pr,s1, s2, s11, s12, s13, s14, s15, s16, s17, s18, s3, s4, s5, s6, s7, s8, s9, s10);
		gen18_3(pr,s1, s2, s12, s13, s14, s15, s16, s17, s18, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen18_3(pr,s1, s2, s13, s14, s15, s16, s17, s18, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen18_3(pr,s1, s2, s14, s15, s16, s17, s18, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen18_3(pr,s1, s2, s15, s16, s17, s18, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen18_3(pr,s1, s2, s16, s17, s18, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen18_3(pr,s1, s2, s17, s18, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen18_3(pr,s1, s2, s18, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
	}

	private static final void gen18_3(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18){
		gen18_4(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen18_4(pr,s1, s2, s3, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s4);
		gen18_4(pr,s1, s2, s3, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s4, s5);
		gen18_4(pr,s1, s2, s3, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s4, s5, s6);
		gen18_4(pr,s1, s2, s3, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s4, s5, s6, s7);
		gen18_4(pr,s1, s2, s3, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s4, s5, s6, s7, s8);
		gen18_4(pr,s1, s2, s3, s10, s11, s12, s13, s14, s15, s16, s17, s18, s4, s5, s6, s7, s8, s9);
		gen18_4(pr,s1, s2, s3, s11, s12, s13, s14, s15, s16, s17, s18, s4, s5, s6, s7, s8, s9, s10);
		gen18_4(pr,s1, s2, s3, s12, s13, s14, s15, s16, s17, s18, s4, s5, s6, s7, s8, s9, s10, s11);
		gen18_4(pr,s1, s2, s3, s13, s14, s15, s16, s17, s18, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen18_4(pr,s1, s2, s3, s14, s15, s16, s17, s18, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen18_4(pr,s1, s2, s3, s15, s16, s17, s18, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen18_4(pr,s1, s2, s3, s16, s17, s18, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen18_4(pr,s1, s2, s3, s17, s18, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen18_4(pr,s1, s2, s3, s18, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
	}

	private static final void gen18_4(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18){
		gen18_5(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen18_5(pr,s1, s2, s3, s4, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s5);
		gen18_5(pr,s1, s2, s3, s4, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s5, s6);
		gen18_5(pr,s1, s2, s3, s4, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s5, s6, s7);
		gen18_5(pr,s1, s2, s3, s4, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s5, s6, s7, s8);
		gen18_5(pr,s1, s2, s3, s4, s10, s11, s12, s13, s14, s15, s16, s17, s18, s5, s6, s7, s8, s9);
		gen18_5(pr,s1, s2, s3, s4, s11, s12, s13, s14, s15, s16, s17, s18, s5, s6, s7, s8, s9, s10);
		gen18_5(pr,s1, s2, s3, s4, s12, s13, s14, s15, s16, s17, s18, s5, s6, s7, s8, s9, s10, s11);
		gen18_5(pr,s1, s2, s3, s4, s13, s14, s15, s16, s17, s18, s5, s6, s7, s8, s9, s10, s11, s12);
		gen18_5(pr,s1, s2, s3, s4, s14, s15, s16, s17, s18, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen18_5(pr,s1, s2, s3, s4, s15, s16, s17, s18, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen18_5(pr,s1, s2, s3, s4, s16, s17, s18, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen18_5(pr,s1, s2, s3, s4, s17, s18, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen18_5(pr,s1, s2, s3, s4, s18, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
	}

	private static final void gen18_5(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18){
		gen18_6(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen18_6(pr,s1, s2, s3, s4, s5, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s6);
		gen18_6(pr,s1, s2, s3, s4, s5, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s6, s7);
		gen18_6(pr,s1, s2, s3, s4, s5, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s6, s7, s8);
		gen18_6(pr,s1, s2, s3, s4, s5, s10, s11, s12, s13, s14, s15, s16, s17, s18, s6, s7, s8, s9);
		gen18_6(pr,s1, s2, s3, s4, s5, s11, s12, s13, s14, s15, s16, s17, s18, s6, s7, s8, s9, s10);
		gen18_6(pr,s1, s2, s3, s4, s5, s12, s13, s14, s15, s16, s17, s18, s6, s7, s8, s9, s10, s11);
		gen18_6(pr,s1, s2, s3, s4, s5, s13, s14, s15, s16, s17, s18, s6, s7, s8, s9, s10, s11, s12);
		gen18_6(pr,s1, s2, s3, s4, s5, s14, s15, s16, s17, s18, s6, s7, s8, s9, s10, s11, s12, s13);
		gen18_6(pr,s1, s2, s3, s4, s5, s15, s16, s17, s18, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen18_6(pr,s1, s2, s3, s4, s5, s16, s17, s18, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen18_6(pr,s1, s2, s3, s4, s5, s17, s18, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen18_6(pr,s1, s2, s3, s4, s5, s18, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
	}

	private static final void gen18_6(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18){
		gen18_7(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen18_7(pr,s1, s2, s3, s4, s5, s6, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s7);
		gen18_7(pr,s1, s2, s3, s4, s5, s6, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s7, s8);
		gen18_7(pr,s1, s2, s3, s4, s5, s6, s10, s11, s12, s13, s14, s15, s16, s17, s18, s7, s8, s9);
		gen18_7(pr,s1, s2, s3, s4, s5, s6, s11, s12, s13, s14, s15, s16, s17, s18, s7, s8, s9, s10);
		gen18_7(pr,s1, s2, s3, s4, s5, s6, s12, s13, s14, s15, s16, s17, s18, s7, s8, s9, s10, s11);
		gen18_7(pr,s1, s2, s3, s4, s5, s6, s13, s14, s15, s16, s17, s18, s7, s8, s9, s10, s11, s12);
		gen18_7(pr,s1, s2, s3, s4, s5, s6, s14, s15, s16, s17, s18, s7, s8, s9, s10, s11, s12, s13);
		gen18_7(pr,s1, s2, s3, s4, s5, s6, s15, s16, s17, s18, s7, s8, s9, s10, s11, s12, s13, s14);
		gen18_7(pr,s1, s2, s3, s4, s5, s6, s16, s17, s18, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen18_7(pr,s1, s2, s3, s4, s5, s6, s17, s18, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen18_7(pr,s1, s2, s3, s4, s5, s6, s18, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
	}

	private static final void gen18_7(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18){
		gen18_8(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen18_8(pr,s1, s2, s3, s4, s5, s6, s7, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s8);
		gen18_8(pr,s1, s2, s3, s4, s5, s6, s7, s10, s11, s12, s13, s14, s15, s16, s17, s18, s8, s9);
		gen18_8(pr,s1, s2, s3, s4, s5, s6, s7, s11, s12, s13, s14, s15, s16, s17, s18, s8, s9, s10);
		gen18_8(pr,s1, s2, s3, s4, s5, s6, s7, s12, s13, s14, s15, s16, s17, s18, s8, s9, s10, s11);
		gen18_8(pr,s1, s2, s3, s4, s5, s6, s7, s13, s14, s15, s16, s17, s18, s8, s9, s10, s11, s12);
		gen18_8(pr,s1, s2, s3, s4, s5, s6, s7, s14, s15, s16, s17, s18, s8, s9, s10, s11, s12, s13);
		gen18_8(pr,s1, s2, s3, s4, s5, s6, s7, s15, s16, s17, s18, s8, s9, s10, s11, s12, s13, s14);
		gen18_8(pr,s1, s2, s3, s4, s5, s6, s7, s16, s17, s18, s8, s9, s10, s11, s12, s13, s14, s15);
		gen18_8(pr,s1, s2, s3, s4, s5, s6, s7, s17, s18, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen18_8(pr,s1, s2, s3, s4, s5, s6, s7, s18, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
	}

	private static final void gen18_8(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18){
		gen18_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen18_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s10, s11, s12, s13, s14, s15, s16, s17, s18, s9);
		gen18_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s11, s12, s13, s14, s15, s16, s17, s18, s9, s10);
		gen18_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s12, s13, s14, s15, s16, s17, s18, s9, s10, s11);
		gen18_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s13, s14, s15, s16, s17, s18, s9, s10, s11, s12);
		gen18_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s14, s15, s16, s17, s18, s9, s10, s11, s12, s13);
		gen18_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s15, s16, s17, s18, s9, s10, s11, s12, s13, s14);
		gen18_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s16, s17, s18, s9, s10, s11, s12, s13, s14, s15);
		gen18_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s17, s18, s9, s10, s11, s12, s13, s14, s15, s16);
		gen18_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s18, s9, s10, s11, s12, s13, s14, s15, s16, s17);
	}

	private static final void gen18_9(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18){
		gen18_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen18_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s11, s12, s13, s14, s15, s16, s17, s18, s10);
		gen18_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s12, s13, s14, s15, s16, s17, s18, s10, s11);
		gen18_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s13, s14, s15, s16, s17, s18, s10, s11, s12);
		gen18_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s14, s15, s16, s17, s18, s10, s11, s12, s13);
		gen18_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s15, s16, s17, s18, s10, s11, s12, s13, s14);
		gen18_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s16, s17, s18, s10, s11, s12, s13, s14, s15);
		gen18_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s17, s18, s10, s11, s12, s13, s14, s15, s16);
		gen18_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s18, s10, s11, s12, s13, s14, s15, s16, s17);
	}

	private static final void gen18_10(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18){
		gen18_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen18_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s12, s13, s14, s15, s16, s17, s18, s11);
		gen18_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s13, s14, s15, s16, s17, s18, s11, s12);
		gen18_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s14, s15, s16, s17, s18, s11, s12, s13);
		gen18_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s15, s16, s17, s18, s11, s12, s13, s14);
		gen18_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s16, s17, s18, s11, s12, s13, s14, s15);
		gen18_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s17, s18, s11, s12, s13, s14, s15, s16);
		gen18_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s18, s11, s12, s13, s14, s15, s16, s17);
	}

	private static final void gen18_11(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18){
		gen18_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen18_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s13, s14, s15, s16, s17, s18, s12);
		gen18_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s14, s15, s16, s17, s18, s12, s13);
		gen18_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s15, s16, s17, s18, s12, s13, s14);
		gen18_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s16, s17, s18, s12, s13, s14, s15);
		gen18_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s17, s18, s12, s13, s14, s15, s16);
		gen18_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s18, s12, s13, s14, s15, s16, s17);
	}

	private static final void gen18_12(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18){
		gen18_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen18_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s14, s15, s16, s17, s18, s13);
		gen18_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s15, s16, s17, s18, s13, s14);
		gen18_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s16, s17, s18, s13, s14, s15);
		gen18_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s17, s18, s13, s14, s15, s16);
		gen18_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s18, s13, s14, s15, s16, s17);
	}

	private static final void gen18_13(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18){
		gen18_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen18_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s15, s16, s17, s18, s14);
		gen18_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s16, s17, s18, s14, s15);
		gen18_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s17, s18, s14, s15, s16);
		gen18_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s18, s14, s15, s16, s17);
	}

	private static final void gen18_14(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18){
		gen18_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen18_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s16, s17, s18, s15);
		gen18_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s17, s18, s15, s16);
		gen18_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s18, s15, s16, s17);
	}

	private static final void gen18_15(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18){
		gen18_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen18_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s17, s18, s16);
		gen18_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s18, s16, s17);
	}

	private static final void gen18_16(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18){
		pr.recieve18(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		pr.recieve18(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s18, s17);
	}

	private static final void gen19_0(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19){
		gen19_1(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen19_1(pr,s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s1);
		gen19_1(pr,s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s1, s2);
		gen19_1(pr,s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s1, s2, s3);
		gen19_1(pr,s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s1, s2, s3, s4);
		gen19_1(pr,s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s1, s2, s3, s4, s5);
		gen19_1(pr,s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s1, s2, s3, s4, s5, s6);
		gen19_1(pr,s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s1, s2, s3, s4, s5, s6, s7);
		gen19_1(pr,s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s1, s2, s3, s4, s5, s6, s7, s8);
		gen19_1(pr,s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s1, s2, s3, s4, s5, s6, s7, s8, s9);
		gen19_1(pr,s11, s12, s13, s14, s15, s16, s17, s18, s19, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen19_1(pr,s12, s13, s14, s15, s16, s17, s18, s19, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen19_1(pr,s13, s14, s15, s16, s17, s18, s19, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen19_1(pr,s14, s15, s16, s17, s18, s19, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen19_1(pr,s15, s16, s17, s18, s19, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen19_1(pr,s16, s17, s18, s19, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen19_1(pr,s17, s18, s19, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen19_1(pr,s18, s19, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen19_1(pr,s19, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
	}

	private static final void gen19_1(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19){
		gen19_2(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen19_2(pr,s1, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s2);
		gen19_2(pr,s1, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s2, s3);
		gen19_2(pr,s1, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s2, s3, s4);
		gen19_2(pr,s1, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s2, s3, s4, s5);
		gen19_2(pr,s1, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s2, s3, s4, s5, s6);
		gen19_2(pr,s1, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s2, s3, s4, s5, s6, s7);
		gen19_2(pr,s1, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s2, s3, s4, s5, s6, s7, s8);
		gen19_2(pr,s1, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s2, s3, s4, s5, s6, s7, s8, s9);
		gen19_2(pr,s1, s11, s12, s13, s14, s15, s16, s17, s18, s19, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen19_2(pr,s1, s12, s13, s14, s15, s16, s17, s18, s19, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen19_2(pr,s1, s13, s14, s15, s16, s17, s18, s19, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen19_2(pr,s1, s14, s15, s16, s17, s18, s19, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen19_2(pr,s1, s15, s16, s17, s18, s19, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen19_2(pr,s1, s16, s17, s18, s19, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen19_2(pr,s1, s17, s18, s19, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen19_2(pr,s1, s18, s19, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen19_2(pr,s1, s19, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
	}

	private static final void gen19_2(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19){
		gen19_3(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen19_3(pr,s1, s2, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s3);
		gen19_3(pr,s1, s2, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s3, s4);
		gen19_3(pr,s1, s2, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s3, s4, s5);
		gen19_3(pr,s1, s2, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s3, s4, s5, s6);
		gen19_3(pr,s1, s2, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s3, s4, s5, s6, s7);
		gen19_3(pr,s1, s2, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s3, s4, s5, s6, s7, s8);
		gen19_3(pr,s1, s2, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s3, s4, s5, s6, s7, s8, s9);
		gen19_3(pr,s1, s2, s11, s12, s13, s14, s15, s16, s17, s18, s19, s3, s4, s5, s6, s7, s8, s9, s10);
		gen19_3(pr,s1, s2, s12, s13, s14, s15, s16, s17, s18, s19, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen19_3(pr,s1, s2, s13, s14, s15, s16, s17, s18, s19, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen19_3(pr,s1, s2, s14, s15, s16, s17, s18, s19, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen19_3(pr,s1, s2, s15, s16, s17, s18, s19, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen19_3(pr,s1, s2, s16, s17, s18, s19, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen19_3(pr,s1, s2, s17, s18, s19, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen19_3(pr,s1, s2, s18, s19, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen19_3(pr,s1, s2, s19, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
	}

	private static final void gen19_3(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19){
		gen19_4(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen19_4(pr,s1, s2, s3, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s4);
		gen19_4(pr,s1, s2, s3, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s4, s5);
		gen19_4(pr,s1, s2, s3, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s4, s5, s6);
		gen19_4(pr,s1, s2, s3, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s4, s5, s6, s7);
		gen19_4(pr,s1, s2, s3, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s4, s5, s6, s7, s8);
		gen19_4(pr,s1, s2, s3, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s4, s5, s6, s7, s8, s9);
		gen19_4(pr,s1, s2, s3, s11, s12, s13, s14, s15, s16, s17, s18, s19, s4, s5, s6, s7, s8, s9, s10);
		gen19_4(pr,s1, s2, s3, s12, s13, s14, s15, s16, s17, s18, s19, s4, s5, s6, s7, s8, s9, s10, s11);
		gen19_4(pr,s1, s2, s3, s13, s14, s15, s16, s17, s18, s19, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen19_4(pr,s1, s2, s3, s14, s15, s16, s17, s18, s19, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen19_4(pr,s1, s2, s3, s15, s16, s17, s18, s19, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen19_4(pr,s1, s2, s3, s16, s17, s18, s19, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen19_4(pr,s1, s2, s3, s17, s18, s19, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen19_4(pr,s1, s2, s3, s18, s19, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen19_4(pr,s1, s2, s3, s19, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
	}

	private static final void gen19_4(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19){
		gen19_5(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen19_5(pr,s1, s2, s3, s4, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s5);
		gen19_5(pr,s1, s2, s3, s4, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s5, s6);
		gen19_5(pr,s1, s2, s3, s4, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s5, s6, s7);
		gen19_5(pr,s1, s2, s3, s4, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s5, s6, s7, s8);
		gen19_5(pr,s1, s2, s3, s4, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s5, s6, s7, s8, s9);
		gen19_5(pr,s1, s2, s3, s4, s11, s12, s13, s14, s15, s16, s17, s18, s19, s5, s6, s7, s8, s9, s10);
		gen19_5(pr,s1, s2, s3, s4, s12, s13, s14, s15, s16, s17, s18, s19, s5, s6, s7, s8, s9, s10, s11);
		gen19_5(pr,s1, s2, s3, s4, s13, s14, s15, s16, s17, s18, s19, s5, s6, s7, s8, s9, s10, s11, s12);
		gen19_5(pr,s1, s2, s3, s4, s14, s15, s16, s17, s18, s19, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen19_5(pr,s1, s2, s3, s4, s15, s16, s17, s18, s19, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen19_5(pr,s1, s2, s3, s4, s16, s17, s18, s19, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen19_5(pr,s1, s2, s3, s4, s17, s18, s19, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen19_5(pr,s1, s2, s3, s4, s18, s19, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen19_5(pr,s1, s2, s3, s4, s19, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
	}

	private static final void gen19_5(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19){
		gen19_6(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen19_6(pr,s1, s2, s3, s4, s5, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s6);
		gen19_6(pr,s1, s2, s3, s4, s5, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s6, s7);
		gen19_6(pr,s1, s2, s3, s4, s5, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s6, s7, s8);
		gen19_6(pr,s1, s2, s3, s4, s5, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s6, s7, s8, s9);
		gen19_6(pr,s1, s2, s3, s4, s5, s11, s12, s13, s14, s15, s16, s17, s18, s19, s6, s7, s8, s9, s10);
		gen19_6(pr,s1, s2, s3, s4, s5, s12, s13, s14, s15, s16, s17, s18, s19, s6, s7, s8, s9, s10, s11);
		gen19_6(pr,s1, s2, s3, s4, s5, s13, s14, s15, s16, s17, s18, s19, s6, s7, s8, s9, s10, s11, s12);
		gen19_6(pr,s1, s2, s3, s4, s5, s14, s15, s16, s17, s18, s19, s6, s7, s8, s9, s10, s11, s12, s13);
		gen19_6(pr,s1, s2, s3, s4, s5, s15, s16, s17, s18, s19, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen19_6(pr,s1, s2, s3, s4, s5, s16, s17, s18, s19, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen19_6(pr,s1, s2, s3, s4, s5, s17, s18, s19, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen19_6(pr,s1, s2, s3, s4, s5, s18, s19, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen19_6(pr,s1, s2, s3, s4, s5, s19, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
	}

	private static final void gen19_6(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19){
		gen19_7(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen19_7(pr,s1, s2, s3, s4, s5, s6, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s7);
		gen19_7(pr,s1, s2, s3, s4, s5, s6, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s7, s8);
		gen19_7(pr,s1, s2, s3, s4, s5, s6, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s7, s8, s9);
		gen19_7(pr,s1, s2, s3, s4, s5, s6, s11, s12, s13, s14, s15, s16, s17, s18, s19, s7, s8, s9, s10);
		gen19_7(pr,s1, s2, s3, s4, s5, s6, s12, s13, s14, s15, s16, s17, s18, s19, s7, s8, s9, s10, s11);
		gen19_7(pr,s1, s2, s3, s4, s5, s6, s13, s14, s15, s16, s17, s18, s19, s7, s8, s9, s10, s11, s12);
		gen19_7(pr,s1, s2, s3, s4, s5, s6, s14, s15, s16, s17, s18, s19, s7, s8, s9, s10, s11, s12, s13);
		gen19_7(pr,s1, s2, s3, s4, s5, s6, s15, s16, s17, s18, s19, s7, s8, s9, s10, s11, s12, s13, s14);
		gen19_7(pr,s1, s2, s3, s4, s5, s6, s16, s17, s18, s19, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen19_7(pr,s1, s2, s3, s4, s5, s6, s17, s18, s19, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen19_7(pr,s1, s2, s3, s4, s5, s6, s18, s19, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen19_7(pr,s1, s2, s3, s4, s5, s6, s19, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
	}

	private static final void gen19_7(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19){
		gen19_8(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen19_8(pr,s1, s2, s3, s4, s5, s6, s7, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s8);
		gen19_8(pr,s1, s2, s3, s4, s5, s6, s7, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s8, s9);
		gen19_8(pr,s1, s2, s3, s4, s5, s6, s7, s11, s12, s13, s14, s15, s16, s17, s18, s19, s8, s9, s10);
		gen19_8(pr,s1, s2, s3, s4, s5, s6, s7, s12, s13, s14, s15, s16, s17, s18, s19, s8, s9, s10, s11);
		gen19_8(pr,s1, s2, s3, s4, s5, s6, s7, s13, s14, s15, s16, s17, s18, s19, s8, s9, s10, s11, s12);
		gen19_8(pr,s1, s2, s3, s4, s5, s6, s7, s14, s15, s16, s17, s18, s19, s8, s9, s10, s11, s12, s13);
		gen19_8(pr,s1, s2, s3, s4, s5, s6, s7, s15, s16, s17, s18, s19, s8, s9, s10, s11, s12, s13, s14);
		gen19_8(pr,s1, s2, s3, s4, s5, s6, s7, s16, s17, s18, s19, s8, s9, s10, s11, s12, s13, s14, s15);
		gen19_8(pr,s1, s2, s3, s4, s5, s6, s7, s17, s18, s19, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen19_8(pr,s1, s2, s3, s4, s5, s6, s7, s18, s19, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen19_8(pr,s1, s2, s3, s4, s5, s6, s7, s19, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
	}

	private static final void gen19_8(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19){
		gen19_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen19_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s9);
		gen19_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s11, s12, s13, s14, s15, s16, s17, s18, s19, s9, s10);
		gen19_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s12, s13, s14, s15, s16, s17, s18, s19, s9, s10, s11);
		gen19_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s13, s14, s15, s16, s17, s18, s19, s9, s10, s11, s12);
		gen19_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s14, s15, s16, s17, s18, s19, s9, s10, s11, s12, s13);
		gen19_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s15, s16, s17, s18, s19, s9, s10, s11, s12, s13, s14);
		gen19_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s16, s17, s18, s19, s9, s10, s11, s12, s13, s14, s15);
		gen19_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s17, s18, s19, s9, s10, s11, s12, s13, s14, s15, s16);
		gen19_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s18, s19, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen19_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s19, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
	}

	private static final void gen19_9(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19){
		gen19_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen19_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s11, s12, s13, s14, s15, s16, s17, s18, s19, s10);
		gen19_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s12, s13, s14, s15, s16, s17, s18, s19, s10, s11);
		gen19_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s13, s14, s15, s16, s17, s18, s19, s10, s11, s12);
		gen19_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s14, s15, s16, s17, s18, s19, s10, s11, s12, s13);
		gen19_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s15, s16, s17, s18, s19, s10, s11, s12, s13, s14);
		gen19_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s16, s17, s18, s19, s10, s11, s12, s13, s14, s15);
		gen19_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s17, s18, s19, s10, s11, s12, s13, s14, s15, s16);
		gen19_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s18, s19, s10, s11, s12, s13, s14, s15, s16, s17);
		gen19_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s19, s10, s11, s12, s13, s14, s15, s16, s17, s18);
	}

	private static final void gen19_10(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19){
		gen19_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen19_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s12, s13, s14, s15, s16, s17, s18, s19, s11);
		gen19_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s13, s14, s15, s16, s17, s18, s19, s11, s12);
		gen19_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s14, s15, s16, s17, s18, s19, s11, s12, s13);
		gen19_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s15, s16, s17, s18, s19, s11, s12, s13, s14);
		gen19_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s16, s17, s18, s19, s11, s12, s13, s14, s15);
		gen19_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s17, s18, s19, s11, s12, s13, s14, s15, s16);
		gen19_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s18, s19, s11, s12, s13, s14, s15, s16, s17);
		gen19_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s19, s11, s12, s13, s14, s15, s16, s17, s18);
	}

	private static final void gen19_11(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19){
		gen19_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen19_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s13, s14, s15, s16, s17, s18, s19, s12);
		gen19_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s14, s15, s16, s17, s18, s19, s12, s13);
		gen19_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s15, s16, s17, s18, s19, s12, s13, s14);
		gen19_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s16, s17, s18, s19, s12, s13, s14, s15);
		gen19_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s17, s18, s19, s12, s13, s14, s15, s16);
		gen19_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s18, s19, s12, s13, s14, s15, s16, s17);
		gen19_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s19, s12, s13, s14, s15, s16, s17, s18);
	}

	private static final void gen19_12(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19){
		gen19_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen19_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s14, s15, s16, s17, s18, s19, s13);
		gen19_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s15, s16, s17, s18, s19, s13, s14);
		gen19_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s16, s17, s18, s19, s13, s14, s15);
		gen19_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s17, s18, s19, s13, s14, s15, s16);
		gen19_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s18, s19, s13, s14, s15, s16, s17);
		gen19_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s19, s13, s14, s15, s16, s17, s18);
	}

	private static final void gen19_13(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19){
		gen19_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen19_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s15, s16, s17, s18, s19, s14);
		gen19_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s16, s17, s18, s19, s14, s15);
		gen19_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s17, s18, s19, s14, s15, s16);
		gen19_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s18, s19, s14, s15, s16, s17);
		gen19_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s19, s14, s15, s16, s17, s18);
	}

	private static final void gen19_14(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19){
		gen19_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen19_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s16, s17, s18, s19, s15);
		gen19_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s17, s18, s19, s15, s16);
		gen19_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s18, s19, s15, s16, s17);
		gen19_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s19, s15, s16, s17, s18);
	}

	private static final void gen19_15(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19){
		gen19_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen19_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s17, s18, s19, s16);
		gen19_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s18, s19, s16, s17);
		gen19_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s19, s16, s17, s18);
	}

	private static final void gen19_16(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19){
		gen19_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen19_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s18, s19, s17);
		gen19_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s19, s17, s18);
	}

	private static final void gen19_17(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19){
		pr.recieve19(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		pr.recieve19(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s19, s18);
	}

	private static final void gen20_0(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20){
		gen20_1(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen20_1(pr,s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s1);
		gen20_1(pr,s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s1, s2);
		gen20_1(pr,s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s1, s2, s3);
		gen20_1(pr,s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s1, s2, s3, s4);
		gen20_1(pr,s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s1, s2, s3, s4, s5);
		gen20_1(pr,s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s1, s2, s3, s4, s5, s6);
		gen20_1(pr,s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s1, s2, s3, s4, s5, s6, s7);
		gen20_1(pr,s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s1, s2, s3, s4, s5, s6, s7, s8);
		gen20_1(pr,s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s1, s2, s3, s4, s5, s6, s7, s8, s9);
		gen20_1(pr,s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen20_1(pr,s12, s13, s14, s15, s16, s17, s18, s19, s20, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen20_1(pr,s13, s14, s15, s16, s17, s18, s19, s20, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen20_1(pr,s14, s15, s16, s17, s18, s19, s20, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen20_1(pr,s15, s16, s17, s18, s19, s20, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen20_1(pr,s16, s17, s18, s19, s20, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen20_1(pr,s17, s18, s19, s20, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen20_1(pr,s18, s19, s20, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen20_1(pr,s19, s20, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen20_1(pr,s20, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
	}

	private static final void gen20_1(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20){
		gen20_2(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen20_2(pr,s1, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s2);
		gen20_2(pr,s1, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s2, s3);
		gen20_2(pr,s1, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s2, s3, s4);
		gen20_2(pr,s1, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s2, s3, s4, s5);
		gen20_2(pr,s1, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s2, s3, s4, s5, s6);
		gen20_2(pr,s1, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s2, s3, s4, s5, s6, s7);
		gen20_2(pr,s1, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s2, s3, s4, s5, s6, s7, s8);
		gen20_2(pr,s1, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s2, s3, s4, s5, s6, s7, s8, s9);
		gen20_2(pr,s1, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen20_2(pr,s1, s12, s13, s14, s15, s16, s17, s18, s19, s20, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen20_2(pr,s1, s13, s14, s15, s16, s17, s18, s19, s20, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen20_2(pr,s1, s14, s15, s16, s17, s18, s19, s20, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen20_2(pr,s1, s15, s16, s17, s18, s19, s20, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen20_2(pr,s1, s16, s17, s18, s19, s20, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen20_2(pr,s1, s17, s18, s19, s20, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen20_2(pr,s1, s18, s19, s20, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen20_2(pr,s1, s19, s20, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen20_2(pr,s1, s20, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
	}

	private static final void gen20_2(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20){
		gen20_3(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen20_3(pr,s1, s2, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s3);
		gen20_3(pr,s1, s2, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s3, s4);
		gen20_3(pr,s1, s2, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s3, s4, s5);
		gen20_3(pr,s1, s2, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s3, s4, s5, s6);
		gen20_3(pr,s1, s2, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s3, s4, s5, s6, s7);
		gen20_3(pr,s1, s2, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s3, s4, s5, s6, s7, s8);
		gen20_3(pr,s1, s2, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s3, s4, s5, s6, s7, s8, s9);
		gen20_3(pr,s1, s2, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s3, s4, s5, s6, s7, s8, s9, s10);
		gen20_3(pr,s1, s2, s12, s13, s14, s15, s16, s17, s18, s19, s20, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen20_3(pr,s1, s2, s13, s14, s15, s16, s17, s18, s19, s20, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen20_3(pr,s1, s2, s14, s15, s16, s17, s18, s19, s20, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen20_3(pr,s1, s2, s15, s16, s17, s18, s19, s20, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen20_3(pr,s1, s2, s16, s17, s18, s19, s20, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen20_3(pr,s1, s2, s17, s18, s19, s20, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen20_3(pr,s1, s2, s18, s19, s20, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen20_3(pr,s1, s2, s19, s20, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen20_3(pr,s1, s2, s20, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
	}

	private static final void gen20_3(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20){
		gen20_4(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen20_4(pr,s1, s2, s3, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s4);
		gen20_4(pr,s1, s2, s3, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s4, s5);
		gen20_4(pr,s1, s2, s3, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s4, s5, s6);
		gen20_4(pr,s1, s2, s3, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s4, s5, s6, s7);
		gen20_4(pr,s1, s2, s3, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s4, s5, s6, s7, s8);
		gen20_4(pr,s1, s2, s3, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s4, s5, s6, s7, s8, s9);
		gen20_4(pr,s1, s2, s3, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s4, s5, s6, s7, s8, s9, s10);
		gen20_4(pr,s1, s2, s3, s12, s13, s14, s15, s16, s17, s18, s19, s20, s4, s5, s6, s7, s8, s9, s10, s11);
		gen20_4(pr,s1, s2, s3, s13, s14, s15, s16, s17, s18, s19, s20, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen20_4(pr,s1, s2, s3, s14, s15, s16, s17, s18, s19, s20, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen20_4(pr,s1, s2, s3, s15, s16, s17, s18, s19, s20, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen20_4(pr,s1, s2, s3, s16, s17, s18, s19, s20, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen20_4(pr,s1, s2, s3, s17, s18, s19, s20, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen20_4(pr,s1, s2, s3, s18, s19, s20, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen20_4(pr,s1, s2, s3, s19, s20, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen20_4(pr,s1, s2, s3, s20, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
	}

	private static final void gen20_4(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20){
		gen20_5(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen20_5(pr,s1, s2, s3, s4, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s5);
		gen20_5(pr,s1, s2, s3, s4, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s5, s6);
		gen20_5(pr,s1, s2, s3, s4, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s5, s6, s7);
		gen20_5(pr,s1, s2, s3, s4, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s5, s6, s7, s8);
		gen20_5(pr,s1, s2, s3, s4, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s5, s6, s7, s8, s9);
		gen20_5(pr,s1, s2, s3, s4, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s5, s6, s7, s8, s9, s10);
		gen20_5(pr,s1, s2, s3, s4, s12, s13, s14, s15, s16, s17, s18, s19, s20, s5, s6, s7, s8, s9, s10, s11);
		gen20_5(pr,s1, s2, s3, s4, s13, s14, s15, s16, s17, s18, s19, s20, s5, s6, s7, s8, s9, s10, s11, s12);
		gen20_5(pr,s1, s2, s3, s4, s14, s15, s16, s17, s18, s19, s20, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen20_5(pr,s1, s2, s3, s4, s15, s16, s17, s18, s19, s20, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen20_5(pr,s1, s2, s3, s4, s16, s17, s18, s19, s20, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen20_5(pr,s1, s2, s3, s4, s17, s18, s19, s20, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen20_5(pr,s1, s2, s3, s4, s18, s19, s20, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen20_5(pr,s1, s2, s3, s4, s19, s20, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen20_5(pr,s1, s2, s3, s4, s20, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
	}

	private static final void gen20_5(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20){
		gen20_6(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen20_6(pr,s1, s2, s3, s4, s5, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s6);
		gen20_6(pr,s1, s2, s3, s4, s5, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s6, s7);
		gen20_6(pr,s1, s2, s3, s4, s5, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s6, s7, s8);
		gen20_6(pr,s1, s2, s3, s4, s5, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s6, s7, s8, s9);
		gen20_6(pr,s1, s2, s3, s4, s5, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s6, s7, s8, s9, s10);
		gen20_6(pr,s1, s2, s3, s4, s5, s12, s13, s14, s15, s16, s17, s18, s19, s20, s6, s7, s8, s9, s10, s11);
		gen20_6(pr,s1, s2, s3, s4, s5, s13, s14, s15, s16, s17, s18, s19, s20, s6, s7, s8, s9, s10, s11, s12);
		gen20_6(pr,s1, s2, s3, s4, s5, s14, s15, s16, s17, s18, s19, s20, s6, s7, s8, s9, s10, s11, s12, s13);
		gen20_6(pr,s1, s2, s3, s4, s5, s15, s16, s17, s18, s19, s20, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen20_6(pr,s1, s2, s3, s4, s5, s16, s17, s18, s19, s20, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen20_6(pr,s1, s2, s3, s4, s5, s17, s18, s19, s20, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen20_6(pr,s1, s2, s3, s4, s5, s18, s19, s20, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen20_6(pr,s1, s2, s3, s4, s5, s19, s20, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen20_6(pr,s1, s2, s3, s4, s5, s20, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
	}

	private static final void gen20_6(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20){
		gen20_7(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen20_7(pr,s1, s2, s3, s4, s5, s6, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s7);
		gen20_7(pr,s1, s2, s3, s4, s5, s6, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s7, s8);
		gen20_7(pr,s1, s2, s3, s4, s5, s6, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s7, s8, s9);
		gen20_7(pr,s1, s2, s3, s4, s5, s6, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s7, s8, s9, s10);
		gen20_7(pr,s1, s2, s3, s4, s5, s6, s12, s13, s14, s15, s16, s17, s18, s19, s20, s7, s8, s9, s10, s11);
		gen20_7(pr,s1, s2, s3, s4, s5, s6, s13, s14, s15, s16, s17, s18, s19, s20, s7, s8, s9, s10, s11, s12);
		gen20_7(pr,s1, s2, s3, s4, s5, s6, s14, s15, s16, s17, s18, s19, s20, s7, s8, s9, s10, s11, s12, s13);
		gen20_7(pr,s1, s2, s3, s4, s5, s6, s15, s16, s17, s18, s19, s20, s7, s8, s9, s10, s11, s12, s13, s14);
		gen20_7(pr,s1, s2, s3, s4, s5, s6, s16, s17, s18, s19, s20, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen20_7(pr,s1, s2, s3, s4, s5, s6, s17, s18, s19, s20, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen20_7(pr,s1, s2, s3, s4, s5, s6, s18, s19, s20, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen20_7(pr,s1, s2, s3, s4, s5, s6, s19, s20, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen20_7(pr,s1, s2, s3, s4, s5, s6, s20, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
	}

	private static final void gen20_7(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20){
		gen20_8(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen20_8(pr,s1, s2, s3, s4, s5, s6, s7, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s8);
		gen20_8(pr,s1, s2, s3, s4, s5, s6, s7, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s8, s9);
		gen20_8(pr,s1, s2, s3, s4, s5, s6, s7, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s8, s9, s10);
		gen20_8(pr,s1, s2, s3, s4, s5, s6, s7, s12, s13, s14, s15, s16, s17, s18, s19, s20, s8, s9, s10, s11);
		gen20_8(pr,s1, s2, s3, s4, s5, s6, s7, s13, s14, s15, s16, s17, s18, s19, s20, s8, s9, s10, s11, s12);
		gen20_8(pr,s1, s2, s3, s4, s5, s6, s7, s14, s15, s16, s17, s18, s19, s20, s8, s9, s10, s11, s12, s13);
		gen20_8(pr,s1, s2, s3, s4, s5, s6, s7, s15, s16, s17, s18, s19, s20, s8, s9, s10, s11, s12, s13, s14);
		gen20_8(pr,s1, s2, s3, s4, s5, s6, s7, s16, s17, s18, s19, s20, s8, s9, s10, s11, s12, s13, s14, s15);
		gen20_8(pr,s1, s2, s3, s4, s5, s6, s7, s17, s18, s19, s20, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen20_8(pr,s1, s2, s3, s4, s5, s6, s7, s18, s19, s20, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen20_8(pr,s1, s2, s3, s4, s5, s6, s7, s19, s20, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen20_8(pr,s1, s2, s3, s4, s5, s6, s7, s20, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
	}

	private static final void gen20_8(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20){
		gen20_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen20_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s9);
		gen20_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s9, s10);
		gen20_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s12, s13, s14, s15, s16, s17, s18, s19, s20, s9, s10, s11);
		gen20_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s13, s14, s15, s16, s17, s18, s19, s20, s9, s10, s11, s12);
		gen20_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s14, s15, s16, s17, s18, s19, s20, s9, s10, s11, s12, s13);
		gen20_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s15, s16, s17, s18, s19, s20, s9, s10, s11, s12, s13, s14);
		gen20_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s16, s17, s18, s19, s20, s9, s10, s11, s12, s13, s14, s15);
		gen20_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s17, s18, s19, s20, s9, s10, s11, s12, s13, s14, s15, s16);
		gen20_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s18, s19, s20, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen20_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s19, s20, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen20_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s20, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
	}

	private static final void gen20_9(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20){
		gen20_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen20_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s10);
		gen20_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s12, s13, s14, s15, s16, s17, s18, s19, s20, s10, s11);
		gen20_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s13, s14, s15, s16, s17, s18, s19, s20, s10, s11, s12);
		gen20_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s14, s15, s16, s17, s18, s19, s20, s10, s11, s12, s13);
		gen20_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s15, s16, s17, s18, s19, s20, s10, s11, s12, s13, s14);
		gen20_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s16, s17, s18, s19, s20, s10, s11, s12, s13, s14, s15);
		gen20_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s17, s18, s19, s20, s10, s11, s12, s13, s14, s15, s16);
		gen20_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s18, s19, s20, s10, s11, s12, s13, s14, s15, s16, s17);
		gen20_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s19, s20, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen20_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s20, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
	}

	private static final void gen20_10(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20){
		gen20_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen20_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s12, s13, s14, s15, s16, s17, s18, s19, s20, s11);
		gen20_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s13, s14, s15, s16, s17, s18, s19, s20, s11, s12);
		gen20_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s14, s15, s16, s17, s18, s19, s20, s11, s12, s13);
		gen20_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s15, s16, s17, s18, s19, s20, s11, s12, s13, s14);
		gen20_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s16, s17, s18, s19, s20, s11, s12, s13, s14, s15);
		gen20_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s17, s18, s19, s20, s11, s12, s13, s14, s15, s16);
		gen20_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s18, s19, s20, s11, s12, s13, s14, s15, s16, s17);
		gen20_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s19, s20, s11, s12, s13, s14, s15, s16, s17, s18);
		gen20_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s20, s11, s12, s13, s14, s15, s16, s17, s18, s19);
	}

	private static final void gen20_11(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20){
		gen20_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen20_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s13, s14, s15, s16, s17, s18, s19, s20, s12);
		gen20_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s14, s15, s16, s17, s18, s19, s20, s12, s13);
		gen20_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s15, s16, s17, s18, s19, s20, s12, s13, s14);
		gen20_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s16, s17, s18, s19, s20, s12, s13, s14, s15);
		gen20_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s17, s18, s19, s20, s12, s13, s14, s15, s16);
		gen20_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s18, s19, s20, s12, s13, s14, s15, s16, s17);
		gen20_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s19, s20, s12, s13, s14, s15, s16, s17, s18);
		gen20_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s20, s12, s13, s14, s15, s16, s17, s18, s19);
	}

	private static final void gen20_12(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20){
		gen20_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen20_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s14, s15, s16, s17, s18, s19, s20, s13);
		gen20_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s15, s16, s17, s18, s19, s20, s13, s14);
		gen20_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s16, s17, s18, s19, s20, s13, s14, s15);
		gen20_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s17, s18, s19, s20, s13, s14, s15, s16);
		gen20_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s18, s19, s20, s13, s14, s15, s16, s17);
		gen20_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s19, s20, s13, s14, s15, s16, s17, s18);
		gen20_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s20, s13, s14, s15, s16, s17, s18, s19);
	}

	private static final void gen20_13(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20){
		gen20_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen20_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s15, s16, s17, s18, s19, s20, s14);
		gen20_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s16, s17, s18, s19, s20, s14, s15);
		gen20_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s17, s18, s19, s20, s14, s15, s16);
		gen20_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s18, s19, s20, s14, s15, s16, s17);
		gen20_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s19, s20, s14, s15, s16, s17, s18);
		gen20_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s20, s14, s15, s16, s17, s18, s19);
	}

	private static final void gen20_14(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20){
		gen20_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen20_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s16, s17, s18, s19, s20, s15);
		gen20_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s17, s18, s19, s20, s15, s16);
		gen20_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s18, s19, s20, s15, s16, s17);
		gen20_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s19, s20, s15, s16, s17, s18);
		gen20_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s20, s15, s16, s17, s18, s19);
	}

	private static final void gen20_15(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20){
		gen20_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen20_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s17, s18, s19, s20, s16);
		gen20_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s18, s19, s20, s16, s17);
		gen20_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s19, s20, s16, s17, s18);
		gen20_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s20, s16, s17, s18, s19);
	}

	private static final void gen20_16(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20){
		gen20_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen20_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s18, s19, s20, s17);
		gen20_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s19, s20, s17, s18);
		gen20_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s20, s17, s18, s19);
	}

	private static final void gen20_17(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20){
		gen20_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen20_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s19, s20, s18);
		gen20_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s20, s18, s19);
	}

	private static final void gen20_18(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20){
		pr.recieve20(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		pr.recieve20(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s20, s19);
	}

	private static final void gen21_0(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21){
		gen21_1(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen21_1(pr,s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s1);
		gen21_1(pr,s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s1, s2);
		gen21_1(pr,s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s1, s2, s3);
		gen21_1(pr,s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s1, s2, s3, s4);
		gen21_1(pr,s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s1, s2, s3, s4, s5);
		gen21_1(pr,s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s1, s2, s3, s4, s5, s6);
		gen21_1(pr,s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s1, s2, s3, s4, s5, s6, s7);
		gen21_1(pr,s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s1, s2, s3, s4, s5, s6, s7, s8);
		gen21_1(pr,s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s1, s2, s3, s4, s5, s6, s7, s8, s9);
		gen21_1(pr,s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen21_1(pr,s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen21_1(pr,s13, s14, s15, s16, s17, s18, s19, s20, s21, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen21_1(pr,s14, s15, s16, s17, s18, s19, s20, s21, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen21_1(pr,s15, s16, s17, s18, s19, s20, s21, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen21_1(pr,s16, s17, s18, s19, s20, s21, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen21_1(pr,s17, s18, s19, s20, s21, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen21_1(pr,s18, s19, s20, s21, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen21_1(pr,s19, s20, s21, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen21_1(pr,s20, s21, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen21_1(pr,s21, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
	}

	private static final void gen21_1(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21){
		gen21_2(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen21_2(pr,s1, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s2);
		gen21_2(pr,s1, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s2, s3);
		gen21_2(pr,s1, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s2, s3, s4);
		gen21_2(pr,s1, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s2, s3, s4, s5);
		gen21_2(pr,s1, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s2, s3, s4, s5, s6);
		gen21_2(pr,s1, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s2, s3, s4, s5, s6, s7);
		gen21_2(pr,s1, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s2, s3, s4, s5, s6, s7, s8);
		gen21_2(pr,s1, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s2, s3, s4, s5, s6, s7, s8, s9);
		gen21_2(pr,s1, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen21_2(pr,s1, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen21_2(pr,s1, s13, s14, s15, s16, s17, s18, s19, s20, s21, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen21_2(pr,s1, s14, s15, s16, s17, s18, s19, s20, s21, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen21_2(pr,s1, s15, s16, s17, s18, s19, s20, s21, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen21_2(pr,s1, s16, s17, s18, s19, s20, s21, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen21_2(pr,s1, s17, s18, s19, s20, s21, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen21_2(pr,s1, s18, s19, s20, s21, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen21_2(pr,s1, s19, s20, s21, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen21_2(pr,s1, s20, s21, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen21_2(pr,s1, s21, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
	}

	private static final void gen21_2(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21){
		gen21_3(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen21_3(pr,s1, s2, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s3);
		gen21_3(pr,s1, s2, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s3, s4);
		gen21_3(pr,s1, s2, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s3, s4, s5);
		gen21_3(pr,s1, s2, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s3, s4, s5, s6);
		gen21_3(pr,s1, s2, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s3, s4, s5, s6, s7);
		gen21_3(pr,s1, s2, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s3, s4, s5, s6, s7, s8);
		gen21_3(pr,s1, s2, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s3, s4, s5, s6, s7, s8, s9);
		gen21_3(pr,s1, s2, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s3, s4, s5, s6, s7, s8, s9, s10);
		gen21_3(pr,s1, s2, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen21_3(pr,s1, s2, s13, s14, s15, s16, s17, s18, s19, s20, s21, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen21_3(pr,s1, s2, s14, s15, s16, s17, s18, s19, s20, s21, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen21_3(pr,s1, s2, s15, s16, s17, s18, s19, s20, s21, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen21_3(pr,s1, s2, s16, s17, s18, s19, s20, s21, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen21_3(pr,s1, s2, s17, s18, s19, s20, s21, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen21_3(pr,s1, s2, s18, s19, s20, s21, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen21_3(pr,s1, s2, s19, s20, s21, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen21_3(pr,s1, s2, s20, s21, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen21_3(pr,s1, s2, s21, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
	}

	private static final void gen21_3(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21){
		gen21_4(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen21_4(pr,s1, s2, s3, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s4);
		gen21_4(pr,s1, s2, s3, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s4, s5);
		gen21_4(pr,s1, s2, s3, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s4, s5, s6);
		gen21_4(pr,s1, s2, s3, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s4, s5, s6, s7);
		gen21_4(pr,s1, s2, s3, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s4, s5, s6, s7, s8);
		gen21_4(pr,s1, s2, s3, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s4, s5, s6, s7, s8, s9);
		gen21_4(pr,s1, s2, s3, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s4, s5, s6, s7, s8, s9, s10);
		gen21_4(pr,s1, s2, s3, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s4, s5, s6, s7, s8, s9, s10, s11);
		gen21_4(pr,s1, s2, s3, s13, s14, s15, s16, s17, s18, s19, s20, s21, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen21_4(pr,s1, s2, s3, s14, s15, s16, s17, s18, s19, s20, s21, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen21_4(pr,s1, s2, s3, s15, s16, s17, s18, s19, s20, s21, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen21_4(pr,s1, s2, s3, s16, s17, s18, s19, s20, s21, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen21_4(pr,s1, s2, s3, s17, s18, s19, s20, s21, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen21_4(pr,s1, s2, s3, s18, s19, s20, s21, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen21_4(pr,s1, s2, s3, s19, s20, s21, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen21_4(pr,s1, s2, s3, s20, s21, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen21_4(pr,s1, s2, s3, s21, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
	}

	private static final void gen21_4(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21){
		gen21_5(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen21_5(pr,s1, s2, s3, s4, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s5);
		gen21_5(pr,s1, s2, s3, s4, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s5, s6);
		gen21_5(pr,s1, s2, s3, s4, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s5, s6, s7);
		gen21_5(pr,s1, s2, s3, s4, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s5, s6, s7, s8);
		gen21_5(pr,s1, s2, s3, s4, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s5, s6, s7, s8, s9);
		gen21_5(pr,s1, s2, s3, s4, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s5, s6, s7, s8, s9, s10);
		gen21_5(pr,s1, s2, s3, s4, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s5, s6, s7, s8, s9, s10, s11);
		gen21_5(pr,s1, s2, s3, s4, s13, s14, s15, s16, s17, s18, s19, s20, s21, s5, s6, s7, s8, s9, s10, s11, s12);
		gen21_5(pr,s1, s2, s3, s4, s14, s15, s16, s17, s18, s19, s20, s21, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen21_5(pr,s1, s2, s3, s4, s15, s16, s17, s18, s19, s20, s21, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen21_5(pr,s1, s2, s3, s4, s16, s17, s18, s19, s20, s21, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen21_5(pr,s1, s2, s3, s4, s17, s18, s19, s20, s21, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen21_5(pr,s1, s2, s3, s4, s18, s19, s20, s21, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen21_5(pr,s1, s2, s3, s4, s19, s20, s21, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen21_5(pr,s1, s2, s3, s4, s20, s21, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen21_5(pr,s1, s2, s3, s4, s21, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
	}

	private static final void gen21_5(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21){
		gen21_6(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen21_6(pr,s1, s2, s3, s4, s5, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s6);
		gen21_6(pr,s1, s2, s3, s4, s5, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s6, s7);
		gen21_6(pr,s1, s2, s3, s4, s5, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s6, s7, s8);
		gen21_6(pr,s1, s2, s3, s4, s5, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s6, s7, s8, s9);
		gen21_6(pr,s1, s2, s3, s4, s5, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s6, s7, s8, s9, s10);
		gen21_6(pr,s1, s2, s3, s4, s5, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s6, s7, s8, s9, s10, s11);
		gen21_6(pr,s1, s2, s3, s4, s5, s13, s14, s15, s16, s17, s18, s19, s20, s21, s6, s7, s8, s9, s10, s11, s12);
		gen21_6(pr,s1, s2, s3, s4, s5, s14, s15, s16, s17, s18, s19, s20, s21, s6, s7, s8, s9, s10, s11, s12, s13);
		gen21_6(pr,s1, s2, s3, s4, s5, s15, s16, s17, s18, s19, s20, s21, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen21_6(pr,s1, s2, s3, s4, s5, s16, s17, s18, s19, s20, s21, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen21_6(pr,s1, s2, s3, s4, s5, s17, s18, s19, s20, s21, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen21_6(pr,s1, s2, s3, s4, s5, s18, s19, s20, s21, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen21_6(pr,s1, s2, s3, s4, s5, s19, s20, s21, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen21_6(pr,s1, s2, s3, s4, s5, s20, s21, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen21_6(pr,s1, s2, s3, s4, s5, s21, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
	}

	private static final void gen21_6(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21){
		gen21_7(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen21_7(pr,s1, s2, s3, s4, s5, s6, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s7);
		gen21_7(pr,s1, s2, s3, s4, s5, s6, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s7, s8);
		gen21_7(pr,s1, s2, s3, s4, s5, s6, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s7, s8, s9);
		gen21_7(pr,s1, s2, s3, s4, s5, s6, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s7, s8, s9, s10);
		gen21_7(pr,s1, s2, s3, s4, s5, s6, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s7, s8, s9, s10, s11);
		gen21_7(pr,s1, s2, s3, s4, s5, s6, s13, s14, s15, s16, s17, s18, s19, s20, s21, s7, s8, s9, s10, s11, s12);
		gen21_7(pr,s1, s2, s3, s4, s5, s6, s14, s15, s16, s17, s18, s19, s20, s21, s7, s8, s9, s10, s11, s12, s13);
		gen21_7(pr,s1, s2, s3, s4, s5, s6, s15, s16, s17, s18, s19, s20, s21, s7, s8, s9, s10, s11, s12, s13, s14);
		gen21_7(pr,s1, s2, s3, s4, s5, s6, s16, s17, s18, s19, s20, s21, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen21_7(pr,s1, s2, s3, s4, s5, s6, s17, s18, s19, s20, s21, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen21_7(pr,s1, s2, s3, s4, s5, s6, s18, s19, s20, s21, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen21_7(pr,s1, s2, s3, s4, s5, s6, s19, s20, s21, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen21_7(pr,s1, s2, s3, s4, s5, s6, s20, s21, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen21_7(pr,s1, s2, s3, s4, s5, s6, s21, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
	}

	private static final void gen21_7(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21){
		gen21_8(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen21_8(pr,s1, s2, s3, s4, s5, s6, s7, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s8);
		gen21_8(pr,s1, s2, s3, s4, s5, s6, s7, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s8, s9);
		gen21_8(pr,s1, s2, s3, s4, s5, s6, s7, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s8, s9, s10);
		gen21_8(pr,s1, s2, s3, s4, s5, s6, s7, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s8, s9, s10, s11);
		gen21_8(pr,s1, s2, s3, s4, s5, s6, s7, s13, s14, s15, s16, s17, s18, s19, s20, s21, s8, s9, s10, s11, s12);
		gen21_8(pr,s1, s2, s3, s4, s5, s6, s7, s14, s15, s16, s17, s18, s19, s20, s21, s8, s9, s10, s11, s12, s13);
		gen21_8(pr,s1, s2, s3, s4, s5, s6, s7, s15, s16, s17, s18, s19, s20, s21, s8, s9, s10, s11, s12, s13, s14);
		gen21_8(pr,s1, s2, s3, s4, s5, s6, s7, s16, s17, s18, s19, s20, s21, s8, s9, s10, s11, s12, s13, s14, s15);
		gen21_8(pr,s1, s2, s3, s4, s5, s6, s7, s17, s18, s19, s20, s21, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen21_8(pr,s1, s2, s3, s4, s5, s6, s7, s18, s19, s20, s21, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen21_8(pr,s1, s2, s3, s4, s5, s6, s7, s19, s20, s21, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen21_8(pr,s1, s2, s3, s4, s5, s6, s7, s20, s21, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen21_8(pr,s1, s2, s3, s4, s5, s6, s7, s21, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
	}

	private static final void gen21_8(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21){
		gen21_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen21_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s9);
		gen21_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s9, s10);
		gen21_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s9, s10, s11);
		gen21_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s13, s14, s15, s16, s17, s18, s19, s20, s21, s9, s10, s11, s12);
		gen21_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s14, s15, s16, s17, s18, s19, s20, s21, s9, s10, s11, s12, s13);
		gen21_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s15, s16, s17, s18, s19, s20, s21, s9, s10, s11, s12, s13, s14);
		gen21_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s16, s17, s18, s19, s20, s21, s9, s10, s11, s12, s13, s14, s15);
		gen21_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s17, s18, s19, s20, s21, s9, s10, s11, s12, s13, s14, s15, s16);
		gen21_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s18, s19, s20, s21, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen21_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s19, s20, s21, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen21_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s20, s21, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen21_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s21, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
	}

	private static final void gen21_9(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21){
		gen21_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen21_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s10);
		gen21_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s10, s11);
		gen21_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s13, s14, s15, s16, s17, s18, s19, s20, s21, s10, s11, s12);
		gen21_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s14, s15, s16, s17, s18, s19, s20, s21, s10, s11, s12, s13);
		gen21_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s15, s16, s17, s18, s19, s20, s21, s10, s11, s12, s13, s14);
		gen21_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s16, s17, s18, s19, s20, s21, s10, s11, s12, s13, s14, s15);
		gen21_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s17, s18, s19, s20, s21, s10, s11, s12, s13, s14, s15, s16);
		gen21_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s18, s19, s20, s21, s10, s11, s12, s13, s14, s15, s16, s17);
		gen21_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s19, s20, s21, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen21_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s20, s21, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen21_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s21, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
	}

	private static final void gen21_10(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21){
		gen21_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen21_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s11);
		gen21_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s13, s14, s15, s16, s17, s18, s19, s20, s21, s11, s12);
		gen21_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s14, s15, s16, s17, s18, s19, s20, s21, s11, s12, s13);
		gen21_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s15, s16, s17, s18, s19, s20, s21, s11, s12, s13, s14);
		gen21_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s16, s17, s18, s19, s20, s21, s11, s12, s13, s14, s15);
		gen21_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s17, s18, s19, s20, s21, s11, s12, s13, s14, s15, s16);
		gen21_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s18, s19, s20, s21, s11, s12, s13, s14, s15, s16, s17);
		gen21_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s19, s20, s21, s11, s12, s13, s14, s15, s16, s17, s18);
		gen21_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s20, s21, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen21_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s21, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
	}

	private static final void gen21_11(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21){
		gen21_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen21_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s13, s14, s15, s16, s17, s18, s19, s20, s21, s12);
		gen21_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s14, s15, s16, s17, s18, s19, s20, s21, s12, s13);
		gen21_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s15, s16, s17, s18, s19, s20, s21, s12, s13, s14);
		gen21_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s16, s17, s18, s19, s20, s21, s12, s13, s14, s15);
		gen21_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s17, s18, s19, s20, s21, s12, s13, s14, s15, s16);
		gen21_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s18, s19, s20, s21, s12, s13, s14, s15, s16, s17);
		gen21_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s19, s20, s21, s12, s13, s14, s15, s16, s17, s18);
		gen21_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s20, s21, s12, s13, s14, s15, s16, s17, s18, s19);
		gen21_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s21, s12, s13, s14, s15, s16, s17, s18, s19, s20);
	}

	private static final void gen21_12(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21){
		gen21_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen21_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s14, s15, s16, s17, s18, s19, s20, s21, s13);
		gen21_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s15, s16, s17, s18, s19, s20, s21, s13, s14);
		gen21_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s16, s17, s18, s19, s20, s21, s13, s14, s15);
		gen21_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s17, s18, s19, s20, s21, s13, s14, s15, s16);
		gen21_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s18, s19, s20, s21, s13, s14, s15, s16, s17);
		gen21_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s19, s20, s21, s13, s14, s15, s16, s17, s18);
		gen21_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s20, s21, s13, s14, s15, s16, s17, s18, s19);
		gen21_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s21, s13, s14, s15, s16, s17, s18, s19, s20);
	}

	private static final void gen21_13(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21){
		gen21_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen21_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s15, s16, s17, s18, s19, s20, s21, s14);
		gen21_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s16, s17, s18, s19, s20, s21, s14, s15);
		gen21_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s17, s18, s19, s20, s21, s14, s15, s16);
		gen21_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s18, s19, s20, s21, s14, s15, s16, s17);
		gen21_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s19, s20, s21, s14, s15, s16, s17, s18);
		gen21_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s20, s21, s14, s15, s16, s17, s18, s19);
		gen21_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s21, s14, s15, s16, s17, s18, s19, s20);
	}

	private static final void gen21_14(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21){
		gen21_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen21_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s16, s17, s18, s19, s20, s21, s15);
		gen21_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s17, s18, s19, s20, s21, s15, s16);
		gen21_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s18, s19, s20, s21, s15, s16, s17);
		gen21_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s19, s20, s21, s15, s16, s17, s18);
		gen21_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s20, s21, s15, s16, s17, s18, s19);
		gen21_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s21, s15, s16, s17, s18, s19, s20);
	}

	private static final void gen21_15(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21){
		gen21_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen21_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s17, s18, s19, s20, s21, s16);
		gen21_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s18, s19, s20, s21, s16, s17);
		gen21_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s19, s20, s21, s16, s17, s18);
		gen21_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s20, s21, s16, s17, s18, s19);
		gen21_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s21, s16, s17, s18, s19, s20);
	}

	private static final void gen21_16(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21){
		gen21_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen21_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s18, s19, s20, s21, s17);
		gen21_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s19, s20, s21, s17, s18);
		gen21_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s20, s21, s17, s18, s19);
		gen21_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s21, s17, s18, s19, s20);
	}

	private static final void gen21_17(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21){
		gen21_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen21_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s19, s20, s21, s18);
		gen21_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s20, s21, s18, s19);
		gen21_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s21, s18, s19, s20);
	}

	private static final void gen21_18(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21){
		gen21_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen21_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s20, s21, s19);
		gen21_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s21, s19, s20);
	}

	private static final void gen21_19(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21){
		pr.recieve21(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		pr.recieve21(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s21, s20);
	}

	private static final void gen22_0(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22){
		gen22_1(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen22_1(pr,s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s1);
		gen22_1(pr,s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s1, s2);
		gen22_1(pr,s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s1, s2, s3);
		gen22_1(pr,s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s1, s2, s3, s4);
		gen22_1(pr,s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s1, s2, s3, s4, s5);
		gen22_1(pr,s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s1, s2, s3, s4, s5, s6);
		gen22_1(pr,s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s1, s2, s3, s4, s5, s6, s7);
		gen22_1(pr,s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s1, s2, s3, s4, s5, s6, s7, s8);
		gen22_1(pr,s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s1, s2, s3, s4, s5, s6, s7, s8, s9);
		gen22_1(pr,s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen22_1(pr,s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen22_1(pr,s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen22_1(pr,s14, s15, s16, s17, s18, s19, s20, s21, s22, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen22_1(pr,s15, s16, s17, s18, s19, s20, s21, s22, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen22_1(pr,s16, s17, s18, s19, s20, s21, s22, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen22_1(pr,s17, s18, s19, s20, s21, s22, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen22_1(pr,s18, s19, s20, s21, s22, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen22_1(pr,s19, s20, s21, s22, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen22_1(pr,s20, s21, s22, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen22_1(pr,s21, s22, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen22_1(pr,s22, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
	}

	private static final void gen22_1(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22){
		gen22_2(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen22_2(pr,s1, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s2);
		gen22_2(pr,s1, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s2, s3);
		gen22_2(pr,s1, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s2, s3, s4);
		gen22_2(pr,s1, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s2, s3, s4, s5);
		gen22_2(pr,s1, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s2, s3, s4, s5, s6);
		gen22_2(pr,s1, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s2, s3, s4, s5, s6, s7);
		gen22_2(pr,s1, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s2, s3, s4, s5, s6, s7, s8);
		gen22_2(pr,s1, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s2, s3, s4, s5, s6, s7, s8, s9);
		gen22_2(pr,s1, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen22_2(pr,s1, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen22_2(pr,s1, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen22_2(pr,s1, s14, s15, s16, s17, s18, s19, s20, s21, s22, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen22_2(pr,s1, s15, s16, s17, s18, s19, s20, s21, s22, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen22_2(pr,s1, s16, s17, s18, s19, s20, s21, s22, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen22_2(pr,s1, s17, s18, s19, s20, s21, s22, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen22_2(pr,s1, s18, s19, s20, s21, s22, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen22_2(pr,s1, s19, s20, s21, s22, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen22_2(pr,s1, s20, s21, s22, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen22_2(pr,s1, s21, s22, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen22_2(pr,s1, s22, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
	}

	private static final void gen22_2(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22){
		gen22_3(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen22_3(pr,s1, s2, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s3);
		gen22_3(pr,s1, s2, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s3, s4);
		gen22_3(pr,s1, s2, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s3, s4, s5);
		gen22_3(pr,s1, s2, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s3, s4, s5, s6);
		gen22_3(pr,s1, s2, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s3, s4, s5, s6, s7);
		gen22_3(pr,s1, s2, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s3, s4, s5, s6, s7, s8);
		gen22_3(pr,s1, s2, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s3, s4, s5, s6, s7, s8, s9);
		gen22_3(pr,s1, s2, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s3, s4, s5, s6, s7, s8, s9, s10);
		gen22_3(pr,s1, s2, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen22_3(pr,s1, s2, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen22_3(pr,s1, s2, s14, s15, s16, s17, s18, s19, s20, s21, s22, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen22_3(pr,s1, s2, s15, s16, s17, s18, s19, s20, s21, s22, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen22_3(pr,s1, s2, s16, s17, s18, s19, s20, s21, s22, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen22_3(pr,s1, s2, s17, s18, s19, s20, s21, s22, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen22_3(pr,s1, s2, s18, s19, s20, s21, s22, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen22_3(pr,s1, s2, s19, s20, s21, s22, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen22_3(pr,s1, s2, s20, s21, s22, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen22_3(pr,s1, s2, s21, s22, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen22_3(pr,s1, s2, s22, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
	}

	private static final void gen22_3(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22){
		gen22_4(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen22_4(pr,s1, s2, s3, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s4);
		gen22_4(pr,s1, s2, s3, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s4, s5);
		gen22_4(pr,s1, s2, s3, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s4, s5, s6);
		gen22_4(pr,s1, s2, s3, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s4, s5, s6, s7);
		gen22_4(pr,s1, s2, s3, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s4, s5, s6, s7, s8);
		gen22_4(pr,s1, s2, s3, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s4, s5, s6, s7, s8, s9);
		gen22_4(pr,s1, s2, s3, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s4, s5, s6, s7, s8, s9, s10);
		gen22_4(pr,s1, s2, s3, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s4, s5, s6, s7, s8, s9, s10, s11);
		gen22_4(pr,s1, s2, s3, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen22_4(pr,s1, s2, s3, s14, s15, s16, s17, s18, s19, s20, s21, s22, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen22_4(pr,s1, s2, s3, s15, s16, s17, s18, s19, s20, s21, s22, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen22_4(pr,s1, s2, s3, s16, s17, s18, s19, s20, s21, s22, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen22_4(pr,s1, s2, s3, s17, s18, s19, s20, s21, s22, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen22_4(pr,s1, s2, s3, s18, s19, s20, s21, s22, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen22_4(pr,s1, s2, s3, s19, s20, s21, s22, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen22_4(pr,s1, s2, s3, s20, s21, s22, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen22_4(pr,s1, s2, s3, s21, s22, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen22_4(pr,s1, s2, s3, s22, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
	}

	private static final void gen22_4(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22){
		gen22_5(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen22_5(pr,s1, s2, s3, s4, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s5);
		gen22_5(pr,s1, s2, s3, s4, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s5, s6);
		gen22_5(pr,s1, s2, s3, s4, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s5, s6, s7);
		gen22_5(pr,s1, s2, s3, s4, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s5, s6, s7, s8);
		gen22_5(pr,s1, s2, s3, s4, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s5, s6, s7, s8, s9);
		gen22_5(pr,s1, s2, s3, s4, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s5, s6, s7, s8, s9, s10);
		gen22_5(pr,s1, s2, s3, s4, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s5, s6, s7, s8, s9, s10, s11);
		gen22_5(pr,s1, s2, s3, s4, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s5, s6, s7, s8, s9, s10, s11, s12);
		gen22_5(pr,s1, s2, s3, s4, s14, s15, s16, s17, s18, s19, s20, s21, s22, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen22_5(pr,s1, s2, s3, s4, s15, s16, s17, s18, s19, s20, s21, s22, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen22_5(pr,s1, s2, s3, s4, s16, s17, s18, s19, s20, s21, s22, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen22_5(pr,s1, s2, s3, s4, s17, s18, s19, s20, s21, s22, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen22_5(pr,s1, s2, s3, s4, s18, s19, s20, s21, s22, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen22_5(pr,s1, s2, s3, s4, s19, s20, s21, s22, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen22_5(pr,s1, s2, s3, s4, s20, s21, s22, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen22_5(pr,s1, s2, s3, s4, s21, s22, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen22_5(pr,s1, s2, s3, s4, s22, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
	}

	private static final void gen22_5(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22){
		gen22_6(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen22_6(pr,s1, s2, s3, s4, s5, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s6);
		gen22_6(pr,s1, s2, s3, s4, s5, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s6, s7);
		gen22_6(pr,s1, s2, s3, s4, s5, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s6, s7, s8);
		gen22_6(pr,s1, s2, s3, s4, s5, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s6, s7, s8, s9);
		gen22_6(pr,s1, s2, s3, s4, s5, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s6, s7, s8, s9, s10);
		gen22_6(pr,s1, s2, s3, s4, s5, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s6, s7, s8, s9, s10, s11);
		gen22_6(pr,s1, s2, s3, s4, s5, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s6, s7, s8, s9, s10, s11, s12);
		gen22_6(pr,s1, s2, s3, s4, s5, s14, s15, s16, s17, s18, s19, s20, s21, s22, s6, s7, s8, s9, s10, s11, s12, s13);
		gen22_6(pr,s1, s2, s3, s4, s5, s15, s16, s17, s18, s19, s20, s21, s22, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen22_6(pr,s1, s2, s3, s4, s5, s16, s17, s18, s19, s20, s21, s22, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen22_6(pr,s1, s2, s3, s4, s5, s17, s18, s19, s20, s21, s22, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen22_6(pr,s1, s2, s3, s4, s5, s18, s19, s20, s21, s22, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen22_6(pr,s1, s2, s3, s4, s5, s19, s20, s21, s22, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen22_6(pr,s1, s2, s3, s4, s5, s20, s21, s22, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen22_6(pr,s1, s2, s3, s4, s5, s21, s22, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen22_6(pr,s1, s2, s3, s4, s5, s22, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
	}

	private static final void gen22_6(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22){
		gen22_7(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen22_7(pr,s1, s2, s3, s4, s5, s6, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s7);
		gen22_7(pr,s1, s2, s3, s4, s5, s6, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s7, s8);
		gen22_7(pr,s1, s2, s3, s4, s5, s6, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s7, s8, s9);
		gen22_7(pr,s1, s2, s3, s4, s5, s6, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s7, s8, s9, s10);
		gen22_7(pr,s1, s2, s3, s4, s5, s6, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s7, s8, s9, s10, s11);
		gen22_7(pr,s1, s2, s3, s4, s5, s6, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s7, s8, s9, s10, s11, s12);
		gen22_7(pr,s1, s2, s3, s4, s5, s6, s14, s15, s16, s17, s18, s19, s20, s21, s22, s7, s8, s9, s10, s11, s12, s13);
		gen22_7(pr,s1, s2, s3, s4, s5, s6, s15, s16, s17, s18, s19, s20, s21, s22, s7, s8, s9, s10, s11, s12, s13, s14);
		gen22_7(pr,s1, s2, s3, s4, s5, s6, s16, s17, s18, s19, s20, s21, s22, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen22_7(pr,s1, s2, s3, s4, s5, s6, s17, s18, s19, s20, s21, s22, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen22_7(pr,s1, s2, s3, s4, s5, s6, s18, s19, s20, s21, s22, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen22_7(pr,s1, s2, s3, s4, s5, s6, s19, s20, s21, s22, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen22_7(pr,s1, s2, s3, s4, s5, s6, s20, s21, s22, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen22_7(pr,s1, s2, s3, s4, s5, s6, s21, s22, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen22_7(pr,s1, s2, s3, s4, s5, s6, s22, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
	}

	private static final void gen22_7(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22){
		gen22_8(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen22_8(pr,s1, s2, s3, s4, s5, s6, s7, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s8);
		gen22_8(pr,s1, s2, s3, s4, s5, s6, s7, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s8, s9);
		gen22_8(pr,s1, s2, s3, s4, s5, s6, s7, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s8, s9, s10);
		gen22_8(pr,s1, s2, s3, s4, s5, s6, s7, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s8, s9, s10, s11);
		gen22_8(pr,s1, s2, s3, s4, s5, s6, s7, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s8, s9, s10, s11, s12);
		gen22_8(pr,s1, s2, s3, s4, s5, s6, s7, s14, s15, s16, s17, s18, s19, s20, s21, s22, s8, s9, s10, s11, s12, s13);
		gen22_8(pr,s1, s2, s3, s4, s5, s6, s7, s15, s16, s17, s18, s19, s20, s21, s22, s8, s9, s10, s11, s12, s13, s14);
		gen22_8(pr,s1, s2, s3, s4, s5, s6, s7, s16, s17, s18, s19, s20, s21, s22, s8, s9, s10, s11, s12, s13, s14, s15);
		gen22_8(pr,s1, s2, s3, s4, s5, s6, s7, s17, s18, s19, s20, s21, s22, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen22_8(pr,s1, s2, s3, s4, s5, s6, s7, s18, s19, s20, s21, s22, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen22_8(pr,s1, s2, s3, s4, s5, s6, s7, s19, s20, s21, s22, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen22_8(pr,s1, s2, s3, s4, s5, s6, s7, s20, s21, s22, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen22_8(pr,s1, s2, s3, s4, s5, s6, s7, s21, s22, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen22_8(pr,s1, s2, s3, s4, s5, s6, s7, s22, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
	}

	private static final void gen22_8(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22){
		gen22_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen22_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s9);
		gen22_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s9, s10);
		gen22_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s9, s10, s11);
		gen22_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s9, s10, s11, s12);
		gen22_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s14, s15, s16, s17, s18, s19, s20, s21, s22, s9, s10, s11, s12, s13);
		gen22_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s15, s16, s17, s18, s19, s20, s21, s22, s9, s10, s11, s12, s13, s14);
		gen22_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s16, s17, s18, s19, s20, s21, s22, s9, s10, s11, s12, s13, s14, s15);
		gen22_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s17, s18, s19, s20, s21, s22, s9, s10, s11, s12, s13, s14, s15, s16);
		gen22_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s18, s19, s20, s21, s22, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen22_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s19, s20, s21, s22, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen22_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s20, s21, s22, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen22_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s21, s22, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen22_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s22, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
	}

	private static final void gen22_9(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22){
		gen22_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen22_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s10);
		gen22_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s10, s11);
		gen22_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s10, s11, s12);
		gen22_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s14, s15, s16, s17, s18, s19, s20, s21, s22, s10, s11, s12, s13);
		gen22_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s15, s16, s17, s18, s19, s20, s21, s22, s10, s11, s12, s13, s14);
		gen22_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s16, s17, s18, s19, s20, s21, s22, s10, s11, s12, s13, s14, s15);
		gen22_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s17, s18, s19, s20, s21, s22, s10, s11, s12, s13, s14, s15, s16);
		gen22_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s18, s19, s20, s21, s22, s10, s11, s12, s13, s14, s15, s16, s17);
		gen22_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s19, s20, s21, s22, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen22_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s20, s21, s22, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen22_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s21, s22, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen22_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s22, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
	}

	private static final void gen22_10(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22){
		gen22_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen22_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s11);
		gen22_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s11, s12);
		gen22_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s14, s15, s16, s17, s18, s19, s20, s21, s22, s11, s12, s13);
		gen22_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s15, s16, s17, s18, s19, s20, s21, s22, s11, s12, s13, s14);
		gen22_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s16, s17, s18, s19, s20, s21, s22, s11, s12, s13, s14, s15);
		gen22_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s17, s18, s19, s20, s21, s22, s11, s12, s13, s14, s15, s16);
		gen22_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s18, s19, s20, s21, s22, s11, s12, s13, s14, s15, s16, s17);
		gen22_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s19, s20, s21, s22, s11, s12, s13, s14, s15, s16, s17, s18);
		gen22_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s20, s21, s22, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen22_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s21, s22, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen22_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s22, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
	}

	private static final void gen22_11(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22){
		gen22_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen22_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s12);
		gen22_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s14, s15, s16, s17, s18, s19, s20, s21, s22, s12, s13);
		gen22_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s15, s16, s17, s18, s19, s20, s21, s22, s12, s13, s14);
		gen22_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s16, s17, s18, s19, s20, s21, s22, s12, s13, s14, s15);
		gen22_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s17, s18, s19, s20, s21, s22, s12, s13, s14, s15, s16);
		gen22_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s18, s19, s20, s21, s22, s12, s13, s14, s15, s16, s17);
		gen22_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s19, s20, s21, s22, s12, s13, s14, s15, s16, s17, s18);
		gen22_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s20, s21, s22, s12, s13, s14, s15, s16, s17, s18, s19);
		gen22_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s21, s22, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen22_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s22, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
	}

	private static final void gen22_12(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22){
		gen22_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen22_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s14, s15, s16, s17, s18, s19, s20, s21, s22, s13);
		gen22_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s15, s16, s17, s18, s19, s20, s21, s22, s13, s14);
		gen22_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s16, s17, s18, s19, s20, s21, s22, s13, s14, s15);
		gen22_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s17, s18, s19, s20, s21, s22, s13, s14, s15, s16);
		gen22_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s18, s19, s20, s21, s22, s13, s14, s15, s16, s17);
		gen22_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s19, s20, s21, s22, s13, s14, s15, s16, s17, s18);
		gen22_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s20, s21, s22, s13, s14, s15, s16, s17, s18, s19);
		gen22_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s21, s22, s13, s14, s15, s16, s17, s18, s19, s20);
		gen22_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s22, s13, s14, s15, s16, s17, s18, s19, s20, s21);
	}

	private static final void gen22_13(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22){
		gen22_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen22_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s15, s16, s17, s18, s19, s20, s21, s22, s14);
		gen22_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s16, s17, s18, s19, s20, s21, s22, s14, s15);
		gen22_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s17, s18, s19, s20, s21, s22, s14, s15, s16);
		gen22_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s18, s19, s20, s21, s22, s14, s15, s16, s17);
		gen22_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s19, s20, s21, s22, s14, s15, s16, s17, s18);
		gen22_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s20, s21, s22, s14, s15, s16, s17, s18, s19);
		gen22_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s21, s22, s14, s15, s16, s17, s18, s19, s20);
		gen22_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s22, s14, s15, s16, s17, s18, s19, s20, s21);
	}

	private static final void gen22_14(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22){
		gen22_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen22_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s16, s17, s18, s19, s20, s21, s22, s15);
		gen22_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s17, s18, s19, s20, s21, s22, s15, s16);
		gen22_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s18, s19, s20, s21, s22, s15, s16, s17);
		gen22_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s19, s20, s21, s22, s15, s16, s17, s18);
		gen22_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s20, s21, s22, s15, s16, s17, s18, s19);
		gen22_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s21, s22, s15, s16, s17, s18, s19, s20);
		gen22_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s22, s15, s16, s17, s18, s19, s20, s21);
	}

	private static final void gen22_15(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22){
		gen22_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen22_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s17, s18, s19, s20, s21, s22, s16);
		gen22_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s18, s19, s20, s21, s22, s16, s17);
		gen22_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s19, s20, s21, s22, s16, s17, s18);
		gen22_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s20, s21, s22, s16, s17, s18, s19);
		gen22_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s21, s22, s16, s17, s18, s19, s20);
		gen22_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s22, s16, s17, s18, s19, s20, s21);
	}

	private static final void gen22_16(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22){
		gen22_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen22_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s18, s19, s20, s21, s22, s17);
		gen22_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s19, s20, s21, s22, s17, s18);
		gen22_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s20, s21, s22, s17, s18, s19);
		gen22_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s21, s22, s17, s18, s19, s20);
		gen22_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s22, s17, s18, s19, s20, s21);
	}

	private static final void gen22_17(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22){
		gen22_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen22_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s19, s20, s21, s22, s18);
		gen22_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s20, s21, s22, s18, s19);
		gen22_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s21, s22, s18, s19, s20);
		gen22_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s22, s18, s19, s20, s21);
	}

	private static final void gen22_18(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22){
		gen22_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen22_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s20, s21, s22, s19);
		gen22_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s21, s22, s19, s20);
		gen22_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s22, s19, s20, s21);
	}

	private static final void gen22_19(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22){
		gen22_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen22_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s21, s22, s20);
		gen22_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s22, s20, s21);
	}

	private static final void gen22_20(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22){
		pr.recieve22(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		pr.recieve22(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s22, s21);
	}

	private static final void gen23_0(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23){
		gen23_1(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen23_1(pr,s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s1);
		gen23_1(pr,s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s1, s2);
		gen23_1(pr,s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s1, s2, s3);
		gen23_1(pr,s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s1, s2, s3, s4);
		gen23_1(pr,s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s1, s2, s3, s4, s5);
		gen23_1(pr,s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s1, s2, s3, s4, s5, s6);
		gen23_1(pr,s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s1, s2, s3, s4, s5, s6, s7);
		gen23_1(pr,s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s1, s2, s3, s4, s5, s6, s7, s8);
		gen23_1(pr,s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s1, s2, s3, s4, s5, s6, s7, s8, s9);
		gen23_1(pr,s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen23_1(pr,s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen23_1(pr,s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen23_1(pr,s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen23_1(pr,s15, s16, s17, s18, s19, s20, s21, s22, s23, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen23_1(pr,s16, s17, s18, s19, s20, s21, s22, s23, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen23_1(pr,s17, s18, s19, s20, s21, s22, s23, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen23_1(pr,s18, s19, s20, s21, s22, s23, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen23_1(pr,s19, s20, s21, s22, s23, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen23_1(pr,s20, s21, s22, s23, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen23_1(pr,s21, s22, s23, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen23_1(pr,s22, s23, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen23_1(pr,s23, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
	}

	private static final void gen23_1(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23){
		gen23_2(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen23_2(pr,s1, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s2);
		gen23_2(pr,s1, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s2, s3);
		gen23_2(pr,s1, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s2, s3, s4);
		gen23_2(pr,s1, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s2, s3, s4, s5);
		gen23_2(pr,s1, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s2, s3, s4, s5, s6);
		gen23_2(pr,s1, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s2, s3, s4, s5, s6, s7);
		gen23_2(pr,s1, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s2, s3, s4, s5, s6, s7, s8);
		gen23_2(pr,s1, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s2, s3, s4, s5, s6, s7, s8, s9);
		gen23_2(pr,s1, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen23_2(pr,s1, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen23_2(pr,s1, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen23_2(pr,s1, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen23_2(pr,s1, s15, s16, s17, s18, s19, s20, s21, s22, s23, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen23_2(pr,s1, s16, s17, s18, s19, s20, s21, s22, s23, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen23_2(pr,s1, s17, s18, s19, s20, s21, s22, s23, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen23_2(pr,s1, s18, s19, s20, s21, s22, s23, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen23_2(pr,s1, s19, s20, s21, s22, s23, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen23_2(pr,s1, s20, s21, s22, s23, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen23_2(pr,s1, s21, s22, s23, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen23_2(pr,s1, s22, s23, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen23_2(pr,s1, s23, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
	}

	private static final void gen23_2(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23){
		gen23_3(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen23_3(pr,s1, s2, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s3);
		gen23_3(pr,s1, s2, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s3, s4);
		gen23_3(pr,s1, s2, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s3, s4, s5);
		gen23_3(pr,s1, s2, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s3, s4, s5, s6);
		gen23_3(pr,s1, s2, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s3, s4, s5, s6, s7);
		gen23_3(pr,s1, s2, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s3, s4, s5, s6, s7, s8);
		gen23_3(pr,s1, s2, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s3, s4, s5, s6, s7, s8, s9);
		gen23_3(pr,s1, s2, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s3, s4, s5, s6, s7, s8, s9, s10);
		gen23_3(pr,s1, s2, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen23_3(pr,s1, s2, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen23_3(pr,s1, s2, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen23_3(pr,s1, s2, s15, s16, s17, s18, s19, s20, s21, s22, s23, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen23_3(pr,s1, s2, s16, s17, s18, s19, s20, s21, s22, s23, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen23_3(pr,s1, s2, s17, s18, s19, s20, s21, s22, s23, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen23_3(pr,s1, s2, s18, s19, s20, s21, s22, s23, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen23_3(pr,s1, s2, s19, s20, s21, s22, s23, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen23_3(pr,s1, s2, s20, s21, s22, s23, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen23_3(pr,s1, s2, s21, s22, s23, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen23_3(pr,s1, s2, s22, s23, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen23_3(pr,s1, s2, s23, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
	}

	private static final void gen23_3(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23){
		gen23_4(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen23_4(pr,s1, s2, s3, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s4);
		gen23_4(pr,s1, s2, s3, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s4, s5);
		gen23_4(pr,s1, s2, s3, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s4, s5, s6);
		gen23_4(pr,s1, s2, s3, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s4, s5, s6, s7);
		gen23_4(pr,s1, s2, s3, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s4, s5, s6, s7, s8);
		gen23_4(pr,s1, s2, s3, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s4, s5, s6, s7, s8, s9);
		gen23_4(pr,s1, s2, s3, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s4, s5, s6, s7, s8, s9, s10);
		gen23_4(pr,s1, s2, s3, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s4, s5, s6, s7, s8, s9, s10, s11);
		gen23_4(pr,s1, s2, s3, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen23_4(pr,s1, s2, s3, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen23_4(pr,s1, s2, s3, s15, s16, s17, s18, s19, s20, s21, s22, s23, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen23_4(pr,s1, s2, s3, s16, s17, s18, s19, s20, s21, s22, s23, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen23_4(pr,s1, s2, s3, s17, s18, s19, s20, s21, s22, s23, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen23_4(pr,s1, s2, s3, s18, s19, s20, s21, s22, s23, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen23_4(pr,s1, s2, s3, s19, s20, s21, s22, s23, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen23_4(pr,s1, s2, s3, s20, s21, s22, s23, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen23_4(pr,s1, s2, s3, s21, s22, s23, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen23_4(pr,s1, s2, s3, s22, s23, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen23_4(pr,s1, s2, s3, s23, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
	}

	private static final void gen23_4(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23){
		gen23_5(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen23_5(pr,s1, s2, s3, s4, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s5);
		gen23_5(pr,s1, s2, s3, s4, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s5, s6);
		gen23_5(pr,s1, s2, s3, s4, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s5, s6, s7);
		gen23_5(pr,s1, s2, s3, s4, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s5, s6, s7, s8);
		gen23_5(pr,s1, s2, s3, s4, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s5, s6, s7, s8, s9);
		gen23_5(pr,s1, s2, s3, s4, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s5, s6, s7, s8, s9, s10);
		gen23_5(pr,s1, s2, s3, s4, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s5, s6, s7, s8, s9, s10, s11);
		gen23_5(pr,s1, s2, s3, s4, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s5, s6, s7, s8, s9, s10, s11, s12);
		gen23_5(pr,s1, s2, s3, s4, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen23_5(pr,s1, s2, s3, s4, s15, s16, s17, s18, s19, s20, s21, s22, s23, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen23_5(pr,s1, s2, s3, s4, s16, s17, s18, s19, s20, s21, s22, s23, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen23_5(pr,s1, s2, s3, s4, s17, s18, s19, s20, s21, s22, s23, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen23_5(pr,s1, s2, s3, s4, s18, s19, s20, s21, s22, s23, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen23_5(pr,s1, s2, s3, s4, s19, s20, s21, s22, s23, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen23_5(pr,s1, s2, s3, s4, s20, s21, s22, s23, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen23_5(pr,s1, s2, s3, s4, s21, s22, s23, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen23_5(pr,s1, s2, s3, s4, s22, s23, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen23_5(pr,s1, s2, s3, s4, s23, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
	}

	private static final void gen23_5(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23){
		gen23_6(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen23_6(pr,s1, s2, s3, s4, s5, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s6);
		gen23_6(pr,s1, s2, s3, s4, s5, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s6, s7);
		gen23_6(pr,s1, s2, s3, s4, s5, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s6, s7, s8);
		gen23_6(pr,s1, s2, s3, s4, s5, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s6, s7, s8, s9);
		gen23_6(pr,s1, s2, s3, s4, s5, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s6, s7, s8, s9, s10);
		gen23_6(pr,s1, s2, s3, s4, s5, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s6, s7, s8, s9, s10, s11);
		gen23_6(pr,s1, s2, s3, s4, s5, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s6, s7, s8, s9, s10, s11, s12);
		gen23_6(pr,s1, s2, s3, s4, s5, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s6, s7, s8, s9, s10, s11, s12, s13);
		gen23_6(pr,s1, s2, s3, s4, s5, s15, s16, s17, s18, s19, s20, s21, s22, s23, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen23_6(pr,s1, s2, s3, s4, s5, s16, s17, s18, s19, s20, s21, s22, s23, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen23_6(pr,s1, s2, s3, s4, s5, s17, s18, s19, s20, s21, s22, s23, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen23_6(pr,s1, s2, s3, s4, s5, s18, s19, s20, s21, s22, s23, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen23_6(pr,s1, s2, s3, s4, s5, s19, s20, s21, s22, s23, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen23_6(pr,s1, s2, s3, s4, s5, s20, s21, s22, s23, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen23_6(pr,s1, s2, s3, s4, s5, s21, s22, s23, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen23_6(pr,s1, s2, s3, s4, s5, s22, s23, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen23_6(pr,s1, s2, s3, s4, s5, s23, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
	}

	private static final void gen23_6(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23){
		gen23_7(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen23_7(pr,s1, s2, s3, s4, s5, s6, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s7);
		gen23_7(pr,s1, s2, s3, s4, s5, s6, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s7, s8);
		gen23_7(pr,s1, s2, s3, s4, s5, s6, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s7, s8, s9);
		gen23_7(pr,s1, s2, s3, s4, s5, s6, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s7, s8, s9, s10);
		gen23_7(pr,s1, s2, s3, s4, s5, s6, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s7, s8, s9, s10, s11);
		gen23_7(pr,s1, s2, s3, s4, s5, s6, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s7, s8, s9, s10, s11, s12);
		gen23_7(pr,s1, s2, s3, s4, s5, s6, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s7, s8, s9, s10, s11, s12, s13);
		gen23_7(pr,s1, s2, s3, s4, s5, s6, s15, s16, s17, s18, s19, s20, s21, s22, s23, s7, s8, s9, s10, s11, s12, s13, s14);
		gen23_7(pr,s1, s2, s3, s4, s5, s6, s16, s17, s18, s19, s20, s21, s22, s23, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen23_7(pr,s1, s2, s3, s4, s5, s6, s17, s18, s19, s20, s21, s22, s23, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen23_7(pr,s1, s2, s3, s4, s5, s6, s18, s19, s20, s21, s22, s23, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen23_7(pr,s1, s2, s3, s4, s5, s6, s19, s20, s21, s22, s23, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen23_7(pr,s1, s2, s3, s4, s5, s6, s20, s21, s22, s23, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen23_7(pr,s1, s2, s3, s4, s5, s6, s21, s22, s23, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen23_7(pr,s1, s2, s3, s4, s5, s6, s22, s23, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen23_7(pr,s1, s2, s3, s4, s5, s6, s23, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
	}

	private static final void gen23_7(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23){
		gen23_8(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen23_8(pr,s1, s2, s3, s4, s5, s6, s7, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s8);
		gen23_8(pr,s1, s2, s3, s4, s5, s6, s7, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s8, s9);
		gen23_8(pr,s1, s2, s3, s4, s5, s6, s7, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s8, s9, s10);
		gen23_8(pr,s1, s2, s3, s4, s5, s6, s7, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s8, s9, s10, s11);
		gen23_8(pr,s1, s2, s3, s4, s5, s6, s7, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s8, s9, s10, s11, s12);
		gen23_8(pr,s1, s2, s3, s4, s5, s6, s7, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s8, s9, s10, s11, s12, s13);
		gen23_8(pr,s1, s2, s3, s4, s5, s6, s7, s15, s16, s17, s18, s19, s20, s21, s22, s23, s8, s9, s10, s11, s12, s13, s14);
		gen23_8(pr,s1, s2, s3, s4, s5, s6, s7, s16, s17, s18, s19, s20, s21, s22, s23, s8, s9, s10, s11, s12, s13, s14, s15);
		gen23_8(pr,s1, s2, s3, s4, s5, s6, s7, s17, s18, s19, s20, s21, s22, s23, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen23_8(pr,s1, s2, s3, s4, s5, s6, s7, s18, s19, s20, s21, s22, s23, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen23_8(pr,s1, s2, s3, s4, s5, s6, s7, s19, s20, s21, s22, s23, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen23_8(pr,s1, s2, s3, s4, s5, s6, s7, s20, s21, s22, s23, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen23_8(pr,s1, s2, s3, s4, s5, s6, s7, s21, s22, s23, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen23_8(pr,s1, s2, s3, s4, s5, s6, s7, s22, s23, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen23_8(pr,s1, s2, s3, s4, s5, s6, s7, s23, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
	}

	private static final void gen23_8(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23){
		gen23_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen23_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s9);
		gen23_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s9, s10);
		gen23_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s9, s10, s11);
		gen23_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s9, s10, s11, s12);
		gen23_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s9, s10, s11, s12, s13);
		gen23_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s15, s16, s17, s18, s19, s20, s21, s22, s23, s9, s10, s11, s12, s13, s14);
		gen23_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s16, s17, s18, s19, s20, s21, s22, s23, s9, s10, s11, s12, s13, s14, s15);
		gen23_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s17, s18, s19, s20, s21, s22, s23, s9, s10, s11, s12, s13, s14, s15, s16);
		gen23_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s18, s19, s20, s21, s22, s23, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen23_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s19, s20, s21, s22, s23, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen23_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s20, s21, s22, s23, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen23_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s21, s22, s23, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen23_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s22, s23, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen23_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s23, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
	}

	private static final void gen23_9(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23){
		gen23_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen23_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s10);
		gen23_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s10, s11);
		gen23_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s10, s11, s12);
		gen23_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s10, s11, s12, s13);
		gen23_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s15, s16, s17, s18, s19, s20, s21, s22, s23, s10, s11, s12, s13, s14);
		gen23_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s16, s17, s18, s19, s20, s21, s22, s23, s10, s11, s12, s13, s14, s15);
		gen23_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s17, s18, s19, s20, s21, s22, s23, s10, s11, s12, s13, s14, s15, s16);
		gen23_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s18, s19, s20, s21, s22, s23, s10, s11, s12, s13, s14, s15, s16, s17);
		gen23_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s19, s20, s21, s22, s23, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen23_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s20, s21, s22, s23, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen23_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s21, s22, s23, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen23_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s22, s23, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen23_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s23, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
	}

	private static final void gen23_10(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23){
		gen23_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen23_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s11);
		gen23_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s11, s12);
		gen23_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s11, s12, s13);
		gen23_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s15, s16, s17, s18, s19, s20, s21, s22, s23, s11, s12, s13, s14);
		gen23_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s16, s17, s18, s19, s20, s21, s22, s23, s11, s12, s13, s14, s15);
		gen23_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s17, s18, s19, s20, s21, s22, s23, s11, s12, s13, s14, s15, s16);
		gen23_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s18, s19, s20, s21, s22, s23, s11, s12, s13, s14, s15, s16, s17);
		gen23_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s19, s20, s21, s22, s23, s11, s12, s13, s14, s15, s16, s17, s18);
		gen23_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s20, s21, s22, s23, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen23_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s21, s22, s23, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen23_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s22, s23, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen23_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s23, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
	}

	private static final void gen23_11(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23){
		gen23_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen23_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s12);
		gen23_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s12, s13);
		gen23_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s15, s16, s17, s18, s19, s20, s21, s22, s23, s12, s13, s14);
		gen23_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s16, s17, s18, s19, s20, s21, s22, s23, s12, s13, s14, s15);
		gen23_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s17, s18, s19, s20, s21, s22, s23, s12, s13, s14, s15, s16);
		gen23_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s18, s19, s20, s21, s22, s23, s12, s13, s14, s15, s16, s17);
		gen23_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s19, s20, s21, s22, s23, s12, s13, s14, s15, s16, s17, s18);
		gen23_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s20, s21, s22, s23, s12, s13, s14, s15, s16, s17, s18, s19);
		gen23_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s21, s22, s23, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen23_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s22, s23, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen23_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s23, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
	}

	private static final void gen23_12(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23){
		gen23_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen23_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s13);
		gen23_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s15, s16, s17, s18, s19, s20, s21, s22, s23, s13, s14);
		gen23_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s16, s17, s18, s19, s20, s21, s22, s23, s13, s14, s15);
		gen23_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s17, s18, s19, s20, s21, s22, s23, s13, s14, s15, s16);
		gen23_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s18, s19, s20, s21, s22, s23, s13, s14, s15, s16, s17);
		gen23_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s19, s20, s21, s22, s23, s13, s14, s15, s16, s17, s18);
		gen23_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s20, s21, s22, s23, s13, s14, s15, s16, s17, s18, s19);
		gen23_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s21, s22, s23, s13, s14, s15, s16, s17, s18, s19, s20);
		gen23_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s22, s23, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen23_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s23, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
	}

	private static final void gen23_13(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23){
		gen23_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen23_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s15, s16, s17, s18, s19, s20, s21, s22, s23, s14);
		gen23_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s16, s17, s18, s19, s20, s21, s22, s23, s14, s15);
		gen23_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s17, s18, s19, s20, s21, s22, s23, s14, s15, s16);
		gen23_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s18, s19, s20, s21, s22, s23, s14, s15, s16, s17);
		gen23_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s19, s20, s21, s22, s23, s14, s15, s16, s17, s18);
		gen23_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s20, s21, s22, s23, s14, s15, s16, s17, s18, s19);
		gen23_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s21, s22, s23, s14, s15, s16, s17, s18, s19, s20);
		gen23_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s22, s23, s14, s15, s16, s17, s18, s19, s20, s21);
		gen23_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s23, s14, s15, s16, s17, s18, s19, s20, s21, s22);
	}

	private static final void gen23_14(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23){
		gen23_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen23_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s16, s17, s18, s19, s20, s21, s22, s23, s15);
		gen23_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s17, s18, s19, s20, s21, s22, s23, s15, s16);
		gen23_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s18, s19, s20, s21, s22, s23, s15, s16, s17);
		gen23_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s19, s20, s21, s22, s23, s15, s16, s17, s18);
		gen23_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s20, s21, s22, s23, s15, s16, s17, s18, s19);
		gen23_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s21, s22, s23, s15, s16, s17, s18, s19, s20);
		gen23_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s22, s23, s15, s16, s17, s18, s19, s20, s21);
		gen23_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s23, s15, s16, s17, s18, s19, s20, s21, s22);
	}

	private static final void gen23_15(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23){
		gen23_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen23_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s17, s18, s19, s20, s21, s22, s23, s16);
		gen23_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s18, s19, s20, s21, s22, s23, s16, s17);
		gen23_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s19, s20, s21, s22, s23, s16, s17, s18);
		gen23_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s20, s21, s22, s23, s16, s17, s18, s19);
		gen23_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s21, s22, s23, s16, s17, s18, s19, s20);
		gen23_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s22, s23, s16, s17, s18, s19, s20, s21);
		gen23_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s23, s16, s17, s18, s19, s20, s21, s22);
	}

	private static final void gen23_16(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23){
		gen23_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen23_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s18, s19, s20, s21, s22, s23, s17);
		gen23_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s19, s20, s21, s22, s23, s17, s18);
		gen23_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s20, s21, s22, s23, s17, s18, s19);
		gen23_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s21, s22, s23, s17, s18, s19, s20);
		gen23_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s22, s23, s17, s18, s19, s20, s21);
		gen23_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s23, s17, s18, s19, s20, s21, s22);
	}

	private static final void gen23_17(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23){
		gen23_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen23_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s19, s20, s21, s22, s23, s18);
		gen23_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s20, s21, s22, s23, s18, s19);
		gen23_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s21, s22, s23, s18, s19, s20);
		gen23_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s22, s23, s18, s19, s20, s21);
		gen23_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s23, s18, s19, s20, s21, s22);
	}

	private static final void gen23_18(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23){
		gen23_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen23_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s20, s21, s22, s23, s19);
		gen23_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s21, s22, s23, s19, s20);
		gen23_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s22, s23, s19, s20, s21);
		gen23_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s23, s19, s20, s21, s22);
	}

	private static final void gen23_19(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23){
		gen23_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen23_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s21, s22, s23, s20);
		gen23_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s22, s23, s20, s21);
		gen23_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s23, s20, s21, s22);
	}

	private static final void gen23_20(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23){
		gen23_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen23_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s22, s23, s21);
		gen23_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s23, s21, s22);
	}

	private static final void gen23_21(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23){
		pr.recieve23(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		pr.recieve23(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s23, s22);
	}

	private static final void gen24_0(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24){
		gen24_1(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen24_1(pr,s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s1);
		gen24_1(pr,s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s1, s2);
		gen24_1(pr,s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s1, s2, s3);
		gen24_1(pr,s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s1, s2, s3, s4);
		gen24_1(pr,s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s1, s2, s3, s4, s5);
		gen24_1(pr,s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s1, s2, s3, s4, s5, s6);
		gen24_1(pr,s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s1, s2, s3, s4, s5, s6, s7);
		gen24_1(pr,s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s1, s2, s3, s4, s5, s6, s7, s8);
		gen24_1(pr,s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s1, s2, s3, s4, s5, s6, s7, s8, s9);
		gen24_1(pr,s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen24_1(pr,s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen24_1(pr,s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen24_1(pr,s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen24_1(pr,s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen24_1(pr,s16, s17, s18, s19, s20, s21, s22, s23, s24, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen24_1(pr,s17, s18, s19, s20, s21, s22, s23, s24, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen24_1(pr,s18, s19, s20, s21, s22, s23, s24, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen24_1(pr,s19, s20, s21, s22, s23, s24, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen24_1(pr,s20, s21, s22, s23, s24, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen24_1(pr,s21, s22, s23, s24, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen24_1(pr,s22, s23, s24, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen24_1(pr,s23, s24, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen24_1(pr,s24, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
	}

	private static final void gen24_1(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24){
		gen24_2(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen24_2(pr,s1, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s2);
		gen24_2(pr,s1, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s2, s3);
		gen24_2(pr,s1, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s2, s3, s4);
		gen24_2(pr,s1, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s2, s3, s4, s5);
		gen24_2(pr,s1, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s2, s3, s4, s5, s6);
		gen24_2(pr,s1, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s2, s3, s4, s5, s6, s7);
		gen24_2(pr,s1, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s2, s3, s4, s5, s6, s7, s8);
		gen24_2(pr,s1, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s2, s3, s4, s5, s6, s7, s8, s9);
		gen24_2(pr,s1, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen24_2(pr,s1, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen24_2(pr,s1, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen24_2(pr,s1, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen24_2(pr,s1, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen24_2(pr,s1, s16, s17, s18, s19, s20, s21, s22, s23, s24, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen24_2(pr,s1, s17, s18, s19, s20, s21, s22, s23, s24, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen24_2(pr,s1, s18, s19, s20, s21, s22, s23, s24, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen24_2(pr,s1, s19, s20, s21, s22, s23, s24, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen24_2(pr,s1, s20, s21, s22, s23, s24, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen24_2(pr,s1, s21, s22, s23, s24, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen24_2(pr,s1, s22, s23, s24, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen24_2(pr,s1, s23, s24, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen24_2(pr,s1, s24, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
	}

	private static final void gen24_2(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24){
		gen24_3(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen24_3(pr,s1, s2, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s3);
		gen24_3(pr,s1, s2, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s3, s4);
		gen24_3(pr,s1, s2, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s3, s4, s5);
		gen24_3(pr,s1, s2, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s3, s4, s5, s6);
		gen24_3(pr,s1, s2, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s3, s4, s5, s6, s7);
		gen24_3(pr,s1, s2, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s3, s4, s5, s6, s7, s8);
		gen24_3(pr,s1, s2, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s3, s4, s5, s6, s7, s8, s9);
		gen24_3(pr,s1, s2, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s3, s4, s5, s6, s7, s8, s9, s10);
		gen24_3(pr,s1, s2, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen24_3(pr,s1, s2, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen24_3(pr,s1, s2, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen24_3(pr,s1, s2, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen24_3(pr,s1, s2, s16, s17, s18, s19, s20, s21, s22, s23, s24, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen24_3(pr,s1, s2, s17, s18, s19, s20, s21, s22, s23, s24, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen24_3(pr,s1, s2, s18, s19, s20, s21, s22, s23, s24, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen24_3(pr,s1, s2, s19, s20, s21, s22, s23, s24, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen24_3(pr,s1, s2, s20, s21, s22, s23, s24, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen24_3(pr,s1, s2, s21, s22, s23, s24, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen24_3(pr,s1, s2, s22, s23, s24, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen24_3(pr,s1, s2, s23, s24, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen24_3(pr,s1, s2, s24, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
	}

	private static final void gen24_3(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24){
		gen24_4(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen24_4(pr,s1, s2, s3, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s4);
		gen24_4(pr,s1, s2, s3, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s4, s5);
		gen24_4(pr,s1, s2, s3, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s4, s5, s6);
		gen24_4(pr,s1, s2, s3, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s4, s5, s6, s7);
		gen24_4(pr,s1, s2, s3, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s4, s5, s6, s7, s8);
		gen24_4(pr,s1, s2, s3, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s4, s5, s6, s7, s8, s9);
		gen24_4(pr,s1, s2, s3, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s4, s5, s6, s7, s8, s9, s10);
		gen24_4(pr,s1, s2, s3, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s4, s5, s6, s7, s8, s9, s10, s11);
		gen24_4(pr,s1, s2, s3, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen24_4(pr,s1, s2, s3, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen24_4(pr,s1, s2, s3, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen24_4(pr,s1, s2, s3, s16, s17, s18, s19, s20, s21, s22, s23, s24, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen24_4(pr,s1, s2, s3, s17, s18, s19, s20, s21, s22, s23, s24, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen24_4(pr,s1, s2, s3, s18, s19, s20, s21, s22, s23, s24, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen24_4(pr,s1, s2, s3, s19, s20, s21, s22, s23, s24, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen24_4(pr,s1, s2, s3, s20, s21, s22, s23, s24, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen24_4(pr,s1, s2, s3, s21, s22, s23, s24, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen24_4(pr,s1, s2, s3, s22, s23, s24, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen24_4(pr,s1, s2, s3, s23, s24, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen24_4(pr,s1, s2, s3, s24, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
	}

	private static final void gen24_4(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24){
		gen24_5(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen24_5(pr,s1, s2, s3, s4, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s5);
		gen24_5(pr,s1, s2, s3, s4, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s5, s6);
		gen24_5(pr,s1, s2, s3, s4, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s5, s6, s7);
		gen24_5(pr,s1, s2, s3, s4, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s5, s6, s7, s8);
		gen24_5(pr,s1, s2, s3, s4, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s5, s6, s7, s8, s9);
		gen24_5(pr,s1, s2, s3, s4, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s5, s6, s7, s8, s9, s10);
		gen24_5(pr,s1, s2, s3, s4, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s5, s6, s7, s8, s9, s10, s11);
		gen24_5(pr,s1, s2, s3, s4, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s5, s6, s7, s8, s9, s10, s11, s12);
		gen24_5(pr,s1, s2, s3, s4, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen24_5(pr,s1, s2, s3, s4, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen24_5(pr,s1, s2, s3, s4, s16, s17, s18, s19, s20, s21, s22, s23, s24, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen24_5(pr,s1, s2, s3, s4, s17, s18, s19, s20, s21, s22, s23, s24, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen24_5(pr,s1, s2, s3, s4, s18, s19, s20, s21, s22, s23, s24, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen24_5(pr,s1, s2, s3, s4, s19, s20, s21, s22, s23, s24, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen24_5(pr,s1, s2, s3, s4, s20, s21, s22, s23, s24, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen24_5(pr,s1, s2, s3, s4, s21, s22, s23, s24, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen24_5(pr,s1, s2, s3, s4, s22, s23, s24, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen24_5(pr,s1, s2, s3, s4, s23, s24, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen24_5(pr,s1, s2, s3, s4, s24, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
	}

	private static final void gen24_5(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24){
		gen24_6(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen24_6(pr,s1, s2, s3, s4, s5, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s6);
		gen24_6(pr,s1, s2, s3, s4, s5, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s6, s7);
		gen24_6(pr,s1, s2, s3, s4, s5, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s6, s7, s8);
		gen24_6(pr,s1, s2, s3, s4, s5, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s6, s7, s8, s9);
		gen24_6(pr,s1, s2, s3, s4, s5, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s6, s7, s8, s9, s10);
		gen24_6(pr,s1, s2, s3, s4, s5, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s6, s7, s8, s9, s10, s11);
		gen24_6(pr,s1, s2, s3, s4, s5, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s6, s7, s8, s9, s10, s11, s12);
		gen24_6(pr,s1, s2, s3, s4, s5, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s6, s7, s8, s9, s10, s11, s12, s13);
		gen24_6(pr,s1, s2, s3, s4, s5, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen24_6(pr,s1, s2, s3, s4, s5, s16, s17, s18, s19, s20, s21, s22, s23, s24, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen24_6(pr,s1, s2, s3, s4, s5, s17, s18, s19, s20, s21, s22, s23, s24, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen24_6(pr,s1, s2, s3, s4, s5, s18, s19, s20, s21, s22, s23, s24, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen24_6(pr,s1, s2, s3, s4, s5, s19, s20, s21, s22, s23, s24, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen24_6(pr,s1, s2, s3, s4, s5, s20, s21, s22, s23, s24, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen24_6(pr,s1, s2, s3, s4, s5, s21, s22, s23, s24, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen24_6(pr,s1, s2, s3, s4, s5, s22, s23, s24, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen24_6(pr,s1, s2, s3, s4, s5, s23, s24, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen24_6(pr,s1, s2, s3, s4, s5, s24, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
	}

	private static final void gen24_6(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24){
		gen24_7(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen24_7(pr,s1, s2, s3, s4, s5, s6, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s7);
		gen24_7(pr,s1, s2, s3, s4, s5, s6, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s7, s8);
		gen24_7(pr,s1, s2, s3, s4, s5, s6, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s7, s8, s9);
		gen24_7(pr,s1, s2, s3, s4, s5, s6, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s7, s8, s9, s10);
		gen24_7(pr,s1, s2, s3, s4, s5, s6, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s7, s8, s9, s10, s11);
		gen24_7(pr,s1, s2, s3, s4, s5, s6, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s7, s8, s9, s10, s11, s12);
		gen24_7(pr,s1, s2, s3, s4, s5, s6, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s7, s8, s9, s10, s11, s12, s13);
		gen24_7(pr,s1, s2, s3, s4, s5, s6, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s7, s8, s9, s10, s11, s12, s13, s14);
		gen24_7(pr,s1, s2, s3, s4, s5, s6, s16, s17, s18, s19, s20, s21, s22, s23, s24, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen24_7(pr,s1, s2, s3, s4, s5, s6, s17, s18, s19, s20, s21, s22, s23, s24, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen24_7(pr,s1, s2, s3, s4, s5, s6, s18, s19, s20, s21, s22, s23, s24, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen24_7(pr,s1, s2, s3, s4, s5, s6, s19, s20, s21, s22, s23, s24, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen24_7(pr,s1, s2, s3, s4, s5, s6, s20, s21, s22, s23, s24, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen24_7(pr,s1, s2, s3, s4, s5, s6, s21, s22, s23, s24, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen24_7(pr,s1, s2, s3, s4, s5, s6, s22, s23, s24, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen24_7(pr,s1, s2, s3, s4, s5, s6, s23, s24, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen24_7(pr,s1, s2, s3, s4, s5, s6, s24, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
	}

	private static final void gen24_7(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24){
		gen24_8(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen24_8(pr,s1, s2, s3, s4, s5, s6, s7, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s8);
		gen24_8(pr,s1, s2, s3, s4, s5, s6, s7, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s8, s9);
		gen24_8(pr,s1, s2, s3, s4, s5, s6, s7, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s8, s9, s10);
		gen24_8(pr,s1, s2, s3, s4, s5, s6, s7, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s8, s9, s10, s11);
		gen24_8(pr,s1, s2, s3, s4, s5, s6, s7, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s8, s9, s10, s11, s12);
		gen24_8(pr,s1, s2, s3, s4, s5, s6, s7, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s8, s9, s10, s11, s12, s13);
		gen24_8(pr,s1, s2, s3, s4, s5, s6, s7, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s8, s9, s10, s11, s12, s13, s14);
		gen24_8(pr,s1, s2, s3, s4, s5, s6, s7, s16, s17, s18, s19, s20, s21, s22, s23, s24, s8, s9, s10, s11, s12, s13, s14, s15);
		gen24_8(pr,s1, s2, s3, s4, s5, s6, s7, s17, s18, s19, s20, s21, s22, s23, s24, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen24_8(pr,s1, s2, s3, s4, s5, s6, s7, s18, s19, s20, s21, s22, s23, s24, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen24_8(pr,s1, s2, s3, s4, s5, s6, s7, s19, s20, s21, s22, s23, s24, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen24_8(pr,s1, s2, s3, s4, s5, s6, s7, s20, s21, s22, s23, s24, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen24_8(pr,s1, s2, s3, s4, s5, s6, s7, s21, s22, s23, s24, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen24_8(pr,s1, s2, s3, s4, s5, s6, s7, s22, s23, s24, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen24_8(pr,s1, s2, s3, s4, s5, s6, s7, s23, s24, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen24_8(pr,s1, s2, s3, s4, s5, s6, s7, s24, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
	}

	private static final void gen24_8(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24){
		gen24_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen24_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s9);
		gen24_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s9, s10);
		gen24_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s9, s10, s11);
		gen24_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s9, s10, s11, s12);
		gen24_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s9, s10, s11, s12, s13);
		gen24_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s9, s10, s11, s12, s13, s14);
		gen24_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s16, s17, s18, s19, s20, s21, s22, s23, s24, s9, s10, s11, s12, s13, s14, s15);
		gen24_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s17, s18, s19, s20, s21, s22, s23, s24, s9, s10, s11, s12, s13, s14, s15, s16);
		gen24_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s18, s19, s20, s21, s22, s23, s24, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen24_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s19, s20, s21, s22, s23, s24, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen24_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s20, s21, s22, s23, s24, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen24_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s21, s22, s23, s24, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen24_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s22, s23, s24, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen24_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s23, s24, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen24_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s24, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
	}

	private static final void gen24_9(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24){
		gen24_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen24_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s10);
		gen24_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s10, s11);
		gen24_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s10, s11, s12);
		gen24_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s10, s11, s12, s13);
		gen24_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s10, s11, s12, s13, s14);
		gen24_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s16, s17, s18, s19, s20, s21, s22, s23, s24, s10, s11, s12, s13, s14, s15);
		gen24_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s17, s18, s19, s20, s21, s22, s23, s24, s10, s11, s12, s13, s14, s15, s16);
		gen24_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s18, s19, s20, s21, s22, s23, s24, s10, s11, s12, s13, s14, s15, s16, s17);
		gen24_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s19, s20, s21, s22, s23, s24, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen24_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s20, s21, s22, s23, s24, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen24_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s21, s22, s23, s24, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen24_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s22, s23, s24, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen24_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s23, s24, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen24_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s24, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
	}

	private static final void gen24_10(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24){
		gen24_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen24_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s11);
		gen24_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s11, s12);
		gen24_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s11, s12, s13);
		gen24_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s11, s12, s13, s14);
		gen24_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s16, s17, s18, s19, s20, s21, s22, s23, s24, s11, s12, s13, s14, s15);
		gen24_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s17, s18, s19, s20, s21, s22, s23, s24, s11, s12, s13, s14, s15, s16);
		gen24_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s18, s19, s20, s21, s22, s23, s24, s11, s12, s13, s14, s15, s16, s17);
		gen24_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s19, s20, s21, s22, s23, s24, s11, s12, s13, s14, s15, s16, s17, s18);
		gen24_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s20, s21, s22, s23, s24, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen24_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s21, s22, s23, s24, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen24_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s22, s23, s24, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen24_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s23, s24, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen24_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s24, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
	}

	private static final void gen24_11(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24){
		gen24_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen24_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s12);
		gen24_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s12, s13);
		gen24_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s12, s13, s14);
		gen24_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s16, s17, s18, s19, s20, s21, s22, s23, s24, s12, s13, s14, s15);
		gen24_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s17, s18, s19, s20, s21, s22, s23, s24, s12, s13, s14, s15, s16);
		gen24_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s18, s19, s20, s21, s22, s23, s24, s12, s13, s14, s15, s16, s17);
		gen24_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s19, s20, s21, s22, s23, s24, s12, s13, s14, s15, s16, s17, s18);
		gen24_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s20, s21, s22, s23, s24, s12, s13, s14, s15, s16, s17, s18, s19);
		gen24_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s21, s22, s23, s24, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen24_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s22, s23, s24, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen24_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s23, s24, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen24_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s24, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
	}

	private static final void gen24_12(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24){
		gen24_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen24_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s13);
		gen24_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s13, s14);
		gen24_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s16, s17, s18, s19, s20, s21, s22, s23, s24, s13, s14, s15);
		gen24_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s17, s18, s19, s20, s21, s22, s23, s24, s13, s14, s15, s16);
		gen24_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s18, s19, s20, s21, s22, s23, s24, s13, s14, s15, s16, s17);
		gen24_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s19, s20, s21, s22, s23, s24, s13, s14, s15, s16, s17, s18);
		gen24_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s20, s21, s22, s23, s24, s13, s14, s15, s16, s17, s18, s19);
		gen24_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s21, s22, s23, s24, s13, s14, s15, s16, s17, s18, s19, s20);
		gen24_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s22, s23, s24, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen24_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s23, s24, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen24_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s24, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
	}

	private static final void gen24_13(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24){
		gen24_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen24_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s14);
		gen24_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s16, s17, s18, s19, s20, s21, s22, s23, s24, s14, s15);
		gen24_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s17, s18, s19, s20, s21, s22, s23, s24, s14, s15, s16);
		gen24_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s18, s19, s20, s21, s22, s23, s24, s14, s15, s16, s17);
		gen24_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s19, s20, s21, s22, s23, s24, s14, s15, s16, s17, s18);
		gen24_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s20, s21, s22, s23, s24, s14, s15, s16, s17, s18, s19);
		gen24_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s21, s22, s23, s24, s14, s15, s16, s17, s18, s19, s20);
		gen24_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s22, s23, s24, s14, s15, s16, s17, s18, s19, s20, s21);
		gen24_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s23, s24, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen24_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s24, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
	}

	private static final void gen24_14(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24){
		gen24_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen24_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s16, s17, s18, s19, s20, s21, s22, s23, s24, s15);
		gen24_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s17, s18, s19, s20, s21, s22, s23, s24, s15, s16);
		gen24_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s18, s19, s20, s21, s22, s23, s24, s15, s16, s17);
		gen24_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s19, s20, s21, s22, s23, s24, s15, s16, s17, s18);
		gen24_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s20, s21, s22, s23, s24, s15, s16, s17, s18, s19);
		gen24_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s21, s22, s23, s24, s15, s16, s17, s18, s19, s20);
		gen24_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s22, s23, s24, s15, s16, s17, s18, s19, s20, s21);
		gen24_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s23, s24, s15, s16, s17, s18, s19, s20, s21, s22);
		gen24_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s24, s15, s16, s17, s18, s19, s20, s21, s22, s23);
	}

	private static final void gen24_15(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24){
		gen24_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen24_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s17, s18, s19, s20, s21, s22, s23, s24, s16);
		gen24_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s18, s19, s20, s21, s22, s23, s24, s16, s17);
		gen24_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s19, s20, s21, s22, s23, s24, s16, s17, s18);
		gen24_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s20, s21, s22, s23, s24, s16, s17, s18, s19);
		gen24_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s21, s22, s23, s24, s16, s17, s18, s19, s20);
		gen24_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s22, s23, s24, s16, s17, s18, s19, s20, s21);
		gen24_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s23, s24, s16, s17, s18, s19, s20, s21, s22);
		gen24_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s24, s16, s17, s18, s19, s20, s21, s22, s23);
	}

	private static final void gen24_16(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24){
		gen24_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen24_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s18, s19, s20, s21, s22, s23, s24, s17);
		gen24_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s19, s20, s21, s22, s23, s24, s17, s18);
		gen24_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s20, s21, s22, s23, s24, s17, s18, s19);
		gen24_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s21, s22, s23, s24, s17, s18, s19, s20);
		gen24_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s22, s23, s24, s17, s18, s19, s20, s21);
		gen24_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s23, s24, s17, s18, s19, s20, s21, s22);
		gen24_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s24, s17, s18, s19, s20, s21, s22, s23);
	}

	private static final void gen24_17(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24){
		gen24_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen24_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s19, s20, s21, s22, s23, s24, s18);
		gen24_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s20, s21, s22, s23, s24, s18, s19);
		gen24_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s21, s22, s23, s24, s18, s19, s20);
		gen24_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s22, s23, s24, s18, s19, s20, s21);
		gen24_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s23, s24, s18, s19, s20, s21, s22);
		gen24_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s24, s18, s19, s20, s21, s22, s23);
	}

	private static final void gen24_18(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24){
		gen24_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen24_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s20, s21, s22, s23, s24, s19);
		gen24_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s21, s22, s23, s24, s19, s20);
		gen24_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s22, s23, s24, s19, s20, s21);
		gen24_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s23, s24, s19, s20, s21, s22);
		gen24_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s24, s19, s20, s21, s22, s23);
	}

	private static final void gen24_19(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24){
		gen24_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen24_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s21, s22, s23, s24, s20);
		gen24_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s22, s23, s24, s20, s21);
		gen24_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s23, s24, s20, s21, s22);
		gen24_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s24, s20, s21, s22, s23);
	}

	private static final void gen24_20(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24){
		gen24_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen24_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s22, s23, s24, s21);
		gen24_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s23, s24, s21, s22);
		gen24_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s24, s21, s22, s23);
	}

	private static final void gen24_21(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24){
		gen24_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen24_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s23, s24, s22);
		gen24_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s24, s22, s23);
	}

	private static final void gen24_22(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24){
		pr.recieve24(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		pr.recieve24(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s24, s23);
	}

	private static final void gen25_0(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25){
		gen25_1(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen25_1(pr,s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s1);
		gen25_1(pr,s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s1, s2);
		gen25_1(pr,s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s1, s2, s3);
		gen25_1(pr,s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s1, s2, s3, s4);
		gen25_1(pr,s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s1, s2, s3, s4, s5);
		gen25_1(pr,s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s1, s2, s3, s4, s5, s6);
		gen25_1(pr,s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s1, s2, s3, s4, s5, s6, s7);
		gen25_1(pr,s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s1, s2, s3, s4, s5, s6, s7, s8);
		gen25_1(pr,s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s1, s2, s3, s4, s5, s6, s7, s8, s9);
		gen25_1(pr,s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen25_1(pr,s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen25_1(pr,s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen25_1(pr,s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen25_1(pr,s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen25_1(pr,s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen25_1(pr,s17, s18, s19, s20, s21, s22, s23, s24, s25, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen25_1(pr,s18, s19, s20, s21, s22, s23, s24, s25, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen25_1(pr,s19, s20, s21, s22, s23, s24, s25, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen25_1(pr,s20, s21, s22, s23, s24, s25, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen25_1(pr,s21, s22, s23, s24, s25, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen25_1(pr,s22, s23, s24, s25, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen25_1(pr,s23, s24, s25, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen25_1(pr,s24, s25, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen25_1(pr,s25, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
	}

	private static final void gen25_1(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25){
		gen25_2(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen25_2(pr,s1, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s2);
		gen25_2(pr,s1, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s2, s3);
		gen25_2(pr,s1, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s2, s3, s4);
		gen25_2(pr,s1, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s2, s3, s4, s5);
		gen25_2(pr,s1, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s2, s3, s4, s5, s6);
		gen25_2(pr,s1, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s2, s3, s4, s5, s6, s7);
		gen25_2(pr,s1, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s2, s3, s4, s5, s6, s7, s8);
		gen25_2(pr,s1, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s2, s3, s4, s5, s6, s7, s8, s9);
		gen25_2(pr,s1, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen25_2(pr,s1, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen25_2(pr,s1, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen25_2(pr,s1, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen25_2(pr,s1, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen25_2(pr,s1, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen25_2(pr,s1, s17, s18, s19, s20, s21, s22, s23, s24, s25, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen25_2(pr,s1, s18, s19, s20, s21, s22, s23, s24, s25, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen25_2(pr,s1, s19, s20, s21, s22, s23, s24, s25, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen25_2(pr,s1, s20, s21, s22, s23, s24, s25, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen25_2(pr,s1, s21, s22, s23, s24, s25, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen25_2(pr,s1, s22, s23, s24, s25, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen25_2(pr,s1, s23, s24, s25, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen25_2(pr,s1, s24, s25, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen25_2(pr,s1, s25, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
	}

	private static final void gen25_2(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25){
		gen25_3(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen25_3(pr,s1, s2, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s3);
		gen25_3(pr,s1, s2, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s3, s4);
		gen25_3(pr,s1, s2, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s3, s4, s5);
		gen25_3(pr,s1, s2, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s3, s4, s5, s6);
		gen25_3(pr,s1, s2, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s3, s4, s5, s6, s7);
		gen25_3(pr,s1, s2, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s3, s4, s5, s6, s7, s8);
		gen25_3(pr,s1, s2, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s3, s4, s5, s6, s7, s8, s9);
		gen25_3(pr,s1, s2, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s3, s4, s5, s6, s7, s8, s9, s10);
		gen25_3(pr,s1, s2, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen25_3(pr,s1, s2, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen25_3(pr,s1, s2, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen25_3(pr,s1, s2, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen25_3(pr,s1, s2, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen25_3(pr,s1, s2, s17, s18, s19, s20, s21, s22, s23, s24, s25, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen25_3(pr,s1, s2, s18, s19, s20, s21, s22, s23, s24, s25, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen25_3(pr,s1, s2, s19, s20, s21, s22, s23, s24, s25, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen25_3(pr,s1, s2, s20, s21, s22, s23, s24, s25, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen25_3(pr,s1, s2, s21, s22, s23, s24, s25, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen25_3(pr,s1, s2, s22, s23, s24, s25, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen25_3(pr,s1, s2, s23, s24, s25, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen25_3(pr,s1, s2, s24, s25, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen25_3(pr,s1, s2, s25, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
	}

	private static final void gen25_3(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25){
		gen25_4(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen25_4(pr,s1, s2, s3, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s4);
		gen25_4(pr,s1, s2, s3, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s4, s5);
		gen25_4(pr,s1, s2, s3, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s4, s5, s6);
		gen25_4(pr,s1, s2, s3, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s4, s5, s6, s7);
		gen25_4(pr,s1, s2, s3, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s4, s5, s6, s7, s8);
		gen25_4(pr,s1, s2, s3, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s4, s5, s6, s7, s8, s9);
		gen25_4(pr,s1, s2, s3, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s4, s5, s6, s7, s8, s9, s10);
		gen25_4(pr,s1, s2, s3, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s4, s5, s6, s7, s8, s9, s10, s11);
		gen25_4(pr,s1, s2, s3, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen25_4(pr,s1, s2, s3, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen25_4(pr,s1, s2, s3, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen25_4(pr,s1, s2, s3, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen25_4(pr,s1, s2, s3, s17, s18, s19, s20, s21, s22, s23, s24, s25, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen25_4(pr,s1, s2, s3, s18, s19, s20, s21, s22, s23, s24, s25, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen25_4(pr,s1, s2, s3, s19, s20, s21, s22, s23, s24, s25, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen25_4(pr,s1, s2, s3, s20, s21, s22, s23, s24, s25, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen25_4(pr,s1, s2, s3, s21, s22, s23, s24, s25, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen25_4(pr,s1, s2, s3, s22, s23, s24, s25, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen25_4(pr,s1, s2, s3, s23, s24, s25, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen25_4(pr,s1, s2, s3, s24, s25, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen25_4(pr,s1, s2, s3, s25, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
	}

	private static final void gen25_4(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25){
		gen25_5(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen25_5(pr,s1, s2, s3, s4, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s5);
		gen25_5(pr,s1, s2, s3, s4, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s5, s6);
		gen25_5(pr,s1, s2, s3, s4, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s5, s6, s7);
		gen25_5(pr,s1, s2, s3, s4, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s5, s6, s7, s8);
		gen25_5(pr,s1, s2, s3, s4, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s5, s6, s7, s8, s9);
		gen25_5(pr,s1, s2, s3, s4, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s5, s6, s7, s8, s9, s10);
		gen25_5(pr,s1, s2, s3, s4, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s5, s6, s7, s8, s9, s10, s11);
		gen25_5(pr,s1, s2, s3, s4, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s5, s6, s7, s8, s9, s10, s11, s12);
		gen25_5(pr,s1, s2, s3, s4, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen25_5(pr,s1, s2, s3, s4, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen25_5(pr,s1, s2, s3, s4, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen25_5(pr,s1, s2, s3, s4, s17, s18, s19, s20, s21, s22, s23, s24, s25, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen25_5(pr,s1, s2, s3, s4, s18, s19, s20, s21, s22, s23, s24, s25, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen25_5(pr,s1, s2, s3, s4, s19, s20, s21, s22, s23, s24, s25, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen25_5(pr,s1, s2, s3, s4, s20, s21, s22, s23, s24, s25, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen25_5(pr,s1, s2, s3, s4, s21, s22, s23, s24, s25, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen25_5(pr,s1, s2, s3, s4, s22, s23, s24, s25, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen25_5(pr,s1, s2, s3, s4, s23, s24, s25, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen25_5(pr,s1, s2, s3, s4, s24, s25, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen25_5(pr,s1, s2, s3, s4, s25, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
	}

	private static final void gen25_5(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25){
		gen25_6(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen25_6(pr,s1, s2, s3, s4, s5, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s6);
		gen25_6(pr,s1, s2, s3, s4, s5, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s6, s7);
		gen25_6(pr,s1, s2, s3, s4, s5, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s6, s7, s8);
		gen25_6(pr,s1, s2, s3, s4, s5, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s6, s7, s8, s9);
		gen25_6(pr,s1, s2, s3, s4, s5, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s6, s7, s8, s9, s10);
		gen25_6(pr,s1, s2, s3, s4, s5, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s6, s7, s8, s9, s10, s11);
		gen25_6(pr,s1, s2, s3, s4, s5, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s6, s7, s8, s9, s10, s11, s12);
		gen25_6(pr,s1, s2, s3, s4, s5, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s6, s7, s8, s9, s10, s11, s12, s13);
		gen25_6(pr,s1, s2, s3, s4, s5, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen25_6(pr,s1, s2, s3, s4, s5, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen25_6(pr,s1, s2, s3, s4, s5, s17, s18, s19, s20, s21, s22, s23, s24, s25, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen25_6(pr,s1, s2, s3, s4, s5, s18, s19, s20, s21, s22, s23, s24, s25, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen25_6(pr,s1, s2, s3, s4, s5, s19, s20, s21, s22, s23, s24, s25, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen25_6(pr,s1, s2, s3, s4, s5, s20, s21, s22, s23, s24, s25, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen25_6(pr,s1, s2, s3, s4, s5, s21, s22, s23, s24, s25, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen25_6(pr,s1, s2, s3, s4, s5, s22, s23, s24, s25, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen25_6(pr,s1, s2, s3, s4, s5, s23, s24, s25, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen25_6(pr,s1, s2, s3, s4, s5, s24, s25, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen25_6(pr,s1, s2, s3, s4, s5, s25, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
	}

	private static final void gen25_6(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25){
		gen25_7(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen25_7(pr,s1, s2, s3, s4, s5, s6, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s7);
		gen25_7(pr,s1, s2, s3, s4, s5, s6, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s7, s8);
		gen25_7(pr,s1, s2, s3, s4, s5, s6, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s7, s8, s9);
		gen25_7(pr,s1, s2, s3, s4, s5, s6, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s7, s8, s9, s10);
		gen25_7(pr,s1, s2, s3, s4, s5, s6, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s7, s8, s9, s10, s11);
		gen25_7(pr,s1, s2, s3, s4, s5, s6, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s7, s8, s9, s10, s11, s12);
		gen25_7(pr,s1, s2, s3, s4, s5, s6, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s7, s8, s9, s10, s11, s12, s13);
		gen25_7(pr,s1, s2, s3, s4, s5, s6, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s7, s8, s9, s10, s11, s12, s13, s14);
		gen25_7(pr,s1, s2, s3, s4, s5, s6, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen25_7(pr,s1, s2, s3, s4, s5, s6, s17, s18, s19, s20, s21, s22, s23, s24, s25, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen25_7(pr,s1, s2, s3, s4, s5, s6, s18, s19, s20, s21, s22, s23, s24, s25, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen25_7(pr,s1, s2, s3, s4, s5, s6, s19, s20, s21, s22, s23, s24, s25, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen25_7(pr,s1, s2, s3, s4, s5, s6, s20, s21, s22, s23, s24, s25, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen25_7(pr,s1, s2, s3, s4, s5, s6, s21, s22, s23, s24, s25, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen25_7(pr,s1, s2, s3, s4, s5, s6, s22, s23, s24, s25, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen25_7(pr,s1, s2, s3, s4, s5, s6, s23, s24, s25, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen25_7(pr,s1, s2, s3, s4, s5, s6, s24, s25, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen25_7(pr,s1, s2, s3, s4, s5, s6, s25, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
	}

	private static final void gen25_7(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25){
		gen25_8(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen25_8(pr,s1, s2, s3, s4, s5, s6, s7, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s8);
		gen25_8(pr,s1, s2, s3, s4, s5, s6, s7, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s8, s9);
		gen25_8(pr,s1, s2, s3, s4, s5, s6, s7, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s8, s9, s10);
		gen25_8(pr,s1, s2, s3, s4, s5, s6, s7, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s8, s9, s10, s11);
		gen25_8(pr,s1, s2, s3, s4, s5, s6, s7, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s8, s9, s10, s11, s12);
		gen25_8(pr,s1, s2, s3, s4, s5, s6, s7, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s8, s9, s10, s11, s12, s13);
		gen25_8(pr,s1, s2, s3, s4, s5, s6, s7, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s8, s9, s10, s11, s12, s13, s14);
		gen25_8(pr,s1, s2, s3, s4, s5, s6, s7, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s8, s9, s10, s11, s12, s13, s14, s15);
		gen25_8(pr,s1, s2, s3, s4, s5, s6, s7, s17, s18, s19, s20, s21, s22, s23, s24, s25, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen25_8(pr,s1, s2, s3, s4, s5, s6, s7, s18, s19, s20, s21, s22, s23, s24, s25, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen25_8(pr,s1, s2, s3, s4, s5, s6, s7, s19, s20, s21, s22, s23, s24, s25, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen25_8(pr,s1, s2, s3, s4, s5, s6, s7, s20, s21, s22, s23, s24, s25, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen25_8(pr,s1, s2, s3, s4, s5, s6, s7, s21, s22, s23, s24, s25, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen25_8(pr,s1, s2, s3, s4, s5, s6, s7, s22, s23, s24, s25, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen25_8(pr,s1, s2, s3, s4, s5, s6, s7, s23, s24, s25, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen25_8(pr,s1, s2, s3, s4, s5, s6, s7, s24, s25, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen25_8(pr,s1, s2, s3, s4, s5, s6, s7, s25, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
	}

	private static final void gen25_8(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25){
		gen25_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen25_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s9);
		gen25_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s9, s10);
		gen25_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s9, s10, s11);
		gen25_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s9, s10, s11, s12);
		gen25_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s9, s10, s11, s12, s13);
		gen25_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s9, s10, s11, s12, s13, s14);
		gen25_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s9, s10, s11, s12, s13, s14, s15);
		gen25_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s17, s18, s19, s20, s21, s22, s23, s24, s25, s9, s10, s11, s12, s13, s14, s15, s16);
		gen25_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s18, s19, s20, s21, s22, s23, s24, s25, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen25_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s19, s20, s21, s22, s23, s24, s25, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen25_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s20, s21, s22, s23, s24, s25, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen25_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s21, s22, s23, s24, s25, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen25_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s22, s23, s24, s25, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen25_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s23, s24, s25, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen25_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s24, s25, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen25_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s25, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
	}

	private static final void gen25_9(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25){
		gen25_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen25_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s10);
		gen25_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s10, s11);
		gen25_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s10, s11, s12);
		gen25_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s10, s11, s12, s13);
		gen25_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s10, s11, s12, s13, s14);
		gen25_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s10, s11, s12, s13, s14, s15);
		gen25_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s17, s18, s19, s20, s21, s22, s23, s24, s25, s10, s11, s12, s13, s14, s15, s16);
		gen25_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s18, s19, s20, s21, s22, s23, s24, s25, s10, s11, s12, s13, s14, s15, s16, s17);
		gen25_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s19, s20, s21, s22, s23, s24, s25, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen25_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s20, s21, s22, s23, s24, s25, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen25_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s21, s22, s23, s24, s25, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen25_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s22, s23, s24, s25, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen25_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s23, s24, s25, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen25_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s24, s25, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen25_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s25, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
	}

	private static final void gen25_10(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25){
		gen25_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen25_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s11);
		gen25_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s11, s12);
		gen25_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s11, s12, s13);
		gen25_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s11, s12, s13, s14);
		gen25_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s11, s12, s13, s14, s15);
		gen25_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s17, s18, s19, s20, s21, s22, s23, s24, s25, s11, s12, s13, s14, s15, s16);
		gen25_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s18, s19, s20, s21, s22, s23, s24, s25, s11, s12, s13, s14, s15, s16, s17);
		gen25_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s19, s20, s21, s22, s23, s24, s25, s11, s12, s13, s14, s15, s16, s17, s18);
		gen25_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s20, s21, s22, s23, s24, s25, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen25_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s21, s22, s23, s24, s25, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen25_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s22, s23, s24, s25, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen25_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s23, s24, s25, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen25_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s24, s25, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen25_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s25, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
	}

	private static final void gen25_11(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25){
		gen25_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen25_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s12);
		gen25_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s12, s13);
		gen25_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s12, s13, s14);
		gen25_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s12, s13, s14, s15);
		gen25_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s17, s18, s19, s20, s21, s22, s23, s24, s25, s12, s13, s14, s15, s16);
		gen25_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s18, s19, s20, s21, s22, s23, s24, s25, s12, s13, s14, s15, s16, s17);
		gen25_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s19, s20, s21, s22, s23, s24, s25, s12, s13, s14, s15, s16, s17, s18);
		gen25_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s20, s21, s22, s23, s24, s25, s12, s13, s14, s15, s16, s17, s18, s19);
		gen25_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s21, s22, s23, s24, s25, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen25_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s22, s23, s24, s25, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen25_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s23, s24, s25, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen25_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s24, s25, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen25_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s25, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
	}

	private static final void gen25_12(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25){
		gen25_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen25_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s13);
		gen25_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s13, s14);
		gen25_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s13, s14, s15);
		gen25_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s17, s18, s19, s20, s21, s22, s23, s24, s25, s13, s14, s15, s16);
		gen25_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s18, s19, s20, s21, s22, s23, s24, s25, s13, s14, s15, s16, s17);
		gen25_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s19, s20, s21, s22, s23, s24, s25, s13, s14, s15, s16, s17, s18);
		gen25_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s20, s21, s22, s23, s24, s25, s13, s14, s15, s16, s17, s18, s19);
		gen25_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s21, s22, s23, s24, s25, s13, s14, s15, s16, s17, s18, s19, s20);
		gen25_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s22, s23, s24, s25, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen25_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s23, s24, s25, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen25_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s24, s25, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen25_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s25, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
	}

	private static final void gen25_13(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25){
		gen25_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen25_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s14);
		gen25_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s14, s15);
		gen25_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s17, s18, s19, s20, s21, s22, s23, s24, s25, s14, s15, s16);
		gen25_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s18, s19, s20, s21, s22, s23, s24, s25, s14, s15, s16, s17);
		gen25_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s19, s20, s21, s22, s23, s24, s25, s14, s15, s16, s17, s18);
		gen25_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s20, s21, s22, s23, s24, s25, s14, s15, s16, s17, s18, s19);
		gen25_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s21, s22, s23, s24, s25, s14, s15, s16, s17, s18, s19, s20);
		gen25_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s22, s23, s24, s25, s14, s15, s16, s17, s18, s19, s20, s21);
		gen25_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s23, s24, s25, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen25_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s24, s25, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen25_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s25, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
	}

	private static final void gen25_14(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25){
		gen25_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen25_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s15);
		gen25_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s17, s18, s19, s20, s21, s22, s23, s24, s25, s15, s16);
		gen25_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s18, s19, s20, s21, s22, s23, s24, s25, s15, s16, s17);
		gen25_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s19, s20, s21, s22, s23, s24, s25, s15, s16, s17, s18);
		gen25_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s20, s21, s22, s23, s24, s25, s15, s16, s17, s18, s19);
		gen25_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s21, s22, s23, s24, s25, s15, s16, s17, s18, s19, s20);
		gen25_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s22, s23, s24, s25, s15, s16, s17, s18, s19, s20, s21);
		gen25_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s23, s24, s25, s15, s16, s17, s18, s19, s20, s21, s22);
		gen25_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s24, s25, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen25_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s25, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
	}

	private static final void gen25_15(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25){
		gen25_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen25_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s17, s18, s19, s20, s21, s22, s23, s24, s25, s16);
		gen25_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s18, s19, s20, s21, s22, s23, s24, s25, s16, s17);
		gen25_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s19, s20, s21, s22, s23, s24, s25, s16, s17, s18);
		gen25_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s20, s21, s22, s23, s24, s25, s16, s17, s18, s19);
		gen25_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s21, s22, s23, s24, s25, s16, s17, s18, s19, s20);
		gen25_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s22, s23, s24, s25, s16, s17, s18, s19, s20, s21);
		gen25_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s23, s24, s25, s16, s17, s18, s19, s20, s21, s22);
		gen25_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s24, s25, s16, s17, s18, s19, s20, s21, s22, s23);
		gen25_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s25, s16, s17, s18, s19, s20, s21, s22, s23, s24);
	}

	private static final void gen25_16(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25){
		gen25_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen25_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s18, s19, s20, s21, s22, s23, s24, s25, s17);
		gen25_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s19, s20, s21, s22, s23, s24, s25, s17, s18);
		gen25_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s20, s21, s22, s23, s24, s25, s17, s18, s19);
		gen25_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s21, s22, s23, s24, s25, s17, s18, s19, s20);
		gen25_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s22, s23, s24, s25, s17, s18, s19, s20, s21);
		gen25_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s23, s24, s25, s17, s18, s19, s20, s21, s22);
		gen25_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s24, s25, s17, s18, s19, s20, s21, s22, s23);
		gen25_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s25, s17, s18, s19, s20, s21, s22, s23, s24);
	}

	private static final void gen25_17(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25){
		gen25_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen25_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s19, s20, s21, s22, s23, s24, s25, s18);
		gen25_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s20, s21, s22, s23, s24, s25, s18, s19);
		gen25_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s21, s22, s23, s24, s25, s18, s19, s20);
		gen25_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s22, s23, s24, s25, s18, s19, s20, s21);
		gen25_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s23, s24, s25, s18, s19, s20, s21, s22);
		gen25_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s24, s25, s18, s19, s20, s21, s22, s23);
		gen25_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s25, s18, s19, s20, s21, s22, s23, s24);
	}

	private static final void gen25_18(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25){
		gen25_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen25_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s20, s21, s22, s23, s24, s25, s19);
		gen25_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s21, s22, s23, s24, s25, s19, s20);
		gen25_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s22, s23, s24, s25, s19, s20, s21);
		gen25_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s23, s24, s25, s19, s20, s21, s22);
		gen25_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s24, s25, s19, s20, s21, s22, s23);
		gen25_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s25, s19, s20, s21, s22, s23, s24);
	}

	private static final void gen25_19(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25){
		gen25_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen25_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s21, s22, s23, s24, s25, s20);
		gen25_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s22, s23, s24, s25, s20, s21);
		gen25_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s23, s24, s25, s20, s21, s22);
		gen25_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s24, s25, s20, s21, s22, s23);
		gen25_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s25, s20, s21, s22, s23, s24);
	}

	private static final void gen25_20(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25){
		gen25_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen25_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s22, s23, s24, s25, s21);
		gen25_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s23, s24, s25, s21, s22);
		gen25_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s24, s25, s21, s22, s23);
		gen25_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s25, s21, s22, s23, s24);
	}

	private static final void gen25_21(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25){
		gen25_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen25_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s23, s24, s25, s22);
		gen25_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s24, s25, s22, s23);
		gen25_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s25, s22, s23, s24);
	}

	private static final void gen25_22(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25){
		gen25_23(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen25_23(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s24, s25, s23);
		gen25_23(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s25, s23, s24);
	}

	private static final void gen25_23(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25){
		pr.recieve25(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		pr.recieve25(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s25, s24);
	}

	private static final void gen26_0(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26){
		gen26_1(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen26_1(pr,s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s1);
		gen26_1(pr,s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s1, s2);
		gen26_1(pr,s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s1, s2, s3);
		gen26_1(pr,s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s1, s2, s3, s4);
		gen26_1(pr,s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s1, s2, s3, s4, s5);
		gen26_1(pr,s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s1, s2, s3, s4, s5, s6);
		gen26_1(pr,s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s1, s2, s3, s4, s5, s6, s7);
		gen26_1(pr,s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s1, s2, s3, s4, s5, s6, s7, s8);
		gen26_1(pr,s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s1, s2, s3, s4, s5, s6, s7, s8, s9);
		gen26_1(pr,s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen26_1(pr,s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen26_1(pr,s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen26_1(pr,s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen26_1(pr,s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen26_1(pr,s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen26_1(pr,s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen26_1(pr,s18, s19, s20, s21, s22, s23, s24, s25, s26, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen26_1(pr,s19, s20, s21, s22, s23, s24, s25, s26, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen26_1(pr,s20, s21, s22, s23, s24, s25, s26, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen26_1(pr,s21, s22, s23, s24, s25, s26, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen26_1(pr,s22, s23, s24, s25, s26, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen26_1(pr,s23, s24, s25, s26, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen26_1(pr,s24, s25, s26, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen26_1(pr,s25, s26, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen26_1(pr,s26, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
	}

	private static final void gen26_1(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26){
		gen26_2(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen26_2(pr,s1, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s2);
		gen26_2(pr,s1, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s2, s3);
		gen26_2(pr,s1, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s2, s3, s4);
		gen26_2(pr,s1, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s2, s3, s4, s5);
		gen26_2(pr,s1, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s2, s3, s4, s5, s6);
		gen26_2(pr,s1, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s2, s3, s4, s5, s6, s7);
		gen26_2(pr,s1, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s2, s3, s4, s5, s6, s7, s8);
		gen26_2(pr,s1, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s2, s3, s4, s5, s6, s7, s8, s9);
		gen26_2(pr,s1, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen26_2(pr,s1, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen26_2(pr,s1, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen26_2(pr,s1, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen26_2(pr,s1, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen26_2(pr,s1, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen26_2(pr,s1, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen26_2(pr,s1, s18, s19, s20, s21, s22, s23, s24, s25, s26, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen26_2(pr,s1, s19, s20, s21, s22, s23, s24, s25, s26, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen26_2(pr,s1, s20, s21, s22, s23, s24, s25, s26, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen26_2(pr,s1, s21, s22, s23, s24, s25, s26, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen26_2(pr,s1, s22, s23, s24, s25, s26, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen26_2(pr,s1, s23, s24, s25, s26, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen26_2(pr,s1, s24, s25, s26, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen26_2(pr,s1, s25, s26, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen26_2(pr,s1, s26, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
	}

	private static final void gen26_2(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26){
		gen26_3(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen26_3(pr,s1, s2, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s3);
		gen26_3(pr,s1, s2, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s3, s4);
		gen26_3(pr,s1, s2, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s3, s4, s5);
		gen26_3(pr,s1, s2, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s3, s4, s5, s6);
		gen26_3(pr,s1, s2, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s3, s4, s5, s6, s7);
		gen26_3(pr,s1, s2, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s3, s4, s5, s6, s7, s8);
		gen26_3(pr,s1, s2, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s3, s4, s5, s6, s7, s8, s9);
		gen26_3(pr,s1, s2, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s3, s4, s5, s6, s7, s8, s9, s10);
		gen26_3(pr,s1, s2, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen26_3(pr,s1, s2, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen26_3(pr,s1, s2, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen26_3(pr,s1, s2, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen26_3(pr,s1, s2, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen26_3(pr,s1, s2, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen26_3(pr,s1, s2, s18, s19, s20, s21, s22, s23, s24, s25, s26, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen26_3(pr,s1, s2, s19, s20, s21, s22, s23, s24, s25, s26, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen26_3(pr,s1, s2, s20, s21, s22, s23, s24, s25, s26, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen26_3(pr,s1, s2, s21, s22, s23, s24, s25, s26, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen26_3(pr,s1, s2, s22, s23, s24, s25, s26, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen26_3(pr,s1, s2, s23, s24, s25, s26, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen26_3(pr,s1, s2, s24, s25, s26, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen26_3(pr,s1, s2, s25, s26, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen26_3(pr,s1, s2, s26, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
	}

	private static final void gen26_3(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26){
		gen26_4(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen26_4(pr,s1, s2, s3, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s4);
		gen26_4(pr,s1, s2, s3, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s4, s5);
		gen26_4(pr,s1, s2, s3, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s4, s5, s6);
		gen26_4(pr,s1, s2, s3, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s4, s5, s6, s7);
		gen26_4(pr,s1, s2, s3, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s4, s5, s6, s7, s8);
		gen26_4(pr,s1, s2, s3, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s4, s5, s6, s7, s8, s9);
		gen26_4(pr,s1, s2, s3, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s4, s5, s6, s7, s8, s9, s10);
		gen26_4(pr,s1, s2, s3, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s4, s5, s6, s7, s8, s9, s10, s11);
		gen26_4(pr,s1, s2, s3, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen26_4(pr,s1, s2, s3, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen26_4(pr,s1, s2, s3, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen26_4(pr,s1, s2, s3, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen26_4(pr,s1, s2, s3, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen26_4(pr,s1, s2, s3, s18, s19, s20, s21, s22, s23, s24, s25, s26, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen26_4(pr,s1, s2, s3, s19, s20, s21, s22, s23, s24, s25, s26, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen26_4(pr,s1, s2, s3, s20, s21, s22, s23, s24, s25, s26, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen26_4(pr,s1, s2, s3, s21, s22, s23, s24, s25, s26, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen26_4(pr,s1, s2, s3, s22, s23, s24, s25, s26, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen26_4(pr,s1, s2, s3, s23, s24, s25, s26, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen26_4(pr,s1, s2, s3, s24, s25, s26, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen26_4(pr,s1, s2, s3, s25, s26, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen26_4(pr,s1, s2, s3, s26, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
	}

	private static final void gen26_4(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26){
		gen26_5(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen26_5(pr,s1, s2, s3, s4, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s5);
		gen26_5(pr,s1, s2, s3, s4, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s5, s6);
		gen26_5(pr,s1, s2, s3, s4, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s5, s6, s7);
		gen26_5(pr,s1, s2, s3, s4, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s5, s6, s7, s8);
		gen26_5(pr,s1, s2, s3, s4, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s5, s6, s7, s8, s9);
		gen26_5(pr,s1, s2, s3, s4, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s5, s6, s7, s8, s9, s10);
		gen26_5(pr,s1, s2, s3, s4, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s5, s6, s7, s8, s9, s10, s11);
		gen26_5(pr,s1, s2, s3, s4, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s5, s6, s7, s8, s9, s10, s11, s12);
		gen26_5(pr,s1, s2, s3, s4, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen26_5(pr,s1, s2, s3, s4, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen26_5(pr,s1, s2, s3, s4, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen26_5(pr,s1, s2, s3, s4, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen26_5(pr,s1, s2, s3, s4, s18, s19, s20, s21, s22, s23, s24, s25, s26, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen26_5(pr,s1, s2, s3, s4, s19, s20, s21, s22, s23, s24, s25, s26, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen26_5(pr,s1, s2, s3, s4, s20, s21, s22, s23, s24, s25, s26, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen26_5(pr,s1, s2, s3, s4, s21, s22, s23, s24, s25, s26, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen26_5(pr,s1, s2, s3, s4, s22, s23, s24, s25, s26, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen26_5(pr,s1, s2, s3, s4, s23, s24, s25, s26, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen26_5(pr,s1, s2, s3, s4, s24, s25, s26, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen26_5(pr,s1, s2, s3, s4, s25, s26, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen26_5(pr,s1, s2, s3, s4, s26, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
	}

	private static final void gen26_5(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26){
		gen26_6(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen26_6(pr,s1, s2, s3, s4, s5, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s6);
		gen26_6(pr,s1, s2, s3, s4, s5, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s6, s7);
		gen26_6(pr,s1, s2, s3, s4, s5, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s6, s7, s8);
		gen26_6(pr,s1, s2, s3, s4, s5, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s6, s7, s8, s9);
		gen26_6(pr,s1, s2, s3, s4, s5, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s6, s7, s8, s9, s10);
		gen26_6(pr,s1, s2, s3, s4, s5, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s6, s7, s8, s9, s10, s11);
		gen26_6(pr,s1, s2, s3, s4, s5, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s6, s7, s8, s9, s10, s11, s12);
		gen26_6(pr,s1, s2, s3, s4, s5, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s6, s7, s8, s9, s10, s11, s12, s13);
		gen26_6(pr,s1, s2, s3, s4, s5, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen26_6(pr,s1, s2, s3, s4, s5, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen26_6(pr,s1, s2, s3, s4, s5, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen26_6(pr,s1, s2, s3, s4, s5, s18, s19, s20, s21, s22, s23, s24, s25, s26, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen26_6(pr,s1, s2, s3, s4, s5, s19, s20, s21, s22, s23, s24, s25, s26, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen26_6(pr,s1, s2, s3, s4, s5, s20, s21, s22, s23, s24, s25, s26, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen26_6(pr,s1, s2, s3, s4, s5, s21, s22, s23, s24, s25, s26, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen26_6(pr,s1, s2, s3, s4, s5, s22, s23, s24, s25, s26, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen26_6(pr,s1, s2, s3, s4, s5, s23, s24, s25, s26, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen26_6(pr,s1, s2, s3, s4, s5, s24, s25, s26, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen26_6(pr,s1, s2, s3, s4, s5, s25, s26, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen26_6(pr,s1, s2, s3, s4, s5, s26, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
	}

	private static final void gen26_6(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26){
		gen26_7(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen26_7(pr,s1, s2, s3, s4, s5, s6, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s7);
		gen26_7(pr,s1, s2, s3, s4, s5, s6, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s7, s8);
		gen26_7(pr,s1, s2, s3, s4, s5, s6, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s7, s8, s9);
		gen26_7(pr,s1, s2, s3, s4, s5, s6, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s7, s8, s9, s10);
		gen26_7(pr,s1, s2, s3, s4, s5, s6, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s7, s8, s9, s10, s11);
		gen26_7(pr,s1, s2, s3, s4, s5, s6, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s7, s8, s9, s10, s11, s12);
		gen26_7(pr,s1, s2, s3, s4, s5, s6, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s7, s8, s9, s10, s11, s12, s13);
		gen26_7(pr,s1, s2, s3, s4, s5, s6, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s7, s8, s9, s10, s11, s12, s13, s14);
		gen26_7(pr,s1, s2, s3, s4, s5, s6, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen26_7(pr,s1, s2, s3, s4, s5, s6, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen26_7(pr,s1, s2, s3, s4, s5, s6, s18, s19, s20, s21, s22, s23, s24, s25, s26, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen26_7(pr,s1, s2, s3, s4, s5, s6, s19, s20, s21, s22, s23, s24, s25, s26, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen26_7(pr,s1, s2, s3, s4, s5, s6, s20, s21, s22, s23, s24, s25, s26, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen26_7(pr,s1, s2, s3, s4, s5, s6, s21, s22, s23, s24, s25, s26, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen26_7(pr,s1, s2, s3, s4, s5, s6, s22, s23, s24, s25, s26, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen26_7(pr,s1, s2, s3, s4, s5, s6, s23, s24, s25, s26, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen26_7(pr,s1, s2, s3, s4, s5, s6, s24, s25, s26, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen26_7(pr,s1, s2, s3, s4, s5, s6, s25, s26, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen26_7(pr,s1, s2, s3, s4, s5, s6, s26, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
	}

	private static final void gen26_7(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26){
		gen26_8(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen26_8(pr,s1, s2, s3, s4, s5, s6, s7, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s8);
		gen26_8(pr,s1, s2, s3, s4, s5, s6, s7, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s8, s9);
		gen26_8(pr,s1, s2, s3, s4, s5, s6, s7, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s8, s9, s10);
		gen26_8(pr,s1, s2, s3, s4, s5, s6, s7, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s8, s9, s10, s11);
		gen26_8(pr,s1, s2, s3, s4, s5, s6, s7, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s8, s9, s10, s11, s12);
		gen26_8(pr,s1, s2, s3, s4, s5, s6, s7, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s8, s9, s10, s11, s12, s13);
		gen26_8(pr,s1, s2, s3, s4, s5, s6, s7, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s8, s9, s10, s11, s12, s13, s14);
		gen26_8(pr,s1, s2, s3, s4, s5, s6, s7, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s8, s9, s10, s11, s12, s13, s14, s15);
		gen26_8(pr,s1, s2, s3, s4, s5, s6, s7, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen26_8(pr,s1, s2, s3, s4, s5, s6, s7, s18, s19, s20, s21, s22, s23, s24, s25, s26, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen26_8(pr,s1, s2, s3, s4, s5, s6, s7, s19, s20, s21, s22, s23, s24, s25, s26, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen26_8(pr,s1, s2, s3, s4, s5, s6, s7, s20, s21, s22, s23, s24, s25, s26, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen26_8(pr,s1, s2, s3, s4, s5, s6, s7, s21, s22, s23, s24, s25, s26, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen26_8(pr,s1, s2, s3, s4, s5, s6, s7, s22, s23, s24, s25, s26, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen26_8(pr,s1, s2, s3, s4, s5, s6, s7, s23, s24, s25, s26, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen26_8(pr,s1, s2, s3, s4, s5, s6, s7, s24, s25, s26, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen26_8(pr,s1, s2, s3, s4, s5, s6, s7, s25, s26, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen26_8(pr,s1, s2, s3, s4, s5, s6, s7, s26, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
	}

	private static final void gen26_8(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26){
		gen26_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen26_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s9);
		gen26_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s9, s10);
		gen26_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s9, s10, s11);
		gen26_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s9, s10, s11, s12);
		gen26_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s9, s10, s11, s12, s13);
		gen26_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s9, s10, s11, s12, s13, s14);
		gen26_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s9, s10, s11, s12, s13, s14, s15);
		gen26_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s9, s10, s11, s12, s13, s14, s15, s16);
		gen26_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s18, s19, s20, s21, s22, s23, s24, s25, s26, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen26_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s19, s20, s21, s22, s23, s24, s25, s26, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen26_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s20, s21, s22, s23, s24, s25, s26, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen26_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s21, s22, s23, s24, s25, s26, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen26_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s22, s23, s24, s25, s26, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen26_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s23, s24, s25, s26, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen26_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s24, s25, s26, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen26_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s25, s26, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen26_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s26, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
	}

	private static final void gen26_9(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26){
		gen26_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen26_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s10);
		gen26_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s10, s11);
		gen26_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s10, s11, s12);
		gen26_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s10, s11, s12, s13);
		gen26_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s10, s11, s12, s13, s14);
		gen26_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s10, s11, s12, s13, s14, s15);
		gen26_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s10, s11, s12, s13, s14, s15, s16);
		gen26_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s18, s19, s20, s21, s22, s23, s24, s25, s26, s10, s11, s12, s13, s14, s15, s16, s17);
		gen26_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s19, s20, s21, s22, s23, s24, s25, s26, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen26_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s20, s21, s22, s23, s24, s25, s26, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen26_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s21, s22, s23, s24, s25, s26, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen26_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s22, s23, s24, s25, s26, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen26_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s23, s24, s25, s26, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen26_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s24, s25, s26, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen26_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s25, s26, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen26_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s26, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
	}

	private static final void gen26_10(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26){
		gen26_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen26_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s11);
		gen26_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s11, s12);
		gen26_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s11, s12, s13);
		gen26_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s11, s12, s13, s14);
		gen26_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s11, s12, s13, s14, s15);
		gen26_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s11, s12, s13, s14, s15, s16);
		gen26_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s18, s19, s20, s21, s22, s23, s24, s25, s26, s11, s12, s13, s14, s15, s16, s17);
		gen26_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s19, s20, s21, s22, s23, s24, s25, s26, s11, s12, s13, s14, s15, s16, s17, s18);
		gen26_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s20, s21, s22, s23, s24, s25, s26, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen26_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s21, s22, s23, s24, s25, s26, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen26_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s22, s23, s24, s25, s26, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen26_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s23, s24, s25, s26, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen26_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s24, s25, s26, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen26_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s25, s26, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen26_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s26, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
	}

	private static final void gen26_11(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26){
		gen26_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen26_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s12);
		gen26_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s12, s13);
		gen26_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s12, s13, s14);
		gen26_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s12, s13, s14, s15);
		gen26_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s12, s13, s14, s15, s16);
		gen26_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s18, s19, s20, s21, s22, s23, s24, s25, s26, s12, s13, s14, s15, s16, s17);
		gen26_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s19, s20, s21, s22, s23, s24, s25, s26, s12, s13, s14, s15, s16, s17, s18);
		gen26_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s20, s21, s22, s23, s24, s25, s26, s12, s13, s14, s15, s16, s17, s18, s19);
		gen26_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s21, s22, s23, s24, s25, s26, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen26_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s22, s23, s24, s25, s26, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen26_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s23, s24, s25, s26, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen26_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s24, s25, s26, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen26_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s25, s26, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen26_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s26, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
	}

	private static final void gen26_12(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26){
		gen26_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen26_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s13);
		gen26_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s13, s14);
		gen26_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s13, s14, s15);
		gen26_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s13, s14, s15, s16);
		gen26_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s18, s19, s20, s21, s22, s23, s24, s25, s26, s13, s14, s15, s16, s17);
		gen26_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s19, s20, s21, s22, s23, s24, s25, s26, s13, s14, s15, s16, s17, s18);
		gen26_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s20, s21, s22, s23, s24, s25, s26, s13, s14, s15, s16, s17, s18, s19);
		gen26_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s21, s22, s23, s24, s25, s26, s13, s14, s15, s16, s17, s18, s19, s20);
		gen26_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s22, s23, s24, s25, s26, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen26_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s23, s24, s25, s26, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen26_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s24, s25, s26, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen26_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s25, s26, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen26_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s26, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
	}

	private static final void gen26_13(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26){
		gen26_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen26_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s14);
		gen26_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s14, s15);
		gen26_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s14, s15, s16);
		gen26_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s18, s19, s20, s21, s22, s23, s24, s25, s26, s14, s15, s16, s17);
		gen26_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s19, s20, s21, s22, s23, s24, s25, s26, s14, s15, s16, s17, s18);
		gen26_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s20, s21, s22, s23, s24, s25, s26, s14, s15, s16, s17, s18, s19);
		gen26_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s21, s22, s23, s24, s25, s26, s14, s15, s16, s17, s18, s19, s20);
		gen26_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s22, s23, s24, s25, s26, s14, s15, s16, s17, s18, s19, s20, s21);
		gen26_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s23, s24, s25, s26, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen26_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s24, s25, s26, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen26_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s25, s26, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen26_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s26, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
	}

	private static final void gen26_14(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26){
		gen26_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen26_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s15);
		gen26_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s15, s16);
		gen26_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s18, s19, s20, s21, s22, s23, s24, s25, s26, s15, s16, s17);
		gen26_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s19, s20, s21, s22, s23, s24, s25, s26, s15, s16, s17, s18);
		gen26_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s20, s21, s22, s23, s24, s25, s26, s15, s16, s17, s18, s19);
		gen26_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s21, s22, s23, s24, s25, s26, s15, s16, s17, s18, s19, s20);
		gen26_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s22, s23, s24, s25, s26, s15, s16, s17, s18, s19, s20, s21);
		gen26_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s23, s24, s25, s26, s15, s16, s17, s18, s19, s20, s21, s22);
		gen26_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s24, s25, s26, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen26_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s25, s26, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen26_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s26, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
	}

	private static final void gen26_15(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26){
		gen26_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen26_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s16);
		gen26_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s18, s19, s20, s21, s22, s23, s24, s25, s26, s16, s17);
		gen26_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s19, s20, s21, s22, s23, s24, s25, s26, s16, s17, s18);
		gen26_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s20, s21, s22, s23, s24, s25, s26, s16, s17, s18, s19);
		gen26_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s21, s22, s23, s24, s25, s26, s16, s17, s18, s19, s20);
		gen26_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s22, s23, s24, s25, s26, s16, s17, s18, s19, s20, s21);
		gen26_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s23, s24, s25, s26, s16, s17, s18, s19, s20, s21, s22);
		gen26_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s24, s25, s26, s16, s17, s18, s19, s20, s21, s22, s23);
		gen26_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s25, s26, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen26_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s26, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
	}

	private static final void gen26_16(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26){
		gen26_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen26_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s18, s19, s20, s21, s22, s23, s24, s25, s26, s17);
		gen26_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s19, s20, s21, s22, s23, s24, s25, s26, s17, s18);
		gen26_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s20, s21, s22, s23, s24, s25, s26, s17, s18, s19);
		gen26_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s21, s22, s23, s24, s25, s26, s17, s18, s19, s20);
		gen26_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s22, s23, s24, s25, s26, s17, s18, s19, s20, s21);
		gen26_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s23, s24, s25, s26, s17, s18, s19, s20, s21, s22);
		gen26_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s24, s25, s26, s17, s18, s19, s20, s21, s22, s23);
		gen26_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s25, s26, s17, s18, s19, s20, s21, s22, s23, s24);
		gen26_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s26, s17, s18, s19, s20, s21, s22, s23, s24, s25);
	}

	private static final void gen26_17(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26){
		gen26_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen26_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s19, s20, s21, s22, s23, s24, s25, s26, s18);
		gen26_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s20, s21, s22, s23, s24, s25, s26, s18, s19);
		gen26_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s21, s22, s23, s24, s25, s26, s18, s19, s20);
		gen26_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s22, s23, s24, s25, s26, s18, s19, s20, s21);
		gen26_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s23, s24, s25, s26, s18, s19, s20, s21, s22);
		gen26_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s24, s25, s26, s18, s19, s20, s21, s22, s23);
		gen26_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s25, s26, s18, s19, s20, s21, s22, s23, s24);
		gen26_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s26, s18, s19, s20, s21, s22, s23, s24, s25);
	}

	private static final void gen26_18(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26){
		gen26_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen26_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s20, s21, s22, s23, s24, s25, s26, s19);
		gen26_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s21, s22, s23, s24, s25, s26, s19, s20);
		gen26_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s22, s23, s24, s25, s26, s19, s20, s21);
		gen26_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s23, s24, s25, s26, s19, s20, s21, s22);
		gen26_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s24, s25, s26, s19, s20, s21, s22, s23);
		gen26_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s25, s26, s19, s20, s21, s22, s23, s24);
		gen26_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s26, s19, s20, s21, s22, s23, s24, s25);
	}

	private static final void gen26_19(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26){
		gen26_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen26_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s21, s22, s23, s24, s25, s26, s20);
		gen26_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s22, s23, s24, s25, s26, s20, s21);
		gen26_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s23, s24, s25, s26, s20, s21, s22);
		gen26_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s24, s25, s26, s20, s21, s22, s23);
		gen26_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s25, s26, s20, s21, s22, s23, s24);
		gen26_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s26, s20, s21, s22, s23, s24, s25);
	}

	private static final void gen26_20(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26){
		gen26_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen26_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s22, s23, s24, s25, s26, s21);
		gen26_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s23, s24, s25, s26, s21, s22);
		gen26_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s24, s25, s26, s21, s22, s23);
		gen26_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s25, s26, s21, s22, s23, s24);
		gen26_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s26, s21, s22, s23, s24, s25);
	}

	private static final void gen26_21(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26){
		gen26_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen26_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s23, s24, s25, s26, s22);
		gen26_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s24, s25, s26, s22, s23);
		gen26_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s25, s26, s22, s23, s24);
		gen26_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s26, s22, s23, s24, s25);
	}

	private static final void gen26_22(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26){
		gen26_23(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen26_23(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s24, s25, s26, s23);
		gen26_23(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s25, s26, s23, s24);
		gen26_23(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s26, s23, s24, s25);
	}

	private static final void gen26_23(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26){
		gen26_24(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen26_24(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s25, s26, s24);
		gen26_24(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s26, s24, s25);
	}

	private static final void gen26_24(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26){
		pr.recieve26(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		pr.recieve26(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s26, s25);
	}

	private static final void gen27_0(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27){
		gen27_1(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen27_1(pr,s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s1);
		gen27_1(pr,s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s1, s2);
		gen27_1(pr,s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s1, s2, s3);
		gen27_1(pr,s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s1, s2, s3, s4);
		gen27_1(pr,s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s1, s2, s3, s4, s5);
		gen27_1(pr,s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s1, s2, s3, s4, s5, s6);
		gen27_1(pr,s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s1, s2, s3, s4, s5, s6, s7);
		gen27_1(pr,s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s1, s2, s3, s4, s5, s6, s7, s8);
		gen27_1(pr,s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s1, s2, s3, s4, s5, s6, s7, s8, s9);
		gen27_1(pr,s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen27_1(pr,s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen27_1(pr,s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen27_1(pr,s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen27_1(pr,s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen27_1(pr,s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen27_1(pr,s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen27_1(pr,s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen27_1(pr,s19, s20, s21, s22, s23, s24, s25, s26, s27, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen27_1(pr,s20, s21, s22, s23, s24, s25, s26, s27, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen27_1(pr,s21, s22, s23, s24, s25, s26, s27, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen27_1(pr,s22, s23, s24, s25, s26, s27, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen27_1(pr,s23, s24, s25, s26, s27, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen27_1(pr,s24, s25, s26, s27, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen27_1(pr,s25, s26, s27, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen27_1(pr,s26, s27, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen27_1(pr,s27, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
	}

	private static final void gen27_1(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27){
		gen27_2(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen27_2(pr,s1, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s2);
		gen27_2(pr,s1, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s2, s3);
		gen27_2(pr,s1, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s2, s3, s4);
		gen27_2(pr,s1, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s2, s3, s4, s5);
		gen27_2(pr,s1, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s2, s3, s4, s5, s6);
		gen27_2(pr,s1, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s2, s3, s4, s5, s6, s7);
		gen27_2(pr,s1, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s2, s3, s4, s5, s6, s7, s8);
		gen27_2(pr,s1, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s2, s3, s4, s5, s6, s7, s8, s9);
		gen27_2(pr,s1, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen27_2(pr,s1, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen27_2(pr,s1, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen27_2(pr,s1, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen27_2(pr,s1, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen27_2(pr,s1, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen27_2(pr,s1, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen27_2(pr,s1, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen27_2(pr,s1, s19, s20, s21, s22, s23, s24, s25, s26, s27, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen27_2(pr,s1, s20, s21, s22, s23, s24, s25, s26, s27, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen27_2(pr,s1, s21, s22, s23, s24, s25, s26, s27, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen27_2(pr,s1, s22, s23, s24, s25, s26, s27, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen27_2(pr,s1, s23, s24, s25, s26, s27, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen27_2(pr,s1, s24, s25, s26, s27, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen27_2(pr,s1, s25, s26, s27, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen27_2(pr,s1, s26, s27, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen27_2(pr,s1, s27, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
	}

	private static final void gen27_2(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27){
		gen27_3(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen27_3(pr,s1, s2, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s3);
		gen27_3(pr,s1, s2, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s3, s4);
		gen27_3(pr,s1, s2, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s3, s4, s5);
		gen27_3(pr,s1, s2, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s3, s4, s5, s6);
		gen27_3(pr,s1, s2, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s3, s4, s5, s6, s7);
		gen27_3(pr,s1, s2, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s3, s4, s5, s6, s7, s8);
		gen27_3(pr,s1, s2, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s3, s4, s5, s6, s7, s8, s9);
		gen27_3(pr,s1, s2, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s3, s4, s5, s6, s7, s8, s9, s10);
		gen27_3(pr,s1, s2, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen27_3(pr,s1, s2, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen27_3(pr,s1, s2, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen27_3(pr,s1, s2, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen27_3(pr,s1, s2, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen27_3(pr,s1, s2, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen27_3(pr,s1, s2, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen27_3(pr,s1, s2, s19, s20, s21, s22, s23, s24, s25, s26, s27, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen27_3(pr,s1, s2, s20, s21, s22, s23, s24, s25, s26, s27, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen27_3(pr,s1, s2, s21, s22, s23, s24, s25, s26, s27, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen27_3(pr,s1, s2, s22, s23, s24, s25, s26, s27, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen27_3(pr,s1, s2, s23, s24, s25, s26, s27, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen27_3(pr,s1, s2, s24, s25, s26, s27, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen27_3(pr,s1, s2, s25, s26, s27, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen27_3(pr,s1, s2, s26, s27, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen27_3(pr,s1, s2, s27, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
	}

	private static final void gen27_3(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27){
		gen27_4(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen27_4(pr,s1, s2, s3, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s4);
		gen27_4(pr,s1, s2, s3, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s4, s5);
		gen27_4(pr,s1, s2, s3, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s4, s5, s6);
		gen27_4(pr,s1, s2, s3, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s4, s5, s6, s7);
		gen27_4(pr,s1, s2, s3, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s4, s5, s6, s7, s8);
		gen27_4(pr,s1, s2, s3, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s4, s5, s6, s7, s8, s9);
		gen27_4(pr,s1, s2, s3, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s4, s5, s6, s7, s8, s9, s10);
		gen27_4(pr,s1, s2, s3, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s4, s5, s6, s7, s8, s9, s10, s11);
		gen27_4(pr,s1, s2, s3, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen27_4(pr,s1, s2, s3, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen27_4(pr,s1, s2, s3, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen27_4(pr,s1, s2, s3, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen27_4(pr,s1, s2, s3, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen27_4(pr,s1, s2, s3, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen27_4(pr,s1, s2, s3, s19, s20, s21, s22, s23, s24, s25, s26, s27, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen27_4(pr,s1, s2, s3, s20, s21, s22, s23, s24, s25, s26, s27, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen27_4(pr,s1, s2, s3, s21, s22, s23, s24, s25, s26, s27, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen27_4(pr,s1, s2, s3, s22, s23, s24, s25, s26, s27, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen27_4(pr,s1, s2, s3, s23, s24, s25, s26, s27, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen27_4(pr,s1, s2, s3, s24, s25, s26, s27, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen27_4(pr,s1, s2, s3, s25, s26, s27, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen27_4(pr,s1, s2, s3, s26, s27, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen27_4(pr,s1, s2, s3, s27, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
	}

	private static final void gen27_4(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27){
		gen27_5(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen27_5(pr,s1, s2, s3, s4, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s5);
		gen27_5(pr,s1, s2, s3, s4, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s5, s6);
		gen27_5(pr,s1, s2, s3, s4, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s5, s6, s7);
		gen27_5(pr,s1, s2, s3, s4, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s5, s6, s7, s8);
		gen27_5(pr,s1, s2, s3, s4, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s5, s6, s7, s8, s9);
		gen27_5(pr,s1, s2, s3, s4, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s5, s6, s7, s8, s9, s10);
		gen27_5(pr,s1, s2, s3, s4, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s5, s6, s7, s8, s9, s10, s11);
		gen27_5(pr,s1, s2, s3, s4, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s5, s6, s7, s8, s9, s10, s11, s12);
		gen27_5(pr,s1, s2, s3, s4, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen27_5(pr,s1, s2, s3, s4, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen27_5(pr,s1, s2, s3, s4, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen27_5(pr,s1, s2, s3, s4, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen27_5(pr,s1, s2, s3, s4, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen27_5(pr,s1, s2, s3, s4, s19, s20, s21, s22, s23, s24, s25, s26, s27, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen27_5(pr,s1, s2, s3, s4, s20, s21, s22, s23, s24, s25, s26, s27, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen27_5(pr,s1, s2, s3, s4, s21, s22, s23, s24, s25, s26, s27, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen27_5(pr,s1, s2, s3, s4, s22, s23, s24, s25, s26, s27, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen27_5(pr,s1, s2, s3, s4, s23, s24, s25, s26, s27, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen27_5(pr,s1, s2, s3, s4, s24, s25, s26, s27, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen27_5(pr,s1, s2, s3, s4, s25, s26, s27, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen27_5(pr,s1, s2, s3, s4, s26, s27, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen27_5(pr,s1, s2, s3, s4, s27, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
	}

	private static final void gen27_5(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27){
		gen27_6(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen27_6(pr,s1, s2, s3, s4, s5, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s6);
		gen27_6(pr,s1, s2, s3, s4, s5, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s6, s7);
		gen27_6(pr,s1, s2, s3, s4, s5, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s6, s7, s8);
		gen27_6(pr,s1, s2, s3, s4, s5, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s6, s7, s8, s9);
		gen27_6(pr,s1, s2, s3, s4, s5, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s6, s7, s8, s9, s10);
		gen27_6(pr,s1, s2, s3, s4, s5, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s6, s7, s8, s9, s10, s11);
		gen27_6(pr,s1, s2, s3, s4, s5, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s6, s7, s8, s9, s10, s11, s12);
		gen27_6(pr,s1, s2, s3, s4, s5, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s6, s7, s8, s9, s10, s11, s12, s13);
		gen27_6(pr,s1, s2, s3, s4, s5, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen27_6(pr,s1, s2, s3, s4, s5, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen27_6(pr,s1, s2, s3, s4, s5, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen27_6(pr,s1, s2, s3, s4, s5, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen27_6(pr,s1, s2, s3, s4, s5, s19, s20, s21, s22, s23, s24, s25, s26, s27, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen27_6(pr,s1, s2, s3, s4, s5, s20, s21, s22, s23, s24, s25, s26, s27, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen27_6(pr,s1, s2, s3, s4, s5, s21, s22, s23, s24, s25, s26, s27, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen27_6(pr,s1, s2, s3, s4, s5, s22, s23, s24, s25, s26, s27, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen27_6(pr,s1, s2, s3, s4, s5, s23, s24, s25, s26, s27, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen27_6(pr,s1, s2, s3, s4, s5, s24, s25, s26, s27, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen27_6(pr,s1, s2, s3, s4, s5, s25, s26, s27, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen27_6(pr,s1, s2, s3, s4, s5, s26, s27, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen27_6(pr,s1, s2, s3, s4, s5, s27, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
	}

	private static final void gen27_6(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27){
		gen27_7(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen27_7(pr,s1, s2, s3, s4, s5, s6, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s7);
		gen27_7(pr,s1, s2, s3, s4, s5, s6, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s7, s8);
		gen27_7(pr,s1, s2, s3, s4, s5, s6, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s7, s8, s9);
		gen27_7(pr,s1, s2, s3, s4, s5, s6, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s7, s8, s9, s10);
		gen27_7(pr,s1, s2, s3, s4, s5, s6, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s7, s8, s9, s10, s11);
		gen27_7(pr,s1, s2, s3, s4, s5, s6, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s7, s8, s9, s10, s11, s12);
		gen27_7(pr,s1, s2, s3, s4, s5, s6, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s7, s8, s9, s10, s11, s12, s13);
		gen27_7(pr,s1, s2, s3, s4, s5, s6, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s7, s8, s9, s10, s11, s12, s13, s14);
		gen27_7(pr,s1, s2, s3, s4, s5, s6, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen27_7(pr,s1, s2, s3, s4, s5, s6, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen27_7(pr,s1, s2, s3, s4, s5, s6, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen27_7(pr,s1, s2, s3, s4, s5, s6, s19, s20, s21, s22, s23, s24, s25, s26, s27, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen27_7(pr,s1, s2, s3, s4, s5, s6, s20, s21, s22, s23, s24, s25, s26, s27, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen27_7(pr,s1, s2, s3, s4, s5, s6, s21, s22, s23, s24, s25, s26, s27, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen27_7(pr,s1, s2, s3, s4, s5, s6, s22, s23, s24, s25, s26, s27, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen27_7(pr,s1, s2, s3, s4, s5, s6, s23, s24, s25, s26, s27, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen27_7(pr,s1, s2, s3, s4, s5, s6, s24, s25, s26, s27, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen27_7(pr,s1, s2, s3, s4, s5, s6, s25, s26, s27, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen27_7(pr,s1, s2, s3, s4, s5, s6, s26, s27, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen27_7(pr,s1, s2, s3, s4, s5, s6, s27, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
	}

	private static final void gen27_7(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27){
		gen27_8(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen27_8(pr,s1, s2, s3, s4, s5, s6, s7, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s8);
		gen27_8(pr,s1, s2, s3, s4, s5, s6, s7, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s8, s9);
		gen27_8(pr,s1, s2, s3, s4, s5, s6, s7, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s8, s9, s10);
		gen27_8(pr,s1, s2, s3, s4, s5, s6, s7, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s8, s9, s10, s11);
		gen27_8(pr,s1, s2, s3, s4, s5, s6, s7, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s8, s9, s10, s11, s12);
		gen27_8(pr,s1, s2, s3, s4, s5, s6, s7, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s8, s9, s10, s11, s12, s13);
		gen27_8(pr,s1, s2, s3, s4, s5, s6, s7, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s8, s9, s10, s11, s12, s13, s14);
		gen27_8(pr,s1, s2, s3, s4, s5, s6, s7, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s8, s9, s10, s11, s12, s13, s14, s15);
		gen27_8(pr,s1, s2, s3, s4, s5, s6, s7, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen27_8(pr,s1, s2, s3, s4, s5, s6, s7, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen27_8(pr,s1, s2, s3, s4, s5, s6, s7, s19, s20, s21, s22, s23, s24, s25, s26, s27, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen27_8(pr,s1, s2, s3, s4, s5, s6, s7, s20, s21, s22, s23, s24, s25, s26, s27, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen27_8(pr,s1, s2, s3, s4, s5, s6, s7, s21, s22, s23, s24, s25, s26, s27, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen27_8(pr,s1, s2, s3, s4, s5, s6, s7, s22, s23, s24, s25, s26, s27, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen27_8(pr,s1, s2, s3, s4, s5, s6, s7, s23, s24, s25, s26, s27, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen27_8(pr,s1, s2, s3, s4, s5, s6, s7, s24, s25, s26, s27, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen27_8(pr,s1, s2, s3, s4, s5, s6, s7, s25, s26, s27, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen27_8(pr,s1, s2, s3, s4, s5, s6, s7, s26, s27, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen27_8(pr,s1, s2, s3, s4, s5, s6, s7, s27, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
	}

	private static final void gen27_8(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27){
		gen27_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen27_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s9);
		gen27_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s9, s10);
		gen27_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s9, s10, s11);
		gen27_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s9, s10, s11, s12);
		gen27_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s9, s10, s11, s12, s13);
		gen27_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s9, s10, s11, s12, s13, s14);
		gen27_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s9, s10, s11, s12, s13, s14, s15);
		gen27_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s9, s10, s11, s12, s13, s14, s15, s16);
		gen27_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen27_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s19, s20, s21, s22, s23, s24, s25, s26, s27, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen27_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s20, s21, s22, s23, s24, s25, s26, s27, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen27_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s21, s22, s23, s24, s25, s26, s27, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen27_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s22, s23, s24, s25, s26, s27, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen27_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s23, s24, s25, s26, s27, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen27_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s24, s25, s26, s27, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen27_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s25, s26, s27, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen27_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s26, s27, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen27_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s27, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
	}

	private static final void gen27_9(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27){
		gen27_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen27_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s10);
		gen27_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s10, s11);
		gen27_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s10, s11, s12);
		gen27_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s10, s11, s12, s13);
		gen27_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s10, s11, s12, s13, s14);
		gen27_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s10, s11, s12, s13, s14, s15);
		gen27_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s10, s11, s12, s13, s14, s15, s16);
		gen27_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s10, s11, s12, s13, s14, s15, s16, s17);
		gen27_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s19, s20, s21, s22, s23, s24, s25, s26, s27, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen27_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s20, s21, s22, s23, s24, s25, s26, s27, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen27_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s21, s22, s23, s24, s25, s26, s27, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen27_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s22, s23, s24, s25, s26, s27, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen27_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s23, s24, s25, s26, s27, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen27_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s24, s25, s26, s27, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen27_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s25, s26, s27, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen27_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s26, s27, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen27_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s27, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
	}

	private static final void gen27_10(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27){
		gen27_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen27_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s11);
		gen27_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s11, s12);
		gen27_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s11, s12, s13);
		gen27_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s11, s12, s13, s14);
		gen27_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s11, s12, s13, s14, s15);
		gen27_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s11, s12, s13, s14, s15, s16);
		gen27_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s11, s12, s13, s14, s15, s16, s17);
		gen27_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s19, s20, s21, s22, s23, s24, s25, s26, s27, s11, s12, s13, s14, s15, s16, s17, s18);
		gen27_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s20, s21, s22, s23, s24, s25, s26, s27, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen27_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s21, s22, s23, s24, s25, s26, s27, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen27_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s22, s23, s24, s25, s26, s27, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen27_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s23, s24, s25, s26, s27, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen27_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s24, s25, s26, s27, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen27_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s25, s26, s27, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen27_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s26, s27, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen27_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s27, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
	}

	private static final void gen27_11(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27){
		gen27_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen27_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s12);
		gen27_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s12, s13);
		gen27_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s12, s13, s14);
		gen27_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s12, s13, s14, s15);
		gen27_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s12, s13, s14, s15, s16);
		gen27_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s12, s13, s14, s15, s16, s17);
		gen27_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s19, s20, s21, s22, s23, s24, s25, s26, s27, s12, s13, s14, s15, s16, s17, s18);
		gen27_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s20, s21, s22, s23, s24, s25, s26, s27, s12, s13, s14, s15, s16, s17, s18, s19);
		gen27_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s21, s22, s23, s24, s25, s26, s27, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen27_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s22, s23, s24, s25, s26, s27, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen27_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s23, s24, s25, s26, s27, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen27_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s24, s25, s26, s27, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen27_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s25, s26, s27, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen27_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s26, s27, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen27_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s27, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
	}

	private static final void gen27_12(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27){
		gen27_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen27_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s13);
		gen27_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s13, s14);
		gen27_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s13, s14, s15);
		gen27_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s13, s14, s15, s16);
		gen27_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s13, s14, s15, s16, s17);
		gen27_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s19, s20, s21, s22, s23, s24, s25, s26, s27, s13, s14, s15, s16, s17, s18);
		gen27_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s20, s21, s22, s23, s24, s25, s26, s27, s13, s14, s15, s16, s17, s18, s19);
		gen27_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s21, s22, s23, s24, s25, s26, s27, s13, s14, s15, s16, s17, s18, s19, s20);
		gen27_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s22, s23, s24, s25, s26, s27, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen27_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s23, s24, s25, s26, s27, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen27_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s24, s25, s26, s27, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen27_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s25, s26, s27, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen27_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s26, s27, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen27_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s27, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
	}

	private static final void gen27_13(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27){
		gen27_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen27_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s14);
		gen27_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s14, s15);
		gen27_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s14, s15, s16);
		gen27_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s14, s15, s16, s17);
		gen27_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s19, s20, s21, s22, s23, s24, s25, s26, s27, s14, s15, s16, s17, s18);
		gen27_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s20, s21, s22, s23, s24, s25, s26, s27, s14, s15, s16, s17, s18, s19);
		gen27_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s21, s22, s23, s24, s25, s26, s27, s14, s15, s16, s17, s18, s19, s20);
		gen27_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s22, s23, s24, s25, s26, s27, s14, s15, s16, s17, s18, s19, s20, s21);
		gen27_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s23, s24, s25, s26, s27, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen27_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s24, s25, s26, s27, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen27_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s25, s26, s27, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen27_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s26, s27, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen27_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s27, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
	}

	private static final void gen27_14(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27){
		gen27_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen27_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s15);
		gen27_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s15, s16);
		gen27_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s15, s16, s17);
		gen27_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s19, s20, s21, s22, s23, s24, s25, s26, s27, s15, s16, s17, s18);
		gen27_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s20, s21, s22, s23, s24, s25, s26, s27, s15, s16, s17, s18, s19);
		gen27_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s21, s22, s23, s24, s25, s26, s27, s15, s16, s17, s18, s19, s20);
		gen27_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s22, s23, s24, s25, s26, s27, s15, s16, s17, s18, s19, s20, s21);
		gen27_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s23, s24, s25, s26, s27, s15, s16, s17, s18, s19, s20, s21, s22);
		gen27_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s24, s25, s26, s27, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen27_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s25, s26, s27, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen27_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s26, s27, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen27_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s27, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
	}

	private static final void gen27_15(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27){
		gen27_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen27_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s16);
		gen27_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s16, s17);
		gen27_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s19, s20, s21, s22, s23, s24, s25, s26, s27, s16, s17, s18);
		gen27_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s20, s21, s22, s23, s24, s25, s26, s27, s16, s17, s18, s19);
		gen27_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s21, s22, s23, s24, s25, s26, s27, s16, s17, s18, s19, s20);
		gen27_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s22, s23, s24, s25, s26, s27, s16, s17, s18, s19, s20, s21);
		gen27_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s23, s24, s25, s26, s27, s16, s17, s18, s19, s20, s21, s22);
		gen27_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s24, s25, s26, s27, s16, s17, s18, s19, s20, s21, s22, s23);
		gen27_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s25, s26, s27, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen27_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s26, s27, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen27_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s27, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
	}

	private static final void gen27_16(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27){
		gen27_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen27_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s17);
		gen27_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s19, s20, s21, s22, s23, s24, s25, s26, s27, s17, s18);
		gen27_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s20, s21, s22, s23, s24, s25, s26, s27, s17, s18, s19);
		gen27_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s21, s22, s23, s24, s25, s26, s27, s17, s18, s19, s20);
		gen27_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s22, s23, s24, s25, s26, s27, s17, s18, s19, s20, s21);
		gen27_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s23, s24, s25, s26, s27, s17, s18, s19, s20, s21, s22);
		gen27_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s24, s25, s26, s27, s17, s18, s19, s20, s21, s22, s23);
		gen27_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s25, s26, s27, s17, s18, s19, s20, s21, s22, s23, s24);
		gen27_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s26, s27, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen27_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s27, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
	}

	private static final void gen27_17(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27){
		gen27_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen27_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s19, s20, s21, s22, s23, s24, s25, s26, s27, s18);
		gen27_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s20, s21, s22, s23, s24, s25, s26, s27, s18, s19);
		gen27_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s21, s22, s23, s24, s25, s26, s27, s18, s19, s20);
		gen27_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s22, s23, s24, s25, s26, s27, s18, s19, s20, s21);
		gen27_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s23, s24, s25, s26, s27, s18, s19, s20, s21, s22);
		gen27_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s24, s25, s26, s27, s18, s19, s20, s21, s22, s23);
		gen27_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s25, s26, s27, s18, s19, s20, s21, s22, s23, s24);
		gen27_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s26, s27, s18, s19, s20, s21, s22, s23, s24, s25);
		gen27_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s27, s18, s19, s20, s21, s22, s23, s24, s25, s26);
	}

	private static final void gen27_18(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27){
		gen27_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen27_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s20, s21, s22, s23, s24, s25, s26, s27, s19);
		gen27_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s21, s22, s23, s24, s25, s26, s27, s19, s20);
		gen27_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s22, s23, s24, s25, s26, s27, s19, s20, s21);
		gen27_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s23, s24, s25, s26, s27, s19, s20, s21, s22);
		gen27_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s24, s25, s26, s27, s19, s20, s21, s22, s23);
		gen27_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s25, s26, s27, s19, s20, s21, s22, s23, s24);
		gen27_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s26, s27, s19, s20, s21, s22, s23, s24, s25);
		gen27_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s27, s19, s20, s21, s22, s23, s24, s25, s26);
	}

	private static final void gen27_19(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27){
		gen27_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen27_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s21, s22, s23, s24, s25, s26, s27, s20);
		gen27_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s22, s23, s24, s25, s26, s27, s20, s21);
		gen27_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s23, s24, s25, s26, s27, s20, s21, s22);
		gen27_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s24, s25, s26, s27, s20, s21, s22, s23);
		gen27_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s25, s26, s27, s20, s21, s22, s23, s24);
		gen27_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s26, s27, s20, s21, s22, s23, s24, s25);
		gen27_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s27, s20, s21, s22, s23, s24, s25, s26);
	}

	private static final void gen27_20(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27){
		gen27_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen27_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s22, s23, s24, s25, s26, s27, s21);
		gen27_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s23, s24, s25, s26, s27, s21, s22);
		gen27_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s24, s25, s26, s27, s21, s22, s23);
		gen27_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s25, s26, s27, s21, s22, s23, s24);
		gen27_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s26, s27, s21, s22, s23, s24, s25);
		gen27_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s27, s21, s22, s23, s24, s25, s26);
	}

	private static final void gen27_21(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27){
		gen27_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen27_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s23, s24, s25, s26, s27, s22);
		gen27_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s24, s25, s26, s27, s22, s23);
		gen27_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s25, s26, s27, s22, s23, s24);
		gen27_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s26, s27, s22, s23, s24, s25);
		gen27_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s27, s22, s23, s24, s25, s26);
	}

	private static final void gen27_22(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27){
		gen27_23(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen27_23(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s24, s25, s26, s27, s23);
		gen27_23(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s25, s26, s27, s23, s24);
		gen27_23(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s26, s27, s23, s24, s25);
		gen27_23(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s27, s23, s24, s25, s26);
	}

	private static final void gen27_23(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27){
		gen27_24(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen27_24(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s25, s26, s27, s24);
		gen27_24(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s26, s27, s24, s25);
		gen27_24(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s27, s24, s25, s26);
	}

	private static final void gen27_24(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27){
		gen27_25(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen27_25(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s26, s27, s25);
		gen27_25(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s27, s25, s26);
	}

	private static final void gen27_25(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27){
		pr.recieve27(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		pr.recieve27(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s27, s26);
	}

	private static final void gen28_0(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28){
		gen28_1(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen28_1(pr,s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s1);
		gen28_1(pr,s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s1, s2);
		gen28_1(pr,s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s1, s2, s3);
		gen28_1(pr,s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s1, s2, s3, s4);
		gen28_1(pr,s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s1, s2, s3, s4, s5);
		gen28_1(pr,s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s1, s2, s3, s4, s5, s6);
		gen28_1(pr,s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s1, s2, s3, s4, s5, s6, s7);
		gen28_1(pr,s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s1, s2, s3, s4, s5, s6, s7, s8);
		gen28_1(pr,s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s1, s2, s3, s4, s5, s6, s7, s8, s9);
		gen28_1(pr,s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen28_1(pr,s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen28_1(pr,s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen28_1(pr,s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen28_1(pr,s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen28_1(pr,s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen28_1(pr,s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen28_1(pr,s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen28_1(pr,s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen28_1(pr,s20, s21, s22, s23, s24, s25, s26, s27, s28, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen28_1(pr,s21, s22, s23, s24, s25, s26, s27, s28, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen28_1(pr,s22, s23, s24, s25, s26, s27, s28, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen28_1(pr,s23, s24, s25, s26, s27, s28, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen28_1(pr,s24, s25, s26, s27, s28, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen28_1(pr,s25, s26, s27, s28, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen28_1(pr,s26, s27, s28, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen28_1(pr,s27, s28, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen28_1(pr,s28, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
	}

	private static final void gen28_1(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28){
		gen28_2(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen28_2(pr,s1, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s2);
		gen28_2(pr,s1, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s2, s3);
		gen28_2(pr,s1, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s2, s3, s4);
		gen28_2(pr,s1, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s2, s3, s4, s5);
		gen28_2(pr,s1, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s2, s3, s4, s5, s6);
		gen28_2(pr,s1, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s2, s3, s4, s5, s6, s7);
		gen28_2(pr,s1, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s2, s3, s4, s5, s6, s7, s8);
		gen28_2(pr,s1, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s2, s3, s4, s5, s6, s7, s8, s9);
		gen28_2(pr,s1, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen28_2(pr,s1, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen28_2(pr,s1, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen28_2(pr,s1, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen28_2(pr,s1, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen28_2(pr,s1, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen28_2(pr,s1, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen28_2(pr,s1, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen28_2(pr,s1, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen28_2(pr,s1, s20, s21, s22, s23, s24, s25, s26, s27, s28, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen28_2(pr,s1, s21, s22, s23, s24, s25, s26, s27, s28, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen28_2(pr,s1, s22, s23, s24, s25, s26, s27, s28, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen28_2(pr,s1, s23, s24, s25, s26, s27, s28, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen28_2(pr,s1, s24, s25, s26, s27, s28, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen28_2(pr,s1, s25, s26, s27, s28, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen28_2(pr,s1, s26, s27, s28, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen28_2(pr,s1, s27, s28, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen28_2(pr,s1, s28, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
	}

	private static final void gen28_2(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28){
		gen28_3(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen28_3(pr,s1, s2, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s3);
		gen28_3(pr,s1, s2, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s3, s4);
		gen28_3(pr,s1, s2, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s3, s4, s5);
		gen28_3(pr,s1, s2, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s3, s4, s5, s6);
		gen28_3(pr,s1, s2, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s3, s4, s5, s6, s7);
		gen28_3(pr,s1, s2, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s3, s4, s5, s6, s7, s8);
		gen28_3(pr,s1, s2, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s3, s4, s5, s6, s7, s8, s9);
		gen28_3(pr,s1, s2, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s3, s4, s5, s6, s7, s8, s9, s10);
		gen28_3(pr,s1, s2, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen28_3(pr,s1, s2, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen28_3(pr,s1, s2, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen28_3(pr,s1, s2, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen28_3(pr,s1, s2, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen28_3(pr,s1, s2, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen28_3(pr,s1, s2, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen28_3(pr,s1, s2, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen28_3(pr,s1, s2, s20, s21, s22, s23, s24, s25, s26, s27, s28, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen28_3(pr,s1, s2, s21, s22, s23, s24, s25, s26, s27, s28, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen28_3(pr,s1, s2, s22, s23, s24, s25, s26, s27, s28, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen28_3(pr,s1, s2, s23, s24, s25, s26, s27, s28, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen28_3(pr,s1, s2, s24, s25, s26, s27, s28, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen28_3(pr,s1, s2, s25, s26, s27, s28, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen28_3(pr,s1, s2, s26, s27, s28, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen28_3(pr,s1, s2, s27, s28, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen28_3(pr,s1, s2, s28, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
	}

	private static final void gen28_3(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28){
		gen28_4(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen28_4(pr,s1, s2, s3, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s4);
		gen28_4(pr,s1, s2, s3, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s4, s5);
		gen28_4(pr,s1, s2, s3, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s4, s5, s6);
		gen28_4(pr,s1, s2, s3, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s4, s5, s6, s7);
		gen28_4(pr,s1, s2, s3, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s4, s5, s6, s7, s8);
		gen28_4(pr,s1, s2, s3, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s4, s5, s6, s7, s8, s9);
		gen28_4(pr,s1, s2, s3, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s4, s5, s6, s7, s8, s9, s10);
		gen28_4(pr,s1, s2, s3, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s4, s5, s6, s7, s8, s9, s10, s11);
		gen28_4(pr,s1, s2, s3, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen28_4(pr,s1, s2, s3, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen28_4(pr,s1, s2, s3, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen28_4(pr,s1, s2, s3, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen28_4(pr,s1, s2, s3, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen28_4(pr,s1, s2, s3, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen28_4(pr,s1, s2, s3, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen28_4(pr,s1, s2, s3, s20, s21, s22, s23, s24, s25, s26, s27, s28, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen28_4(pr,s1, s2, s3, s21, s22, s23, s24, s25, s26, s27, s28, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen28_4(pr,s1, s2, s3, s22, s23, s24, s25, s26, s27, s28, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen28_4(pr,s1, s2, s3, s23, s24, s25, s26, s27, s28, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen28_4(pr,s1, s2, s3, s24, s25, s26, s27, s28, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen28_4(pr,s1, s2, s3, s25, s26, s27, s28, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen28_4(pr,s1, s2, s3, s26, s27, s28, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen28_4(pr,s1, s2, s3, s27, s28, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen28_4(pr,s1, s2, s3, s28, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
	}

	private static final void gen28_4(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28){
		gen28_5(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen28_5(pr,s1, s2, s3, s4, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s5);
		gen28_5(pr,s1, s2, s3, s4, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s5, s6);
		gen28_5(pr,s1, s2, s3, s4, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s5, s6, s7);
		gen28_5(pr,s1, s2, s3, s4, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s5, s6, s7, s8);
		gen28_5(pr,s1, s2, s3, s4, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s5, s6, s7, s8, s9);
		gen28_5(pr,s1, s2, s3, s4, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s5, s6, s7, s8, s9, s10);
		gen28_5(pr,s1, s2, s3, s4, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s5, s6, s7, s8, s9, s10, s11);
		gen28_5(pr,s1, s2, s3, s4, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s5, s6, s7, s8, s9, s10, s11, s12);
		gen28_5(pr,s1, s2, s3, s4, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen28_5(pr,s1, s2, s3, s4, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen28_5(pr,s1, s2, s3, s4, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen28_5(pr,s1, s2, s3, s4, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen28_5(pr,s1, s2, s3, s4, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen28_5(pr,s1, s2, s3, s4, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen28_5(pr,s1, s2, s3, s4, s20, s21, s22, s23, s24, s25, s26, s27, s28, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen28_5(pr,s1, s2, s3, s4, s21, s22, s23, s24, s25, s26, s27, s28, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen28_5(pr,s1, s2, s3, s4, s22, s23, s24, s25, s26, s27, s28, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen28_5(pr,s1, s2, s3, s4, s23, s24, s25, s26, s27, s28, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen28_5(pr,s1, s2, s3, s4, s24, s25, s26, s27, s28, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen28_5(pr,s1, s2, s3, s4, s25, s26, s27, s28, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen28_5(pr,s1, s2, s3, s4, s26, s27, s28, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen28_5(pr,s1, s2, s3, s4, s27, s28, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen28_5(pr,s1, s2, s3, s4, s28, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
	}

	private static final void gen28_5(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28){
		gen28_6(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen28_6(pr,s1, s2, s3, s4, s5, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s6);
		gen28_6(pr,s1, s2, s3, s4, s5, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s6, s7);
		gen28_6(pr,s1, s2, s3, s4, s5, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s6, s7, s8);
		gen28_6(pr,s1, s2, s3, s4, s5, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s6, s7, s8, s9);
		gen28_6(pr,s1, s2, s3, s4, s5, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s6, s7, s8, s9, s10);
		gen28_6(pr,s1, s2, s3, s4, s5, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s6, s7, s8, s9, s10, s11);
		gen28_6(pr,s1, s2, s3, s4, s5, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s6, s7, s8, s9, s10, s11, s12);
		gen28_6(pr,s1, s2, s3, s4, s5, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s6, s7, s8, s9, s10, s11, s12, s13);
		gen28_6(pr,s1, s2, s3, s4, s5, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen28_6(pr,s1, s2, s3, s4, s5, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen28_6(pr,s1, s2, s3, s4, s5, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen28_6(pr,s1, s2, s3, s4, s5, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen28_6(pr,s1, s2, s3, s4, s5, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen28_6(pr,s1, s2, s3, s4, s5, s20, s21, s22, s23, s24, s25, s26, s27, s28, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen28_6(pr,s1, s2, s3, s4, s5, s21, s22, s23, s24, s25, s26, s27, s28, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen28_6(pr,s1, s2, s3, s4, s5, s22, s23, s24, s25, s26, s27, s28, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen28_6(pr,s1, s2, s3, s4, s5, s23, s24, s25, s26, s27, s28, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen28_6(pr,s1, s2, s3, s4, s5, s24, s25, s26, s27, s28, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen28_6(pr,s1, s2, s3, s4, s5, s25, s26, s27, s28, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen28_6(pr,s1, s2, s3, s4, s5, s26, s27, s28, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen28_6(pr,s1, s2, s3, s4, s5, s27, s28, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen28_6(pr,s1, s2, s3, s4, s5, s28, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
	}

	private static final void gen28_6(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28){
		gen28_7(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen28_7(pr,s1, s2, s3, s4, s5, s6, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s7);
		gen28_7(pr,s1, s2, s3, s4, s5, s6, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s7, s8);
		gen28_7(pr,s1, s2, s3, s4, s5, s6, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s7, s8, s9);
		gen28_7(pr,s1, s2, s3, s4, s5, s6, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s7, s8, s9, s10);
		gen28_7(pr,s1, s2, s3, s4, s5, s6, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s7, s8, s9, s10, s11);
		gen28_7(pr,s1, s2, s3, s4, s5, s6, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s7, s8, s9, s10, s11, s12);
		gen28_7(pr,s1, s2, s3, s4, s5, s6, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s7, s8, s9, s10, s11, s12, s13);
		gen28_7(pr,s1, s2, s3, s4, s5, s6, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s7, s8, s9, s10, s11, s12, s13, s14);
		gen28_7(pr,s1, s2, s3, s4, s5, s6, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen28_7(pr,s1, s2, s3, s4, s5, s6, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen28_7(pr,s1, s2, s3, s4, s5, s6, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen28_7(pr,s1, s2, s3, s4, s5, s6, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen28_7(pr,s1, s2, s3, s4, s5, s6, s20, s21, s22, s23, s24, s25, s26, s27, s28, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen28_7(pr,s1, s2, s3, s4, s5, s6, s21, s22, s23, s24, s25, s26, s27, s28, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen28_7(pr,s1, s2, s3, s4, s5, s6, s22, s23, s24, s25, s26, s27, s28, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen28_7(pr,s1, s2, s3, s4, s5, s6, s23, s24, s25, s26, s27, s28, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen28_7(pr,s1, s2, s3, s4, s5, s6, s24, s25, s26, s27, s28, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen28_7(pr,s1, s2, s3, s4, s5, s6, s25, s26, s27, s28, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen28_7(pr,s1, s2, s3, s4, s5, s6, s26, s27, s28, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen28_7(pr,s1, s2, s3, s4, s5, s6, s27, s28, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen28_7(pr,s1, s2, s3, s4, s5, s6, s28, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
	}

	private static final void gen28_7(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28){
		gen28_8(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen28_8(pr,s1, s2, s3, s4, s5, s6, s7, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s8);
		gen28_8(pr,s1, s2, s3, s4, s5, s6, s7, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s8, s9);
		gen28_8(pr,s1, s2, s3, s4, s5, s6, s7, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s8, s9, s10);
		gen28_8(pr,s1, s2, s3, s4, s5, s6, s7, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s8, s9, s10, s11);
		gen28_8(pr,s1, s2, s3, s4, s5, s6, s7, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s8, s9, s10, s11, s12);
		gen28_8(pr,s1, s2, s3, s4, s5, s6, s7, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s8, s9, s10, s11, s12, s13);
		gen28_8(pr,s1, s2, s3, s4, s5, s6, s7, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s8, s9, s10, s11, s12, s13, s14);
		gen28_8(pr,s1, s2, s3, s4, s5, s6, s7, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s8, s9, s10, s11, s12, s13, s14, s15);
		gen28_8(pr,s1, s2, s3, s4, s5, s6, s7, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen28_8(pr,s1, s2, s3, s4, s5, s6, s7, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen28_8(pr,s1, s2, s3, s4, s5, s6, s7, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen28_8(pr,s1, s2, s3, s4, s5, s6, s7, s20, s21, s22, s23, s24, s25, s26, s27, s28, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen28_8(pr,s1, s2, s3, s4, s5, s6, s7, s21, s22, s23, s24, s25, s26, s27, s28, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen28_8(pr,s1, s2, s3, s4, s5, s6, s7, s22, s23, s24, s25, s26, s27, s28, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen28_8(pr,s1, s2, s3, s4, s5, s6, s7, s23, s24, s25, s26, s27, s28, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen28_8(pr,s1, s2, s3, s4, s5, s6, s7, s24, s25, s26, s27, s28, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen28_8(pr,s1, s2, s3, s4, s5, s6, s7, s25, s26, s27, s28, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen28_8(pr,s1, s2, s3, s4, s5, s6, s7, s26, s27, s28, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen28_8(pr,s1, s2, s3, s4, s5, s6, s7, s27, s28, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen28_8(pr,s1, s2, s3, s4, s5, s6, s7, s28, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
	}

	private static final void gen28_8(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28){
		gen28_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen28_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s9);
		gen28_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s9, s10);
		gen28_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s9, s10, s11);
		gen28_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s9, s10, s11, s12);
		gen28_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s9, s10, s11, s12, s13);
		gen28_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s9, s10, s11, s12, s13, s14);
		gen28_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s9, s10, s11, s12, s13, s14, s15);
		gen28_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s9, s10, s11, s12, s13, s14, s15, s16);
		gen28_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen28_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen28_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s20, s21, s22, s23, s24, s25, s26, s27, s28, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen28_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s21, s22, s23, s24, s25, s26, s27, s28, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen28_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s22, s23, s24, s25, s26, s27, s28, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen28_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s23, s24, s25, s26, s27, s28, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen28_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s24, s25, s26, s27, s28, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen28_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s25, s26, s27, s28, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen28_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s26, s27, s28, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen28_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s27, s28, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen28_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s28, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
	}

	private static final void gen28_9(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28){
		gen28_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen28_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s10);
		gen28_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s10, s11);
		gen28_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s10, s11, s12);
		gen28_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s10, s11, s12, s13);
		gen28_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s10, s11, s12, s13, s14);
		gen28_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s10, s11, s12, s13, s14, s15);
		gen28_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s10, s11, s12, s13, s14, s15, s16);
		gen28_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s10, s11, s12, s13, s14, s15, s16, s17);
		gen28_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen28_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s20, s21, s22, s23, s24, s25, s26, s27, s28, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen28_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s21, s22, s23, s24, s25, s26, s27, s28, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen28_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s22, s23, s24, s25, s26, s27, s28, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen28_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s23, s24, s25, s26, s27, s28, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen28_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s24, s25, s26, s27, s28, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen28_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s25, s26, s27, s28, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen28_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s26, s27, s28, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen28_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s27, s28, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen28_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s28, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
	}

	private static final void gen28_10(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28){
		gen28_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen28_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s11);
		gen28_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s11, s12);
		gen28_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s11, s12, s13);
		gen28_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s11, s12, s13, s14);
		gen28_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s11, s12, s13, s14, s15);
		gen28_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s11, s12, s13, s14, s15, s16);
		gen28_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s11, s12, s13, s14, s15, s16, s17);
		gen28_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s11, s12, s13, s14, s15, s16, s17, s18);
		gen28_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s20, s21, s22, s23, s24, s25, s26, s27, s28, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen28_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s21, s22, s23, s24, s25, s26, s27, s28, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen28_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s22, s23, s24, s25, s26, s27, s28, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen28_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s23, s24, s25, s26, s27, s28, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen28_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s24, s25, s26, s27, s28, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen28_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s25, s26, s27, s28, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen28_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s26, s27, s28, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen28_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s27, s28, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen28_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s28, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
	}

	private static final void gen28_11(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28){
		gen28_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen28_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s12);
		gen28_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s12, s13);
		gen28_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s12, s13, s14);
		gen28_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s12, s13, s14, s15);
		gen28_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s12, s13, s14, s15, s16);
		gen28_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s12, s13, s14, s15, s16, s17);
		gen28_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s12, s13, s14, s15, s16, s17, s18);
		gen28_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s20, s21, s22, s23, s24, s25, s26, s27, s28, s12, s13, s14, s15, s16, s17, s18, s19);
		gen28_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s21, s22, s23, s24, s25, s26, s27, s28, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen28_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s22, s23, s24, s25, s26, s27, s28, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen28_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s23, s24, s25, s26, s27, s28, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen28_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s24, s25, s26, s27, s28, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen28_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s25, s26, s27, s28, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen28_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s26, s27, s28, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen28_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s27, s28, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen28_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s28, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
	}

	private static final void gen28_12(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28){
		gen28_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen28_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s13);
		gen28_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s13, s14);
		gen28_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s13, s14, s15);
		gen28_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s13, s14, s15, s16);
		gen28_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s13, s14, s15, s16, s17);
		gen28_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s13, s14, s15, s16, s17, s18);
		gen28_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s20, s21, s22, s23, s24, s25, s26, s27, s28, s13, s14, s15, s16, s17, s18, s19);
		gen28_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s21, s22, s23, s24, s25, s26, s27, s28, s13, s14, s15, s16, s17, s18, s19, s20);
		gen28_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s22, s23, s24, s25, s26, s27, s28, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen28_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s23, s24, s25, s26, s27, s28, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen28_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s24, s25, s26, s27, s28, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen28_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s25, s26, s27, s28, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen28_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s26, s27, s28, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen28_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s27, s28, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen28_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s28, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
	}

	private static final void gen28_13(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28){
		gen28_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen28_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s14);
		gen28_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s14, s15);
		gen28_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s14, s15, s16);
		gen28_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s14, s15, s16, s17);
		gen28_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s14, s15, s16, s17, s18);
		gen28_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s20, s21, s22, s23, s24, s25, s26, s27, s28, s14, s15, s16, s17, s18, s19);
		gen28_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s21, s22, s23, s24, s25, s26, s27, s28, s14, s15, s16, s17, s18, s19, s20);
		gen28_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s22, s23, s24, s25, s26, s27, s28, s14, s15, s16, s17, s18, s19, s20, s21);
		gen28_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s23, s24, s25, s26, s27, s28, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen28_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s24, s25, s26, s27, s28, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen28_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s25, s26, s27, s28, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen28_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s26, s27, s28, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen28_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s27, s28, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen28_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s28, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
	}

	private static final void gen28_14(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28){
		gen28_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen28_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s15);
		gen28_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s15, s16);
		gen28_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s15, s16, s17);
		gen28_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s15, s16, s17, s18);
		gen28_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s20, s21, s22, s23, s24, s25, s26, s27, s28, s15, s16, s17, s18, s19);
		gen28_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s21, s22, s23, s24, s25, s26, s27, s28, s15, s16, s17, s18, s19, s20);
		gen28_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s22, s23, s24, s25, s26, s27, s28, s15, s16, s17, s18, s19, s20, s21);
		gen28_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s23, s24, s25, s26, s27, s28, s15, s16, s17, s18, s19, s20, s21, s22);
		gen28_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s24, s25, s26, s27, s28, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen28_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s25, s26, s27, s28, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen28_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s26, s27, s28, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen28_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s27, s28, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen28_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s28, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
	}

	private static final void gen28_15(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28){
		gen28_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen28_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s16);
		gen28_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s16, s17);
		gen28_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s16, s17, s18);
		gen28_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s20, s21, s22, s23, s24, s25, s26, s27, s28, s16, s17, s18, s19);
		gen28_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s21, s22, s23, s24, s25, s26, s27, s28, s16, s17, s18, s19, s20);
		gen28_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s22, s23, s24, s25, s26, s27, s28, s16, s17, s18, s19, s20, s21);
		gen28_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s23, s24, s25, s26, s27, s28, s16, s17, s18, s19, s20, s21, s22);
		gen28_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s24, s25, s26, s27, s28, s16, s17, s18, s19, s20, s21, s22, s23);
		gen28_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s25, s26, s27, s28, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen28_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s26, s27, s28, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen28_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s27, s28, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen28_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s28, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
	}

	private static final void gen28_16(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28){
		gen28_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen28_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s17);
		gen28_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s17, s18);
		gen28_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s20, s21, s22, s23, s24, s25, s26, s27, s28, s17, s18, s19);
		gen28_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s21, s22, s23, s24, s25, s26, s27, s28, s17, s18, s19, s20);
		gen28_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s22, s23, s24, s25, s26, s27, s28, s17, s18, s19, s20, s21);
		gen28_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s23, s24, s25, s26, s27, s28, s17, s18, s19, s20, s21, s22);
		gen28_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s24, s25, s26, s27, s28, s17, s18, s19, s20, s21, s22, s23);
		gen28_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s25, s26, s27, s28, s17, s18, s19, s20, s21, s22, s23, s24);
		gen28_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s26, s27, s28, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen28_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s27, s28, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen28_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s28, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
	}

	private static final void gen28_17(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28){
		gen28_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen28_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s18);
		gen28_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s20, s21, s22, s23, s24, s25, s26, s27, s28, s18, s19);
		gen28_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s21, s22, s23, s24, s25, s26, s27, s28, s18, s19, s20);
		gen28_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s22, s23, s24, s25, s26, s27, s28, s18, s19, s20, s21);
		gen28_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s23, s24, s25, s26, s27, s28, s18, s19, s20, s21, s22);
		gen28_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s24, s25, s26, s27, s28, s18, s19, s20, s21, s22, s23);
		gen28_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s25, s26, s27, s28, s18, s19, s20, s21, s22, s23, s24);
		gen28_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s26, s27, s28, s18, s19, s20, s21, s22, s23, s24, s25);
		gen28_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s27, s28, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen28_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s28, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
	}

	private static final void gen28_18(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28){
		gen28_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen28_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s20, s21, s22, s23, s24, s25, s26, s27, s28, s19);
		gen28_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s21, s22, s23, s24, s25, s26, s27, s28, s19, s20);
		gen28_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s22, s23, s24, s25, s26, s27, s28, s19, s20, s21);
		gen28_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s23, s24, s25, s26, s27, s28, s19, s20, s21, s22);
		gen28_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s24, s25, s26, s27, s28, s19, s20, s21, s22, s23);
		gen28_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s25, s26, s27, s28, s19, s20, s21, s22, s23, s24);
		gen28_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s26, s27, s28, s19, s20, s21, s22, s23, s24, s25);
		gen28_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s27, s28, s19, s20, s21, s22, s23, s24, s25, s26);
		gen28_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s28, s19, s20, s21, s22, s23, s24, s25, s26, s27);
	}

	private static final void gen28_19(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28){
		gen28_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen28_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s21, s22, s23, s24, s25, s26, s27, s28, s20);
		gen28_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s22, s23, s24, s25, s26, s27, s28, s20, s21);
		gen28_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s23, s24, s25, s26, s27, s28, s20, s21, s22);
		gen28_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s24, s25, s26, s27, s28, s20, s21, s22, s23);
		gen28_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s25, s26, s27, s28, s20, s21, s22, s23, s24);
		gen28_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s26, s27, s28, s20, s21, s22, s23, s24, s25);
		gen28_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s27, s28, s20, s21, s22, s23, s24, s25, s26);
		gen28_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s28, s20, s21, s22, s23, s24, s25, s26, s27);
	}

	private static final void gen28_20(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28){
		gen28_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen28_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s22, s23, s24, s25, s26, s27, s28, s21);
		gen28_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s23, s24, s25, s26, s27, s28, s21, s22);
		gen28_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s24, s25, s26, s27, s28, s21, s22, s23);
		gen28_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s25, s26, s27, s28, s21, s22, s23, s24);
		gen28_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s26, s27, s28, s21, s22, s23, s24, s25);
		gen28_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s27, s28, s21, s22, s23, s24, s25, s26);
		gen28_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s28, s21, s22, s23, s24, s25, s26, s27);
	}

	private static final void gen28_21(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28){
		gen28_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen28_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s23, s24, s25, s26, s27, s28, s22);
		gen28_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s24, s25, s26, s27, s28, s22, s23);
		gen28_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s25, s26, s27, s28, s22, s23, s24);
		gen28_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s26, s27, s28, s22, s23, s24, s25);
		gen28_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s27, s28, s22, s23, s24, s25, s26);
		gen28_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s28, s22, s23, s24, s25, s26, s27);
	}

	private static final void gen28_22(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28){
		gen28_23(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen28_23(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s24, s25, s26, s27, s28, s23);
		gen28_23(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s25, s26, s27, s28, s23, s24);
		gen28_23(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s26, s27, s28, s23, s24, s25);
		gen28_23(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s27, s28, s23, s24, s25, s26);
		gen28_23(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s28, s23, s24, s25, s26, s27);
	}

	private static final void gen28_23(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28){
		gen28_24(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen28_24(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s25, s26, s27, s28, s24);
		gen28_24(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s26, s27, s28, s24, s25);
		gen28_24(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s27, s28, s24, s25, s26);
		gen28_24(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s28, s24, s25, s26, s27);
	}

	private static final void gen28_24(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28){
		gen28_25(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen28_25(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s26, s27, s28, s25);
		gen28_25(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s27, s28, s25, s26);
		gen28_25(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s28, s25, s26, s27);
	}

	private static final void gen28_25(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28){
		gen28_26(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen28_26(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s27, s28, s26);
		gen28_26(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s28, s26, s27);
	}

	private static final void gen28_26(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28){
		pr.recieve28(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		pr.recieve28(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s28, s27);
	}

	private static final void gen29_0(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29){
		gen29_1(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
		gen29_1(pr,s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s1);
		gen29_1(pr,s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s1, s2);
		gen29_1(pr,s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s1, s2, s3);
		gen29_1(pr,s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s1, s2, s3, s4);
		gen29_1(pr,s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s1, s2, s3, s4, s5);
		gen29_1(pr,s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s1, s2, s3, s4, s5, s6);
		gen29_1(pr,s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s1, s2, s3, s4, s5, s6, s7);
		gen29_1(pr,s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s1, s2, s3, s4, s5, s6, s7, s8);
		gen29_1(pr,s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s1, s2, s3, s4, s5, s6, s7, s8, s9);
		gen29_1(pr,s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen29_1(pr,s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen29_1(pr,s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen29_1(pr,s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen29_1(pr,s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen29_1(pr,s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen29_1(pr,s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen29_1(pr,s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen29_1(pr,s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen29_1(pr,s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen29_1(pr,s21, s22, s23, s24, s25, s26, s27, s28, s29, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen29_1(pr,s22, s23, s24, s25, s26, s27, s28, s29, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen29_1(pr,s23, s24, s25, s26, s27, s28, s29, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen29_1(pr,s24, s25, s26, s27, s28, s29, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen29_1(pr,s25, s26, s27, s28, s29, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen29_1(pr,s26, s27, s28, s29, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen29_1(pr,s27, s28, s29, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen29_1(pr,s28, s29, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen29_1(pr,s29, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
	}

	private static final void gen29_1(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29){
		gen29_2(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
		gen29_2(pr,s1, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s2);
		gen29_2(pr,s1, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s2, s3);
		gen29_2(pr,s1, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s2, s3, s4);
		gen29_2(pr,s1, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s2, s3, s4, s5);
		gen29_2(pr,s1, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s2, s3, s4, s5, s6);
		gen29_2(pr,s1, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s2, s3, s4, s5, s6, s7);
		gen29_2(pr,s1, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s2, s3, s4, s5, s6, s7, s8);
		gen29_2(pr,s1, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s2, s3, s4, s5, s6, s7, s8, s9);
		gen29_2(pr,s1, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen29_2(pr,s1, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen29_2(pr,s1, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen29_2(pr,s1, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen29_2(pr,s1, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen29_2(pr,s1, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen29_2(pr,s1, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen29_2(pr,s1, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen29_2(pr,s1, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen29_2(pr,s1, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen29_2(pr,s1, s21, s22, s23, s24, s25, s26, s27, s28, s29, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen29_2(pr,s1, s22, s23, s24, s25, s26, s27, s28, s29, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen29_2(pr,s1, s23, s24, s25, s26, s27, s28, s29, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen29_2(pr,s1, s24, s25, s26, s27, s28, s29, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen29_2(pr,s1, s25, s26, s27, s28, s29, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen29_2(pr,s1, s26, s27, s28, s29, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen29_2(pr,s1, s27, s28, s29, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen29_2(pr,s1, s28, s29, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen29_2(pr,s1, s29, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
	}

	private static final void gen29_2(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29){
		gen29_3(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
		gen29_3(pr,s1, s2, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s3);
		gen29_3(pr,s1, s2, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s3, s4);
		gen29_3(pr,s1, s2, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s3, s4, s5);
		gen29_3(pr,s1, s2, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s3, s4, s5, s6);
		gen29_3(pr,s1, s2, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s3, s4, s5, s6, s7);
		gen29_3(pr,s1, s2, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s3, s4, s5, s6, s7, s8);
		gen29_3(pr,s1, s2, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s3, s4, s5, s6, s7, s8, s9);
		gen29_3(pr,s1, s2, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s3, s4, s5, s6, s7, s8, s9, s10);
		gen29_3(pr,s1, s2, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen29_3(pr,s1, s2, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen29_3(pr,s1, s2, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen29_3(pr,s1, s2, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen29_3(pr,s1, s2, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen29_3(pr,s1, s2, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen29_3(pr,s1, s2, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen29_3(pr,s1, s2, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen29_3(pr,s1, s2, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen29_3(pr,s1, s2, s21, s22, s23, s24, s25, s26, s27, s28, s29, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen29_3(pr,s1, s2, s22, s23, s24, s25, s26, s27, s28, s29, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen29_3(pr,s1, s2, s23, s24, s25, s26, s27, s28, s29, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen29_3(pr,s1, s2, s24, s25, s26, s27, s28, s29, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen29_3(pr,s1, s2, s25, s26, s27, s28, s29, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen29_3(pr,s1, s2, s26, s27, s28, s29, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen29_3(pr,s1, s2, s27, s28, s29, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen29_3(pr,s1, s2, s28, s29, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen29_3(pr,s1, s2, s29, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
	}

	private static final void gen29_3(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29){
		gen29_4(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
		gen29_4(pr,s1, s2, s3, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s4);
		gen29_4(pr,s1, s2, s3, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s4, s5);
		gen29_4(pr,s1, s2, s3, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s4, s5, s6);
		gen29_4(pr,s1, s2, s3, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s4, s5, s6, s7);
		gen29_4(pr,s1, s2, s3, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s4, s5, s6, s7, s8);
		gen29_4(pr,s1, s2, s3, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s4, s5, s6, s7, s8, s9);
		gen29_4(pr,s1, s2, s3, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s4, s5, s6, s7, s8, s9, s10);
		gen29_4(pr,s1, s2, s3, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s4, s5, s6, s7, s8, s9, s10, s11);
		gen29_4(pr,s1, s2, s3, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen29_4(pr,s1, s2, s3, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen29_4(pr,s1, s2, s3, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen29_4(pr,s1, s2, s3, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen29_4(pr,s1, s2, s3, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen29_4(pr,s1, s2, s3, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen29_4(pr,s1, s2, s3, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen29_4(pr,s1, s2, s3, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen29_4(pr,s1, s2, s3, s21, s22, s23, s24, s25, s26, s27, s28, s29, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen29_4(pr,s1, s2, s3, s22, s23, s24, s25, s26, s27, s28, s29, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen29_4(pr,s1, s2, s3, s23, s24, s25, s26, s27, s28, s29, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen29_4(pr,s1, s2, s3, s24, s25, s26, s27, s28, s29, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen29_4(pr,s1, s2, s3, s25, s26, s27, s28, s29, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen29_4(pr,s1, s2, s3, s26, s27, s28, s29, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen29_4(pr,s1, s2, s3, s27, s28, s29, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen29_4(pr,s1, s2, s3, s28, s29, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen29_4(pr,s1, s2, s3, s29, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
	}

	private static final void gen29_4(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29){
		gen29_5(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
		gen29_5(pr,s1, s2, s3, s4, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s5);
		gen29_5(pr,s1, s2, s3, s4, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s5, s6);
		gen29_5(pr,s1, s2, s3, s4, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s5, s6, s7);
		gen29_5(pr,s1, s2, s3, s4, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s5, s6, s7, s8);
		gen29_5(pr,s1, s2, s3, s4, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s5, s6, s7, s8, s9);
		gen29_5(pr,s1, s2, s3, s4, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s5, s6, s7, s8, s9, s10);
		gen29_5(pr,s1, s2, s3, s4, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s5, s6, s7, s8, s9, s10, s11);
		gen29_5(pr,s1, s2, s3, s4, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s5, s6, s7, s8, s9, s10, s11, s12);
		gen29_5(pr,s1, s2, s3, s4, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen29_5(pr,s1, s2, s3, s4, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen29_5(pr,s1, s2, s3, s4, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen29_5(pr,s1, s2, s3, s4, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen29_5(pr,s1, s2, s3, s4, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen29_5(pr,s1, s2, s3, s4, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen29_5(pr,s1, s2, s3, s4, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen29_5(pr,s1, s2, s3, s4, s21, s22, s23, s24, s25, s26, s27, s28, s29, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen29_5(pr,s1, s2, s3, s4, s22, s23, s24, s25, s26, s27, s28, s29, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen29_5(pr,s1, s2, s3, s4, s23, s24, s25, s26, s27, s28, s29, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen29_5(pr,s1, s2, s3, s4, s24, s25, s26, s27, s28, s29, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen29_5(pr,s1, s2, s3, s4, s25, s26, s27, s28, s29, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen29_5(pr,s1, s2, s3, s4, s26, s27, s28, s29, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen29_5(pr,s1, s2, s3, s4, s27, s28, s29, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen29_5(pr,s1, s2, s3, s4, s28, s29, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen29_5(pr,s1, s2, s3, s4, s29, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
	}

	private static final void gen29_5(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29){
		gen29_6(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
		gen29_6(pr,s1, s2, s3, s4, s5, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s6);
		gen29_6(pr,s1, s2, s3, s4, s5, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s6, s7);
		gen29_6(pr,s1, s2, s3, s4, s5, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s6, s7, s8);
		gen29_6(pr,s1, s2, s3, s4, s5, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s6, s7, s8, s9);
		gen29_6(pr,s1, s2, s3, s4, s5, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s6, s7, s8, s9, s10);
		gen29_6(pr,s1, s2, s3, s4, s5, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s6, s7, s8, s9, s10, s11);
		gen29_6(pr,s1, s2, s3, s4, s5, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s6, s7, s8, s9, s10, s11, s12);
		gen29_6(pr,s1, s2, s3, s4, s5, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s6, s7, s8, s9, s10, s11, s12, s13);
		gen29_6(pr,s1, s2, s3, s4, s5, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen29_6(pr,s1, s2, s3, s4, s5, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen29_6(pr,s1, s2, s3, s4, s5, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen29_6(pr,s1, s2, s3, s4, s5, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen29_6(pr,s1, s2, s3, s4, s5, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen29_6(pr,s1, s2, s3, s4, s5, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen29_6(pr,s1, s2, s3, s4, s5, s21, s22, s23, s24, s25, s26, s27, s28, s29, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen29_6(pr,s1, s2, s3, s4, s5, s22, s23, s24, s25, s26, s27, s28, s29, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen29_6(pr,s1, s2, s3, s4, s5, s23, s24, s25, s26, s27, s28, s29, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen29_6(pr,s1, s2, s3, s4, s5, s24, s25, s26, s27, s28, s29, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen29_6(pr,s1, s2, s3, s4, s5, s25, s26, s27, s28, s29, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen29_6(pr,s1, s2, s3, s4, s5, s26, s27, s28, s29, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen29_6(pr,s1, s2, s3, s4, s5, s27, s28, s29, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen29_6(pr,s1, s2, s3, s4, s5, s28, s29, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen29_6(pr,s1, s2, s3, s4, s5, s29, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
	}

	private static final void gen29_6(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29){
		gen29_7(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
		gen29_7(pr,s1, s2, s3, s4, s5, s6, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s7);
		gen29_7(pr,s1, s2, s3, s4, s5, s6, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s7, s8);
		gen29_7(pr,s1, s2, s3, s4, s5, s6, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s7, s8, s9);
		gen29_7(pr,s1, s2, s3, s4, s5, s6, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s7, s8, s9, s10);
		gen29_7(pr,s1, s2, s3, s4, s5, s6, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s7, s8, s9, s10, s11);
		gen29_7(pr,s1, s2, s3, s4, s5, s6, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s7, s8, s9, s10, s11, s12);
		gen29_7(pr,s1, s2, s3, s4, s5, s6, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s7, s8, s9, s10, s11, s12, s13);
		gen29_7(pr,s1, s2, s3, s4, s5, s6, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s7, s8, s9, s10, s11, s12, s13, s14);
		gen29_7(pr,s1, s2, s3, s4, s5, s6, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen29_7(pr,s1, s2, s3, s4, s5, s6, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen29_7(pr,s1, s2, s3, s4, s5, s6, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen29_7(pr,s1, s2, s3, s4, s5, s6, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen29_7(pr,s1, s2, s3, s4, s5, s6, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen29_7(pr,s1, s2, s3, s4, s5, s6, s21, s22, s23, s24, s25, s26, s27, s28, s29, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen29_7(pr,s1, s2, s3, s4, s5, s6, s22, s23, s24, s25, s26, s27, s28, s29, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen29_7(pr,s1, s2, s3, s4, s5, s6, s23, s24, s25, s26, s27, s28, s29, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen29_7(pr,s1, s2, s3, s4, s5, s6, s24, s25, s26, s27, s28, s29, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen29_7(pr,s1, s2, s3, s4, s5, s6, s25, s26, s27, s28, s29, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen29_7(pr,s1, s2, s3, s4, s5, s6, s26, s27, s28, s29, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen29_7(pr,s1, s2, s3, s4, s5, s6, s27, s28, s29, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen29_7(pr,s1, s2, s3, s4, s5, s6, s28, s29, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen29_7(pr,s1, s2, s3, s4, s5, s6, s29, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
	}

	private static final void gen29_7(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29){
		gen29_8(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
		gen29_8(pr,s1, s2, s3, s4, s5, s6, s7, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s8);
		gen29_8(pr,s1, s2, s3, s4, s5, s6, s7, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s8, s9);
		gen29_8(pr,s1, s2, s3, s4, s5, s6, s7, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s8, s9, s10);
		gen29_8(pr,s1, s2, s3, s4, s5, s6, s7, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s8, s9, s10, s11);
		gen29_8(pr,s1, s2, s3, s4, s5, s6, s7, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s8, s9, s10, s11, s12);
		gen29_8(pr,s1, s2, s3, s4, s5, s6, s7, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s8, s9, s10, s11, s12, s13);
		gen29_8(pr,s1, s2, s3, s4, s5, s6, s7, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s8, s9, s10, s11, s12, s13, s14);
		gen29_8(pr,s1, s2, s3, s4, s5, s6, s7, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s8, s9, s10, s11, s12, s13, s14, s15);
		gen29_8(pr,s1, s2, s3, s4, s5, s6, s7, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen29_8(pr,s1, s2, s3, s4, s5, s6, s7, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen29_8(pr,s1, s2, s3, s4, s5, s6, s7, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen29_8(pr,s1, s2, s3, s4, s5, s6, s7, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen29_8(pr,s1, s2, s3, s4, s5, s6, s7, s21, s22, s23, s24, s25, s26, s27, s28, s29, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen29_8(pr,s1, s2, s3, s4, s5, s6, s7, s22, s23, s24, s25, s26, s27, s28, s29, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen29_8(pr,s1, s2, s3, s4, s5, s6, s7, s23, s24, s25, s26, s27, s28, s29, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen29_8(pr,s1, s2, s3, s4, s5, s6, s7, s24, s25, s26, s27, s28, s29, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen29_8(pr,s1, s2, s3, s4, s5, s6, s7, s25, s26, s27, s28, s29, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen29_8(pr,s1, s2, s3, s4, s5, s6, s7, s26, s27, s28, s29, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen29_8(pr,s1, s2, s3, s4, s5, s6, s7, s27, s28, s29, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen29_8(pr,s1, s2, s3, s4, s5, s6, s7, s28, s29, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen29_8(pr,s1, s2, s3, s4, s5, s6, s7, s29, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
	}

	private static final void gen29_8(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29){
		gen29_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
		gen29_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s9);
		gen29_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s9, s10);
		gen29_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s9, s10, s11);
		gen29_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s9, s10, s11, s12);
		gen29_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s9, s10, s11, s12, s13);
		gen29_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s9, s10, s11, s12, s13, s14);
		gen29_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s9, s10, s11, s12, s13, s14, s15);
		gen29_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s9, s10, s11, s12, s13, s14, s15, s16);
		gen29_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen29_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen29_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen29_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s21, s22, s23, s24, s25, s26, s27, s28, s29, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen29_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s22, s23, s24, s25, s26, s27, s28, s29, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen29_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s23, s24, s25, s26, s27, s28, s29, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen29_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s24, s25, s26, s27, s28, s29, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen29_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s25, s26, s27, s28, s29, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen29_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s26, s27, s28, s29, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen29_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s27, s28, s29, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen29_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s28, s29, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen29_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s29, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
	}

	private static final void gen29_9(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29){
		gen29_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
		gen29_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s10);
		gen29_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s10, s11);
		gen29_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s10, s11, s12);
		gen29_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s10, s11, s12, s13);
		gen29_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s10, s11, s12, s13, s14);
		gen29_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s10, s11, s12, s13, s14, s15);
		gen29_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s10, s11, s12, s13, s14, s15, s16);
		gen29_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s10, s11, s12, s13, s14, s15, s16, s17);
		gen29_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen29_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen29_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s21, s22, s23, s24, s25, s26, s27, s28, s29, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen29_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s22, s23, s24, s25, s26, s27, s28, s29, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen29_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s23, s24, s25, s26, s27, s28, s29, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen29_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s24, s25, s26, s27, s28, s29, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen29_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s25, s26, s27, s28, s29, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen29_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s26, s27, s28, s29, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen29_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s27, s28, s29, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen29_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s28, s29, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen29_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s29, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
	}

	private static final void gen29_10(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29){
		gen29_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
		gen29_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s11);
		gen29_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s11, s12);
		gen29_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s11, s12, s13);
		gen29_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s11, s12, s13, s14);
		gen29_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s11, s12, s13, s14, s15);
		gen29_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s11, s12, s13, s14, s15, s16);
		gen29_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s11, s12, s13, s14, s15, s16, s17);
		gen29_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s11, s12, s13, s14, s15, s16, s17, s18);
		gen29_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen29_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s21, s22, s23, s24, s25, s26, s27, s28, s29, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen29_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s22, s23, s24, s25, s26, s27, s28, s29, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen29_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s23, s24, s25, s26, s27, s28, s29, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen29_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s24, s25, s26, s27, s28, s29, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen29_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s25, s26, s27, s28, s29, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen29_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s26, s27, s28, s29, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen29_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s27, s28, s29, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen29_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s28, s29, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen29_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s29, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
	}

	private static final void gen29_11(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29){
		gen29_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
		gen29_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s12);
		gen29_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s12, s13);
		gen29_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s12, s13, s14);
		gen29_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s12, s13, s14, s15);
		gen29_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s12, s13, s14, s15, s16);
		gen29_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s12, s13, s14, s15, s16, s17);
		gen29_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s12, s13, s14, s15, s16, s17, s18);
		gen29_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s12, s13, s14, s15, s16, s17, s18, s19);
		gen29_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s21, s22, s23, s24, s25, s26, s27, s28, s29, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen29_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s22, s23, s24, s25, s26, s27, s28, s29, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen29_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s23, s24, s25, s26, s27, s28, s29, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen29_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s24, s25, s26, s27, s28, s29, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen29_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s25, s26, s27, s28, s29, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen29_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s26, s27, s28, s29, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen29_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s27, s28, s29, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen29_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s28, s29, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen29_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s29, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
	}

	private static final void gen29_12(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29){
		gen29_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
		gen29_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s13);
		gen29_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s13, s14);
		gen29_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s13, s14, s15);
		gen29_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s13, s14, s15, s16);
		gen29_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s13, s14, s15, s16, s17);
		gen29_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s13, s14, s15, s16, s17, s18);
		gen29_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s13, s14, s15, s16, s17, s18, s19);
		gen29_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s21, s22, s23, s24, s25, s26, s27, s28, s29, s13, s14, s15, s16, s17, s18, s19, s20);
		gen29_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s22, s23, s24, s25, s26, s27, s28, s29, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen29_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s23, s24, s25, s26, s27, s28, s29, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen29_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s24, s25, s26, s27, s28, s29, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen29_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s25, s26, s27, s28, s29, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen29_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s26, s27, s28, s29, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen29_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s27, s28, s29, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen29_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s28, s29, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen29_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s29, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
	}

	private static final void gen29_13(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29){
		gen29_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
		gen29_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s14);
		gen29_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s14, s15);
		gen29_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s14, s15, s16);
		gen29_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s14, s15, s16, s17);
		gen29_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s14, s15, s16, s17, s18);
		gen29_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s14, s15, s16, s17, s18, s19);
		gen29_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s21, s22, s23, s24, s25, s26, s27, s28, s29, s14, s15, s16, s17, s18, s19, s20);
		gen29_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s22, s23, s24, s25, s26, s27, s28, s29, s14, s15, s16, s17, s18, s19, s20, s21);
		gen29_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s23, s24, s25, s26, s27, s28, s29, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen29_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s24, s25, s26, s27, s28, s29, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen29_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s25, s26, s27, s28, s29, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen29_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s26, s27, s28, s29, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen29_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s27, s28, s29, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen29_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s28, s29, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen29_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s29, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
	}

	private static final void gen29_14(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29){
		gen29_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
		gen29_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s15);
		gen29_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s15, s16);
		gen29_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s15, s16, s17);
		gen29_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s15, s16, s17, s18);
		gen29_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s15, s16, s17, s18, s19);
		gen29_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s21, s22, s23, s24, s25, s26, s27, s28, s29, s15, s16, s17, s18, s19, s20);
		gen29_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s22, s23, s24, s25, s26, s27, s28, s29, s15, s16, s17, s18, s19, s20, s21);
		gen29_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s23, s24, s25, s26, s27, s28, s29, s15, s16, s17, s18, s19, s20, s21, s22);
		gen29_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s24, s25, s26, s27, s28, s29, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen29_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s25, s26, s27, s28, s29, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen29_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s26, s27, s28, s29, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen29_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s27, s28, s29, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen29_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s28, s29, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen29_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s29, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
	}

	private static final void gen29_15(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29){
		gen29_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
		gen29_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s16);
		gen29_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s16, s17);
		gen29_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s16, s17, s18);
		gen29_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s16, s17, s18, s19);
		gen29_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s21, s22, s23, s24, s25, s26, s27, s28, s29, s16, s17, s18, s19, s20);
		gen29_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s22, s23, s24, s25, s26, s27, s28, s29, s16, s17, s18, s19, s20, s21);
		gen29_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s23, s24, s25, s26, s27, s28, s29, s16, s17, s18, s19, s20, s21, s22);
		gen29_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s24, s25, s26, s27, s28, s29, s16, s17, s18, s19, s20, s21, s22, s23);
		gen29_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s25, s26, s27, s28, s29, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen29_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s26, s27, s28, s29, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen29_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s27, s28, s29, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen29_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s28, s29, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen29_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s29, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
	}

	private static final void gen29_16(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29){
		gen29_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
		gen29_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s17);
		gen29_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s17, s18);
		gen29_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s17, s18, s19);
		gen29_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s21, s22, s23, s24, s25, s26, s27, s28, s29, s17, s18, s19, s20);
		gen29_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s22, s23, s24, s25, s26, s27, s28, s29, s17, s18, s19, s20, s21);
		gen29_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s23, s24, s25, s26, s27, s28, s29, s17, s18, s19, s20, s21, s22);
		gen29_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s24, s25, s26, s27, s28, s29, s17, s18, s19, s20, s21, s22, s23);
		gen29_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s25, s26, s27, s28, s29, s17, s18, s19, s20, s21, s22, s23, s24);
		gen29_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s26, s27, s28, s29, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen29_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s27, s28, s29, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen29_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s28, s29, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen29_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s29, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
	}

	private static final void gen29_17(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29){
		gen29_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
		gen29_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s18);
		gen29_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s18, s19);
		gen29_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s21, s22, s23, s24, s25, s26, s27, s28, s29, s18, s19, s20);
		gen29_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s22, s23, s24, s25, s26, s27, s28, s29, s18, s19, s20, s21);
		gen29_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s23, s24, s25, s26, s27, s28, s29, s18, s19, s20, s21, s22);
		gen29_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s24, s25, s26, s27, s28, s29, s18, s19, s20, s21, s22, s23);
		gen29_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s25, s26, s27, s28, s29, s18, s19, s20, s21, s22, s23, s24);
		gen29_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s26, s27, s28, s29, s18, s19, s20, s21, s22, s23, s24, s25);
		gen29_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s27, s28, s29, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen29_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s28, s29, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen29_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s29, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
	}

	private static final void gen29_18(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29){
		gen29_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
		gen29_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s19);
		gen29_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s21, s22, s23, s24, s25, s26, s27, s28, s29, s19, s20);
		gen29_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s22, s23, s24, s25, s26, s27, s28, s29, s19, s20, s21);
		gen29_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s23, s24, s25, s26, s27, s28, s29, s19, s20, s21, s22);
		gen29_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s24, s25, s26, s27, s28, s29, s19, s20, s21, s22, s23);
		gen29_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s25, s26, s27, s28, s29, s19, s20, s21, s22, s23, s24);
		gen29_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s26, s27, s28, s29, s19, s20, s21, s22, s23, s24, s25);
		gen29_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s27, s28, s29, s19, s20, s21, s22, s23, s24, s25, s26);
		gen29_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s28, s29, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen29_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s29, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
	}

	private static final void gen29_19(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29){
		gen29_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
		gen29_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s21, s22, s23, s24, s25, s26, s27, s28, s29, s20);
		gen29_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s22, s23, s24, s25, s26, s27, s28, s29, s20, s21);
		gen29_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s23, s24, s25, s26, s27, s28, s29, s20, s21, s22);
		gen29_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s24, s25, s26, s27, s28, s29, s20, s21, s22, s23);
		gen29_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s25, s26, s27, s28, s29, s20, s21, s22, s23, s24);
		gen29_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s26, s27, s28, s29, s20, s21, s22, s23, s24, s25);
		gen29_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s27, s28, s29, s20, s21, s22, s23, s24, s25, s26);
		gen29_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s28, s29, s20, s21, s22, s23, s24, s25, s26, s27);
		gen29_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s29, s20, s21, s22, s23, s24, s25, s26, s27, s28);
	}

	private static final void gen29_20(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29){
		gen29_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
		gen29_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s22, s23, s24, s25, s26, s27, s28, s29, s21);
		gen29_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s23, s24, s25, s26, s27, s28, s29, s21, s22);
		gen29_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s24, s25, s26, s27, s28, s29, s21, s22, s23);
		gen29_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s25, s26, s27, s28, s29, s21, s22, s23, s24);
		gen29_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s26, s27, s28, s29, s21, s22, s23, s24, s25);
		gen29_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s27, s28, s29, s21, s22, s23, s24, s25, s26);
		gen29_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s28, s29, s21, s22, s23, s24, s25, s26, s27);
		gen29_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s29, s21, s22, s23, s24, s25, s26, s27, s28);
	}

	private static final void gen29_21(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29){
		gen29_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
		gen29_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s23, s24, s25, s26, s27, s28, s29, s22);
		gen29_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s24, s25, s26, s27, s28, s29, s22, s23);
		gen29_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s25, s26, s27, s28, s29, s22, s23, s24);
		gen29_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s26, s27, s28, s29, s22, s23, s24, s25);
		gen29_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s27, s28, s29, s22, s23, s24, s25, s26);
		gen29_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s28, s29, s22, s23, s24, s25, s26, s27);
		gen29_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s29, s22, s23, s24, s25, s26, s27, s28);
	}

	private static final void gen29_22(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29){
		gen29_23(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
		gen29_23(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s24, s25, s26, s27, s28, s29, s23);
		gen29_23(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s25, s26, s27, s28, s29, s23, s24);
		gen29_23(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s26, s27, s28, s29, s23, s24, s25);
		gen29_23(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s27, s28, s29, s23, s24, s25, s26);
		gen29_23(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s28, s29, s23, s24, s25, s26, s27);
		gen29_23(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s29, s23, s24, s25, s26, s27, s28);
	}

	private static final void gen29_23(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29){
		gen29_24(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
		gen29_24(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s25, s26, s27, s28, s29, s24);
		gen29_24(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s26, s27, s28, s29, s24, s25);
		gen29_24(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s27, s28, s29, s24, s25, s26);
		gen29_24(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s28, s29, s24, s25, s26, s27);
		gen29_24(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s29, s24, s25, s26, s27, s28);
	}

	private static final void gen29_24(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29){
		gen29_25(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
		gen29_25(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s26, s27, s28, s29, s25);
		gen29_25(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s27, s28, s29, s25, s26);
		gen29_25(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s28, s29, s25, s26, s27);
		gen29_25(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s29, s25, s26, s27, s28);
	}

	private static final void gen29_25(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29){
		gen29_26(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
		gen29_26(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s27, s28, s29, s26);
		gen29_26(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s28, s29, s26, s27);
		gen29_26(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s29, s26, s27, s28);
	}

	private static final void gen29_26(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29){
		gen29_27(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
		gen29_27(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s28, s29, s27);
		gen29_27(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s29, s27, s28);
	}

	private static final void gen29_27(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29){
		pr.recieve29(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
		pr.recieve29(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s29, s28);
	}

	private static final void gen30_0(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29, int s30){
		gen30_1(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30);
		gen30_1(pr,s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s1);
		gen30_1(pr,s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s1, s2);
		gen30_1(pr,s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s1, s2, s3);
		gen30_1(pr,s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s1, s2, s3, s4);
		gen30_1(pr,s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s1, s2, s3, s4, s5);
		gen30_1(pr,s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s1, s2, s3, s4, s5, s6);
		gen30_1(pr,s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s1, s2, s3, s4, s5, s6, s7);
		gen30_1(pr,s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s1, s2, s3, s4, s5, s6, s7, s8);
		gen30_1(pr,s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s1, s2, s3, s4, s5, s6, s7, s8, s9);
		gen30_1(pr,s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen30_1(pr,s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen30_1(pr,s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen30_1(pr,s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen30_1(pr,s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen30_1(pr,s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen30_1(pr,s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen30_1(pr,s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen30_1(pr,s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen30_1(pr,s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen30_1(pr,s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen30_1(pr,s22, s23, s24, s25, s26, s27, s28, s29, s30, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen30_1(pr,s23, s24, s25, s26, s27, s28, s29, s30, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen30_1(pr,s24, s25, s26, s27, s28, s29, s30, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen30_1(pr,s25, s26, s27, s28, s29, s30, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen30_1(pr,s26, s27, s28, s29, s30, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen30_1(pr,s27, s28, s29, s30, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen30_1(pr,s28, s29, s30, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen30_1(pr,s29, s30, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen30_1(pr,s30, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
	}

	private static final void gen30_1(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29, int s30){
		gen30_2(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30);
		gen30_2(pr,s1, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s2);
		gen30_2(pr,s1, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s2, s3);
		gen30_2(pr,s1, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s2, s3, s4);
		gen30_2(pr,s1, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s2, s3, s4, s5);
		gen30_2(pr,s1, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s2, s3, s4, s5, s6);
		gen30_2(pr,s1, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s2, s3, s4, s5, s6, s7);
		gen30_2(pr,s1, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s2, s3, s4, s5, s6, s7, s8);
		gen30_2(pr,s1, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s2, s3, s4, s5, s6, s7, s8, s9);
		gen30_2(pr,s1, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s2, s3, s4, s5, s6, s7, s8, s9, s10);
		gen30_2(pr,s1, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen30_2(pr,s1, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen30_2(pr,s1, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen30_2(pr,s1, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen30_2(pr,s1, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen30_2(pr,s1, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen30_2(pr,s1, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen30_2(pr,s1, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen30_2(pr,s1, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen30_2(pr,s1, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen30_2(pr,s1, s22, s23, s24, s25, s26, s27, s28, s29, s30, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen30_2(pr,s1, s23, s24, s25, s26, s27, s28, s29, s30, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen30_2(pr,s1, s24, s25, s26, s27, s28, s29, s30, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen30_2(pr,s1, s25, s26, s27, s28, s29, s30, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen30_2(pr,s1, s26, s27, s28, s29, s30, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen30_2(pr,s1, s27, s28, s29, s30, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen30_2(pr,s1, s28, s29, s30, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen30_2(pr,s1, s29, s30, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen30_2(pr,s1, s30, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
	}

	private static final void gen30_2(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29, int s30){
		gen30_3(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30);
		gen30_3(pr,s1, s2, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s3);
		gen30_3(pr,s1, s2, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s3, s4);
		gen30_3(pr,s1, s2, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s3, s4, s5);
		gen30_3(pr,s1, s2, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s3, s4, s5, s6);
		gen30_3(pr,s1, s2, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s3, s4, s5, s6, s7);
		gen30_3(pr,s1, s2, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s3, s4, s5, s6, s7, s8);
		gen30_3(pr,s1, s2, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s3, s4, s5, s6, s7, s8, s9);
		gen30_3(pr,s1, s2, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s3, s4, s5, s6, s7, s8, s9, s10);
		gen30_3(pr,s1, s2, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s3, s4, s5, s6, s7, s8, s9, s10, s11);
		gen30_3(pr,s1, s2, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen30_3(pr,s1, s2, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen30_3(pr,s1, s2, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen30_3(pr,s1, s2, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen30_3(pr,s1, s2, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen30_3(pr,s1, s2, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen30_3(pr,s1, s2, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen30_3(pr,s1, s2, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen30_3(pr,s1, s2, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen30_3(pr,s1, s2, s22, s23, s24, s25, s26, s27, s28, s29, s30, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen30_3(pr,s1, s2, s23, s24, s25, s26, s27, s28, s29, s30, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen30_3(pr,s1, s2, s24, s25, s26, s27, s28, s29, s30, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen30_3(pr,s1, s2, s25, s26, s27, s28, s29, s30, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen30_3(pr,s1, s2, s26, s27, s28, s29, s30, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen30_3(pr,s1, s2, s27, s28, s29, s30, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen30_3(pr,s1, s2, s28, s29, s30, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen30_3(pr,s1, s2, s29, s30, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen30_3(pr,s1, s2, s30, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
	}

	private static final void gen30_3(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29, int s30){
		gen30_4(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30);
		gen30_4(pr,s1, s2, s3, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s4);
		gen30_4(pr,s1, s2, s3, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s4, s5);
		gen30_4(pr,s1, s2, s3, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s4, s5, s6);
		gen30_4(pr,s1, s2, s3, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s4, s5, s6, s7);
		gen30_4(pr,s1, s2, s3, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s4, s5, s6, s7, s8);
		gen30_4(pr,s1, s2, s3, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s4, s5, s6, s7, s8, s9);
		gen30_4(pr,s1, s2, s3, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s4, s5, s6, s7, s8, s9, s10);
		gen30_4(pr,s1, s2, s3, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s4, s5, s6, s7, s8, s9, s10, s11);
		gen30_4(pr,s1, s2, s3, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		gen30_4(pr,s1, s2, s3, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen30_4(pr,s1, s2, s3, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen30_4(pr,s1, s2, s3, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen30_4(pr,s1, s2, s3, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen30_4(pr,s1, s2, s3, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen30_4(pr,s1, s2, s3, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen30_4(pr,s1, s2, s3, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen30_4(pr,s1, s2, s3, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen30_4(pr,s1, s2, s3, s22, s23, s24, s25, s26, s27, s28, s29, s30, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen30_4(pr,s1, s2, s3, s23, s24, s25, s26, s27, s28, s29, s30, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen30_4(pr,s1, s2, s3, s24, s25, s26, s27, s28, s29, s30, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen30_4(pr,s1, s2, s3, s25, s26, s27, s28, s29, s30, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen30_4(pr,s1, s2, s3, s26, s27, s28, s29, s30, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen30_4(pr,s1, s2, s3, s27, s28, s29, s30, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen30_4(pr,s1, s2, s3, s28, s29, s30, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen30_4(pr,s1, s2, s3, s29, s30, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen30_4(pr,s1, s2, s3, s30, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
	}

	private static final void gen30_4(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29, int s30){
		gen30_5(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30);
		gen30_5(pr,s1, s2, s3, s4, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s5);
		gen30_5(pr,s1, s2, s3, s4, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s5, s6);
		gen30_5(pr,s1, s2, s3, s4, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s5, s6, s7);
		gen30_5(pr,s1, s2, s3, s4, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s5, s6, s7, s8);
		gen30_5(pr,s1, s2, s3, s4, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s5, s6, s7, s8, s9);
		gen30_5(pr,s1, s2, s3, s4, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s5, s6, s7, s8, s9, s10);
		gen30_5(pr,s1, s2, s3, s4, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s5, s6, s7, s8, s9, s10, s11);
		gen30_5(pr,s1, s2, s3, s4, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s5, s6, s7, s8, s9, s10, s11, s12);
		gen30_5(pr,s1, s2, s3, s4, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s5, s6, s7, s8, s9, s10, s11, s12, s13);
		gen30_5(pr,s1, s2, s3, s4, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen30_5(pr,s1, s2, s3, s4, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen30_5(pr,s1, s2, s3, s4, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen30_5(pr,s1, s2, s3, s4, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen30_5(pr,s1, s2, s3, s4, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen30_5(pr,s1, s2, s3, s4, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen30_5(pr,s1, s2, s3, s4, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen30_5(pr,s1, s2, s3, s4, s22, s23, s24, s25, s26, s27, s28, s29, s30, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen30_5(pr,s1, s2, s3, s4, s23, s24, s25, s26, s27, s28, s29, s30, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen30_5(pr,s1, s2, s3, s4, s24, s25, s26, s27, s28, s29, s30, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen30_5(pr,s1, s2, s3, s4, s25, s26, s27, s28, s29, s30, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen30_5(pr,s1, s2, s3, s4, s26, s27, s28, s29, s30, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen30_5(pr,s1, s2, s3, s4, s27, s28, s29, s30, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen30_5(pr,s1, s2, s3, s4, s28, s29, s30, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen30_5(pr,s1, s2, s3, s4, s29, s30, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen30_5(pr,s1, s2, s3, s4, s30, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
	}

	private static final void gen30_5(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29, int s30){
		gen30_6(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30);
		gen30_6(pr,s1, s2, s3, s4, s5, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s6);
		gen30_6(pr,s1, s2, s3, s4, s5, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s6, s7);
		gen30_6(pr,s1, s2, s3, s4, s5, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s6, s7, s8);
		gen30_6(pr,s1, s2, s3, s4, s5, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s6, s7, s8, s9);
		gen30_6(pr,s1, s2, s3, s4, s5, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s6, s7, s8, s9, s10);
		gen30_6(pr,s1, s2, s3, s4, s5, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s6, s7, s8, s9, s10, s11);
		gen30_6(pr,s1, s2, s3, s4, s5, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s6, s7, s8, s9, s10, s11, s12);
		gen30_6(pr,s1, s2, s3, s4, s5, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s6, s7, s8, s9, s10, s11, s12, s13);
		gen30_6(pr,s1, s2, s3, s4, s5, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s6, s7, s8, s9, s10, s11, s12, s13, s14);
		gen30_6(pr,s1, s2, s3, s4, s5, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen30_6(pr,s1, s2, s3, s4, s5, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen30_6(pr,s1, s2, s3, s4, s5, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen30_6(pr,s1, s2, s3, s4, s5, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen30_6(pr,s1, s2, s3, s4, s5, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen30_6(pr,s1, s2, s3, s4, s5, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen30_6(pr,s1, s2, s3, s4, s5, s22, s23, s24, s25, s26, s27, s28, s29, s30, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen30_6(pr,s1, s2, s3, s4, s5, s23, s24, s25, s26, s27, s28, s29, s30, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen30_6(pr,s1, s2, s3, s4, s5, s24, s25, s26, s27, s28, s29, s30, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen30_6(pr,s1, s2, s3, s4, s5, s25, s26, s27, s28, s29, s30, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen30_6(pr,s1, s2, s3, s4, s5, s26, s27, s28, s29, s30, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen30_6(pr,s1, s2, s3, s4, s5, s27, s28, s29, s30, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen30_6(pr,s1, s2, s3, s4, s5, s28, s29, s30, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen30_6(pr,s1, s2, s3, s4, s5, s29, s30, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen30_6(pr,s1, s2, s3, s4, s5, s30, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
	}

	private static final void gen30_6(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29, int s30){
		gen30_7(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30);
		gen30_7(pr,s1, s2, s3, s4, s5, s6, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s7);
		gen30_7(pr,s1, s2, s3, s4, s5, s6, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s7, s8);
		gen30_7(pr,s1, s2, s3, s4, s5, s6, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s7, s8, s9);
		gen30_7(pr,s1, s2, s3, s4, s5, s6, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s7, s8, s9, s10);
		gen30_7(pr,s1, s2, s3, s4, s5, s6, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s7, s8, s9, s10, s11);
		gen30_7(pr,s1, s2, s3, s4, s5, s6, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s7, s8, s9, s10, s11, s12);
		gen30_7(pr,s1, s2, s3, s4, s5, s6, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s7, s8, s9, s10, s11, s12, s13);
		gen30_7(pr,s1, s2, s3, s4, s5, s6, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s7, s8, s9, s10, s11, s12, s13, s14);
		gen30_7(pr,s1, s2, s3, s4, s5, s6, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s7, s8, s9, s10, s11, s12, s13, s14, s15);
		gen30_7(pr,s1, s2, s3, s4, s5, s6, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen30_7(pr,s1, s2, s3, s4, s5, s6, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen30_7(pr,s1, s2, s3, s4, s5, s6, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen30_7(pr,s1, s2, s3, s4, s5, s6, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen30_7(pr,s1, s2, s3, s4, s5, s6, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen30_7(pr,s1, s2, s3, s4, s5, s6, s22, s23, s24, s25, s26, s27, s28, s29, s30, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen30_7(pr,s1, s2, s3, s4, s5, s6, s23, s24, s25, s26, s27, s28, s29, s30, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen30_7(pr,s1, s2, s3, s4, s5, s6, s24, s25, s26, s27, s28, s29, s30, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen30_7(pr,s1, s2, s3, s4, s5, s6, s25, s26, s27, s28, s29, s30, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen30_7(pr,s1, s2, s3, s4, s5, s6, s26, s27, s28, s29, s30, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen30_7(pr,s1, s2, s3, s4, s5, s6, s27, s28, s29, s30, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen30_7(pr,s1, s2, s3, s4, s5, s6, s28, s29, s30, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen30_7(pr,s1, s2, s3, s4, s5, s6, s29, s30, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen30_7(pr,s1, s2, s3, s4, s5, s6, s30, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
	}

	private static final void gen30_7(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29, int s30){
		gen30_8(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30);
		gen30_8(pr,s1, s2, s3, s4, s5, s6, s7, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s8);
		gen30_8(pr,s1, s2, s3, s4, s5, s6, s7, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s8, s9);
		gen30_8(pr,s1, s2, s3, s4, s5, s6, s7, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s8, s9, s10);
		gen30_8(pr,s1, s2, s3, s4, s5, s6, s7, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s8, s9, s10, s11);
		gen30_8(pr,s1, s2, s3, s4, s5, s6, s7, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s8, s9, s10, s11, s12);
		gen30_8(pr,s1, s2, s3, s4, s5, s6, s7, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s8, s9, s10, s11, s12, s13);
		gen30_8(pr,s1, s2, s3, s4, s5, s6, s7, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s8, s9, s10, s11, s12, s13, s14);
		gen30_8(pr,s1, s2, s3, s4, s5, s6, s7, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s8, s9, s10, s11, s12, s13, s14, s15);
		gen30_8(pr,s1, s2, s3, s4, s5, s6, s7, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s8, s9, s10, s11, s12, s13, s14, s15, s16);
		gen30_8(pr,s1, s2, s3, s4, s5, s6, s7, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen30_8(pr,s1, s2, s3, s4, s5, s6, s7, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen30_8(pr,s1, s2, s3, s4, s5, s6, s7, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen30_8(pr,s1, s2, s3, s4, s5, s6, s7, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen30_8(pr,s1, s2, s3, s4, s5, s6, s7, s22, s23, s24, s25, s26, s27, s28, s29, s30, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen30_8(pr,s1, s2, s3, s4, s5, s6, s7, s23, s24, s25, s26, s27, s28, s29, s30, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen30_8(pr,s1, s2, s3, s4, s5, s6, s7, s24, s25, s26, s27, s28, s29, s30, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen30_8(pr,s1, s2, s3, s4, s5, s6, s7, s25, s26, s27, s28, s29, s30, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen30_8(pr,s1, s2, s3, s4, s5, s6, s7, s26, s27, s28, s29, s30, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen30_8(pr,s1, s2, s3, s4, s5, s6, s7, s27, s28, s29, s30, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen30_8(pr,s1, s2, s3, s4, s5, s6, s7, s28, s29, s30, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen30_8(pr,s1, s2, s3, s4, s5, s6, s7, s29, s30, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen30_8(pr,s1, s2, s3, s4, s5, s6, s7, s30, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
	}

	private static final void gen30_8(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29, int s30){
		gen30_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30);
		gen30_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s9);
		gen30_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s9, s10);
		gen30_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s9, s10, s11);
		gen30_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s9, s10, s11, s12);
		gen30_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s9, s10, s11, s12, s13);
		gen30_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s9, s10, s11, s12, s13, s14);
		gen30_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s9, s10, s11, s12, s13, s14, s15);
		gen30_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s9, s10, s11, s12, s13, s14, s15, s16);
		gen30_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s9, s10, s11, s12, s13, s14, s15, s16, s17);
		gen30_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen30_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen30_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen30_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s22, s23, s24, s25, s26, s27, s28, s29, s30, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen30_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s23, s24, s25, s26, s27, s28, s29, s30, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen30_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s24, s25, s26, s27, s28, s29, s30, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen30_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s25, s26, s27, s28, s29, s30, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen30_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s26, s27, s28, s29, s30, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen30_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s27, s28, s29, s30, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen30_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s28, s29, s30, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen30_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s29, s30, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen30_9(pr,s1, s2, s3, s4, s5, s6, s7, s8, s30, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
	}

	private static final void gen30_9(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29, int s30){
		gen30_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30);
		gen30_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s10);
		gen30_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s10, s11);
		gen30_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s10, s11, s12);
		gen30_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s10, s11, s12, s13);
		gen30_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s10, s11, s12, s13, s14);
		gen30_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s10, s11, s12, s13, s14, s15);
		gen30_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s10, s11, s12, s13, s14, s15, s16);
		gen30_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s10, s11, s12, s13, s14, s15, s16, s17);
		gen30_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s10, s11, s12, s13, s14, s15, s16, s17, s18);
		gen30_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen30_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen30_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s22, s23, s24, s25, s26, s27, s28, s29, s30, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen30_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s23, s24, s25, s26, s27, s28, s29, s30, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen30_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s24, s25, s26, s27, s28, s29, s30, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen30_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s25, s26, s27, s28, s29, s30, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen30_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s26, s27, s28, s29, s30, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen30_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s27, s28, s29, s30, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen30_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s28, s29, s30, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen30_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s29, s30, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen30_10(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s30, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
	}

	private static final void gen30_10(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29, int s30){
		gen30_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30);
		gen30_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s11);
		gen30_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s11, s12);
		gen30_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s11, s12, s13);
		gen30_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s11, s12, s13, s14);
		gen30_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s11, s12, s13, s14, s15);
		gen30_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s11, s12, s13, s14, s15, s16);
		gen30_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s11, s12, s13, s14, s15, s16, s17);
		gen30_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s11, s12, s13, s14, s15, s16, s17, s18);
		gen30_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s11, s12, s13, s14, s15, s16, s17, s18, s19);
		gen30_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen30_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s22, s23, s24, s25, s26, s27, s28, s29, s30, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen30_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s23, s24, s25, s26, s27, s28, s29, s30, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen30_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s24, s25, s26, s27, s28, s29, s30, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen30_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s25, s26, s27, s28, s29, s30, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen30_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s26, s27, s28, s29, s30, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen30_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s27, s28, s29, s30, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen30_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s28, s29, s30, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen30_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s29, s30, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen30_11(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s30, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
	}

	private static final void gen30_11(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29, int s30){
		gen30_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30);
		gen30_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s12);
		gen30_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s12, s13);
		gen30_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s12, s13, s14);
		gen30_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s12, s13, s14, s15);
		gen30_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s12, s13, s14, s15, s16);
		gen30_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s12, s13, s14, s15, s16, s17);
		gen30_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s12, s13, s14, s15, s16, s17, s18);
		gen30_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s12, s13, s14, s15, s16, s17, s18, s19);
		gen30_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s12, s13, s14, s15, s16, s17, s18, s19, s20);
		gen30_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s22, s23, s24, s25, s26, s27, s28, s29, s30, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen30_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s23, s24, s25, s26, s27, s28, s29, s30, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen30_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s24, s25, s26, s27, s28, s29, s30, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen30_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s25, s26, s27, s28, s29, s30, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen30_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s26, s27, s28, s29, s30, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen30_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s27, s28, s29, s30, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen30_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s28, s29, s30, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen30_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s29, s30, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen30_12(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s30, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
	}

	private static final void gen30_12(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29, int s30){
		gen30_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30);
		gen30_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s13);
		gen30_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s13, s14);
		gen30_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s13, s14, s15);
		gen30_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s13, s14, s15, s16);
		gen30_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s13, s14, s15, s16, s17);
		gen30_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s13, s14, s15, s16, s17, s18);
		gen30_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s13, s14, s15, s16, s17, s18, s19);
		gen30_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s13, s14, s15, s16, s17, s18, s19, s20);
		gen30_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s22, s23, s24, s25, s26, s27, s28, s29, s30, s13, s14, s15, s16, s17, s18, s19, s20, s21);
		gen30_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s23, s24, s25, s26, s27, s28, s29, s30, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen30_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s24, s25, s26, s27, s28, s29, s30, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen30_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s25, s26, s27, s28, s29, s30, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen30_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s26, s27, s28, s29, s30, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen30_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s27, s28, s29, s30, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen30_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s28, s29, s30, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen30_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s29, s30, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen30_13(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s30, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
	}

	private static final void gen30_13(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29, int s30){
		gen30_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30);
		gen30_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s14);
		gen30_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s14, s15);
		gen30_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s14, s15, s16);
		gen30_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s14, s15, s16, s17);
		gen30_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s14, s15, s16, s17, s18);
		gen30_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s14, s15, s16, s17, s18, s19);
		gen30_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s14, s15, s16, s17, s18, s19, s20);
		gen30_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s22, s23, s24, s25, s26, s27, s28, s29, s30, s14, s15, s16, s17, s18, s19, s20, s21);
		gen30_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s23, s24, s25, s26, s27, s28, s29, s30, s14, s15, s16, s17, s18, s19, s20, s21, s22);
		gen30_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s24, s25, s26, s27, s28, s29, s30, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen30_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s25, s26, s27, s28, s29, s30, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen30_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s26, s27, s28, s29, s30, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen30_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s27, s28, s29, s30, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen30_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s28, s29, s30, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen30_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s29, s30, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen30_14(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s30, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
	}

	private static final void gen30_14(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29, int s30){
		gen30_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30);
		gen30_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s15);
		gen30_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s15, s16);
		gen30_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s15, s16, s17);
		gen30_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s15, s16, s17, s18);
		gen30_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s15, s16, s17, s18, s19);
		gen30_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s15, s16, s17, s18, s19, s20);
		gen30_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s22, s23, s24, s25, s26, s27, s28, s29, s30, s15, s16, s17, s18, s19, s20, s21);
		gen30_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s23, s24, s25, s26, s27, s28, s29, s30, s15, s16, s17, s18, s19, s20, s21, s22);
		gen30_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s24, s25, s26, s27, s28, s29, s30, s15, s16, s17, s18, s19, s20, s21, s22, s23);
		gen30_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s25, s26, s27, s28, s29, s30, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen30_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s26, s27, s28, s29, s30, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen30_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s27, s28, s29, s30, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen30_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s28, s29, s30, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen30_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s29, s30, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen30_15(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s30, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
	}

	private static final void gen30_15(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29, int s30){
		gen30_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30);
		gen30_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s16);
		gen30_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s16, s17);
		gen30_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s16, s17, s18);
		gen30_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s16, s17, s18, s19);
		gen30_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s16, s17, s18, s19, s20);
		gen30_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s22, s23, s24, s25, s26, s27, s28, s29, s30, s16, s17, s18, s19, s20, s21);
		gen30_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s23, s24, s25, s26, s27, s28, s29, s30, s16, s17, s18, s19, s20, s21, s22);
		gen30_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s24, s25, s26, s27, s28, s29, s30, s16, s17, s18, s19, s20, s21, s22, s23);
		gen30_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s25, s26, s27, s28, s29, s30, s16, s17, s18, s19, s20, s21, s22, s23, s24);
		gen30_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s26, s27, s28, s29, s30, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen30_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s27, s28, s29, s30, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen30_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s28, s29, s30, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen30_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s29, s30, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen30_16(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s30, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
	}

	private static final void gen30_16(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29, int s30){
		gen30_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30);
		gen30_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s17);
		gen30_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s17, s18);
		gen30_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s17, s18, s19);
		gen30_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s17, s18, s19, s20);
		gen30_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s22, s23, s24, s25, s26, s27, s28, s29, s30, s17, s18, s19, s20, s21);
		gen30_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s23, s24, s25, s26, s27, s28, s29, s30, s17, s18, s19, s20, s21, s22);
		gen30_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s24, s25, s26, s27, s28, s29, s30, s17, s18, s19, s20, s21, s22, s23);
		gen30_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s25, s26, s27, s28, s29, s30, s17, s18, s19, s20, s21, s22, s23, s24);
		gen30_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s26, s27, s28, s29, s30, s17, s18, s19, s20, s21, s22, s23, s24, s25);
		gen30_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s27, s28, s29, s30, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen30_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s28, s29, s30, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen30_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s29, s30, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen30_17(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s30, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
	}

	private static final void gen30_17(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29, int s30){
		gen30_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30);
		gen30_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s18);
		gen30_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s18, s19);
		gen30_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s18, s19, s20);
		gen30_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s22, s23, s24, s25, s26, s27, s28, s29, s30, s18, s19, s20, s21);
		gen30_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s23, s24, s25, s26, s27, s28, s29, s30, s18, s19, s20, s21, s22);
		gen30_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s24, s25, s26, s27, s28, s29, s30, s18, s19, s20, s21, s22, s23);
		gen30_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s25, s26, s27, s28, s29, s30, s18, s19, s20, s21, s22, s23, s24);
		gen30_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s26, s27, s28, s29, s30, s18, s19, s20, s21, s22, s23, s24, s25);
		gen30_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s27, s28, s29, s30, s18, s19, s20, s21, s22, s23, s24, s25, s26);
		gen30_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s28, s29, s30, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen30_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s29, s30, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen30_18(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s30, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
	}

	private static final void gen30_18(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29, int s30){
		gen30_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30);
		gen30_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s19);
		gen30_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s19, s20);
		gen30_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s22, s23, s24, s25, s26, s27, s28, s29, s30, s19, s20, s21);
		gen30_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s23, s24, s25, s26, s27, s28, s29, s30, s19, s20, s21, s22);
		gen30_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s24, s25, s26, s27, s28, s29, s30, s19, s20, s21, s22, s23);
		gen30_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s25, s26, s27, s28, s29, s30, s19, s20, s21, s22, s23, s24);
		gen30_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s26, s27, s28, s29, s30, s19, s20, s21, s22, s23, s24, s25);
		gen30_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s27, s28, s29, s30, s19, s20, s21, s22, s23, s24, s25, s26);
		gen30_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s28, s29, s30, s19, s20, s21, s22, s23, s24, s25, s26, s27);
		gen30_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s29, s30, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen30_19(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s30, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
	}

	private static final void gen30_19(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29, int s30){
		gen30_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30);
		gen30_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s20);
		gen30_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s22, s23, s24, s25, s26, s27, s28, s29, s30, s20, s21);
		gen30_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s23, s24, s25, s26, s27, s28, s29, s30, s20, s21, s22);
		gen30_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s24, s25, s26, s27, s28, s29, s30, s20, s21, s22, s23);
		gen30_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s25, s26, s27, s28, s29, s30, s20, s21, s22, s23, s24);
		gen30_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s26, s27, s28, s29, s30, s20, s21, s22, s23, s24, s25);
		gen30_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s27, s28, s29, s30, s20, s21, s22, s23, s24, s25, s26);
		gen30_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s28, s29, s30, s20, s21, s22, s23, s24, s25, s26, s27);
		gen30_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s29, s30, s20, s21, s22, s23, s24, s25, s26, s27, s28);
		gen30_20(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s30, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29);
	}

	private static final void gen30_20(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29, int s30){
		gen30_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30);
		gen30_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s22, s23, s24, s25, s26, s27, s28, s29, s30, s21);
		gen30_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s23, s24, s25, s26, s27, s28, s29, s30, s21, s22);
		gen30_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s24, s25, s26, s27, s28, s29, s30, s21, s22, s23);
		gen30_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s25, s26, s27, s28, s29, s30, s21, s22, s23, s24);
		gen30_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s26, s27, s28, s29, s30, s21, s22, s23, s24, s25);
		gen30_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s27, s28, s29, s30, s21, s22, s23, s24, s25, s26);
		gen30_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s28, s29, s30, s21, s22, s23, s24, s25, s26, s27);
		gen30_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s29, s30, s21, s22, s23, s24, s25, s26, s27, s28);
		gen30_21(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s30, s21, s22, s23, s24, s25, s26, s27, s28, s29);
	}

	private static final void gen30_21(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29, int s30){
		gen30_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30);
		gen30_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s23, s24, s25, s26, s27, s28, s29, s30, s22);
		gen30_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s24, s25, s26, s27, s28, s29, s30, s22, s23);
		gen30_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s25, s26, s27, s28, s29, s30, s22, s23, s24);
		gen30_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s26, s27, s28, s29, s30, s22, s23, s24, s25);
		gen30_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s27, s28, s29, s30, s22, s23, s24, s25, s26);
		gen30_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s28, s29, s30, s22, s23, s24, s25, s26, s27);
		gen30_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s29, s30, s22, s23, s24, s25, s26, s27, s28);
		gen30_22(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s30, s22, s23, s24, s25, s26, s27, s28, s29);
	}

	private static final void gen30_22(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29, int s30){
		gen30_23(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30);
		gen30_23(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s24, s25, s26, s27, s28, s29, s30, s23);
		gen30_23(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s25, s26, s27, s28, s29, s30, s23, s24);
		gen30_23(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s26, s27, s28, s29, s30, s23, s24, s25);
		gen30_23(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s27, s28, s29, s30, s23, s24, s25, s26);
		gen30_23(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s28, s29, s30, s23, s24, s25, s26, s27);
		gen30_23(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s29, s30, s23, s24, s25, s26, s27, s28);
		gen30_23(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s30, s23, s24, s25, s26, s27, s28, s29);
	}

	private static final void gen30_23(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29, int s30){
		gen30_24(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30);
		gen30_24(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s25, s26, s27, s28, s29, s30, s24);
		gen30_24(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s26, s27, s28, s29, s30, s24, s25);
		gen30_24(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s27, s28, s29, s30, s24, s25, s26);
		gen30_24(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s28, s29, s30, s24, s25, s26, s27);
		gen30_24(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s29, s30, s24, s25, s26, s27, s28);
		gen30_24(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s30, s24, s25, s26, s27, s28, s29);
	}

	private static final void gen30_24(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29, int s30){
		gen30_25(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30);
		gen30_25(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s26, s27, s28, s29, s30, s25);
		gen30_25(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s27, s28, s29, s30, s25, s26);
		gen30_25(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s28, s29, s30, s25, s26, s27);
		gen30_25(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s29, s30, s25, s26, s27, s28);
		gen30_25(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s30, s25, s26, s27, s28, s29);
	}

	private static final void gen30_25(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29, int s30){
		gen30_26(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30);
		gen30_26(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s27, s28, s29, s30, s26);
		gen30_26(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s28, s29, s30, s26, s27);
		gen30_26(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s29, s30, s26, s27, s28);
		gen30_26(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s30, s26, s27, s28, s29);
	}

	private static final void gen30_26(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29, int s30){
		gen30_27(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30);
		gen30_27(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s28, s29, s30, s27);
		gen30_27(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s29, s30, s27, s28);
		gen30_27(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s30, s27, s28, s29);
	}

	private static final void gen30_27(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29, int s30){
		gen30_28(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30);
		gen30_28(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s29, s30, s28);
		gen30_28(pr,s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s30, s28, s29);
	}

	private static final void gen30_28(PermutationRecieverInt pr,int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29, int s30){
		pr.recieve30(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30);
		pr.recieve30(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s30, s29);
	}

}