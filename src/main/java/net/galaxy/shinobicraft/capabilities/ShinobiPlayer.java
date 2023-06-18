package net.galaxy.shinobicraft.capabilities;

import net.minecraft.nbt.Tag;
import net.minecraftforge.common.util.INBTSerializable;

public interface ShinobiPlayer extends INBTSerializable<Tag> {

    //Chakra
    double getChakra();
    double getMaxChakra();
    double setChakra();

    //Jinch
    boolean isJinch();
    int getBijuuNumber();
    int getJinchUUID();

    //Dojutsu
    int getDojutsu1();
    int getDojutsu2();
    //Clan
    boolean isSenju();
    boolean isUchiha();
    boolean isClanless();
    //Provenance
    boolean fromUnion();
    boolean isShinobi = false;

    //Jutsu Types
    boolean isToggled();
    boolean isCharged();

}
