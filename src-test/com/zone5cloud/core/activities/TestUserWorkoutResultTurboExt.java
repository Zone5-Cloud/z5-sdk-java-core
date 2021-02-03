package com.zone5cloud.core.activities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestUserWorkoutResultTurboExt {

	@Test
	public void testFields() {
		UserWorkoutResultTurboExt ext = new UserWorkoutResultTurboExt();
		ext.setAvgBattery1Temperature(1);
		ext.setAvgBattery2Temperature(2);
		ext.setAvgGPSSpeed(3.0);
		ext.setBat1DecayAssist0Wh(4);
		ext.setBat1DecayAssist1Wh(5);
		ext.setBat1DecayAssist2Wh(6);
		ext.setBat1DecayAssist3Wh(7);
		ext.setBat1DecayAssist4Wh(8);
		ext.setBat2DecayAssist0Wh(9);
		ext.setBat2DecayAssist1Wh(10);
		ext.setBat2DecayAssist2Wh(11);
		ext.setBat2DecayAssist3Wh(12);
		ext.setBat2DecayAssist4Wh(13);
		ext.setBattery1DecayP(14);
		ext.setBattery2DecayP(15);
		ext.setBattery1DecayWh(16);
		ext.setBattery2DecayWh(17);
		ext.setBatteryTotalDecayP(18);
		ext.setBatteryTotalDecayWh(19);
		ext.setMaxBattery1Temperature(20);
		ext.setMaxBattery2Temperature(21);
		ext.setMinBattery1Temperature(22);
		ext.setMinBattery2Temperature(23);
		ext.setSupportFactorAssist0(24.0);
		ext.setSupportFactorAssist1(25.0);
		ext.setSupportFactorAssist2(26.0);
		ext.setSupportFactorAssist3(27.0);
		ext.setSupportFactorAssist4(28.0);
		
		UserWorkoutResult result = new UserWorkoutResult();
		result.setTurboExt(ext);
		
		assertNotNull(result.getTurboExt());
		
		assertEquals(1, result.getTurboExt().getAvgBattery1Temperature().intValue());
		assertEquals(2, result.getTurboExt().getAvgBattery2Temperature().intValue());
		assertEquals(3.0, ext.getAvgGPSSpeed(), 0.1);
		assertEquals(4, result.getTurboExt().getBat1DecayAssist0Wh().intValue());
		assertEquals(5, result.getTurboExt().getBat1DecayAssist1Wh().intValue());
		assertEquals(6, result.getTurboExt().getBat1DecayAssist2Wh().intValue());
		assertEquals(7, result.getTurboExt().getBat1DecayAssist3Wh().intValue());
		assertEquals(8, result.getTurboExt().getBat1DecayAssist4Wh().intValue());
		assertEquals(9, result.getTurboExt().getBat2DecayAssist0Wh().intValue());
		assertEquals(10, result.getTurboExt().getBat2DecayAssist1Wh().intValue());
		assertEquals(11, result.getTurboExt().getBat2DecayAssist2Wh().intValue());
		assertEquals(12, result.getTurboExt().getBat2DecayAssist3Wh().intValue());
		assertEquals(13, result.getTurboExt().getBat2DecayAssist4Wh().intValue());
		assertEquals(14, result.getTurboExt().getBattery1DecayP().intValue());
		assertEquals(15, result.getTurboExt().getBattery2DecayP().intValue());
		assertEquals(16, result.getTurboExt().getBattery1DecayWh().intValue());
		assertEquals(17, result.getTurboExt().getBattery2DecayWh().intValue());
		assertEquals(18, result.getTurboExt().getBatteryTotalDecayP().intValue());
		assertEquals(19, result.getTurboExt().getBatteryTotalDecayWh().intValue());
		assertEquals(20, result.getTurboExt().getMaxBattery1Temperature().intValue());
		assertEquals(21, result.getTurboExt().getMaxBattery2Temperature().intValue());
		assertEquals(22, result.getTurboExt().getMinBattery1Temperature().intValue());
		assertEquals(23, result.getTurboExt().getMinBattery2Temperature().intValue());
		assertEquals(24.0, result.getTurboExt().getSupportFactorAssist0(), 0.1);
		assertEquals(25.0, result.getTurboExt().getSupportFactorAssist1(), 0.1);
		assertEquals(26.0, result.getTurboExt().getSupportFactorAssist2(), 0.1);
		assertEquals(27.0, result.getTurboExt().getSupportFactorAssist3(), 0.1);
		assertEquals(28.0, result.getTurboExt().getSupportFactorAssist4(), 0.1);
	}

}
