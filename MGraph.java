package GraphElement;
import java.util.Scanner;
public class MGraph implements IGraph{
	public final static int INFINITY = Integer.MAX_VALUE;
	private GraphKind kind;
	private int vexNum, arcNum;
	private Object[] vexs;
	private int[][] arcs;
	public MGraph(){
		this(null, 0, 0, null, null);
	}
	
	public MGraph(GraphKind kind, int vexNum, int arcNum, Object[] vexs, int[][] arcs) {
		this.kind = kind;
		this.vexNum = vexNum;
		this.arcNum = arcNum;
		this.vexs = vexs;
		this.arcs = arcs;
	}

	
	public void createUDG() {
		Scanner sc  = new Scanner(System.in);
		System.out.println("分别输入图的顶点数和边数:");
		vexNum = sc.nextInt();
		arcNum = sc.nextInt();
		vexs = new Object[vexNum];
		System.out.println("输入顶点");
		for(int i = 0; i < vexNum; i++)
			vexs[i] = sc.next();
		arcs = new int[vexNum][vexNum];
		for(int i = 0; i < vexNum; i++)
			for(int j= 0; j < vexNum; j++)
				arcs[i][j] = INFINITY;
		System.out.println("输入两个顶点及边的权值");
		for(int j = 0; j < arcNum; j++) {
			int v = locateVex(sc.next());
			int u = locateVex(sc.next());
			arcs[v][u] = arcs[u][v] = sc.nextInt();
		}
	}
	
	public void createDG() {
		Scanner sc  = new Scanner(System.in);
		System.out.println("分别输入图的顶点数和边数:");
		vexNum = sc.nextInt();
		arcNum = sc.nextInt();
		vexs = new Object[vexNum];
		System.out.println("输入顶点");
		for(int i = 0; i < vexNum; i++)
			vexs[i] = sc.next();
		arcs = new int[vexNum][vexNum];
		for(int i = 0; i < vexNum; i++)
			for(int j= 0; j < vexNum; j++)
				arcs[i][j] = INFINITY;
		System.out.println("输入两个顶点及边的权值");
		for(int j = 0; j < arcNum; j++) {
			int v = locateVex(sc.next());
			int u = locateVex(sc.next());
			arcs[v][u] = sc.nextInt();
		}
	}
	
	public void createUDN() {}
	
	public void createDN() {}
	
	@Override
	public void createGraph() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入图的类型:");
		GraphKind kind = GraphKind.valueOf(sc.next());
		switch(kind) {
		case UDG:
			createUDG();
			return;
		case DG:
			createDG();
			return;
		case UDN:
			createUDN();
			return;
		case DN:
			createDN();
			return;
		}
	}
	

	@Override
	public int getVexNum() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getArcNum() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getVex(int v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int locateVex(Object vex) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int firstAdjVex(int v) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int nextAdjVex(int v, int w) {
		// TODO Auto-generated method stub
		return 0;
	}

	public GraphKind getKind() {
		return kind;
	}

	public Object[] getVexs() {
		return vexs;
	}

	public int[][] getArcs() {
		return arcs;
	}
	
	
	
}
