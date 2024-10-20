class Solution {
    public int[] SFunc(int[] arr){
    int n = arr.length;
    int[] Smax = new int[n];
    Smax[n-1] = arr[n-1];
    for(int i = n-2; i>=0; i--)
    {
        Smax[i] = Math.max(Smax[i+1], arr[i]);
    }
    return Smax;
}
public int[] PFunc(int[] arr){
    int n = arr.length;
    int[] Pmax = new int[n];
    Pmax[0] = arr[0];
    for(int i = 1; i<n; i++)
    {
        Pmax[i] = Math.max(Pmax[i-1], arr[i]);
    }
    return Pmax;
}
    public int trap(int[] arr) {
        int n = arr.length;
        int[] Pmax = PFunc(arr);
        int[] Smax = SFunc(arr);
        int amt =0;
        for(int i =1; i<n-1; i++){
            int lb = Pmax[i-1];
            int rb = Smax[i+1];
            int yb = Math.min(lb, rb);
            int contri = yb - arr[i];
            if(contri > 0){
                amt = amt + contri;
            }
        }
        return amt;
        
    }
}