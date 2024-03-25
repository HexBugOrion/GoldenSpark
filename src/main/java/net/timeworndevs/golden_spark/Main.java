package net.timeworndevs.golden_spark;

import net.fabricmc.api.ModInitializer;
import net.timeworndevs.golden_spark.common.CommonBlocks;
import net.timeworndevs.golden_spark.common.CommonItemGroups;
import net.timeworndevs.golden_spark.common.CommonItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {

	public static final String MODID = "golden_spark";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		LOGGER.info("THE VOLTAGE!! IT SURGES!!!");
		CommonItems.init();
		CommonBlocks.init();
		CommonItemGroups.init();
	}
}
