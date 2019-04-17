package com.example.base_demo.service;

import com.example.base_demo.pojo.vo.FileInfoVO;
import org.springframework.web.multipart.MultipartFile;

public interface FileService {

    FileInfoVO saveFile(MultipartFile multipartFile, Integer userId);


}
