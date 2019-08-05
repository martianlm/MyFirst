package com.martian.service.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.martian.model.MediaUploadResponseModel;
import com.martian.service.FileService;
import com.martian.utils.FastDFSClient;

@Service
public class FileServiceImpl implements FileService {

	@Autowired
	public FastDFSClient FastDFSClient;

	@Override
	public MediaUploadResponseModel fileUpload(MultipartFile file) {
		MediaUploadResponseModel model = new MediaUploadResponseModel();
		if (null == file) {
			model.setState("upload failed ! file is null!");
			return model;
		}
		String extName = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".") + 1);
		String contentType = file.getContentType();
		if (contentType.contains("video")) {
			model.setType("video");
		} else {
			model.setType("img");
		}
		// String[] split = file.getName().split(".");
		// extName = split[split.length - 1];
		String filePath = "";
		try {
			filePath = FastDFSClient.uploadFile(file.getBytes(), extName, null);
			model.setUrl(filePath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return model;
	}

	public String fileUpload1(MultipartFile file) {
		OutputStream os = null;
		InputStream inputStream = null;
		String path = "D:\\testFile\\";
		String filePath = path + File.separator + "test.jpg";
		try {
			inputStream = file.getInputStream();
			// 2、保存到临时文件
			// 1K的数据缓冲
			byte[] bs = new byte[1024];
			// 读取到的数据长度
			int len;
			// 输出的文件流保存到本地文件
			File tempFile = new File(path);
			if (!tempFile.exists()) {
				tempFile.mkdirs();
			}
			os = new FileOutputStream(filePath);
			// 开始读取
			while ((len = inputStream.read(bs)) != -1) {
				os.write(bs, 0, len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 完毕，关闭所有链接
			IOUtils.closeQuietly(os);
			IOUtils.closeQuietly(inputStream);
		}
		return filePath;
	}

	public String getExtName(String url) {
		if (null == url || "".equals(url)) {
			return "";
		}
		String[] split = url.split(".");
		String extName = split[split.length - 1];
		return extName;
	}

}
