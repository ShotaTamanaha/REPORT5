package jp.ac.uryukyu.ie.e195751;

/**
 * 生ける者のクラス。
 *  String name; //名前
 *  int hitPoint; //HP
 *  int attack; //攻撃力
 *  boolean dead; //生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 *
 */
public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name 名前
     * @param hitPoint HP
     * @param attack 攻撃力
     */
    public LivingThing (String name, int hitPoint, int attack) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitPoint, attack);
    }

    public boolean isDead(){
        return  dead;
    }
    public void setDead(boolean dead) {
        this.dead = dead;
    }
    public String getName() { return  name; }

    public int getHitPoint() { return hitPoint; }
    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }
    public int getAttack() { return  attack; }

    /**
     * 相手へ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、opponent.wounded()によりダメージ処理を実行。
     * @param  opponent 攻撃対象
     */
    public void attack(LivingThing opponent){
        if(!dead) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if (hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}