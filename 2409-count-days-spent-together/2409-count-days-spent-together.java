class Solution {

    private static final int[] DAYS = {
        0, 0, 31, 28, 31, 30, 31,
        30, 31, 31, 30, 31, 30, 31
    };

    static {
        for (int i = 1; i <= 13; i++) {
            DAYS[i] += DAYS[i - 1];
        }
    }

    public int countDaysTogether(
            String arriveAlice,
            String leaveAlice,
            String arriveBob,
            String leaveBob) {

        String start = arriveAlice;
        if (arriveAlice.compareTo(arriveBob) < 0) {
            start = arriveBob;
        }

        String end = leaveAlice;
        if (leaveAlice.compareTo(leaveBob) > 0) {
            end = leaveBob;
        }

        if (start.compareTo(end) > 0) {
            return 0;
        }

        int[] startTime = getTime(start);
        int[] endTime = getTime(end);

        return DAYS[endTime[0]] - DAYS[startTime[0]]
                + endTime[1] - startTime[1] + 1;
    }

    private static int[] getTime(String time) {
        int month = 10 * (time.charAt(0) - '0')
                  + time.charAt(1) - '0';

        int date = 10 * (time.charAt(3) - '0')
                 + time.charAt(4) - '0';

        return new int[]{month, date};
    }
}