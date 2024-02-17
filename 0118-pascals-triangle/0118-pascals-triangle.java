class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        //For If there are no elements that means empty list
        if(numRows == 0) return result;

        //for if there is only one element
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);
        if(numRows == 1) return result;

        //for of there are n number of rows
        for(int i=1; i<numRows; i++) {
            List<Integer> prevList = result.get(i-1);

            List<Integer> row = new ArrayList<>();
            row.add(1);

            for(int j=0; j < i-1; j++) {
                row.add(prevList.get(j) + prevList.get(j+1));
            }

            row.add(1);

            result.add(row);
        }

        return result;
    }
}
