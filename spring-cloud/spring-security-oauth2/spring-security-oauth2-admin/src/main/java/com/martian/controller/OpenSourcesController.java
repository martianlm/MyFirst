package com.martian.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.martian.model.TBMediaImg;
import com.martian.service.MediaService;

@RestController
@RequestMapping("/open")
public class OpenSourcesController {

	@Autowired
	public MediaService mediaService;

	@RequestMapping("/getMedia/{type}")
	public List<TBMediaImg> getMediaImg(@PathVariable("type") String type) {
		return mediaService.selectMedia(type);
	}

	@RequestMapping("/getMediaById/{id}")
	public TBMediaImg getMediaById(@PathVariable("id") String id) {
		return mediaService.selectMediaById(id);
	}

}
