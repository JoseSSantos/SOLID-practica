
package com.kreitek.utils;

import com.kreitek.files.File;
import com.kreitek.files.Interfaces.FileSystemItem;
import com.kreitek.files.error.InvalidFileFormatException;

public class FileSystemConverter {

    public FileSystemItem convertMp3ToWav(File arg) {
        if (!"mp3".equalsIgnoreCase(arg.getExtension())) {
            throw new InvalidFileFormatException("El fichero debe ser mp3");
        }

        int indexOfLastDot = arg.getName().lastIndexOf(".");
        String nameWithoutExtension = arg.getName();
        if (indexOfLastDot > 0) {
            nameWithoutExtension = arg.getName().substring(0, indexOfLastDot);
        }
        String newFileName = nameWithoutExtension + ".wav";
        File result = new File(arg.getParent(), newFileName);
        result.open();
        // Lógica de conversión de mp3 a wav. Se lee de este fichero y se escribe en result
        result.close();
        return result;
    }

    public FileSystemItem convertWavToMp3(File arg) {
        if (!"wav".equalsIgnoreCase(arg.getExtension())) {
            throw new InvalidFileFormatException("El fichero debe ser wav");
        }

        int indexOfLastDot = arg.getName().lastIndexOf(".");
        String nameWithoutExtension = arg.getName();
        if (indexOfLastDot > 0) {
            nameWithoutExtension = arg.getName().substring(0, indexOfLastDot);
        }
        String newFileName = nameWithoutExtension + ".mp3";
        File result = new File(arg.getParent(), newFileName);
        result.open();
        // Lógica de conversión de wav a mp3. Se lee de este fichero y se escribe en result
        result.close();
        return result;
    }
}

