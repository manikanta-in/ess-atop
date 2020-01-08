package com.mbusa.atop.rest;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.mbusa.atop.model.Metadata;
import com.mbusa.atop.services.FileUploadService;

import io.swagger.annotations.ApiOperation;



@RestController
@RequestMapping("/fileupload")
public class FileUploadApi {
	
	
	private static Logger log = LogManager.getLogger(FileUploadApi.class);

	@Autowired
	private  FileUploadService fileUploadService;

	@PostMapping(consumes = {"multipart/form-data"})
	@ApiOperation(value = "file upload service", notes = "creates a directory under certs folder and the file is added to the folder.")
	public String fileupload(@RequestParam MultipartFile file,
			@RequestParam Metadata metadata) throws Exception {
		log.info("fileupload starts");
		return fileUploadService.fileupload(file);
		
	}


}
