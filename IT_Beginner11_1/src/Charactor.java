
public abstract class Charactor {	//抽象クラス

	//フィールド
	private int hp;			//体力
	private String name;	//名前
	private int at;			//攻撃力
	private int df;			//防御力
	
	//抽象メソッド
	public abstract void attack();	//攻撃
	public abstract void defence();	//防御
	
}
