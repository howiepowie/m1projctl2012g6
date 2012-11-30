package systeme;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import rdp.RdP;

public class AlgoGrapheRdP {
	public RdP rdp;
	static class Etat {
		boolean[] val;

		public Etat(boolean[] val) {
			super();
			this.val = val;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + Arrays.hashCode(val);
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Etat other = (Etat) obj;
			if (!Arrays.equals(val, other.val))
				return false;
			return true;
		}

	}

	public boolean franchissable(boolean[] m,int t){
		for(int i =0;i < rdp.pre[t].length;i++){
			if(!m[rdp.pre[t][i]]){
				return false;
			}
		}
		return true;
	}

	public boolean[] franchir(boolean[] m,int t){
		boolean[] res  = new boolean[rdp.place.length];
		res = Arrays.copyOf(m, rdp.place.length);
		for(int i =0;i < rdp.pre[t].length;i++){
			if(m[rdp.pre[t][i]]){
				res[rdp.pre[t][i]] = false;
			}
		}
		for(int i = 0; i < rdp.post[t].length;i++){
			if(m[rdp.pre[t][i]]){
				res[rdp.pre[t][i]] = true;
			}
		}
		return res;
	}

	public AlgoGrapheRdP(RdP rdp) {
		super();
		this.rdp = rdp;
	}

	public GrapheRdP grapherdp()
	{
		GrapheRdP res = new GrapheRdP();
		res.rdp = rdp;
		res.etat = new ArrayList<boolean[]>();
		res.succ = new ArrayList<ArrayList<Integer>>();
		HashMap<Etat, Integer> table = new HashMap<AlgoGrapheRdP.Etat, Integer>();

		recGraphRdp(rdp.marquage, res, table);
		return res;
	}

	private void recGraphRdp(boolean[] m, GrapheRdP res,HashMap<Etat, Integer> table){
		table.put(new Etat(m), res.etat.size());
		res.nbEtat++;
		res.etat.add(m);
		ArrayList<Integer> succM = new ArrayList<Integer>();
		res.succ.add(succM);
		
		for(int t= 0; t <rdp.pre.length;t++){
			if(franchissable(m, t)){
				res.nbTransition++;
				boolean[] mp = franchir(m, t);
				Integer index = table.get(new Etat(mp));
				if(index == null){
					succM.add(res.etat.size());
					recGraphRdp(mp, res, table);
				}
				else{
					succM.add(index);
				}
			}
		}
	}
}
