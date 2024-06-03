package com.entertainment;

import java.util.Arrays;

public class Television {
    //statics
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    private static int instanceCount = 0;

    public static int getInstanceCount() {
        return instanceCount;
    }

    //properties or attirbutes called "instance variable" or "fields"
    private String brand = "LG";
    public static final String[] VALID_BRANDS = {"Samsung", "LG", "Sony", "Toshiba"};
    private int volume;
    private boolean isMuted;
    private int oldVolume;
    private DisplayType display = DisplayType.LED;

    //television HAS a Tuner
    private final Tuner tuner = new Tuner(); //instantiated internally, NOT exposed (so its private!)

    //constructors

    public Television() {
        instanceCount++;
    }

    public Television(String brand) {
        this();
        setBrand(brand);
    }

    public Television(String brand, int volume) {
        this(brand);
        setVolume(volume);
    }

    public Television(String brand, int volume, DisplayType display) {
        this(brand, volume);
        setDisplay(display);
    }

    //action methods
    public void changeChannel(String channel) {
        tuner.setChannel(channel); //delegate to tuner object for the actual work
    }

    public String getCurrentChannel() {
        return tuner.getChannel(); //delegate to Tuner object for the actual work
    }

    public void turnOn() {
        boolean isConnected = verifyInternetConnection();
        System.out.println("Turning on your " + brand + " TV.");
        System.out.println("Volume is " + volume);
    }

    public void turnOff() {
        System.out.println("Turning off " + brand + " TV. Goodbye!");

    }
    private static boolean isValidBrand(String brand) {
        boolean isValid=false;

        for (String tvBrand: VALID_BRANDS) {
            if (tvBrand.equals(brand)) {
                isValid = true;
                break;
            }
        }
        if (!isValid) {
            System.out.printf("Invalid brand: %s. Must be one of %s. \n", brand, Arrays.toString(VALID_BRANDS));
        }
        return isValid;
    }

    public void mute() {
        if (!isMuted) { //not currently muted
            oldVolume = volume;
            volume = MIN_VOLUME;
            isMuted = true;
        } else { //currently muted
            volume = oldVolume;
            isMuted = false;
        }
    }

    private boolean verifyInternetConnection() {
        return true;
    }

    //accessor methods
    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    public boolean isMuted() {
        return isMuted;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(isValidBrand(brand)) {
            this.brand = brand; // since brand is only set in if statement would it just be null if it doesn't pass validation??
        } else {
            this.brand = null;
            System.out.println("Invalid brand: " + brand + " value of valid brands is " + Arrays.toString(VALID_BRANDS));
//            System.out.println(this.brand);
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.volume = volume;
            isMuted =false; //clear the 'isMuted flag in case we were muted
        }
        else {
            System.out.printf("Invalid volume: %s. Must be beween %s and %s. \n",
                    volume, MIN_VOLUME, MAX_VOLUME);
            System.out.println("Invalid volume: " + volume + ". " +
                    "Va range is [" + MIN_VOLUME + ", " + MAX_VOLUME + "]");
        }
    }


    @Override
    public String toString() {
        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());

        return String.format("Television: brand=%s, volume=%s, display=%s, " +
                "currentChannel=%s", getBrand(), volumeString, getDisplay(), getCurrentChannel());
    }
}
