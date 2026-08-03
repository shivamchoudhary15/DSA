class Solution {
    public double[] internalAngles(int[] arr) {
        Arrays.sort(arr);
        if(arr[0]+arr[1]<=arr[2] ||arr[1]+arr[2]<=arr[0] || arr[0]+arr[2]<=arr[1]){
            return new double[0];
        }
        int a=arr[0];
        int b=arr[1];
        int c=arr[2];
    double a1=Math.toDegrees( Math.acos((b*b+ c * c - a *a)/(2.0*b *c)));
    double b1=Math.toDegrees(Math.acos((a*a +c*c-b*b)/(2.0 * a * c)));
    double c1=Math.toDegrees( Math.acos((a * a + b * b - c * c) / (2.0* a*b)));
    double nums[]=new double[3];
    nums[0]=a1;
    nums[1]=b1;
    nums[2]=c1;
    Arrays.sort(nums);
    return nums;
    }
}