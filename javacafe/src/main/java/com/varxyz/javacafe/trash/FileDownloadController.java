package com.varxyz.javacafe.trash;

import java.io.File;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FileDownloadController {
	
	

	

	    
	
//	    @RequestMapping("/cafe/add_menu")
//	    public String uploadTest(MultipartHttpServletRequest mre, HttpServletRequest req){
//	        
//	        String test = req.getParameter("test"); // jsp text name mapping
//	        MultipartFile mf = mre.getFile("file"); // jsp file name mapping
//	        String uploadPath = "";
//	        
//	        String path = CURR_IMAGE_REPO_PATH; // 파일 업로드 경로
//	            
//	        String original = mf.getOriginalFilename(); // 업로드하는 파일 name
//	            
//	        System.out.println("!!!!!!!!!!"+test);        // text value
//	        System.out.println("!!!!!!!!!!"+original);    // file original name
//	        System.out.println("!!!!!!!!!!"+mf.getSize());// file size
//	            
//	        uploadPath = path+original; // 파일 업로드 경로 + 파일 이름
//	        
//	        
//	        try {
//	            mf.transferTo(new File(uploadPath)); // 파일을 위에 지정 경로로 업로드
//	        } catch (IllegalStateException e) {
//	            // TODO Auto-generated catch block
//	            e.printStackTrace();
//	        } catch (IOException e) {
//	            // TODO Auto-generated catch block
//	            e.printStackTrace();
//	        }
//	        
//	        return "cafe/success_add_menu";
//	    }
}
