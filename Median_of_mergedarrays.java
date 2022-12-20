class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length + nums2.length;
        int[] out = new int[n];
        int i;
        for(i=0;i<nums1.length;i++)
        {
            out[i]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++)
        {
            out[i]=nums2[j];
            i++;
        }
        Arrays.sort(out);
        if(out.length%2!=0){
            return (double)out[n / 2];
        }
        else{
            return (double)(out[(n - 1) / 2] + out[n / 2]) / 2.0;
        }
    }
}
