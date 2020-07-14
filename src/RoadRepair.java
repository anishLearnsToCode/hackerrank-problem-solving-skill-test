import java.util.List;

public class RoadRepair {
    static class Result {

        /*
         * Complete the 'getMinCost' function below.
         *
         * The function is expected to return a LONG_INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER_ARRAY crew_id
         *  2. INTEGER_ARRAY job_id
         */

        public static long getMinCost(List<Integer> positions, List<Integer> destinations) {
            positions.sort(Integer::compareTo);
            destinations.sort(Integer::compareTo);
            long result = 0;
            for (int index = 0 ; index < positions.size() ; index++) {
                result += Math.abs(destinations.get(index) - positions.get(index));
            }
            return result;
        }
    }
}
