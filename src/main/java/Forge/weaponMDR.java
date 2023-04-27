package Forge;

public class weaponMDR extends Weapon{
    private WeaponAttribute weaponAttribute;
    private static final String weaponDice = "1d12";

    public weaponMDR(String weaponName, int length) {
        super(weaponName, length);
        this.weaponAttribute = WeaponAttribute.MDR;
    }
    public String getWeaponDice(){
        return weaponDice;
    }

    @Override
    public WeaponAttribute getWeaponAttribute() {
        return weaponAttribute;
    }

    public void setWeaponAttribute(WeaponAttribute wA){
        this.weaponAttribute = wA;
    }

    public int WeaponDamage() {
        return (int)(1 + Math.random() * 12);
    } //Weapon damage is the result of a 12 sided dice roll

    public String toString(){
        return "Weapon > " + getWeaponName()
                + "\nWeapon Attribute > " + getWeaponAttribute()
                + "\nWeapon Length > " + getLength()
                + "\nWeapon Damage > " + weaponDice;
    }
}
