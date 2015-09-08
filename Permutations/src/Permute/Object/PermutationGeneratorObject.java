package Permute.Object;

public class PermutationGeneratorObject {

	public static void permute (PermutationRecieverObject pr,Object[] o){

		if(o.length==2){
			gen2_0(pr,o[0], o[1]);
		}

		if(o.length==3){
			gen3_0(pr,o[0], o[1], o[2]);
		}

		if(o.length==4){
			gen4_0(pr,o[0], o[1], o[2], o[3]);
		}

		if(o.length==5){
			gen5_0(pr,o[0], o[1], o[2], o[3], o[4]);
		}

		if(o.length==6){
			gen6_0(pr,o[0], o[1], o[2], o[3], o[4], o[5]);
		}

		if(o.length==7){
			gen7_0(pr,o[0], o[1], o[2], o[3], o[4], o[5], o[6]);
		}

		if(o.length==8){
			gen8_0(pr,o[0], o[1], o[2], o[3], o[4], o[5], o[6], o[7]);
		}

		if(o.length==9){
			gen9_0(pr,o[0], o[1], o[2], o[3], o[4], o[5], o[6], o[7], o[8]);
		}

		if(o.length==10){
			gen10_0(pr,o[0], o[1], o[2], o[3], o[4], o[5], o[6], o[7], o[8], o[9]);
		}

		if(o.length==11){
			gen11_0(pr,o[0], o[1], o[2], o[3], o[4], o[5], o[6], o[7], o[8], o[9], o[10]);
		}

		if(o.length==12){
			gen12_0(pr,o[0], o[1], o[2], o[3], o[4], o[5], o[6], o[7], o[8], o[9], o[10], o[11]);
		}

		if(o.length==13){
			gen13_0(pr,o[0], o[1], o[2], o[3], o[4], o[5], o[6], o[7], o[8], o[9], o[10], o[11], o[12]);
		}

		if(o.length==14){
			gen14_0(pr,o[0], o[1], o[2], o[3], o[4], o[5], o[6], o[7], o[8], o[9], o[10], o[11], o[12], o[13]);
		}

		if(o.length==15){
			gen15_0(pr,o[0], o[1], o[2], o[3], o[4], o[5], o[6], o[7], o[8], o[9], o[10], o[11], o[12], o[13], o[14]);
		}

		if(o.length==16){
			gen16_0(pr,o[0], o[1], o[2], o[3], o[4], o[5], o[6], o[7], o[8], o[9], o[10], o[11], o[12], o[13], o[14], o[15]);
		}

		if(o.length==17){
			gen17_0(pr,o[0], o[1], o[2], o[3], o[4], o[5], o[6], o[7], o[8], o[9], o[10], o[11], o[12], o[13], o[14], o[15], o[16]);
		}

		if(o.length==18){
			gen18_0(pr,o[0], o[1], o[2], o[3], o[4], o[5], o[6], o[7], o[8], o[9], o[10], o[11], o[12], o[13], o[14], o[15], o[16], o[17]);
		}

		if(o.length==19){
			gen19_0(pr,o[0], o[1], o[2], o[3], o[4], o[5], o[6], o[7], o[8], o[9], o[10], o[11], o[12], o[13], o[14], o[15], o[16], o[17], o[18]);
		}

		if(o.length==20){
			gen20_0(pr,o[0], o[1], o[2], o[3], o[4], o[5], o[6], o[7], o[8], o[9], o[10], o[11], o[12], o[13], o[14], o[15], o[16], o[17], o[18], o[19]);
		}

		if(o.length==21){
			gen21_0(pr,o[0], o[1], o[2], o[3], o[4], o[5], o[6], o[7], o[8], o[9], o[10], o[11], o[12], o[13], o[14], o[15], o[16], o[17], o[18], o[19], o[20]);
		}

		if(o.length==22){
			gen22_0(pr,o[0], o[1], o[2], o[3], o[4], o[5], o[6], o[7], o[8], o[9], o[10], o[11], o[12], o[13], o[14], o[15], o[16], o[17], o[18], o[19], o[20], o[21]);
		}

		if(o.length==23){
			gen23_0(pr,o[0], o[1], o[2], o[3], o[4], o[5], o[6], o[7], o[8], o[9], o[10], o[11], o[12], o[13], o[14], o[15], o[16], o[17], o[18], o[19], o[20], o[21], o[22]);
		}

		if(o.length==24){
			gen24_0(pr,o[0], o[1], o[2], o[3], o[4], o[5], o[6], o[7], o[8], o[9], o[10], o[11], o[12], o[13], o[14], o[15], o[16], o[17], o[18], o[19], o[20], o[21], o[22], o[23]);
		}

		if(o.length==25){
			gen25_0(pr,o[0], o[1], o[2], o[3], o[4], o[5], o[6], o[7], o[8], o[9], o[10], o[11], o[12], o[13], o[14], o[15], o[16], o[17], o[18], o[19], o[20], o[21], o[22], o[23], o[24]);
		}

		if(o.length==26){
			gen26_0(pr,o[0], o[1], o[2], o[3], o[4], o[5], o[6], o[7], o[8], o[9], o[10], o[11], o[12], o[13], o[14], o[15], o[16], o[17], o[18], o[19], o[20], o[21], o[22], o[23], o[24], o[25]);
		}

		if(o.length==27){
			gen27_0(pr,o[0], o[1], o[2], o[3], o[4], o[5], o[6], o[7], o[8], o[9], o[10], o[11], o[12], o[13], o[14], o[15], o[16], o[17], o[18], o[19], o[20], o[21], o[22], o[23], o[24], o[25], o[26]);
		}

		if(o.length==28){
			gen28_0(pr,o[0], o[1], o[2], o[3], o[4], o[5], o[6], o[7], o[8], o[9], o[10], o[11], o[12], o[13], o[14], o[15], o[16], o[17], o[18], o[19], o[20], o[21], o[22], o[23], o[24], o[25], o[26], o[27]);
		}

		if(o.length==29){
			gen29_0(pr,o[0], o[1], o[2], o[3], o[4], o[5], o[6], o[7], o[8], o[9], o[10], o[11], o[12], o[13], o[14], o[15], o[16], o[17], o[18], o[19], o[20], o[21], o[22], o[23], o[24], o[25], o[26], o[27], o[28]);
		}

		if(o.length==30){
			gen30_0(pr,o[0], o[1], o[2], o[3], o[4], o[5], o[6], o[7], o[8], o[9], o[10], o[11], o[12], o[13], o[14], o[15], o[16], o[17], o[18], o[19], o[20], o[21], o[22], o[23], o[24], o[25], o[26], o[27], o[28], o[29]);
		}

	}

	private static final void gen2_0(PermutationRecieverObject pr,Object o1, Object o2){
		pr.recieve2(o1, o2);
		pr.recieve2(o2, o1);
	}

	private static final void gen3_0(PermutationRecieverObject pr,Object o1, Object o2, Object o3){
		gen3_1(pr,o1, o2, o3);
		gen3_1(pr,o2, o3, o1);
		gen3_1(pr,o3, o1, o2);
	}

	private static final void gen3_1(PermutationRecieverObject pr,Object o1, Object o2, Object o3){
		pr.recieve3(o1, o2, o3);
		pr.recieve3(o1, o3, o2);
	}

	private static final void gen4_0(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4){
		gen4_1(pr,o1, o2, o3, o4);
		gen4_1(pr,o2, o3, o4, o1);
		gen4_1(pr,o3, o4, o1, o2);
		gen4_1(pr,o4, o1, o2, o3);
	}

	private static final void gen4_1(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4){
		gen4_2(pr,o1, o2, o3, o4);
		gen4_2(pr,o1, o3, o4, o2);
		gen4_2(pr,o1, o4, o2, o3);
	}

	private static final void gen4_2(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4){
		pr.recieve4(o1, o2, o3, o4);
		pr.recieve4(o1, o2, o4, o3);
	}

	private static final void gen5_0(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5){
		gen5_1(pr,o1, o2, o3, o4, o5);
		gen5_1(pr,o2, o3, o4, o5, o1);
		gen5_1(pr,o3, o4, o5, o1, o2);
		gen5_1(pr,o4, o5, o1, o2, o3);
		gen5_1(pr,o5, o1, o2, o3, o4);
	}

	private static final void gen5_1(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5){
		gen5_2(pr,o1, o2, o3, o4, o5);
		gen5_2(pr,o1, o3, o4, o5, o2);
		gen5_2(pr,o1, o4, o5, o2, o3);
		gen5_2(pr,o1, o5, o2, o3, o4);
	}

	private static final void gen5_2(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5){
		gen5_3(pr,o1, o2, o3, o4, o5);
		gen5_3(pr,o1, o2, o4, o5, o3);
		gen5_3(pr,o1, o2, o5, o3, o4);
	}

	private static final void gen5_3(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5){
		pr.recieve5(o1, o2, o3, o4, o5);
		pr.recieve5(o1, o2, o3, o5, o4);
	}

	private static final void gen6_0(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6){
		gen6_1(pr,o1, o2, o3, o4, o5, o6);
		gen6_1(pr,o2, o3, o4, o5, o6, o1);
		gen6_1(pr,o3, o4, o5, o6, o1, o2);
		gen6_1(pr,o4, o5, o6, o1, o2, o3);
		gen6_1(pr,o5, o6, o1, o2, o3, o4);
		gen6_1(pr,o6, o1, o2, o3, o4, o5);
	}

	private static final void gen6_1(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6){
		gen6_2(pr,o1, o2, o3, o4, o5, o6);
		gen6_2(pr,o1, o3, o4, o5, o6, o2);
		gen6_2(pr,o1, o4, o5, o6, o2, o3);
		gen6_2(pr,o1, o5, o6, o2, o3, o4);
		gen6_2(pr,o1, o6, o2, o3, o4, o5);
	}

	private static final void gen6_2(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6){
		gen6_3(pr,o1, o2, o3, o4, o5, o6);
		gen6_3(pr,o1, o2, o4, o5, o6, o3);
		gen6_3(pr,o1, o2, o5, o6, o3, o4);
		gen6_3(pr,o1, o2, o6, o3, o4, o5);
	}

	private static final void gen6_3(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6){
		gen6_4(pr,o1, o2, o3, o4, o5, o6);
		gen6_4(pr,o1, o2, o3, o5, o6, o4);
		gen6_4(pr,o1, o2, o3, o6, o4, o5);
	}

	private static final void gen6_4(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6){
		pr.recieve6(o1, o2, o3, o4, o5, o6);
		pr.recieve6(o1, o2, o3, o4, o6, o5);
	}

	private static final void gen7_0(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7){
		gen7_1(pr,o1, o2, o3, o4, o5, o6, o7);
		gen7_1(pr,o2, o3, o4, o5, o6, o7, o1);
		gen7_1(pr,o3, o4, o5, o6, o7, o1, o2);
		gen7_1(pr,o4, o5, o6, o7, o1, o2, o3);
		gen7_1(pr,o5, o6, o7, o1, o2, o3, o4);
		gen7_1(pr,o6, o7, o1, o2, o3, o4, o5);
		gen7_1(pr,o7, o1, o2, o3, o4, o5, o6);
	}

	private static final void gen7_1(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7){
		gen7_2(pr,o1, o2, o3, o4, o5, o6, o7);
		gen7_2(pr,o1, o3, o4, o5, o6, o7, o2);
		gen7_2(pr,o1, o4, o5, o6, o7, o2, o3);
		gen7_2(pr,o1, o5, o6, o7, o2, o3, o4);
		gen7_2(pr,o1, o6, o7, o2, o3, o4, o5);
		gen7_2(pr,o1, o7, o2, o3, o4, o5, o6);
	}

	private static final void gen7_2(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7){
		gen7_3(pr,o1, o2, o3, o4, o5, o6, o7);
		gen7_3(pr,o1, o2, o4, o5, o6, o7, o3);
		gen7_3(pr,o1, o2, o5, o6, o7, o3, o4);
		gen7_3(pr,o1, o2, o6, o7, o3, o4, o5);
		gen7_3(pr,o1, o2, o7, o3, o4, o5, o6);
	}

	private static final void gen7_3(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7){
		gen7_4(pr,o1, o2, o3, o4, o5, o6, o7);
		gen7_4(pr,o1, o2, o3, o5, o6, o7, o4);
		gen7_4(pr,o1, o2, o3, o6, o7, o4, o5);
		gen7_4(pr,o1, o2, o3, o7, o4, o5, o6);
	}

	private static final void gen7_4(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7){
		gen7_5(pr,o1, o2, o3, o4, o5, o6, o7);
		gen7_5(pr,o1, o2, o3, o4, o6, o7, o5);
		gen7_5(pr,o1, o2, o3, o4, o7, o5, o6);
	}

	private static final void gen7_5(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7){
		pr.recieve7(o1, o2, o3, o4, o5, o6, o7);
		pr.recieve7(o1, o2, o3, o4, o5, o7, o6);
	}

	private static final void gen8_0(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8){
		gen8_1(pr,o1, o2, o3, o4, o5, o6, o7, o8);
		gen8_1(pr,o2, o3, o4, o5, o6, o7, o8, o1);
		gen8_1(pr,o3, o4, o5, o6, o7, o8, o1, o2);
		gen8_1(pr,o4, o5, o6, o7, o8, o1, o2, o3);
		gen8_1(pr,o5, o6, o7, o8, o1, o2, o3, o4);
		gen8_1(pr,o6, o7, o8, o1, o2, o3, o4, o5);
		gen8_1(pr,o7, o8, o1, o2, o3, o4, o5, o6);
		gen8_1(pr,o8, o1, o2, o3, o4, o5, o6, o7);
	}

	private static final void gen8_1(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8){
		gen8_2(pr,o1, o2, o3, o4, o5, o6, o7, o8);
		gen8_2(pr,o1, o3, o4, o5, o6, o7, o8, o2);
		gen8_2(pr,o1, o4, o5, o6, o7, o8, o2, o3);
		gen8_2(pr,o1, o5, o6, o7, o8, o2, o3, o4);
		gen8_2(pr,o1, o6, o7, o8, o2, o3, o4, o5);
		gen8_2(pr,o1, o7, o8, o2, o3, o4, o5, o6);
		gen8_2(pr,o1, o8, o2, o3, o4, o5, o6, o7);
	}

	private static final void gen8_2(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8){
		gen8_3(pr,o1, o2, o3, o4, o5, o6, o7, o8);
		gen8_3(pr,o1, o2, o4, o5, o6, o7, o8, o3);
		gen8_3(pr,o1, o2, o5, o6, o7, o8, o3, o4);
		gen8_3(pr,o1, o2, o6, o7, o8, o3, o4, o5);
		gen8_3(pr,o1, o2, o7, o8, o3, o4, o5, o6);
		gen8_3(pr,o1, o2, o8, o3, o4, o5, o6, o7);
	}

	private static final void gen8_3(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8){
		gen8_4(pr,o1, o2, o3, o4, o5, o6, o7, o8);
		gen8_4(pr,o1, o2, o3, o5, o6, o7, o8, o4);
		gen8_4(pr,o1, o2, o3, o6, o7, o8, o4, o5);
		gen8_4(pr,o1, o2, o3, o7, o8, o4, o5, o6);
		gen8_4(pr,o1, o2, o3, o8, o4, o5, o6, o7);
	}

	private static final void gen8_4(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8){
		gen8_5(pr,o1, o2, o3, o4, o5, o6, o7, o8);
		gen8_5(pr,o1, o2, o3, o4, o6, o7, o8, o5);
		gen8_5(pr,o1, o2, o3, o4, o7, o8, o5, o6);
		gen8_5(pr,o1, o2, o3, o4, o8, o5, o6, o7);
	}

	private static final void gen8_5(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8){
		gen8_6(pr,o1, o2, o3, o4, o5, o6, o7, o8);
		gen8_6(pr,o1, o2, o3, o4, o5, o7, o8, o6);
		gen8_6(pr,o1, o2, o3, o4, o5, o8, o6, o7);
	}

	private static final void gen8_6(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8){
		pr.recieve8(o1, o2, o3, o4, o5, o6, o7, o8);
		pr.recieve8(o1, o2, o3, o4, o5, o6, o8, o7);
	}

	private static final void gen9_0(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9){
		gen9_1(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9);
		gen9_1(pr,o2, o3, o4, o5, o6, o7, o8, o9, o1);
		gen9_1(pr,o3, o4, o5, o6, o7, o8, o9, o1, o2);
		gen9_1(pr,o4, o5, o6, o7, o8, o9, o1, o2, o3);
		gen9_1(pr,o5, o6, o7, o8, o9, o1, o2, o3, o4);
		gen9_1(pr,o6, o7, o8, o9, o1, o2, o3, o4, o5);
		gen9_1(pr,o7, o8, o9, o1, o2, o3, o4, o5, o6);
		gen9_1(pr,o8, o9, o1, o2, o3, o4, o5, o6, o7);
		gen9_1(pr,o9, o1, o2, o3, o4, o5, o6, o7, o8);
	}

	private static final void gen9_1(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9){
		gen9_2(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9);
		gen9_2(pr,o1, o3, o4, o5, o6, o7, o8, o9, o2);
		gen9_2(pr,o1, o4, o5, o6, o7, o8, o9, o2, o3);
		gen9_2(pr,o1, o5, o6, o7, o8, o9, o2, o3, o4);
		gen9_2(pr,o1, o6, o7, o8, o9, o2, o3, o4, o5);
		gen9_2(pr,o1, o7, o8, o9, o2, o3, o4, o5, o6);
		gen9_2(pr,o1, o8, o9, o2, o3, o4, o5, o6, o7);
		gen9_2(pr,o1, o9, o2, o3, o4, o5, o6, o7, o8);
	}

	private static final void gen9_2(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9){
		gen9_3(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9);
		gen9_3(pr,o1, o2, o4, o5, o6, o7, o8, o9, o3);
		gen9_3(pr,o1, o2, o5, o6, o7, o8, o9, o3, o4);
		gen9_3(pr,o1, o2, o6, o7, o8, o9, o3, o4, o5);
		gen9_3(pr,o1, o2, o7, o8, o9, o3, o4, o5, o6);
		gen9_3(pr,o1, o2, o8, o9, o3, o4, o5, o6, o7);
		gen9_3(pr,o1, o2, o9, o3, o4, o5, o6, o7, o8);
	}

	private static final void gen9_3(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9){
		gen9_4(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9);
		gen9_4(pr,o1, o2, o3, o5, o6, o7, o8, o9, o4);
		gen9_4(pr,o1, o2, o3, o6, o7, o8, o9, o4, o5);
		gen9_4(pr,o1, o2, o3, o7, o8, o9, o4, o5, o6);
		gen9_4(pr,o1, o2, o3, o8, o9, o4, o5, o6, o7);
		gen9_4(pr,o1, o2, o3, o9, o4, o5, o6, o7, o8);
	}

	private static final void gen9_4(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9){
		gen9_5(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9);
		gen9_5(pr,o1, o2, o3, o4, o6, o7, o8, o9, o5);
		gen9_5(pr,o1, o2, o3, o4, o7, o8, o9, o5, o6);
		gen9_5(pr,o1, o2, o3, o4, o8, o9, o5, o6, o7);
		gen9_5(pr,o1, o2, o3, o4, o9, o5, o6, o7, o8);
	}

	private static final void gen9_5(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9){
		gen9_6(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9);
		gen9_6(pr,o1, o2, o3, o4, o5, o7, o8, o9, o6);
		gen9_6(pr,o1, o2, o3, o4, o5, o8, o9, o6, o7);
		gen9_6(pr,o1, o2, o3, o4, o5, o9, o6, o7, o8);
	}

	private static final void gen9_6(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9){
		gen9_7(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9);
		gen9_7(pr,o1, o2, o3, o4, o5, o6, o8, o9, o7);
		gen9_7(pr,o1, o2, o3, o4, o5, o6, o9, o7, o8);
	}

	private static final void gen9_7(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9){
		pr.recieve9(o1, o2, o3, o4, o5, o6, o7, o8, o9);
		pr.recieve9(o1, o2, o3, o4, o5, o6, o7, o9, o8);
	}

	private static final void gen10_0(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10){
		gen10_1(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen10_1(pr,o2, o3, o4, o5, o6, o7, o8, o9, o10, o1);
		gen10_1(pr,o3, o4, o5, o6, o7, o8, o9, o10, o1, o2);
		gen10_1(pr,o4, o5, o6, o7, o8, o9, o10, o1, o2, o3);
		gen10_1(pr,o5, o6, o7, o8, o9, o10, o1, o2, o3, o4);
		gen10_1(pr,o6, o7, o8, o9, o10, o1, o2, o3, o4, o5);
		gen10_1(pr,o7, o8, o9, o10, o1, o2, o3, o4, o5, o6);
		gen10_1(pr,o8, o9, o10, o1, o2, o3, o4, o5, o6, o7);
		gen10_1(pr,o9, o10, o1, o2, o3, o4, o5, o6, o7, o8);
		gen10_1(pr,o10, o1, o2, o3, o4, o5, o6, o7, o8, o9);
	}

	private static final void gen10_1(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10){
		gen10_2(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen10_2(pr,o1, o3, o4, o5, o6, o7, o8, o9, o10, o2);
		gen10_2(pr,o1, o4, o5, o6, o7, o8, o9, o10, o2, o3);
		gen10_2(pr,o1, o5, o6, o7, o8, o9, o10, o2, o3, o4);
		gen10_2(pr,o1, o6, o7, o8, o9, o10, o2, o3, o4, o5);
		gen10_2(pr,o1, o7, o8, o9, o10, o2, o3, o4, o5, o6);
		gen10_2(pr,o1, o8, o9, o10, o2, o3, o4, o5, o6, o7);
		gen10_2(pr,o1, o9, o10, o2, o3, o4, o5, o6, o7, o8);
		gen10_2(pr,o1, o10, o2, o3, o4, o5, o6, o7, o8, o9);
	}

	private static final void gen10_2(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10){
		gen10_3(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen10_3(pr,o1, o2, o4, o5, o6, o7, o8, o9, o10, o3);
		gen10_3(pr,o1, o2, o5, o6, o7, o8, o9, o10, o3, o4);
		gen10_3(pr,o1, o2, o6, o7, o8, o9, o10, o3, o4, o5);
		gen10_3(pr,o1, o2, o7, o8, o9, o10, o3, o4, o5, o6);
		gen10_3(pr,o1, o2, o8, o9, o10, o3, o4, o5, o6, o7);
		gen10_3(pr,o1, o2, o9, o10, o3, o4, o5, o6, o7, o8);
		gen10_3(pr,o1, o2, o10, o3, o4, o5, o6, o7, o8, o9);
	}

	private static final void gen10_3(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10){
		gen10_4(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen10_4(pr,o1, o2, o3, o5, o6, o7, o8, o9, o10, o4);
		gen10_4(pr,o1, o2, o3, o6, o7, o8, o9, o10, o4, o5);
		gen10_4(pr,o1, o2, o3, o7, o8, o9, o10, o4, o5, o6);
		gen10_4(pr,o1, o2, o3, o8, o9, o10, o4, o5, o6, o7);
		gen10_4(pr,o1, o2, o3, o9, o10, o4, o5, o6, o7, o8);
		gen10_4(pr,o1, o2, o3, o10, o4, o5, o6, o7, o8, o9);
	}

	private static final void gen10_4(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10){
		gen10_5(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen10_5(pr,o1, o2, o3, o4, o6, o7, o8, o9, o10, o5);
		gen10_5(pr,o1, o2, o3, o4, o7, o8, o9, o10, o5, o6);
		gen10_5(pr,o1, o2, o3, o4, o8, o9, o10, o5, o6, o7);
		gen10_5(pr,o1, o2, o3, o4, o9, o10, o5, o6, o7, o8);
		gen10_5(pr,o1, o2, o3, o4, o10, o5, o6, o7, o8, o9);
	}

	private static final void gen10_5(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10){
		gen10_6(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen10_6(pr,o1, o2, o3, o4, o5, o7, o8, o9, o10, o6);
		gen10_6(pr,o1, o2, o3, o4, o5, o8, o9, o10, o6, o7);
		gen10_6(pr,o1, o2, o3, o4, o5, o9, o10, o6, o7, o8);
		gen10_6(pr,o1, o2, o3, o4, o5, o10, o6, o7, o8, o9);
	}

	private static final void gen10_6(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10){
		gen10_7(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen10_7(pr,o1, o2, o3, o4, o5, o6, o8, o9, o10, o7);
		gen10_7(pr,o1, o2, o3, o4, o5, o6, o9, o10, o7, o8);
		gen10_7(pr,o1, o2, o3, o4, o5, o6, o10, o7, o8, o9);
	}

	private static final void gen10_7(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10){
		gen10_8(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen10_8(pr,o1, o2, o3, o4, o5, o6, o7, o9, o10, o8);
		gen10_8(pr,o1, o2, o3, o4, o5, o6, o7, o10, o8, o9);
	}

	private static final void gen10_8(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10){
		pr.recieve10(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		pr.recieve10(o1, o2, o3, o4, o5, o6, o7, o8, o10, o9);
	}

	private static final void gen11_0(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11){
		gen11_1(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen11_1(pr,o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o1);
		gen11_1(pr,o3, o4, o5, o6, o7, o8, o9, o10, o11, o1, o2);
		gen11_1(pr,o4, o5, o6, o7, o8, o9, o10, o11, o1, o2, o3);
		gen11_1(pr,o5, o6, o7, o8, o9, o10, o11, o1, o2, o3, o4);
		gen11_1(pr,o6, o7, o8, o9, o10, o11, o1, o2, o3, o4, o5);
		gen11_1(pr,o7, o8, o9, o10, o11, o1, o2, o3, o4, o5, o6);
		gen11_1(pr,o8, o9, o10, o11, o1, o2, o3, o4, o5, o6, o7);
		gen11_1(pr,o9, o10, o11, o1, o2, o3, o4, o5, o6, o7, o8);
		gen11_1(pr,o10, o11, o1, o2, o3, o4, o5, o6, o7, o8, o9);
		gen11_1(pr,o11, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10);
	}

	private static final void gen11_1(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11){
		gen11_2(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen11_2(pr,o1, o3, o4, o5, o6, o7, o8, o9, o10, o11, o2);
		gen11_2(pr,o1, o4, o5, o6, o7, o8, o9, o10, o11, o2, o3);
		gen11_2(pr,o1, o5, o6, o7, o8, o9, o10, o11, o2, o3, o4);
		gen11_2(pr,o1, o6, o7, o8, o9, o10, o11, o2, o3, o4, o5);
		gen11_2(pr,o1, o7, o8, o9, o10, o11, o2, o3, o4, o5, o6);
		gen11_2(pr,o1, o8, o9, o10, o11, o2, o3, o4, o5, o6, o7);
		gen11_2(pr,o1, o9, o10, o11, o2, o3, o4, o5, o6, o7, o8);
		gen11_2(pr,o1, o10, o11, o2, o3, o4, o5, o6, o7, o8, o9);
		gen11_2(pr,o1, o11, o2, o3, o4, o5, o6, o7, o8, o9, o10);
	}

	private static final void gen11_2(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11){
		gen11_3(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen11_3(pr,o1, o2, o4, o5, o6, o7, o8, o9, o10, o11, o3);
		gen11_3(pr,o1, o2, o5, o6, o7, o8, o9, o10, o11, o3, o4);
		gen11_3(pr,o1, o2, o6, o7, o8, o9, o10, o11, o3, o4, o5);
		gen11_3(pr,o1, o2, o7, o8, o9, o10, o11, o3, o4, o5, o6);
		gen11_3(pr,o1, o2, o8, o9, o10, o11, o3, o4, o5, o6, o7);
		gen11_3(pr,o1, o2, o9, o10, o11, o3, o4, o5, o6, o7, o8);
		gen11_3(pr,o1, o2, o10, o11, o3, o4, o5, o6, o7, o8, o9);
		gen11_3(pr,o1, o2, o11, o3, o4, o5, o6, o7, o8, o9, o10);
	}

	private static final void gen11_3(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11){
		gen11_4(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen11_4(pr,o1, o2, o3, o5, o6, o7, o8, o9, o10, o11, o4);
		gen11_4(pr,o1, o2, o3, o6, o7, o8, o9, o10, o11, o4, o5);
		gen11_4(pr,o1, o2, o3, o7, o8, o9, o10, o11, o4, o5, o6);
		gen11_4(pr,o1, o2, o3, o8, o9, o10, o11, o4, o5, o6, o7);
		gen11_4(pr,o1, o2, o3, o9, o10, o11, o4, o5, o6, o7, o8);
		gen11_4(pr,o1, o2, o3, o10, o11, o4, o5, o6, o7, o8, o9);
		gen11_4(pr,o1, o2, o3, o11, o4, o5, o6, o7, o8, o9, o10);
	}

	private static final void gen11_4(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11){
		gen11_5(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen11_5(pr,o1, o2, o3, o4, o6, o7, o8, o9, o10, o11, o5);
		gen11_5(pr,o1, o2, o3, o4, o7, o8, o9, o10, o11, o5, o6);
		gen11_5(pr,o1, o2, o3, o4, o8, o9, o10, o11, o5, o6, o7);
		gen11_5(pr,o1, o2, o3, o4, o9, o10, o11, o5, o6, o7, o8);
		gen11_5(pr,o1, o2, o3, o4, o10, o11, o5, o6, o7, o8, o9);
		gen11_5(pr,o1, o2, o3, o4, o11, o5, o6, o7, o8, o9, o10);
	}

	private static final void gen11_5(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11){
		gen11_6(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen11_6(pr,o1, o2, o3, o4, o5, o7, o8, o9, o10, o11, o6);
		gen11_6(pr,o1, o2, o3, o4, o5, o8, o9, o10, o11, o6, o7);
		gen11_6(pr,o1, o2, o3, o4, o5, o9, o10, o11, o6, o7, o8);
		gen11_6(pr,o1, o2, o3, o4, o5, o10, o11, o6, o7, o8, o9);
		gen11_6(pr,o1, o2, o3, o4, o5, o11, o6, o7, o8, o9, o10);
	}

	private static final void gen11_6(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11){
		gen11_7(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen11_7(pr,o1, o2, o3, o4, o5, o6, o8, o9, o10, o11, o7);
		gen11_7(pr,o1, o2, o3, o4, o5, o6, o9, o10, o11, o7, o8);
		gen11_7(pr,o1, o2, o3, o4, o5, o6, o10, o11, o7, o8, o9);
		gen11_7(pr,o1, o2, o3, o4, o5, o6, o11, o7, o8, o9, o10);
	}

	private static final void gen11_7(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11){
		gen11_8(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen11_8(pr,o1, o2, o3, o4, o5, o6, o7, o9, o10, o11, o8);
		gen11_8(pr,o1, o2, o3, o4, o5, o6, o7, o10, o11, o8, o9);
		gen11_8(pr,o1, o2, o3, o4, o5, o6, o7, o11, o8, o9, o10);
	}

	private static final void gen11_8(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11){
		gen11_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen11_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o10, o11, o9);
		gen11_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o11, o9, o10);
	}

	private static final void gen11_9(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11){
		pr.recieve11(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		pr.recieve11(o1, o2, o3, o4, o5, o6, o7, o8, o9, o11, o10);
	}

	private static final void gen12_0(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12){
		gen12_1(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen12_1(pr,o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o1);
		gen12_1(pr,o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o1, o2);
		gen12_1(pr,o4, o5, o6, o7, o8, o9, o10, o11, o12, o1, o2, o3);
		gen12_1(pr,o5, o6, o7, o8, o9, o10, o11, o12, o1, o2, o3, o4);
		gen12_1(pr,o6, o7, o8, o9, o10, o11, o12, o1, o2, o3, o4, o5);
		gen12_1(pr,o7, o8, o9, o10, o11, o12, o1, o2, o3, o4, o5, o6);
		gen12_1(pr,o8, o9, o10, o11, o12, o1, o2, o3, o4, o5, o6, o7);
		gen12_1(pr,o9, o10, o11, o12, o1, o2, o3, o4, o5, o6, o7, o8);
		gen12_1(pr,o10, o11, o12, o1, o2, o3, o4, o5, o6, o7, o8, o9);
		gen12_1(pr,o11, o12, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen12_1(pr,o12, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
	}

	private static final void gen12_1(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12){
		gen12_2(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen12_2(pr,o1, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o2);
		gen12_2(pr,o1, o4, o5, o6, o7, o8, o9, o10, o11, o12, o2, o3);
		gen12_2(pr,o1, o5, o6, o7, o8, o9, o10, o11, o12, o2, o3, o4);
		gen12_2(pr,o1, o6, o7, o8, o9, o10, o11, o12, o2, o3, o4, o5);
		gen12_2(pr,o1, o7, o8, o9, o10, o11, o12, o2, o3, o4, o5, o6);
		gen12_2(pr,o1, o8, o9, o10, o11, o12, o2, o3, o4, o5, o6, o7);
		gen12_2(pr,o1, o9, o10, o11, o12, o2, o3, o4, o5, o6, o7, o8);
		gen12_2(pr,o1, o10, o11, o12, o2, o3, o4, o5, o6, o7, o8, o9);
		gen12_2(pr,o1, o11, o12, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen12_2(pr,o1, o12, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
	}

	private static final void gen12_2(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12){
		gen12_3(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen12_3(pr,o1, o2, o4, o5, o6, o7, o8, o9, o10, o11, o12, o3);
		gen12_3(pr,o1, o2, o5, o6, o7, o8, o9, o10, o11, o12, o3, o4);
		gen12_3(pr,o1, o2, o6, o7, o8, o9, o10, o11, o12, o3, o4, o5);
		gen12_3(pr,o1, o2, o7, o8, o9, o10, o11, o12, o3, o4, o5, o6);
		gen12_3(pr,o1, o2, o8, o9, o10, o11, o12, o3, o4, o5, o6, o7);
		gen12_3(pr,o1, o2, o9, o10, o11, o12, o3, o4, o5, o6, o7, o8);
		gen12_3(pr,o1, o2, o10, o11, o12, o3, o4, o5, o6, o7, o8, o9);
		gen12_3(pr,o1, o2, o11, o12, o3, o4, o5, o6, o7, o8, o9, o10);
		gen12_3(pr,o1, o2, o12, o3, o4, o5, o6, o7, o8, o9, o10, o11);
	}

	private static final void gen12_3(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12){
		gen12_4(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen12_4(pr,o1, o2, o3, o5, o6, o7, o8, o9, o10, o11, o12, o4);
		gen12_4(pr,o1, o2, o3, o6, o7, o8, o9, o10, o11, o12, o4, o5);
		gen12_4(pr,o1, o2, o3, o7, o8, o9, o10, o11, o12, o4, o5, o6);
		gen12_4(pr,o1, o2, o3, o8, o9, o10, o11, o12, o4, o5, o6, o7);
		gen12_4(pr,o1, o2, o3, o9, o10, o11, o12, o4, o5, o6, o7, o8);
		gen12_4(pr,o1, o2, o3, o10, o11, o12, o4, o5, o6, o7, o8, o9);
		gen12_4(pr,o1, o2, o3, o11, o12, o4, o5, o6, o7, o8, o9, o10);
		gen12_4(pr,o1, o2, o3, o12, o4, o5, o6, o7, o8, o9, o10, o11);
	}

	private static final void gen12_4(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12){
		gen12_5(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen12_5(pr,o1, o2, o3, o4, o6, o7, o8, o9, o10, o11, o12, o5);
		gen12_5(pr,o1, o2, o3, o4, o7, o8, o9, o10, o11, o12, o5, o6);
		gen12_5(pr,o1, o2, o3, o4, o8, o9, o10, o11, o12, o5, o6, o7);
		gen12_5(pr,o1, o2, o3, o4, o9, o10, o11, o12, o5, o6, o7, o8);
		gen12_5(pr,o1, o2, o3, o4, o10, o11, o12, o5, o6, o7, o8, o9);
		gen12_5(pr,o1, o2, o3, o4, o11, o12, o5, o6, o7, o8, o9, o10);
		gen12_5(pr,o1, o2, o3, o4, o12, o5, o6, o7, o8, o9, o10, o11);
	}

	private static final void gen12_5(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12){
		gen12_6(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen12_6(pr,o1, o2, o3, o4, o5, o7, o8, o9, o10, o11, o12, o6);
		gen12_6(pr,o1, o2, o3, o4, o5, o8, o9, o10, o11, o12, o6, o7);
		gen12_6(pr,o1, o2, o3, o4, o5, o9, o10, o11, o12, o6, o7, o8);
		gen12_6(pr,o1, o2, o3, o4, o5, o10, o11, o12, o6, o7, o8, o9);
		gen12_6(pr,o1, o2, o3, o4, o5, o11, o12, o6, o7, o8, o9, o10);
		gen12_6(pr,o1, o2, o3, o4, o5, o12, o6, o7, o8, o9, o10, o11);
	}

	private static final void gen12_6(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12){
		gen12_7(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen12_7(pr,o1, o2, o3, o4, o5, o6, o8, o9, o10, o11, o12, o7);
		gen12_7(pr,o1, o2, o3, o4, o5, o6, o9, o10, o11, o12, o7, o8);
		gen12_7(pr,o1, o2, o3, o4, o5, o6, o10, o11, o12, o7, o8, o9);
		gen12_7(pr,o1, o2, o3, o4, o5, o6, o11, o12, o7, o8, o9, o10);
		gen12_7(pr,o1, o2, o3, o4, o5, o6, o12, o7, o8, o9, o10, o11);
	}

	private static final void gen12_7(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12){
		gen12_8(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen12_8(pr,o1, o2, o3, o4, o5, o6, o7, o9, o10, o11, o12, o8);
		gen12_8(pr,o1, o2, o3, o4, o5, o6, o7, o10, o11, o12, o8, o9);
		gen12_8(pr,o1, o2, o3, o4, o5, o6, o7, o11, o12, o8, o9, o10);
		gen12_8(pr,o1, o2, o3, o4, o5, o6, o7, o12, o8, o9, o10, o11);
	}

	private static final void gen12_8(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12){
		gen12_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen12_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o10, o11, o12, o9);
		gen12_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o11, o12, o9, o10);
		gen12_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o12, o9, o10, o11);
	}

	private static final void gen12_9(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12){
		gen12_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen12_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o11, o12, o10);
		gen12_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o12, o10, o11);
	}

	private static final void gen12_10(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12){
		pr.recieve12(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		pr.recieve12(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o12, o11);
	}

	private static final void gen13_0(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13){
		gen13_1(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen13_1(pr,o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o1);
		gen13_1(pr,o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o1, o2);
		gen13_1(pr,o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o1, o2, o3);
		gen13_1(pr,o5, o6, o7, o8, o9, o10, o11, o12, o13, o1, o2, o3, o4);
		gen13_1(pr,o6, o7, o8, o9, o10, o11, o12, o13, o1, o2, o3, o4, o5);
		gen13_1(pr,o7, o8, o9, o10, o11, o12, o13, o1, o2, o3, o4, o5, o6);
		gen13_1(pr,o8, o9, o10, o11, o12, o13, o1, o2, o3, o4, o5, o6, o7);
		gen13_1(pr,o9, o10, o11, o12, o13, o1, o2, o3, o4, o5, o6, o7, o8);
		gen13_1(pr,o10, o11, o12, o13, o1, o2, o3, o4, o5, o6, o7, o8, o9);
		gen13_1(pr,o11, o12, o13, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen13_1(pr,o12, o13, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen13_1(pr,o13, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
	}

	private static final void gen13_1(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13){
		gen13_2(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen13_2(pr,o1, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o2);
		gen13_2(pr,o1, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o2, o3);
		gen13_2(pr,o1, o5, o6, o7, o8, o9, o10, o11, o12, o13, o2, o3, o4);
		gen13_2(pr,o1, o6, o7, o8, o9, o10, o11, o12, o13, o2, o3, o4, o5);
		gen13_2(pr,o1, o7, o8, o9, o10, o11, o12, o13, o2, o3, o4, o5, o6);
		gen13_2(pr,o1, o8, o9, o10, o11, o12, o13, o2, o3, o4, o5, o6, o7);
		gen13_2(pr,o1, o9, o10, o11, o12, o13, o2, o3, o4, o5, o6, o7, o8);
		gen13_2(pr,o1, o10, o11, o12, o13, o2, o3, o4, o5, o6, o7, o8, o9);
		gen13_2(pr,o1, o11, o12, o13, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen13_2(pr,o1, o12, o13, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen13_2(pr,o1, o13, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
	}

	private static final void gen13_2(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13){
		gen13_3(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen13_3(pr,o1, o2, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o3);
		gen13_3(pr,o1, o2, o5, o6, o7, o8, o9, o10, o11, o12, o13, o3, o4);
		gen13_3(pr,o1, o2, o6, o7, o8, o9, o10, o11, o12, o13, o3, o4, o5);
		gen13_3(pr,o1, o2, o7, o8, o9, o10, o11, o12, o13, o3, o4, o5, o6);
		gen13_3(pr,o1, o2, o8, o9, o10, o11, o12, o13, o3, o4, o5, o6, o7);
		gen13_3(pr,o1, o2, o9, o10, o11, o12, o13, o3, o4, o5, o6, o7, o8);
		gen13_3(pr,o1, o2, o10, o11, o12, o13, o3, o4, o5, o6, o7, o8, o9);
		gen13_3(pr,o1, o2, o11, o12, o13, o3, o4, o5, o6, o7, o8, o9, o10);
		gen13_3(pr,o1, o2, o12, o13, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen13_3(pr,o1, o2, o13, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
	}

	private static final void gen13_3(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13){
		gen13_4(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen13_4(pr,o1, o2, o3, o5, o6, o7, o8, o9, o10, o11, o12, o13, o4);
		gen13_4(pr,o1, o2, o3, o6, o7, o8, o9, o10, o11, o12, o13, o4, o5);
		gen13_4(pr,o1, o2, o3, o7, o8, o9, o10, o11, o12, o13, o4, o5, o6);
		gen13_4(pr,o1, o2, o3, o8, o9, o10, o11, o12, o13, o4, o5, o6, o7);
		gen13_4(pr,o1, o2, o3, o9, o10, o11, o12, o13, o4, o5, o6, o7, o8);
		gen13_4(pr,o1, o2, o3, o10, o11, o12, o13, o4, o5, o6, o7, o8, o9);
		gen13_4(pr,o1, o2, o3, o11, o12, o13, o4, o5, o6, o7, o8, o9, o10);
		gen13_4(pr,o1, o2, o3, o12, o13, o4, o5, o6, o7, o8, o9, o10, o11);
		gen13_4(pr,o1, o2, o3, o13, o4, o5, o6, o7, o8, o9, o10, o11, o12);
	}

	private static final void gen13_4(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13){
		gen13_5(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen13_5(pr,o1, o2, o3, o4, o6, o7, o8, o9, o10, o11, o12, o13, o5);
		gen13_5(pr,o1, o2, o3, o4, o7, o8, o9, o10, o11, o12, o13, o5, o6);
		gen13_5(pr,o1, o2, o3, o4, o8, o9, o10, o11, o12, o13, o5, o6, o7);
		gen13_5(pr,o1, o2, o3, o4, o9, o10, o11, o12, o13, o5, o6, o7, o8);
		gen13_5(pr,o1, o2, o3, o4, o10, o11, o12, o13, o5, o6, o7, o8, o9);
		gen13_5(pr,o1, o2, o3, o4, o11, o12, o13, o5, o6, o7, o8, o9, o10);
		gen13_5(pr,o1, o2, o3, o4, o12, o13, o5, o6, o7, o8, o9, o10, o11);
		gen13_5(pr,o1, o2, o3, o4, o13, o5, o6, o7, o8, o9, o10, o11, o12);
	}

	private static final void gen13_5(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13){
		gen13_6(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen13_6(pr,o1, o2, o3, o4, o5, o7, o8, o9, o10, o11, o12, o13, o6);
		gen13_6(pr,o1, o2, o3, o4, o5, o8, o9, o10, o11, o12, o13, o6, o7);
		gen13_6(pr,o1, o2, o3, o4, o5, o9, o10, o11, o12, o13, o6, o7, o8);
		gen13_6(pr,o1, o2, o3, o4, o5, o10, o11, o12, o13, o6, o7, o8, o9);
		gen13_6(pr,o1, o2, o3, o4, o5, o11, o12, o13, o6, o7, o8, o9, o10);
		gen13_6(pr,o1, o2, o3, o4, o5, o12, o13, o6, o7, o8, o9, o10, o11);
		gen13_6(pr,o1, o2, o3, o4, o5, o13, o6, o7, o8, o9, o10, o11, o12);
	}

	private static final void gen13_6(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13){
		gen13_7(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen13_7(pr,o1, o2, o3, o4, o5, o6, o8, o9, o10, o11, o12, o13, o7);
		gen13_7(pr,o1, o2, o3, o4, o5, o6, o9, o10, o11, o12, o13, o7, o8);
		gen13_7(pr,o1, o2, o3, o4, o5, o6, o10, o11, o12, o13, o7, o8, o9);
		gen13_7(pr,o1, o2, o3, o4, o5, o6, o11, o12, o13, o7, o8, o9, o10);
		gen13_7(pr,o1, o2, o3, o4, o5, o6, o12, o13, o7, o8, o9, o10, o11);
		gen13_7(pr,o1, o2, o3, o4, o5, o6, o13, o7, o8, o9, o10, o11, o12);
	}

	private static final void gen13_7(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13){
		gen13_8(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen13_8(pr,o1, o2, o3, o4, o5, o6, o7, o9, o10, o11, o12, o13, o8);
		gen13_8(pr,o1, o2, o3, o4, o5, o6, o7, o10, o11, o12, o13, o8, o9);
		gen13_8(pr,o1, o2, o3, o4, o5, o6, o7, o11, o12, o13, o8, o9, o10);
		gen13_8(pr,o1, o2, o3, o4, o5, o6, o7, o12, o13, o8, o9, o10, o11);
		gen13_8(pr,o1, o2, o3, o4, o5, o6, o7, o13, o8, o9, o10, o11, o12);
	}

	private static final void gen13_8(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13){
		gen13_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen13_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o10, o11, o12, o13, o9);
		gen13_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o11, o12, o13, o9, o10);
		gen13_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o12, o13, o9, o10, o11);
		gen13_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o13, o9, o10, o11, o12);
	}

	private static final void gen13_9(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13){
		gen13_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen13_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o11, o12, o13, o10);
		gen13_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o12, o13, o10, o11);
		gen13_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o13, o10, o11, o12);
	}

	private static final void gen13_10(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13){
		gen13_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen13_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o12, o13, o11);
		gen13_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o13, o11, o12);
	}

	private static final void gen13_11(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13){
		pr.recieve13(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		pr.recieve13(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o13, o12);
	}

	private static final void gen14_0(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14){
		gen14_1(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen14_1(pr,o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o1);
		gen14_1(pr,o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o1, o2);
		gen14_1(pr,o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o1, o2, o3);
		gen14_1(pr,o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o1, o2, o3, o4);
		gen14_1(pr,o6, o7, o8, o9, o10, o11, o12, o13, o14, o1, o2, o3, o4, o5);
		gen14_1(pr,o7, o8, o9, o10, o11, o12, o13, o14, o1, o2, o3, o4, o5, o6);
		gen14_1(pr,o8, o9, o10, o11, o12, o13, o14, o1, o2, o3, o4, o5, o6, o7);
		gen14_1(pr,o9, o10, o11, o12, o13, o14, o1, o2, o3, o4, o5, o6, o7, o8);
		gen14_1(pr,o10, o11, o12, o13, o14, o1, o2, o3, o4, o5, o6, o7, o8, o9);
		gen14_1(pr,o11, o12, o13, o14, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen14_1(pr,o12, o13, o14, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen14_1(pr,o13, o14, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen14_1(pr,o14, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
	}

	private static final void gen14_1(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14){
		gen14_2(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen14_2(pr,o1, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o2);
		gen14_2(pr,o1, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o2, o3);
		gen14_2(pr,o1, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o2, o3, o4);
		gen14_2(pr,o1, o6, o7, o8, o9, o10, o11, o12, o13, o14, o2, o3, o4, o5);
		gen14_2(pr,o1, o7, o8, o9, o10, o11, o12, o13, o14, o2, o3, o4, o5, o6);
		gen14_2(pr,o1, o8, o9, o10, o11, o12, o13, o14, o2, o3, o4, o5, o6, o7);
		gen14_2(pr,o1, o9, o10, o11, o12, o13, o14, o2, o3, o4, o5, o6, o7, o8);
		gen14_2(pr,o1, o10, o11, o12, o13, o14, o2, o3, o4, o5, o6, o7, o8, o9);
		gen14_2(pr,o1, o11, o12, o13, o14, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen14_2(pr,o1, o12, o13, o14, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen14_2(pr,o1, o13, o14, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen14_2(pr,o1, o14, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
	}

	private static final void gen14_2(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14){
		gen14_3(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen14_3(pr,o1, o2, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o3);
		gen14_3(pr,o1, o2, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o3, o4);
		gen14_3(pr,o1, o2, o6, o7, o8, o9, o10, o11, o12, o13, o14, o3, o4, o5);
		gen14_3(pr,o1, o2, o7, o8, o9, o10, o11, o12, o13, o14, o3, o4, o5, o6);
		gen14_3(pr,o1, o2, o8, o9, o10, o11, o12, o13, o14, o3, o4, o5, o6, o7);
		gen14_3(pr,o1, o2, o9, o10, o11, o12, o13, o14, o3, o4, o5, o6, o7, o8);
		gen14_3(pr,o1, o2, o10, o11, o12, o13, o14, o3, o4, o5, o6, o7, o8, o9);
		gen14_3(pr,o1, o2, o11, o12, o13, o14, o3, o4, o5, o6, o7, o8, o9, o10);
		gen14_3(pr,o1, o2, o12, o13, o14, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen14_3(pr,o1, o2, o13, o14, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen14_3(pr,o1, o2, o14, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
	}

	private static final void gen14_3(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14){
		gen14_4(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen14_4(pr,o1, o2, o3, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o4);
		gen14_4(pr,o1, o2, o3, o6, o7, o8, o9, o10, o11, o12, o13, o14, o4, o5);
		gen14_4(pr,o1, o2, o3, o7, o8, o9, o10, o11, o12, o13, o14, o4, o5, o6);
		gen14_4(pr,o1, o2, o3, o8, o9, o10, o11, o12, o13, o14, o4, o5, o6, o7);
		gen14_4(pr,o1, o2, o3, o9, o10, o11, o12, o13, o14, o4, o5, o6, o7, o8);
		gen14_4(pr,o1, o2, o3, o10, o11, o12, o13, o14, o4, o5, o6, o7, o8, o9);
		gen14_4(pr,o1, o2, o3, o11, o12, o13, o14, o4, o5, o6, o7, o8, o9, o10);
		gen14_4(pr,o1, o2, o3, o12, o13, o14, o4, o5, o6, o7, o8, o9, o10, o11);
		gen14_4(pr,o1, o2, o3, o13, o14, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen14_4(pr,o1, o2, o3, o14, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
	}

	private static final void gen14_4(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14){
		gen14_5(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen14_5(pr,o1, o2, o3, o4, o6, o7, o8, o9, o10, o11, o12, o13, o14, o5);
		gen14_5(pr,o1, o2, o3, o4, o7, o8, o9, o10, o11, o12, o13, o14, o5, o6);
		gen14_5(pr,o1, o2, o3, o4, o8, o9, o10, o11, o12, o13, o14, o5, o6, o7);
		gen14_5(pr,o1, o2, o3, o4, o9, o10, o11, o12, o13, o14, o5, o6, o7, o8);
		gen14_5(pr,o1, o2, o3, o4, o10, o11, o12, o13, o14, o5, o6, o7, o8, o9);
		gen14_5(pr,o1, o2, o3, o4, o11, o12, o13, o14, o5, o6, o7, o8, o9, o10);
		gen14_5(pr,o1, o2, o3, o4, o12, o13, o14, o5, o6, o7, o8, o9, o10, o11);
		gen14_5(pr,o1, o2, o3, o4, o13, o14, o5, o6, o7, o8, o9, o10, o11, o12);
		gen14_5(pr,o1, o2, o3, o4, o14, o5, o6, o7, o8, o9, o10, o11, o12, o13);
	}

	private static final void gen14_5(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14){
		gen14_6(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen14_6(pr,o1, o2, o3, o4, o5, o7, o8, o9, o10, o11, o12, o13, o14, o6);
		gen14_6(pr,o1, o2, o3, o4, o5, o8, o9, o10, o11, o12, o13, o14, o6, o7);
		gen14_6(pr,o1, o2, o3, o4, o5, o9, o10, o11, o12, o13, o14, o6, o7, o8);
		gen14_6(pr,o1, o2, o3, o4, o5, o10, o11, o12, o13, o14, o6, o7, o8, o9);
		gen14_6(pr,o1, o2, o3, o4, o5, o11, o12, o13, o14, o6, o7, o8, o9, o10);
		gen14_6(pr,o1, o2, o3, o4, o5, o12, o13, o14, o6, o7, o8, o9, o10, o11);
		gen14_6(pr,o1, o2, o3, o4, o5, o13, o14, o6, o7, o8, o9, o10, o11, o12);
		gen14_6(pr,o1, o2, o3, o4, o5, o14, o6, o7, o8, o9, o10, o11, o12, o13);
	}

	private static final void gen14_6(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14){
		gen14_7(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen14_7(pr,o1, o2, o3, o4, o5, o6, o8, o9, o10, o11, o12, o13, o14, o7);
		gen14_7(pr,o1, o2, o3, o4, o5, o6, o9, o10, o11, o12, o13, o14, o7, o8);
		gen14_7(pr,o1, o2, o3, o4, o5, o6, o10, o11, o12, o13, o14, o7, o8, o9);
		gen14_7(pr,o1, o2, o3, o4, o5, o6, o11, o12, o13, o14, o7, o8, o9, o10);
		gen14_7(pr,o1, o2, o3, o4, o5, o6, o12, o13, o14, o7, o8, o9, o10, o11);
		gen14_7(pr,o1, o2, o3, o4, o5, o6, o13, o14, o7, o8, o9, o10, o11, o12);
		gen14_7(pr,o1, o2, o3, o4, o5, o6, o14, o7, o8, o9, o10, o11, o12, o13);
	}

	private static final void gen14_7(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14){
		gen14_8(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen14_8(pr,o1, o2, o3, o4, o5, o6, o7, o9, o10, o11, o12, o13, o14, o8);
		gen14_8(pr,o1, o2, o3, o4, o5, o6, o7, o10, o11, o12, o13, o14, o8, o9);
		gen14_8(pr,o1, o2, o3, o4, o5, o6, o7, o11, o12, o13, o14, o8, o9, o10);
		gen14_8(pr,o1, o2, o3, o4, o5, o6, o7, o12, o13, o14, o8, o9, o10, o11);
		gen14_8(pr,o1, o2, o3, o4, o5, o6, o7, o13, o14, o8, o9, o10, o11, o12);
		gen14_8(pr,o1, o2, o3, o4, o5, o6, o7, o14, o8, o9, o10, o11, o12, o13);
	}

	private static final void gen14_8(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14){
		gen14_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen14_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o10, o11, o12, o13, o14, o9);
		gen14_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o11, o12, o13, o14, o9, o10);
		gen14_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o12, o13, o14, o9, o10, o11);
		gen14_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o13, o14, o9, o10, o11, o12);
		gen14_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o14, o9, o10, o11, o12, o13);
	}

	private static final void gen14_9(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14){
		gen14_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen14_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o11, o12, o13, o14, o10);
		gen14_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o12, o13, o14, o10, o11);
		gen14_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o13, o14, o10, o11, o12);
		gen14_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o14, o10, o11, o12, o13);
	}

	private static final void gen14_10(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14){
		gen14_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen14_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o12, o13, o14, o11);
		gen14_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o13, o14, o11, o12);
		gen14_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o14, o11, o12, o13);
	}

	private static final void gen14_11(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14){
		gen14_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen14_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o13, o14, o12);
		gen14_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o14, o12, o13);
	}

	private static final void gen14_12(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14){
		pr.recieve14(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		pr.recieve14(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o14, o13);
	}

	private static final void gen15_0(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15){
		gen15_1(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen15_1(pr,o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o1);
		gen15_1(pr,o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o1, o2);
		gen15_1(pr,o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o1, o2, o3);
		gen15_1(pr,o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o1, o2, o3, o4);
		gen15_1(pr,o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o1, o2, o3, o4, o5);
		gen15_1(pr,o7, o8, o9, o10, o11, o12, o13, o14, o15, o1, o2, o3, o4, o5, o6);
		gen15_1(pr,o8, o9, o10, o11, o12, o13, o14, o15, o1, o2, o3, o4, o5, o6, o7);
		gen15_1(pr,o9, o10, o11, o12, o13, o14, o15, o1, o2, o3, o4, o5, o6, o7, o8);
		gen15_1(pr,o10, o11, o12, o13, o14, o15, o1, o2, o3, o4, o5, o6, o7, o8, o9);
		gen15_1(pr,o11, o12, o13, o14, o15, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen15_1(pr,o12, o13, o14, o15, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen15_1(pr,o13, o14, o15, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen15_1(pr,o14, o15, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen15_1(pr,o15, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
	}

	private static final void gen15_1(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15){
		gen15_2(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen15_2(pr,o1, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o2);
		gen15_2(pr,o1, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o2, o3);
		gen15_2(pr,o1, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o2, o3, o4);
		gen15_2(pr,o1, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o2, o3, o4, o5);
		gen15_2(pr,o1, o7, o8, o9, o10, o11, o12, o13, o14, o15, o2, o3, o4, o5, o6);
		gen15_2(pr,o1, o8, o9, o10, o11, o12, o13, o14, o15, o2, o3, o4, o5, o6, o7);
		gen15_2(pr,o1, o9, o10, o11, o12, o13, o14, o15, o2, o3, o4, o5, o6, o7, o8);
		gen15_2(pr,o1, o10, o11, o12, o13, o14, o15, o2, o3, o4, o5, o6, o7, o8, o9);
		gen15_2(pr,o1, o11, o12, o13, o14, o15, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen15_2(pr,o1, o12, o13, o14, o15, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen15_2(pr,o1, o13, o14, o15, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen15_2(pr,o1, o14, o15, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen15_2(pr,o1, o15, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
	}

	private static final void gen15_2(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15){
		gen15_3(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen15_3(pr,o1, o2, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o3);
		gen15_3(pr,o1, o2, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o3, o4);
		gen15_3(pr,o1, o2, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o3, o4, o5);
		gen15_3(pr,o1, o2, o7, o8, o9, o10, o11, o12, o13, o14, o15, o3, o4, o5, o6);
		gen15_3(pr,o1, o2, o8, o9, o10, o11, o12, o13, o14, o15, o3, o4, o5, o6, o7);
		gen15_3(pr,o1, o2, o9, o10, o11, o12, o13, o14, o15, o3, o4, o5, o6, o7, o8);
		gen15_3(pr,o1, o2, o10, o11, o12, o13, o14, o15, o3, o4, o5, o6, o7, o8, o9);
		gen15_3(pr,o1, o2, o11, o12, o13, o14, o15, o3, o4, o5, o6, o7, o8, o9, o10);
		gen15_3(pr,o1, o2, o12, o13, o14, o15, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen15_3(pr,o1, o2, o13, o14, o15, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen15_3(pr,o1, o2, o14, o15, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen15_3(pr,o1, o2, o15, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
	}

	private static final void gen15_3(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15){
		gen15_4(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen15_4(pr,o1, o2, o3, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o4);
		gen15_4(pr,o1, o2, o3, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o4, o5);
		gen15_4(pr,o1, o2, o3, o7, o8, o9, o10, o11, o12, o13, o14, o15, o4, o5, o6);
		gen15_4(pr,o1, o2, o3, o8, o9, o10, o11, o12, o13, o14, o15, o4, o5, o6, o7);
		gen15_4(pr,o1, o2, o3, o9, o10, o11, o12, o13, o14, o15, o4, o5, o6, o7, o8);
		gen15_4(pr,o1, o2, o3, o10, o11, o12, o13, o14, o15, o4, o5, o6, o7, o8, o9);
		gen15_4(pr,o1, o2, o3, o11, o12, o13, o14, o15, o4, o5, o6, o7, o8, o9, o10);
		gen15_4(pr,o1, o2, o3, o12, o13, o14, o15, o4, o5, o6, o7, o8, o9, o10, o11);
		gen15_4(pr,o1, o2, o3, o13, o14, o15, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen15_4(pr,o1, o2, o3, o14, o15, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen15_4(pr,o1, o2, o3, o15, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
	}

	private static final void gen15_4(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15){
		gen15_5(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen15_5(pr,o1, o2, o3, o4, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o5);
		gen15_5(pr,o1, o2, o3, o4, o7, o8, o9, o10, o11, o12, o13, o14, o15, o5, o6);
		gen15_5(pr,o1, o2, o3, o4, o8, o9, o10, o11, o12, o13, o14, o15, o5, o6, o7);
		gen15_5(pr,o1, o2, o3, o4, o9, o10, o11, o12, o13, o14, o15, o5, o6, o7, o8);
		gen15_5(pr,o1, o2, o3, o4, o10, o11, o12, o13, o14, o15, o5, o6, o7, o8, o9);
		gen15_5(pr,o1, o2, o3, o4, o11, o12, o13, o14, o15, o5, o6, o7, o8, o9, o10);
		gen15_5(pr,o1, o2, o3, o4, o12, o13, o14, o15, o5, o6, o7, o8, o9, o10, o11);
		gen15_5(pr,o1, o2, o3, o4, o13, o14, o15, o5, o6, o7, o8, o9, o10, o11, o12);
		gen15_5(pr,o1, o2, o3, o4, o14, o15, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen15_5(pr,o1, o2, o3, o4, o15, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
	}

	private static final void gen15_5(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15){
		gen15_6(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen15_6(pr,o1, o2, o3, o4, o5, o7, o8, o9, o10, o11, o12, o13, o14, o15, o6);
		gen15_6(pr,o1, o2, o3, o4, o5, o8, o9, o10, o11, o12, o13, o14, o15, o6, o7);
		gen15_6(pr,o1, o2, o3, o4, o5, o9, o10, o11, o12, o13, o14, o15, o6, o7, o8);
		gen15_6(pr,o1, o2, o3, o4, o5, o10, o11, o12, o13, o14, o15, o6, o7, o8, o9);
		gen15_6(pr,o1, o2, o3, o4, o5, o11, o12, o13, o14, o15, o6, o7, o8, o9, o10);
		gen15_6(pr,o1, o2, o3, o4, o5, o12, o13, o14, o15, o6, o7, o8, o9, o10, o11);
		gen15_6(pr,o1, o2, o3, o4, o5, o13, o14, o15, o6, o7, o8, o9, o10, o11, o12);
		gen15_6(pr,o1, o2, o3, o4, o5, o14, o15, o6, o7, o8, o9, o10, o11, o12, o13);
		gen15_6(pr,o1, o2, o3, o4, o5, o15, o6, o7, o8, o9, o10, o11, o12, o13, o14);
	}

	private static final void gen15_6(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15){
		gen15_7(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen15_7(pr,o1, o2, o3, o4, o5, o6, o8, o9, o10, o11, o12, o13, o14, o15, o7);
		gen15_7(pr,o1, o2, o3, o4, o5, o6, o9, o10, o11, o12, o13, o14, o15, o7, o8);
		gen15_7(pr,o1, o2, o3, o4, o5, o6, o10, o11, o12, o13, o14, o15, o7, o8, o9);
		gen15_7(pr,o1, o2, o3, o4, o5, o6, o11, o12, o13, o14, o15, o7, o8, o9, o10);
		gen15_7(pr,o1, o2, o3, o4, o5, o6, o12, o13, o14, o15, o7, o8, o9, o10, o11);
		gen15_7(pr,o1, o2, o3, o4, o5, o6, o13, o14, o15, o7, o8, o9, o10, o11, o12);
		gen15_7(pr,o1, o2, o3, o4, o5, o6, o14, o15, o7, o8, o9, o10, o11, o12, o13);
		gen15_7(pr,o1, o2, o3, o4, o5, o6, o15, o7, o8, o9, o10, o11, o12, o13, o14);
	}

	private static final void gen15_7(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15){
		gen15_8(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen15_8(pr,o1, o2, o3, o4, o5, o6, o7, o9, o10, o11, o12, o13, o14, o15, o8);
		gen15_8(pr,o1, o2, o3, o4, o5, o6, o7, o10, o11, o12, o13, o14, o15, o8, o9);
		gen15_8(pr,o1, o2, o3, o4, o5, o6, o7, o11, o12, o13, o14, o15, o8, o9, o10);
		gen15_8(pr,o1, o2, o3, o4, o5, o6, o7, o12, o13, o14, o15, o8, o9, o10, o11);
		gen15_8(pr,o1, o2, o3, o4, o5, o6, o7, o13, o14, o15, o8, o9, o10, o11, o12);
		gen15_8(pr,o1, o2, o3, o4, o5, o6, o7, o14, o15, o8, o9, o10, o11, o12, o13);
		gen15_8(pr,o1, o2, o3, o4, o5, o6, o7, o15, o8, o9, o10, o11, o12, o13, o14);
	}

	private static final void gen15_8(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15){
		gen15_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen15_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o10, o11, o12, o13, o14, o15, o9);
		gen15_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o11, o12, o13, o14, o15, o9, o10);
		gen15_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o12, o13, o14, o15, o9, o10, o11);
		gen15_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o13, o14, o15, o9, o10, o11, o12);
		gen15_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o14, o15, o9, o10, o11, o12, o13);
		gen15_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o15, o9, o10, o11, o12, o13, o14);
	}

	private static final void gen15_9(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15){
		gen15_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen15_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o11, o12, o13, o14, o15, o10);
		gen15_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o12, o13, o14, o15, o10, o11);
		gen15_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o13, o14, o15, o10, o11, o12);
		gen15_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o14, o15, o10, o11, o12, o13);
		gen15_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o15, o10, o11, o12, o13, o14);
	}

	private static final void gen15_10(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15){
		gen15_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen15_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o12, o13, o14, o15, o11);
		gen15_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o13, o14, o15, o11, o12);
		gen15_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o14, o15, o11, o12, o13);
		gen15_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o15, o11, o12, o13, o14);
	}

	private static final void gen15_11(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15){
		gen15_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen15_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o13, o14, o15, o12);
		gen15_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o14, o15, o12, o13);
		gen15_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o15, o12, o13, o14);
	}

	private static final void gen15_12(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15){
		gen15_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen15_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o14, o15, o13);
		gen15_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o15, o13, o14);
	}

	private static final void gen15_13(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15){
		pr.recieve15(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		pr.recieve15(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o15, o14);
	}

	private static final void gen16_0(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16){
		gen16_1(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen16_1(pr,o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o1);
		gen16_1(pr,o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o1, o2);
		gen16_1(pr,o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o1, o2, o3);
		gen16_1(pr,o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o1, o2, o3, o4);
		gen16_1(pr,o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o1, o2, o3, o4, o5);
		gen16_1(pr,o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o1, o2, o3, o4, o5, o6);
		gen16_1(pr,o8, o9, o10, o11, o12, o13, o14, o15, o16, o1, o2, o3, o4, o5, o6, o7);
		gen16_1(pr,o9, o10, o11, o12, o13, o14, o15, o16, o1, o2, o3, o4, o5, o6, o7, o8);
		gen16_1(pr,o10, o11, o12, o13, o14, o15, o16, o1, o2, o3, o4, o5, o6, o7, o8, o9);
		gen16_1(pr,o11, o12, o13, o14, o15, o16, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen16_1(pr,o12, o13, o14, o15, o16, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen16_1(pr,o13, o14, o15, o16, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen16_1(pr,o14, o15, o16, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen16_1(pr,o15, o16, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen16_1(pr,o16, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
	}

	private static final void gen16_1(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16){
		gen16_2(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen16_2(pr,o1, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o2);
		gen16_2(pr,o1, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o2, o3);
		gen16_2(pr,o1, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o2, o3, o4);
		gen16_2(pr,o1, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o2, o3, o4, o5);
		gen16_2(pr,o1, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o2, o3, o4, o5, o6);
		gen16_2(pr,o1, o8, o9, o10, o11, o12, o13, o14, o15, o16, o2, o3, o4, o5, o6, o7);
		gen16_2(pr,o1, o9, o10, o11, o12, o13, o14, o15, o16, o2, o3, o4, o5, o6, o7, o8);
		gen16_2(pr,o1, o10, o11, o12, o13, o14, o15, o16, o2, o3, o4, o5, o6, o7, o8, o9);
		gen16_2(pr,o1, o11, o12, o13, o14, o15, o16, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen16_2(pr,o1, o12, o13, o14, o15, o16, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen16_2(pr,o1, o13, o14, o15, o16, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen16_2(pr,o1, o14, o15, o16, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen16_2(pr,o1, o15, o16, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen16_2(pr,o1, o16, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
	}

	private static final void gen16_2(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16){
		gen16_3(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen16_3(pr,o1, o2, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o3);
		gen16_3(pr,o1, o2, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o3, o4);
		gen16_3(pr,o1, o2, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o3, o4, o5);
		gen16_3(pr,o1, o2, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o3, o4, o5, o6);
		gen16_3(pr,o1, o2, o8, o9, o10, o11, o12, o13, o14, o15, o16, o3, o4, o5, o6, o7);
		gen16_3(pr,o1, o2, o9, o10, o11, o12, o13, o14, o15, o16, o3, o4, o5, o6, o7, o8);
		gen16_3(pr,o1, o2, o10, o11, o12, o13, o14, o15, o16, o3, o4, o5, o6, o7, o8, o9);
		gen16_3(pr,o1, o2, o11, o12, o13, o14, o15, o16, o3, o4, o5, o6, o7, o8, o9, o10);
		gen16_3(pr,o1, o2, o12, o13, o14, o15, o16, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen16_3(pr,o1, o2, o13, o14, o15, o16, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen16_3(pr,o1, o2, o14, o15, o16, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen16_3(pr,o1, o2, o15, o16, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen16_3(pr,o1, o2, o16, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
	}

	private static final void gen16_3(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16){
		gen16_4(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen16_4(pr,o1, o2, o3, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o4);
		gen16_4(pr,o1, o2, o3, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o4, o5);
		gen16_4(pr,o1, o2, o3, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o4, o5, o6);
		gen16_4(pr,o1, o2, o3, o8, o9, o10, o11, o12, o13, o14, o15, o16, o4, o5, o6, o7);
		gen16_4(pr,o1, o2, o3, o9, o10, o11, o12, o13, o14, o15, o16, o4, o5, o6, o7, o8);
		gen16_4(pr,o1, o2, o3, o10, o11, o12, o13, o14, o15, o16, o4, o5, o6, o7, o8, o9);
		gen16_4(pr,o1, o2, o3, o11, o12, o13, o14, o15, o16, o4, o5, o6, o7, o8, o9, o10);
		gen16_4(pr,o1, o2, o3, o12, o13, o14, o15, o16, o4, o5, o6, o7, o8, o9, o10, o11);
		gen16_4(pr,o1, o2, o3, o13, o14, o15, o16, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen16_4(pr,o1, o2, o3, o14, o15, o16, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen16_4(pr,o1, o2, o3, o15, o16, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen16_4(pr,o1, o2, o3, o16, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
	}

	private static final void gen16_4(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16){
		gen16_5(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen16_5(pr,o1, o2, o3, o4, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o5);
		gen16_5(pr,o1, o2, o3, o4, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o5, o6);
		gen16_5(pr,o1, o2, o3, o4, o8, o9, o10, o11, o12, o13, o14, o15, o16, o5, o6, o7);
		gen16_5(pr,o1, o2, o3, o4, o9, o10, o11, o12, o13, o14, o15, o16, o5, o6, o7, o8);
		gen16_5(pr,o1, o2, o3, o4, o10, o11, o12, o13, o14, o15, o16, o5, o6, o7, o8, o9);
		gen16_5(pr,o1, o2, o3, o4, o11, o12, o13, o14, o15, o16, o5, o6, o7, o8, o9, o10);
		gen16_5(pr,o1, o2, o3, o4, o12, o13, o14, o15, o16, o5, o6, o7, o8, o9, o10, o11);
		gen16_5(pr,o1, o2, o3, o4, o13, o14, o15, o16, o5, o6, o7, o8, o9, o10, o11, o12);
		gen16_5(pr,o1, o2, o3, o4, o14, o15, o16, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen16_5(pr,o1, o2, o3, o4, o15, o16, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen16_5(pr,o1, o2, o3, o4, o16, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
	}

	private static final void gen16_5(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16){
		gen16_6(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen16_6(pr,o1, o2, o3, o4, o5, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o6);
		gen16_6(pr,o1, o2, o3, o4, o5, o8, o9, o10, o11, o12, o13, o14, o15, o16, o6, o7);
		gen16_6(pr,o1, o2, o3, o4, o5, o9, o10, o11, o12, o13, o14, o15, o16, o6, o7, o8);
		gen16_6(pr,o1, o2, o3, o4, o5, o10, o11, o12, o13, o14, o15, o16, o6, o7, o8, o9);
		gen16_6(pr,o1, o2, o3, o4, o5, o11, o12, o13, o14, o15, o16, o6, o7, o8, o9, o10);
		gen16_6(pr,o1, o2, o3, o4, o5, o12, o13, o14, o15, o16, o6, o7, o8, o9, o10, o11);
		gen16_6(pr,o1, o2, o3, o4, o5, o13, o14, o15, o16, o6, o7, o8, o9, o10, o11, o12);
		gen16_6(pr,o1, o2, o3, o4, o5, o14, o15, o16, o6, o7, o8, o9, o10, o11, o12, o13);
		gen16_6(pr,o1, o2, o3, o4, o5, o15, o16, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen16_6(pr,o1, o2, o3, o4, o5, o16, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
	}

	private static final void gen16_6(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16){
		gen16_7(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen16_7(pr,o1, o2, o3, o4, o5, o6, o8, o9, o10, o11, o12, o13, o14, o15, o16, o7);
		gen16_7(pr,o1, o2, o3, o4, o5, o6, o9, o10, o11, o12, o13, o14, o15, o16, o7, o8);
		gen16_7(pr,o1, o2, o3, o4, o5, o6, o10, o11, o12, o13, o14, o15, o16, o7, o8, o9);
		gen16_7(pr,o1, o2, o3, o4, o5, o6, o11, o12, o13, o14, o15, o16, o7, o8, o9, o10);
		gen16_7(pr,o1, o2, o3, o4, o5, o6, o12, o13, o14, o15, o16, o7, o8, o9, o10, o11);
		gen16_7(pr,o1, o2, o3, o4, o5, o6, o13, o14, o15, o16, o7, o8, o9, o10, o11, o12);
		gen16_7(pr,o1, o2, o3, o4, o5, o6, o14, o15, o16, o7, o8, o9, o10, o11, o12, o13);
		gen16_7(pr,o1, o2, o3, o4, o5, o6, o15, o16, o7, o8, o9, o10, o11, o12, o13, o14);
		gen16_7(pr,o1, o2, o3, o4, o5, o6, o16, o7, o8, o9, o10, o11, o12, o13, o14, o15);
	}

	private static final void gen16_7(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16){
		gen16_8(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen16_8(pr,o1, o2, o3, o4, o5, o6, o7, o9, o10, o11, o12, o13, o14, o15, o16, o8);
		gen16_8(pr,o1, o2, o3, o4, o5, o6, o7, o10, o11, o12, o13, o14, o15, o16, o8, o9);
		gen16_8(pr,o1, o2, o3, o4, o5, o6, o7, o11, o12, o13, o14, o15, o16, o8, o9, o10);
		gen16_8(pr,o1, o2, o3, o4, o5, o6, o7, o12, o13, o14, o15, o16, o8, o9, o10, o11);
		gen16_8(pr,o1, o2, o3, o4, o5, o6, o7, o13, o14, o15, o16, o8, o9, o10, o11, o12);
		gen16_8(pr,o1, o2, o3, o4, o5, o6, o7, o14, o15, o16, o8, o9, o10, o11, o12, o13);
		gen16_8(pr,o1, o2, o3, o4, o5, o6, o7, o15, o16, o8, o9, o10, o11, o12, o13, o14);
		gen16_8(pr,o1, o2, o3, o4, o5, o6, o7, o16, o8, o9, o10, o11, o12, o13, o14, o15);
	}

	private static final void gen16_8(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16){
		gen16_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen16_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o10, o11, o12, o13, o14, o15, o16, o9);
		gen16_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o11, o12, o13, o14, o15, o16, o9, o10);
		gen16_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o12, o13, o14, o15, o16, o9, o10, o11);
		gen16_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o13, o14, o15, o16, o9, o10, o11, o12);
		gen16_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o14, o15, o16, o9, o10, o11, o12, o13);
		gen16_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o15, o16, o9, o10, o11, o12, o13, o14);
		gen16_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o16, o9, o10, o11, o12, o13, o14, o15);
	}

	private static final void gen16_9(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16){
		gen16_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen16_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o11, o12, o13, o14, o15, o16, o10);
		gen16_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o12, o13, o14, o15, o16, o10, o11);
		gen16_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o13, o14, o15, o16, o10, o11, o12);
		gen16_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o14, o15, o16, o10, o11, o12, o13);
		gen16_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o15, o16, o10, o11, o12, o13, o14);
		gen16_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o16, o10, o11, o12, o13, o14, o15);
	}

	private static final void gen16_10(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16){
		gen16_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen16_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o12, o13, o14, o15, o16, o11);
		gen16_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o13, o14, o15, o16, o11, o12);
		gen16_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o14, o15, o16, o11, o12, o13);
		gen16_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o15, o16, o11, o12, o13, o14);
		gen16_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o16, o11, o12, o13, o14, o15);
	}

	private static final void gen16_11(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16){
		gen16_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen16_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o13, o14, o15, o16, o12);
		gen16_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o14, o15, o16, o12, o13);
		gen16_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o15, o16, o12, o13, o14);
		gen16_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o16, o12, o13, o14, o15);
	}

	private static final void gen16_12(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16){
		gen16_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen16_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o14, o15, o16, o13);
		gen16_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o15, o16, o13, o14);
		gen16_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o16, o13, o14, o15);
	}

	private static final void gen16_13(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16){
		gen16_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen16_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o15, o16, o14);
		gen16_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o16, o14, o15);
	}

	private static final void gen16_14(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16){
		pr.recieve16(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		pr.recieve16(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o16, o15);
	}

	private static final void gen17_0(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17){
		gen17_1(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen17_1(pr,o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o1);
		gen17_1(pr,o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o1, o2);
		gen17_1(pr,o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o1, o2, o3);
		gen17_1(pr,o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o1, o2, o3, o4);
		gen17_1(pr,o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o1, o2, o3, o4, o5);
		gen17_1(pr,o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o1, o2, o3, o4, o5, o6);
		gen17_1(pr,o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o1, o2, o3, o4, o5, o6, o7);
		gen17_1(pr,o9, o10, o11, o12, o13, o14, o15, o16, o17, o1, o2, o3, o4, o5, o6, o7, o8);
		gen17_1(pr,o10, o11, o12, o13, o14, o15, o16, o17, o1, o2, o3, o4, o5, o6, o7, o8, o9);
		gen17_1(pr,o11, o12, o13, o14, o15, o16, o17, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen17_1(pr,o12, o13, o14, o15, o16, o17, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen17_1(pr,o13, o14, o15, o16, o17, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen17_1(pr,o14, o15, o16, o17, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen17_1(pr,o15, o16, o17, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen17_1(pr,o16, o17, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen17_1(pr,o17, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
	}

	private static final void gen17_1(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17){
		gen17_2(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen17_2(pr,o1, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o2);
		gen17_2(pr,o1, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o2, o3);
		gen17_2(pr,o1, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o2, o3, o4);
		gen17_2(pr,o1, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o2, o3, o4, o5);
		gen17_2(pr,o1, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o2, o3, o4, o5, o6);
		gen17_2(pr,o1, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o2, o3, o4, o5, o6, o7);
		gen17_2(pr,o1, o9, o10, o11, o12, o13, o14, o15, o16, o17, o2, o3, o4, o5, o6, o7, o8);
		gen17_2(pr,o1, o10, o11, o12, o13, o14, o15, o16, o17, o2, o3, o4, o5, o6, o7, o8, o9);
		gen17_2(pr,o1, o11, o12, o13, o14, o15, o16, o17, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen17_2(pr,o1, o12, o13, o14, o15, o16, o17, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen17_2(pr,o1, o13, o14, o15, o16, o17, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen17_2(pr,o1, o14, o15, o16, o17, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen17_2(pr,o1, o15, o16, o17, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen17_2(pr,o1, o16, o17, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen17_2(pr,o1, o17, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
	}

	private static final void gen17_2(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17){
		gen17_3(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen17_3(pr,o1, o2, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o3);
		gen17_3(pr,o1, o2, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o3, o4);
		gen17_3(pr,o1, o2, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o3, o4, o5);
		gen17_3(pr,o1, o2, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o3, o4, o5, o6);
		gen17_3(pr,o1, o2, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o3, o4, o5, o6, o7);
		gen17_3(pr,o1, o2, o9, o10, o11, o12, o13, o14, o15, o16, o17, o3, o4, o5, o6, o7, o8);
		gen17_3(pr,o1, o2, o10, o11, o12, o13, o14, o15, o16, o17, o3, o4, o5, o6, o7, o8, o9);
		gen17_3(pr,o1, o2, o11, o12, o13, o14, o15, o16, o17, o3, o4, o5, o6, o7, o8, o9, o10);
		gen17_3(pr,o1, o2, o12, o13, o14, o15, o16, o17, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen17_3(pr,o1, o2, o13, o14, o15, o16, o17, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen17_3(pr,o1, o2, o14, o15, o16, o17, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen17_3(pr,o1, o2, o15, o16, o17, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen17_3(pr,o1, o2, o16, o17, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen17_3(pr,o1, o2, o17, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
	}

	private static final void gen17_3(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17){
		gen17_4(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen17_4(pr,o1, o2, o3, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o4);
		gen17_4(pr,o1, o2, o3, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o4, o5);
		gen17_4(pr,o1, o2, o3, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o4, o5, o6);
		gen17_4(pr,o1, o2, o3, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o4, o5, o6, o7);
		gen17_4(pr,o1, o2, o3, o9, o10, o11, o12, o13, o14, o15, o16, o17, o4, o5, o6, o7, o8);
		gen17_4(pr,o1, o2, o3, o10, o11, o12, o13, o14, o15, o16, o17, o4, o5, o6, o7, o8, o9);
		gen17_4(pr,o1, o2, o3, o11, o12, o13, o14, o15, o16, o17, o4, o5, o6, o7, o8, o9, o10);
		gen17_4(pr,o1, o2, o3, o12, o13, o14, o15, o16, o17, o4, o5, o6, o7, o8, o9, o10, o11);
		gen17_4(pr,o1, o2, o3, o13, o14, o15, o16, o17, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen17_4(pr,o1, o2, o3, o14, o15, o16, o17, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen17_4(pr,o1, o2, o3, o15, o16, o17, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen17_4(pr,o1, o2, o3, o16, o17, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen17_4(pr,o1, o2, o3, o17, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
	}

	private static final void gen17_4(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17){
		gen17_5(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen17_5(pr,o1, o2, o3, o4, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o5);
		gen17_5(pr,o1, o2, o3, o4, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o5, o6);
		gen17_5(pr,o1, o2, o3, o4, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o5, o6, o7);
		gen17_5(pr,o1, o2, o3, o4, o9, o10, o11, o12, o13, o14, o15, o16, o17, o5, o6, o7, o8);
		gen17_5(pr,o1, o2, o3, o4, o10, o11, o12, o13, o14, o15, o16, o17, o5, o6, o7, o8, o9);
		gen17_5(pr,o1, o2, o3, o4, o11, o12, o13, o14, o15, o16, o17, o5, o6, o7, o8, o9, o10);
		gen17_5(pr,o1, o2, o3, o4, o12, o13, o14, o15, o16, o17, o5, o6, o7, o8, o9, o10, o11);
		gen17_5(pr,o1, o2, o3, o4, o13, o14, o15, o16, o17, o5, o6, o7, o8, o9, o10, o11, o12);
		gen17_5(pr,o1, o2, o3, o4, o14, o15, o16, o17, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen17_5(pr,o1, o2, o3, o4, o15, o16, o17, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen17_5(pr,o1, o2, o3, o4, o16, o17, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen17_5(pr,o1, o2, o3, o4, o17, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
	}

	private static final void gen17_5(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17){
		gen17_6(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen17_6(pr,o1, o2, o3, o4, o5, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o6);
		gen17_6(pr,o1, o2, o3, o4, o5, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o6, o7);
		gen17_6(pr,o1, o2, o3, o4, o5, o9, o10, o11, o12, o13, o14, o15, o16, o17, o6, o7, o8);
		gen17_6(pr,o1, o2, o3, o4, o5, o10, o11, o12, o13, o14, o15, o16, o17, o6, o7, o8, o9);
		gen17_6(pr,o1, o2, o3, o4, o5, o11, o12, o13, o14, o15, o16, o17, o6, o7, o8, o9, o10);
		gen17_6(pr,o1, o2, o3, o4, o5, o12, o13, o14, o15, o16, o17, o6, o7, o8, o9, o10, o11);
		gen17_6(pr,o1, o2, o3, o4, o5, o13, o14, o15, o16, o17, o6, o7, o8, o9, o10, o11, o12);
		gen17_6(pr,o1, o2, o3, o4, o5, o14, o15, o16, o17, o6, o7, o8, o9, o10, o11, o12, o13);
		gen17_6(pr,o1, o2, o3, o4, o5, o15, o16, o17, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen17_6(pr,o1, o2, o3, o4, o5, o16, o17, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen17_6(pr,o1, o2, o3, o4, o5, o17, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
	}

	private static final void gen17_6(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17){
		gen17_7(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen17_7(pr,o1, o2, o3, o4, o5, o6, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o7);
		gen17_7(pr,o1, o2, o3, o4, o5, o6, o9, o10, o11, o12, o13, o14, o15, o16, o17, o7, o8);
		gen17_7(pr,o1, o2, o3, o4, o5, o6, o10, o11, o12, o13, o14, o15, o16, o17, o7, o8, o9);
		gen17_7(pr,o1, o2, o3, o4, o5, o6, o11, o12, o13, o14, o15, o16, o17, o7, o8, o9, o10);
		gen17_7(pr,o1, o2, o3, o4, o5, o6, o12, o13, o14, o15, o16, o17, o7, o8, o9, o10, o11);
		gen17_7(pr,o1, o2, o3, o4, o5, o6, o13, o14, o15, o16, o17, o7, o8, o9, o10, o11, o12);
		gen17_7(pr,o1, o2, o3, o4, o5, o6, o14, o15, o16, o17, o7, o8, o9, o10, o11, o12, o13);
		gen17_7(pr,o1, o2, o3, o4, o5, o6, o15, o16, o17, o7, o8, o9, o10, o11, o12, o13, o14);
		gen17_7(pr,o1, o2, o3, o4, o5, o6, o16, o17, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen17_7(pr,o1, o2, o3, o4, o5, o6, o17, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
	}

	private static final void gen17_7(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17){
		gen17_8(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen17_8(pr,o1, o2, o3, o4, o5, o6, o7, o9, o10, o11, o12, o13, o14, o15, o16, o17, o8);
		gen17_8(pr,o1, o2, o3, o4, o5, o6, o7, o10, o11, o12, o13, o14, o15, o16, o17, o8, o9);
		gen17_8(pr,o1, o2, o3, o4, o5, o6, o7, o11, o12, o13, o14, o15, o16, o17, o8, o9, o10);
		gen17_8(pr,o1, o2, o3, o4, o5, o6, o7, o12, o13, o14, o15, o16, o17, o8, o9, o10, o11);
		gen17_8(pr,o1, o2, o3, o4, o5, o6, o7, o13, o14, o15, o16, o17, o8, o9, o10, o11, o12);
		gen17_8(pr,o1, o2, o3, o4, o5, o6, o7, o14, o15, o16, o17, o8, o9, o10, o11, o12, o13);
		gen17_8(pr,o1, o2, o3, o4, o5, o6, o7, o15, o16, o17, o8, o9, o10, o11, o12, o13, o14);
		gen17_8(pr,o1, o2, o3, o4, o5, o6, o7, o16, o17, o8, o9, o10, o11, o12, o13, o14, o15);
		gen17_8(pr,o1, o2, o3, o4, o5, o6, o7, o17, o8, o9, o10, o11, o12, o13, o14, o15, o16);
	}

	private static final void gen17_8(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17){
		gen17_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen17_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o10, o11, o12, o13, o14, o15, o16, o17, o9);
		gen17_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o11, o12, o13, o14, o15, o16, o17, o9, o10);
		gen17_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o12, o13, o14, o15, o16, o17, o9, o10, o11);
		gen17_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o13, o14, o15, o16, o17, o9, o10, o11, o12);
		gen17_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o14, o15, o16, o17, o9, o10, o11, o12, o13);
		gen17_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o15, o16, o17, o9, o10, o11, o12, o13, o14);
		gen17_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o16, o17, o9, o10, o11, o12, o13, o14, o15);
		gen17_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o17, o9, o10, o11, o12, o13, o14, o15, o16);
	}

	private static final void gen17_9(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17){
		gen17_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen17_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o11, o12, o13, o14, o15, o16, o17, o10);
		gen17_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o12, o13, o14, o15, o16, o17, o10, o11);
		gen17_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o13, o14, o15, o16, o17, o10, o11, o12);
		gen17_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o14, o15, o16, o17, o10, o11, o12, o13);
		gen17_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o15, o16, o17, o10, o11, o12, o13, o14);
		gen17_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o16, o17, o10, o11, o12, o13, o14, o15);
		gen17_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o17, o10, o11, o12, o13, o14, o15, o16);
	}

	private static final void gen17_10(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17){
		gen17_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen17_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o12, o13, o14, o15, o16, o17, o11);
		gen17_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o13, o14, o15, o16, o17, o11, o12);
		gen17_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o14, o15, o16, o17, o11, o12, o13);
		gen17_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o15, o16, o17, o11, o12, o13, o14);
		gen17_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o16, o17, o11, o12, o13, o14, o15);
		gen17_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o17, o11, o12, o13, o14, o15, o16);
	}

	private static final void gen17_11(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17){
		gen17_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen17_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o13, o14, o15, o16, o17, o12);
		gen17_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o14, o15, o16, o17, o12, o13);
		gen17_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o15, o16, o17, o12, o13, o14);
		gen17_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o16, o17, o12, o13, o14, o15);
		gen17_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o17, o12, o13, o14, o15, o16);
	}

	private static final void gen17_12(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17){
		gen17_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen17_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o14, o15, o16, o17, o13);
		gen17_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o15, o16, o17, o13, o14);
		gen17_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o16, o17, o13, o14, o15);
		gen17_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o17, o13, o14, o15, o16);
	}

	private static final void gen17_13(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17){
		gen17_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen17_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o15, o16, o17, o14);
		gen17_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o16, o17, o14, o15);
		gen17_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o17, o14, o15, o16);
	}

	private static final void gen17_14(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17){
		gen17_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen17_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o16, o17, o15);
		gen17_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o17, o15, o16);
	}

	private static final void gen17_15(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17){
		pr.recieve17(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		pr.recieve17(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o17, o16);
	}

	private static final void gen18_0(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18){
		gen18_1(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen18_1(pr,o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o1);
		gen18_1(pr,o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o1, o2);
		gen18_1(pr,o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o1, o2, o3);
		gen18_1(pr,o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o1, o2, o3, o4);
		gen18_1(pr,o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o1, o2, o3, o4, o5);
		gen18_1(pr,o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o1, o2, o3, o4, o5, o6);
		gen18_1(pr,o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o1, o2, o3, o4, o5, o6, o7);
		gen18_1(pr,o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o1, o2, o3, o4, o5, o6, o7, o8);
		gen18_1(pr,o10, o11, o12, o13, o14, o15, o16, o17, o18, o1, o2, o3, o4, o5, o6, o7, o8, o9);
		gen18_1(pr,o11, o12, o13, o14, o15, o16, o17, o18, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen18_1(pr,o12, o13, o14, o15, o16, o17, o18, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen18_1(pr,o13, o14, o15, o16, o17, o18, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen18_1(pr,o14, o15, o16, o17, o18, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen18_1(pr,o15, o16, o17, o18, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen18_1(pr,o16, o17, o18, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen18_1(pr,o17, o18, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen18_1(pr,o18, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
	}

	private static final void gen18_1(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18){
		gen18_2(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen18_2(pr,o1, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o2);
		gen18_2(pr,o1, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o2, o3);
		gen18_2(pr,o1, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o2, o3, o4);
		gen18_2(pr,o1, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o2, o3, o4, o5);
		gen18_2(pr,o1, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o2, o3, o4, o5, o6);
		gen18_2(pr,o1, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o2, o3, o4, o5, o6, o7);
		gen18_2(pr,o1, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o2, o3, o4, o5, o6, o7, o8);
		gen18_2(pr,o1, o10, o11, o12, o13, o14, o15, o16, o17, o18, o2, o3, o4, o5, o6, o7, o8, o9);
		gen18_2(pr,o1, o11, o12, o13, o14, o15, o16, o17, o18, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen18_2(pr,o1, o12, o13, o14, o15, o16, o17, o18, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen18_2(pr,o1, o13, o14, o15, o16, o17, o18, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen18_2(pr,o1, o14, o15, o16, o17, o18, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen18_2(pr,o1, o15, o16, o17, o18, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen18_2(pr,o1, o16, o17, o18, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen18_2(pr,o1, o17, o18, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen18_2(pr,o1, o18, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
	}

	private static final void gen18_2(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18){
		gen18_3(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen18_3(pr,o1, o2, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o3);
		gen18_3(pr,o1, o2, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o3, o4);
		gen18_3(pr,o1, o2, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o3, o4, o5);
		gen18_3(pr,o1, o2, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o3, o4, o5, o6);
		gen18_3(pr,o1, o2, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o3, o4, o5, o6, o7);
		gen18_3(pr,o1, o2, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o3, o4, o5, o6, o7, o8);
		gen18_3(pr,o1, o2, o10, o11, o12, o13, o14, o15, o16, o17, o18, o3, o4, o5, o6, o7, o8, o9);
		gen18_3(pr,o1, o2, o11, o12, o13, o14, o15, o16, o17, o18, o3, o4, o5, o6, o7, o8, o9, o10);
		gen18_3(pr,o1, o2, o12, o13, o14, o15, o16, o17, o18, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen18_3(pr,o1, o2, o13, o14, o15, o16, o17, o18, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen18_3(pr,o1, o2, o14, o15, o16, o17, o18, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen18_3(pr,o1, o2, o15, o16, o17, o18, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen18_3(pr,o1, o2, o16, o17, o18, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen18_3(pr,o1, o2, o17, o18, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen18_3(pr,o1, o2, o18, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
	}

	private static final void gen18_3(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18){
		gen18_4(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen18_4(pr,o1, o2, o3, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o4);
		gen18_4(pr,o1, o2, o3, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o4, o5);
		gen18_4(pr,o1, o2, o3, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o4, o5, o6);
		gen18_4(pr,o1, o2, o3, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o4, o5, o6, o7);
		gen18_4(pr,o1, o2, o3, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o4, o5, o6, o7, o8);
		gen18_4(pr,o1, o2, o3, o10, o11, o12, o13, o14, o15, o16, o17, o18, o4, o5, o6, o7, o8, o9);
		gen18_4(pr,o1, o2, o3, o11, o12, o13, o14, o15, o16, o17, o18, o4, o5, o6, o7, o8, o9, o10);
		gen18_4(pr,o1, o2, o3, o12, o13, o14, o15, o16, o17, o18, o4, o5, o6, o7, o8, o9, o10, o11);
		gen18_4(pr,o1, o2, o3, o13, o14, o15, o16, o17, o18, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen18_4(pr,o1, o2, o3, o14, o15, o16, o17, o18, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen18_4(pr,o1, o2, o3, o15, o16, o17, o18, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen18_4(pr,o1, o2, o3, o16, o17, o18, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen18_4(pr,o1, o2, o3, o17, o18, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen18_4(pr,o1, o2, o3, o18, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
	}

	private static final void gen18_4(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18){
		gen18_5(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen18_5(pr,o1, o2, o3, o4, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o5);
		gen18_5(pr,o1, o2, o3, o4, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o5, o6);
		gen18_5(pr,o1, o2, o3, o4, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o5, o6, o7);
		gen18_5(pr,o1, o2, o3, o4, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o5, o6, o7, o8);
		gen18_5(pr,o1, o2, o3, o4, o10, o11, o12, o13, o14, o15, o16, o17, o18, o5, o6, o7, o8, o9);
		gen18_5(pr,o1, o2, o3, o4, o11, o12, o13, o14, o15, o16, o17, o18, o5, o6, o7, o8, o9, o10);
		gen18_5(pr,o1, o2, o3, o4, o12, o13, o14, o15, o16, o17, o18, o5, o6, o7, o8, o9, o10, o11);
		gen18_5(pr,o1, o2, o3, o4, o13, o14, o15, o16, o17, o18, o5, o6, o7, o8, o9, o10, o11, o12);
		gen18_5(pr,o1, o2, o3, o4, o14, o15, o16, o17, o18, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen18_5(pr,o1, o2, o3, o4, o15, o16, o17, o18, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen18_5(pr,o1, o2, o3, o4, o16, o17, o18, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen18_5(pr,o1, o2, o3, o4, o17, o18, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen18_5(pr,o1, o2, o3, o4, o18, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
	}

	private static final void gen18_5(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18){
		gen18_6(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen18_6(pr,o1, o2, o3, o4, o5, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o6);
		gen18_6(pr,o1, o2, o3, o4, o5, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o6, o7);
		gen18_6(pr,o1, o2, o3, o4, o5, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o6, o7, o8);
		gen18_6(pr,o1, o2, o3, o4, o5, o10, o11, o12, o13, o14, o15, o16, o17, o18, o6, o7, o8, o9);
		gen18_6(pr,o1, o2, o3, o4, o5, o11, o12, o13, o14, o15, o16, o17, o18, o6, o7, o8, o9, o10);
		gen18_6(pr,o1, o2, o3, o4, o5, o12, o13, o14, o15, o16, o17, o18, o6, o7, o8, o9, o10, o11);
		gen18_6(pr,o1, o2, o3, o4, o5, o13, o14, o15, o16, o17, o18, o6, o7, o8, o9, o10, o11, o12);
		gen18_6(pr,o1, o2, o3, o4, o5, o14, o15, o16, o17, o18, o6, o7, o8, o9, o10, o11, o12, o13);
		gen18_6(pr,o1, o2, o3, o4, o5, o15, o16, o17, o18, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen18_6(pr,o1, o2, o3, o4, o5, o16, o17, o18, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen18_6(pr,o1, o2, o3, o4, o5, o17, o18, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen18_6(pr,o1, o2, o3, o4, o5, o18, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
	}

	private static final void gen18_6(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18){
		gen18_7(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen18_7(pr,o1, o2, o3, o4, o5, o6, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o7);
		gen18_7(pr,o1, o2, o3, o4, o5, o6, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o7, o8);
		gen18_7(pr,o1, o2, o3, o4, o5, o6, o10, o11, o12, o13, o14, o15, o16, o17, o18, o7, o8, o9);
		gen18_7(pr,o1, o2, o3, o4, o5, o6, o11, o12, o13, o14, o15, o16, o17, o18, o7, o8, o9, o10);
		gen18_7(pr,o1, o2, o3, o4, o5, o6, o12, o13, o14, o15, o16, o17, o18, o7, o8, o9, o10, o11);
		gen18_7(pr,o1, o2, o3, o4, o5, o6, o13, o14, o15, o16, o17, o18, o7, o8, o9, o10, o11, o12);
		gen18_7(pr,o1, o2, o3, o4, o5, o6, o14, o15, o16, o17, o18, o7, o8, o9, o10, o11, o12, o13);
		gen18_7(pr,o1, o2, o3, o4, o5, o6, o15, o16, o17, o18, o7, o8, o9, o10, o11, o12, o13, o14);
		gen18_7(pr,o1, o2, o3, o4, o5, o6, o16, o17, o18, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen18_7(pr,o1, o2, o3, o4, o5, o6, o17, o18, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen18_7(pr,o1, o2, o3, o4, o5, o6, o18, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
	}

	private static final void gen18_7(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18){
		gen18_8(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen18_8(pr,o1, o2, o3, o4, o5, o6, o7, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o8);
		gen18_8(pr,o1, o2, o3, o4, o5, o6, o7, o10, o11, o12, o13, o14, o15, o16, o17, o18, o8, o9);
		gen18_8(pr,o1, o2, o3, o4, o5, o6, o7, o11, o12, o13, o14, o15, o16, o17, o18, o8, o9, o10);
		gen18_8(pr,o1, o2, o3, o4, o5, o6, o7, o12, o13, o14, o15, o16, o17, o18, o8, o9, o10, o11);
		gen18_8(pr,o1, o2, o3, o4, o5, o6, o7, o13, o14, o15, o16, o17, o18, o8, o9, o10, o11, o12);
		gen18_8(pr,o1, o2, o3, o4, o5, o6, o7, o14, o15, o16, o17, o18, o8, o9, o10, o11, o12, o13);
		gen18_8(pr,o1, o2, o3, o4, o5, o6, o7, o15, o16, o17, o18, o8, o9, o10, o11, o12, o13, o14);
		gen18_8(pr,o1, o2, o3, o4, o5, o6, o7, o16, o17, o18, o8, o9, o10, o11, o12, o13, o14, o15);
		gen18_8(pr,o1, o2, o3, o4, o5, o6, o7, o17, o18, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen18_8(pr,o1, o2, o3, o4, o5, o6, o7, o18, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
	}

	private static final void gen18_8(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18){
		gen18_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen18_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o10, o11, o12, o13, o14, o15, o16, o17, o18, o9);
		gen18_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o11, o12, o13, o14, o15, o16, o17, o18, o9, o10);
		gen18_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o12, o13, o14, o15, o16, o17, o18, o9, o10, o11);
		gen18_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o13, o14, o15, o16, o17, o18, o9, o10, o11, o12);
		gen18_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o14, o15, o16, o17, o18, o9, o10, o11, o12, o13);
		gen18_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o15, o16, o17, o18, o9, o10, o11, o12, o13, o14);
		gen18_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o16, o17, o18, o9, o10, o11, o12, o13, o14, o15);
		gen18_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o17, o18, o9, o10, o11, o12, o13, o14, o15, o16);
		gen18_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o18, o9, o10, o11, o12, o13, o14, o15, o16, o17);
	}

	private static final void gen18_9(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18){
		gen18_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen18_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o11, o12, o13, o14, o15, o16, o17, o18, o10);
		gen18_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o12, o13, o14, o15, o16, o17, o18, o10, o11);
		gen18_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o13, o14, o15, o16, o17, o18, o10, o11, o12);
		gen18_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o14, o15, o16, o17, o18, o10, o11, o12, o13);
		gen18_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o15, o16, o17, o18, o10, o11, o12, o13, o14);
		gen18_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o16, o17, o18, o10, o11, o12, o13, o14, o15);
		gen18_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o17, o18, o10, o11, o12, o13, o14, o15, o16);
		gen18_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o18, o10, o11, o12, o13, o14, o15, o16, o17);
	}

	private static final void gen18_10(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18){
		gen18_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen18_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o12, o13, o14, o15, o16, o17, o18, o11);
		gen18_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o13, o14, o15, o16, o17, o18, o11, o12);
		gen18_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o14, o15, o16, o17, o18, o11, o12, o13);
		gen18_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o15, o16, o17, o18, o11, o12, o13, o14);
		gen18_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o16, o17, o18, o11, o12, o13, o14, o15);
		gen18_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o17, o18, o11, o12, o13, o14, o15, o16);
		gen18_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o18, o11, o12, o13, o14, o15, o16, o17);
	}

	private static final void gen18_11(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18){
		gen18_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen18_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o13, o14, o15, o16, o17, o18, o12);
		gen18_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o14, o15, o16, o17, o18, o12, o13);
		gen18_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o15, o16, o17, o18, o12, o13, o14);
		gen18_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o16, o17, o18, o12, o13, o14, o15);
		gen18_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o17, o18, o12, o13, o14, o15, o16);
		gen18_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o18, o12, o13, o14, o15, o16, o17);
	}

	private static final void gen18_12(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18){
		gen18_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen18_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o14, o15, o16, o17, o18, o13);
		gen18_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o15, o16, o17, o18, o13, o14);
		gen18_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o16, o17, o18, o13, o14, o15);
		gen18_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o17, o18, o13, o14, o15, o16);
		gen18_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o18, o13, o14, o15, o16, o17);
	}

	private static final void gen18_13(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18){
		gen18_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen18_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o15, o16, o17, o18, o14);
		gen18_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o16, o17, o18, o14, o15);
		gen18_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o17, o18, o14, o15, o16);
		gen18_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o18, o14, o15, o16, o17);
	}

	private static final void gen18_14(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18){
		gen18_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen18_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o16, o17, o18, o15);
		gen18_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o17, o18, o15, o16);
		gen18_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o18, o15, o16, o17);
	}

	private static final void gen18_15(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18){
		gen18_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen18_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o17, o18, o16);
		gen18_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o18, o16, o17);
	}

	private static final void gen18_16(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18){
		pr.recieve18(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		pr.recieve18(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o18, o17);
	}

	private static final void gen19_0(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19){
		gen19_1(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen19_1(pr,o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o1);
		gen19_1(pr,o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o1, o2);
		gen19_1(pr,o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o1, o2, o3);
		gen19_1(pr,o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o1, o2, o3, o4);
		gen19_1(pr,o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o1, o2, o3, o4, o5);
		gen19_1(pr,o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o1, o2, o3, o4, o5, o6);
		gen19_1(pr,o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o1, o2, o3, o4, o5, o6, o7);
		gen19_1(pr,o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o1, o2, o3, o4, o5, o6, o7, o8);
		gen19_1(pr,o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o1, o2, o3, o4, o5, o6, o7, o8, o9);
		gen19_1(pr,o11, o12, o13, o14, o15, o16, o17, o18, o19, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen19_1(pr,o12, o13, o14, o15, o16, o17, o18, o19, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen19_1(pr,o13, o14, o15, o16, o17, o18, o19, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen19_1(pr,o14, o15, o16, o17, o18, o19, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen19_1(pr,o15, o16, o17, o18, o19, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen19_1(pr,o16, o17, o18, o19, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen19_1(pr,o17, o18, o19, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen19_1(pr,o18, o19, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen19_1(pr,o19, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
	}

	private static final void gen19_1(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19){
		gen19_2(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen19_2(pr,o1, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o2);
		gen19_2(pr,o1, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o2, o3);
		gen19_2(pr,o1, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o2, o3, o4);
		gen19_2(pr,o1, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o2, o3, o4, o5);
		gen19_2(pr,o1, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o2, o3, o4, o5, o6);
		gen19_2(pr,o1, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o2, o3, o4, o5, o6, o7);
		gen19_2(pr,o1, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o2, o3, o4, o5, o6, o7, o8);
		gen19_2(pr,o1, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o2, o3, o4, o5, o6, o7, o8, o9);
		gen19_2(pr,o1, o11, o12, o13, o14, o15, o16, o17, o18, o19, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen19_2(pr,o1, o12, o13, o14, o15, o16, o17, o18, o19, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen19_2(pr,o1, o13, o14, o15, o16, o17, o18, o19, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen19_2(pr,o1, o14, o15, o16, o17, o18, o19, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen19_2(pr,o1, o15, o16, o17, o18, o19, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen19_2(pr,o1, o16, o17, o18, o19, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen19_2(pr,o1, o17, o18, o19, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen19_2(pr,o1, o18, o19, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen19_2(pr,o1, o19, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
	}

	private static final void gen19_2(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19){
		gen19_3(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen19_3(pr,o1, o2, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o3);
		gen19_3(pr,o1, o2, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o3, o4);
		gen19_3(pr,o1, o2, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o3, o4, o5);
		gen19_3(pr,o1, o2, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o3, o4, o5, o6);
		gen19_3(pr,o1, o2, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o3, o4, o5, o6, o7);
		gen19_3(pr,o1, o2, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o3, o4, o5, o6, o7, o8);
		gen19_3(pr,o1, o2, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o3, o4, o5, o6, o7, o8, o9);
		gen19_3(pr,o1, o2, o11, o12, o13, o14, o15, o16, o17, o18, o19, o3, o4, o5, o6, o7, o8, o9, o10);
		gen19_3(pr,o1, o2, o12, o13, o14, o15, o16, o17, o18, o19, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen19_3(pr,o1, o2, o13, o14, o15, o16, o17, o18, o19, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen19_3(pr,o1, o2, o14, o15, o16, o17, o18, o19, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen19_3(pr,o1, o2, o15, o16, o17, o18, o19, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen19_3(pr,o1, o2, o16, o17, o18, o19, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen19_3(pr,o1, o2, o17, o18, o19, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen19_3(pr,o1, o2, o18, o19, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen19_3(pr,o1, o2, o19, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
	}

	private static final void gen19_3(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19){
		gen19_4(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen19_4(pr,o1, o2, o3, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o4);
		gen19_4(pr,o1, o2, o3, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o4, o5);
		gen19_4(pr,o1, o2, o3, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o4, o5, o6);
		gen19_4(pr,o1, o2, o3, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o4, o5, o6, o7);
		gen19_4(pr,o1, o2, o3, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o4, o5, o6, o7, o8);
		gen19_4(pr,o1, o2, o3, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o4, o5, o6, o7, o8, o9);
		gen19_4(pr,o1, o2, o3, o11, o12, o13, o14, o15, o16, o17, o18, o19, o4, o5, o6, o7, o8, o9, o10);
		gen19_4(pr,o1, o2, o3, o12, o13, o14, o15, o16, o17, o18, o19, o4, o5, o6, o7, o8, o9, o10, o11);
		gen19_4(pr,o1, o2, o3, o13, o14, o15, o16, o17, o18, o19, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen19_4(pr,o1, o2, o3, o14, o15, o16, o17, o18, o19, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen19_4(pr,o1, o2, o3, o15, o16, o17, o18, o19, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen19_4(pr,o1, o2, o3, o16, o17, o18, o19, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen19_4(pr,o1, o2, o3, o17, o18, o19, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen19_4(pr,o1, o2, o3, o18, o19, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen19_4(pr,o1, o2, o3, o19, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
	}

	private static final void gen19_4(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19){
		gen19_5(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen19_5(pr,o1, o2, o3, o4, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o5);
		gen19_5(pr,o1, o2, o3, o4, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o5, o6);
		gen19_5(pr,o1, o2, o3, o4, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o5, o6, o7);
		gen19_5(pr,o1, o2, o3, o4, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o5, o6, o7, o8);
		gen19_5(pr,o1, o2, o3, o4, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o5, o6, o7, o8, o9);
		gen19_5(pr,o1, o2, o3, o4, o11, o12, o13, o14, o15, o16, o17, o18, o19, o5, o6, o7, o8, o9, o10);
		gen19_5(pr,o1, o2, o3, o4, o12, o13, o14, o15, o16, o17, o18, o19, o5, o6, o7, o8, o9, o10, o11);
		gen19_5(pr,o1, o2, o3, o4, o13, o14, o15, o16, o17, o18, o19, o5, o6, o7, o8, o9, o10, o11, o12);
		gen19_5(pr,o1, o2, o3, o4, o14, o15, o16, o17, o18, o19, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen19_5(pr,o1, o2, o3, o4, o15, o16, o17, o18, o19, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen19_5(pr,o1, o2, o3, o4, o16, o17, o18, o19, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen19_5(pr,o1, o2, o3, o4, o17, o18, o19, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen19_5(pr,o1, o2, o3, o4, o18, o19, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen19_5(pr,o1, o2, o3, o4, o19, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
	}

	private static final void gen19_5(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19){
		gen19_6(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen19_6(pr,o1, o2, o3, o4, o5, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o6);
		gen19_6(pr,o1, o2, o3, o4, o5, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o6, o7);
		gen19_6(pr,o1, o2, o3, o4, o5, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o6, o7, o8);
		gen19_6(pr,o1, o2, o3, o4, o5, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o6, o7, o8, o9);
		gen19_6(pr,o1, o2, o3, o4, o5, o11, o12, o13, o14, o15, o16, o17, o18, o19, o6, o7, o8, o9, o10);
		gen19_6(pr,o1, o2, o3, o4, o5, o12, o13, o14, o15, o16, o17, o18, o19, o6, o7, o8, o9, o10, o11);
		gen19_6(pr,o1, o2, o3, o4, o5, o13, o14, o15, o16, o17, o18, o19, o6, o7, o8, o9, o10, o11, o12);
		gen19_6(pr,o1, o2, o3, o4, o5, o14, o15, o16, o17, o18, o19, o6, o7, o8, o9, o10, o11, o12, o13);
		gen19_6(pr,o1, o2, o3, o4, o5, o15, o16, o17, o18, o19, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen19_6(pr,o1, o2, o3, o4, o5, o16, o17, o18, o19, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen19_6(pr,o1, o2, o3, o4, o5, o17, o18, o19, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen19_6(pr,o1, o2, o3, o4, o5, o18, o19, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen19_6(pr,o1, o2, o3, o4, o5, o19, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
	}

	private static final void gen19_6(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19){
		gen19_7(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen19_7(pr,o1, o2, o3, o4, o5, o6, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o7);
		gen19_7(pr,o1, o2, o3, o4, o5, o6, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o7, o8);
		gen19_7(pr,o1, o2, o3, o4, o5, o6, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o7, o8, o9);
		gen19_7(pr,o1, o2, o3, o4, o5, o6, o11, o12, o13, o14, o15, o16, o17, o18, o19, o7, o8, o9, o10);
		gen19_7(pr,o1, o2, o3, o4, o5, o6, o12, o13, o14, o15, o16, o17, o18, o19, o7, o8, o9, o10, o11);
		gen19_7(pr,o1, o2, o3, o4, o5, o6, o13, o14, o15, o16, o17, o18, o19, o7, o8, o9, o10, o11, o12);
		gen19_7(pr,o1, o2, o3, o4, o5, o6, o14, o15, o16, o17, o18, o19, o7, o8, o9, o10, o11, o12, o13);
		gen19_7(pr,o1, o2, o3, o4, o5, o6, o15, o16, o17, o18, o19, o7, o8, o9, o10, o11, o12, o13, o14);
		gen19_7(pr,o1, o2, o3, o4, o5, o6, o16, o17, o18, o19, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen19_7(pr,o1, o2, o3, o4, o5, o6, o17, o18, o19, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen19_7(pr,o1, o2, o3, o4, o5, o6, o18, o19, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen19_7(pr,o1, o2, o3, o4, o5, o6, o19, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
	}

	private static final void gen19_7(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19){
		gen19_8(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen19_8(pr,o1, o2, o3, o4, o5, o6, o7, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o8);
		gen19_8(pr,o1, o2, o3, o4, o5, o6, o7, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o8, o9);
		gen19_8(pr,o1, o2, o3, o4, o5, o6, o7, o11, o12, o13, o14, o15, o16, o17, o18, o19, o8, o9, o10);
		gen19_8(pr,o1, o2, o3, o4, o5, o6, o7, o12, o13, o14, o15, o16, o17, o18, o19, o8, o9, o10, o11);
		gen19_8(pr,o1, o2, o3, o4, o5, o6, o7, o13, o14, o15, o16, o17, o18, o19, o8, o9, o10, o11, o12);
		gen19_8(pr,o1, o2, o3, o4, o5, o6, o7, o14, o15, o16, o17, o18, o19, o8, o9, o10, o11, o12, o13);
		gen19_8(pr,o1, o2, o3, o4, o5, o6, o7, o15, o16, o17, o18, o19, o8, o9, o10, o11, o12, o13, o14);
		gen19_8(pr,o1, o2, o3, o4, o5, o6, o7, o16, o17, o18, o19, o8, o9, o10, o11, o12, o13, o14, o15);
		gen19_8(pr,o1, o2, o3, o4, o5, o6, o7, o17, o18, o19, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen19_8(pr,o1, o2, o3, o4, o5, o6, o7, o18, o19, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen19_8(pr,o1, o2, o3, o4, o5, o6, o7, o19, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
	}

	private static final void gen19_8(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19){
		gen19_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen19_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o9);
		gen19_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o11, o12, o13, o14, o15, o16, o17, o18, o19, o9, o10);
		gen19_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o12, o13, o14, o15, o16, o17, o18, o19, o9, o10, o11);
		gen19_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o13, o14, o15, o16, o17, o18, o19, o9, o10, o11, o12);
		gen19_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o14, o15, o16, o17, o18, o19, o9, o10, o11, o12, o13);
		gen19_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o15, o16, o17, o18, o19, o9, o10, o11, o12, o13, o14);
		gen19_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o16, o17, o18, o19, o9, o10, o11, o12, o13, o14, o15);
		gen19_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o17, o18, o19, o9, o10, o11, o12, o13, o14, o15, o16);
		gen19_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o18, o19, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen19_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o19, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
	}

	private static final void gen19_9(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19){
		gen19_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen19_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o11, o12, o13, o14, o15, o16, o17, o18, o19, o10);
		gen19_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o12, o13, o14, o15, o16, o17, o18, o19, o10, o11);
		gen19_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o13, o14, o15, o16, o17, o18, o19, o10, o11, o12);
		gen19_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o14, o15, o16, o17, o18, o19, o10, o11, o12, o13);
		gen19_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o15, o16, o17, o18, o19, o10, o11, o12, o13, o14);
		gen19_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o16, o17, o18, o19, o10, o11, o12, o13, o14, o15);
		gen19_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o17, o18, o19, o10, o11, o12, o13, o14, o15, o16);
		gen19_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o18, o19, o10, o11, o12, o13, o14, o15, o16, o17);
		gen19_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o19, o10, o11, o12, o13, o14, o15, o16, o17, o18);
	}

	private static final void gen19_10(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19){
		gen19_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen19_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o12, o13, o14, o15, o16, o17, o18, o19, o11);
		gen19_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o13, o14, o15, o16, o17, o18, o19, o11, o12);
		gen19_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o14, o15, o16, o17, o18, o19, o11, o12, o13);
		gen19_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o15, o16, o17, o18, o19, o11, o12, o13, o14);
		gen19_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o16, o17, o18, o19, o11, o12, o13, o14, o15);
		gen19_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o17, o18, o19, o11, o12, o13, o14, o15, o16);
		gen19_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o18, o19, o11, o12, o13, o14, o15, o16, o17);
		gen19_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o19, o11, o12, o13, o14, o15, o16, o17, o18);
	}

	private static final void gen19_11(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19){
		gen19_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen19_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o13, o14, o15, o16, o17, o18, o19, o12);
		gen19_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o14, o15, o16, o17, o18, o19, o12, o13);
		gen19_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o15, o16, o17, o18, o19, o12, o13, o14);
		gen19_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o16, o17, o18, o19, o12, o13, o14, o15);
		gen19_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o17, o18, o19, o12, o13, o14, o15, o16);
		gen19_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o18, o19, o12, o13, o14, o15, o16, o17);
		gen19_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o19, o12, o13, o14, o15, o16, o17, o18);
	}

	private static final void gen19_12(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19){
		gen19_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen19_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o14, o15, o16, o17, o18, o19, o13);
		gen19_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o15, o16, o17, o18, o19, o13, o14);
		gen19_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o16, o17, o18, o19, o13, o14, o15);
		gen19_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o17, o18, o19, o13, o14, o15, o16);
		gen19_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o18, o19, o13, o14, o15, o16, o17);
		gen19_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o19, o13, o14, o15, o16, o17, o18);
	}

	private static final void gen19_13(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19){
		gen19_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen19_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o15, o16, o17, o18, o19, o14);
		gen19_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o16, o17, o18, o19, o14, o15);
		gen19_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o17, o18, o19, o14, o15, o16);
		gen19_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o18, o19, o14, o15, o16, o17);
		gen19_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o19, o14, o15, o16, o17, o18);
	}

	private static final void gen19_14(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19){
		gen19_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen19_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o16, o17, o18, o19, o15);
		gen19_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o17, o18, o19, o15, o16);
		gen19_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o18, o19, o15, o16, o17);
		gen19_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o19, o15, o16, o17, o18);
	}

	private static final void gen19_15(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19){
		gen19_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen19_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o17, o18, o19, o16);
		gen19_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o18, o19, o16, o17);
		gen19_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o19, o16, o17, o18);
	}

	private static final void gen19_16(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19){
		gen19_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen19_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o18, o19, o17);
		gen19_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o19, o17, o18);
	}

	private static final void gen19_17(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19){
		pr.recieve19(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		pr.recieve19(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o19, o18);
	}

	private static final void gen20_0(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20){
		gen20_1(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen20_1(pr,o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o1);
		gen20_1(pr,o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o1, o2);
		gen20_1(pr,o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o1, o2, o3);
		gen20_1(pr,o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o1, o2, o3, o4);
		gen20_1(pr,o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o1, o2, o3, o4, o5);
		gen20_1(pr,o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o1, o2, o3, o4, o5, o6);
		gen20_1(pr,o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o1, o2, o3, o4, o5, o6, o7);
		gen20_1(pr,o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o1, o2, o3, o4, o5, o6, o7, o8);
		gen20_1(pr,o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o1, o2, o3, o4, o5, o6, o7, o8, o9);
		gen20_1(pr,o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen20_1(pr,o12, o13, o14, o15, o16, o17, o18, o19, o20, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen20_1(pr,o13, o14, o15, o16, o17, o18, o19, o20, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen20_1(pr,o14, o15, o16, o17, o18, o19, o20, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen20_1(pr,o15, o16, o17, o18, o19, o20, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen20_1(pr,o16, o17, o18, o19, o20, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen20_1(pr,o17, o18, o19, o20, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen20_1(pr,o18, o19, o20, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen20_1(pr,o19, o20, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen20_1(pr,o20, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
	}

	private static final void gen20_1(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20){
		gen20_2(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen20_2(pr,o1, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o2);
		gen20_2(pr,o1, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o2, o3);
		gen20_2(pr,o1, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o2, o3, o4);
		gen20_2(pr,o1, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o2, o3, o4, o5);
		gen20_2(pr,o1, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o2, o3, o4, o5, o6);
		gen20_2(pr,o1, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o2, o3, o4, o5, o6, o7);
		gen20_2(pr,o1, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o2, o3, o4, o5, o6, o7, o8);
		gen20_2(pr,o1, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o2, o3, o4, o5, o6, o7, o8, o9);
		gen20_2(pr,o1, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen20_2(pr,o1, o12, o13, o14, o15, o16, o17, o18, o19, o20, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen20_2(pr,o1, o13, o14, o15, o16, o17, o18, o19, o20, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen20_2(pr,o1, o14, o15, o16, o17, o18, o19, o20, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen20_2(pr,o1, o15, o16, o17, o18, o19, o20, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen20_2(pr,o1, o16, o17, o18, o19, o20, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen20_2(pr,o1, o17, o18, o19, o20, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen20_2(pr,o1, o18, o19, o20, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen20_2(pr,o1, o19, o20, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen20_2(pr,o1, o20, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
	}

	private static final void gen20_2(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20){
		gen20_3(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen20_3(pr,o1, o2, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o3);
		gen20_3(pr,o1, o2, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o3, o4);
		gen20_3(pr,o1, o2, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o3, o4, o5);
		gen20_3(pr,o1, o2, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o3, o4, o5, o6);
		gen20_3(pr,o1, o2, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o3, o4, o5, o6, o7);
		gen20_3(pr,o1, o2, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o3, o4, o5, o6, o7, o8);
		gen20_3(pr,o1, o2, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o3, o4, o5, o6, o7, o8, o9);
		gen20_3(pr,o1, o2, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o3, o4, o5, o6, o7, o8, o9, o10);
		gen20_3(pr,o1, o2, o12, o13, o14, o15, o16, o17, o18, o19, o20, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen20_3(pr,o1, o2, o13, o14, o15, o16, o17, o18, o19, o20, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen20_3(pr,o1, o2, o14, o15, o16, o17, o18, o19, o20, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen20_3(pr,o1, o2, o15, o16, o17, o18, o19, o20, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen20_3(pr,o1, o2, o16, o17, o18, o19, o20, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen20_3(pr,o1, o2, o17, o18, o19, o20, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen20_3(pr,o1, o2, o18, o19, o20, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen20_3(pr,o1, o2, o19, o20, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen20_3(pr,o1, o2, o20, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
	}

	private static final void gen20_3(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20){
		gen20_4(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen20_4(pr,o1, o2, o3, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o4);
		gen20_4(pr,o1, o2, o3, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o4, o5);
		gen20_4(pr,o1, o2, o3, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o4, o5, o6);
		gen20_4(pr,o1, o2, o3, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o4, o5, o6, o7);
		gen20_4(pr,o1, o2, o3, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o4, o5, o6, o7, o8);
		gen20_4(pr,o1, o2, o3, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o4, o5, o6, o7, o8, o9);
		gen20_4(pr,o1, o2, o3, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o4, o5, o6, o7, o8, o9, o10);
		gen20_4(pr,o1, o2, o3, o12, o13, o14, o15, o16, o17, o18, o19, o20, o4, o5, o6, o7, o8, o9, o10, o11);
		gen20_4(pr,o1, o2, o3, o13, o14, o15, o16, o17, o18, o19, o20, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen20_4(pr,o1, o2, o3, o14, o15, o16, o17, o18, o19, o20, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen20_4(pr,o1, o2, o3, o15, o16, o17, o18, o19, o20, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen20_4(pr,o1, o2, o3, o16, o17, o18, o19, o20, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen20_4(pr,o1, o2, o3, o17, o18, o19, o20, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen20_4(pr,o1, o2, o3, o18, o19, o20, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen20_4(pr,o1, o2, o3, o19, o20, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen20_4(pr,o1, o2, o3, o20, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
	}

	private static final void gen20_4(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20){
		gen20_5(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen20_5(pr,o1, o2, o3, o4, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o5);
		gen20_5(pr,o1, o2, o3, o4, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o5, o6);
		gen20_5(pr,o1, o2, o3, o4, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o5, o6, o7);
		gen20_5(pr,o1, o2, o3, o4, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o5, o6, o7, o8);
		gen20_5(pr,o1, o2, o3, o4, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o5, o6, o7, o8, o9);
		gen20_5(pr,o1, o2, o3, o4, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o5, o6, o7, o8, o9, o10);
		gen20_5(pr,o1, o2, o3, o4, o12, o13, o14, o15, o16, o17, o18, o19, o20, o5, o6, o7, o8, o9, o10, o11);
		gen20_5(pr,o1, o2, o3, o4, o13, o14, o15, o16, o17, o18, o19, o20, o5, o6, o7, o8, o9, o10, o11, o12);
		gen20_5(pr,o1, o2, o3, o4, o14, o15, o16, o17, o18, o19, o20, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen20_5(pr,o1, o2, o3, o4, o15, o16, o17, o18, o19, o20, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen20_5(pr,o1, o2, o3, o4, o16, o17, o18, o19, o20, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen20_5(pr,o1, o2, o3, o4, o17, o18, o19, o20, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen20_5(pr,o1, o2, o3, o4, o18, o19, o20, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen20_5(pr,o1, o2, o3, o4, o19, o20, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen20_5(pr,o1, o2, o3, o4, o20, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
	}

	private static final void gen20_5(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20){
		gen20_6(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen20_6(pr,o1, o2, o3, o4, o5, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o6);
		gen20_6(pr,o1, o2, o3, o4, o5, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o6, o7);
		gen20_6(pr,o1, o2, o3, o4, o5, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o6, o7, o8);
		gen20_6(pr,o1, o2, o3, o4, o5, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o6, o7, o8, o9);
		gen20_6(pr,o1, o2, o3, o4, o5, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o6, o7, o8, o9, o10);
		gen20_6(pr,o1, o2, o3, o4, o5, o12, o13, o14, o15, o16, o17, o18, o19, o20, o6, o7, o8, o9, o10, o11);
		gen20_6(pr,o1, o2, o3, o4, o5, o13, o14, o15, o16, o17, o18, o19, o20, o6, o7, o8, o9, o10, o11, o12);
		gen20_6(pr,o1, o2, o3, o4, o5, o14, o15, o16, o17, o18, o19, o20, o6, o7, o8, o9, o10, o11, o12, o13);
		gen20_6(pr,o1, o2, o3, o4, o5, o15, o16, o17, o18, o19, o20, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen20_6(pr,o1, o2, o3, o4, o5, o16, o17, o18, o19, o20, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen20_6(pr,o1, o2, o3, o4, o5, o17, o18, o19, o20, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen20_6(pr,o1, o2, o3, o4, o5, o18, o19, o20, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen20_6(pr,o1, o2, o3, o4, o5, o19, o20, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen20_6(pr,o1, o2, o3, o4, o5, o20, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
	}

	private static final void gen20_6(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20){
		gen20_7(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen20_7(pr,o1, o2, o3, o4, o5, o6, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o7);
		gen20_7(pr,o1, o2, o3, o4, o5, o6, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o7, o8);
		gen20_7(pr,o1, o2, o3, o4, o5, o6, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o7, o8, o9);
		gen20_7(pr,o1, o2, o3, o4, o5, o6, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o7, o8, o9, o10);
		gen20_7(pr,o1, o2, o3, o4, o5, o6, o12, o13, o14, o15, o16, o17, o18, o19, o20, o7, o8, o9, o10, o11);
		gen20_7(pr,o1, o2, o3, o4, o5, o6, o13, o14, o15, o16, o17, o18, o19, o20, o7, o8, o9, o10, o11, o12);
		gen20_7(pr,o1, o2, o3, o4, o5, o6, o14, o15, o16, o17, o18, o19, o20, o7, o8, o9, o10, o11, o12, o13);
		gen20_7(pr,o1, o2, o3, o4, o5, o6, o15, o16, o17, o18, o19, o20, o7, o8, o9, o10, o11, o12, o13, o14);
		gen20_7(pr,o1, o2, o3, o4, o5, o6, o16, o17, o18, o19, o20, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen20_7(pr,o1, o2, o3, o4, o5, o6, o17, o18, o19, o20, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen20_7(pr,o1, o2, o3, o4, o5, o6, o18, o19, o20, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen20_7(pr,o1, o2, o3, o4, o5, o6, o19, o20, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen20_7(pr,o1, o2, o3, o4, o5, o6, o20, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
	}

	private static final void gen20_7(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20){
		gen20_8(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen20_8(pr,o1, o2, o3, o4, o5, o6, o7, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o8);
		gen20_8(pr,o1, o2, o3, o4, o5, o6, o7, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o8, o9);
		gen20_8(pr,o1, o2, o3, o4, o5, o6, o7, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o8, o9, o10);
		gen20_8(pr,o1, o2, o3, o4, o5, o6, o7, o12, o13, o14, o15, o16, o17, o18, o19, o20, o8, o9, o10, o11);
		gen20_8(pr,o1, o2, o3, o4, o5, o6, o7, o13, o14, o15, o16, o17, o18, o19, o20, o8, o9, o10, o11, o12);
		gen20_8(pr,o1, o2, o3, o4, o5, o6, o7, o14, o15, o16, o17, o18, o19, o20, o8, o9, o10, o11, o12, o13);
		gen20_8(pr,o1, o2, o3, o4, o5, o6, o7, o15, o16, o17, o18, o19, o20, o8, o9, o10, o11, o12, o13, o14);
		gen20_8(pr,o1, o2, o3, o4, o5, o6, o7, o16, o17, o18, o19, o20, o8, o9, o10, o11, o12, o13, o14, o15);
		gen20_8(pr,o1, o2, o3, o4, o5, o6, o7, o17, o18, o19, o20, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen20_8(pr,o1, o2, o3, o4, o5, o6, o7, o18, o19, o20, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen20_8(pr,o1, o2, o3, o4, o5, o6, o7, o19, o20, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen20_8(pr,o1, o2, o3, o4, o5, o6, o7, o20, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
	}

	private static final void gen20_8(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20){
		gen20_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen20_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o9);
		gen20_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o9, o10);
		gen20_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o12, o13, o14, o15, o16, o17, o18, o19, o20, o9, o10, o11);
		gen20_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o13, o14, o15, o16, o17, o18, o19, o20, o9, o10, o11, o12);
		gen20_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o14, o15, o16, o17, o18, o19, o20, o9, o10, o11, o12, o13);
		gen20_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o15, o16, o17, o18, o19, o20, o9, o10, o11, o12, o13, o14);
		gen20_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o16, o17, o18, o19, o20, o9, o10, o11, o12, o13, o14, o15);
		gen20_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o17, o18, o19, o20, o9, o10, o11, o12, o13, o14, o15, o16);
		gen20_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o18, o19, o20, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen20_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o19, o20, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen20_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o20, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
	}

	private static final void gen20_9(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20){
		gen20_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen20_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o10);
		gen20_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o12, o13, o14, o15, o16, o17, o18, o19, o20, o10, o11);
		gen20_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o13, o14, o15, o16, o17, o18, o19, o20, o10, o11, o12);
		gen20_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o14, o15, o16, o17, o18, o19, o20, o10, o11, o12, o13);
		gen20_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o15, o16, o17, o18, o19, o20, o10, o11, o12, o13, o14);
		gen20_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o16, o17, o18, o19, o20, o10, o11, o12, o13, o14, o15);
		gen20_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o17, o18, o19, o20, o10, o11, o12, o13, o14, o15, o16);
		gen20_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o18, o19, o20, o10, o11, o12, o13, o14, o15, o16, o17);
		gen20_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o19, o20, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen20_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o20, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
	}

	private static final void gen20_10(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20){
		gen20_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen20_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o12, o13, o14, o15, o16, o17, o18, o19, o20, o11);
		gen20_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o13, o14, o15, o16, o17, o18, o19, o20, o11, o12);
		gen20_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o14, o15, o16, o17, o18, o19, o20, o11, o12, o13);
		gen20_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o15, o16, o17, o18, o19, o20, o11, o12, o13, o14);
		gen20_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o16, o17, o18, o19, o20, o11, o12, o13, o14, o15);
		gen20_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o17, o18, o19, o20, o11, o12, o13, o14, o15, o16);
		gen20_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o18, o19, o20, o11, o12, o13, o14, o15, o16, o17);
		gen20_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o19, o20, o11, o12, o13, o14, o15, o16, o17, o18);
		gen20_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o20, o11, o12, o13, o14, o15, o16, o17, o18, o19);
	}

	private static final void gen20_11(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20){
		gen20_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen20_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o13, o14, o15, o16, o17, o18, o19, o20, o12);
		gen20_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o14, o15, o16, o17, o18, o19, o20, o12, o13);
		gen20_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o15, o16, o17, o18, o19, o20, o12, o13, o14);
		gen20_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o16, o17, o18, o19, o20, o12, o13, o14, o15);
		gen20_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o17, o18, o19, o20, o12, o13, o14, o15, o16);
		gen20_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o18, o19, o20, o12, o13, o14, o15, o16, o17);
		gen20_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o19, o20, o12, o13, o14, o15, o16, o17, o18);
		gen20_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o20, o12, o13, o14, o15, o16, o17, o18, o19);
	}

	private static final void gen20_12(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20){
		gen20_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen20_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o14, o15, o16, o17, o18, o19, o20, o13);
		gen20_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o15, o16, o17, o18, o19, o20, o13, o14);
		gen20_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o16, o17, o18, o19, o20, o13, o14, o15);
		gen20_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o17, o18, o19, o20, o13, o14, o15, o16);
		gen20_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o18, o19, o20, o13, o14, o15, o16, o17);
		gen20_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o19, o20, o13, o14, o15, o16, o17, o18);
		gen20_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o20, o13, o14, o15, o16, o17, o18, o19);
	}

	private static final void gen20_13(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20){
		gen20_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen20_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o15, o16, o17, o18, o19, o20, o14);
		gen20_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o16, o17, o18, o19, o20, o14, o15);
		gen20_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o17, o18, o19, o20, o14, o15, o16);
		gen20_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o18, o19, o20, o14, o15, o16, o17);
		gen20_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o19, o20, o14, o15, o16, o17, o18);
		gen20_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o20, o14, o15, o16, o17, o18, o19);
	}

	private static final void gen20_14(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20){
		gen20_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen20_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o16, o17, o18, o19, o20, o15);
		gen20_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o17, o18, o19, o20, o15, o16);
		gen20_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o18, o19, o20, o15, o16, o17);
		gen20_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o19, o20, o15, o16, o17, o18);
		gen20_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o20, o15, o16, o17, o18, o19);
	}

	private static final void gen20_15(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20){
		gen20_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen20_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o17, o18, o19, o20, o16);
		gen20_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o18, o19, o20, o16, o17);
		gen20_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o19, o20, o16, o17, o18);
		gen20_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o20, o16, o17, o18, o19);
	}

	private static final void gen20_16(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20){
		gen20_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen20_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o18, o19, o20, o17);
		gen20_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o19, o20, o17, o18);
		gen20_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o20, o17, o18, o19);
	}

	private static final void gen20_17(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20){
		gen20_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen20_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o19, o20, o18);
		gen20_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o20, o18, o19);
	}

	private static final void gen20_18(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20){
		pr.recieve20(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		pr.recieve20(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o20, o19);
	}

	private static final void gen21_0(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21){
		gen21_1(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen21_1(pr,o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o1);
		gen21_1(pr,o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o1, o2);
		gen21_1(pr,o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o1, o2, o3);
		gen21_1(pr,o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o1, o2, o3, o4);
		gen21_1(pr,o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o1, o2, o3, o4, o5);
		gen21_1(pr,o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o1, o2, o3, o4, o5, o6);
		gen21_1(pr,o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o1, o2, o3, o4, o5, o6, o7);
		gen21_1(pr,o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o1, o2, o3, o4, o5, o6, o7, o8);
		gen21_1(pr,o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o1, o2, o3, o4, o5, o6, o7, o8, o9);
		gen21_1(pr,o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen21_1(pr,o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen21_1(pr,o13, o14, o15, o16, o17, o18, o19, o20, o21, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen21_1(pr,o14, o15, o16, o17, o18, o19, o20, o21, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen21_1(pr,o15, o16, o17, o18, o19, o20, o21, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen21_1(pr,o16, o17, o18, o19, o20, o21, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen21_1(pr,o17, o18, o19, o20, o21, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen21_1(pr,o18, o19, o20, o21, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen21_1(pr,o19, o20, o21, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen21_1(pr,o20, o21, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen21_1(pr,o21, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
	}

	private static final void gen21_1(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21){
		gen21_2(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen21_2(pr,o1, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o2);
		gen21_2(pr,o1, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o2, o3);
		gen21_2(pr,o1, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o2, o3, o4);
		gen21_2(pr,o1, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o2, o3, o4, o5);
		gen21_2(pr,o1, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o2, o3, o4, o5, o6);
		gen21_2(pr,o1, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o2, o3, o4, o5, o6, o7);
		gen21_2(pr,o1, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o2, o3, o4, o5, o6, o7, o8);
		gen21_2(pr,o1, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o2, o3, o4, o5, o6, o7, o8, o9);
		gen21_2(pr,o1, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen21_2(pr,o1, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen21_2(pr,o1, o13, o14, o15, o16, o17, o18, o19, o20, o21, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen21_2(pr,o1, o14, o15, o16, o17, o18, o19, o20, o21, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen21_2(pr,o1, o15, o16, o17, o18, o19, o20, o21, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen21_2(pr,o1, o16, o17, o18, o19, o20, o21, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen21_2(pr,o1, o17, o18, o19, o20, o21, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen21_2(pr,o1, o18, o19, o20, o21, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen21_2(pr,o1, o19, o20, o21, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen21_2(pr,o1, o20, o21, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen21_2(pr,o1, o21, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
	}

	private static final void gen21_2(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21){
		gen21_3(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen21_3(pr,o1, o2, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o3);
		gen21_3(pr,o1, o2, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o3, o4);
		gen21_3(pr,o1, o2, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o3, o4, o5);
		gen21_3(pr,o1, o2, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o3, o4, o5, o6);
		gen21_3(pr,o1, o2, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o3, o4, o5, o6, o7);
		gen21_3(pr,o1, o2, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o3, o4, o5, o6, o7, o8);
		gen21_3(pr,o1, o2, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o3, o4, o5, o6, o7, o8, o9);
		gen21_3(pr,o1, o2, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o3, o4, o5, o6, o7, o8, o9, o10);
		gen21_3(pr,o1, o2, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen21_3(pr,o1, o2, o13, o14, o15, o16, o17, o18, o19, o20, o21, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen21_3(pr,o1, o2, o14, o15, o16, o17, o18, o19, o20, o21, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen21_3(pr,o1, o2, o15, o16, o17, o18, o19, o20, o21, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen21_3(pr,o1, o2, o16, o17, o18, o19, o20, o21, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen21_3(pr,o1, o2, o17, o18, o19, o20, o21, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen21_3(pr,o1, o2, o18, o19, o20, o21, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen21_3(pr,o1, o2, o19, o20, o21, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen21_3(pr,o1, o2, o20, o21, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen21_3(pr,o1, o2, o21, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
	}

	private static final void gen21_3(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21){
		gen21_4(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen21_4(pr,o1, o2, o3, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o4);
		gen21_4(pr,o1, o2, o3, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o4, o5);
		gen21_4(pr,o1, o2, o3, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o4, o5, o6);
		gen21_4(pr,o1, o2, o3, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o4, o5, o6, o7);
		gen21_4(pr,o1, o2, o3, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o4, o5, o6, o7, o8);
		gen21_4(pr,o1, o2, o3, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o4, o5, o6, o7, o8, o9);
		gen21_4(pr,o1, o2, o3, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o4, o5, o6, o7, o8, o9, o10);
		gen21_4(pr,o1, o2, o3, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o4, o5, o6, o7, o8, o9, o10, o11);
		gen21_4(pr,o1, o2, o3, o13, o14, o15, o16, o17, o18, o19, o20, o21, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen21_4(pr,o1, o2, o3, o14, o15, o16, o17, o18, o19, o20, o21, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen21_4(pr,o1, o2, o3, o15, o16, o17, o18, o19, o20, o21, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen21_4(pr,o1, o2, o3, o16, o17, o18, o19, o20, o21, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen21_4(pr,o1, o2, o3, o17, o18, o19, o20, o21, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen21_4(pr,o1, o2, o3, o18, o19, o20, o21, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen21_4(pr,o1, o2, o3, o19, o20, o21, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen21_4(pr,o1, o2, o3, o20, o21, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen21_4(pr,o1, o2, o3, o21, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
	}

	private static final void gen21_4(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21){
		gen21_5(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen21_5(pr,o1, o2, o3, o4, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o5);
		gen21_5(pr,o1, o2, o3, o4, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o5, o6);
		gen21_5(pr,o1, o2, o3, o4, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o5, o6, o7);
		gen21_5(pr,o1, o2, o3, o4, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o5, o6, o7, o8);
		gen21_5(pr,o1, o2, o3, o4, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o5, o6, o7, o8, o9);
		gen21_5(pr,o1, o2, o3, o4, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o5, o6, o7, o8, o9, o10);
		gen21_5(pr,o1, o2, o3, o4, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o5, o6, o7, o8, o9, o10, o11);
		gen21_5(pr,o1, o2, o3, o4, o13, o14, o15, o16, o17, o18, o19, o20, o21, o5, o6, o7, o8, o9, o10, o11, o12);
		gen21_5(pr,o1, o2, o3, o4, o14, o15, o16, o17, o18, o19, o20, o21, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen21_5(pr,o1, o2, o3, o4, o15, o16, o17, o18, o19, o20, o21, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen21_5(pr,o1, o2, o3, o4, o16, o17, o18, o19, o20, o21, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen21_5(pr,o1, o2, o3, o4, o17, o18, o19, o20, o21, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen21_5(pr,o1, o2, o3, o4, o18, o19, o20, o21, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen21_5(pr,o1, o2, o3, o4, o19, o20, o21, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen21_5(pr,o1, o2, o3, o4, o20, o21, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen21_5(pr,o1, o2, o3, o4, o21, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
	}

	private static final void gen21_5(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21){
		gen21_6(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen21_6(pr,o1, o2, o3, o4, o5, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o6);
		gen21_6(pr,o1, o2, o3, o4, o5, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o6, o7);
		gen21_6(pr,o1, o2, o3, o4, o5, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o6, o7, o8);
		gen21_6(pr,o1, o2, o3, o4, o5, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o6, o7, o8, o9);
		gen21_6(pr,o1, o2, o3, o4, o5, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o6, o7, o8, o9, o10);
		gen21_6(pr,o1, o2, o3, o4, o5, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o6, o7, o8, o9, o10, o11);
		gen21_6(pr,o1, o2, o3, o4, o5, o13, o14, o15, o16, o17, o18, o19, o20, o21, o6, o7, o8, o9, o10, o11, o12);
		gen21_6(pr,o1, o2, o3, o4, o5, o14, o15, o16, o17, o18, o19, o20, o21, o6, o7, o8, o9, o10, o11, o12, o13);
		gen21_6(pr,o1, o2, o3, o4, o5, o15, o16, o17, o18, o19, o20, o21, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen21_6(pr,o1, o2, o3, o4, o5, o16, o17, o18, o19, o20, o21, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen21_6(pr,o1, o2, o3, o4, o5, o17, o18, o19, o20, o21, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen21_6(pr,o1, o2, o3, o4, o5, o18, o19, o20, o21, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen21_6(pr,o1, o2, o3, o4, o5, o19, o20, o21, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen21_6(pr,o1, o2, o3, o4, o5, o20, o21, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen21_6(pr,o1, o2, o3, o4, o5, o21, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
	}

	private static final void gen21_6(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21){
		gen21_7(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen21_7(pr,o1, o2, o3, o4, o5, o6, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o7);
		gen21_7(pr,o1, o2, o3, o4, o5, o6, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o7, o8);
		gen21_7(pr,o1, o2, o3, o4, o5, o6, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o7, o8, o9);
		gen21_7(pr,o1, o2, o3, o4, o5, o6, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o7, o8, o9, o10);
		gen21_7(pr,o1, o2, o3, o4, o5, o6, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o7, o8, o9, o10, o11);
		gen21_7(pr,o1, o2, o3, o4, o5, o6, o13, o14, o15, o16, o17, o18, o19, o20, o21, o7, o8, o9, o10, o11, o12);
		gen21_7(pr,o1, o2, o3, o4, o5, o6, o14, o15, o16, o17, o18, o19, o20, o21, o7, o8, o9, o10, o11, o12, o13);
		gen21_7(pr,o1, o2, o3, o4, o5, o6, o15, o16, o17, o18, o19, o20, o21, o7, o8, o9, o10, o11, o12, o13, o14);
		gen21_7(pr,o1, o2, o3, o4, o5, o6, o16, o17, o18, o19, o20, o21, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen21_7(pr,o1, o2, o3, o4, o5, o6, o17, o18, o19, o20, o21, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen21_7(pr,o1, o2, o3, o4, o5, o6, o18, o19, o20, o21, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen21_7(pr,o1, o2, o3, o4, o5, o6, o19, o20, o21, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen21_7(pr,o1, o2, o3, o4, o5, o6, o20, o21, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen21_7(pr,o1, o2, o3, o4, o5, o6, o21, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
	}

	private static final void gen21_7(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21){
		gen21_8(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen21_8(pr,o1, o2, o3, o4, o5, o6, o7, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o8);
		gen21_8(pr,o1, o2, o3, o4, o5, o6, o7, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o8, o9);
		gen21_8(pr,o1, o2, o3, o4, o5, o6, o7, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o8, o9, o10);
		gen21_8(pr,o1, o2, o3, o4, o5, o6, o7, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o8, o9, o10, o11);
		gen21_8(pr,o1, o2, o3, o4, o5, o6, o7, o13, o14, o15, o16, o17, o18, o19, o20, o21, o8, o9, o10, o11, o12);
		gen21_8(pr,o1, o2, o3, o4, o5, o6, o7, o14, o15, o16, o17, o18, o19, o20, o21, o8, o9, o10, o11, o12, o13);
		gen21_8(pr,o1, o2, o3, o4, o5, o6, o7, o15, o16, o17, o18, o19, o20, o21, o8, o9, o10, o11, o12, o13, o14);
		gen21_8(pr,o1, o2, o3, o4, o5, o6, o7, o16, o17, o18, o19, o20, o21, o8, o9, o10, o11, o12, o13, o14, o15);
		gen21_8(pr,o1, o2, o3, o4, o5, o6, o7, o17, o18, o19, o20, o21, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen21_8(pr,o1, o2, o3, o4, o5, o6, o7, o18, o19, o20, o21, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen21_8(pr,o1, o2, o3, o4, o5, o6, o7, o19, o20, o21, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen21_8(pr,o1, o2, o3, o4, o5, o6, o7, o20, o21, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen21_8(pr,o1, o2, o3, o4, o5, o6, o7, o21, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
	}

	private static final void gen21_8(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21){
		gen21_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen21_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o9);
		gen21_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o9, o10);
		gen21_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o9, o10, o11);
		gen21_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o13, o14, o15, o16, o17, o18, o19, o20, o21, o9, o10, o11, o12);
		gen21_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o14, o15, o16, o17, o18, o19, o20, o21, o9, o10, o11, o12, o13);
		gen21_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o15, o16, o17, o18, o19, o20, o21, o9, o10, o11, o12, o13, o14);
		gen21_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o16, o17, o18, o19, o20, o21, o9, o10, o11, o12, o13, o14, o15);
		gen21_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o17, o18, o19, o20, o21, o9, o10, o11, o12, o13, o14, o15, o16);
		gen21_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o18, o19, o20, o21, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen21_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o19, o20, o21, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen21_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o20, o21, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen21_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o21, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
	}

	private static final void gen21_9(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21){
		gen21_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen21_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o10);
		gen21_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o10, o11);
		gen21_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o13, o14, o15, o16, o17, o18, o19, o20, o21, o10, o11, o12);
		gen21_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o14, o15, o16, o17, o18, o19, o20, o21, o10, o11, o12, o13);
		gen21_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o15, o16, o17, o18, o19, o20, o21, o10, o11, o12, o13, o14);
		gen21_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o16, o17, o18, o19, o20, o21, o10, o11, o12, o13, o14, o15);
		gen21_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o17, o18, o19, o20, o21, o10, o11, o12, o13, o14, o15, o16);
		gen21_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o18, o19, o20, o21, o10, o11, o12, o13, o14, o15, o16, o17);
		gen21_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o19, o20, o21, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen21_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o20, o21, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen21_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o21, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
	}

	private static final void gen21_10(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21){
		gen21_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen21_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o11);
		gen21_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o13, o14, o15, o16, o17, o18, o19, o20, o21, o11, o12);
		gen21_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o14, o15, o16, o17, o18, o19, o20, o21, o11, o12, o13);
		gen21_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o15, o16, o17, o18, o19, o20, o21, o11, o12, o13, o14);
		gen21_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o16, o17, o18, o19, o20, o21, o11, o12, o13, o14, o15);
		gen21_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o17, o18, o19, o20, o21, o11, o12, o13, o14, o15, o16);
		gen21_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o18, o19, o20, o21, o11, o12, o13, o14, o15, o16, o17);
		gen21_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o19, o20, o21, o11, o12, o13, o14, o15, o16, o17, o18);
		gen21_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o20, o21, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen21_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o21, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
	}

	private static final void gen21_11(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21){
		gen21_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen21_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o13, o14, o15, o16, o17, o18, o19, o20, o21, o12);
		gen21_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o14, o15, o16, o17, o18, o19, o20, o21, o12, o13);
		gen21_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o15, o16, o17, o18, o19, o20, o21, o12, o13, o14);
		gen21_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o16, o17, o18, o19, o20, o21, o12, o13, o14, o15);
		gen21_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o17, o18, o19, o20, o21, o12, o13, o14, o15, o16);
		gen21_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o18, o19, o20, o21, o12, o13, o14, o15, o16, o17);
		gen21_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o19, o20, o21, o12, o13, o14, o15, o16, o17, o18);
		gen21_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o20, o21, o12, o13, o14, o15, o16, o17, o18, o19);
		gen21_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o21, o12, o13, o14, o15, o16, o17, o18, o19, o20);
	}

	private static final void gen21_12(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21){
		gen21_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen21_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o14, o15, o16, o17, o18, o19, o20, o21, o13);
		gen21_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o15, o16, o17, o18, o19, o20, o21, o13, o14);
		gen21_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o16, o17, o18, o19, o20, o21, o13, o14, o15);
		gen21_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o17, o18, o19, o20, o21, o13, o14, o15, o16);
		gen21_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o18, o19, o20, o21, o13, o14, o15, o16, o17);
		gen21_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o19, o20, o21, o13, o14, o15, o16, o17, o18);
		gen21_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o20, o21, o13, o14, o15, o16, o17, o18, o19);
		gen21_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o21, o13, o14, o15, o16, o17, o18, o19, o20);
	}

	private static final void gen21_13(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21){
		gen21_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen21_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o15, o16, o17, o18, o19, o20, o21, o14);
		gen21_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o16, o17, o18, o19, o20, o21, o14, o15);
		gen21_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o17, o18, o19, o20, o21, o14, o15, o16);
		gen21_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o18, o19, o20, o21, o14, o15, o16, o17);
		gen21_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o19, o20, o21, o14, o15, o16, o17, o18);
		gen21_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o20, o21, o14, o15, o16, o17, o18, o19);
		gen21_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o21, o14, o15, o16, o17, o18, o19, o20);
	}

	private static final void gen21_14(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21){
		gen21_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen21_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o16, o17, o18, o19, o20, o21, o15);
		gen21_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o17, o18, o19, o20, o21, o15, o16);
		gen21_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o18, o19, o20, o21, o15, o16, o17);
		gen21_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o19, o20, o21, o15, o16, o17, o18);
		gen21_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o20, o21, o15, o16, o17, o18, o19);
		gen21_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o21, o15, o16, o17, o18, o19, o20);
	}

	private static final void gen21_15(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21){
		gen21_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen21_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o17, o18, o19, o20, o21, o16);
		gen21_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o18, o19, o20, o21, o16, o17);
		gen21_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o19, o20, o21, o16, o17, o18);
		gen21_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o20, o21, o16, o17, o18, o19);
		gen21_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o21, o16, o17, o18, o19, o20);
	}

	private static final void gen21_16(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21){
		gen21_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen21_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o18, o19, o20, o21, o17);
		gen21_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o19, o20, o21, o17, o18);
		gen21_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o20, o21, o17, o18, o19);
		gen21_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o21, o17, o18, o19, o20);
	}

	private static final void gen21_17(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21){
		gen21_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen21_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o19, o20, o21, o18);
		gen21_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o20, o21, o18, o19);
		gen21_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o21, o18, o19, o20);
	}

	private static final void gen21_18(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21){
		gen21_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen21_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o20, o21, o19);
		gen21_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o21, o19, o20);
	}

	private static final void gen21_19(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21){
		pr.recieve21(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		pr.recieve21(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o21, o20);
	}

	private static final void gen22_0(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22){
		gen22_1(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen22_1(pr,o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o1);
		gen22_1(pr,o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o1, o2);
		gen22_1(pr,o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o1, o2, o3);
		gen22_1(pr,o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o1, o2, o3, o4);
		gen22_1(pr,o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o1, o2, o3, o4, o5);
		gen22_1(pr,o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o1, o2, o3, o4, o5, o6);
		gen22_1(pr,o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o1, o2, o3, o4, o5, o6, o7);
		gen22_1(pr,o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o1, o2, o3, o4, o5, o6, o7, o8);
		gen22_1(pr,o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o1, o2, o3, o4, o5, o6, o7, o8, o9);
		gen22_1(pr,o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen22_1(pr,o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen22_1(pr,o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen22_1(pr,o14, o15, o16, o17, o18, o19, o20, o21, o22, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen22_1(pr,o15, o16, o17, o18, o19, o20, o21, o22, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen22_1(pr,o16, o17, o18, o19, o20, o21, o22, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen22_1(pr,o17, o18, o19, o20, o21, o22, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen22_1(pr,o18, o19, o20, o21, o22, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen22_1(pr,o19, o20, o21, o22, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen22_1(pr,o20, o21, o22, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen22_1(pr,o21, o22, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen22_1(pr,o22, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
	}

	private static final void gen22_1(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22){
		gen22_2(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen22_2(pr,o1, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o2);
		gen22_2(pr,o1, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o2, o3);
		gen22_2(pr,o1, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o2, o3, o4);
		gen22_2(pr,o1, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o2, o3, o4, o5);
		gen22_2(pr,o1, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o2, o3, o4, o5, o6);
		gen22_2(pr,o1, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o2, o3, o4, o5, o6, o7);
		gen22_2(pr,o1, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o2, o3, o4, o5, o6, o7, o8);
		gen22_2(pr,o1, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o2, o3, o4, o5, o6, o7, o8, o9);
		gen22_2(pr,o1, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen22_2(pr,o1, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen22_2(pr,o1, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen22_2(pr,o1, o14, o15, o16, o17, o18, o19, o20, o21, o22, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen22_2(pr,o1, o15, o16, o17, o18, o19, o20, o21, o22, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen22_2(pr,o1, o16, o17, o18, o19, o20, o21, o22, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen22_2(pr,o1, o17, o18, o19, o20, o21, o22, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen22_2(pr,o1, o18, o19, o20, o21, o22, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen22_2(pr,o1, o19, o20, o21, o22, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen22_2(pr,o1, o20, o21, o22, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen22_2(pr,o1, o21, o22, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen22_2(pr,o1, o22, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
	}

	private static final void gen22_2(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22){
		gen22_3(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen22_3(pr,o1, o2, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o3);
		gen22_3(pr,o1, o2, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o3, o4);
		gen22_3(pr,o1, o2, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o3, o4, o5);
		gen22_3(pr,o1, o2, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o3, o4, o5, o6);
		gen22_3(pr,o1, o2, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o3, o4, o5, o6, o7);
		gen22_3(pr,o1, o2, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o3, o4, o5, o6, o7, o8);
		gen22_3(pr,o1, o2, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o3, o4, o5, o6, o7, o8, o9);
		gen22_3(pr,o1, o2, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o3, o4, o5, o6, o7, o8, o9, o10);
		gen22_3(pr,o1, o2, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen22_3(pr,o1, o2, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen22_3(pr,o1, o2, o14, o15, o16, o17, o18, o19, o20, o21, o22, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen22_3(pr,o1, o2, o15, o16, o17, o18, o19, o20, o21, o22, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen22_3(pr,o1, o2, o16, o17, o18, o19, o20, o21, o22, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen22_3(pr,o1, o2, o17, o18, o19, o20, o21, o22, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen22_3(pr,o1, o2, o18, o19, o20, o21, o22, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen22_3(pr,o1, o2, o19, o20, o21, o22, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen22_3(pr,o1, o2, o20, o21, o22, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen22_3(pr,o1, o2, o21, o22, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen22_3(pr,o1, o2, o22, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
	}

	private static final void gen22_3(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22){
		gen22_4(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen22_4(pr,o1, o2, o3, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o4);
		gen22_4(pr,o1, o2, o3, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o4, o5);
		gen22_4(pr,o1, o2, o3, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o4, o5, o6);
		gen22_4(pr,o1, o2, o3, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o4, o5, o6, o7);
		gen22_4(pr,o1, o2, o3, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o4, o5, o6, o7, o8);
		gen22_4(pr,o1, o2, o3, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o4, o5, o6, o7, o8, o9);
		gen22_4(pr,o1, o2, o3, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o4, o5, o6, o7, o8, o9, o10);
		gen22_4(pr,o1, o2, o3, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o4, o5, o6, o7, o8, o9, o10, o11);
		gen22_4(pr,o1, o2, o3, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen22_4(pr,o1, o2, o3, o14, o15, o16, o17, o18, o19, o20, o21, o22, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen22_4(pr,o1, o2, o3, o15, o16, o17, o18, o19, o20, o21, o22, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen22_4(pr,o1, o2, o3, o16, o17, o18, o19, o20, o21, o22, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen22_4(pr,o1, o2, o3, o17, o18, o19, o20, o21, o22, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen22_4(pr,o1, o2, o3, o18, o19, o20, o21, o22, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen22_4(pr,o1, o2, o3, o19, o20, o21, o22, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen22_4(pr,o1, o2, o3, o20, o21, o22, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen22_4(pr,o1, o2, o3, o21, o22, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen22_4(pr,o1, o2, o3, o22, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
	}

	private static final void gen22_4(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22){
		gen22_5(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen22_5(pr,o1, o2, o3, o4, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o5);
		gen22_5(pr,o1, o2, o3, o4, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o5, o6);
		gen22_5(pr,o1, o2, o3, o4, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o5, o6, o7);
		gen22_5(pr,o1, o2, o3, o4, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o5, o6, o7, o8);
		gen22_5(pr,o1, o2, o3, o4, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o5, o6, o7, o8, o9);
		gen22_5(pr,o1, o2, o3, o4, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o5, o6, o7, o8, o9, o10);
		gen22_5(pr,o1, o2, o3, o4, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o5, o6, o7, o8, o9, o10, o11);
		gen22_5(pr,o1, o2, o3, o4, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o5, o6, o7, o8, o9, o10, o11, o12);
		gen22_5(pr,o1, o2, o3, o4, o14, o15, o16, o17, o18, o19, o20, o21, o22, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen22_5(pr,o1, o2, o3, o4, o15, o16, o17, o18, o19, o20, o21, o22, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen22_5(pr,o1, o2, o3, o4, o16, o17, o18, o19, o20, o21, o22, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen22_5(pr,o1, o2, o3, o4, o17, o18, o19, o20, o21, o22, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen22_5(pr,o1, o2, o3, o4, o18, o19, o20, o21, o22, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen22_5(pr,o1, o2, o3, o4, o19, o20, o21, o22, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen22_5(pr,o1, o2, o3, o4, o20, o21, o22, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen22_5(pr,o1, o2, o3, o4, o21, o22, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen22_5(pr,o1, o2, o3, o4, o22, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
	}

	private static final void gen22_5(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22){
		gen22_6(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen22_6(pr,o1, o2, o3, o4, o5, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o6);
		gen22_6(pr,o1, o2, o3, o4, o5, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o6, o7);
		gen22_6(pr,o1, o2, o3, o4, o5, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o6, o7, o8);
		gen22_6(pr,o1, o2, o3, o4, o5, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o6, o7, o8, o9);
		gen22_6(pr,o1, o2, o3, o4, o5, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o6, o7, o8, o9, o10);
		gen22_6(pr,o1, o2, o3, o4, o5, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o6, o7, o8, o9, o10, o11);
		gen22_6(pr,o1, o2, o3, o4, o5, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o6, o7, o8, o9, o10, o11, o12);
		gen22_6(pr,o1, o2, o3, o4, o5, o14, o15, o16, o17, o18, o19, o20, o21, o22, o6, o7, o8, o9, o10, o11, o12, o13);
		gen22_6(pr,o1, o2, o3, o4, o5, o15, o16, o17, o18, o19, o20, o21, o22, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen22_6(pr,o1, o2, o3, o4, o5, o16, o17, o18, o19, o20, o21, o22, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen22_6(pr,o1, o2, o3, o4, o5, o17, o18, o19, o20, o21, o22, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen22_6(pr,o1, o2, o3, o4, o5, o18, o19, o20, o21, o22, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen22_6(pr,o1, o2, o3, o4, o5, o19, o20, o21, o22, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen22_6(pr,o1, o2, o3, o4, o5, o20, o21, o22, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen22_6(pr,o1, o2, o3, o4, o5, o21, o22, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen22_6(pr,o1, o2, o3, o4, o5, o22, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
	}

	private static final void gen22_6(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22){
		gen22_7(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen22_7(pr,o1, o2, o3, o4, o5, o6, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o7);
		gen22_7(pr,o1, o2, o3, o4, o5, o6, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o7, o8);
		gen22_7(pr,o1, o2, o3, o4, o5, o6, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o7, o8, o9);
		gen22_7(pr,o1, o2, o3, o4, o5, o6, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o7, o8, o9, o10);
		gen22_7(pr,o1, o2, o3, o4, o5, o6, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o7, o8, o9, o10, o11);
		gen22_7(pr,o1, o2, o3, o4, o5, o6, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o7, o8, o9, o10, o11, o12);
		gen22_7(pr,o1, o2, o3, o4, o5, o6, o14, o15, o16, o17, o18, o19, o20, o21, o22, o7, o8, o9, o10, o11, o12, o13);
		gen22_7(pr,o1, o2, o3, o4, o5, o6, o15, o16, o17, o18, o19, o20, o21, o22, o7, o8, o9, o10, o11, o12, o13, o14);
		gen22_7(pr,o1, o2, o3, o4, o5, o6, o16, o17, o18, o19, o20, o21, o22, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen22_7(pr,o1, o2, o3, o4, o5, o6, o17, o18, o19, o20, o21, o22, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen22_7(pr,o1, o2, o3, o4, o5, o6, o18, o19, o20, o21, o22, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen22_7(pr,o1, o2, o3, o4, o5, o6, o19, o20, o21, o22, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen22_7(pr,o1, o2, o3, o4, o5, o6, o20, o21, o22, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen22_7(pr,o1, o2, o3, o4, o5, o6, o21, o22, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen22_7(pr,o1, o2, o3, o4, o5, o6, o22, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
	}

	private static final void gen22_7(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22){
		gen22_8(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen22_8(pr,o1, o2, o3, o4, o5, o6, o7, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o8);
		gen22_8(pr,o1, o2, o3, o4, o5, o6, o7, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o8, o9);
		gen22_8(pr,o1, o2, o3, o4, o5, o6, o7, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o8, o9, o10);
		gen22_8(pr,o1, o2, o3, o4, o5, o6, o7, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o8, o9, o10, o11);
		gen22_8(pr,o1, o2, o3, o4, o5, o6, o7, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o8, o9, o10, o11, o12);
		gen22_8(pr,o1, o2, o3, o4, o5, o6, o7, o14, o15, o16, o17, o18, o19, o20, o21, o22, o8, o9, o10, o11, o12, o13);
		gen22_8(pr,o1, o2, o3, o4, o5, o6, o7, o15, o16, o17, o18, o19, o20, o21, o22, o8, o9, o10, o11, o12, o13, o14);
		gen22_8(pr,o1, o2, o3, o4, o5, o6, o7, o16, o17, o18, o19, o20, o21, o22, o8, o9, o10, o11, o12, o13, o14, o15);
		gen22_8(pr,o1, o2, o3, o4, o5, o6, o7, o17, o18, o19, o20, o21, o22, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen22_8(pr,o1, o2, o3, o4, o5, o6, o7, o18, o19, o20, o21, o22, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen22_8(pr,o1, o2, o3, o4, o5, o6, o7, o19, o20, o21, o22, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen22_8(pr,o1, o2, o3, o4, o5, o6, o7, o20, o21, o22, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen22_8(pr,o1, o2, o3, o4, o5, o6, o7, o21, o22, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen22_8(pr,o1, o2, o3, o4, o5, o6, o7, o22, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
	}

	private static final void gen22_8(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22){
		gen22_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen22_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o9);
		gen22_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o9, o10);
		gen22_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o9, o10, o11);
		gen22_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o9, o10, o11, o12);
		gen22_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o14, o15, o16, o17, o18, o19, o20, o21, o22, o9, o10, o11, o12, o13);
		gen22_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o15, o16, o17, o18, o19, o20, o21, o22, o9, o10, o11, o12, o13, o14);
		gen22_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o16, o17, o18, o19, o20, o21, o22, o9, o10, o11, o12, o13, o14, o15);
		gen22_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o17, o18, o19, o20, o21, o22, o9, o10, o11, o12, o13, o14, o15, o16);
		gen22_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o18, o19, o20, o21, o22, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen22_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o19, o20, o21, o22, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen22_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o20, o21, o22, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen22_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o21, o22, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen22_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o22, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
	}

	private static final void gen22_9(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22){
		gen22_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen22_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o10);
		gen22_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o10, o11);
		gen22_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o10, o11, o12);
		gen22_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o14, o15, o16, o17, o18, o19, o20, o21, o22, o10, o11, o12, o13);
		gen22_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o15, o16, o17, o18, o19, o20, o21, o22, o10, o11, o12, o13, o14);
		gen22_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o16, o17, o18, o19, o20, o21, o22, o10, o11, o12, o13, o14, o15);
		gen22_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o17, o18, o19, o20, o21, o22, o10, o11, o12, o13, o14, o15, o16);
		gen22_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o18, o19, o20, o21, o22, o10, o11, o12, o13, o14, o15, o16, o17);
		gen22_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o19, o20, o21, o22, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen22_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o20, o21, o22, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen22_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o21, o22, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen22_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o22, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
	}

	private static final void gen22_10(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22){
		gen22_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen22_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o11);
		gen22_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o11, o12);
		gen22_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o14, o15, o16, o17, o18, o19, o20, o21, o22, o11, o12, o13);
		gen22_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o15, o16, o17, o18, o19, o20, o21, o22, o11, o12, o13, o14);
		gen22_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o16, o17, o18, o19, o20, o21, o22, o11, o12, o13, o14, o15);
		gen22_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o17, o18, o19, o20, o21, o22, o11, o12, o13, o14, o15, o16);
		gen22_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o18, o19, o20, o21, o22, o11, o12, o13, o14, o15, o16, o17);
		gen22_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o19, o20, o21, o22, o11, o12, o13, o14, o15, o16, o17, o18);
		gen22_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o20, o21, o22, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen22_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o21, o22, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen22_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o22, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
	}

	private static final void gen22_11(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22){
		gen22_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen22_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o12);
		gen22_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o14, o15, o16, o17, o18, o19, o20, o21, o22, o12, o13);
		gen22_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o15, o16, o17, o18, o19, o20, o21, o22, o12, o13, o14);
		gen22_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o16, o17, o18, o19, o20, o21, o22, o12, o13, o14, o15);
		gen22_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o17, o18, o19, o20, o21, o22, o12, o13, o14, o15, o16);
		gen22_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o18, o19, o20, o21, o22, o12, o13, o14, o15, o16, o17);
		gen22_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o19, o20, o21, o22, o12, o13, o14, o15, o16, o17, o18);
		gen22_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o20, o21, o22, o12, o13, o14, o15, o16, o17, o18, o19);
		gen22_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o21, o22, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen22_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o22, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
	}

	private static final void gen22_12(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22){
		gen22_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen22_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o14, o15, o16, o17, o18, o19, o20, o21, o22, o13);
		gen22_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o15, o16, o17, o18, o19, o20, o21, o22, o13, o14);
		gen22_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o16, o17, o18, o19, o20, o21, o22, o13, o14, o15);
		gen22_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o17, o18, o19, o20, o21, o22, o13, o14, o15, o16);
		gen22_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o18, o19, o20, o21, o22, o13, o14, o15, o16, o17);
		gen22_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o19, o20, o21, o22, o13, o14, o15, o16, o17, o18);
		gen22_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o20, o21, o22, o13, o14, o15, o16, o17, o18, o19);
		gen22_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o21, o22, o13, o14, o15, o16, o17, o18, o19, o20);
		gen22_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o22, o13, o14, o15, o16, o17, o18, o19, o20, o21);
	}

	private static final void gen22_13(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22){
		gen22_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen22_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o15, o16, o17, o18, o19, o20, o21, o22, o14);
		gen22_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o16, o17, o18, o19, o20, o21, o22, o14, o15);
		gen22_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o17, o18, o19, o20, o21, o22, o14, o15, o16);
		gen22_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o18, o19, o20, o21, o22, o14, o15, o16, o17);
		gen22_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o19, o20, o21, o22, o14, o15, o16, o17, o18);
		gen22_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o20, o21, o22, o14, o15, o16, o17, o18, o19);
		gen22_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o21, o22, o14, o15, o16, o17, o18, o19, o20);
		gen22_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o22, o14, o15, o16, o17, o18, o19, o20, o21);
	}

	private static final void gen22_14(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22){
		gen22_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen22_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o16, o17, o18, o19, o20, o21, o22, o15);
		gen22_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o17, o18, o19, o20, o21, o22, o15, o16);
		gen22_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o18, o19, o20, o21, o22, o15, o16, o17);
		gen22_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o19, o20, o21, o22, o15, o16, o17, o18);
		gen22_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o20, o21, o22, o15, o16, o17, o18, o19);
		gen22_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o21, o22, o15, o16, o17, o18, o19, o20);
		gen22_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o22, o15, o16, o17, o18, o19, o20, o21);
	}

	private static final void gen22_15(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22){
		gen22_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen22_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o17, o18, o19, o20, o21, o22, o16);
		gen22_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o18, o19, o20, o21, o22, o16, o17);
		gen22_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o19, o20, o21, o22, o16, o17, o18);
		gen22_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o20, o21, o22, o16, o17, o18, o19);
		gen22_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o21, o22, o16, o17, o18, o19, o20);
		gen22_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o22, o16, o17, o18, o19, o20, o21);
	}

	private static final void gen22_16(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22){
		gen22_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen22_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o18, o19, o20, o21, o22, o17);
		gen22_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o19, o20, o21, o22, o17, o18);
		gen22_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o20, o21, o22, o17, o18, o19);
		gen22_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o21, o22, o17, o18, o19, o20);
		gen22_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o22, o17, o18, o19, o20, o21);
	}

	private static final void gen22_17(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22){
		gen22_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen22_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o19, o20, o21, o22, o18);
		gen22_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o20, o21, o22, o18, o19);
		gen22_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o21, o22, o18, o19, o20);
		gen22_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o22, o18, o19, o20, o21);
	}

	private static final void gen22_18(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22){
		gen22_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen22_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o20, o21, o22, o19);
		gen22_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o21, o22, o19, o20);
		gen22_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o22, o19, o20, o21);
	}

	private static final void gen22_19(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22){
		gen22_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen22_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o21, o22, o20);
		gen22_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o22, o20, o21);
	}

	private static final void gen22_20(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22){
		pr.recieve22(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		pr.recieve22(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o22, o21);
	}

	private static final void gen23_0(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23){
		gen23_1(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen23_1(pr,o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o1);
		gen23_1(pr,o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o1, o2);
		gen23_1(pr,o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o1, o2, o3);
		gen23_1(pr,o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o1, o2, o3, o4);
		gen23_1(pr,o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o1, o2, o3, o4, o5);
		gen23_1(pr,o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o1, o2, o3, o4, o5, o6);
		gen23_1(pr,o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o1, o2, o3, o4, o5, o6, o7);
		gen23_1(pr,o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o1, o2, o3, o4, o5, o6, o7, o8);
		gen23_1(pr,o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o1, o2, o3, o4, o5, o6, o7, o8, o9);
		gen23_1(pr,o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen23_1(pr,o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen23_1(pr,o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen23_1(pr,o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen23_1(pr,o15, o16, o17, o18, o19, o20, o21, o22, o23, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen23_1(pr,o16, o17, o18, o19, o20, o21, o22, o23, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen23_1(pr,o17, o18, o19, o20, o21, o22, o23, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen23_1(pr,o18, o19, o20, o21, o22, o23, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen23_1(pr,o19, o20, o21, o22, o23, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen23_1(pr,o20, o21, o22, o23, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen23_1(pr,o21, o22, o23, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen23_1(pr,o22, o23, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen23_1(pr,o23, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
	}

	private static final void gen23_1(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23){
		gen23_2(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen23_2(pr,o1, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o2);
		gen23_2(pr,o1, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o2, o3);
		gen23_2(pr,o1, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o2, o3, o4);
		gen23_2(pr,o1, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o2, o3, o4, o5);
		gen23_2(pr,o1, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o2, o3, o4, o5, o6);
		gen23_2(pr,o1, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o2, o3, o4, o5, o6, o7);
		gen23_2(pr,o1, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o2, o3, o4, o5, o6, o7, o8);
		gen23_2(pr,o1, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o2, o3, o4, o5, o6, o7, o8, o9);
		gen23_2(pr,o1, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen23_2(pr,o1, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen23_2(pr,o1, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen23_2(pr,o1, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen23_2(pr,o1, o15, o16, o17, o18, o19, o20, o21, o22, o23, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen23_2(pr,o1, o16, o17, o18, o19, o20, o21, o22, o23, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen23_2(pr,o1, o17, o18, o19, o20, o21, o22, o23, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen23_2(pr,o1, o18, o19, o20, o21, o22, o23, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen23_2(pr,o1, o19, o20, o21, o22, o23, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen23_2(pr,o1, o20, o21, o22, o23, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen23_2(pr,o1, o21, o22, o23, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen23_2(pr,o1, o22, o23, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen23_2(pr,o1, o23, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
	}

	private static final void gen23_2(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23){
		gen23_3(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen23_3(pr,o1, o2, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o3);
		gen23_3(pr,o1, o2, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o3, o4);
		gen23_3(pr,o1, o2, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o3, o4, o5);
		gen23_3(pr,o1, o2, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o3, o4, o5, o6);
		gen23_3(pr,o1, o2, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o3, o4, o5, o6, o7);
		gen23_3(pr,o1, o2, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o3, o4, o5, o6, o7, o8);
		gen23_3(pr,o1, o2, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o3, o4, o5, o6, o7, o8, o9);
		gen23_3(pr,o1, o2, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o3, o4, o5, o6, o7, o8, o9, o10);
		gen23_3(pr,o1, o2, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen23_3(pr,o1, o2, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen23_3(pr,o1, o2, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen23_3(pr,o1, o2, o15, o16, o17, o18, o19, o20, o21, o22, o23, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen23_3(pr,o1, o2, o16, o17, o18, o19, o20, o21, o22, o23, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen23_3(pr,o1, o2, o17, o18, o19, o20, o21, o22, o23, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen23_3(pr,o1, o2, o18, o19, o20, o21, o22, o23, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen23_3(pr,o1, o2, o19, o20, o21, o22, o23, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen23_3(pr,o1, o2, o20, o21, o22, o23, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen23_3(pr,o1, o2, o21, o22, o23, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen23_3(pr,o1, o2, o22, o23, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen23_3(pr,o1, o2, o23, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
	}

	private static final void gen23_3(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23){
		gen23_4(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen23_4(pr,o1, o2, o3, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o4);
		gen23_4(pr,o1, o2, o3, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o4, o5);
		gen23_4(pr,o1, o2, o3, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o4, o5, o6);
		gen23_4(pr,o1, o2, o3, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o4, o5, o6, o7);
		gen23_4(pr,o1, o2, o3, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o4, o5, o6, o7, o8);
		gen23_4(pr,o1, o2, o3, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o4, o5, o6, o7, o8, o9);
		gen23_4(pr,o1, o2, o3, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o4, o5, o6, o7, o8, o9, o10);
		gen23_4(pr,o1, o2, o3, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o4, o5, o6, o7, o8, o9, o10, o11);
		gen23_4(pr,o1, o2, o3, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen23_4(pr,o1, o2, o3, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen23_4(pr,o1, o2, o3, o15, o16, o17, o18, o19, o20, o21, o22, o23, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen23_4(pr,o1, o2, o3, o16, o17, o18, o19, o20, o21, o22, o23, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen23_4(pr,o1, o2, o3, o17, o18, o19, o20, o21, o22, o23, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen23_4(pr,o1, o2, o3, o18, o19, o20, o21, o22, o23, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen23_4(pr,o1, o2, o3, o19, o20, o21, o22, o23, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen23_4(pr,o1, o2, o3, o20, o21, o22, o23, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen23_4(pr,o1, o2, o3, o21, o22, o23, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen23_4(pr,o1, o2, o3, o22, o23, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen23_4(pr,o1, o2, o3, o23, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
	}

	private static final void gen23_4(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23){
		gen23_5(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen23_5(pr,o1, o2, o3, o4, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o5);
		gen23_5(pr,o1, o2, o3, o4, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o5, o6);
		gen23_5(pr,o1, o2, o3, o4, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o5, o6, o7);
		gen23_5(pr,o1, o2, o3, o4, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o5, o6, o7, o8);
		gen23_5(pr,o1, o2, o3, o4, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o5, o6, o7, o8, o9);
		gen23_5(pr,o1, o2, o3, o4, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o5, o6, o7, o8, o9, o10);
		gen23_5(pr,o1, o2, o3, o4, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o5, o6, o7, o8, o9, o10, o11);
		gen23_5(pr,o1, o2, o3, o4, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o5, o6, o7, o8, o9, o10, o11, o12);
		gen23_5(pr,o1, o2, o3, o4, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen23_5(pr,o1, o2, o3, o4, o15, o16, o17, o18, o19, o20, o21, o22, o23, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen23_5(pr,o1, o2, o3, o4, o16, o17, o18, o19, o20, o21, o22, o23, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen23_5(pr,o1, o2, o3, o4, o17, o18, o19, o20, o21, o22, o23, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen23_5(pr,o1, o2, o3, o4, o18, o19, o20, o21, o22, o23, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen23_5(pr,o1, o2, o3, o4, o19, o20, o21, o22, o23, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen23_5(pr,o1, o2, o3, o4, o20, o21, o22, o23, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen23_5(pr,o1, o2, o3, o4, o21, o22, o23, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen23_5(pr,o1, o2, o3, o4, o22, o23, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen23_5(pr,o1, o2, o3, o4, o23, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
	}

	private static final void gen23_5(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23){
		gen23_6(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen23_6(pr,o1, o2, o3, o4, o5, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o6);
		gen23_6(pr,o1, o2, o3, o4, o5, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o6, o7);
		gen23_6(pr,o1, o2, o3, o4, o5, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o6, o7, o8);
		gen23_6(pr,o1, o2, o3, o4, o5, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o6, o7, o8, o9);
		gen23_6(pr,o1, o2, o3, o4, o5, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o6, o7, o8, o9, o10);
		gen23_6(pr,o1, o2, o3, o4, o5, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o6, o7, o8, o9, o10, o11);
		gen23_6(pr,o1, o2, o3, o4, o5, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o6, o7, o8, o9, o10, o11, o12);
		gen23_6(pr,o1, o2, o3, o4, o5, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o6, o7, o8, o9, o10, o11, o12, o13);
		gen23_6(pr,o1, o2, o3, o4, o5, o15, o16, o17, o18, o19, o20, o21, o22, o23, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen23_6(pr,o1, o2, o3, o4, o5, o16, o17, o18, o19, o20, o21, o22, o23, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen23_6(pr,o1, o2, o3, o4, o5, o17, o18, o19, o20, o21, o22, o23, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen23_6(pr,o1, o2, o3, o4, o5, o18, o19, o20, o21, o22, o23, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen23_6(pr,o1, o2, o3, o4, o5, o19, o20, o21, o22, o23, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen23_6(pr,o1, o2, o3, o4, o5, o20, o21, o22, o23, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen23_6(pr,o1, o2, o3, o4, o5, o21, o22, o23, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen23_6(pr,o1, o2, o3, o4, o5, o22, o23, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen23_6(pr,o1, o2, o3, o4, o5, o23, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
	}

	private static final void gen23_6(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23){
		gen23_7(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen23_7(pr,o1, o2, o3, o4, o5, o6, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o7);
		gen23_7(pr,o1, o2, o3, o4, o5, o6, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o7, o8);
		gen23_7(pr,o1, o2, o3, o4, o5, o6, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o7, o8, o9);
		gen23_7(pr,o1, o2, o3, o4, o5, o6, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o7, o8, o9, o10);
		gen23_7(pr,o1, o2, o3, o4, o5, o6, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o7, o8, o9, o10, o11);
		gen23_7(pr,o1, o2, o3, o4, o5, o6, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o7, o8, o9, o10, o11, o12);
		gen23_7(pr,o1, o2, o3, o4, o5, o6, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o7, o8, o9, o10, o11, o12, o13);
		gen23_7(pr,o1, o2, o3, o4, o5, o6, o15, o16, o17, o18, o19, o20, o21, o22, o23, o7, o8, o9, o10, o11, o12, o13, o14);
		gen23_7(pr,o1, o2, o3, o4, o5, o6, o16, o17, o18, o19, o20, o21, o22, o23, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen23_7(pr,o1, o2, o3, o4, o5, o6, o17, o18, o19, o20, o21, o22, o23, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen23_7(pr,o1, o2, o3, o4, o5, o6, o18, o19, o20, o21, o22, o23, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen23_7(pr,o1, o2, o3, o4, o5, o6, o19, o20, o21, o22, o23, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen23_7(pr,o1, o2, o3, o4, o5, o6, o20, o21, o22, o23, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen23_7(pr,o1, o2, o3, o4, o5, o6, o21, o22, o23, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen23_7(pr,o1, o2, o3, o4, o5, o6, o22, o23, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen23_7(pr,o1, o2, o3, o4, o5, o6, o23, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
	}

	private static final void gen23_7(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23){
		gen23_8(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen23_8(pr,o1, o2, o3, o4, o5, o6, o7, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o8);
		gen23_8(pr,o1, o2, o3, o4, o5, o6, o7, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o8, o9);
		gen23_8(pr,o1, o2, o3, o4, o5, o6, o7, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o8, o9, o10);
		gen23_8(pr,o1, o2, o3, o4, o5, o6, o7, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o8, o9, o10, o11);
		gen23_8(pr,o1, o2, o3, o4, o5, o6, o7, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o8, o9, o10, o11, o12);
		gen23_8(pr,o1, o2, o3, o4, o5, o6, o7, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o8, o9, o10, o11, o12, o13);
		gen23_8(pr,o1, o2, o3, o4, o5, o6, o7, o15, o16, o17, o18, o19, o20, o21, o22, o23, o8, o9, o10, o11, o12, o13, o14);
		gen23_8(pr,o1, o2, o3, o4, o5, o6, o7, o16, o17, o18, o19, o20, o21, o22, o23, o8, o9, o10, o11, o12, o13, o14, o15);
		gen23_8(pr,o1, o2, o3, o4, o5, o6, o7, o17, o18, o19, o20, o21, o22, o23, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen23_8(pr,o1, o2, o3, o4, o5, o6, o7, o18, o19, o20, o21, o22, o23, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen23_8(pr,o1, o2, o3, o4, o5, o6, o7, o19, o20, o21, o22, o23, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen23_8(pr,o1, o2, o3, o4, o5, o6, o7, o20, o21, o22, o23, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen23_8(pr,o1, o2, o3, o4, o5, o6, o7, o21, o22, o23, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen23_8(pr,o1, o2, o3, o4, o5, o6, o7, o22, o23, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen23_8(pr,o1, o2, o3, o4, o5, o6, o7, o23, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
	}

	private static final void gen23_8(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23){
		gen23_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen23_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o9);
		gen23_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o9, o10);
		gen23_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o9, o10, o11);
		gen23_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o9, o10, o11, o12);
		gen23_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o9, o10, o11, o12, o13);
		gen23_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o15, o16, o17, o18, o19, o20, o21, o22, o23, o9, o10, o11, o12, o13, o14);
		gen23_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o16, o17, o18, o19, o20, o21, o22, o23, o9, o10, o11, o12, o13, o14, o15);
		gen23_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o17, o18, o19, o20, o21, o22, o23, o9, o10, o11, o12, o13, o14, o15, o16);
		gen23_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o18, o19, o20, o21, o22, o23, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen23_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o19, o20, o21, o22, o23, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen23_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o20, o21, o22, o23, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen23_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o21, o22, o23, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen23_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o22, o23, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen23_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o23, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
	}

	private static final void gen23_9(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23){
		gen23_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen23_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o10);
		gen23_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o10, o11);
		gen23_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o10, o11, o12);
		gen23_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o10, o11, o12, o13);
		gen23_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o15, o16, o17, o18, o19, o20, o21, o22, o23, o10, o11, o12, o13, o14);
		gen23_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o16, o17, o18, o19, o20, o21, o22, o23, o10, o11, o12, o13, o14, o15);
		gen23_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o17, o18, o19, o20, o21, o22, o23, o10, o11, o12, o13, o14, o15, o16);
		gen23_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o18, o19, o20, o21, o22, o23, o10, o11, o12, o13, o14, o15, o16, o17);
		gen23_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o19, o20, o21, o22, o23, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen23_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o20, o21, o22, o23, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen23_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o21, o22, o23, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen23_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o22, o23, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen23_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o23, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
	}

	private static final void gen23_10(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23){
		gen23_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen23_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o11);
		gen23_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o11, o12);
		gen23_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o11, o12, o13);
		gen23_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o15, o16, o17, o18, o19, o20, o21, o22, o23, o11, o12, o13, o14);
		gen23_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o16, o17, o18, o19, o20, o21, o22, o23, o11, o12, o13, o14, o15);
		gen23_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o17, o18, o19, o20, o21, o22, o23, o11, o12, o13, o14, o15, o16);
		gen23_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o18, o19, o20, o21, o22, o23, o11, o12, o13, o14, o15, o16, o17);
		gen23_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o19, o20, o21, o22, o23, o11, o12, o13, o14, o15, o16, o17, o18);
		gen23_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o20, o21, o22, o23, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen23_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o21, o22, o23, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen23_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o22, o23, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen23_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o23, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
	}

	private static final void gen23_11(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23){
		gen23_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen23_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o12);
		gen23_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o12, o13);
		gen23_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o15, o16, o17, o18, o19, o20, o21, o22, o23, o12, o13, o14);
		gen23_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o16, o17, o18, o19, o20, o21, o22, o23, o12, o13, o14, o15);
		gen23_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o17, o18, o19, o20, o21, o22, o23, o12, o13, o14, o15, o16);
		gen23_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o18, o19, o20, o21, o22, o23, o12, o13, o14, o15, o16, o17);
		gen23_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o19, o20, o21, o22, o23, o12, o13, o14, o15, o16, o17, o18);
		gen23_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o20, o21, o22, o23, o12, o13, o14, o15, o16, o17, o18, o19);
		gen23_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o21, o22, o23, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen23_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o22, o23, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen23_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o23, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
	}

	private static final void gen23_12(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23){
		gen23_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen23_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o13);
		gen23_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o15, o16, o17, o18, o19, o20, o21, o22, o23, o13, o14);
		gen23_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o16, o17, o18, o19, o20, o21, o22, o23, o13, o14, o15);
		gen23_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o17, o18, o19, o20, o21, o22, o23, o13, o14, o15, o16);
		gen23_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o18, o19, o20, o21, o22, o23, o13, o14, o15, o16, o17);
		gen23_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o19, o20, o21, o22, o23, o13, o14, o15, o16, o17, o18);
		gen23_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o20, o21, o22, o23, o13, o14, o15, o16, o17, o18, o19);
		gen23_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o21, o22, o23, o13, o14, o15, o16, o17, o18, o19, o20);
		gen23_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o22, o23, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen23_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o23, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
	}

	private static final void gen23_13(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23){
		gen23_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen23_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o15, o16, o17, o18, o19, o20, o21, o22, o23, o14);
		gen23_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o16, o17, o18, o19, o20, o21, o22, o23, o14, o15);
		gen23_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o17, o18, o19, o20, o21, o22, o23, o14, o15, o16);
		gen23_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o18, o19, o20, o21, o22, o23, o14, o15, o16, o17);
		gen23_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o19, o20, o21, o22, o23, o14, o15, o16, o17, o18);
		gen23_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o20, o21, o22, o23, o14, o15, o16, o17, o18, o19);
		gen23_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o21, o22, o23, o14, o15, o16, o17, o18, o19, o20);
		gen23_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o22, o23, o14, o15, o16, o17, o18, o19, o20, o21);
		gen23_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o23, o14, o15, o16, o17, o18, o19, o20, o21, o22);
	}

	private static final void gen23_14(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23){
		gen23_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen23_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o16, o17, o18, o19, o20, o21, o22, o23, o15);
		gen23_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o17, o18, o19, o20, o21, o22, o23, o15, o16);
		gen23_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o18, o19, o20, o21, o22, o23, o15, o16, o17);
		gen23_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o19, o20, o21, o22, o23, o15, o16, o17, o18);
		gen23_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o20, o21, o22, o23, o15, o16, o17, o18, o19);
		gen23_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o21, o22, o23, o15, o16, o17, o18, o19, o20);
		gen23_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o22, o23, o15, o16, o17, o18, o19, o20, o21);
		gen23_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o23, o15, o16, o17, o18, o19, o20, o21, o22);
	}

	private static final void gen23_15(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23){
		gen23_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen23_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o17, o18, o19, o20, o21, o22, o23, o16);
		gen23_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o18, o19, o20, o21, o22, o23, o16, o17);
		gen23_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o19, o20, o21, o22, o23, o16, o17, o18);
		gen23_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o20, o21, o22, o23, o16, o17, o18, o19);
		gen23_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o21, o22, o23, o16, o17, o18, o19, o20);
		gen23_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o22, o23, o16, o17, o18, o19, o20, o21);
		gen23_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o23, o16, o17, o18, o19, o20, o21, o22);
	}

	private static final void gen23_16(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23){
		gen23_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen23_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o18, o19, o20, o21, o22, o23, o17);
		gen23_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o19, o20, o21, o22, o23, o17, o18);
		gen23_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o20, o21, o22, o23, o17, o18, o19);
		gen23_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o21, o22, o23, o17, o18, o19, o20);
		gen23_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o22, o23, o17, o18, o19, o20, o21);
		gen23_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o23, o17, o18, o19, o20, o21, o22);
	}

	private static final void gen23_17(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23){
		gen23_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen23_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o19, o20, o21, o22, o23, o18);
		gen23_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o20, o21, o22, o23, o18, o19);
		gen23_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o21, o22, o23, o18, o19, o20);
		gen23_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o22, o23, o18, o19, o20, o21);
		gen23_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o23, o18, o19, o20, o21, o22);
	}

	private static final void gen23_18(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23){
		gen23_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen23_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o20, o21, o22, o23, o19);
		gen23_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o21, o22, o23, o19, o20);
		gen23_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o22, o23, o19, o20, o21);
		gen23_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o23, o19, o20, o21, o22);
	}

	private static final void gen23_19(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23){
		gen23_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen23_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o21, o22, o23, o20);
		gen23_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o22, o23, o20, o21);
		gen23_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o23, o20, o21, o22);
	}

	private static final void gen23_20(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23){
		gen23_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen23_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o22, o23, o21);
		gen23_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o23, o21, o22);
	}

	private static final void gen23_21(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23){
		pr.recieve23(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		pr.recieve23(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o23, o22);
	}

	private static final void gen24_0(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24){
		gen24_1(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen24_1(pr,o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o1);
		gen24_1(pr,o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o1, o2);
		gen24_1(pr,o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o1, o2, o3);
		gen24_1(pr,o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o1, o2, o3, o4);
		gen24_1(pr,o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o1, o2, o3, o4, o5);
		gen24_1(pr,o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o1, o2, o3, o4, o5, o6);
		gen24_1(pr,o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o1, o2, o3, o4, o5, o6, o7);
		gen24_1(pr,o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o1, o2, o3, o4, o5, o6, o7, o8);
		gen24_1(pr,o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o1, o2, o3, o4, o5, o6, o7, o8, o9);
		gen24_1(pr,o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen24_1(pr,o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen24_1(pr,o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen24_1(pr,o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen24_1(pr,o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen24_1(pr,o16, o17, o18, o19, o20, o21, o22, o23, o24, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen24_1(pr,o17, o18, o19, o20, o21, o22, o23, o24, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen24_1(pr,o18, o19, o20, o21, o22, o23, o24, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen24_1(pr,o19, o20, o21, o22, o23, o24, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen24_1(pr,o20, o21, o22, o23, o24, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen24_1(pr,o21, o22, o23, o24, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen24_1(pr,o22, o23, o24, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen24_1(pr,o23, o24, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen24_1(pr,o24, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
	}

	private static final void gen24_1(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24){
		gen24_2(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen24_2(pr,o1, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o2);
		gen24_2(pr,o1, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o2, o3);
		gen24_2(pr,o1, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o2, o3, o4);
		gen24_2(pr,o1, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o2, o3, o4, o5);
		gen24_2(pr,o1, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o2, o3, o4, o5, o6);
		gen24_2(pr,o1, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o2, o3, o4, o5, o6, o7);
		gen24_2(pr,o1, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o2, o3, o4, o5, o6, o7, o8);
		gen24_2(pr,o1, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o2, o3, o4, o5, o6, o7, o8, o9);
		gen24_2(pr,o1, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen24_2(pr,o1, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen24_2(pr,o1, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen24_2(pr,o1, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen24_2(pr,o1, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen24_2(pr,o1, o16, o17, o18, o19, o20, o21, o22, o23, o24, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen24_2(pr,o1, o17, o18, o19, o20, o21, o22, o23, o24, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen24_2(pr,o1, o18, o19, o20, o21, o22, o23, o24, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen24_2(pr,o1, o19, o20, o21, o22, o23, o24, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen24_2(pr,o1, o20, o21, o22, o23, o24, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen24_2(pr,o1, o21, o22, o23, o24, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen24_2(pr,o1, o22, o23, o24, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen24_2(pr,o1, o23, o24, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen24_2(pr,o1, o24, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
	}

	private static final void gen24_2(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24){
		gen24_3(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen24_3(pr,o1, o2, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o3);
		gen24_3(pr,o1, o2, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o3, o4);
		gen24_3(pr,o1, o2, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o3, o4, o5);
		gen24_3(pr,o1, o2, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o3, o4, o5, o6);
		gen24_3(pr,o1, o2, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o3, o4, o5, o6, o7);
		gen24_3(pr,o1, o2, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o3, o4, o5, o6, o7, o8);
		gen24_3(pr,o1, o2, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o3, o4, o5, o6, o7, o8, o9);
		gen24_3(pr,o1, o2, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o3, o4, o5, o6, o7, o8, o9, o10);
		gen24_3(pr,o1, o2, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen24_3(pr,o1, o2, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen24_3(pr,o1, o2, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen24_3(pr,o1, o2, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen24_3(pr,o1, o2, o16, o17, o18, o19, o20, o21, o22, o23, o24, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen24_3(pr,o1, o2, o17, o18, o19, o20, o21, o22, o23, o24, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen24_3(pr,o1, o2, o18, o19, o20, o21, o22, o23, o24, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen24_3(pr,o1, o2, o19, o20, o21, o22, o23, o24, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen24_3(pr,o1, o2, o20, o21, o22, o23, o24, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen24_3(pr,o1, o2, o21, o22, o23, o24, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen24_3(pr,o1, o2, o22, o23, o24, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen24_3(pr,o1, o2, o23, o24, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen24_3(pr,o1, o2, o24, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
	}

	private static final void gen24_3(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24){
		gen24_4(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen24_4(pr,o1, o2, o3, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o4);
		gen24_4(pr,o1, o2, o3, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o4, o5);
		gen24_4(pr,o1, o2, o3, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o4, o5, o6);
		gen24_4(pr,o1, o2, o3, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o4, o5, o6, o7);
		gen24_4(pr,o1, o2, o3, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o4, o5, o6, o7, o8);
		gen24_4(pr,o1, o2, o3, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o4, o5, o6, o7, o8, o9);
		gen24_4(pr,o1, o2, o3, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o4, o5, o6, o7, o8, o9, o10);
		gen24_4(pr,o1, o2, o3, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o4, o5, o6, o7, o8, o9, o10, o11);
		gen24_4(pr,o1, o2, o3, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen24_4(pr,o1, o2, o3, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen24_4(pr,o1, o2, o3, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen24_4(pr,o1, o2, o3, o16, o17, o18, o19, o20, o21, o22, o23, o24, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen24_4(pr,o1, o2, o3, o17, o18, o19, o20, o21, o22, o23, o24, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen24_4(pr,o1, o2, o3, o18, o19, o20, o21, o22, o23, o24, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen24_4(pr,o1, o2, o3, o19, o20, o21, o22, o23, o24, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen24_4(pr,o1, o2, o3, o20, o21, o22, o23, o24, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen24_4(pr,o1, o2, o3, o21, o22, o23, o24, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen24_4(pr,o1, o2, o3, o22, o23, o24, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen24_4(pr,o1, o2, o3, o23, o24, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen24_4(pr,o1, o2, o3, o24, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
	}

	private static final void gen24_4(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24){
		gen24_5(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen24_5(pr,o1, o2, o3, o4, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o5);
		gen24_5(pr,o1, o2, o3, o4, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o5, o6);
		gen24_5(pr,o1, o2, o3, o4, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o5, o6, o7);
		gen24_5(pr,o1, o2, o3, o4, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o5, o6, o7, o8);
		gen24_5(pr,o1, o2, o3, o4, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o5, o6, o7, o8, o9);
		gen24_5(pr,o1, o2, o3, o4, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o5, o6, o7, o8, o9, o10);
		gen24_5(pr,o1, o2, o3, o4, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o5, o6, o7, o8, o9, o10, o11);
		gen24_5(pr,o1, o2, o3, o4, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o5, o6, o7, o8, o9, o10, o11, o12);
		gen24_5(pr,o1, o2, o3, o4, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen24_5(pr,o1, o2, o3, o4, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen24_5(pr,o1, o2, o3, o4, o16, o17, o18, o19, o20, o21, o22, o23, o24, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen24_5(pr,o1, o2, o3, o4, o17, o18, o19, o20, o21, o22, o23, o24, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen24_5(pr,o1, o2, o3, o4, o18, o19, o20, o21, o22, o23, o24, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen24_5(pr,o1, o2, o3, o4, o19, o20, o21, o22, o23, o24, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen24_5(pr,o1, o2, o3, o4, o20, o21, o22, o23, o24, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen24_5(pr,o1, o2, o3, o4, o21, o22, o23, o24, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen24_5(pr,o1, o2, o3, o4, o22, o23, o24, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen24_5(pr,o1, o2, o3, o4, o23, o24, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen24_5(pr,o1, o2, o3, o4, o24, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
	}

	private static final void gen24_5(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24){
		gen24_6(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen24_6(pr,o1, o2, o3, o4, o5, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o6);
		gen24_6(pr,o1, o2, o3, o4, o5, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o6, o7);
		gen24_6(pr,o1, o2, o3, o4, o5, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o6, o7, o8);
		gen24_6(pr,o1, o2, o3, o4, o5, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o6, o7, o8, o9);
		gen24_6(pr,o1, o2, o3, o4, o5, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o6, o7, o8, o9, o10);
		gen24_6(pr,o1, o2, o3, o4, o5, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o6, o7, o8, o9, o10, o11);
		gen24_6(pr,o1, o2, o3, o4, o5, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o6, o7, o8, o9, o10, o11, o12);
		gen24_6(pr,o1, o2, o3, o4, o5, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o6, o7, o8, o9, o10, o11, o12, o13);
		gen24_6(pr,o1, o2, o3, o4, o5, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen24_6(pr,o1, o2, o3, o4, o5, o16, o17, o18, o19, o20, o21, o22, o23, o24, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen24_6(pr,o1, o2, o3, o4, o5, o17, o18, o19, o20, o21, o22, o23, o24, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen24_6(pr,o1, o2, o3, o4, o5, o18, o19, o20, o21, o22, o23, o24, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen24_6(pr,o1, o2, o3, o4, o5, o19, o20, o21, o22, o23, o24, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen24_6(pr,o1, o2, o3, o4, o5, o20, o21, o22, o23, o24, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen24_6(pr,o1, o2, o3, o4, o5, o21, o22, o23, o24, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen24_6(pr,o1, o2, o3, o4, o5, o22, o23, o24, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen24_6(pr,o1, o2, o3, o4, o5, o23, o24, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen24_6(pr,o1, o2, o3, o4, o5, o24, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
	}

	private static final void gen24_6(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24){
		gen24_7(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen24_7(pr,o1, o2, o3, o4, o5, o6, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o7);
		gen24_7(pr,o1, o2, o3, o4, o5, o6, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o7, o8);
		gen24_7(pr,o1, o2, o3, o4, o5, o6, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o7, o8, o9);
		gen24_7(pr,o1, o2, o3, o4, o5, o6, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o7, o8, o9, o10);
		gen24_7(pr,o1, o2, o3, o4, o5, o6, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o7, o8, o9, o10, o11);
		gen24_7(pr,o1, o2, o3, o4, o5, o6, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o7, o8, o9, o10, o11, o12);
		gen24_7(pr,o1, o2, o3, o4, o5, o6, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o7, o8, o9, o10, o11, o12, o13);
		gen24_7(pr,o1, o2, o3, o4, o5, o6, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o7, o8, o9, o10, o11, o12, o13, o14);
		gen24_7(pr,o1, o2, o3, o4, o5, o6, o16, o17, o18, o19, o20, o21, o22, o23, o24, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen24_7(pr,o1, o2, o3, o4, o5, o6, o17, o18, o19, o20, o21, o22, o23, o24, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen24_7(pr,o1, o2, o3, o4, o5, o6, o18, o19, o20, o21, o22, o23, o24, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen24_7(pr,o1, o2, o3, o4, o5, o6, o19, o20, o21, o22, o23, o24, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen24_7(pr,o1, o2, o3, o4, o5, o6, o20, o21, o22, o23, o24, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen24_7(pr,o1, o2, o3, o4, o5, o6, o21, o22, o23, o24, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen24_7(pr,o1, o2, o3, o4, o5, o6, o22, o23, o24, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen24_7(pr,o1, o2, o3, o4, o5, o6, o23, o24, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen24_7(pr,o1, o2, o3, o4, o5, o6, o24, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
	}

	private static final void gen24_7(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24){
		gen24_8(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen24_8(pr,o1, o2, o3, o4, o5, o6, o7, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o8);
		gen24_8(pr,o1, o2, o3, o4, o5, o6, o7, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o8, o9);
		gen24_8(pr,o1, o2, o3, o4, o5, o6, o7, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o8, o9, o10);
		gen24_8(pr,o1, o2, o3, o4, o5, o6, o7, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o8, o9, o10, o11);
		gen24_8(pr,o1, o2, o3, o4, o5, o6, o7, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o8, o9, o10, o11, o12);
		gen24_8(pr,o1, o2, o3, o4, o5, o6, o7, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o8, o9, o10, o11, o12, o13);
		gen24_8(pr,o1, o2, o3, o4, o5, o6, o7, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o8, o9, o10, o11, o12, o13, o14);
		gen24_8(pr,o1, o2, o3, o4, o5, o6, o7, o16, o17, o18, o19, o20, o21, o22, o23, o24, o8, o9, o10, o11, o12, o13, o14, o15);
		gen24_8(pr,o1, o2, o3, o4, o5, o6, o7, o17, o18, o19, o20, o21, o22, o23, o24, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen24_8(pr,o1, o2, o3, o4, o5, o6, o7, o18, o19, o20, o21, o22, o23, o24, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen24_8(pr,o1, o2, o3, o4, o5, o6, o7, o19, o20, o21, o22, o23, o24, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen24_8(pr,o1, o2, o3, o4, o5, o6, o7, o20, o21, o22, o23, o24, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen24_8(pr,o1, o2, o3, o4, o5, o6, o7, o21, o22, o23, o24, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen24_8(pr,o1, o2, o3, o4, o5, o6, o7, o22, o23, o24, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen24_8(pr,o1, o2, o3, o4, o5, o6, o7, o23, o24, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen24_8(pr,o1, o2, o3, o4, o5, o6, o7, o24, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
	}

	private static final void gen24_8(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24){
		gen24_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen24_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o9);
		gen24_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o9, o10);
		gen24_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o9, o10, o11);
		gen24_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o9, o10, o11, o12);
		gen24_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o9, o10, o11, o12, o13);
		gen24_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o9, o10, o11, o12, o13, o14);
		gen24_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o16, o17, o18, o19, o20, o21, o22, o23, o24, o9, o10, o11, o12, o13, o14, o15);
		gen24_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o17, o18, o19, o20, o21, o22, o23, o24, o9, o10, o11, o12, o13, o14, o15, o16);
		gen24_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o18, o19, o20, o21, o22, o23, o24, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen24_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o19, o20, o21, o22, o23, o24, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen24_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o20, o21, o22, o23, o24, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen24_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o21, o22, o23, o24, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen24_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o22, o23, o24, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen24_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o23, o24, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen24_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o24, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
	}

	private static final void gen24_9(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24){
		gen24_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen24_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o10);
		gen24_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o10, o11);
		gen24_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o10, o11, o12);
		gen24_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o10, o11, o12, o13);
		gen24_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o10, o11, o12, o13, o14);
		gen24_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o16, o17, o18, o19, o20, o21, o22, o23, o24, o10, o11, o12, o13, o14, o15);
		gen24_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o17, o18, o19, o20, o21, o22, o23, o24, o10, o11, o12, o13, o14, o15, o16);
		gen24_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o18, o19, o20, o21, o22, o23, o24, o10, o11, o12, o13, o14, o15, o16, o17);
		gen24_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o19, o20, o21, o22, o23, o24, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen24_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o20, o21, o22, o23, o24, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen24_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o21, o22, o23, o24, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen24_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o22, o23, o24, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen24_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o23, o24, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen24_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o24, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
	}

	private static final void gen24_10(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24){
		gen24_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen24_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o11);
		gen24_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o11, o12);
		gen24_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o11, o12, o13);
		gen24_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o11, o12, o13, o14);
		gen24_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o16, o17, o18, o19, o20, o21, o22, o23, o24, o11, o12, o13, o14, o15);
		gen24_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o17, o18, o19, o20, o21, o22, o23, o24, o11, o12, o13, o14, o15, o16);
		gen24_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o18, o19, o20, o21, o22, o23, o24, o11, o12, o13, o14, o15, o16, o17);
		gen24_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o19, o20, o21, o22, o23, o24, o11, o12, o13, o14, o15, o16, o17, o18);
		gen24_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o20, o21, o22, o23, o24, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen24_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o21, o22, o23, o24, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen24_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o22, o23, o24, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen24_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o23, o24, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen24_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o24, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
	}

	private static final void gen24_11(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24){
		gen24_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen24_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o12);
		gen24_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o12, o13);
		gen24_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o12, o13, o14);
		gen24_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o16, o17, o18, o19, o20, o21, o22, o23, o24, o12, o13, o14, o15);
		gen24_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o17, o18, o19, o20, o21, o22, o23, o24, o12, o13, o14, o15, o16);
		gen24_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o18, o19, o20, o21, o22, o23, o24, o12, o13, o14, o15, o16, o17);
		gen24_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o19, o20, o21, o22, o23, o24, o12, o13, o14, o15, o16, o17, o18);
		gen24_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o20, o21, o22, o23, o24, o12, o13, o14, o15, o16, o17, o18, o19);
		gen24_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o21, o22, o23, o24, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen24_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o22, o23, o24, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen24_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o23, o24, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen24_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o24, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
	}

	private static final void gen24_12(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24){
		gen24_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen24_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o13);
		gen24_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o13, o14);
		gen24_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o16, o17, o18, o19, o20, o21, o22, o23, o24, o13, o14, o15);
		gen24_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o17, o18, o19, o20, o21, o22, o23, o24, o13, o14, o15, o16);
		gen24_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o18, o19, o20, o21, o22, o23, o24, o13, o14, o15, o16, o17);
		gen24_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o19, o20, o21, o22, o23, o24, o13, o14, o15, o16, o17, o18);
		gen24_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o20, o21, o22, o23, o24, o13, o14, o15, o16, o17, o18, o19);
		gen24_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o21, o22, o23, o24, o13, o14, o15, o16, o17, o18, o19, o20);
		gen24_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o22, o23, o24, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen24_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o23, o24, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen24_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o24, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
	}

	private static final void gen24_13(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24){
		gen24_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen24_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o14);
		gen24_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o16, o17, o18, o19, o20, o21, o22, o23, o24, o14, o15);
		gen24_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o17, o18, o19, o20, o21, o22, o23, o24, o14, o15, o16);
		gen24_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o18, o19, o20, o21, o22, o23, o24, o14, o15, o16, o17);
		gen24_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o19, o20, o21, o22, o23, o24, o14, o15, o16, o17, o18);
		gen24_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o20, o21, o22, o23, o24, o14, o15, o16, o17, o18, o19);
		gen24_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o21, o22, o23, o24, o14, o15, o16, o17, o18, o19, o20);
		gen24_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o22, o23, o24, o14, o15, o16, o17, o18, o19, o20, o21);
		gen24_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o23, o24, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen24_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o24, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
	}

	private static final void gen24_14(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24){
		gen24_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen24_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o16, o17, o18, o19, o20, o21, o22, o23, o24, o15);
		gen24_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o17, o18, o19, o20, o21, o22, o23, o24, o15, o16);
		gen24_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o18, o19, o20, o21, o22, o23, o24, o15, o16, o17);
		gen24_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o19, o20, o21, o22, o23, o24, o15, o16, o17, o18);
		gen24_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o20, o21, o22, o23, o24, o15, o16, o17, o18, o19);
		gen24_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o21, o22, o23, o24, o15, o16, o17, o18, o19, o20);
		gen24_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o22, o23, o24, o15, o16, o17, o18, o19, o20, o21);
		gen24_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o23, o24, o15, o16, o17, o18, o19, o20, o21, o22);
		gen24_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o24, o15, o16, o17, o18, o19, o20, o21, o22, o23);
	}

	private static final void gen24_15(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24){
		gen24_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen24_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o17, o18, o19, o20, o21, o22, o23, o24, o16);
		gen24_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o18, o19, o20, o21, o22, o23, o24, o16, o17);
		gen24_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o19, o20, o21, o22, o23, o24, o16, o17, o18);
		gen24_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o20, o21, o22, o23, o24, o16, o17, o18, o19);
		gen24_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o21, o22, o23, o24, o16, o17, o18, o19, o20);
		gen24_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o22, o23, o24, o16, o17, o18, o19, o20, o21);
		gen24_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o23, o24, o16, o17, o18, o19, o20, o21, o22);
		gen24_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o24, o16, o17, o18, o19, o20, o21, o22, o23);
	}

	private static final void gen24_16(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24){
		gen24_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen24_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o18, o19, o20, o21, o22, o23, o24, o17);
		gen24_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o19, o20, o21, o22, o23, o24, o17, o18);
		gen24_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o20, o21, o22, o23, o24, o17, o18, o19);
		gen24_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o21, o22, o23, o24, o17, o18, o19, o20);
		gen24_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o22, o23, o24, o17, o18, o19, o20, o21);
		gen24_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o23, o24, o17, o18, o19, o20, o21, o22);
		gen24_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o24, o17, o18, o19, o20, o21, o22, o23);
	}

	private static final void gen24_17(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24){
		gen24_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen24_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o19, o20, o21, o22, o23, o24, o18);
		gen24_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o20, o21, o22, o23, o24, o18, o19);
		gen24_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o21, o22, o23, o24, o18, o19, o20);
		gen24_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o22, o23, o24, o18, o19, o20, o21);
		gen24_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o23, o24, o18, o19, o20, o21, o22);
		gen24_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o24, o18, o19, o20, o21, o22, o23);
	}

	private static final void gen24_18(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24){
		gen24_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen24_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o20, o21, o22, o23, o24, o19);
		gen24_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o21, o22, o23, o24, o19, o20);
		gen24_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o22, o23, o24, o19, o20, o21);
		gen24_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o23, o24, o19, o20, o21, o22);
		gen24_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o24, o19, o20, o21, o22, o23);
	}

	private static final void gen24_19(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24){
		gen24_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen24_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o21, o22, o23, o24, o20);
		gen24_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o22, o23, o24, o20, o21);
		gen24_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o23, o24, o20, o21, o22);
		gen24_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o24, o20, o21, o22, o23);
	}

	private static final void gen24_20(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24){
		gen24_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen24_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o22, o23, o24, o21);
		gen24_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o23, o24, o21, o22);
		gen24_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o24, o21, o22, o23);
	}

	private static final void gen24_21(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24){
		gen24_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen24_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o23, o24, o22);
		gen24_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o24, o22, o23);
	}

	private static final void gen24_22(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24){
		pr.recieve24(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		pr.recieve24(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o24, o23);
	}

	private static final void gen25_0(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25){
		gen25_1(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen25_1(pr,o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o1);
		gen25_1(pr,o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o1, o2);
		gen25_1(pr,o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o1, o2, o3);
		gen25_1(pr,o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o1, o2, o3, o4);
		gen25_1(pr,o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o1, o2, o3, o4, o5);
		gen25_1(pr,o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o1, o2, o3, o4, o5, o6);
		gen25_1(pr,o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o1, o2, o3, o4, o5, o6, o7);
		gen25_1(pr,o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o1, o2, o3, o4, o5, o6, o7, o8);
		gen25_1(pr,o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o1, o2, o3, o4, o5, o6, o7, o8, o9);
		gen25_1(pr,o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen25_1(pr,o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen25_1(pr,o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen25_1(pr,o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen25_1(pr,o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen25_1(pr,o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen25_1(pr,o17, o18, o19, o20, o21, o22, o23, o24, o25, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen25_1(pr,o18, o19, o20, o21, o22, o23, o24, o25, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen25_1(pr,o19, o20, o21, o22, o23, o24, o25, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen25_1(pr,o20, o21, o22, o23, o24, o25, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen25_1(pr,o21, o22, o23, o24, o25, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen25_1(pr,o22, o23, o24, o25, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen25_1(pr,o23, o24, o25, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen25_1(pr,o24, o25, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen25_1(pr,o25, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
	}

	private static final void gen25_1(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25){
		gen25_2(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen25_2(pr,o1, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o2);
		gen25_2(pr,o1, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o2, o3);
		gen25_2(pr,o1, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o2, o3, o4);
		gen25_2(pr,o1, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o2, o3, o4, o5);
		gen25_2(pr,o1, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o2, o3, o4, o5, o6);
		gen25_2(pr,o1, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o2, o3, o4, o5, o6, o7);
		gen25_2(pr,o1, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o2, o3, o4, o5, o6, o7, o8);
		gen25_2(pr,o1, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o2, o3, o4, o5, o6, o7, o8, o9);
		gen25_2(pr,o1, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen25_2(pr,o1, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen25_2(pr,o1, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen25_2(pr,o1, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen25_2(pr,o1, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen25_2(pr,o1, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen25_2(pr,o1, o17, o18, o19, o20, o21, o22, o23, o24, o25, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen25_2(pr,o1, o18, o19, o20, o21, o22, o23, o24, o25, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen25_2(pr,o1, o19, o20, o21, o22, o23, o24, o25, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen25_2(pr,o1, o20, o21, o22, o23, o24, o25, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen25_2(pr,o1, o21, o22, o23, o24, o25, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen25_2(pr,o1, o22, o23, o24, o25, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen25_2(pr,o1, o23, o24, o25, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen25_2(pr,o1, o24, o25, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen25_2(pr,o1, o25, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
	}

	private static final void gen25_2(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25){
		gen25_3(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen25_3(pr,o1, o2, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o3);
		gen25_3(pr,o1, o2, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o3, o4);
		gen25_3(pr,o1, o2, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o3, o4, o5);
		gen25_3(pr,o1, o2, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o3, o4, o5, o6);
		gen25_3(pr,o1, o2, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o3, o4, o5, o6, o7);
		gen25_3(pr,o1, o2, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o3, o4, o5, o6, o7, o8);
		gen25_3(pr,o1, o2, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o3, o4, o5, o6, o7, o8, o9);
		gen25_3(pr,o1, o2, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o3, o4, o5, o6, o7, o8, o9, o10);
		gen25_3(pr,o1, o2, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen25_3(pr,o1, o2, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen25_3(pr,o1, o2, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen25_3(pr,o1, o2, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen25_3(pr,o1, o2, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen25_3(pr,o1, o2, o17, o18, o19, o20, o21, o22, o23, o24, o25, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen25_3(pr,o1, o2, o18, o19, o20, o21, o22, o23, o24, o25, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen25_3(pr,o1, o2, o19, o20, o21, o22, o23, o24, o25, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen25_3(pr,o1, o2, o20, o21, o22, o23, o24, o25, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen25_3(pr,o1, o2, o21, o22, o23, o24, o25, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen25_3(pr,o1, o2, o22, o23, o24, o25, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen25_3(pr,o1, o2, o23, o24, o25, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen25_3(pr,o1, o2, o24, o25, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen25_3(pr,o1, o2, o25, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
	}

	private static final void gen25_3(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25){
		gen25_4(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen25_4(pr,o1, o2, o3, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o4);
		gen25_4(pr,o1, o2, o3, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o4, o5);
		gen25_4(pr,o1, o2, o3, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o4, o5, o6);
		gen25_4(pr,o1, o2, o3, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o4, o5, o6, o7);
		gen25_4(pr,o1, o2, o3, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o4, o5, o6, o7, o8);
		gen25_4(pr,o1, o2, o3, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o4, o5, o6, o7, o8, o9);
		gen25_4(pr,o1, o2, o3, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o4, o5, o6, o7, o8, o9, o10);
		gen25_4(pr,o1, o2, o3, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o4, o5, o6, o7, o8, o9, o10, o11);
		gen25_4(pr,o1, o2, o3, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen25_4(pr,o1, o2, o3, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen25_4(pr,o1, o2, o3, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen25_4(pr,o1, o2, o3, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen25_4(pr,o1, o2, o3, o17, o18, o19, o20, o21, o22, o23, o24, o25, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen25_4(pr,o1, o2, o3, o18, o19, o20, o21, o22, o23, o24, o25, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen25_4(pr,o1, o2, o3, o19, o20, o21, o22, o23, o24, o25, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen25_4(pr,o1, o2, o3, o20, o21, o22, o23, o24, o25, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen25_4(pr,o1, o2, o3, o21, o22, o23, o24, o25, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen25_4(pr,o1, o2, o3, o22, o23, o24, o25, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen25_4(pr,o1, o2, o3, o23, o24, o25, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen25_4(pr,o1, o2, o3, o24, o25, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen25_4(pr,o1, o2, o3, o25, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
	}

	private static final void gen25_4(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25){
		gen25_5(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen25_5(pr,o1, o2, o3, o4, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o5);
		gen25_5(pr,o1, o2, o3, o4, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o5, o6);
		gen25_5(pr,o1, o2, o3, o4, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o5, o6, o7);
		gen25_5(pr,o1, o2, o3, o4, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o5, o6, o7, o8);
		gen25_5(pr,o1, o2, o3, o4, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o5, o6, o7, o8, o9);
		gen25_5(pr,o1, o2, o3, o4, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o5, o6, o7, o8, o9, o10);
		gen25_5(pr,o1, o2, o3, o4, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o5, o6, o7, o8, o9, o10, o11);
		gen25_5(pr,o1, o2, o3, o4, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o5, o6, o7, o8, o9, o10, o11, o12);
		gen25_5(pr,o1, o2, o3, o4, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen25_5(pr,o1, o2, o3, o4, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen25_5(pr,o1, o2, o3, o4, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen25_5(pr,o1, o2, o3, o4, o17, o18, o19, o20, o21, o22, o23, o24, o25, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen25_5(pr,o1, o2, o3, o4, o18, o19, o20, o21, o22, o23, o24, o25, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen25_5(pr,o1, o2, o3, o4, o19, o20, o21, o22, o23, o24, o25, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen25_5(pr,o1, o2, o3, o4, o20, o21, o22, o23, o24, o25, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen25_5(pr,o1, o2, o3, o4, o21, o22, o23, o24, o25, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen25_5(pr,o1, o2, o3, o4, o22, o23, o24, o25, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen25_5(pr,o1, o2, o3, o4, o23, o24, o25, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen25_5(pr,o1, o2, o3, o4, o24, o25, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen25_5(pr,o1, o2, o3, o4, o25, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
	}

	private static final void gen25_5(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25){
		gen25_6(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen25_6(pr,o1, o2, o3, o4, o5, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o6);
		gen25_6(pr,o1, o2, o3, o4, o5, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o6, o7);
		gen25_6(pr,o1, o2, o3, o4, o5, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o6, o7, o8);
		gen25_6(pr,o1, o2, o3, o4, o5, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o6, o7, o8, o9);
		gen25_6(pr,o1, o2, o3, o4, o5, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o6, o7, o8, o9, o10);
		gen25_6(pr,o1, o2, o3, o4, o5, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o6, o7, o8, o9, o10, o11);
		gen25_6(pr,o1, o2, o3, o4, o5, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o6, o7, o8, o9, o10, o11, o12);
		gen25_6(pr,o1, o2, o3, o4, o5, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o6, o7, o8, o9, o10, o11, o12, o13);
		gen25_6(pr,o1, o2, o3, o4, o5, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen25_6(pr,o1, o2, o3, o4, o5, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen25_6(pr,o1, o2, o3, o4, o5, o17, o18, o19, o20, o21, o22, o23, o24, o25, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen25_6(pr,o1, o2, o3, o4, o5, o18, o19, o20, o21, o22, o23, o24, o25, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen25_6(pr,o1, o2, o3, o4, o5, o19, o20, o21, o22, o23, o24, o25, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen25_6(pr,o1, o2, o3, o4, o5, o20, o21, o22, o23, o24, o25, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen25_6(pr,o1, o2, o3, o4, o5, o21, o22, o23, o24, o25, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen25_6(pr,o1, o2, o3, o4, o5, o22, o23, o24, o25, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen25_6(pr,o1, o2, o3, o4, o5, o23, o24, o25, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen25_6(pr,o1, o2, o3, o4, o5, o24, o25, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen25_6(pr,o1, o2, o3, o4, o5, o25, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
	}

	private static final void gen25_6(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25){
		gen25_7(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen25_7(pr,o1, o2, o3, o4, o5, o6, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o7);
		gen25_7(pr,o1, o2, o3, o4, o5, o6, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o7, o8);
		gen25_7(pr,o1, o2, o3, o4, o5, o6, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o7, o8, o9);
		gen25_7(pr,o1, o2, o3, o4, o5, o6, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o7, o8, o9, o10);
		gen25_7(pr,o1, o2, o3, o4, o5, o6, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o7, o8, o9, o10, o11);
		gen25_7(pr,o1, o2, o3, o4, o5, o6, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o7, o8, o9, o10, o11, o12);
		gen25_7(pr,o1, o2, o3, o4, o5, o6, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o7, o8, o9, o10, o11, o12, o13);
		gen25_7(pr,o1, o2, o3, o4, o5, o6, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o7, o8, o9, o10, o11, o12, o13, o14);
		gen25_7(pr,o1, o2, o3, o4, o5, o6, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen25_7(pr,o1, o2, o3, o4, o5, o6, o17, o18, o19, o20, o21, o22, o23, o24, o25, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen25_7(pr,o1, o2, o3, o4, o5, o6, o18, o19, o20, o21, o22, o23, o24, o25, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen25_7(pr,o1, o2, o3, o4, o5, o6, o19, o20, o21, o22, o23, o24, o25, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen25_7(pr,o1, o2, o3, o4, o5, o6, o20, o21, o22, o23, o24, o25, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen25_7(pr,o1, o2, o3, o4, o5, o6, o21, o22, o23, o24, o25, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen25_7(pr,o1, o2, o3, o4, o5, o6, o22, o23, o24, o25, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen25_7(pr,o1, o2, o3, o4, o5, o6, o23, o24, o25, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen25_7(pr,o1, o2, o3, o4, o5, o6, o24, o25, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen25_7(pr,o1, o2, o3, o4, o5, o6, o25, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
	}

	private static final void gen25_7(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25){
		gen25_8(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen25_8(pr,o1, o2, o3, o4, o5, o6, o7, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o8);
		gen25_8(pr,o1, o2, o3, o4, o5, o6, o7, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o8, o9);
		gen25_8(pr,o1, o2, o3, o4, o5, o6, o7, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o8, o9, o10);
		gen25_8(pr,o1, o2, o3, o4, o5, o6, o7, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o8, o9, o10, o11);
		gen25_8(pr,o1, o2, o3, o4, o5, o6, o7, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o8, o9, o10, o11, o12);
		gen25_8(pr,o1, o2, o3, o4, o5, o6, o7, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o8, o9, o10, o11, o12, o13);
		gen25_8(pr,o1, o2, o3, o4, o5, o6, o7, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o8, o9, o10, o11, o12, o13, o14);
		gen25_8(pr,o1, o2, o3, o4, o5, o6, o7, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o8, o9, o10, o11, o12, o13, o14, o15);
		gen25_8(pr,o1, o2, o3, o4, o5, o6, o7, o17, o18, o19, o20, o21, o22, o23, o24, o25, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen25_8(pr,o1, o2, o3, o4, o5, o6, o7, o18, o19, o20, o21, o22, o23, o24, o25, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen25_8(pr,o1, o2, o3, o4, o5, o6, o7, o19, o20, o21, o22, o23, o24, o25, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen25_8(pr,o1, o2, o3, o4, o5, o6, o7, o20, o21, o22, o23, o24, o25, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen25_8(pr,o1, o2, o3, o4, o5, o6, o7, o21, o22, o23, o24, o25, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen25_8(pr,o1, o2, o3, o4, o5, o6, o7, o22, o23, o24, o25, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen25_8(pr,o1, o2, o3, o4, o5, o6, o7, o23, o24, o25, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen25_8(pr,o1, o2, o3, o4, o5, o6, o7, o24, o25, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen25_8(pr,o1, o2, o3, o4, o5, o6, o7, o25, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
	}

	private static final void gen25_8(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25){
		gen25_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen25_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o9);
		gen25_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o9, o10);
		gen25_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o9, o10, o11);
		gen25_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o9, o10, o11, o12);
		gen25_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o9, o10, o11, o12, o13);
		gen25_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o9, o10, o11, o12, o13, o14);
		gen25_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o9, o10, o11, o12, o13, o14, o15);
		gen25_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o17, o18, o19, o20, o21, o22, o23, o24, o25, o9, o10, o11, o12, o13, o14, o15, o16);
		gen25_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o18, o19, o20, o21, o22, o23, o24, o25, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen25_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o19, o20, o21, o22, o23, o24, o25, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen25_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o20, o21, o22, o23, o24, o25, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen25_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o21, o22, o23, o24, o25, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen25_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o22, o23, o24, o25, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen25_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o23, o24, o25, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen25_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o24, o25, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen25_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o25, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
	}

	private static final void gen25_9(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25){
		gen25_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen25_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o10);
		gen25_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o10, o11);
		gen25_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o10, o11, o12);
		gen25_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o10, o11, o12, o13);
		gen25_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o10, o11, o12, o13, o14);
		gen25_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o10, o11, o12, o13, o14, o15);
		gen25_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o17, o18, o19, o20, o21, o22, o23, o24, o25, o10, o11, o12, o13, o14, o15, o16);
		gen25_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o18, o19, o20, o21, o22, o23, o24, o25, o10, o11, o12, o13, o14, o15, o16, o17);
		gen25_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o19, o20, o21, o22, o23, o24, o25, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen25_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o20, o21, o22, o23, o24, o25, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen25_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o21, o22, o23, o24, o25, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen25_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o22, o23, o24, o25, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen25_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o23, o24, o25, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen25_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o24, o25, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen25_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o25, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
	}

	private static final void gen25_10(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25){
		gen25_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen25_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o11);
		gen25_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o11, o12);
		gen25_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o11, o12, o13);
		gen25_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o11, o12, o13, o14);
		gen25_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o11, o12, o13, o14, o15);
		gen25_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o17, o18, o19, o20, o21, o22, o23, o24, o25, o11, o12, o13, o14, o15, o16);
		gen25_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o18, o19, o20, o21, o22, o23, o24, o25, o11, o12, o13, o14, o15, o16, o17);
		gen25_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o19, o20, o21, o22, o23, o24, o25, o11, o12, o13, o14, o15, o16, o17, o18);
		gen25_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o20, o21, o22, o23, o24, o25, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen25_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o21, o22, o23, o24, o25, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen25_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o22, o23, o24, o25, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen25_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o23, o24, o25, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen25_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o24, o25, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen25_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o25, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
	}

	private static final void gen25_11(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25){
		gen25_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen25_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o12);
		gen25_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o12, o13);
		gen25_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o12, o13, o14);
		gen25_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o12, o13, o14, o15);
		gen25_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o17, o18, o19, o20, o21, o22, o23, o24, o25, o12, o13, o14, o15, o16);
		gen25_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o18, o19, o20, o21, o22, o23, o24, o25, o12, o13, o14, o15, o16, o17);
		gen25_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o19, o20, o21, o22, o23, o24, o25, o12, o13, o14, o15, o16, o17, o18);
		gen25_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o20, o21, o22, o23, o24, o25, o12, o13, o14, o15, o16, o17, o18, o19);
		gen25_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o21, o22, o23, o24, o25, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen25_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o22, o23, o24, o25, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen25_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o23, o24, o25, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen25_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o24, o25, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen25_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o25, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
	}

	private static final void gen25_12(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25){
		gen25_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen25_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o13);
		gen25_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o13, o14);
		gen25_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o13, o14, o15);
		gen25_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o17, o18, o19, o20, o21, o22, o23, o24, o25, o13, o14, o15, o16);
		gen25_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o18, o19, o20, o21, o22, o23, o24, o25, o13, o14, o15, o16, o17);
		gen25_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o19, o20, o21, o22, o23, o24, o25, o13, o14, o15, o16, o17, o18);
		gen25_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o20, o21, o22, o23, o24, o25, o13, o14, o15, o16, o17, o18, o19);
		gen25_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o21, o22, o23, o24, o25, o13, o14, o15, o16, o17, o18, o19, o20);
		gen25_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o22, o23, o24, o25, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen25_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o23, o24, o25, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen25_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o24, o25, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen25_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o25, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
	}

	private static final void gen25_13(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25){
		gen25_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen25_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o14);
		gen25_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o14, o15);
		gen25_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o17, o18, o19, o20, o21, o22, o23, o24, o25, o14, o15, o16);
		gen25_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o18, o19, o20, o21, o22, o23, o24, o25, o14, o15, o16, o17);
		gen25_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o19, o20, o21, o22, o23, o24, o25, o14, o15, o16, o17, o18);
		gen25_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o20, o21, o22, o23, o24, o25, o14, o15, o16, o17, o18, o19);
		gen25_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o21, o22, o23, o24, o25, o14, o15, o16, o17, o18, o19, o20);
		gen25_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o22, o23, o24, o25, o14, o15, o16, o17, o18, o19, o20, o21);
		gen25_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o23, o24, o25, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen25_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o24, o25, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen25_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o25, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
	}

	private static final void gen25_14(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25){
		gen25_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen25_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o15);
		gen25_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o17, o18, o19, o20, o21, o22, o23, o24, o25, o15, o16);
		gen25_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o18, o19, o20, o21, o22, o23, o24, o25, o15, o16, o17);
		gen25_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o19, o20, o21, o22, o23, o24, o25, o15, o16, o17, o18);
		gen25_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o20, o21, o22, o23, o24, o25, o15, o16, o17, o18, o19);
		gen25_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o21, o22, o23, o24, o25, o15, o16, o17, o18, o19, o20);
		gen25_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o22, o23, o24, o25, o15, o16, o17, o18, o19, o20, o21);
		gen25_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o23, o24, o25, o15, o16, o17, o18, o19, o20, o21, o22);
		gen25_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o24, o25, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen25_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o25, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
	}

	private static final void gen25_15(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25){
		gen25_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen25_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o17, o18, o19, o20, o21, o22, o23, o24, o25, o16);
		gen25_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o18, o19, o20, o21, o22, o23, o24, o25, o16, o17);
		gen25_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o19, o20, o21, o22, o23, o24, o25, o16, o17, o18);
		gen25_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o20, o21, o22, o23, o24, o25, o16, o17, o18, o19);
		gen25_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o21, o22, o23, o24, o25, o16, o17, o18, o19, o20);
		gen25_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o22, o23, o24, o25, o16, o17, o18, o19, o20, o21);
		gen25_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o23, o24, o25, o16, o17, o18, o19, o20, o21, o22);
		gen25_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o24, o25, o16, o17, o18, o19, o20, o21, o22, o23);
		gen25_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o25, o16, o17, o18, o19, o20, o21, o22, o23, o24);
	}

	private static final void gen25_16(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25){
		gen25_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen25_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o18, o19, o20, o21, o22, o23, o24, o25, o17);
		gen25_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o19, o20, o21, o22, o23, o24, o25, o17, o18);
		gen25_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o20, o21, o22, o23, o24, o25, o17, o18, o19);
		gen25_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o21, o22, o23, o24, o25, o17, o18, o19, o20);
		gen25_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o22, o23, o24, o25, o17, o18, o19, o20, o21);
		gen25_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o23, o24, o25, o17, o18, o19, o20, o21, o22);
		gen25_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o24, o25, o17, o18, o19, o20, o21, o22, o23);
		gen25_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o25, o17, o18, o19, o20, o21, o22, o23, o24);
	}

	private static final void gen25_17(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25){
		gen25_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen25_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o19, o20, o21, o22, o23, o24, o25, o18);
		gen25_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o20, o21, o22, o23, o24, o25, o18, o19);
		gen25_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o21, o22, o23, o24, o25, o18, o19, o20);
		gen25_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o22, o23, o24, o25, o18, o19, o20, o21);
		gen25_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o23, o24, o25, o18, o19, o20, o21, o22);
		gen25_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o24, o25, o18, o19, o20, o21, o22, o23);
		gen25_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o25, o18, o19, o20, o21, o22, o23, o24);
	}

	private static final void gen25_18(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25){
		gen25_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen25_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o20, o21, o22, o23, o24, o25, o19);
		gen25_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o21, o22, o23, o24, o25, o19, o20);
		gen25_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o22, o23, o24, o25, o19, o20, o21);
		gen25_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o23, o24, o25, o19, o20, o21, o22);
		gen25_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o24, o25, o19, o20, o21, o22, o23);
		gen25_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o25, o19, o20, o21, o22, o23, o24);
	}

	private static final void gen25_19(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25){
		gen25_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen25_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o21, o22, o23, o24, o25, o20);
		gen25_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o22, o23, o24, o25, o20, o21);
		gen25_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o23, o24, o25, o20, o21, o22);
		gen25_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o24, o25, o20, o21, o22, o23);
		gen25_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o25, o20, o21, o22, o23, o24);
	}

	private static final void gen25_20(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25){
		gen25_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen25_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o22, o23, o24, o25, o21);
		gen25_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o23, o24, o25, o21, o22);
		gen25_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o24, o25, o21, o22, o23);
		gen25_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o25, o21, o22, o23, o24);
	}

	private static final void gen25_21(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25){
		gen25_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen25_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o23, o24, o25, o22);
		gen25_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o24, o25, o22, o23);
		gen25_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o25, o22, o23, o24);
	}

	private static final void gen25_22(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25){
		gen25_23(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen25_23(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o24, o25, o23);
		gen25_23(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o25, o23, o24);
	}

	private static final void gen25_23(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25){
		pr.recieve25(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		pr.recieve25(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o25, o24);
	}

	private static final void gen26_0(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26){
		gen26_1(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen26_1(pr,o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o1);
		gen26_1(pr,o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o1, o2);
		gen26_1(pr,o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o1, o2, o3);
		gen26_1(pr,o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o1, o2, o3, o4);
		gen26_1(pr,o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o1, o2, o3, o4, o5);
		gen26_1(pr,o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o1, o2, o3, o4, o5, o6);
		gen26_1(pr,o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o1, o2, o3, o4, o5, o6, o7);
		gen26_1(pr,o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o1, o2, o3, o4, o5, o6, o7, o8);
		gen26_1(pr,o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o1, o2, o3, o4, o5, o6, o7, o8, o9);
		gen26_1(pr,o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen26_1(pr,o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen26_1(pr,o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen26_1(pr,o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen26_1(pr,o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen26_1(pr,o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen26_1(pr,o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen26_1(pr,o18, o19, o20, o21, o22, o23, o24, o25, o26, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen26_1(pr,o19, o20, o21, o22, o23, o24, o25, o26, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen26_1(pr,o20, o21, o22, o23, o24, o25, o26, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen26_1(pr,o21, o22, o23, o24, o25, o26, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen26_1(pr,o22, o23, o24, o25, o26, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen26_1(pr,o23, o24, o25, o26, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen26_1(pr,o24, o25, o26, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen26_1(pr,o25, o26, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen26_1(pr,o26, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
	}

	private static final void gen26_1(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26){
		gen26_2(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen26_2(pr,o1, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o2);
		gen26_2(pr,o1, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o2, o3);
		gen26_2(pr,o1, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o2, o3, o4);
		gen26_2(pr,o1, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o2, o3, o4, o5);
		gen26_2(pr,o1, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o2, o3, o4, o5, o6);
		gen26_2(pr,o1, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o2, o3, o4, o5, o6, o7);
		gen26_2(pr,o1, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o2, o3, o4, o5, o6, o7, o8);
		gen26_2(pr,o1, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o2, o3, o4, o5, o6, o7, o8, o9);
		gen26_2(pr,o1, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen26_2(pr,o1, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen26_2(pr,o1, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen26_2(pr,o1, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen26_2(pr,o1, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen26_2(pr,o1, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen26_2(pr,o1, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen26_2(pr,o1, o18, o19, o20, o21, o22, o23, o24, o25, o26, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen26_2(pr,o1, o19, o20, o21, o22, o23, o24, o25, o26, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen26_2(pr,o1, o20, o21, o22, o23, o24, o25, o26, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen26_2(pr,o1, o21, o22, o23, o24, o25, o26, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen26_2(pr,o1, o22, o23, o24, o25, o26, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen26_2(pr,o1, o23, o24, o25, o26, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen26_2(pr,o1, o24, o25, o26, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen26_2(pr,o1, o25, o26, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen26_2(pr,o1, o26, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
	}

	private static final void gen26_2(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26){
		gen26_3(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen26_3(pr,o1, o2, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o3);
		gen26_3(pr,o1, o2, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o3, o4);
		gen26_3(pr,o1, o2, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o3, o4, o5);
		gen26_3(pr,o1, o2, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o3, o4, o5, o6);
		gen26_3(pr,o1, o2, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o3, o4, o5, o6, o7);
		gen26_3(pr,o1, o2, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o3, o4, o5, o6, o7, o8);
		gen26_3(pr,o1, o2, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o3, o4, o5, o6, o7, o8, o9);
		gen26_3(pr,o1, o2, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o3, o4, o5, o6, o7, o8, o9, o10);
		gen26_3(pr,o1, o2, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen26_3(pr,o1, o2, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen26_3(pr,o1, o2, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen26_3(pr,o1, o2, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen26_3(pr,o1, o2, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen26_3(pr,o1, o2, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen26_3(pr,o1, o2, o18, o19, o20, o21, o22, o23, o24, o25, o26, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen26_3(pr,o1, o2, o19, o20, o21, o22, o23, o24, o25, o26, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen26_3(pr,o1, o2, o20, o21, o22, o23, o24, o25, o26, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen26_3(pr,o1, o2, o21, o22, o23, o24, o25, o26, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen26_3(pr,o1, o2, o22, o23, o24, o25, o26, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen26_3(pr,o1, o2, o23, o24, o25, o26, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen26_3(pr,o1, o2, o24, o25, o26, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen26_3(pr,o1, o2, o25, o26, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen26_3(pr,o1, o2, o26, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
	}

	private static final void gen26_3(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26){
		gen26_4(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen26_4(pr,o1, o2, o3, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o4);
		gen26_4(pr,o1, o2, o3, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o4, o5);
		gen26_4(pr,o1, o2, o3, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o4, o5, o6);
		gen26_4(pr,o1, o2, o3, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o4, o5, o6, o7);
		gen26_4(pr,o1, o2, o3, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o4, o5, o6, o7, o8);
		gen26_4(pr,o1, o2, o3, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o4, o5, o6, o7, o8, o9);
		gen26_4(pr,o1, o2, o3, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o4, o5, o6, o7, o8, o9, o10);
		gen26_4(pr,o1, o2, o3, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o4, o5, o6, o7, o8, o9, o10, o11);
		gen26_4(pr,o1, o2, o3, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen26_4(pr,o1, o2, o3, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen26_4(pr,o1, o2, o3, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen26_4(pr,o1, o2, o3, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen26_4(pr,o1, o2, o3, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen26_4(pr,o1, o2, o3, o18, o19, o20, o21, o22, o23, o24, o25, o26, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen26_4(pr,o1, o2, o3, o19, o20, o21, o22, o23, o24, o25, o26, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen26_4(pr,o1, o2, o3, o20, o21, o22, o23, o24, o25, o26, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen26_4(pr,o1, o2, o3, o21, o22, o23, o24, o25, o26, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen26_4(pr,o1, o2, o3, o22, o23, o24, o25, o26, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen26_4(pr,o1, o2, o3, o23, o24, o25, o26, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen26_4(pr,o1, o2, o3, o24, o25, o26, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen26_4(pr,o1, o2, o3, o25, o26, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen26_4(pr,o1, o2, o3, o26, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
	}

	private static final void gen26_4(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26){
		gen26_5(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen26_5(pr,o1, o2, o3, o4, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o5);
		gen26_5(pr,o1, o2, o3, o4, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o5, o6);
		gen26_5(pr,o1, o2, o3, o4, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o5, o6, o7);
		gen26_5(pr,o1, o2, o3, o4, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o5, o6, o7, o8);
		gen26_5(pr,o1, o2, o3, o4, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o5, o6, o7, o8, o9);
		gen26_5(pr,o1, o2, o3, o4, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o5, o6, o7, o8, o9, o10);
		gen26_5(pr,o1, o2, o3, o4, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o5, o6, o7, o8, o9, o10, o11);
		gen26_5(pr,o1, o2, o3, o4, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o5, o6, o7, o8, o9, o10, o11, o12);
		gen26_5(pr,o1, o2, o3, o4, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen26_5(pr,o1, o2, o3, o4, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen26_5(pr,o1, o2, o3, o4, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen26_5(pr,o1, o2, o3, o4, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen26_5(pr,o1, o2, o3, o4, o18, o19, o20, o21, o22, o23, o24, o25, o26, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen26_5(pr,o1, o2, o3, o4, o19, o20, o21, o22, o23, o24, o25, o26, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen26_5(pr,o1, o2, o3, o4, o20, o21, o22, o23, o24, o25, o26, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen26_5(pr,o1, o2, o3, o4, o21, o22, o23, o24, o25, o26, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen26_5(pr,o1, o2, o3, o4, o22, o23, o24, o25, o26, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen26_5(pr,o1, o2, o3, o4, o23, o24, o25, o26, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen26_5(pr,o1, o2, o3, o4, o24, o25, o26, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen26_5(pr,o1, o2, o3, o4, o25, o26, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen26_5(pr,o1, o2, o3, o4, o26, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
	}

	private static final void gen26_5(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26){
		gen26_6(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen26_6(pr,o1, o2, o3, o4, o5, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o6);
		gen26_6(pr,o1, o2, o3, o4, o5, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o6, o7);
		gen26_6(pr,o1, o2, o3, o4, o5, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o6, o7, o8);
		gen26_6(pr,o1, o2, o3, o4, o5, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o6, o7, o8, o9);
		gen26_6(pr,o1, o2, o3, o4, o5, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o6, o7, o8, o9, o10);
		gen26_6(pr,o1, o2, o3, o4, o5, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o6, o7, o8, o9, o10, o11);
		gen26_6(pr,o1, o2, o3, o4, o5, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o6, o7, o8, o9, o10, o11, o12);
		gen26_6(pr,o1, o2, o3, o4, o5, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o6, o7, o8, o9, o10, o11, o12, o13);
		gen26_6(pr,o1, o2, o3, o4, o5, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen26_6(pr,o1, o2, o3, o4, o5, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen26_6(pr,o1, o2, o3, o4, o5, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen26_6(pr,o1, o2, o3, o4, o5, o18, o19, o20, o21, o22, o23, o24, o25, o26, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen26_6(pr,o1, o2, o3, o4, o5, o19, o20, o21, o22, o23, o24, o25, o26, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen26_6(pr,o1, o2, o3, o4, o5, o20, o21, o22, o23, o24, o25, o26, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen26_6(pr,o1, o2, o3, o4, o5, o21, o22, o23, o24, o25, o26, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen26_6(pr,o1, o2, o3, o4, o5, o22, o23, o24, o25, o26, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen26_6(pr,o1, o2, o3, o4, o5, o23, o24, o25, o26, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen26_6(pr,o1, o2, o3, o4, o5, o24, o25, o26, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen26_6(pr,o1, o2, o3, o4, o5, o25, o26, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen26_6(pr,o1, o2, o3, o4, o5, o26, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
	}

	private static final void gen26_6(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26){
		gen26_7(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen26_7(pr,o1, o2, o3, o4, o5, o6, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o7);
		gen26_7(pr,o1, o2, o3, o4, o5, o6, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o7, o8);
		gen26_7(pr,o1, o2, o3, o4, o5, o6, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o7, o8, o9);
		gen26_7(pr,o1, o2, o3, o4, o5, o6, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o7, o8, o9, o10);
		gen26_7(pr,o1, o2, o3, o4, o5, o6, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o7, o8, o9, o10, o11);
		gen26_7(pr,o1, o2, o3, o4, o5, o6, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o7, o8, o9, o10, o11, o12);
		gen26_7(pr,o1, o2, o3, o4, o5, o6, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o7, o8, o9, o10, o11, o12, o13);
		gen26_7(pr,o1, o2, o3, o4, o5, o6, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o7, o8, o9, o10, o11, o12, o13, o14);
		gen26_7(pr,o1, o2, o3, o4, o5, o6, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen26_7(pr,o1, o2, o3, o4, o5, o6, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen26_7(pr,o1, o2, o3, o4, o5, o6, o18, o19, o20, o21, o22, o23, o24, o25, o26, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen26_7(pr,o1, o2, o3, o4, o5, o6, o19, o20, o21, o22, o23, o24, o25, o26, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen26_7(pr,o1, o2, o3, o4, o5, o6, o20, o21, o22, o23, o24, o25, o26, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen26_7(pr,o1, o2, o3, o4, o5, o6, o21, o22, o23, o24, o25, o26, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen26_7(pr,o1, o2, o3, o4, o5, o6, o22, o23, o24, o25, o26, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen26_7(pr,o1, o2, o3, o4, o5, o6, o23, o24, o25, o26, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen26_7(pr,o1, o2, o3, o4, o5, o6, o24, o25, o26, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen26_7(pr,o1, o2, o3, o4, o5, o6, o25, o26, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen26_7(pr,o1, o2, o3, o4, o5, o6, o26, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
	}

	private static final void gen26_7(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26){
		gen26_8(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen26_8(pr,o1, o2, o3, o4, o5, o6, o7, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o8);
		gen26_8(pr,o1, o2, o3, o4, o5, o6, o7, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o8, o9);
		gen26_8(pr,o1, o2, o3, o4, o5, o6, o7, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o8, o9, o10);
		gen26_8(pr,o1, o2, o3, o4, o5, o6, o7, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o8, o9, o10, o11);
		gen26_8(pr,o1, o2, o3, o4, o5, o6, o7, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o8, o9, o10, o11, o12);
		gen26_8(pr,o1, o2, o3, o4, o5, o6, o7, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o8, o9, o10, o11, o12, o13);
		gen26_8(pr,o1, o2, o3, o4, o5, o6, o7, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o8, o9, o10, o11, o12, o13, o14);
		gen26_8(pr,o1, o2, o3, o4, o5, o6, o7, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o8, o9, o10, o11, o12, o13, o14, o15);
		gen26_8(pr,o1, o2, o3, o4, o5, o6, o7, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen26_8(pr,o1, o2, o3, o4, o5, o6, o7, o18, o19, o20, o21, o22, o23, o24, o25, o26, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen26_8(pr,o1, o2, o3, o4, o5, o6, o7, o19, o20, o21, o22, o23, o24, o25, o26, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen26_8(pr,o1, o2, o3, o4, o5, o6, o7, o20, o21, o22, o23, o24, o25, o26, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen26_8(pr,o1, o2, o3, o4, o5, o6, o7, o21, o22, o23, o24, o25, o26, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen26_8(pr,o1, o2, o3, o4, o5, o6, o7, o22, o23, o24, o25, o26, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen26_8(pr,o1, o2, o3, o4, o5, o6, o7, o23, o24, o25, o26, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen26_8(pr,o1, o2, o3, o4, o5, o6, o7, o24, o25, o26, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen26_8(pr,o1, o2, o3, o4, o5, o6, o7, o25, o26, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen26_8(pr,o1, o2, o3, o4, o5, o6, o7, o26, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
	}

	private static final void gen26_8(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26){
		gen26_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen26_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o9);
		gen26_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o9, o10);
		gen26_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o9, o10, o11);
		gen26_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o9, o10, o11, o12);
		gen26_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o9, o10, o11, o12, o13);
		gen26_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o9, o10, o11, o12, o13, o14);
		gen26_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o9, o10, o11, o12, o13, o14, o15);
		gen26_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o9, o10, o11, o12, o13, o14, o15, o16);
		gen26_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o18, o19, o20, o21, o22, o23, o24, o25, o26, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen26_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o19, o20, o21, o22, o23, o24, o25, o26, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen26_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o20, o21, o22, o23, o24, o25, o26, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen26_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o21, o22, o23, o24, o25, o26, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen26_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o22, o23, o24, o25, o26, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen26_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o23, o24, o25, o26, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen26_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o24, o25, o26, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen26_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o25, o26, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen26_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o26, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
	}

	private static final void gen26_9(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26){
		gen26_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen26_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o10);
		gen26_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o10, o11);
		gen26_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o10, o11, o12);
		gen26_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o10, o11, o12, o13);
		gen26_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o10, o11, o12, o13, o14);
		gen26_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o10, o11, o12, o13, o14, o15);
		gen26_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o10, o11, o12, o13, o14, o15, o16);
		gen26_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o18, o19, o20, o21, o22, o23, o24, o25, o26, o10, o11, o12, o13, o14, o15, o16, o17);
		gen26_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o19, o20, o21, o22, o23, o24, o25, o26, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen26_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o20, o21, o22, o23, o24, o25, o26, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen26_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o21, o22, o23, o24, o25, o26, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen26_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o22, o23, o24, o25, o26, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen26_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o23, o24, o25, o26, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen26_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o24, o25, o26, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen26_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o25, o26, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen26_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o26, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
	}

	private static final void gen26_10(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26){
		gen26_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen26_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o11);
		gen26_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o11, o12);
		gen26_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o11, o12, o13);
		gen26_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o11, o12, o13, o14);
		gen26_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o11, o12, o13, o14, o15);
		gen26_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o11, o12, o13, o14, o15, o16);
		gen26_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o18, o19, o20, o21, o22, o23, o24, o25, o26, o11, o12, o13, o14, o15, o16, o17);
		gen26_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o19, o20, o21, o22, o23, o24, o25, o26, o11, o12, o13, o14, o15, o16, o17, o18);
		gen26_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o20, o21, o22, o23, o24, o25, o26, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen26_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o21, o22, o23, o24, o25, o26, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen26_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o22, o23, o24, o25, o26, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen26_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o23, o24, o25, o26, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen26_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o24, o25, o26, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen26_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o25, o26, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen26_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o26, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
	}

	private static final void gen26_11(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26){
		gen26_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen26_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o12);
		gen26_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o12, o13);
		gen26_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o12, o13, o14);
		gen26_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o12, o13, o14, o15);
		gen26_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o12, o13, o14, o15, o16);
		gen26_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o18, o19, o20, o21, o22, o23, o24, o25, o26, o12, o13, o14, o15, o16, o17);
		gen26_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o19, o20, o21, o22, o23, o24, o25, o26, o12, o13, o14, o15, o16, o17, o18);
		gen26_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o20, o21, o22, o23, o24, o25, o26, o12, o13, o14, o15, o16, o17, o18, o19);
		gen26_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o21, o22, o23, o24, o25, o26, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen26_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o22, o23, o24, o25, o26, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen26_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o23, o24, o25, o26, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen26_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o24, o25, o26, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen26_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o25, o26, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen26_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o26, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
	}

	private static final void gen26_12(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26){
		gen26_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen26_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o13);
		gen26_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o13, o14);
		gen26_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o13, o14, o15);
		gen26_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o13, o14, o15, o16);
		gen26_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o18, o19, o20, o21, o22, o23, o24, o25, o26, o13, o14, o15, o16, o17);
		gen26_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o19, o20, o21, o22, o23, o24, o25, o26, o13, o14, o15, o16, o17, o18);
		gen26_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o20, o21, o22, o23, o24, o25, o26, o13, o14, o15, o16, o17, o18, o19);
		gen26_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o21, o22, o23, o24, o25, o26, o13, o14, o15, o16, o17, o18, o19, o20);
		gen26_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o22, o23, o24, o25, o26, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen26_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o23, o24, o25, o26, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen26_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o24, o25, o26, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen26_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o25, o26, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen26_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o26, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
	}

	private static final void gen26_13(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26){
		gen26_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen26_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o14);
		gen26_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o14, o15);
		gen26_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o14, o15, o16);
		gen26_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o18, o19, o20, o21, o22, o23, o24, o25, o26, o14, o15, o16, o17);
		gen26_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o19, o20, o21, o22, o23, o24, o25, o26, o14, o15, o16, o17, o18);
		gen26_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o20, o21, o22, o23, o24, o25, o26, o14, o15, o16, o17, o18, o19);
		gen26_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o21, o22, o23, o24, o25, o26, o14, o15, o16, o17, o18, o19, o20);
		gen26_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o22, o23, o24, o25, o26, o14, o15, o16, o17, o18, o19, o20, o21);
		gen26_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o23, o24, o25, o26, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen26_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o24, o25, o26, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen26_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o25, o26, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen26_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o26, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
	}

	private static final void gen26_14(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26){
		gen26_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen26_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o15);
		gen26_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o15, o16);
		gen26_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o18, o19, o20, o21, o22, o23, o24, o25, o26, o15, o16, o17);
		gen26_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o19, o20, o21, o22, o23, o24, o25, o26, o15, o16, o17, o18);
		gen26_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o20, o21, o22, o23, o24, o25, o26, o15, o16, o17, o18, o19);
		gen26_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o21, o22, o23, o24, o25, o26, o15, o16, o17, o18, o19, o20);
		gen26_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o22, o23, o24, o25, o26, o15, o16, o17, o18, o19, o20, o21);
		gen26_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o23, o24, o25, o26, o15, o16, o17, o18, o19, o20, o21, o22);
		gen26_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o24, o25, o26, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen26_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o25, o26, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen26_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o26, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
	}

	private static final void gen26_15(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26){
		gen26_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen26_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o16);
		gen26_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o18, o19, o20, o21, o22, o23, o24, o25, o26, o16, o17);
		gen26_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o19, o20, o21, o22, o23, o24, o25, o26, o16, o17, o18);
		gen26_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o20, o21, o22, o23, o24, o25, o26, o16, o17, o18, o19);
		gen26_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o21, o22, o23, o24, o25, o26, o16, o17, o18, o19, o20);
		gen26_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o22, o23, o24, o25, o26, o16, o17, o18, o19, o20, o21);
		gen26_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o23, o24, o25, o26, o16, o17, o18, o19, o20, o21, o22);
		gen26_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o24, o25, o26, o16, o17, o18, o19, o20, o21, o22, o23);
		gen26_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o25, o26, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen26_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o26, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
	}

	private static final void gen26_16(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26){
		gen26_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen26_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o18, o19, o20, o21, o22, o23, o24, o25, o26, o17);
		gen26_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o19, o20, o21, o22, o23, o24, o25, o26, o17, o18);
		gen26_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o20, o21, o22, o23, o24, o25, o26, o17, o18, o19);
		gen26_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o21, o22, o23, o24, o25, o26, o17, o18, o19, o20);
		gen26_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o22, o23, o24, o25, o26, o17, o18, o19, o20, o21);
		gen26_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o23, o24, o25, o26, o17, o18, o19, o20, o21, o22);
		gen26_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o24, o25, o26, o17, o18, o19, o20, o21, o22, o23);
		gen26_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o25, o26, o17, o18, o19, o20, o21, o22, o23, o24);
		gen26_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o26, o17, o18, o19, o20, o21, o22, o23, o24, o25);
	}

	private static final void gen26_17(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26){
		gen26_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen26_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o19, o20, o21, o22, o23, o24, o25, o26, o18);
		gen26_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o20, o21, o22, o23, o24, o25, o26, o18, o19);
		gen26_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o21, o22, o23, o24, o25, o26, o18, o19, o20);
		gen26_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o22, o23, o24, o25, o26, o18, o19, o20, o21);
		gen26_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o23, o24, o25, o26, o18, o19, o20, o21, o22);
		gen26_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o24, o25, o26, o18, o19, o20, o21, o22, o23);
		gen26_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o25, o26, o18, o19, o20, o21, o22, o23, o24);
		gen26_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o26, o18, o19, o20, o21, o22, o23, o24, o25);
	}

	private static final void gen26_18(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26){
		gen26_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen26_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o20, o21, o22, o23, o24, o25, o26, o19);
		gen26_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o21, o22, o23, o24, o25, o26, o19, o20);
		gen26_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o22, o23, o24, o25, o26, o19, o20, o21);
		gen26_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o23, o24, o25, o26, o19, o20, o21, o22);
		gen26_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o24, o25, o26, o19, o20, o21, o22, o23);
		gen26_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o25, o26, o19, o20, o21, o22, o23, o24);
		gen26_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o26, o19, o20, o21, o22, o23, o24, o25);
	}

	private static final void gen26_19(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26){
		gen26_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen26_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o21, o22, o23, o24, o25, o26, o20);
		gen26_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o22, o23, o24, o25, o26, o20, o21);
		gen26_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o23, o24, o25, o26, o20, o21, o22);
		gen26_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o24, o25, o26, o20, o21, o22, o23);
		gen26_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o25, o26, o20, o21, o22, o23, o24);
		gen26_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o26, o20, o21, o22, o23, o24, o25);
	}

	private static final void gen26_20(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26){
		gen26_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen26_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o22, o23, o24, o25, o26, o21);
		gen26_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o23, o24, o25, o26, o21, o22);
		gen26_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o24, o25, o26, o21, o22, o23);
		gen26_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o25, o26, o21, o22, o23, o24);
		gen26_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o26, o21, o22, o23, o24, o25);
	}

	private static final void gen26_21(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26){
		gen26_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen26_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o23, o24, o25, o26, o22);
		gen26_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o24, o25, o26, o22, o23);
		gen26_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o25, o26, o22, o23, o24);
		gen26_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o26, o22, o23, o24, o25);
	}

	private static final void gen26_22(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26){
		gen26_23(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen26_23(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o24, o25, o26, o23);
		gen26_23(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o25, o26, o23, o24);
		gen26_23(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o26, o23, o24, o25);
	}

	private static final void gen26_23(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26){
		gen26_24(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen26_24(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o25, o26, o24);
		gen26_24(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o26, o24, o25);
	}

	private static final void gen26_24(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26){
		pr.recieve26(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		pr.recieve26(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o26, o25);
	}

	private static final void gen27_0(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27){
		gen27_1(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen27_1(pr,o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o1);
		gen27_1(pr,o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o1, o2);
		gen27_1(pr,o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o1, o2, o3);
		gen27_1(pr,o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o1, o2, o3, o4);
		gen27_1(pr,o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o1, o2, o3, o4, o5);
		gen27_1(pr,o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o1, o2, o3, o4, o5, o6);
		gen27_1(pr,o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o1, o2, o3, o4, o5, o6, o7);
		gen27_1(pr,o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o1, o2, o3, o4, o5, o6, o7, o8);
		gen27_1(pr,o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o1, o2, o3, o4, o5, o6, o7, o8, o9);
		gen27_1(pr,o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen27_1(pr,o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen27_1(pr,o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen27_1(pr,o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen27_1(pr,o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen27_1(pr,o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen27_1(pr,o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen27_1(pr,o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen27_1(pr,o19, o20, o21, o22, o23, o24, o25, o26, o27, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen27_1(pr,o20, o21, o22, o23, o24, o25, o26, o27, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen27_1(pr,o21, o22, o23, o24, o25, o26, o27, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen27_1(pr,o22, o23, o24, o25, o26, o27, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen27_1(pr,o23, o24, o25, o26, o27, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen27_1(pr,o24, o25, o26, o27, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen27_1(pr,o25, o26, o27, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen27_1(pr,o26, o27, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen27_1(pr,o27, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
	}

	private static final void gen27_1(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27){
		gen27_2(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen27_2(pr,o1, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o2);
		gen27_2(pr,o1, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o2, o3);
		gen27_2(pr,o1, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o2, o3, o4);
		gen27_2(pr,o1, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o2, o3, o4, o5);
		gen27_2(pr,o1, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o2, o3, o4, o5, o6);
		gen27_2(pr,o1, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o2, o3, o4, o5, o6, o7);
		gen27_2(pr,o1, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o2, o3, o4, o5, o6, o7, o8);
		gen27_2(pr,o1, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o2, o3, o4, o5, o6, o7, o8, o9);
		gen27_2(pr,o1, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen27_2(pr,o1, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen27_2(pr,o1, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen27_2(pr,o1, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen27_2(pr,o1, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen27_2(pr,o1, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen27_2(pr,o1, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen27_2(pr,o1, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen27_2(pr,o1, o19, o20, o21, o22, o23, o24, o25, o26, o27, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen27_2(pr,o1, o20, o21, o22, o23, o24, o25, o26, o27, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen27_2(pr,o1, o21, o22, o23, o24, o25, o26, o27, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen27_2(pr,o1, o22, o23, o24, o25, o26, o27, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen27_2(pr,o1, o23, o24, o25, o26, o27, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen27_2(pr,o1, o24, o25, o26, o27, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen27_2(pr,o1, o25, o26, o27, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen27_2(pr,o1, o26, o27, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen27_2(pr,o1, o27, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
	}

	private static final void gen27_2(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27){
		gen27_3(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen27_3(pr,o1, o2, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o3);
		gen27_3(pr,o1, o2, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o3, o4);
		gen27_3(pr,o1, o2, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o3, o4, o5);
		gen27_3(pr,o1, o2, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o3, o4, o5, o6);
		gen27_3(pr,o1, o2, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o3, o4, o5, o6, o7);
		gen27_3(pr,o1, o2, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o3, o4, o5, o6, o7, o8);
		gen27_3(pr,o1, o2, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o3, o4, o5, o6, o7, o8, o9);
		gen27_3(pr,o1, o2, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o3, o4, o5, o6, o7, o8, o9, o10);
		gen27_3(pr,o1, o2, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen27_3(pr,o1, o2, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen27_3(pr,o1, o2, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen27_3(pr,o1, o2, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen27_3(pr,o1, o2, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen27_3(pr,o1, o2, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen27_3(pr,o1, o2, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen27_3(pr,o1, o2, o19, o20, o21, o22, o23, o24, o25, o26, o27, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen27_3(pr,o1, o2, o20, o21, o22, o23, o24, o25, o26, o27, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen27_3(pr,o1, o2, o21, o22, o23, o24, o25, o26, o27, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen27_3(pr,o1, o2, o22, o23, o24, o25, o26, o27, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen27_3(pr,o1, o2, o23, o24, o25, o26, o27, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen27_3(pr,o1, o2, o24, o25, o26, o27, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen27_3(pr,o1, o2, o25, o26, o27, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen27_3(pr,o1, o2, o26, o27, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen27_3(pr,o1, o2, o27, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
	}

	private static final void gen27_3(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27){
		gen27_4(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen27_4(pr,o1, o2, o3, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o4);
		gen27_4(pr,o1, o2, o3, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o4, o5);
		gen27_4(pr,o1, o2, o3, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o4, o5, o6);
		gen27_4(pr,o1, o2, o3, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o4, o5, o6, o7);
		gen27_4(pr,o1, o2, o3, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o4, o5, o6, o7, o8);
		gen27_4(pr,o1, o2, o3, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o4, o5, o6, o7, o8, o9);
		gen27_4(pr,o1, o2, o3, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o4, o5, o6, o7, o8, o9, o10);
		gen27_4(pr,o1, o2, o3, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o4, o5, o6, o7, o8, o9, o10, o11);
		gen27_4(pr,o1, o2, o3, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen27_4(pr,o1, o2, o3, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen27_4(pr,o1, o2, o3, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen27_4(pr,o1, o2, o3, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen27_4(pr,o1, o2, o3, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen27_4(pr,o1, o2, o3, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen27_4(pr,o1, o2, o3, o19, o20, o21, o22, o23, o24, o25, o26, o27, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen27_4(pr,o1, o2, o3, o20, o21, o22, o23, o24, o25, o26, o27, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen27_4(pr,o1, o2, o3, o21, o22, o23, o24, o25, o26, o27, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen27_4(pr,o1, o2, o3, o22, o23, o24, o25, o26, o27, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen27_4(pr,o1, o2, o3, o23, o24, o25, o26, o27, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen27_4(pr,o1, o2, o3, o24, o25, o26, o27, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen27_4(pr,o1, o2, o3, o25, o26, o27, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen27_4(pr,o1, o2, o3, o26, o27, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen27_4(pr,o1, o2, o3, o27, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
	}

	private static final void gen27_4(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27){
		gen27_5(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen27_5(pr,o1, o2, o3, o4, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o5);
		gen27_5(pr,o1, o2, o3, o4, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o5, o6);
		gen27_5(pr,o1, o2, o3, o4, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o5, o6, o7);
		gen27_5(pr,o1, o2, o3, o4, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o5, o6, o7, o8);
		gen27_5(pr,o1, o2, o3, o4, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o5, o6, o7, o8, o9);
		gen27_5(pr,o1, o2, o3, o4, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o5, o6, o7, o8, o9, o10);
		gen27_5(pr,o1, o2, o3, o4, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o5, o6, o7, o8, o9, o10, o11);
		gen27_5(pr,o1, o2, o3, o4, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o5, o6, o7, o8, o9, o10, o11, o12);
		gen27_5(pr,o1, o2, o3, o4, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen27_5(pr,o1, o2, o3, o4, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen27_5(pr,o1, o2, o3, o4, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen27_5(pr,o1, o2, o3, o4, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen27_5(pr,o1, o2, o3, o4, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen27_5(pr,o1, o2, o3, o4, o19, o20, o21, o22, o23, o24, o25, o26, o27, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen27_5(pr,o1, o2, o3, o4, o20, o21, o22, o23, o24, o25, o26, o27, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen27_5(pr,o1, o2, o3, o4, o21, o22, o23, o24, o25, o26, o27, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen27_5(pr,o1, o2, o3, o4, o22, o23, o24, o25, o26, o27, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen27_5(pr,o1, o2, o3, o4, o23, o24, o25, o26, o27, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen27_5(pr,o1, o2, o3, o4, o24, o25, o26, o27, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen27_5(pr,o1, o2, o3, o4, o25, o26, o27, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen27_5(pr,o1, o2, o3, o4, o26, o27, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen27_5(pr,o1, o2, o3, o4, o27, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
	}

	private static final void gen27_5(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27){
		gen27_6(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen27_6(pr,o1, o2, o3, o4, o5, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o6);
		gen27_6(pr,o1, o2, o3, o4, o5, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o6, o7);
		gen27_6(pr,o1, o2, o3, o4, o5, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o6, o7, o8);
		gen27_6(pr,o1, o2, o3, o4, o5, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o6, o7, o8, o9);
		gen27_6(pr,o1, o2, o3, o4, o5, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o6, o7, o8, o9, o10);
		gen27_6(pr,o1, o2, o3, o4, o5, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o6, o7, o8, o9, o10, o11);
		gen27_6(pr,o1, o2, o3, o4, o5, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o6, o7, o8, o9, o10, o11, o12);
		gen27_6(pr,o1, o2, o3, o4, o5, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o6, o7, o8, o9, o10, o11, o12, o13);
		gen27_6(pr,o1, o2, o3, o4, o5, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen27_6(pr,o1, o2, o3, o4, o5, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen27_6(pr,o1, o2, o3, o4, o5, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen27_6(pr,o1, o2, o3, o4, o5, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen27_6(pr,o1, o2, o3, o4, o5, o19, o20, o21, o22, o23, o24, o25, o26, o27, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen27_6(pr,o1, o2, o3, o4, o5, o20, o21, o22, o23, o24, o25, o26, o27, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen27_6(pr,o1, o2, o3, o4, o5, o21, o22, o23, o24, o25, o26, o27, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen27_6(pr,o1, o2, o3, o4, o5, o22, o23, o24, o25, o26, o27, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen27_6(pr,o1, o2, o3, o4, o5, o23, o24, o25, o26, o27, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen27_6(pr,o1, o2, o3, o4, o5, o24, o25, o26, o27, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen27_6(pr,o1, o2, o3, o4, o5, o25, o26, o27, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen27_6(pr,o1, o2, o3, o4, o5, o26, o27, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen27_6(pr,o1, o2, o3, o4, o5, o27, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
	}

	private static final void gen27_6(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27){
		gen27_7(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen27_7(pr,o1, o2, o3, o4, o5, o6, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o7);
		gen27_7(pr,o1, o2, o3, o4, o5, o6, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o7, o8);
		gen27_7(pr,o1, o2, o3, o4, o5, o6, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o7, o8, o9);
		gen27_7(pr,o1, o2, o3, o4, o5, o6, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o7, o8, o9, o10);
		gen27_7(pr,o1, o2, o3, o4, o5, o6, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o7, o8, o9, o10, o11);
		gen27_7(pr,o1, o2, o3, o4, o5, o6, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o7, o8, o9, o10, o11, o12);
		gen27_7(pr,o1, o2, o3, o4, o5, o6, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o7, o8, o9, o10, o11, o12, o13);
		gen27_7(pr,o1, o2, o3, o4, o5, o6, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o7, o8, o9, o10, o11, o12, o13, o14);
		gen27_7(pr,o1, o2, o3, o4, o5, o6, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen27_7(pr,o1, o2, o3, o4, o5, o6, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen27_7(pr,o1, o2, o3, o4, o5, o6, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen27_7(pr,o1, o2, o3, o4, o5, o6, o19, o20, o21, o22, o23, o24, o25, o26, o27, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen27_7(pr,o1, o2, o3, o4, o5, o6, o20, o21, o22, o23, o24, o25, o26, o27, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen27_7(pr,o1, o2, o3, o4, o5, o6, o21, o22, o23, o24, o25, o26, o27, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen27_7(pr,o1, o2, o3, o4, o5, o6, o22, o23, o24, o25, o26, o27, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen27_7(pr,o1, o2, o3, o4, o5, o6, o23, o24, o25, o26, o27, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen27_7(pr,o1, o2, o3, o4, o5, o6, o24, o25, o26, o27, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen27_7(pr,o1, o2, o3, o4, o5, o6, o25, o26, o27, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen27_7(pr,o1, o2, o3, o4, o5, o6, o26, o27, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen27_7(pr,o1, o2, o3, o4, o5, o6, o27, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
	}

	private static final void gen27_7(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27){
		gen27_8(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen27_8(pr,o1, o2, o3, o4, o5, o6, o7, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o8);
		gen27_8(pr,o1, o2, o3, o4, o5, o6, o7, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o8, o9);
		gen27_8(pr,o1, o2, o3, o4, o5, o6, o7, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o8, o9, o10);
		gen27_8(pr,o1, o2, o3, o4, o5, o6, o7, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o8, o9, o10, o11);
		gen27_8(pr,o1, o2, o3, o4, o5, o6, o7, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o8, o9, o10, o11, o12);
		gen27_8(pr,o1, o2, o3, o4, o5, o6, o7, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o8, o9, o10, o11, o12, o13);
		gen27_8(pr,o1, o2, o3, o4, o5, o6, o7, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o8, o9, o10, o11, o12, o13, o14);
		gen27_8(pr,o1, o2, o3, o4, o5, o6, o7, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o8, o9, o10, o11, o12, o13, o14, o15);
		gen27_8(pr,o1, o2, o3, o4, o5, o6, o7, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen27_8(pr,o1, o2, o3, o4, o5, o6, o7, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen27_8(pr,o1, o2, o3, o4, o5, o6, o7, o19, o20, o21, o22, o23, o24, o25, o26, o27, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen27_8(pr,o1, o2, o3, o4, o5, o6, o7, o20, o21, o22, o23, o24, o25, o26, o27, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen27_8(pr,o1, o2, o3, o4, o5, o6, o7, o21, o22, o23, o24, o25, o26, o27, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen27_8(pr,o1, o2, o3, o4, o5, o6, o7, o22, o23, o24, o25, o26, o27, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen27_8(pr,o1, o2, o3, o4, o5, o6, o7, o23, o24, o25, o26, o27, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen27_8(pr,o1, o2, o3, o4, o5, o6, o7, o24, o25, o26, o27, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen27_8(pr,o1, o2, o3, o4, o5, o6, o7, o25, o26, o27, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen27_8(pr,o1, o2, o3, o4, o5, o6, o7, o26, o27, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen27_8(pr,o1, o2, o3, o4, o5, o6, o7, o27, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
	}

	private static final void gen27_8(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27){
		gen27_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen27_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o9);
		gen27_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o9, o10);
		gen27_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o9, o10, o11);
		gen27_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o9, o10, o11, o12);
		gen27_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o9, o10, o11, o12, o13);
		gen27_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o9, o10, o11, o12, o13, o14);
		gen27_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o9, o10, o11, o12, o13, o14, o15);
		gen27_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o9, o10, o11, o12, o13, o14, o15, o16);
		gen27_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen27_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o19, o20, o21, o22, o23, o24, o25, o26, o27, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen27_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o20, o21, o22, o23, o24, o25, o26, o27, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen27_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o21, o22, o23, o24, o25, o26, o27, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen27_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o22, o23, o24, o25, o26, o27, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen27_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o23, o24, o25, o26, o27, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen27_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o24, o25, o26, o27, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen27_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o25, o26, o27, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen27_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o26, o27, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen27_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o27, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
	}

	private static final void gen27_9(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27){
		gen27_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen27_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o10);
		gen27_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o10, o11);
		gen27_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o10, o11, o12);
		gen27_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o10, o11, o12, o13);
		gen27_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o10, o11, o12, o13, o14);
		gen27_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o10, o11, o12, o13, o14, o15);
		gen27_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o10, o11, o12, o13, o14, o15, o16);
		gen27_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o10, o11, o12, o13, o14, o15, o16, o17);
		gen27_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o19, o20, o21, o22, o23, o24, o25, o26, o27, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen27_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o20, o21, o22, o23, o24, o25, o26, o27, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen27_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o21, o22, o23, o24, o25, o26, o27, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen27_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o22, o23, o24, o25, o26, o27, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen27_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o23, o24, o25, o26, o27, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen27_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o24, o25, o26, o27, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen27_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o25, o26, o27, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen27_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o26, o27, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen27_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o27, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
	}

	private static final void gen27_10(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27){
		gen27_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen27_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o11);
		gen27_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o11, o12);
		gen27_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o11, o12, o13);
		gen27_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o11, o12, o13, o14);
		gen27_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o11, o12, o13, o14, o15);
		gen27_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o11, o12, o13, o14, o15, o16);
		gen27_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o11, o12, o13, o14, o15, o16, o17);
		gen27_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o19, o20, o21, o22, o23, o24, o25, o26, o27, o11, o12, o13, o14, o15, o16, o17, o18);
		gen27_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o20, o21, o22, o23, o24, o25, o26, o27, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen27_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o21, o22, o23, o24, o25, o26, o27, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen27_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o22, o23, o24, o25, o26, o27, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen27_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o23, o24, o25, o26, o27, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen27_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o24, o25, o26, o27, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen27_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o25, o26, o27, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen27_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o26, o27, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen27_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o27, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
	}

	private static final void gen27_11(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27){
		gen27_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen27_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o12);
		gen27_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o12, o13);
		gen27_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o12, o13, o14);
		gen27_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o12, o13, o14, o15);
		gen27_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o12, o13, o14, o15, o16);
		gen27_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o12, o13, o14, o15, o16, o17);
		gen27_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o19, o20, o21, o22, o23, o24, o25, o26, o27, o12, o13, o14, o15, o16, o17, o18);
		gen27_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o20, o21, o22, o23, o24, o25, o26, o27, o12, o13, o14, o15, o16, o17, o18, o19);
		gen27_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o21, o22, o23, o24, o25, o26, o27, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen27_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o22, o23, o24, o25, o26, o27, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen27_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o23, o24, o25, o26, o27, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen27_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o24, o25, o26, o27, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen27_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o25, o26, o27, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen27_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o26, o27, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen27_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o27, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
	}

	private static final void gen27_12(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27){
		gen27_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen27_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o13);
		gen27_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o13, o14);
		gen27_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o13, o14, o15);
		gen27_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o13, o14, o15, o16);
		gen27_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o13, o14, o15, o16, o17);
		gen27_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o19, o20, o21, o22, o23, o24, o25, o26, o27, o13, o14, o15, o16, o17, o18);
		gen27_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o20, o21, o22, o23, o24, o25, o26, o27, o13, o14, o15, o16, o17, o18, o19);
		gen27_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o21, o22, o23, o24, o25, o26, o27, o13, o14, o15, o16, o17, o18, o19, o20);
		gen27_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o22, o23, o24, o25, o26, o27, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen27_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o23, o24, o25, o26, o27, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen27_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o24, o25, o26, o27, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen27_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o25, o26, o27, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen27_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o26, o27, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen27_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o27, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
	}

	private static final void gen27_13(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27){
		gen27_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen27_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o14);
		gen27_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o14, o15);
		gen27_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o14, o15, o16);
		gen27_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o14, o15, o16, o17);
		gen27_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o19, o20, o21, o22, o23, o24, o25, o26, o27, o14, o15, o16, o17, o18);
		gen27_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o20, o21, o22, o23, o24, o25, o26, o27, o14, o15, o16, o17, o18, o19);
		gen27_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o21, o22, o23, o24, o25, o26, o27, o14, o15, o16, o17, o18, o19, o20);
		gen27_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o22, o23, o24, o25, o26, o27, o14, o15, o16, o17, o18, o19, o20, o21);
		gen27_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o23, o24, o25, o26, o27, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen27_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o24, o25, o26, o27, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen27_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o25, o26, o27, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen27_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o26, o27, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen27_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o27, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
	}

	private static final void gen27_14(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27){
		gen27_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen27_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o15);
		gen27_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o15, o16);
		gen27_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o15, o16, o17);
		gen27_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o19, o20, o21, o22, o23, o24, o25, o26, o27, o15, o16, o17, o18);
		gen27_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o20, o21, o22, o23, o24, o25, o26, o27, o15, o16, o17, o18, o19);
		gen27_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o21, o22, o23, o24, o25, o26, o27, o15, o16, o17, o18, o19, o20);
		gen27_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o22, o23, o24, o25, o26, o27, o15, o16, o17, o18, o19, o20, o21);
		gen27_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o23, o24, o25, o26, o27, o15, o16, o17, o18, o19, o20, o21, o22);
		gen27_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o24, o25, o26, o27, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen27_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o25, o26, o27, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen27_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o26, o27, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen27_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o27, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
	}

	private static final void gen27_15(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27){
		gen27_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen27_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o16);
		gen27_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o16, o17);
		gen27_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o19, o20, o21, o22, o23, o24, o25, o26, o27, o16, o17, o18);
		gen27_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o20, o21, o22, o23, o24, o25, o26, o27, o16, o17, o18, o19);
		gen27_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o21, o22, o23, o24, o25, o26, o27, o16, o17, o18, o19, o20);
		gen27_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o22, o23, o24, o25, o26, o27, o16, o17, o18, o19, o20, o21);
		gen27_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o23, o24, o25, o26, o27, o16, o17, o18, o19, o20, o21, o22);
		gen27_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o24, o25, o26, o27, o16, o17, o18, o19, o20, o21, o22, o23);
		gen27_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o25, o26, o27, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen27_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o26, o27, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen27_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o27, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
	}

	private static final void gen27_16(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27){
		gen27_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen27_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o17);
		gen27_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o19, o20, o21, o22, o23, o24, o25, o26, o27, o17, o18);
		gen27_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o20, o21, o22, o23, o24, o25, o26, o27, o17, o18, o19);
		gen27_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o21, o22, o23, o24, o25, o26, o27, o17, o18, o19, o20);
		gen27_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o22, o23, o24, o25, o26, o27, o17, o18, o19, o20, o21);
		gen27_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o23, o24, o25, o26, o27, o17, o18, o19, o20, o21, o22);
		gen27_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o24, o25, o26, o27, o17, o18, o19, o20, o21, o22, o23);
		gen27_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o25, o26, o27, o17, o18, o19, o20, o21, o22, o23, o24);
		gen27_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o26, o27, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen27_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o27, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
	}

	private static final void gen27_17(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27){
		gen27_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen27_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o19, o20, o21, o22, o23, o24, o25, o26, o27, o18);
		gen27_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o20, o21, o22, o23, o24, o25, o26, o27, o18, o19);
		gen27_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o21, o22, o23, o24, o25, o26, o27, o18, o19, o20);
		gen27_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o22, o23, o24, o25, o26, o27, o18, o19, o20, o21);
		gen27_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o23, o24, o25, o26, o27, o18, o19, o20, o21, o22);
		gen27_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o24, o25, o26, o27, o18, o19, o20, o21, o22, o23);
		gen27_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o25, o26, o27, o18, o19, o20, o21, o22, o23, o24);
		gen27_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o26, o27, o18, o19, o20, o21, o22, o23, o24, o25);
		gen27_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o27, o18, o19, o20, o21, o22, o23, o24, o25, o26);
	}

	private static final void gen27_18(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27){
		gen27_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen27_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o20, o21, o22, o23, o24, o25, o26, o27, o19);
		gen27_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o21, o22, o23, o24, o25, o26, o27, o19, o20);
		gen27_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o22, o23, o24, o25, o26, o27, o19, o20, o21);
		gen27_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o23, o24, o25, o26, o27, o19, o20, o21, o22);
		gen27_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o24, o25, o26, o27, o19, o20, o21, o22, o23);
		gen27_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o25, o26, o27, o19, o20, o21, o22, o23, o24);
		gen27_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o26, o27, o19, o20, o21, o22, o23, o24, o25);
		gen27_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o27, o19, o20, o21, o22, o23, o24, o25, o26);
	}

	private static final void gen27_19(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27){
		gen27_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen27_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o21, o22, o23, o24, o25, o26, o27, o20);
		gen27_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o22, o23, o24, o25, o26, o27, o20, o21);
		gen27_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o23, o24, o25, o26, o27, o20, o21, o22);
		gen27_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o24, o25, o26, o27, o20, o21, o22, o23);
		gen27_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o25, o26, o27, o20, o21, o22, o23, o24);
		gen27_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o26, o27, o20, o21, o22, o23, o24, o25);
		gen27_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o27, o20, o21, o22, o23, o24, o25, o26);
	}

	private static final void gen27_20(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27){
		gen27_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen27_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o22, o23, o24, o25, o26, o27, o21);
		gen27_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o23, o24, o25, o26, o27, o21, o22);
		gen27_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o24, o25, o26, o27, o21, o22, o23);
		gen27_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o25, o26, o27, o21, o22, o23, o24);
		gen27_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o26, o27, o21, o22, o23, o24, o25);
		gen27_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o27, o21, o22, o23, o24, o25, o26);
	}

	private static final void gen27_21(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27){
		gen27_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen27_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o23, o24, o25, o26, o27, o22);
		gen27_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o24, o25, o26, o27, o22, o23);
		gen27_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o25, o26, o27, o22, o23, o24);
		gen27_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o26, o27, o22, o23, o24, o25);
		gen27_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o27, o22, o23, o24, o25, o26);
	}

	private static final void gen27_22(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27){
		gen27_23(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen27_23(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o24, o25, o26, o27, o23);
		gen27_23(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o25, o26, o27, o23, o24);
		gen27_23(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o26, o27, o23, o24, o25);
		gen27_23(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o27, o23, o24, o25, o26);
	}

	private static final void gen27_23(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27){
		gen27_24(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen27_24(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o25, o26, o27, o24);
		gen27_24(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o26, o27, o24, o25);
		gen27_24(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o27, o24, o25, o26);
	}

	private static final void gen27_24(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27){
		gen27_25(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen27_25(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o26, o27, o25);
		gen27_25(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o27, o25, o26);
	}

	private static final void gen27_25(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27){
		pr.recieve27(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		pr.recieve27(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o27, o26);
	}

	private static final void gen28_0(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28){
		gen28_1(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen28_1(pr,o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o1);
		gen28_1(pr,o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o1, o2);
		gen28_1(pr,o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o1, o2, o3);
		gen28_1(pr,o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o1, o2, o3, o4);
		gen28_1(pr,o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o1, o2, o3, o4, o5);
		gen28_1(pr,o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o1, o2, o3, o4, o5, o6);
		gen28_1(pr,o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o1, o2, o3, o4, o5, o6, o7);
		gen28_1(pr,o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o1, o2, o3, o4, o5, o6, o7, o8);
		gen28_1(pr,o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o1, o2, o3, o4, o5, o6, o7, o8, o9);
		gen28_1(pr,o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen28_1(pr,o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen28_1(pr,o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen28_1(pr,o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen28_1(pr,o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen28_1(pr,o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen28_1(pr,o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen28_1(pr,o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen28_1(pr,o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen28_1(pr,o20, o21, o22, o23, o24, o25, o26, o27, o28, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen28_1(pr,o21, o22, o23, o24, o25, o26, o27, o28, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen28_1(pr,o22, o23, o24, o25, o26, o27, o28, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen28_1(pr,o23, o24, o25, o26, o27, o28, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen28_1(pr,o24, o25, o26, o27, o28, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen28_1(pr,o25, o26, o27, o28, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen28_1(pr,o26, o27, o28, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen28_1(pr,o27, o28, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen28_1(pr,o28, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
	}

	private static final void gen28_1(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28){
		gen28_2(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen28_2(pr,o1, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o2);
		gen28_2(pr,o1, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o2, o3);
		gen28_2(pr,o1, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o2, o3, o4);
		gen28_2(pr,o1, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o2, o3, o4, o5);
		gen28_2(pr,o1, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o2, o3, o4, o5, o6);
		gen28_2(pr,o1, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o2, o3, o4, o5, o6, o7);
		gen28_2(pr,o1, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o2, o3, o4, o5, o6, o7, o8);
		gen28_2(pr,o1, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o2, o3, o4, o5, o6, o7, o8, o9);
		gen28_2(pr,o1, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen28_2(pr,o1, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen28_2(pr,o1, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen28_2(pr,o1, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen28_2(pr,o1, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen28_2(pr,o1, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen28_2(pr,o1, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen28_2(pr,o1, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen28_2(pr,o1, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen28_2(pr,o1, o20, o21, o22, o23, o24, o25, o26, o27, o28, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen28_2(pr,o1, o21, o22, o23, o24, o25, o26, o27, o28, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen28_2(pr,o1, o22, o23, o24, o25, o26, o27, o28, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen28_2(pr,o1, o23, o24, o25, o26, o27, o28, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen28_2(pr,o1, o24, o25, o26, o27, o28, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen28_2(pr,o1, o25, o26, o27, o28, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen28_2(pr,o1, o26, o27, o28, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen28_2(pr,o1, o27, o28, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen28_2(pr,o1, o28, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
	}

	private static final void gen28_2(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28){
		gen28_3(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen28_3(pr,o1, o2, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o3);
		gen28_3(pr,o1, o2, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o3, o4);
		gen28_3(pr,o1, o2, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o3, o4, o5);
		gen28_3(pr,o1, o2, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o3, o4, o5, o6);
		gen28_3(pr,o1, o2, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o3, o4, o5, o6, o7);
		gen28_3(pr,o1, o2, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o3, o4, o5, o6, o7, o8);
		gen28_3(pr,o1, o2, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o3, o4, o5, o6, o7, o8, o9);
		gen28_3(pr,o1, o2, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o3, o4, o5, o6, o7, o8, o9, o10);
		gen28_3(pr,o1, o2, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen28_3(pr,o1, o2, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen28_3(pr,o1, o2, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen28_3(pr,o1, o2, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen28_3(pr,o1, o2, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen28_3(pr,o1, o2, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen28_3(pr,o1, o2, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen28_3(pr,o1, o2, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen28_3(pr,o1, o2, o20, o21, o22, o23, o24, o25, o26, o27, o28, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen28_3(pr,o1, o2, o21, o22, o23, o24, o25, o26, o27, o28, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen28_3(pr,o1, o2, o22, o23, o24, o25, o26, o27, o28, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen28_3(pr,o1, o2, o23, o24, o25, o26, o27, o28, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen28_3(pr,o1, o2, o24, o25, o26, o27, o28, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen28_3(pr,o1, o2, o25, o26, o27, o28, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen28_3(pr,o1, o2, o26, o27, o28, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen28_3(pr,o1, o2, o27, o28, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen28_3(pr,o1, o2, o28, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
	}

	private static final void gen28_3(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28){
		gen28_4(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen28_4(pr,o1, o2, o3, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o4);
		gen28_4(pr,o1, o2, o3, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o4, o5);
		gen28_4(pr,o1, o2, o3, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o4, o5, o6);
		gen28_4(pr,o1, o2, o3, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o4, o5, o6, o7);
		gen28_4(pr,o1, o2, o3, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o4, o5, o6, o7, o8);
		gen28_4(pr,o1, o2, o3, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o4, o5, o6, o7, o8, o9);
		gen28_4(pr,o1, o2, o3, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o4, o5, o6, o7, o8, o9, o10);
		gen28_4(pr,o1, o2, o3, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o4, o5, o6, o7, o8, o9, o10, o11);
		gen28_4(pr,o1, o2, o3, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen28_4(pr,o1, o2, o3, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen28_4(pr,o1, o2, o3, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen28_4(pr,o1, o2, o3, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen28_4(pr,o1, o2, o3, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen28_4(pr,o1, o2, o3, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen28_4(pr,o1, o2, o3, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen28_4(pr,o1, o2, o3, o20, o21, o22, o23, o24, o25, o26, o27, o28, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen28_4(pr,o1, o2, o3, o21, o22, o23, o24, o25, o26, o27, o28, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen28_4(pr,o1, o2, o3, o22, o23, o24, o25, o26, o27, o28, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen28_4(pr,o1, o2, o3, o23, o24, o25, o26, o27, o28, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen28_4(pr,o1, o2, o3, o24, o25, o26, o27, o28, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen28_4(pr,o1, o2, o3, o25, o26, o27, o28, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen28_4(pr,o1, o2, o3, o26, o27, o28, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen28_4(pr,o1, o2, o3, o27, o28, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen28_4(pr,o1, o2, o3, o28, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
	}

	private static final void gen28_4(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28){
		gen28_5(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen28_5(pr,o1, o2, o3, o4, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o5);
		gen28_5(pr,o1, o2, o3, o4, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o5, o6);
		gen28_5(pr,o1, o2, o3, o4, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o5, o6, o7);
		gen28_5(pr,o1, o2, o3, o4, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o5, o6, o7, o8);
		gen28_5(pr,o1, o2, o3, o4, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o5, o6, o7, o8, o9);
		gen28_5(pr,o1, o2, o3, o4, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o5, o6, o7, o8, o9, o10);
		gen28_5(pr,o1, o2, o3, o4, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o5, o6, o7, o8, o9, o10, o11);
		gen28_5(pr,o1, o2, o3, o4, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o5, o6, o7, o8, o9, o10, o11, o12);
		gen28_5(pr,o1, o2, o3, o4, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen28_5(pr,o1, o2, o3, o4, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen28_5(pr,o1, o2, o3, o4, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen28_5(pr,o1, o2, o3, o4, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen28_5(pr,o1, o2, o3, o4, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen28_5(pr,o1, o2, o3, o4, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen28_5(pr,o1, o2, o3, o4, o20, o21, o22, o23, o24, o25, o26, o27, o28, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen28_5(pr,o1, o2, o3, o4, o21, o22, o23, o24, o25, o26, o27, o28, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen28_5(pr,o1, o2, o3, o4, o22, o23, o24, o25, o26, o27, o28, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen28_5(pr,o1, o2, o3, o4, o23, o24, o25, o26, o27, o28, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen28_5(pr,o1, o2, o3, o4, o24, o25, o26, o27, o28, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen28_5(pr,o1, o2, o3, o4, o25, o26, o27, o28, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen28_5(pr,o1, o2, o3, o4, o26, o27, o28, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen28_5(pr,o1, o2, o3, o4, o27, o28, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen28_5(pr,o1, o2, o3, o4, o28, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
	}

	private static final void gen28_5(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28){
		gen28_6(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen28_6(pr,o1, o2, o3, o4, o5, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o6);
		gen28_6(pr,o1, o2, o3, o4, o5, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o6, o7);
		gen28_6(pr,o1, o2, o3, o4, o5, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o6, o7, o8);
		gen28_6(pr,o1, o2, o3, o4, o5, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o6, o7, o8, o9);
		gen28_6(pr,o1, o2, o3, o4, o5, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o6, o7, o8, o9, o10);
		gen28_6(pr,o1, o2, o3, o4, o5, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o6, o7, o8, o9, o10, o11);
		gen28_6(pr,o1, o2, o3, o4, o5, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o6, o7, o8, o9, o10, o11, o12);
		gen28_6(pr,o1, o2, o3, o4, o5, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o6, o7, o8, o9, o10, o11, o12, o13);
		gen28_6(pr,o1, o2, o3, o4, o5, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen28_6(pr,o1, o2, o3, o4, o5, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen28_6(pr,o1, o2, o3, o4, o5, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen28_6(pr,o1, o2, o3, o4, o5, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen28_6(pr,o1, o2, o3, o4, o5, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen28_6(pr,o1, o2, o3, o4, o5, o20, o21, o22, o23, o24, o25, o26, o27, o28, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen28_6(pr,o1, o2, o3, o4, o5, o21, o22, o23, o24, o25, o26, o27, o28, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen28_6(pr,o1, o2, o3, o4, o5, o22, o23, o24, o25, o26, o27, o28, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen28_6(pr,o1, o2, o3, o4, o5, o23, o24, o25, o26, o27, o28, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen28_6(pr,o1, o2, o3, o4, o5, o24, o25, o26, o27, o28, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen28_6(pr,o1, o2, o3, o4, o5, o25, o26, o27, o28, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen28_6(pr,o1, o2, o3, o4, o5, o26, o27, o28, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen28_6(pr,o1, o2, o3, o4, o5, o27, o28, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen28_6(pr,o1, o2, o3, o4, o5, o28, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
	}

	private static final void gen28_6(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28){
		gen28_7(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen28_7(pr,o1, o2, o3, o4, o5, o6, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o7);
		gen28_7(pr,o1, o2, o3, o4, o5, o6, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o7, o8);
		gen28_7(pr,o1, o2, o3, o4, o5, o6, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o7, o8, o9);
		gen28_7(pr,o1, o2, o3, o4, o5, o6, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o7, o8, o9, o10);
		gen28_7(pr,o1, o2, o3, o4, o5, o6, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o7, o8, o9, o10, o11);
		gen28_7(pr,o1, o2, o3, o4, o5, o6, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o7, o8, o9, o10, o11, o12);
		gen28_7(pr,o1, o2, o3, o4, o5, o6, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o7, o8, o9, o10, o11, o12, o13);
		gen28_7(pr,o1, o2, o3, o4, o5, o6, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o7, o8, o9, o10, o11, o12, o13, o14);
		gen28_7(pr,o1, o2, o3, o4, o5, o6, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen28_7(pr,o1, o2, o3, o4, o5, o6, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen28_7(pr,o1, o2, o3, o4, o5, o6, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen28_7(pr,o1, o2, o3, o4, o5, o6, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen28_7(pr,o1, o2, o3, o4, o5, o6, o20, o21, o22, o23, o24, o25, o26, o27, o28, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen28_7(pr,o1, o2, o3, o4, o5, o6, o21, o22, o23, o24, o25, o26, o27, o28, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen28_7(pr,o1, o2, o3, o4, o5, o6, o22, o23, o24, o25, o26, o27, o28, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen28_7(pr,o1, o2, o3, o4, o5, o6, o23, o24, o25, o26, o27, o28, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen28_7(pr,o1, o2, o3, o4, o5, o6, o24, o25, o26, o27, o28, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen28_7(pr,o1, o2, o3, o4, o5, o6, o25, o26, o27, o28, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen28_7(pr,o1, o2, o3, o4, o5, o6, o26, o27, o28, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen28_7(pr,o1, o2, o3, o4, o5, o6, o27, o28, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen28_7(pr,o1, o2, o3, o4, o5, o6, o28, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
	}

	private static final void gen28_7(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28){
		gen28_8(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen28_8(pr,o1, o2, o3, o4, o5, o6, o7, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o8);
		gen28_8(pr,o1, o2, o3, o4, o5, o6, o7, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o8, o9);
		gen28_8(pr,o1, o2, o3, o4, o5, o6, o7, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o8, o9, o10);
		gen28_8(pr,o1, o2, o3, o4, o5, o6, o7, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o8, o9, o10, o11);
		gen28_8(pr,o1, o2, o3, o4, o5, o6, o7, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o8, o9, o10, o11, o12);
		gen28_8(pr,o1, o2, o3, o4, o5, o6, o7, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o8, o9, o10, o11, o12, o13);
		gen28_8(pr,o1, o2, o3, o4, o5, o6, o7, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o8, o9, o10, o11, o12, o13, o14);
		gen28_8(pr,o1, o2, o3, o4, o5, o6, o7, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o8, o9, o10, o11, o12, o13, o14, o15);
		gen28_8(pr,o1, o2, o3, o4, o5, o6, o7, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen28_8(pr,o1, o2, o3, o4, o5, o6, o7, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen28_8(pr,o1, o2, o3, o4, o5, o6, o7, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen28_8(pr,o1, o2, o3, o4, o5, o6, o7, o20, o21, o22, o23, o24, o25, o26, o27, o28, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen28_8(pr,o1, o2, o3, o4, o5, o6, o7, o21, o22, o23, o24, o25, o26, o27, o28, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen28_8(pr,o1, o2, o3, o4, o5, o6, o7, o22, o23, o24, o25, o26, o27, o28, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen28_8(pr,o1, o2, o3, o4, o5, o6, o7, o23, o24, o25, o26, o27, o28, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen28_8(pr,o1, o2, o3, o4, o5, o6, o7, o24, o25, o26, o27, o28, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen28_8(pr,o1, o2, o3, o4, o5, o6, o7, o25, o26, o27, o28, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen28_8(pr,o1, o2, o3, o4, o5, o6, o7, o26, o27, o28, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen28_8(pr,o1, o2, o3, o4, o5, o6, o7, o27, o28, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen28_8(pr,o1, o2, o3, o4, o5, o6, o7, o28, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
	}

	private static final void gen28_8(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28){
		gen28_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen28_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o9);
		gen28_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o9, o10);
		gen28_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o9, o10, o11);
		gen28_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o9, o10, o11, o12);
		gen28_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o9, o10, o11, o12, o13);
		gen28_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o9, o10, o11, o12, o13, o14);
		gen28_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o9, o10, o11, o12, o13, o14, o15);
		gen28_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o9, o10, o11, o12, o13, o14, o15, o16);
		gen28_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen28_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen28_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o20, o21, o22, o23, o24, o25, o26, o27, o28, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen28_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o21, o22, o23, o24, o25, o26, o27, o28, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen28_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o22, o23, o24, o25, o26, o27, o28, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen28_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o23, o24, o25, o26, o27, o28, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen28_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o24, o25, o26, o27, o28, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen28_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o25, o26, o27, o28, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen28_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o26, o27, o28, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen28_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o27, o28, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen28_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o28, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
	}

	private static final void gen28_9(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28){
		gen28_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen28_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o10);
		gen28_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o10, o11);
		gen28_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o10, o11, o12);
		gen28_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o10, o11, o12, o13);
		gen28_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o10, o11, o12, o13, o14);
		gen28_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o10, o11, o12, o13, o14, o15);
		gen28_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o10, o11, o12, o13, o14, o15, o16);
		gen28_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o10, o11, o12, o13, o14, o15, o16, o17);
		gen28_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen28_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o20, o21, o22, o23, o24, o25, o26, o27, o28, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen28_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o21, o22, o23, o24, o25, o26, o27, o28, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen28_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o22, o23, o24, o25, o26, o27, o28, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen28_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o23, o24, o25, o26, o27, o28, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen28_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o24, o25, o26, o27, o28, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen28_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o25, o26, o27, o28, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen28_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o26, o27, o28, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen28_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o27, o28, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen28_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o28, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
	}

	private static final void gen28_10(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28){
		gen28_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen28_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o11);
		gen28_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o11, o12);
		gen28_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o11, o12, o13);
		gen28_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o11, o12, o13, o14);
		gen28_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o11, o12, o13, o14, o15);
		gen28_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o11, o12, o13, o14, o15, o16);
		gen28_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o11, o12, o13, o14, o15, o16, o17);
		gen28_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o11, o12, o13, o14, o15, o16, o17, o18);
		gen28_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o20, o21, o22, o23, o24, o25, o26, o27, o28, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen28_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o21, o22, o23, o24, o25, o26, o27, o28, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen28_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o22, o23, o24, o25, o26, o27, o28, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen28_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o23, o24, o25, o26, o27, o28, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen28_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o24, o25, o26, o27, o28, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen28_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o25, o26, o27, o28, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen28_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o26, o27, o28, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen28_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o27, o28, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen28_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o28, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
	}

	private static final void gen28_11(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28){
		gen28_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen28_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o12);
		gen28_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o12, o13);
		gen28_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o12, o13, o14);
		gen28_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o12, o13, o14, o15);
		gen28_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o12, o13, o14, o15, o16);
		gen28_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o12, o13, o14, o15, o16, o17);
		gen28_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o12, o13, o14, o15, o16, o17, o18);
		gen28_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o20, o21, o22, o23, o24, o25, o26, o27, o28, o12, o13, o14, o15, o16, o17, o18, o19);
		gen28_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o21, o22, o23, o24, o25, o26, o27, o28, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen28_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o22, o23, o24, o25, o26, o27, o28, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen28_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o23, o24, o25, o26, o27, o28, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen28_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o24, o25, o26, o27, o28, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen28_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o25, o26, o27, o28, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen28_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o26, o27, o28, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen28_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o27, o28, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen28_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o28, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
	}

	private static final void gen28_12(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28){
		gen28_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen28_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o13);
		gen28_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o13, o14);
		gen28_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o13, o14, o15);
		gen28_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o13, o14, o15, o16);
		gen28_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o13, o14, o15, o16, o17);
		gen28_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o13, o14, o15, o16, o17, o18);
		gen28_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o20, o21, o22, o23, o24, o25, o26, o27, o28, o13, o14, o15, o16, o17, o18, o19);
		gen28_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o21, o22, o23, o24, o25, o26, o27, o28, o13, o14, o15, o16, o17, o18, o19, o20);
		gen28_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o22, o23, o24, o25, o26, o27, o28, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen28_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o23, o24, o25, o26, o27, o28, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen28_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o24, o25, o26, o27, o28, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen28_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o25, o26, o27, o28, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen28_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o26, o27, o28, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen28_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o27, o28, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen28_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o28, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
	}

	private static final void gen28_13(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28){
		gen28_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen28_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o14);
		gen28_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o14, o15);
		gen28_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o14, o15, o16);
		gen28_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o14, o15, o16, o17);
		gen28_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o14, o15, o16, o17, o18);
		gen28_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o20, o21, o22, o23, o24, o25, o26, o27, o28, o14, o15, o16, o17, o18, o19);
		gen28_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o21, o22, o23, o24, o25, o26, o27, o28, o14, o15, o16, o17, o18, o19, o20);
		gen28_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o22, o23, o24, o25, o26, o27, o28, o14, o15, o16, o17, o18, o19, o20, o21);
		gen28_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o23, o24, o25, o26, o27, o28, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen28_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o24, o25, o26, o27, o28, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen28_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o25, o26, o27, o28, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen28_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o26, o27, o28, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen28_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o27, o28, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen28_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o28, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
	}

	private static final void gen28_14(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28){
		gen28_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen28_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o15);
		gen28_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o15, o16);
		gen28_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o15, o16, o17);
		gen28_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o15, o16, o17, o18);
		gen28_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o20, o21, o22, o23, o24, o25, o26, o27, o28, o15, o16, o17, o18, o19);
		gen28_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o21, o22, o23, o24, o25, o26, o27, o28, o15, o16, o17, o18, o19, o20);
		gen28_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o22, o23, o24, o25, o26, o27, o28, o15, o16, o17, o18, o19, o20, o21);
		gen28_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o23, o24, o25, o26, o27, o28, o15, o16, o17, o18, o19, o20, o21, o22);
		gen28_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o24, o25, o26, o27, o28, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen28_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o25, o26, o27, o28, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen28_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o26, o27, o28, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen28_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o27, o28, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen28_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o28, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
	}

	private static final void gen28_15(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28){
		gen28_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen28_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o16);
		gen28_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o16, o17);
		gen28_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o16, o17, o18);
		gen28_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o20, o21, o22, o23, o24, o25, o26, o27, o28, o16, o17, o18, o19);
		gen28_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o21, o22, o23, o24, o25, o26, o27, o28, o16, o17, o18, o19, o20);
		gen28_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o22, o23, o24, o25, o26, o27, o28, o16, o17, o18, o19, o20, o21);
		gen28_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o23, o24, o25, o26, o27, o28, o16, o17, o18, o19, o20, o21, o22);
		gen28_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o24, o25, o26, o27, o28, o16, o17, o18, o19, o20, o21, o22, o23);
		gen28_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o25, o26, o27, o28, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen28_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o26, o27, o28, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen28_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o27, o28, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen28_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o28, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
	}

	private static final void gen28_16(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28){
		gen28_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen28_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o17);
		gen28_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o17, o18);
		gen28_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o20, o21, o22, o23, o24, o25, o26, o27, o28, o17, o18, o19);
		gen28_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o21, o22, o23, o24, o25, o26, o27, o28, o17, o18, o19, o20);
		gen28_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o22, o23, o24, o25, o26, o27, o28, o17, o18, o19, o20, o21);
		gen28_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o23, o24, o25, o26, o27, o28, o17, o18, o19, o20, o21, o22);
		gen28_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o24, o25, o26, o27, o28, o17, o18, o19, o20, o21, o22, o23);
		gen28_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o25, o26, o27, o28, o17, o18, o19, o20, o21, o22, o23, o24);
		gen28_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o26, o27, o28, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen28_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o27, o28, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen28_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o28, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
	}

	private static final void gen28_17(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28){
		gen28_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen28_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o18);
		gen28_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o20, o21, o22, o23, o24, o25, o26, o27, o28, o18, o19);
		gen28_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o21, o22, o23, o24, o25, o26, o27, o28, o18, o19, o20);
		gen28_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o22, o23, o24, o25, o26, o27, o28, o18, o19, o20, o21);
		gen28_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o23, o24, o25, o26, o27, o28, o18, o19, o20, o21, o22);
		gen28_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o24, o25, o26, o27, o28, o18, o19, o20, o21, o22, o23);
		gen28_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o25, o26, o27, o28, o18, o19, o20, o21, o22, o23, o24);
		gen28_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o26, o27, o28, o18, o19, o20, o21, o22, o23, o24, o25);
		gen28_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o27, o28, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen28_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o28, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
	}

	private static final void gen28_18(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28){
		gen28_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen28_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o20, o21, o22, o23, o24, o25, o26, o27, o28, o19);
		gen28_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o21, o22, o23, o24, o25, o26, o27, o28, o19, o20);
		gen28_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o22, o23, o24, o25, o26, o27, o28, o19, o20, o21);
		gen28_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o23, o24, o25, o26, o27, o28, o19, o20, o21, o22);
		gen28_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o24, o25, o26, o27, o28, o19, o20, o21, o22, o23);
		gen28_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o25, o26, o27, o28, o19, o20, o21, o22, o23, o24);
		gen28_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o26, o27, o28, o19, o20, o21, o22, o23, o24, o25);
		gen28_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o27, o28, o19, o20, o21, o22, o23, o24, o25, o26);
		gen28_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o28, o19, o20, o21, o22, o23, o24, o25, o26, o27);
	}

	private static final void gen28_19(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28){
		gen28_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen28_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o21, o22, o23, o24, o25, o26, o27, o28, o20);
		gen28_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o22, o23, o24, o25, o26, o27, o28, o20, o21);
		gen28_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o23, o24, o25, o26, o27, o28, o20, o21, o22);
		gen28_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o24, o25, o26, o27, o28, o20, o21, o22, o23);
		gen28_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o25, o26, o27, o28, o20, o21, o22, o23, o24);
		gen28_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o26, o27, o28, o20, o21, o22, o23, o24, o25);
		gen28_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o27, o28, o20, o21, o22, o23, o24, o25, o26);
		gen28_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o28, o20, o21, o22, o23, o24, o25, o26, o27);
	}

	private static final void gen28_20(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28){
		gen28_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen28_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o22, o23, o24, o25, o26, o27, o28, o21);
		gen28_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o23, o24, o25, o26, o27, o28, o21, o22);
		gen28_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o24, o25, o26, o27, o28, o21, o22, o23);
		gen28_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o25, o26, o27, o28, o21, o22, o23, o24);
		gen28_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o26, o27, o28, o21, o22, o23, o24, o25);
		gen28_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o27, o28, o21, o22, o23, o24, o25, o26);
		gen28_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o28, o21, o22, o23, o24, o25, o26, o27);
	}

	private static final void gen28_21(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28){
		gen28_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen28_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o23, o24, o25, o26, o27, o28, o22);
		gen28_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o24, o25, o26, o27, o28, o22, o23);
		gen28_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o25, o26, o27, o28, o22, o23, o24);
		gen28_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o26, o27, o28, o22, o23, o24, o25);
		gen28_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o27, o28, o22, o23, o24, o25, o26);
		gen28_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o28, o22, o23, o24, o25, o26, o27);
	}

	private static final void gen28_22(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28){
		gen28_23(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen28_23(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o24, o25, o26, o27, o28, o23);
		gen28_23(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o25, o26, o27, o28, o23, o24);
		gen28_23(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o26, o27, o28, o23, o24, o25);
		gen28_23(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o27, o28, o23, o24, o25, o26);
		gen28_23(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o28, o23, o24, o25, o26, o27);
	}

	private static final void gen28_23(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28){
		gen28_24(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen28_24(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o25, o26, o27, o28, o24);
		gen28_24(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o26, o27, o28, o24, o25);
		gen28_24(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o27, o28, o24, o25, o26);
		gen28_24(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o28, o24, o25, o26, o27);
	}

	private static final void gen28_24(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28){
		gen28_25(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen28_25(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o26, o27, o28, o25);
		gen28_25(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o27, o28, o25, o26);
		gen28_25(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o28, o25, o26, o27);
	}

	private static final void gen28_25(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28){
		gen28_26(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen28_26(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o27, o28, o26);
		gen28_26(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o28, o26, o27);
	}

	private static final void gen28_26(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28){
		pr.recieve28(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		pr.recieve28(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o28, o27);
	}

	private static final void gen29_0(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29){
		gen29_1(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
		gen29_1(pr,o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o1);
		gen29_1(pr,o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o1, o2);
		gen29_1(pr,o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o1, o2, o3);
		gen29_1(pr,o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o1, o2, o3, o4);
		gen29_1(pr,o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o1, o2, o3, o4, o5);
		gen29_1(pr,o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o1, o2, o3, o4, o5, o6);
		gen29_1(pr,o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o1, o2, o3, o4, o5, o6, o7);
		gen29_1(pr,o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o1, o2, o3, o4, o5, o6, o7, o8);
		gen29_1(pr,o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o1, o2, o3, o4, o5, o6, o7, o8, o9);
		gen29_1(pr,o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen29_1(pr,o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen29_1(pr,o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen29_1(pr,o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen29_1(pr,o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen29_1(pr,o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen29_1(pr,o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen29_1(pr,o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen29_1(pr,o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen29_1(pr,o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen29_1(pr,o21, o22, o23, o24, o25, o26, o27, o28, o29, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen29_1(pr,o22, o23, o24, o25, o26, o27, o28, o29, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen29_1(pr,o23, o24, o25, o26, o27, o28, o29, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen29_1(pr,o24, o25, o26, o27, o28, o29, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen29_1(pr,o25, o26, o27, o28, o29, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen29_1(pr,o26, o27, o28, o29, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen29_1(pr,o27, o28, o29, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen29_1(pr,o28, o29, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen29_1(pr,o29, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
	}

	private static final void gen29_1(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29){
		gen29_2(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
		gen29_2(pr,o1, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o2);
		gen29_2(pr,o1, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o2, o3);
		gen29_2(pr,o1, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o2, o3, o4);
		gen29_2(pr,o1, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o2, o3, o4, o5);
		gen29_2(pr,o1, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o2, o3, o4, o5, o6);
		gen29_2(pr,o1, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o2, o3, o4, o5, o6, o7);
		gen29_2(pr,o1, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o2, o3, o4, o5, o6, o7, o8);
		gen29_2(pr,o1, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o2, o3, o4, o5, o6, o7, o8, o9);
		gen29_2(pr,o1, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen29_2(pr,o1, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen29_2(pr,o1, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen29_2(pr,o1, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen29_2(pr,o1, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen29_2(pr,o1, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen29_2(pr,o1, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen29_2(pr,o1, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen29_2(pr,o1, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen29_2(pr,o1, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen29_2(pr,o1, o21, o22, o23, o24, o25, o26, o27, o28, o29, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen29_2(pr,o1, o22, o23, o24, o25, o26, o27, o28, o29, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen29_2(pr,o1, o23, o24, o25, o26, o27, o28, o29, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen29_2(pr,o1, o24, o25, o26, o27, o28, o29, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen29_2(pr,o1, o25, o26, o27, o28, o29, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen29_2(pr,o1, o26, o27, o28, o29, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen29_2(pr,o1, o27, o28, o29, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen29_2(pr,o1, o28, o29, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen29_2(pr,o1, o29, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
	}

	private static final void gen29_2(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29){
		gen29_3(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
		gen29_3(pr,o1, o2, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o3);
		gen29_3(pr,o1, o2, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o3, o4);
		gen29_3(pr,o1, o2, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o3, o4, o5);
		gen29_3(pr,o1, o2, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o3, o4, o5, o6);
		gen29_3(pr,o1, o2, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o3, o4, o5, o6, o7);
		gen29_3(pr,o1, o2, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o3, o4, o5, o6, o7, o8);
		gen29_3(pr,o1, o2, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o3, o4, o5, o6, o7, o8, o9);
		gen29_3(pr,o1, o2, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o3, o4, o5, o6, o7, o8, o9, o10);
		gen29_3(pr,o1, o2, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen29_3(pr,o1, o2, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen29_3(pr,o1, o2, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen29_3(pr,o1, o2, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen29_3(pr,o1, o2, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen29_3(pr,o1, o2, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen29_3(pr,o1, o2, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen29_3(pr,o1, o2, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen29_3(pr,o1, o2, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen29_3(pr,o1, o2, o21, o22, o23, o24, o25, o26, o27, o28, o29, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen29_3(pr,o1, o2, o22, o23, o24, o25, o26, o27, o28, o29, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen29_3(pr,o1, o2, o23, o24, o25, o26, o27, o28, o29, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen29_3(pr,o1, o2, o24, o25, o26, o27, o28, o29, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen29_3(pr,o1, o2, o25, o26, o27, o28, o29, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen29_3(pr,o1, o2, o26, o27, o28, o29, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen29_3(pr,o1, o2, o27, o28, o29, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen29_3(pr,o1, o2, o28, o29, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen29_3(pr,o1, o2, o29, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
	}

	private static final void gen29_3(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29){
		gen29_4(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
		gen29_4(pr,o1, o2, o3, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o4);
		gen29_4(pr,o1, o2, o3, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o4, o5);
		gen29_4(pr,o1, o2, o3, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o4, o5, o6);
		gen29_4(pr,o1, o2, o3, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o4, o5, o6, o7);
		gen29_4(pr,o1, o2, o3, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o4, o5, o6, o7, o8);
		gen29_4(pr,o1, o2, o3, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o4, o5, o6, o7, o8, o9);
		gen29_4(pr,o1, o2, o3, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o4, o5, o6, o7, o8, o9, o10);
		gen29_4(pr,o1, o2, o3, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o4, o5, o6, o7, o8, o9, o10, o11);
		gen29_4(pr,o1, o2, o3, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen29_4(pr,o1, o2, o3, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen29_4(pr,o1, o2, o3, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen29_4(pr,o1, o2, o3, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen29_4(pr,o1, o2, o3, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen29_4(pr,o1, o2, o3, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen29_4(pr,o1, o2, o3, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen29_4(pr,o1, o2, o3, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen29_4(pr,o1, o2, o3, o21, o22, o23, o24, o25, o26, o27, o28, o29, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen29_4(pr,o1, o2, o3, o22, o23, o24, o25, o26, o27, o28, o29, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen29_4(pr,o1, o2, o3, o23, o24, o25, o26, o27, o28, o29, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen29_4(pr,o1, o2, o3, o24, o25, o26, o27, o28, o29, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen29_4(pr,o1, o2, o3, o25, o26, o27, o28, o29, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen29_4(pr,o1, o2, o3, o26, o27, o28, o29, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen29_4(pr,o1, o2, o3, o27, o28, o29, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen29_4(pr,o1, o2, o3, o28, o29, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen29_4(pr,o1, o2, o3, o29, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
	}

	private static final void gen29_4(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29){
		gen29_5(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
		gen29_5(pr,o1, o2, o3, o4, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o5);
		gen29_5(pr,o1, o2, o3, o4, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o5, o6);
		gen29_5(pr,o1, o2, o3, o4, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o5, o6, o7);
		gen29_5(pr,o1, o2, o3, o4, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o5, o6, o7, o8);
		gen29_5(pr,o1, o2, o3, o4, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o5, o6, o7, o8, o9);
		gen29_5(pr,o1, o2, o3, o4, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o5, o6, o7, o8, o9, o10);
		gen29_5(pr,o1, o2, o3, o4, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o5, o6, o7, o8, o9, o10, o11);
		gen29_5(pr,o1, o2, o3, o4, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o5, o6, o7, o8, o9, o10, o11, o12);
		gen29_5(pr,o1, o2, o3, o4, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen29_5(pr,o1, o2, o3, o4, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen29_5(pr,o1, o2, o3, o4, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen29_5(pr,o1, o2, o3, o4, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen29_5(pr,o1, o2, o3, o4, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen29_5(pr,o1, o2, o3, o4, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen29_5(pr,o1, o2, o3, o4, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen29_5(pr,o1, o2, o3, o4, o21, o22, o23, o24, o25, o26, o27, o28, o29, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen29_5(pr,o1, o2, o3, o4, o22, o23, o24, o25, o26, o27, o28, o29, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen29_5(pr,o1, o2, o3, o4, o23, o24, o25, o26, o27, o28, o29, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen29_5(pr,o1, o2, o3, o4, o24, o25, o26, o27, o28, o29, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen29_5(pr,o1, o2, o3, o4, o25, o26, o27, o28, o29, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen29_5(pr,o1, o2, o3, o4, o26, o27, o28, o29, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen29_5(pr,o1, o2, o3, o4, o27, o28, o29, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen29_5(pr,o1, o2, o3, o4, o28, o29, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen29_5(pr,o1, o2, o3, o4, o29, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
	}

	private static final void gen29_5(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29){
		gen29_6(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
		gen29_6(pr,o1, o2, o3, o4, o5, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o6);
		gen29_6(pr,o1, o2, o3, o4, o5, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o6, o7);
		gen29_6(pr,o1, o2, o3, o4, o5, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o6, o7, o8);
		gen29_6(pr,o1, o2, o3, o4, o5, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o6, o7, o8, o9);
		gen29_6(pr,o1, o2, o3, o4, o5, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o6, o7, o8, o9, o10);
		gen29_6(pr,o1, o2, o3, o4, o5, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o6, o7, o8, o9, o10, o11);
		gen29_6(pr,o1, o2, o3, o4, o5, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o6, o7, o8, o9, o10, o11, o12);
		gen29_6(pr,o1, o2, o3, o4, o5, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o6, o7, o8, o9, o10, o11, o12, o13);
		gen29_6(pr,o1, o2, o3, o4, o5, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen29_6(pr,o1, o2, o3, o4, o5, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen29_6(pr,o1, o2, o3, o4, o5, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen29_6(pr,o1, o2, o3, o4, o5, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen29_6(pr,o1, o2, o3, o4, o5, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen29_6(pr,o1, o2, o3, o4, o5, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen29_6(pr,o1, o2, o3, o4, o5, o21, o22, o23, o24, o25, o26, o27, o28, o29, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen29_6(pr,o1, o2, o3, o4, o5, o22, o23, o24, o25, o26, o27, o28, o29, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen29_6(pr,o1, o2, o3, o4, o5, o23, o24, o25, o26, o27, o28, o29, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen29_6(pr,o1, o2, o3, o4, o5, o24, o25, o26, o27, o28, o29, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen29_6(pr,o1, o2, o3, o4, o5, o25, o26, o27, o28, o29, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen29_6(pr,o1, o2, o3, o4, o5, o26, o27, o28, o29, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen29_6(pr,o1, o2, o3, o4, o5, o27, o28, o29, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen29_6(pr,o1, o2, o3, o4, o5, o28, o29, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen29_6(pr,o1, o2, o3, o4, o5, o29, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
	}

	private static final void gen29_6(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29){
		gen29_7(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
		gen29_7(pr,o1, o2, o3, o4, o5, o6, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o7);
		gen29_7(pr,o1, o2, o3, o4, o5, o6, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o7, o8);
		gen29_7(pr,o1, o2, o3, o4, o5, o6, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o7, o8, o9);
		gen29_7(pr,o1, o2, o3, o4, o5, o6, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o7, o8, o9, o10);
		gen29_7(pr,o1, o2, o3, o4, o5, o6, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o7, o8, o9, o10, o11);
		gen29_7(pr,o1, o2, o3, o4, o5, o6, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o7, o8, o9, o10, o11, o12);
		gen29_7(pr,o1, o2, o3, o4, o5, o6, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o7, o8, o9, o10, o11, o12, o13);
		gen29_7(pr,o1, o2, o3, o4, o5, o6, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o7, o8, o9, o10, o11, o12, o13, o14);
		gen29_7(pr,o1, o2, o3, o4, o5, o6, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen29_7(pr,o1, o2, o3, o4, o5, o6, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen29_7(pr,o1, o2, o3, o4, o5, o6, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen29_7(pr,o1, o2, o3, o4, o5, o6, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen29_7(pr,o1, o2, o3, o4, o5, o6, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen29_7(pr,o1, o2, o3, o4, o5, o6, o21, o22, o23, o24, o25, o26, o27, o28, o29, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen29_7(pr,o1, o2, o3, o4, o5, o6, o22, o23, o24, o25, o26, o27, o28, o29, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen29_7(pr,o1, o2, o3, o4, o5, o6, o23, o24, o25, o26, o27, o28, o29, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen29_7(pr,o1, o2, o3, o4, o5, o6, o24, o25, o26, o27, o28, o29, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen29_7(pr,o1, o2, o3, o4, o5, o6, o25, o26, o27, o28, o29, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen29_7(pr,o1, o2, o3, o4, o5, o6, o26, o27, o28, o29, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen29_7(pr,o1, o2, o3, o4, o5, o6, o27, o28, o29, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen29_7(pr,o1, o2, o3, o4, o5, o6, o28, o29, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen29_7(pr,o1, o2, o3, o4, o5, o6, o29, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
	}

	private static final void gen29_7(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29){
		gen29_8(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
		gen29_8(pr,o1, o2, o3, o4, o5, o6, o7, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o8);
		gen29_8(pr,o1, o2, o3, o4, o5, o6, o7, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o8, o9);
		gen29_8(pr,o1, o2, o3, o4, o5, o6, o7, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o8, o9, o10);
		gen29_8(pr,o1, o2, o3, o4, o5, o6, o7, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o8, o9, o10, o11);
		gen29_8(pr,o1, o2, o3, o4, o5, o6, o7, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o8, o9, o10, o11, o12);
		gen29_8(pr,o1, o2, o3, o4, o5, o6, o7, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o8, o9, o10, o11, o12, o13);
		gen29_8(pr,o1, o2, o3, o4, o5, o6, o7, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o8, o9, o10, o11, o12, o13, o14);
		gen29_8(pr,o1, o2, o3, o4, o5, o6, o7, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o8, o9, o10, o11, o12, o13, o14, o15);
		gen29_8(pr,o1, o2, o3, o4, o5, o6, o7, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen29_8(pr,o1, o2, o3, o4, o5, o6, o7, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen29_8(pr,o1, o2, o3, o4, o5, o6, o7, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen29_8(pr,o1, o2, o3, o4, o5, o6, o7, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen29_8(pr,o1, o2, o3, o4, o5, o6, o7, o21, o22, o23, o24, o25, o26, o27, o28, o29, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen29_8(pr,o1, o2, o3, o4, o5, o6, o7, o22, o23, o24, o25, o26, o27, o28, o29, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen29_8(pr,o1, o2, o3, o4, o5, o6, o7, o23, o24, o25, o26, o27, o28, o29, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen29_8(pr,o1, o2, o3, o4, o5, o6, o7, o24, o25, o26, o27, o28, o29, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen29_8(pr,o1, o2, o3, o4, o5, o6, o7, o25, o26, o27, o28, o29, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen29_8(pr,o1, o2, o3, o4, o5, o6, o7, o26, o27, o28, o29, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen29_8(pr,o1, o2, o3, o4, o5, o6, o7, o27, o28, o29, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen29_8(pr,o1, o2, o3, o4, o5, o6, o7, o28, o29, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen29_8(pr,o1, o2, o3, o4, o5, o6, o7, o29, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
	}

	private static final void gen29_8(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29){
		gen29_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
		gen29_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o9);
		gen29_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o9, o10);
		gen29_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o9, o10, o11);
		gen29_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o9, o10, o11, o12);
		gen29_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o9, o10, o11, o12, o13);
		gen29_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o9, o10, o11, o12, o13, o14);
		gen29_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o9, o10, o11, o12, o13, o14, o15);
		gen29_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o9, o10, o11, o12, o13, o14, o15, o16);
		gen29_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen29_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen29_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen29_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o21, o22, o23, o24, o25, o26, o27, o28, o29, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen29_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o22, o23, o24, o25, o26, o27, o28, o29, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen29_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o23, o24, o25, o26, o27, o28, o29, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen29_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o24, o25, o26, o27, o28, o29, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen29_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o25, o26, o27, o28, o29, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen29_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o26, o27, o28, o29, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen29_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o27, o28, o29, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen29_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o28, o29, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen29_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o29, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
	}

	private static final void gen29_9(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29){
		gen29_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
		gen29_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o10);
		gen29_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o10, o11);
		gen29_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o10, o11, o12);
		gen29_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o10, o11, o12, o13);
		gen29_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o10, o11, o12, o13, o14);
		gen29_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o10, o11, o12, o13, o14, o15);
		gen29_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o10, o11, o12, o13, o14, o15, o16);
		gen29_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o10, o11, o12, o13, o14, o15, o16, o17);
		gen29_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen29_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen29_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o21, o22, o23, o24, o25, o26, o27, o28, o29, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen29_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o22, o23, o24, o25, o26, o27, o28, o29, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen29_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o23, o24, o25, o26, o27, o28, o29, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen29_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o24, o25, o26, o27, o28, o29, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen29_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o25, o26, o27, o28, o29, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen29_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o26, o27, o28, o29, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen29_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o27, o28, o29, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen29_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o28, o29, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen29_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o29, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
	}

	private static final void gen29_10(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29){
		gen29_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
		gen29_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o11);
		gen29_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o11, o12);
		gen29_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o11, o12, o13);
		gen29_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o11, o12, o13, o14);
		gen29_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o11, o12, o13, o14, o15);
		gen29_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o11, o12, o13, o14, o15, o16);
		gen29_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o11, o12, o13, o14, o15, o16, o17);
		gen29_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o11, o12, o13, o14, o15, o16, o17, o18);
		gen29_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen29_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o21, o22, o23, o24, o25, o26, o27, o28, o29, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen29_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o22, o23, o24, o25, o26, o27, o28, o29, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen29_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o23, o24, o25, o26, o27, o28, o29, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen29_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o24, o25, o26, o27, o28, o29, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen29_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o25, o26, o27, o28, o29, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen29_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o26, o27, o28, o29, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen29_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o27, o28, o29, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen29_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o28, o29, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen29_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o29, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
	}

	private static final void gen29_11(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29){
		gen29_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
		gen29_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o12);
		gen29_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o12, o13);
		gen29_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o12, o13, o14);
		gen29_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o12, o13, o14, o15);
		gen29_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o12, o13, o14, o15, o16);
		gen29_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o12, o13, o14, o15, o16, o17);
		gen29_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o12, o13, o14, o15, o16, o17, o18);
		gen29_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o12, o13, o14, o15, o16, o17, o18, o19);
		gen29_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o21, o22, o23, o24, o25, o26, o27, o28, o29, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen29_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o22, o23, o24, o25, o26, o27, o28, o29, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen29_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o23, o24, o25, o26, o27, o28, o29, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen29_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o24, o25, o26, o27, o28, o29, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen29_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o25, o26, o27, o28, o29, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen29_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o26, o27, o28, o29, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen29_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o27, o28, o29, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen29_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o28, o29, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen29_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o29, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
	}

	private static final void gen29_12(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29){
		gen29_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
		gen29_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o13);
		gen29_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o13, o14);
		gen29_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o13, o14, o15);
		gen29_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o13, o14, o15, o16);
		gen29_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o13, o14, o15, o16, o17);
		gen29_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o13, o14, o15, o16, o17, o18);
		gen29_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o13, o14, o15, o16, o17, o18, o19);
		gen29_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o21, o22, o23, o24, o25, o26, o27, o28, o29, o13, o14, o15, o16, o17, o18, o19, o20);
		gen29_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o22, o23, o24, o25, o26, o27, o28, o29, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen29_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o23, o24, o25, o26, o27, o28, o29, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen29_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o24, o25, o26, o27, o28, o29, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen29_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o25, o26, o27, o28, o29, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen29_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o26, o27, o28, o29, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen29_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o27, o28, o29, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen29_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o28, o29, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen29_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o29, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
	}

	private static final void gen29_13(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29){
		gen29_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
		gen29_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o14);
		gen29_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o14, o15);
		gen29_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o14, o15, o16);
		gen29_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o14, o15, o16, o17);
		gen29_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o14, o15, o16, o17, o18);
		gen29_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o14, o15, o16, o17, o18, o19);
		gen29_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o21, o22, o23, o24, o25, o26, o27, o28, o29, o14, o15, o16, o17, o18, o19, o20);
		gen29_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o22, o23, o24, o25, o26, o27, o28, o29, o14, o15, o16, o17, o18, o19, o20, o21);
		gen29_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o23, o24, o25, o26, o27, o28, o29, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen29_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o24, o25, o26, o27, o28, o29, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen29_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o25, o26, o27, o28, o29, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen29_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o26, o27, o28, o29, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen29_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o27, o28, o29, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen29_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o28, o29, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen29_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o29, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
	}

	private static final void gen29_14(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29){
		gen29_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
		gen29_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o15);
		gen29_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o15, o16);
		gen29_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o15, o16, o17);
		gen29_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o15, o16, o17, o18);
		gen29_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o15, o16, o17, o18, o19);
		gen29_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o21, o22, o23, o24, o25, o26, o27, o28, o29, o15, o16, o17, o18, o19, o20);
		gen29_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o22, o23, o24, o25, o26, o27, o28, o29, o15, o16, o17, o18, o19, o20, o21);
		gen29_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o23, o24, o25, o26, o27, o28, o29, o15, o16, o17, o18, o19, o20, o21, o22);
		gen29_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o24, o25, o26, o27, o28, o29, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen29_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o25, o26, o27, o28, o29, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen29_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o26, o27, o28, o29, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen29_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o27, o28, o29, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen29_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o28, o29, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen29_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o29, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
	}

	private static final void gen29_15(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29){
		gen29_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
		gen29_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o16);
		gen29_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o16, o17);
		gen29_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o16, o17, o18);
		gen29_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o16, o17, o18, o19);
		gen29_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o21, o22, o23, o24, o25, o26, o27, o28, o29, o16, o17, o18, o19, o20);
		gen29_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o22, o23, o24, o25, o26, o27, o28, o29, o16, o17, o18, o19, o20, o21);
		gen29_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o23, o24, o25, o26, o27, o28, o29, o16, o17, o18, o19, o20, o21, o22);
		gen29_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o24, o25, o26, o27, o28, o29, o16, o17, o18, o19, o20, o21, o22, o23);
		gen29_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o25, o26, o27, o28, o29, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen29_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o26, o27, o28, o29, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen29_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o27, o28, o29, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen29_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o28, o29, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen29_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o29, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
	}

	private static final void gen29_16(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29){
		gen29_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
		gen29_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o17);
		gen29_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o17, o18);
		gen29_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o17, o18, o19);
		gen29_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o21, o22, o23, o24, o25, o26, o27, o28, o29, o17, o18, o19, o20);
		gen29_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o22, o23, o24, o25, o26, o27, o28, o29, o17, o18, o19, o20, o21);
		gen29_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o23, o24, o25, o26, o27, o28, o29, o17, o18, o19, o20, o21, o22);
		gen29_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o24, o25, o26, o27, o28, o29, o17, o18, o19, o20, o21, o22, o23);
		gen29_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o25, o26, o27, o28, o29, o17, o18, o19, o20, o21, o22, o23, o24);
		gen29_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o26, o27, o28, o29, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen29_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o27, o28, o29, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen29_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o28, o29, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen29_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o29, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
	}

	private static final void gen29_17(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29){
		gen29_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
		gen29_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o18);
		gen29_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o18, o19);
		gen29_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o21, o22, o23, o24, o25, o26, o27, o28, o29, o18, o19, o20);
		gen29_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o22, o23, o24, o25, o26, o27, o28, o29, o18, o19, o20, o21);
		gen29_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o23, o24, o25, o26, o27, o28, o29, o18, o19, o20, o21, o22);
		gen29_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o24, o25, o26, o27, o28, o29, o18, o19, o20, o21, o22, o23);
		gen29_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o25, o26, o27, o28, o29, o18, o19, o20, o21, o22, o23, o24);
		gen29_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o26, o27, o28, o29, o18, o19, o20, o21, o22, o23, o24, o25);
		gen29_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o27, o28, o29, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen29_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o28, o29, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen29_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o29, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
	}

	private static final void gen29_18(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29){
		gen29_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
		gen29_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o19);
		gen29_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o21, o22, o23, o24, o25, o26, o27, o28, o29, o19, o20);
		gen29_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o22, o23, o24, o25, o26, o27, o28, o29, o19, o20, o21);
		gen29_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o23, o24, o25, o26, o27, o28, o29, o19, o20, o21, o22);
		gen29_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o24, o25, o26, o27, o28, o29, o19, o20, o21, o22, o23);
		gen29_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o25, o26, o27, o28, o29, o19, o20, o21, o22, o23, o24);
		gen29_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o26, o27, o28, o29, o19, o20, o21, o22, o23, o24, o25);
		gen29_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o27, o28, o29, o19, o20, o21, o22, o23, o24, o25, o26);
		gen29_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o28, o29, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen29_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o29, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
	}

	private static final void gen29_19(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29){
		gen29_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
		gen29_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o21, o22, o23, o24, o25, o26, o27, o28, o29, o20);
		gen29_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o22, o23, o24, o25, o26, o27, o28, o29, o20, o21);
		gen29_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o23, o24, o25, o26, o27, o28, o29, o20, o21, o22);
		gen29_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o24, o25, o26, o27, o28, o29, o20, o21, o22, o23);
		gen29_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o25, o26, o27, o28, o29, o20, o21, o22, o23, o24);
		gen29_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o26, o27, o28, o29, o20, o21, o22, o23, o24, o25);
		gen29_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o27, o28, o29, o20, o21, o22, o23, o24, o25, o26);
		gen29_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o28, o29, o20, o21, o22, o23, o24, o25, o26, o27);
		gen29_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o29, o20, o21, o22, o23, o24, o25, o26, o27, o28);
	}

	private static final void gen29_20(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29){
		gen29_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
		gen29_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o22, o23, o24, o25, o26, o27, o28, o29, o21);
		gen29_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o23, o24, o25, o26, o27, o28, o29, o21, o22);
		gen29_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o24, o25, o26, o27, o28, o29, o21, o22, o23);
		gen29_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o25, o26, o27, o28, o29, o21, o22, o23, o24);
		gen29_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o26, o27, o28, o29, o21, o22, o23, o24, o25);
		gen29_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o27, o28, o29, o21, o22, o23, o24, o25, o26);
		gen29_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o28, o29, o21, o22, o23, o24, o25, o26, o27);
		gen29_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o29, o21, o22, o23, o24, o25, o26, o27, o28);
	}

	private static final void gen29_21(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29){
		gen29_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
		gen29_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o23, o24, o25, o26, o27, o28, o29, o22);
		gen29_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o24, o25, o26, o27, o28, o29, o22, o23);
		gen29_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o25, o26, o27, o28, o29, o22, o23, o24);
		gen29_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o26, o27, o28, o29, o22, o23, o24, o25);
		gen29_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o27, o28, o29, o22, o23, o24, o25, o26);
		gen29_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o28, o29, o22, o23, o24, o25, o26, o27);
		gen29_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o29, o22, o23, o24, o25, o26, o27, o28);
	}

	private static final void gen29_22(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29){
		gen29_23(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
		gen29_23(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o24, o25, o26, o27, o28, o29, o23);
		gen29_23(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o25, o26, o27, o28, o29, o23, o24);
		gen29_23(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o26, o27, o28, o29, o23, o24, o25);
		gen29_23(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o27, o28, o29, o23, o24, o25, o26);
		gen29_23(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o28, o29, o23, o24, o25, o26, o27);
		gen29_23(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o29, o23, o24, o25, o26, o27, o28);
	}

	private static final void gen29_23(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29){
		gen29_24(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
		gen29_24(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o25, o26, o27, o28, o29, o24);
		gen29_24(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o26, o27, o28, o29, o24, o25);
		gen29_24(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o27, o28, o29, o24, o25, o26);
		gen29_24(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o28, o29, o24, o25, o26, o27);
		gen29_24(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o29, o24, o25, o26, o27, o28);
	}

	private static final void gen29_24(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29){
		gen29_25(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
		gen29_25(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o26, o27, o28, o29, o25);
		gen29_25(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o27, o28, o29, o25, o26);
		gen29_25(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o28, o29, o25, o26, o27);
		gen29_25(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o29, o25, o26, o27, o28);
	}

	private static final void gen29_25(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29){
		gen29_26(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
		gen29_26(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o27, o28, o29, o26);
		gen29_26(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o28, o29, o26, o27);
		gen29_26(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o29, o26, o27, o28);
	}

	private static final void gen29_26(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29){
		gen29_27(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
		gen29_27(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o28, o29, o27);
		gen29_27(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o29, o27, o28);
	}

	private static final void gen29_27(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29){
		pr.recieve29(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
		pr.recieve29(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o29, o28);
	}

	private static final void gen30_0(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29, Object o30){
		gen30_1(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30);
		gen30_1(pr,o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o1);
		gen30_1(pr,o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o1, o2);
		gen30_1(pr,o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o1, o2, o3);
		gen30_1(pr,o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o1, o2, o3, o4);
		gen30_1(pr,o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o1, o2, o3, o4, o5);
		gen30_1(pr,o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o1, o2, o3, o4, o5, o6);
		gen30_1(pr,o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o1, o2, o3, o4, o5, o6, o7);
		gen30_1(pr,o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o1, o2, o3, o4, o5, o6, o7, o8);
		gen30_1(pr,o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o1, o2, o3, o4, o5, o6, o7, o8, o9);
		gen30_1(pr,o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen30_1(pr,o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen30_1(pr,o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen30_1(pr,o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen30_1(pr,o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen30_1(pr,o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen30_1(pr,o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen30_1(pr,o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen30_1(pr,o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen30_1(pr,o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen30_1(pr,o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen30_1(pr,o22, o23, o24, o25, o26, o27, o28, o29, o30, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen30_1(pr,o23, o24, o25, o26, o27, o28, o29, o30, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen30_1(pr,o24, o25, o26, o27, o28, o29, o30, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen30_1(pr,o25, o26, o27, o28, o29, o30, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen30_1(pr,o26, o27, o28, o29, o30, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen30_1(pr,o27, o28, o29, o30, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen30_1(pr,o28, o29, o30, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen30_1(pr,o29, o30, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen30_1(pr,o30, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
	}

	private static final void gen30_1(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29, Object o30){
		gen30_2(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30);
		gen30_2(pr,o1, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o2);
		gen30_2(pr,o1, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o2, o3);
		gen30_2(pr,o1, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o2, o3, o4);
		gen30_2(pr,o1, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o2, o3, o4, o5);
		gen30_2(pr,o1, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o2, o3, o4, o5, o6);
		gen30_2(pr,o1, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o2, o3, o4, o5, o6, o7);
		gen30_2(pr,o1, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o2, o3, o4, o5, o6, o7, o8);
		gen30_2(pr,o1, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o2, o3, o4, o5, o6, o7, o8, o9);
		gen30_2(pr,o1, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o2, o3, o4, o5, o6, o7, o8, o9, o10);
		gen30_2(pr,o1, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen30_2(pr,o1, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen30_2(pr,o1, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen30_2(pr,o1, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen30_2(pr,o1, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen30_2(pr,o1, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen30_2(pr,o1, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen30_2(pr,o1, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen30_2(pr,o1, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen30_2(pr,o1, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen30_2(pr,o1, o22, o23, o24, o25, o26, o27, o28, o29, o30, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen30_2(pr,o1, o23, o24, o25, o26, o27, o28, o29, o30, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen30_2(pr,o1, o24, o25, o26, o27, o28, o29, o30, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen30_2(pr,o1, o25, o26, o27, o28, o29, o30, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen30_2(pr,o1, o26, o27, o28, o29, o30, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen30_2(pr,o1, o27, o28, o29, o30, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen30_2(pr,o1, o28, o29, o30, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen30_2(pr,o1, o29, o30, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen30_2(pr,o1, o30, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
	}

	private static final void gen30_2(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29, Object o30){
		gen30_3(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30);
		gen30_3(pr,o1, o2, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o3);
		gen30_3(pr,o1, o2, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o3, o4);
		gen30_3(pr,o1, o2, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o3, o4, o5);
		gen30_3(pr,o1, o2, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o3, o4, o5, o6);
		gen30_3(pr,o1, o2, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o3, o4, o5, o6, o7);
		gen30_3(pr,o1, o2, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o3, o4, o5, o6, o7, o8);
		gen30_3(pr,o1, o2, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o3, o4, o5, o6, o7, o8, o9);
		gen30_3(pr,o1, o2, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o3, o4, o5, o6, o7, o8, o9, o10);
		gen30_3(pr,o1, o2, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o3, o4, o5, o6, o7, o8, o9, o10, o11);
		gen30_3(pr,o1, o2, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen30_3(pr,o1, o2, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen30_3(pr,o1, o2, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen30_3(pr,o1, o2, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen30_3(pr,o1, o2, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen30_3(pr,o1, o2, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen30_3(pr,o1, o2, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen30_3(pr,o1, o2, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen30_3(pr,o1, o2, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen30_3(pr,o1, o2, o22, o23, o24, o25, o26, o27, o28, o29, o30, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen30_3(pr,o1, o2, o23, o24, o25, o26, o27, o28, o29, o30, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen30_3(pr,o1, o2, o24, o25, o26, o27, o28, o29, o30, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen30_3(pr,o1, o2, o25, o26, o27, o28, o29, o30, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen30_3(pr,o1, o2, o26, o27, o28, o29, o30, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen30_3(pr,o1, o2, o27, o28, o29, o30, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen30_3(pr,o1, o2, o28, o29, o30, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen30_3(pr,o1, o2, o29, o30, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen30_3(pr,o1, o2, o30, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
	}

	private static final void gen30_3(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29, Object o30){
		gen30_4(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30);
		gen30_4(pr,o1, o2, o3, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o4);
		gen30_4(pr,o1, o2, o3, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o4, o5);
		gen30_4(pr,o1, o2, o3, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o4, o5, o6);
		gen30_4(pr,o1, o2, o3, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o4, o5, o6, o7);
		gen30_4(pr,o1, o2, o3, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o4, o5, o6, o7, o8);
		gen30_4(pr,o1, o2, o3, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o4, o5, o6, o7, o8, o9);
		gen30_4(pr,o1, o2, o3, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o4, o5, o6, o7, o8, o9, o10);
		gen30_4(pr,o1, o2, o3, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o4, o5, o6, o7, o8, o9, o10, o11);
		gen30_4(pr,o1, o2, o3, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o4, o5, o6, o7, o8, o9, o10, o11, o12);
		gen30_4(pr,o1, o2, o3, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen30_4(pr,o1, o2, o3, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen30_4(pr,o1, o2, o3, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen30_4(pr,o1, o2, o3, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen30_4(pr,o1, o2, o3, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen30_4(pr,o1, o2, o3, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen30_4(pr,o1, o2, o3, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen30_4(pr,o1, o2, o3, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen30_4(pr,o1, o2, o3, o22, o23, o24, o25, o26, o27, o28, o29, o30, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen30_4(pr,o1, o2, o3, o23, o24, o25, o26, o27, o28, o29, o30, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen30_4(pr,o1, o2, o3, o24, o25, o26, o27, o28, o29, o30, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen30_4(pr,o1, o2, o3, o25, o26, o27, o28, o29, o30, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen30_4(pr,o1, o2, o3, o26, o27, o28, o29, o30, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen30_4(pr,o1, o2, o3, o27, o28, o29, o30, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen30_4(pr,o1, o2, o3, o28, o29, o30, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen30_4(pr,o1, o2, o3, o29, o30, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen30_4(pr,o1, o2, o3, o30, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
	}

	private static final void gen30_4(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29, Object o30){
		gen30_5(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30);
		gen30_5(pr,o1, o2, o3, o4, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o5);
		gen30_5(pr,o1, o2, o3, o4, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o5, o6);
		gen30_5(pr,o1, o2, o3, o4, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o5, o6, o7);
		gen30_5(pr,o1, o2, o3, o4, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o5, o6, o7, o8);
		gen30_5(pr,o1, o2, o3, o4, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o5, o6, o7, o8, o9);
		gen30_5(pr,o1, o2, o3, o4, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o5, o6, o7, o8, o9, o10);
		gen30_5(pr,o1, o2, o3, o4, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o5, o6, o7, o8, o9, o10, o11);
		gen30_5(pr,o1, o2, o3, o4, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o5, o6, o7, o8, o9, o10, o11, o12);
		gen30_5(pr,o1, o2, o3, o4, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o5, o6, o7, o8, o9, o10, o11, o12, o13);
		gen30_5(pr,o1, o2, o3, o4, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen30_5(pr,o1, o2, o3, o4, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen30_5(pr,o1, o2, o3, o4, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen30_5(pr,o1, o2, o3, o4, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen30_5(pr,o1, o2, o3, o4, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen30_5(pr,o1, o2, o3, o4, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen30_5(pr,o1, o2, o3, o4, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen30_5(pr,o1, o2, o3, o4, o22, o23, o24, o25, o26, o27, o28, o29, o30, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen30_5(pr,o1, o2, o3, o4, o23, o24, o25, o26, o27, o28, o29, o30, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen30_5(pr,o1, o2, o3, o4, o24, o25, o26, o27, o28, o29, o30, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen30_5(pr,o1, o2, o3, o4, o25, o26, o27, o28, o29, o30, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen30_5(pr,o1, o2, o3, o4, o26, o27, o28, o29, o30, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen30_5(pr,o1, o2, o3, o4, o27, o28, o29, o30, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen30_5(pr,o1, o2, o3, o4, o28, o29, o30, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen30_5(pr,o1, o2, o3, o4, o29, o30, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen30_5(pr,o1, o2, o3, o4, o30, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
	}

	private static final void gen30_5(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29, Object o30){
		gen30_6(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30);
		gen30_6(pr,o1, o2, o3, o4, o5, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o6);
		gen30_6(pr,o1, o2, o3, o4, o5, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o6, o7);
		gen30_6(pr,o1, o2, o3, o4, o5, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o6, o7, o8);
		gen30_6(pr,o1, o2, o3, o4, o5, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o6, o7, o8, o9);
		gen30_6(pr,o1, o2, o3, o4, o5, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o6, o7, o8, o9, o10);
		gen30_6(pr,o1, o2, o3, o4, o5, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o6, o7, o8, o9, o10, o11);
		gen30_6(pr,o1, o2, o3, o4, o5, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o6, o7, o8, o9, o10, o11, o12);
		gen30_6(pr,o1, o2, o3, o4, o5, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o6, o7, o8, o9, o10, o11, o12, o13);
		gen30_6(pr,o1, o2, o3, o4, o5, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o6, o7, o8, o9, o10, o11, o12, o13, o14);
		gen30_6(pr,o1, o2, o3, o4, o5, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen30_6(pr,o1, o2, o3, o4, o5, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen30_6(pr,o1, o2, o3, o4, o5, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen30_6(pr,o1, o2, o3, o4, o5, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen30_6(pr,o1, o2, o3, o4, o5, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen30_6(pr,o1, o2, o3, o4, o5, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen30_6(pr,o1, o2, o3, o4, o5, o22, o23, o24, o25, o26, o27, o28, o29, o30, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen30_6(pr,o1, o2, o3, o4, o5, o23, o24, o25, o26, o27, o28, o29, o30, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen30_6(pr,o1, o2, o3, o4, o5, o24, o25, o26, o27, o28, o29, o30, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen30_6(pr,o1, o2, o3, o4, o5, o25, o26, o27, o28, o29, o30, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen30_6(pr,o1, o2, o3, o4, o5, o26, o27, o28, o29, o30, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen30_6(pr,o1, o2, o3, o4, o5, o27, o28, o29, o30, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen30_6(pr,o1, o2, o3, o4, o5, o28, o29, o30, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen30_6(pr,o1, o2, o3, o4, o5, o29, o30, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen30_6(pr,o1, o2, o3, o4, o5, o30, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
	}

	private static final void gen30_6(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29, Object o30){
		gen30_7(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30);
		gen30_7(pr,o1, o2, o3, o4, o5, o6, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o7);
		gen30_7(pr,o1, o2, o3, o4, o5, o6, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o7, o8);
		gen30_7(pr,o1, o2, o3, o4, o5, o6, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o7, o8, o9);
		gen30_7(pr,o1, o2, o3, o4, o5, o6, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o7, o8, o9, o10);
		gen30_7(pr,o1, o2, o3, o4, o5, o6, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o7, o8, o9, o10, o11);
		gen30_7(pr,o1, o2, o3, o4, o5, o6, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o7, o8, o9, o10, o11, o12);
		gen30_7(pr,o1, o2, o3, o4, o5, o6, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o7, o8, o9, o10, o11, o12, o13);
		gen30_7(pr,o1, o2, o3, o4, o5, o6, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o7, o8, o9, o10, o11, o12, o13, o14);
		gen30_7(pr,o1, o2, o3, o4, o5, o6, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o7, o8, o9, o10, o11, o12, o13, o14, o15);
		gen30_7(pr,o1, o2, o3, o4, o5, o6, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen30_7(pr,o1, o2, o3, o4, o5, o6, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen30_7(pr,o1, o2, o3, o4, o5, o6, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen30_7(pr,o1, o2, o3, o4, o5, o6, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen30_7(pr,o1, o2, o3, o4, o5, o6, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen30_7(pr,o1, o2, o3, o4, o5, o6, o22, o23, o24, o25, o26, o27, o28, o29, o30, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen30_7(pr,o1, o2, o3, o4, o5, o6, o23, o24, o25, o26, o27, o28, o29, o30, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen30_7(pr,o1, o2, o3, o4, o5, o6, o24, o25, o26, o27, o28, o29, o30, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen30_7(pr,o1, o2, o3, o4, o5, o6, o25, o26, o27, o28, o29, o30, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen30_7(pr,o1, o2, o3, o4, o5, o6, o26, o27, o28, o29, o30, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen30_7(pr,o1, o2, o3, o4, o5, o6, o27, o28, o29, o30, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen30_7(pr,o1, o2, o3, o4, o5, o6, o28, o29, o30, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen30_7(pr,o1, o2, o3, o4, o5, o6, o29, o30, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen30_7(pr,o1, o2, o3, o4, o5, o6, o30, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
	}

	private static final void gen30_7(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29, Object o30){
		gen30_8(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30);
		gen30_8(pr,o1, o2, o3, o4, o5, o6, o7, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o8);
		gen30_8(pr,o1, o2, o3, o4, o5, o6, o7, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o8, o9);
		gen30_8(pr,o1, o2, o3, o4, o5, o6, o7, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o8, o9, o10);
		gen30_8(pr,o1, o2, o3, o4, o5, o6, o7, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o8, o9, o10, o11);
		gen30_8(pr,o1, o2, o3, o4, o5, o6, o7, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o8, o9, o10, o11, o12);
		gen30_8(pr,o1, o2, o3, o4, o5, o6, o7, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o8, o9, o10, o11, o12, o13);
		gen30_8(pr,o1, o2, o3, o4, o5, o6, o7, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o8, o9, o10, o11, o12, o13, o14);
		gen30_8(pr,o1, o2, o3, o4, o5, o6, o7, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o8, o9, o10, o11, o12, o13, o14, o15);
		gen30_8(pr,o1, o2, o3, o4, o5, o6, o7, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o8, o9, o10, o11, o12, o13, o14, o15, o16);
		gen30_8(pr,o1, o2, o3, o4, o5, o6, o7, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen30_8(pr,o1, o2, o3, o4, o5, o6, o7, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen30_8(pr,o1, o2, o3, o4, o5, o6, o7, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen30_8(pr,o1, o2, o3, o4, o5, o6, o7, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen30_8(pr,o1, o2, o3, o4, o5, o6, o7, o22, o23, o24, o25, o26, o27, o28, o29, o30, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen30_8(pr,o1, o2, o3, o4, o5, o6, o7, o23, o24, o25, o26, o27, o28, o29, o30, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen30_8(pr,o1, o2, o3, o4, o5, o6, o7, o24, o25, o26, o27, o28, o29, o30, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen30_8(pr,o1, o2, o3, o4, o5, o6, o7, o25, o26, o27, o28, o29, o30, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen30_8(pr,o1, o2, o3, o4, o5, o6, o7, o26, o27, o28, o29, o30, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen30_8(pr,o1, o2, o3, o4, o5, o6, o7, o27, o28, o29, o30, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen30_8(pr,o1, o2, o3, o4, o5, o6, o7, o28, o29, o30, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen30_8(pr,o1, o2, o3, o4, o5, o6, o7, o29, o30, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen30_8(pr,o1, o2, o3, o4, o5, o6, o7, o30, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
	}

	private static final void gen30_8(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29, Object o30){
		gen30_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30);
		gen30_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o9);
		gen30_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o9, o10);
		gen30_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o9, o10, o11);
		gen30_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o9, o10, o11, o12);
		gen30_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o9, o10, o11, o12, o13);
		gen30_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o9, o10, o11, o12, o13, o14);
		gen30_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o9, o10, o11, o12, o13, o14, o15);
		gen30_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o9, o10, o11, o12, o13, o14, o15, o16);
		gen30_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o9, o10, o11, o12, o13, o14, o15, o16, o17);
		gen30_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen30_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen30_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen30_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o22, o23, o24, o25, o26, o27, o28, o29, o30, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen30_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o23, o24, o25, o26, o27, o28, o29, o30, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen30_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o24, o25, o26, o27, o28, o29, o30, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen30_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o25, o26, o27, o28, o29, o30, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen30_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o26, o27, o28, o29, o30, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen30_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o27, o28, o29, o30, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen30_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o28, o29, o30, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen30_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o29, o30, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen30_9(pr,o1, o2, o3, o4, o5, o6, o7, o8, o30, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
	}

	private static final void gen30_9(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29, Object o30){
		gen30_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30);
		gen30_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o10);
		gen30_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o10, o11);
		gen30_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o10, o11, o12);
		gen30_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o10, o11, o12, o13);
		gen30_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o10, o11, o12, o13, o14);
		gen30_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o10, o11, o12, o13, o14, o15);
		gen30_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o10, o11, o12, o13, o14, o15, o16);
		gen30_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o10, o11, o12, o13, o14, o15, o16, o17);
		gen30_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o10, o11, o12, o13, o14, o15, o16, o17, o18);
		gen30_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen30_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen30_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o22, o23, o24, o25, o26, o27, o28, o29, o30, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen30_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o23, o24, o25, o26, o27, o28, o29, o30, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen30_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o24, o25, o26, o27, o28, o29, o30, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen30_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o25, o26, o27, o28, o29, o30, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen30_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o26, o27, o28, o29, o30, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen30_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o27, o28, o29, o30, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen30_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o28, o29, o30, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen30_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o29, o30, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen30_10(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o30, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
	}

	private static final void gen30_10(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29, Object o30){
		gen30_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30);
		gen30_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o11);
		gen30_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o11, o12);
		gen30_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o11, o12, o13);
		gen30_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o11, o12, o13, o14);
		gen30_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o11, o12, o13, o14, o15);
		gen30_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o11, o12, o13, o14, o15, o16);
		gen30_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o11, o12, o13, o14, o15, o16, o17);
		gen30_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o11, o12, o13, o14, o15, o16, o17, o18);
		gen30_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o11, o12, o13, o14, o15, o16, o17, o18, o19);
		gen30_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen30_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o22, o23, o24, o25, o26, o27, o28, o29, o30, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen30_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o23, o24, o25, o26, o27, o28, o29, o30, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen30_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o24, o25, o26, o27, o28, o29, o30, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen30_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o25, o26, o27, o28, o29, o30, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen30_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o26, o27, o28, o29, o30, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen30_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o27, o28, o29, o30, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen30_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o28, o29, o30, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen30_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o29, o30, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen30_11(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o30, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
	}

	private static final void gen30_11(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29, Object o30){
		gen30_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30);
		gen30_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o12);
		gen30_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o12, o13);
		gen30_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o12, o13, o14);
		gen30_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o12, o13, o14, o15);
		gen30_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o12, o13, o14, o15, o16);
		gen30_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o12, o13, o14, o15, o16, o17);
		gen30_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o12, o13, o14, o15, o16, o17, o18);
		gen30_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o12, o13, o14, o15, o16, o17, o18, o19);
		gen30_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o12, o13, o14, o15, o16, o17, o18, o19, o20);
		gen30_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o22, o23, o24, o25, o26, o27, o28, o29, o30, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen30_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o23, o24, o25, o26, o27, o28, o29, o30, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen30_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o24, o25, o26, o27, o28, o29, o30, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen30_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o25, o26, o27, o28, o29, o30, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen30_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o26, o27, o28, o29, o30, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen30_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o27, o28, o29, o30, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen30_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o28, o29, o30, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen30_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o29, o30, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen30_12(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o30, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
	}

	private static final void gen30_12(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29, Object o30){
		gen30_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30);
		gen30_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o13);
		gen30_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o13, o14);
		gen30_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o13, o14, o15);
		gen30_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o13, o14, o15, o16);
		gen30_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o13, o14, o15, o16, o17);
		gen30_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o13, o14, o15, o16, o17, o18);
		gen30_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o13, o14, o15, o16, o17, o18, o19);
		gen30_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o13, o14, o15, o16, o17, o18, o19, o20);
		gen30_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o22, o23, o24, o25, o26, o27, o28, o29, o30, o13, o14, o15, o16, o17, o18, o19, o20, o21);
		gen30_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o23, o24, o25, o26, o27, o28, o29, o30, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen30_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o24, o25, o26, o27, o28, o29, o30, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen30_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o25, o26, o27, o28, o29, o30, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen30_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o26, o27, o28, o29, o30, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen30_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o27, o28, o29, o30, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen30_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o28, o29, o30, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen30_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o29, o30, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen30_13(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o30, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
	}

	private static final void gen30_13(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29, Object o30){
		gen30_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30);
		gen30_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o14);
		gen30_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o14, o15);
		gen30_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o14, o15, o16);
		gen30_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o14, o15, o16, o17);
		gen30_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o14, o15, o16, o17, o18);
		gen30_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o14, o15, o16, o17, o18, o19);
		gen30_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o14, o15, o16, o17, o18, o19, o20);
		gen30_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o22, o23, o24, o25, o26, o27, o28, o29, o30, o14, o15, o16, o17, o18, o19, o20, o21);
		gen30_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o23, o24, o25, o26, o27, o28, o29, o30, o14, o15, o16, o17, o18, o19, o20, o21, o22);
		gen30_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o24, o25, o26, o27, o28, o29, o30, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen30_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o25, o26, o27, o28, o29, o30, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen30_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o26, o27, o28, o29, o30, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen30_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o27, o28, o29, o30, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen30_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o28, o29, o30, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen30_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o29, o30, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen30_14(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o30, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
	}

	private static final void gen30_14(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29, Object o30){
		gen30_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30);
		gen30_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o15);
		gen30_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o15, o16);
		gen30_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o15, o16, o17);
		gen30_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o15, o16, o17, o18);
		gen30_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o15, o16, o17, o18, o19);
		gen30_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o15, o16, o17, o18, o19, o20);
		gen30_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o22, o23, o24, o25, o26, o27, o28, o29, o30, o15, o16, o17, o18, o19, o20, o21);
		gen30_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o23, o24, o25, o26, o27, o28, o29, o30, o15, o16, o17, o18, o19, o20, o21, o22);
		gen30_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o24, o25, o26, o27, o28, o29, o30, o15, o16, o17, o18, o19, o20, o21, o22, o23);
		gen30_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o25, o26, o27, o28, o29, o30, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen30_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o26, o27, o28, o29, o30, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen30_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o27, o28, o29, o30, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen30_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o28, o29, o30, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen30_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o29, o30, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen30_15(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o30, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
	}

	private static final void gen30_15(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29, Object o30){
		gen30_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30);
		gen30_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o16);
		gen30_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o16, o17);
		gen30_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o16, o17, o18);
		gen30_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o16, o17, o18, o19);
		gen30_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o16, o17, o18, o19, o20);
		gen30_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o22, o23, o24, o25, o26, o27, o28, o29, o30, o16, o17, o18, o19, o20, o21);
		gen30_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o23, o24, o25, o26, o27, o28, o29, o30, o16, o17, o18, o19, o20, o21, o22);
		gen30_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o24, o25, o26, o27, o28, o29, o30, o16, o17, o18, o19, o20, o21, o22, o23);
		gen30_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o25, o26, o27, o28, o29, o30, o16, o17, o18, o19, o20, o21, o22, o23, o24);
		gen30_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o26, o27, o28, o29, o30, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen30_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o27, o28, o29, o30, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen30_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o28, o29, o30, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen30_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o29, o30, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen30_16(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o30, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
	}

	private static final void gen30_16(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29, Object o30){
		gen30_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30);
		gen30_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o17);
		gen30_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o17, o18);
		gen30_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o17, o18, o19);
		gen30_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o17, o18, o19, o20);
		gen30_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o22, o23, o24, o25, o26, o27, o28, o29, o30, o17, o18, o19, o20, o21);
		gen30_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o23, o24, o25, o26, o27, o28, o29, o30, o17, o18, o19, o20, o21, o22);
		gen30_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o24, o25, o26, o27, o28, o29, o30, o17, o18, o19, o20, o21, o22, o23);
		gen30_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o25, o26, o27, o28, o29, o30, o17, o18, o19, o20, o21, o22, o23, o24);
		gen30_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o26, o27, o28, o29, o30, o17, o18, o19, o20, o21, o22, o23, o24, o25);
		gen30_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o27, o28, o29, o30, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen30_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o28, o29, o30, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen30_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o29, o30, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen30_17(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o30, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
	}

	private static final void gen30_17(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29, Object o30){
		gen30_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30);
		gen30_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o18);
		gen30_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o18, o19);
		gen30_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o18, o19, o20);
		gen30_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o22, o23, o24, o25, o26, o27, o28, o29, o30, o18, o19, o20, o21);
		gen30_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o23, o24, o25, o26, o27, o28, o29, o30, o18, o19, o20, o21, o22);
		gen30_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o24, o25, o26, o27, o28, o29, o30, o18, o19, o20, o21, o22, o23);
		gen30_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o25, o26, o27, o28, o29, o30, o18, o19, o20, o21, o22, o23, o24);
		gen30_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o26, o27, o28, o29, o30, o18, o19, o20, o21, o22, o23, o24, o25);
		gen30_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o27, o28, o29, o30, o18, o19, o20, o21, o22, o23, o24, o25, o26);
		gen30_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o28, o29, o30, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen30_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o29, o30, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen30_18(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o30, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
	}

	private static final void gen30_18(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29, Object o30){
		gen30_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30);
		gen30_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o19);
		gen30_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o19, o20);
		gen30_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o22, o23, o24, o25, o26, o27, o28, o29, o30, o19, o20, o21);
		gen30_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o23, o24, o25, o26, o27, o28, o29, o30, o19, o20, o21, o22);
		gen30_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o24, o25, o26, o27, o28, o29, o30, o19, o20, o21, o22, o23);
		gen30_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o25, o26, o27, o28, o29, o30, o19, o20, o21, o22, o23, o24);
		gen30_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o26, o27, o28, o29, o30, o19, o20, o21, o22, o23, o24, o25);
		gen30_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o27, o28, o29, o30, o19, o20, o21, o22, o23, o24, o25, o26);
		gen30_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o28, o29, o30, o19, o20, o21, o22, o23, o24, o25, o26, o27);
		gen30_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o29, o30, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen30_19(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o30, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
	}

	private static final void gen30_19(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29, Object o30){
		gen30_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30);
		gen30_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o20);
		gen30_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o22, o23, o24, o25, o26, o27, o28, o29, o30, o20, o21);
		gen30_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o23, o24, o25, o26, o27, o28, o29, o30, o20, o21, o22);
		gen30_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o24, o25, o26, o27, o28, o29, o30, o20, o21, o22, o23);
		gen30_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o25, o26, o27, o28, o29, o30, o20, o21, o22, o23, o24);
		gen30_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o26, o27, o28, o29, o30, o20, o21, o22, o23, o24, o25);
		gen30_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o27, o28, o29, o30, o20, o21, o22, o23, o24, o25, o26);
		gen30_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o28, o29, o30, o20, o21, o22, o23, o24, o25, o26, o27);
		gen30_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o29, o30, o20, o21, o22, o23, o24, o25, o26, o27, o28);
		gen30_20(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o30, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29);
	}

	private static final void gen30_20(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29, Object o30){
		gen30_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30);
		gen30_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o22, o23, o24, o25, o26, o27, o28, o29, o30, o21);
		gen30_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o23, o24, o25, o26, o27, o28, o29, o30, o21, o22);
		gen30_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o24, o25, o26, o27, o28, o29, o30, o21, o22, o23);
		gen30_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o25, o26, o27, o28, o29, o30, o21, o22, o23, o24);
		gen30_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o26, o27, o28, o29, o30, o21, o22, o23, o24, o25);
		gen30_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o27, o28, o29, o30, o21, o22, o23, o24, o25, o26);
		gen30_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o28, o29, o30, o21, o22, o23, o24, o25, o26, o27);
		gen30_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o29, o30, o21, o22, o23, o24, o25, o26, o27, o28);
		gen30_21(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o30, o21, o22, o23, o24, o25, o26, o27, o28, o29);
	}

	private static final void gen30_21(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29, Object o30){
		gen30_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30);
		gen30_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o23, o24, o25, o26, o27, o28, o29, o30, o22);
		gen30_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o24, o25, o26, o27, o28, o29, o30, o22, o23);
		gen30_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o25, o26, o27, o28, o29, o30, o22, o23, o24);
		gen30_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o26, o27, o28, o29, o30, o22, o23, o24, o25);
		gen30_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o27, o28, o29, o30, o22, o23, o24, o25, o26);
		gen30_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o28, o29, o30, o22, o23, o24, o25, o26, o27);
		gen30_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o29, o30, o22, o23, o24, o25, o26, o27, o28);
		gen30_22(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o30, o22, o23, o24, o25, o26, o27, o28, o29);
	}

	private static final void gen30_22(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29, Object o30){
		gen30_23(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30);
		gen30_23(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o24, o25, o26, o27, o28, o29, o30, o23);
		gen30_23(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o25, o26, o27, o28, o29, o30, o23, o24);
		gen30_23(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o26, o27, o28, o29, o30, o23, o24, o25);
		gen30_23(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o27, o28, o29, o30, o23, o24, o25, o26);
		gen30_23(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o28, o29, o30, o23, o24, o25, o26, o27);
		gen30_23(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o29, o30, o23, o24, o25, o26, o27, o28);
		gen30_23(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o30, o23, o24, o25, o26, o27, o28, o29);
	}

	private static final void gen30_23(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29, Object o30){
		gen30_24(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30);
		gen30_24(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o25, o26, o27, o28, o29, o30, o24);
		gen30_24(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o26, o27, o28, o29, o30, o24, o25);
		gen30_24(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o27, o28, o29, o30, o24, o25, o26);
		gen30_24(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o28, o29, o30, o24, o25, o26, o27);
		gen30_24(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o29, o30, o24, o25, o26, o27, o28);
		gen30_24(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o30, o24, o25, o26, o27, o28, o29);
	}

	private static final void gen30_24(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29, Object o30){
		gen30_25(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30);
		gen30_25(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o26, o27, o28, o29, o30, o25);
		gen30_25(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o27, o28, o29, o30, o25, o26);
		gen30_25(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o28, o29, o30, o25, o26, o27);
		gen30_25(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o29, o30, o25, o26, o27, o28);
		gen30_25(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o30, o25, o26, o27, o28, o29);
	}

	private static final void gen30_25(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29, Object o30){
		gen30_26(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30);
		gen30_26(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o27, o28, o29, o30, o26);
		gen30_26(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o28, o29, o30, o26, o27);
		gen30_26(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o29, o30, o26, o27, o28);
		gen30_26(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o30, o26, o27, o28, o29);
	}

	private static final void gen30_26(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29, Object o30){
		gen30_27(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30);
		gen30_27(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o28, o29, o30, o27);
		gen30_27(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o29, o30, o27, o28);
		gen30_27(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o30, o27, o28, o29);
	}

	private static final void gen30_27(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29, Object o30){
		gen30_28(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30);
		gen30_28(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o29, o30, o28);
		gen30_28(pr,o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o30, o28, o29);
	}

	private static final void gen30_28(PermutationRecieverObject pr,Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13, Object o14, Object o15, Object o16, Object o17, Object o18, Object o19, Object o20, Object o21, Object o22, Object o23, Object o24, Object o25, Object o26, Object o27, Object o28, Object o29, Object o30){
		pr.recieve30(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30);
		pr.recieve30(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o30, o29);
	}

}