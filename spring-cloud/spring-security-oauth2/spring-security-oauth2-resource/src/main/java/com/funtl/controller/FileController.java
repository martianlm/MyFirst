package com.funtl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileController {

	@RequestMapping("/upload")
	public String fileUpload(MultipartFile file) {

		return "";
	}

}
