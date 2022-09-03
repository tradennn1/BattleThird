public class GameEntity {
    public int getType() {
        return Health;
    }

    public void setType(int type) {
        this.Health = type;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public GameEntity(int type, int damage) {
        this.Health = type;
        this.damage = damage;
    }

    private int Health;


    private int damage;

}
