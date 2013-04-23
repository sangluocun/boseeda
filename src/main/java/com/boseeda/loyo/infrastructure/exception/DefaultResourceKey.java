package com.boseeda.loyo.infrastructure.exception;

public enum DefaultResourceKey {
	
	ARITHMETIC_EXCEPTION,
    // PluginConfig
    PluginConfig_ClientNotFound,
    PluginConfig_pluginNotSet,
    PluginConfig_getPluginFailed,
    PluginConfig_indicatorNotFound,

    // Reports
    Reports_noLogin,
    Reports_createReportNoClient,

    // Inventory
    MFCCInventory_clientUnknown,
    MFCCInventory_itemNumberUnknown,

    // MFCControlBean
    MFCCOntrol_sendFailed,

    // Users
    Users_removeConstraintViolated,
    Users_clientChangeNotAllowed,

    // UnitLoadLabelBean
    UnitLoadLabel_createReport
}
