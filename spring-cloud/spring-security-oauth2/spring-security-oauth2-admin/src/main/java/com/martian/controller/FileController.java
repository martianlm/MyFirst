package com.martian.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.martian.model.MediaUploadResponseModel;
import com.martian.model.TBMediaImg;
import com.martian.service.FileService;
import com.martian.service.MediaService;

@RestController
@RequestMapping("/contents/media")
public class FileController {

	@Autowired
	public FileService fileService;

	@Autowired
	public MediaService mediaService;

	@RequestMapping("/upload")
	public MediaUploadResponseModel fileUpload(MultipartFile file) {
		return fileService.fileUpload(file);
	}

	@RequestMapping("/createImg")
	public boolean createImg(@RequestBody TBMediaImg img) throws Exception {
		return mediaService.createMedia(img);
	}

	@RequestMapping("/editMedia")
	public void editMedia(@RequestBody TBMediaImg img) throws Exception {
		mediaService.editMedia(img);
	}

	@RequestMapping("/delMedia/{id}")
	public void delMedia(@PathVariable("id") String id) throws Exception {
		mediaService.delMedia(id);
	}

}
