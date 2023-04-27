package Forge;

public abstract class Weapon {
    private String weaponName;
    private int length; //in centimeters

    public Weapon(String weaponName, int length){
        this.weaponName = weaponName;
        this.length = length;
    }

    public String getWeaponName(){
        return this.weaponName;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeapon(String wp){
        this.weaponName = wp;
    }

    public abstract WeaponAttribute getWeaponAttribute();

    public abstract int WeaponDamage();
}
