package com;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by qixin on 2017/8/13.
 */
public class Launchy {
    public static void main(String[] args) throws IOException {
        String sourcePath = ConfigHelper.getProperty("file.source.path");
        String targetPath = ConfigHelper.getProperty("file.target.path");

        File sourceFile = ConfigHelper.getFile(sourcePath);
        File targetFile = new File(sourceFile.getParent(), targetPath);
        if(!targetFile.exists()) {
            targetFile.createNewFile();
        }

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> {
            for(FileCopyEnum fileCopyEnum : FileCopyEnum.values()) {
                fileCopyEnum.copyFile(sourceFile, targetFile);
            }
            executorService.shutdown();
        });
    }
}
