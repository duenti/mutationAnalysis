package mutation.model;

public class ResultModel {
	private String proteinID;
	private String mutation;
	private char fromAA;
	private char toAA;
	private int position;
	
	
	
	public ResultModel(String proteinID, String mutation) {
		super();
		this.proteinID = proteinID;
		this.mutation = mutation;
		this.fromAA = mutation.charAt(0);
        this.toAA = mutation.charAt(mutation.length()-1);
        this.position = Integer.parseInt(mutation.substring(1,mutation.length()-1));
	}
	
	public String getProteinID() {
		return proteinID;
	}
	public void setProteinID(String proteinID) {
		this.proteinID = proteinID;
	}
	public String getMutation() {
		return mutation;
	}
	public void setMutation(String mutation) {
		this.mutation = mutation;
	}

	public char getFromAA() {
		return fromAA;
	}

	public void setFromAA(char fromAA) {
		this.fromAA = fromAA;
	}

	public char getToAA() {
		return toAA;
	}

	public void setToAA(char toAA) {
		this.toAA = toAA;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
	
	
}
