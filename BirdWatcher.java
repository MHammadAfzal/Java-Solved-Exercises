class BirdWatcher {
    private final int[] birdsPerDay;
        int[] counts = {0, 2, 5, 3, 7, 8, 4};
        // int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }
    public int[] getLastWeek() {
        return counts;
    }
    public int getToday() {
        return birdsPerDay.length == 0 ? 0 : birdsPerDay[birdsPerDay.length -1];
    }
    
    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++; ;
    }
    public boolean hasDayWithoutBirds() {
        boolean ans = false;
        for(int i = 0; i < birdsPerDay.length; i++){
            if(birdsPerDay[i] == 0){
                ans = true;
            }
        }
        return ans;
    }
    public int getCountForFirstDays(int numberOfDays) {
            int count = 0;
        for(int i = 0; i < birdsPerDay.length; i++){
            if(i < numberOfDays){
                count += birdsPerDay[i];
            }
        }
        return count;
    }
    public int getBusyDays() {
            int count = 0;
        for(int i = 0; i < birdsPerDay.length; i++){
            if(birdsPerDay[i] >= 5){
                count++;
            }
        }
            return count;
        
    }
}
/* TASKS

1. Check what the counts were last week
For comparison purposes, you always keep a copy of last week's counts nearby, which were: 0, 2, 5, 3, 7, 8 and 4. Implement the BirdWatcher.getLastWeek() method that returns last week's counts:

BirdWatcher.getLastWeek();
// => [0, 2, 5, 3, 7, 8, 4]
2. Check how many birds visited today
Implement the BirdWatcher.getToday() method to return how many birds visited your garden today. The bird counts are ordered by day, with the first element being the count of the oldest day, and the last element being today's count.

int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
birdCount.getToday();
// => 1
3. Increment today's count
Implement the BirdWatcher.incrementTodaysCount() method to increment today's count:

int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
birdCount.incrementTodaysCount();
birdCount.getToday();
// => 2
4. Check if there was a day with no visiting birds
Implement the BirdWatcher.hasDayWithoutBirds() method that returns true if there was a day at which zero birds visited the garden; otherwise, return false:

int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
birdCount.hasDayWithoutBirds();
// => true
5. Calculate the number of visiting birds for the first number of days
Implement the BirdWatcher.getCountForFirstDays() method that returns the number of birds that have visited your garden from the start of the week, but limit the count to the specified number of days from the start of the week.

int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
birdCount.getCountForFirstDays(4);
// => 14
6. Calculate the number of busy days
Some days are busier that others. A busy day is one where five or more birds have visited your garden. Implement the BirdWatcher.getBusyDays() method to return the number of busy days:

int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
birdCount.getBusyDays();
// => 2

*/
