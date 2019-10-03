package com.manchesterdigital;

public class Samsung1000TechSpecs extends SamsungTechSpecs {

    final boolean hasFingerPrintScanner;

    public Samsung1000TechSpecs(int screensizeInInches, int storageInGigabytes, int ramInGigabytes, boolean hasFingerPrintScanner) {
        super(screensizeInInches, storageInGigabytes, ramInGigabytes);
        this.hasFingerPrintScanner = hasFingerPrintScanner;
    }

    @Override
    public String toString() {
        return "Samsung1000TechSpecs{" +
                "hasFingerPrintScanner=" + hasFingerPrintScanner +
                ", ScreensizeInInches=" + getScreensizeInInches() +
                ", StorageInGigabytes=" + getStorageInGigabytes() +
                ", RamInGigabytes=" + getRamInGigabytes() +
                ", CameraPixels=" + getCameraPixels() +
                '}';
    }
}
