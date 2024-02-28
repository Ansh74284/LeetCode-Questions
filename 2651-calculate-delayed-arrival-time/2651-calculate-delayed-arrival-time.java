class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int time = 24;
        int temptime = arrivalTime + delayedTime;
        if(temptime > time) {
            temptime = temptime % time;
            return temptime;
        }
        else if(time > temptime){
            return temptime;
        }
        return 0;
    }
}