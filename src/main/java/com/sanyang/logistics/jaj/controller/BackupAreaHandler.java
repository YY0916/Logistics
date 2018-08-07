package com.sanyang.logistics.jaj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sanyang.logistics.base.pojo.BackupArea;
import com.sanyang.logistics.jaj.service.BackupAreaService;
/**
 * 司机控制层
 * @author asus
 *
 */
@Controller
@RequestMapping("/backupArea")
public class BackupAreaHandler {
	
	@Autowired
	private BackupAreaService backupAreaService;
	
	@RequestMapping("/getBackupArea")
	@ResponseBody
	public Object getTruckDim(){
		List<BackupArea> BackupAreas=backupAreaService.getBackupArea();
		return BackupAreas;
	}
	
	@RequestMapping("/insertBackupArea")
	@ResponseBody
	public String insertBackupArea(BackupArea BackupArea){
		backupAreaService.insertBackupArea(BackupArea);
		return "1";
	}
	
	@RequestMapping("/deleteBackupArea")
	@ResponseBody
	public int deleteBackupArea(Integer backupAreaId){
		backupAreaService.deleteBackupArea(backupAreaId);
		return 1;
	}
	
	@RequestMapping("/getBackupAreaById")
	@ResponseBody
	public Object getBackupAreaById(Integer backupAreaId){
		BackupArea backupArea=backupAreaService.getBackupAreaById(backupAreaId);
		return backupArea;
	}
	
	@RequestMapping("/updateBackupArea")
	@ResponseBody
	public int updateBackupArea(BackupArea backupArea){
		backupAreaService.updateBackupArea(backupArea);
		return 1;
	}
}
