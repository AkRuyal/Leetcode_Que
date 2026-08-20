class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m1 = nums2.length;
        int a[] = new int[n+m1];
        int c = 0;
        for(int i=0;i<n;i++){
            a[c] = nums1[i];
            c++;
        }
        for(int i=0;i<m1;i++){
            a[c] = nums2[i];
            c++;
        }
        Arrays.sort(a);
        int m = a.length/2;
        double res = 0;
        if(a.length%2!=0){
            res = a[m];
        }else{
            res = (a[m]+a[m-1])/2.0;
        }
        return res;
    }
}