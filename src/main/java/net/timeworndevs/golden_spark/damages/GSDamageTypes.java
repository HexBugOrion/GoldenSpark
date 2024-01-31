package net.timeworndevs.golden_spark.damages;

import net.minecraft.entity.damage.DamageType;
import net.minecraft.entity.damage.DamageTypes;
import net.minecraft.registry.Registerable;

public interface GSDamageTypes extends DamageTypes{
    //RegistryKey<DamageType> VOLTAIC = RegistryKey.of(RegistryKeys.DAMAGE_TYPE, new Identifier(GSMain.MODID, "voltaic"));

    static void bootstrap(Registerable<DamageType> damageTypeRegisterable) {
        //damageTypeRegisterable.register(VOLTAIC, new DamageType("voltaic", 0.0F, /**/));
    }
}
