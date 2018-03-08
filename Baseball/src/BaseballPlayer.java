public class BaseballPlayer 
{
	private int H;
	private int aB;
	private int bB;
	private int hBP;
	private int sF;
	private int dbls;
	private int triples;
	private int hR;
	
	private int singles;
	private double bA;
	private double oBP;
	private double sLG;
	private double oPS;
	private double tB;
	
	BaseballPlayer(int hits, int aB, int bB, int hBP, int sF, int dbls, int triples, int hR)
	{
		this.H = hits;
		this.aB = aB;
		this.bB = bB;
		this.hBP = hBP;
		this.sF = sF;
		this.dbls = dbls;
		this.triples = triples;
		this.hR = hR;
		
		this.singles = this.H - this.dbls - this.triples - this.hR;
		this.bA = this.calculateBA();
		this.oBP = this.calculateOBP();
		this.sLG = this.calculateSLG();
		this.oPS = this.calculateOPS();
		this.tB = this.calculateTB();
	}
	
	public double calculateBA() {
		return (double)this.H/(double)this.aB;
	}
	public double calculateOBP() {
		return ((double)this.H + (double)this.bB + (double)this.hBP)/((double)this.aB + (double)this.bB + (double)this.hBP + (double)this.sF);
	}
	public double calculateSLG() {
		return (((double)this.singles + (2.0 * (double)this.dbls) + (3.0*(double)this.triples) + (4.0*(double)this.hR))/(double)this.aB);
	}
	public double calculateOPS() {
		return this.oBP + this.sLG;
	}
	public double calculateTB() {
		return (double)this.singles + (2.0*(double)this.dbls) + (3.0*(double)this.triples) + (4.0*(double)this.hR);
	}
	public int getaB() {
		return aB;
	}

	public void setaB(int aB) {
		this.aB = aB;
	}

	public int getH() {
		return H;
	}

	public void setH(int h) {
		H = h;
	}

	public int getDbls() {
		return dbls;
	}

	public void setDbls(int dbls) {
		this.dbls = dbls;
	}

	public int getTriples() {
		return triples;
	}

	public void setTriples(int triples) {
		this.triples = triples;
	}

	public int gethR() {
		return hR;
	}

	public void sethR(int hR) {
		this.hR = hR;
	}

	public int getbB() {
		return bB;
	}

	public void setbB(int bB) {
		this.bB = bB;
	}

	public int getsF() {
		return sF;
	}

	public void setsF(int sF) {
		this.sF = sF;
	}

	public int gethBP() {
		return hBP;
	}

	public void sethBP(int hBP) {
		this.hBP = hBP;
	}

	public double getBA() {
		return this.bA;
	}
	public double getOBP() {
		return this.oBP;
	}
	public double getSLG() {
		return this.sLG;
	}
	public double getOPS() {
		return this.oPS;
	}
	public double getTB() {
		return this.tB;
	}
}
//AHHhhhhHHHHHHHHhhh
