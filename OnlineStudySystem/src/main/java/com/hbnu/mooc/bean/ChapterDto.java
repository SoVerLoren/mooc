package com.hbnu.mooc.bean;

import org.springframework.web.multipart.MultipartFile;

public class ChapterDto extends Chapter {

	private String chapterName;
	
	private String fileName;
	
	private MultipartFile fileUrl;

	
	public MultipartFile getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(MultipartFile fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getChapterName() {
		return chapterName;
	}

	public void setChapterName(String chapterName) {
		this.chapterName = chapterName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	
}
