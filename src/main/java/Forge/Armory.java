package Forge;

import Exceptions.WeaponAlreadyRegisteredException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Armory implements WeaponArmory {
    private Collection<Weapon> weapons;

    public Armory() {
        this.weapons = new ArrayList<>();
    }

    public Collection<Weapon> getWeapons() {
        return weapons;
    }

    @Override
    public WeaponAttribute weaponType(Weapon w){
        return w.getWeaponAttribute();
    }

    @Override
    public Collection<WeaponAttribute> weaponAttributes(Collection<Weapon> weaponCollection) throws NullPointerException {
        Collection<WeaponAttribute> atributes = new LinkedList<>();

        for(Weapon w: this.weapons){
            atributes.add(w.getWeaponAttribute());
        }
        if(atributes.size() == 0){
            throw new NullPointerException();
        } else{
            return atributes;
        }
    }

    public int weaponDmg (Weapon w){
        return w.WeaponDamage();

    }
    public boolean storeWeapon (Weapon w) throws WeaponAlreadyRegisteredException {
        if (this.weapons.contains(w)) {
            throw new WeaponAlreadyRegisteredException("We don't need anymore " + w + "try storing another weapon, dimwit!");
        }
        this.weapons.add(w);
        return true;
    }
}
