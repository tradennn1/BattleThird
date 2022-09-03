public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss(300,200);
        boss.weaponType.setWeaponType("Machine");
        boss.weaponType.setWeaponName("Ak16");
        System.out.println(boss.info());
        Skeleton skeleton = new Skeleton(300,200,33);
        skeleton.weaponType.setWeaponType("Machine");
        skeleton.weaponType.setWeaponName("MK416");
        System.out.println(skeleton.info());
        Skeleton skeleton2 = new Skeleton(400, 300,44);
        skeleton2.weaponType.setWeaponType("Machine");
        skeleton2.weaponType.setWeaponName("AKM");
        System.out.println(skeleton2.info());


    }
}