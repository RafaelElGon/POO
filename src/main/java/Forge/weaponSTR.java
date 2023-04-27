package Forge;

public class weaponSTR extends Weapon {
    private WeaponAttribute weaponAttribute;
    private static final String weaponDice = "1d8 + 1d6";

    @Override
    public WeaponAttribute getWeaponAttribute() {
        return weaponAttribute;
    }
    public String getWeaponDice(){
        return weaponDice;
    }

    public void setWeaponAttribute(WeaponAttribute weaponAttribute) {
        this.weaponAttribute = weaponAttribute;
    }

    public int WeaponDamage() {
        return (int) ((1 + Math.random() * 8) + (1 + Math.random() * 6));
    } //Weapon damage is the result of an 8 and 6 sided dice roll

    public weaponSTR(String weaponType, int length) {
        super(weaponType, length);
        this.weaponAttribute = WeaponAttribute.STR;
    }

    public String toString(){
            return "Weapon > " + getWeaponName()
                    + "\nWeapon Attribute > " + getWeaponAttribute()
                    + "\nWeapon Length > " + getLength() + "cm"
                    + "\nWeapon Damage > " + weaponDice;
    }
}
