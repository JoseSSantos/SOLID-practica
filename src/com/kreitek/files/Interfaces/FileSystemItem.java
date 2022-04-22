package com.kreitek.files.Interfaces;

import com.kreitek.files.Directory;

public interface FileSystemItem {
    String getName();
    void setName(String name);
    FileSystemItem getParent();
    void setParent(Directory directory);
    String getFullPath();
    int getSize();
}
