public class Boss extends GameEntity {
    Weapon weaponType = new Weapon();

    public Boss(int health, int damage) {
        super(health, damage);

    }

    public Weapon getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(Weapon weaponType) {
        this.weaponType = weaponType;
    }

    public String info (){
        return  getType() + getDamage() + weaponType.getWeaponName() + getWeaponType() ;
    }
}