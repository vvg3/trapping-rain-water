public class RainWater {

    public RainWater() {

    }


    public int getCapacity(Integer[] array) {

        int leftWallIndex = 0;
        int leftWallHeight = array[0];
        int waterInJeopardy = 0;
        int waterContained = 0;

        for (int i = 1; i < array.length; i++) {

            if (array[i] < leftWallHeight) {
                waterInJeopardy += (leftWallHeight - array[i]);
                if (array[i] > array[i - 1]) {
                    waterContained += (array[i] - array[i - 1]);
                    waterInJeopardy -= (array[i] - array[i - 1]);
                }
                if (i == (array.length - 1)) {
                    waterContained += (waterInJeopardy - ((leftWallHeight - array[i]) * ((i - leftWallIndex))));
                }

            } else if (array[i] >= leftWallHeight) {
                waterContained += waterInJeopardy;
                waterInJeopardy = 0;
                leftWallHeight = array[i];
                leftWallIndex = i;
            }
        }

        return waterContained;
    }
}
