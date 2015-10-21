/*
Median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value. So the median is the mean of the two middle value.

Examples: 
[2,3,4] , the median is 3

[2,3], the median is (2 + 3) / 2 = 2.5

Design a data structure that supports the following two operations:

void addNum(int num) - Add a integer number from the data stream to the data structure.
double findMedian() - Return the median of all elements so far.
For example:

add(1)
add(2)
findMedian() -> 1.5
add(3) 
findMedian() -> 2
*/
class MedianFinder {
    
    ArrayList<Integer> al;
    
    public MedianFinder()
    {
        al = new ArrayList<Integer>();
    }
    // Adds a number into the data structure. I have used arraylist as the underlying data structure.
    public void addNum(int num) {
        int low = 0;
        int high = al.size()-1;
        int mid=0;
        while(low<=high)
        {
            mid = low + (high-low)/2;
            if(num < al.get(mid))
            {
                high = mid-1;
                //mid = high;
            }
            else if(num > al.get(mid))
            {
                low = mid+1;
                mid = low;
            }
            else
                break;
        }
        
        al.add(mid, num);
    }

    // Returns the median of current data stream
    public double findMedian() {
        int mid = al.size()/2;
        
        if(al.size()%2==0)
        {
            return (double) (al.get(mid-1)+ al.get(mid))/2;
        }
        else
            return (double) (al.get(mid));
    }
};

// Your MedianFinder object will be instantiated and called as such:
// MedianFinder mf = new MedianFinder();
// mf.addNum(1);
// mf.findMedian();
