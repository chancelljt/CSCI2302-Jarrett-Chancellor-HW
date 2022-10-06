package Chapter9;

public class Stopwatch {
    private long mStartTime;
    private long mEndTime;
    private long mElapsePause;
    private int mLastSecond = 0;

    private boolean mOn;
    private boolean mPaused;

    private int mSeconds;
    private int mMinutes;
    private int mHours;


    public Stopwatch(){
        mStartTime = System.currentTimeMillis();
    }
    public void start() {
        mOn = true;
        mStartTime = System.currentTimeMillis();
    }

    public void stop() {
        mEndTime = System.currentTimeMillis();
        mOn = false;
    }

    public long getStartTime() {
        return mStartTime;
    }

    public long getEndTime() {
        return mEndTime;
    }

    public long getElapsedTime() {
        return mEndTime - mStartTime;
    }

    public long peek(){
        return System.currentTimeMillis() - mStartTime;
    }

    public void pause(){
        mPaused = true;
        mElapsePause = System.currentTimeMillis() - mStartTime;
    }

    public void resume(){
        mPaused = false;
        mStartTime = System.currentTimeMillis() - mElapsePause;
    }

    public boolean isOn() {
        return mOn;
    }

    public long getElapsePause() {
        return mElapsePause;
    }

    public int getmLastSecond() {
        return mLastSecond;
    }

    public boolean isPaused() {
        return mPaused;
    }

    public int getSeconds() {
        updateTime();
        return mSeconds;
    }

    public int getMinutes() {
        updateTime();
        return mMinutes;
    }

    public int getHours() {
        updateTime();
        return mHours;
    }
    private void updateTime() {
        long currentTime = peek() / 1000;
        mSeconds = (int)(currentTime % 60);
        currentTime = currentTime / 60;

        mMinutes = (int) (currentTime % 60);
        currentTime = currentTime / 60;

        mHours = (int)(currentTime % 24);
    }

    public String toString(){
        updateTime();
        String hours = getTimeFormat(mHours);
        String minutes = getTimeFormat(mMinutes);
        String seconds = getTimeFormat(mSeconds);

        return hours + ":" + minutes + ":" + seconds;
    }
    private String getTimeFormat(int time) {
        return (time > 9) ? time + "" : "0" + time;
    }

}
