package com.example.base_demo.controller;

import com.example.base_demo.exception.FileEmptyException;
import com.example.base_demo.service.FileService;
import com.example.base_demo.util.JsonResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.websocket.server.PathParam;

@RestController
public class FileController {

    private final FileService fileService;

    public FileController(FileService fileService) {
        this.fileService = fileService;
    }


    @PostMapping("/files/{uid}")
    public JsonResult uploadFile(@RequestParam("file") MultipartFile multipartFile,
                                 @PathParam("uid") Integer uid) {
        if (multipartFile.isEmpty()) {
            throw new FileEmptyException("上传的文件必须非空");
        }
        return new JsonResult.ok(fileService.saveFile(multipartFile, userId));
    }
}
