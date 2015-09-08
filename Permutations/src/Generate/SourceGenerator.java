package Generate;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class SourceGenerator {

	
	/**
	 * so many hate generics after all ;]
	 */
	static String typeString="Object"; //"String", "Integer", "Object" ...
	static String variableName="o";
	
	
	//cosmetic measure
	static String upperCaseTypeString=typeString.substring(0, 1).toUpperCase()+typeString.substring(1, typeString.length());
	
	static int n=30; //sets how many permutation elements are considered
	static BufferedWriter out_p,out_i;
	static{
		try {
			File dir = new File("src//Permute//"+upperCaseTypeString);
			if (!dir.exists())
				dir.mkdirs();
			
			File interfaceFile = new File("src//Permute//"+upperCaseTypeString+"//PermutationGenerator"+upperCaseTypeString+".java");
			out_p = new BufferedWriter(new FileWriter(interfaceFile));
			
			File permutationFile = new File("src//Permute//"+upperCaseTypeString+"//PermutationReciever"+upperCaseTypeString+".java");
			out_i = new BufferedWriter(new FileWriter(permutationFile));	
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		try {
			
			//Generate permutation class
			genInterface();
			
			//Generate permutation class
			genPermutaitons();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	public static void genInterface() throws IOException{
		
		out_i.write("package Permute."+upperCaseTypeString+";\n"
				+ "\npublic interface PermutationReciever"+upperCaseTypeString+" {\n\n");
		
		for(int i=2;i<=n;i++){
			
			out_i.write("\tpublic void recieve"+i+"(");
			for(int j=1;j<i;j++)
				out_i.write(typeString+" "+variableName+j+", ");
			out_i.write(typeString+" "+variableName+i);
			out_i.write(");\n");
			out_i.write("\n");
		}
		
		out_i.write("}"); //closing bracket
		out_i.close();
	}
	
	public static void genPermutaitons() throws IOException{
		
		//package and function declaration
		out_p.write("package Permute."+upperCaseTypeString+";\n"
				+ "\npublic class PermutationGenerator"+upperCaseTypeString+" {\n");
			
		genConstructor();
		genBody();
		
		out_p.write("}"); //closing bracket
		out_p.close();
	}
	
	public static void genConstructor() throws IOException{
				
		out_p.write("\n\tpublic static void permute (PermutationReciever"+upperCaseTypeString+" pr,"+typeString+"[] "+variableName+"){\n\n");
		
		for(int i=2;i<=n;i++){
			
			out_p.write("\t\tif("+variableName+".length=="+i+"){\n");
			out_p.write("\t\t\tgen"+i+"_0(pr,");
			for(int j=1;j<i;j++){
				out_p.write(variableName+"["+(j-1)+"], ");
			}
			
			out_p.write(variableName+"["+(i-1)+"]);\n");
			
			out_p.write("\t\t}\n");
			out_p.write("\n");
		}
		out_p.write("\t}\n\n");
	}
	
	
	public static void genBody() throws IOException{
		for(int i=2;i<=n;i++){
			for(int j=0;j<i-1;j++)
			genBlock(i,j);
		}
	}
	
	public static void genBlock(int i,int j) throws IOException{
		
		out_p.write("\tprivate static final void gen"+i+"_"+j+"(PermutationReciever"+upperCaseTypeString+" pr,");
		
		for(int m=1;m<i;m++){
			out_p.write(typeString+" "+variableName+m+", ");
		}
		out_p.write(typeString+" "+variableName+i+"){\n");
		genInnerBlock(i-j,i,j);
		
		out_p.write("\t}\n");
		out_p.write("\n");
	}
	
	public static void genInnerBlock(int bl,int i,int j) throws IOException{
			
		LinkedList<String> front=new LinkedList<String>();
		LinkedList<String> rear=new LinkedList<String>();
		
		for(int m=0;m<j;m++){
			front.add(variableName+(m+1));
		}
		
		for(int m=j;m<i;m++){
			rear.add(variableName+(m+1));
		}
		
		for(int m=0;m<bl;m++){

			if(i-j==2){
				out_p.write("\t\tpr.recieve"+i+"(");
			}
			else{
				out_p.write("\t\tgen"+i+"_"+(j+1)+"(pr,");
			}
			
			for(int k=0;k<front.size();k++){
				out_p.write(front.get(k)+", ");
			}
			
			for(int k=0;k<rear.size()-1;k++){
				out_p.write(rear.get(k)+", ");
			}
			out_p.write(rear.get(rear.size()-1));
			rear.add(rear.poll());
			out_p.write(");\n");
		}
	}
}
