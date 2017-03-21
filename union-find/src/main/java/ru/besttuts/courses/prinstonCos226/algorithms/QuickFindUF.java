package ru.besttuts.courses.prinstonCos226.algorithms;

/**
 * @author rchekashov
 *         created on 3/21/2017
 */
public class QuickFindUF {

	private int[] id;

	/**
	 *
	 * @param N amount if numbers: [0 .. N-1]
	 */
	public QuickFindUF(int N) {
		id = new int[N];
		for (int i = 0; i < N; i++){
			id[i] = i;
		}
	}

	public boolean connected(int p, int q){
		return id[p] == id[q];
	}

	public void union(int p, int q){
		int pid = id[p];
		int qid = id[q];
		for (int i = 0; i < id.length; i++){
			if(id[i] == pid) id[i] = qid;
		}
	}
}
