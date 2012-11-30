package systeme;

import java.util.Arrays;

import rdp.RdP;

public class Main {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		String fichier ="simple.net";
		if (args.length == 1)
		    fichier = args[0];
		RdP rdp = new RdP(fichier);
		AlgoGrapheRdP algo = new AlgoGrapheRdP(rdp);
		for(int i = 0; i<rdp.transition.length;i++){
			if(algo.franchissable(rdp.marquage, i)){
				System.out.println(Arrays.toString(rdp.marquage));
				System.out.println(Arrays.toString(rdp.pre[i]));
				System.out.println(Arrays.toString(rdp.post[i]));
				System.out.println(Arrays.toString(algo.franchir(rdp.marquage, i)));
			}
		}
		//System.out.println(rdp);
	}

}
