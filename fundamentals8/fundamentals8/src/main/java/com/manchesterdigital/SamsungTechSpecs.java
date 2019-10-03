package com.manchesterdigital;

public class SamsungTechSpecs {

    private final int ScreensizeInInches;
    private final int StorageInGigabytes;
    private final int RamInGigabytes;
    private int CameraPixels;

    public SamsungTechSpecs(int screensizeInInches, int storageInGigabytes, int ramInGigabytes) {
        ScreensizeInInches = screensizeInInches;
        StorageInGigabytes = storageInGigabytes;
        RamInGigabytes = ramInGigabytes;
    }

    public void setCameraPixels(int cameraPixels) {
        CameraPixels = cameraPixels;
    }

    // Getters
    public int getScreensizeInInches() {
        return ScreensizeInInches;
    }

    public int getStorageInGigabytes() {
        return StorageInGigabytes;
    }

    public int getRamInGigabytes() {
        return RamInGigabytes;
    }

    public int getCameraPixels() {
        return CameraPixels;
    }

    @Override
    public String toString() {
        return "SamsungTechSpecs{" +
                "ScreensizeInInches=" + ScreensizeInInches +
                ", StorageInGigabytes=" + StorageInGigabytes +
                ", RamInGigabytes=" + RamInGigabytes +
                ", CameraPixels=" + CameraPixels +
                '}';
    }
}
