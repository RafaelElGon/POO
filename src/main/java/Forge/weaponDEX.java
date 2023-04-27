package Forge;

public class weaponDEX extends Weapon {
    private WeaponAttribute weaponAttribute;
    private static final String weaponDice = "1d10";

    public weaponDEX(String weaponName, int length) {
        super(weaponName, length);
        this.weaponAttribute = WeaponAttribute.DEX;
    }

    public String getWeaponDice() {
        return weaponDice;
    }

    @Override
    public WeaponAttribute getWeaponAttribute() {
        return weaponAttribute;
    }

    public int WeaponDamage() {
        return (int) (1 + Math.random() * 10);
    } //Weapon damage is the result of a 10 sided dice roll

    public void setWeaponAttribute(WeaponAttribute wA) {
        this.weaponAttribute = wA;
    }

    public String toString() {
            return "Weapon > " + getWeaponName()
                    + "\nWeapon Attribute > " + getWeaponAttribute()
                    + "\nWeapon Length > " + getLength() + "cm"
                    + "\nWeapon Damage > " + weaponDice;
    }
}