class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);

        // double max = salary.length-1;
        // double min = salary[0];

        int count =0;
        double total=0;
        for(int i =1; i<salary.length-1;i++){
            total += salary[i];
            count++;
        }

        return total/count;
    }
}