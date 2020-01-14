package com.javarush.task.task18.task1825;

import java.io.File;

public class FileFragment {

    private final String SPRTR = File.separator;
    private String originalLink;
    private String directory;
    private String resultFilePath;
    private String partId;

    public FileFragment(String input) {
        this.originalLink = input;
        this.directory = input.substring(0, input.lastIndexOf(SPRTR));
        this.resultFilePath = input.substring(0, input.lastIndexOf('.'));
        this.partId = input.substring(input.lastIndexOf(".part") + 5);
    }

    @Override
    public String toString() {
        return "FileFragment{" +
                "originalLink='" + originalLink + '\'' +
                ", directory='" + directory + '\'' +
                ", resultFilePath='" + resultFilePath + '\'' +
                ", partId=" + partId +
                '}';
    }

    public String getOriginalLink() {
        return originalLink;
    }

    public String getDirectory() {
        return directory;
    }

    public String getResultFilePath() {
        return resultFilePath;
    }

    public String getPartId() {
        return partId;
    }
}
