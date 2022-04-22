package com.kreitek.files.Interfaces;

public interface IFile extends FileSystemItem{
    String getExtension();
    void open();
    void setPosition(int numberOfBytesFromBeginning);
    byte[] read(int numberOfBytesToRead);
    void write(byte[] buffer);
    void close();

}
