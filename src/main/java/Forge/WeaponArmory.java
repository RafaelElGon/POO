package Forge;

import Exceptions.NullTypeReferenceException;
import Exceptions.WeaponAlreadyRegisteredException;

import java.util.Collection;

public interface WeaponArmory {
    WeaponAttribute weaponType(Weapon w);

    int weaponDmg(Weapon w);

    boolean storeWeapon(Weapon w) throws WeaponAlreadyRegisteredException;

    Collection<WeaponAttribute> weaponAttributes(Collection<Weapon> wA) throws NullPointerException;
}
