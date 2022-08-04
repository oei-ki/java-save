package com.varxyz.javacafe.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.File;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.varxyz.javacafe.dao.CategoryCommand;
import com.varxyz.javacafe.domain.Category;
import com.varxyz.javacafe.domain.MenuItem;
import com.varxyz.javacafe.service.CategoryServiceImpl;
import com.varxyz.javacafe.service.MenuItemServiceImpl;

@Controller
public class MenuItemController {
	private static final String CURR_IMAGE_REPO_PATH = "C:\\Java_young\\JavaStudy\\eclipse-workspace\\javacafe\\src\\main\\webapp\\resources\\images";
	
	@Autowired
	MenuItemServiceImpl menuItemService;
	
	@Autowired
	CategoryServiceImpl categoryService;
	
	@GetMapping("/cafe/add_menu")
	public String addMenuForm(Model model, HttpServletRequest request) {
		model.addAttribute("menuItem", new MenuItem());
		List<Category> menuCategoryList =
				categoryService.getCategory();
		request.setAttribute("menuCategoryList", menuCategoryList);	
		
		return "cafe/add_menu";
	}
	
//	@ModelAttribute("CategoryProviderList")//속성값 클래스에 넣고 리스트 다오에서 찾는 메서드 만들어서 컨트롤러에 넣어서 만들기...
//	public List<Category> getCategoryProviderList() {
//		List<Category> list = categoryService.getCategory();
//		return list;  //팀장님이 해주신건데 일단 주석처리하고 list로 함 땡겨와보자 get안에 다 비워도 됨 이걸로 할 때 
//	}
	/**
	 * 카테고리 추가한 db를 가져다가 옵션으로 나오게 만들고 싶음.
	 */
	@PostMapping("/cafe/add_menu")
	public String addMenuItem(@ModelAttribute("menuItem") MenuItem menuItem, Model model) {
		
		model.addAttribute("menuItem", menuItem);
		menuItem.setMenuName(menuItem.getMenuName());
		menuItem.setMenuSize(menuItem.getMenuSize());
		menuItem.setMenuPrice(menuItem.getMenuPrice());
		menuItem.setImgUrl(menuItem.getImgUrl());
		
		
		menuItemService.addMenuItem(menuItem);
		
		return "cafe/success_add_menu";
	}
	
//	 @RequestMapping(value="/upload", method=RequestMethod.POST)
//	    public ModelAndView upload(MultipartHttpServletRequest multipartRequest,
//	                    HttpServletResponse response) throws Exception{
//	        multipartRequest.setCharacterEncoding("utf-8");
//	        Map map = new HashMap();
//	        Enumeration enu = multipartRequest.getParameterNames();
//	        
//	        while(enu.hasMoreElements()) {
//	            String name = (String)enu.nextElement();
//	            String value = multipartRequest.getParameter(name);
//	            map.put(name, value);
//	        }
//	        
//	        List fileList = fileProcess(multipartRequest);
//	        map.put("fileList", fileList);
//	        
//	        ModelAndView mav = new ModelAndView();
//	        mav.addObject("map", map);
//	        mav.setViewName("result");
//	        return mav;
//	    }
//	    
//	    private List<String> fileProcess(MultipartHttpServletRequest multipartRequest) 
//	        throws Exception{
//	        List<String> fileList = new ArrayList<String>();
//	        Iterator<String> fileNames = multipartRequest.getFileNames();
//	        
//	        while(fileNames.hasNext()) {
//	            String fileName = fileNames.next();
//	            MultipartFile mFile = multipartRequest.getFile(fileName);
//	            String originalFileName = mFile.getOriginalFilename();
//	            fileList.add(originalFileName);
//	            File file = new File(CURR_IMAGE_REPO_PATH + "\\" + fileName);
//	            if(mFile.getSize() != 0) {
//	                if(!file.exists()) {
//	                    if(file.getParentFile().mkdir()) {
//	                        file.createNewFile();
//	                    }
//	                }
//	                mFile.transferTo(new File(CURR_IMAGE_REPO_PATH + "\\" + originalFileName));
//	            }
//	        }
//	        return fileList;
//	    }
	    
	
	    @RequestMapping("/cafe/add_menu")
	    public String uploadTest(MultipartHttpServletRequest mre, HttpServletRequest req){
	        
	        String test = req.getParameter("test"); // jsp text name mapping
	        MultipartFile mf = mre.getFile("file"); // jsp file name mapping
	        String uploadPath = "";
	        
	        String path = CURR_IMAGE_REPO_PATH; // 파일 업로드 경로
	            
	        String original = mf.getOriginalFilename(); // 업로드하는 파일 name
	            
	        System.out.println("!!!!!!!!!!"+test);        // text value
	        System.out.println("!!!!!!!!!!"+original);    // file original name
	        System.out.println("!!!!!!!!!!"+mf.getSize());// file size
	            
	        uploadPath = path+original; // 파일 업로드 경로 + 파일 이름
	        
	        
	        try {
	            mf.transferTo(new File(uploadPath)); // 파일을 위에 지정 경로로 업로드
	        } catch (IllegalStateException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        
	        return "cafe/success_add_menu";
	    }
}
