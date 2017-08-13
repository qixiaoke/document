package com;

import java.io.*;

/**
 * Created by qixin on 2017/8/13.
 */
public enum FileCopyEnum {
    FILE_STREAM("fileStream") {
        void copyFile(File sourceFile, File targetFile) {
            long currentTime = System.currentTimeMillis();
            try {
                FileInputStream sourceFileIs = new FileInputStream(sourceFile);
                FileOutputStream targetFileOs = new FileOutputStream(targetFile);

                int i = 0;
                while(i != -1) {
                    i = sourceFileIs.read();
                    targetFileOs.write(i);
                }
                sourceFileIs.close();
                targetFileOs.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("FILE_STREAM 耗时: " + (System.currentTimeMillis() - currentTime)/1000.0);
        }
    },

    FILE_BUFFER_STREAM("fileBufferStream") {
        void copyFile(File sourceFile, File targetFile) {
            long currentTime = System.currentTimeMillis();
            try {
                FileInputStream is = new FileInputStream(sourceFile);
                FileOutputStream os = new FileOutputStream(targetFile);

                BufferedInputStream bis = new BufferedInputStream(is);
                BufferedOutputStream bos = new BufferedOutputStream(os);

                int i = 0;
                while(i != -1) {
                    i = bis.read();
                    bos.write(i);
                }
                bis.close();
                bos.close();
                is.close();
                os.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("FILE_BUFFER_STREAM 耗时: " + (System.currentTimeMillis() - currentTime)/1000.0);
        }
    },

    FIlE_STREAM_512("fileStream512") {
        void copyFile(File sourceFile, File targetFile) {
            long currentTime = System.currentTimeMillis();
            try {
                FileInputStream is = new FileInputStream(sourceFile);
                FileOutputStream os = new FileOutputStream(targetFile);
                final int bufferSize = 512;
                byte[] buffer = new byte[bufferSize];
                while (true) {
                    if(is.available() < bufferSize) {
                        int i = 0;
                        while(i != -1) {
                            i = is.read();
                            os.write(i);
                        }
                        break;
                    } else {
                        is.read(buffer);
                        os.write(buffer);
                    }
                }

                is.close();
                os.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("FIlE_STREAM_512 耗时: " + (System.currentTimeMillis() - currentTime)/1000.0);
        }
    },

    FILE_BUFFER_STREAM_512("fileBufferStream512") {
        void copyFile(File sourceFile, File targetFile) {
            long currentTime = System.currentTimeMillis();
            try {
                FileInputStream is = new FileInputStream(sourceFile);
                FileOutputStream os = new FileOutputStream(targetFile);

                BufferedInputStream bis = new BufferedInputStream(is);
                BufferedOutputStream bos = new BufferedOutputStream(os);

                final int bufferSize = 512;
                byte[] buffer = new byte[bufferSize];
                while (true) {
                    if(bis.available() < 512) {
                        int i = 0;
                        while (i != -1) {
                            i = bis.read();
                            bos.write(i);
                        }
                        break;
                    } else {
                        bis.read(buffer);
                        bos.write(buffer);
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("FILE_BUFFER_STREAM_512 耗时: " + (System.currentTimeMillis() - currentTime)/1000.0);
        }
    };
    ;
    private String value = "";

    FileCopyEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    abstract void copyFile(File sourcePath, File targetPath);
}
