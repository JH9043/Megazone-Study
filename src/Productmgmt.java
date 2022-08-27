
public class Productmgmt {
	String name; //상품명
	int num; //수량
	int sellmoney; //판매단가
	int realsellmoney; //판매금액
	int inmoney; //매입단가
	int realinmoney; //매입금액
	int takbae; //운송료
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getSellmoney() {
		return sellmoney;
	}
	public void setSellmoney(int sellmoney) {
		this.sellmoney = sellmoney;
	}
	public int getInmoney() {
		return inmoney;
	}
	public void setInmoney(int inmoney) {
		this.inmoney = inmoney;
	}
	public int getTakbae() {
		return takbae;
	}
	public void setTakbae(int takbae) {
		this.takbae = takbae;
	}
	public int getEffect() {
		return effect;
	}
	public void setEffect(int effect) {
		this.effect = effect;
	}
	public double getEffectmin() {
		return effectmin;
	}
	public void setEffectmin(double effectmin) {
		this.effectmin = effectmin;
	}
	int effect; //이익금
	double effectmin; //이익율
}
	