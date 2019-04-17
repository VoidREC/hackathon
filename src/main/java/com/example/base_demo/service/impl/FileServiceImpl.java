package com.example.base_demo.service.impl;

import com.example.base_demo.exception.CommonException;
import com.example.base_demo.mapper.FileMapper;
import com.example.base_demo.pojo.vo.FileInfoVO;
import com.example.base_demo.service.FileService;
import org.apache.catalina.session.FileStore;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.util.UUID;

@Service
public class FileServiceImpl implements FileService {

    private final String webRootUrl;

    private final String storeRootPath;

    private final int maxDiskNameLength;

    private final int maxOriginalFilenameLength;

    private final FileMapper fileStoreMapper;

    public FileServiceImpl(@Value("${web.url.file}") String webRootUrl,
                           @Value("${store.file.path}") String storeRootPath,
                           @Value("${store.file.max-path-length}") int maxDiskNameLength,
                           @Value("#{150}") int maxOriginalFilenameLength,
                           FileMapper fileStoreMapper) {
        this.webRootUrl = webRootUrl;
        this.storeRootPath = storeRootPath + "/";
        this.maxDiskNameLength = maxDiskNameLength;
        this.fileStoreMapper = fileStoreMapper;
        this.maxOriginalFilenameLength = maxOriginalFilenameLength;
    }

    @Override
    public FileInfoVO saveFile(MultipartFile multipartFile, Integer userId) {
        return null;
}

private String generateRandomFilename(String originalFilename) {
        String randString = UUID.randomUUID() + "/" + originalFilename;
        if (randString.length() > maxDiskNameLength) {
            randString = randString.substring(randString.length() - maxDiskNameLength);
        }
        return randString;
    }}
