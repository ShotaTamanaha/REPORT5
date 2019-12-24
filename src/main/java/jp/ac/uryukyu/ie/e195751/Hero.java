package jp.ac.uryukyu.ie.e195751;

/**
 * ヒーロークラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Hero extends LivingThing {

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name ヒーロー名
     * @param hitpoint ヒーローのHP
     * @param attack ヒーローの攻撃力
     */
    public Hero (String name, int hitpoint, int attack) {
        super(name,hitpoint,attack);
    }

    /**
     * getterメソッドと同等。生死をboolean表現しているためメソッド名をisDead()とした。
     * @return boolean
     */
    /*public boolean isDead(){
        return isDead();
    }
    public String getName() { return getName(); }*/

    /**
     * Enemyへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param e 攻撃対象
     */
    /*public void attack(Enemy e){
        int damage = (int)(Math.random() * this.getAttack());
        if(!this.isDead()) {
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", this.getName(), e.getName(), damage);
        }
        e.wounded(damage);
    }*/

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */


    public void wounded(int damage){
        setHitPoint(getHitPoint()-damage);
        if( getHitPoint() < 0 ) {
            setDead(true);
            System.out.printf("%sは道半ばで力尽きてしまった。\n", getName());
        }
    }
}