package com.example.design.composite.demo2;

public class FileTest {
    public static void main(String[] args) throws Exception{
        File root = new FileDir("根目录");
        File levelOne = new FileDir("目录1");
        File levelTwo = new FileDir("目录2");
        File levelThree = new FileDir("目录3");
        root.addFile(levelOne);
        root.addFile(levelTwo);
        root.addFile(levelThree);

        File levelOneOne = new FileDir("目录1-1");
        File levelOneTwo = new FileDir("目录1-2");
        File levelOneThree = new FileDir("目录1-3");
        levelOne.addFile(levelOneOne);
        levelOne.addFile(levelOneTwo);
        levelOne.addFile(levelOneThree);

        File levelFileOneOne = new FileItem("文件1-1");
        levelOne.addFile(levelFileOneOne);

        File levelFileTwoOne = new FileItem("文件2-1");
        File levelFileTwoTwo = new FileItem("文件2-2");
        File levelFileTwoThree = new FileItem("文件2-3");
        levelTwo.addFile(levelFileTwoOne);
        levelTwo.addFile(levelFileTwoTwo);
        levelTwo.addFile(levelFileTwoThree);


        File levelFileTreeOne = new FileItem("文件3-1");
        File levelFileTreeTwo = new FileItem("文件3-2");
        File levelFileTreeThree = new FileItem("文件3-3");
        levelThree.addFile(levelFileTreeOne);
        levelThree.addFile(levelFileTreeTwo);
        levelThree.addFile(levelFileTreeThree);
        root.listFile("");


    }
}
