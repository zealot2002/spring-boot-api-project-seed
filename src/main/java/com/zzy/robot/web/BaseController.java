package com.zzy.robot.web;
import com.zzy.robot.core.Result;
import com.zzy.robot.core.ResultGenerator;
import com.zzy.robot.fileuploader.FileUploader;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2017/07/24.
*/
@RestController
@RequestMapping("/base")
public class BaseController {

	@CrossOrigin
    @PostMapping("/getUploadToken")
    public Result getUploadToken() {
		System.out.println("getUploadToken");
    	String token = FileUploader.getFileUploadToken();
        return ResultGenerator.genSuccessResult(token);
    }
    
}
