package com.kreitek.files.Interfaces;

import java.util.List;

public interface IDirectory extends FileSystemItem{
    List<FileSystemItem> listFiles();
    void addFile(FileSystemItem file);
    void removeFile(FileSystemItem file);

}
