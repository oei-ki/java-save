package com.varxyz.javacafe.trash;

import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Service("fileService")
public class FileController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public void uploadFile (MultipartHttpServletRequest multiRequest) throws Exception{
		Map <String, MultipartFile> files = multiRequest.getFileMap();
		
		Iterator <Entry<String, MultipartFile>> itr = files.entrySet().iterator();
		
		MultipartFile mFile;
		
		String filePath = "C:\\Java_young\\JavaStudy\\eclipse-workspace\\javacafe\\src\\main\\webapp\\resources\\images";
		String saveFileName = "", saveFilePath = "";
		
		while(itr.hasNext()) {
			Entry<String, MultipartFile> entry = itr.next();
			
			mFile = entry.getValue();
			
			String fileName = mFile.getOriginalFilename();
			
			String fileCutName = fileName.substring(0, fileName.lastIndexOf("."));
			
			File fileFolder = new File(filePath);
			
			if(!fileFolder.exists()) {
				if(fileFolder.mkdirs()) {
					logger.info("[file.mkdirs] : Success");
				}else {
					logger.error("[file.mkdirs] : Fail");
				}
			}
			File saveFile = new File(saveFilePath);
			
			if(saveFile.isFile()) {
				boolean _exist = true;
				
				int index = 0;
				
				while(_exist) {
					index++;
					
					saveFileName = fileCutName + "(" + index + ")." + fileExt;
					
					String dictFile = filePath + File.separator + saveFileName;
					
					_exist = new File(dictFile).isFile();
				}
			}
		}
	}
}
