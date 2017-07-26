package com.zzy.robot.fileuploader;

import com.qiniu.util.Auth;

public class FileUploader {

	private static final String accessKey = "yT-SAyhJqyEM2_-aTQMeR2KxAgYuuQ9lcx8VPXg-";
	private static final String secretKey = "dr0chHHnOu2PPfVsdM-O2nQoQgphPGSqQTjPvpH3";
	private static final String bucket = "robot";
	
/****************************************************************************************************/	
	public static String getFileUploadToken() {
		Auth auth = Auth.create(accessKey, secretKey);
		String upToken = auth.uploadToken(bucket);
		System.out.println(upToken);
		return upToken;
	}
	
}
