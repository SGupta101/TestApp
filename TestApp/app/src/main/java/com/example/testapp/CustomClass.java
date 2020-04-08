package com.example.testapp;

public class CustomClass {
    private static int createCount, startCount, resumeCount, pauseCount, stopCount, destroyCount, restartCount = 0;

    public static int getStartCount() {
        return startCount;
    }

    public static void setStartCount(int startCount) {
        CustomClass.startCount = startCount;
    }

    public static int getCreateCount() {
        return createCount;
    }

    public static void setCreateCount(int createCount) {
        CustomClass.createCount = createCount;
    }

    public static int getResumeCount() {
        return resumeCount;
    }

    public static void setResumeCount(int resumeCount) {
        CustomClass.resumeCount = resumeCount;
    }

    public static int getPauseCount() {
        return pauseCount;
    }

    public static void setPauseCount(int pauseCount) {
        CustomClass.pauseCount = pauseCount;
    }

    public static int getStopCount() {
        return stopCount;
    }

    public static void setStopCount(int stopCount) {
        CustomClass.stopCount = stopCount;
    }

    public static int getDestroyCount() {
        return destroyCount;
    }

    public static void setDestroyCount(int destroyCount) {
        CustomClass.destroyCount = destroyCount;
    }

    public static int getRestartCount() {
        return restartCount;
    }

    public static void setRestartCount(int restartCount) {
        CustomClass.restartCount = restartCount;
    }
}
