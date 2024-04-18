package de.hustender.additionalvehicles;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("additionalvehicles")
public class AdditionalVehiclesMod {

    private static final Logger LOGGER = LogManager.getLogger();

    public AdditionalVehiclesMod() {
        MinecraftForge.EVENT_BUS.register(this);
    }

}
