package jp.ac.uryukyu.ie.e195751;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy extends LivingThing {

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param hitPoint モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public Enemy (String name, int hitPoint, int attack) {
        super(name,hitPoint,attack);
    }

    /**
     * getterメソッドと同等。生死をboolean表現しているためメソッド名をisDead()とした。
     * @return boolean
     */

    /*public boolean isDead() {
        return isDead();
    }
    public String getName(){
        return getName();
    }*/

    /**
     * Heroへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param hero 攻撃対象
     */
    /*public void attack(Hero hero){
        int damage = (int)(Math.random() * this.getAttack());
        if(!this.isDead()) {
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", this.getName(), hero.getName(), damage);
        }
        hero.wounded(damage);
    }*/

    /**
     * &#x81ea;&#x8eab;&#x3078;&#x653b;&#x6483;&#x3055;&#x308c;&#x305f;&#x3068;&#x304d;&#x306e;&#x30c0;&#x30e1;&#x30fc;&#x30b8;&#x51e6;&#x7406;&#x3092;&#x3059;&#x308b;&#x30e1;&#x30bd;&#x30c3;&#x30c9;&#x3002;
     * &#x6307;&#x5b9a;&#x3055;&#x308c;&#x305f;&#x30c0;&#x30e1;&#x30fc;&#x30b8;&#x3092; hitPoint &#x304b;&#x3089;&#x5f15;&#x304d;&#x3001;&#x6b7b;&#x4ea1;&#x5224;&#x5b9a;&#x3092;&#x884c;&#x3046;&#x3002;
     * @param damage &#x53d7;&#x3051;&#x305f;&#x30c0;&#x30e1;&#x30fc;&#x30b8;
     */

    int HP = super.getHitPoint();

    public void wounded(int damage){
        setHitPoint(getHitPoint()-damage);
        if( getHitPoint() < 0 ) {
            setDead(true);
            System.out.printf("%sは倒れた。\n", getName());
        }
    }
}