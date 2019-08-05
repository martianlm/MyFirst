package com.martian.service;

import org.springframework.web.multipart.MultipartFile;

import com.martian.model.MediaUploadResponseModel;

public interface FileService {

	public MediaUploadResponseModel fileUpload(MultipartFile file);

}
